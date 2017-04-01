/**
 * Created by EdidiongEyo on 11/20/2016.
 */
/**
 * Created by EdidiongEyo on 11/6/2016.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.RandomAccessFile;
import java.sql.*;
import javax.swing.event.*;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.Dimension;
import java.util.Vector;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;




public class FullScores extends JPanel {


    JFrame f = new JFrame("");


    int x;
    int y;

    int heightdiv;
    int widthdiv;







    static String JDBC_DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
    static String DATABASE_URL = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\DB\\db.mdb;";

    static JScrollPane scroll = new JScrollPane();

    static Vector<Vector<String>> data = new Vector<Vector<String>>();

    static Connection conn = null;
    static Statement stmt = null;

    static public JTable table = new JTable();



    JButton close =  new JButton("Close");



    public FullScores() {


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = (Integer) y / 2;
        widthdiv = (Integer) x / 2;



        close.setBounds(370, 535, 150, 32);
        close.setFont(new Font("Calibri", 1, 17));
        close.setHorizontalAlignment(SwingConstants.CENTER);
        close.setBackground(new Color(0, 168, 89));
        close.setForeground(Color.white);
        add(close);

        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                f.dispose();

            }
        });




        data.clear();
        resultset("SELECT id, participant, score, attempted, correct, failed FROM Participants");

        table.updateUI();



        scroll.setBorder(BorderFactory.createTitledBorder("FULL SCORE SHEET"));
        add(scroll);




        setBackground(Color.white);
        setLayout(null);


        f.add(this);

        f.setSize(900, 600);
        f.setLocation(widthdiv - 450, heightdiv - 300);
        f.setUndecorated(true);
        f.setOpacity(0.98f);
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
        scroll.setBounds(20,30,850,500);
        scroll.setBackground(Color.white);




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


