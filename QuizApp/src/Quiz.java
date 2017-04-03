/**
 * Created by EdidiongEyo on 11/5/2016.
 */
/**
 * Created by EdidiongEyo on 11/5/2016.
 */
/**
 * Created by EdidiongEyo on 11/5/2016.
 */
/**
 * Created by EdidiongEyo on 11/5/2016.
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.Dimension;
import java.util.Objects;
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




public class Quiz extends JPanel implements ActionListener{


    public static JFrame f = new JFrame("");


    int x;
    int y;

    int heightdiv;
    int widthdiv;

    public static int start = 1;
    public static int count = 0;
    public static int max = 0;

    GridLayout layout = new GridLayout(7, 3, 5, 5);

    Process pro = new Process();

    public static JButton button;

    JLabel selectYourQuestion =  new JLabel("Select Your Question Number Below!");
    static JPanel quicScores =  new JPanel();
    JButton fullScores = new JButton("View Full Scores");
    JPanel panel = new JPanel();
    JPanel panel2 =  new JPanel();



    static String JDBC_DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
    static String DATABASE_URL = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\DB\\db.mdb;";

    static JScrollPane scroll = new JScrollPane();

    static Vector<Vector<String>> data = new Vector<Vector<String>>();

    static Connection conn = null;
    static Statement stmt = null;

    static public JTable table = new JTable();

    private JButton saveGame =  new JButton("Save Game");
    private JButton quitGame =  new JButton("Quit Game");


    JButton previous = new JButton("Previous");
    JButton next =  new JButton("Next");
    JLabel pageNo = new JLabel("1");
    int pageCount = Integer.parseInt(pageNo.getText());



    public Quiz() {


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = (Integer) y / 2;
        widthdiv = (Integer) x / 2;



        data.clear();
        resultset("SELECT id, participant, score FROM Participants");
        table.updateUI();







        String[] labels = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"};


        panel.setBackground(Color.white);

        JButton button;

        for (String label : labels) {
            button = new JButton(label);
            button.addActionListener(this);
            button.setBackground(new Color(0, 168, 89));
            button.setPreferredSize(new Dimension(100,100));
            button.setFont(new Font("Calibri", 1, 20));
            button.setActionCommand(label);
            button.setForeground(Color.white);
            panel.add(button);  //same as self.add(button)
        }


        panel.setLayout(layout);


        /////////////////////////// SECOND PANEL CODE STARTS HERE ////////////////////////////////////////


        String[] labels2 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21"};


        panel2.setBackground(Color.white);

        JButton button2;

        for (String label : labels2) {
            button2 = new JButton(label);
            button2.addActionListener(this);
            button2.setBackground(new Color(0, 168, 89));
            button2.setPreferredSize(new Dimension(100,100));
            button2.setFont(new Font("Calibri", 1, 20));
            button2.setActionCommand(label);
            button2.setForeground(Color.white);
            panel2.add(button2);  //same as self.add(button)
        }


        panel2.setLayout(layout);

        ///////////////////////// SECOND PANEL CODE ENDS HERE /////////////////////////////////



        quicScores.setBounds(530,80,450,200);
       quicScores.setLayout(null);
        quicScores.setBackground(Color.white);
        quicScores.setBorder(BorderFactory.createTitledBorder("Quick Scores"));
        add(quicScores);



        saveGame.setBounds(550, 400, 190, 50);
        saveGame.setFont(new Font("Calibri", 1, 17));
        saveGame.setHorizontalAlignment(SwingConstants.CENTER);
        saveGame.setBackground(new Color(0, 168, 89));
        saveGame.setForeground(Color.white);
        add(saveGame);

        saveGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });




        quitGame.setBounds(770, 400, 190, 50);
        quitGame.setFont(new Font("Calibri", 1, 17));
        quitGame.setHorizontalAlignment(SwingConstants.CENTER);
        quitGame.setBackground(new Color(250, 2, 2));
        quitGame.setForeground(Color.white);
        add(quitGame);

        quitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JOptionPane pane = new JOptionPane("Are you really sure you want to exit?", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION);
                JDialog dialog = pane.createDialog(null, "Exit");
                dialog.show();
                String selectedValue = pane.getValue().toString();
                System.out.print(selectedValue);
                if(selectedValue.equals("0")){

                    HolderPage.content.removeAll();

                    HolderPage.content.add(new Entry());

                    HolderPage.content.updateUI();

                    HolderPage.f.setTitle("QuizApp 2016 - New Quiz");


                }
                else{

                    dialog.show(false);
                }

            }
        });




        fullScores.setBounds(650, 300, 190, 40);
        fullScores.setFont(new Font("Calibri", 1, 17));
        fullScores.setHorizontalAlignment(SwingConstants.CENTER);
        fullScores.setBackground(new Color(0, 168, 89));
        fullScores.setForeground(Color.white);
        add(fullScores);

        fullScores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new FullScores();
                QuestionRadio.f.dispose();
            }
        });



        selectYourQuestion.setBounds(20, 30, 500, 30);
        selectYourQuestion.setFont(new Font("Calibri", 1, 20));
        selectYourQuestion.setBackground(new Color(0, 168, 89));
        selectYourQuestion.setHorizontalAlignment(SwingConstants.CENTER);
        selectYourQuestion.setOpaque(true);
        selectYourQuestion.setForeground(Color.white);
        add(selectYourQuestion);

        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setBounds(20,80,500,450);
        scrollPane.setAutoscrolls(true);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.getViewport().putClientProperty("EnableWindowBlit", Boolean.TRUE);
        scrollPane.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
        //f.getContentPane().add(scrollPane);
        add(scrollPane);





        //////PAGE NUMBERING CODE STARTS//////////////



        pageNo.setBounds(130,540,50,30);
        pageNo.setOpaque(true);
        pageNo.setHorizontalAlignment(SwingConstants.CENTER);
        add(pageNo);


        previous.setBounds(20,540,100,30);
        previous.setEnabled(false);
        add(previous);
        previous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                pageCount = pageCount - 1;


                if(pageCount < 2){

                    previous.setEnabled(false);

                }

                if(pageCount > 1){

                    next.setEnabled(true);
                }



                pageNo.setText(pageCount + "");

            }
        });





        next.setBounds(190,540,100,30);
        add(next);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                pageCount = pageCount + 1;
                pageNo.setText(pageCount + "");

                if(pageCount > 4){

                    next.setEnabled(false);
                }

                if(pageCount > 1){

                    previous.setEnabled(true);

                }



            }
        });










        setBackground(new Color(255, 220, 0));
        setLayout(null);


      // f.add(this);


//        f.setSize(1000, 600);
//       f.setLocation(widthdiv - 500, heightdiv - 300);
//        //f.setUndecorated(true);
//       f.setVisible(true);
//        f.setDefaultCloseOperation(3);
//       f.setResizable(false);

    }



    public void actionPerformed(ActionEvent e) {

        button = (JButton) e.getSource();
       // System.out.println(button.getBackground());

        if(button.getBackground().toString().equals("java.awt.Color[r=0,g=168,b=89]") ){

           // System.out.println(button.getText());
            button.setBackground(Color.red);
            button.setForeground(Color.white);
            button.setFont(new Font("Calibri", 1, 16));



            String participantsCount = "";
            String participantMax = "";
            String quizCount = "";

            RandomAccessFile conf;


            try{

                conf = new RandomAccessFile("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\DB\\participants", "r");
                //conf.seek(0);
                participantsCount = conf.readLine();
                participantMax = conf.readLine();
                quizCount = conf.readLine();

                start = Integer.parseInt(quizCount);
                max = Integer.parseInt(participantMax);



            }
            catch (Exception exception)
            {
                System.out.println("config-file read error: " + exception.toString());
            }



            counterMethod();


            if(start < max){

                Process.entry(button.getActionCommand().toString());
                QuestionRadio.questionNumner.setText("Question  "  +  button.getActionCommand().toString());


                start = start + 1;

                String stringCount  = start + "";


                try{

                    conf = new RandomAccessFile("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\DB\\participants", "rw");
                    //conf.seek(0);
                    conf.writeBytes(participantsCount + "\n");
                    conf.writeBytes(participantMax + "\n");
                    conf.writeBytes(stringCount + "");
                    conf.close();


                }
                catch (Exception exception)
                {
                    System.out.println("config-file read error: " + exception.toString());
                }


                //QuestionRadio.count = start;

                if(start == max){

                    start = 1;

                    try{

                        conf = new RandomAccessFile("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\DB\\participants", "rw");
                        //conf.seek(0);
                        conf.writeBytes(participantsCount + "\n");
                        conf.writeBytes(participantMax + "\n");
                        conf.writeBytes(start + "");
                        conf.close();


                    }
                    catch (Exception exception)
                    {
                        System.out.println("config-file read error: " + exception.toString());
                    }



                    //QuestionRadio.count = start;
                }





            }


        }

        else if(button.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]") ){

            JOptionPane.showMessageDialog(null, "Please Choose Another Question", "QUESTION TAKEN", JOptionPane.PLAIN_MESSAGE);

        }





    }










    public static void resultset(String query){


        Vector<String> columnNames = new Vector<String>();
        columnNames.add("ID");
        columnNames.add("PARTICIPANT");
        columnNames.add("SCORE");




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

        table.setRowHeight(40);
        table.setEnabled(false);
        table.setDragEnabled(false);
        table.setColumnSelectionAllowed(false);
        table.setCellSelectionEnabled(false);
        table.setRowSelectionAllowed(false);
        table.setShowGrid(true);
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);
        table.setFont(new Font("Calibri",1,16));
        //table.setBackground(Color.white);
        table.setToolTipText("View Quick Scores here");
       // System.out.print(table.getDropMode());
        table.removeMouseListener(null);

        scroll = new JScrollPane(table);
        scroll.setBounds(10,25,430,160);
        scroll.setBackground(Color.white);
        quicScores.add(scroll);




    }





    public void counterMethod()
    {



        String counterNow = "";

        RandomAccessFile conf;


        try{

            conf = new RandomAccessFile("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\DB\\counter", "r");
            //conf.seek(0);
            counterNow = conf.readLine();


        }
        catch (Exception exception)
        {
            System.out.println("config-file read error: " + exception.toString());
        }




        if(counterNow.equals("10secs") ){

            QuestionRadio.counter = 10;

        }

        if(counterNow.equals("15secs") ){

            QuestionRadio.counter = 15;

        }


        if(counterNow.equals("30secs") ){

            QuestionRadio.counter = 30;

        }

        if(counterNow.equals("45secs") ){

            QuestionRadio.counter = 45;

        }


        if(counterNow.equals("60secs") ){

            QuestionRadio.counter = 60;

        }

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
                new Quiz();
            }
        });



    }

}

