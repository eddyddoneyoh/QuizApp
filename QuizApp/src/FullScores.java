/**
 * Created by EdidiongEyo on 11/20/2016.
 */
/**
 * Created by EdidiongEyo on 11/6/2016.
 */

import MaterialDesign.MaterialColor;
import MaterialDesign.MaterialWindow;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Vector;




public class FullScores extends JPanel {


    MaterialWindow f = new MaterialWindow();


    //static String JDBC_DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
    //static String DATABASE_URL = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\DB\\db.mdb;";


    static String JDBC_DRIVER = "net.ucanaccess.jdbc.UcanaccessDriver";
    static String DATABASE_URL  = "jdbc:ucanaccess://DB/db.mdb";




    static JScrollPane scroll = new JScrollPane();

    static Vector<Vector<String>> data = new Vector<Vector<String>>();

    static Connection conn = null;
    static Statement stmt = null;

    static public JTable table = new JTable();



    JButton close =  new JButton("X");


    JLabel topBar =  new JLabel("Full Scores");

    JLabel downBar =  new JLabel();



    public FullScores() {


        new Move().move(f,topBar);




        HolderPage.f.setFocusable(false);
        HolderPage.f.setFocusableWindowState(false);

        f.requestFocus();




        close.setBounds(730, 2, 40, 30);
        close.setFont(new Font("Calibri", 1, 17));
        close.setHorizontalAlignment(SwingConstants.LEFT);
        close.setBackground(MaterialColor.RED_500);
        close.setForeground(Color.white);
        add(close);

        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                HolderPage.f.setFocusable(true);
                HolderPage.f.setFocusableWindowState(true);
                HolderPage.f.requestFocus();

                f.dispose();

            }
        });




        topBar.setBounds(0, 0, 800, 35);
        topBar.setOpaque(true);
        topBar.setBackground(MaterialColor.BLUE_700);
        topBar.setForeground(MaterialColor.DARK_WHITE);
        topBar.setFont(new Font("Calibri", 1, 17));
        topBar.setHorizontalAlignment(SwingConstants.CENTER);
        add(topBar);



        downBar.setBounds(0, 450, 800, 50);
        downBar.setOpaque(true);
        downBar.setBackground(MaterialColor.GREY_300);
        add(downBar);





        data.clear();
        resultset("SELECT id, participant, score, attempted, correct, failed FROM Participants");

        table.updateUI();



        scroll.setBorder(BorderFactory.createTitledBorder(""));
        add(scroll);




        setBackground(Color.white);
        setLayout(null);


        f.add(this);


        int locationX = HolderPage.f.getX()  + 100;
        int locationY =  HolderPage.f.getY()  +  50;



        f.setSize(800, 500);
        f.setLocation(locationX, locationY);
        f.setUndecorated(true);
       // f.setOpacity(0.98f);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setResizable(false);

    }








    public static void resultset(String query){


        Vector<String> columnNames = new Vector<String>();
        columnNames.add("ID");
        columnNames.add("PARTICIPANT");
        columnNames.add("SCORE");
       columnNames.add("ATTEMPTED");
       columnNames.add("CORRECT");
        columnNames.add("FAILED");



        try {

            Class.forName(JDBC_DRIVER);


            conn = DriverManager.getConnection(DATABASE_URL);
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);


            while(rs.next()){

                Vector<String> vstring = new Vector<String>();


                vstring.add(rs.getString("id"));
                vstring.add(rs.getString("participant"));
                vstring.add(rs.getString("score"));
               vstring.add(rs.getString("attempted"));
                vstring.add(rs.getString("correct"));
                vstring.add(rs.getString("failed"));


                vstring.add("\n");

                data.add(vstring);

            }
            stmt.close();
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException ex){ex.printStackTrace();}



        DefaultTableModel model = new DefaultTableModel(data ,columnNames);
        table = new JTable(model);

        table.setRowHeight(65);
        table.setEnabled(false);
        table.setDragEnabled(false);
        table.setColumnSelectionAllowed(false);
        table.setCellSelectionEnabled(false);
        table.setRowSelectionAllowed(false);
        table.setShowGrid(true);
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);
        table.setFont(new Font("Calibri",1,18));
        //table.setBackground(Color.white);
        table.setToolTipText("View Quick Scores here");

        table.removeMouseListener(null);



        scroll = new JScrollPane(table);
        scroll.setBounds(20,60,745,350);
        scroll.setBackground(Color.white);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.getVerticalScrollBar().setUI(new MyScrollBarUI());




    }





    public static void main(String[] args) {




        try
        {
            for(UIManager.LookAndFeelInfo info: UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch(Exception e){}



        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FullScores();
            }
        });



    }

}


