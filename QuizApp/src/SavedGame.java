/**
 * Created by EdidiongEyo on 1/12/2017.
 */
/**
 * Created by EdidiongEyo on 1/12/2017.
 */
/**
 * Created by EdidiongEyo on 11/20/2016.
 */
/**
 * Created by EdidiongEyo on 11/20/2016.
 */
/**
 * Created by EdidiongEyo on 11/6/2016.
 */

import MaterialDesign.MaterialButton;
import MaterialDesign.MaterialColor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Vector;


public class SavedGame extends JPanel {



    JLabel downbar =  new JLabel();

    JLabel time = new JLabel("Time saved:");
    JLabel quizName  =  new JLabel("Quiz Name:");

    MaterialButton resume = new MaterialButton();
    MaterialButton quit =  new MaterialButton();







    static String JDBC_DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
    static String DATABASE_URL = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\DB\\db.mdb;";

    static JScrollPane scroll = new JScrollPane();

    static Vector<Vector<String>> data = new Vector<Vector<String>>();

    static Connection conn = null;
    static Statement stmt = null;

    static public JTable table = new JTable();








    public SavedGame() {


        setBounds(0,0,980,515);



        HolderPage.breadCrumb.setText("Home > Resume Quiz");
        HolderPage.home.setVisible(true);


        quizName.setBounds(120,20,100,30);
        quizName.setFont(new Font("Calibri",1 , 16));
        add(quizName);

        time.setBounds(450,20,100,30);
        time.setFont(new Font("Calibri",1 , 16));
        add(time);







        data.clear();
        resultset("SELECT id, participant, score, attempted, correct, failed FROM Participants");

        table.updateUI();



        scroll.setBorder(BorderFactory.createTitledBorder(""));
        add(scroll);








        resume.setBounds(300,380,130,50);
        resume.setText("Resume");
        resume.setBackground(MaterialColor.BLUE_500);
        resume.setForeground(MaterialColor.WHITE);
        resume.setFont(new Font("Calibri",1,15));
        add(resume);


        quit.setBounds(500,380,130,50);
        quit.setText("Cancel");
        quit.setBackground(MaterialColor.BLUE_500);
        quit.setForeground(MaterialColor.WHITE);
        quit.setFont(new Font("Calibri",1,15));
        add(quit);

        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                HolderPage.content.removeAll();

                HolderPage.content.add(new Entry());

                HolderPage.content.updateUI();

            }
        });



        downbar.setBounds(0,453,1000,50);
        downbar.setBackground(new Color(233, 233, 233));
        downbar.setOpaque(true);
        add(downbar);




        setBackground(Color.white);
        setLayout(null);



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

        table.setRowHeight(50);
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
        scroll.setBounds(120,80,745,295);
        scroll.setBackground(Color.white);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.getVerticalScrollBar().setUI(new MyScrollBarUI());




    }














    public static void main(String[] args) {



        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SavedGame();
            }
        });



    }

}


