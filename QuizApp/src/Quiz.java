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
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.RandomAccessFile;
import java.sql.*;
import java.util.Vector;




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


    JPanel mainScrollPanel =  new JPanel();
    public static JButton button;

    JLabel selectYourQuestion =  new JLabel("Select Your Question Number Below!");
    static JPanel quicScores =  new JPanel();
    JButton fullScores = new JButton("View Full Scores");
    JPanel panel = new JPanel();
    JPanel panel2 =  new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 =  new JPanel();
    JPanel panel5 = new JPanel();




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
    JLabel pageNoView = new JLabel("1 - 20");
    int pageCount = Integer.parseInt(pageNo.getText());



    public Quiz() {


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = y / 2;
        widthdiv = x / 2;



        data.clear();
        resultset("SELECT id, participant, score FROM Participants");
        table.updateUI();






        String[] labels = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};


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
            //button.addActionListener(this);
            panel.add(button);  //same as self.add(button)
        }


        panel.setLayout(layout);




//        /////////////////////////// SECOND PANEL CODE STARTS HERE ////////////////////////////////////////
//
//
        String[] labels2 = {"21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
                "31", "32", "33", "34", "35", "36", "37", "38", "39", "40"};


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

       // panel2.setBounds(505,0,500,450);
//
//
//        ///////////////////////// THIRD PANEL CODE ENDS HERE /////////////////////////////////



        String[] labels3 = {"41", "42", "43", "44", "45", "46", "47", "48", "49", "50",
                "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"};


        panel3.setBackground(Color.white);

        JButton button3;

        for (String label : labels3) {
            button3 = new JButton(label);
            button3.addActionListener(this);
            button3.setBackground(new Color(0, 168, 89));
            button3.setPreferredSize(new Dimension(100,100));
            button3.setFont(new Font("Calibri", 1, 20));
            button3.setActionCommand(label);
            button3.setForeground(Color.white);
            panel3.add(button3);  //same as self.add(button)
        }


        panel3.setLayout(layout);


//
//
//        ///////////////////////// THIRD PANEL CODE ENDS HERE /////////////////////////////////




        //        ///////////////////////// FOURTH PANEL CODE ENDS HERE /////////////////////////////////



        String[] labels4 = {"61", "62", "63", "64", "65", "66", "67", "68", "69", "70",
                "71", "72", "73", "74", "75", "76", "77", "78", "79", "80"};


        panel4.setBackground(Color.white);

        JButton button4;

        for (String label : labels4) {
            button4 = new JButton(label);
            button4.addActionListener(this);
            button4.setBackground(new Color(0, 168, 89));
            button4.setPreferredSize(new Dimension(100,100));
            button4.setFont(new Font("Calibri", 1, 20));
            button4.setActionCommand(label);
            button4.setForeground(Color.white);
            panel4.add(button4);  //same as self.add(button)
        }


        panel4.setLayout(layout);


//
//
//        ///////////////////////// FOURTH PANEL CODE ENDS HERE /////////////////////////////////




        //        ///////////////////////// FIFTH PANEL CODE ENDS HERE /////////////////////////////////



        String[] labels5 = {"81", "82", "83", "84", "85", "86", "87", "88", "89", "90",
                "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"};


        panel5.setBackground(Color.white);

        JButton button5;

        for (String label : labels5) {
            button5 = new JButton(label);
            button5.addActionListener(this);
            button5.setBackground(new Color(0, 168, 89));
            button5.setPreferredSize(new Dimension(100,100));
            button5.setFont(new Font("Calibri", 1, 20));
            button5.setActionCommand(label);
            button5.setForeground(Color.white);
            panel5.add(button5);  //same as self.add(button)
        }


        panel5.setLayout(layout);


//
//
//        ///////////////////////// FIFTH PANEL CODE ENDS HERE /////////////////////////////////



        quicScores.setBounds(530,80,450,200);
       quicScores.setLayout(null);
        quicScores.setBackground(Color.white);
        //quicScores.setBorder(BorderFactory.createTitledBorder("Quick Scores"));
        quicScores.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(200, 200, 200),4,true),"Quick Scores", 2,2,new Font("Calibri",1,20),Color.black));

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





        final JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setBounds(20,75,500,430);
        scrollPane.setAutoscrolls(true);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.getViewport().putClientProperty("EnableWindowBlit", Boolean.TRUE);
        scrollPane.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
        scrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(200, 200, 200),4,true),"", 2,2,new Font("Calibri",1,20),Color.black));

        add(scrollPane);





        final JScrollPane scrollPane2 = new JScrollPane(panel2);
        scrollPane2.setBounds(20,75,500,430);
        scrollPane2.setAutoscrolls(true);
        scrollPane2.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane2.getViewport().putClientProperty("EnableWindowBlit", Boolean.TRUE);
        scrollPane2.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
        scrollPane2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(200, 200, 200),4,true),"", 2,2,new Font("Calibri",1,20),Color.black));

        add(scrollPane2);
        scrollPane2.setVisible(false);


        final JScrollPane scrollPane3 = new JScrollPane(panel3);
        scrollPane3.setBounds(20,75,500,430);
        scrollPane3.setAutoscrolls(true);
        scrollPane3.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane3.getViewport().putClientProperty("EnableWindowBlit", Boolean.TRUE);
        scrollPane3.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
        add(scrollPane3);
        scrollPane3.setVisible(false);

        final JScrollPane scrollPane4 = new JScrollPane(panel4);
        scrollPane4.setBounds(20,75,500,430);
        scrollPane4.setAutoscrolls(true);
        scrollPane4.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane4.getViewport().putClientProperty("EnableWindowBlit", Boolean.TRUE);
        scrollPane4.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
        add(scrollPane4);
        scrollPane4.setVisible(false);


        final JScrollPane scrollPane5 = new JScrollPane(panel5);
        scrollPane5.setBounds(20,75,500,430);
        scrollPane5.setAutoscrolls(true);
        scrollPane5.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane5.getViewport().putClientProperty("EnableWindowBlit", Boolean.TRUE);
        scrollPane5.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
        add(scrollPane5);
        scrollPane5.setVisible(false);




        //////PAGE NUMBERING CODE STARTS//////////////



        pageNo.setBounds(130,540,50,30);
        pageNo.setOpaque(true);
        pageNo.setHorizontalAlignment(SwingConstants.CENTER);
        //add(pageNo);


        pageNoView.setBounds(190,535,100,30);
        pageNoView.setOpaque(true);
        pageNoView.setHorizontalAlignment(SwingConstants.CENTER);
        pageNoView.setForeground(Color.white);
        pageNoView.setFont(new Font("Calibri", 1, 21));
        pageNoView.setBackground(Color.darkGray);
        add(pageNoView);


        previous.setBounds(20,530,100,30);
        previous.setEnabled(false);
        previous.setFont(new Font("Calibri",1,15));
        previous.setBackground(new Color(6, 125, 248));
        previous.setForeground(Color.white);
        add(previous);
        previous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                pageCount = pageCount - 1;

                if(pageCount == 1){

                    scrollPane.setVisible(true);
                    scrollPane2.setVisible(false);
                    scrollPane3.setVisible(false);
                    scrollPane4.setVisible(false);
                    scrollPane5.setVisible(false);

                    pageNoView.setText("1 - 20");

                }

                if(pageCount == 2){

                    scrollPane.setVisible(false);
                    scrollPane2.setVisible(true);
                    scrollPane3.setVisible(false);
                    scrollPane4.setVisible(false);
                    scrollPane5.setVisible(false);

                    pageNoView.setText("21 - 40");
                }



                if(pageCount == 3){

                    scrollPane.setVisible(false);
                    scrollPane2.setVisible(false);
                    scrollPane3.setVisible(true);
                    scrollPane4.setVisible(false);
                    scrollPane5.setVisible(false);

                    pageNoView.setText("41 - 60");
                }


                if(pageCount == 4){

                    scrollPane.setVisible(false);
                    scrollPane2.setVisible(false);
                    scrollPane3.setVisible(false);
                    scrollPane4.setVisible(true);
                    scrollPane5.setVisible(false);

                    pageNoView.setText("61 - 80");
                }


                if(pageCount == 5){

                    scrollPane.setVisible(false);
                    scrollPane2.setVisible(false);
                    scrollPane3.setVisible(false);
                    scrollPane4.setVisible(false);
                    scrollPane5.setVisible(true);
                    pageNoView.setText("81 - 100");
                }









                if(pageCount < 2){

                    previous.setEnabled(false);

                }

                if(pageCount > 1){

                    next.setEnabled(true);
                }



                pageNo.setText(pageCount + "");

            }
        });





        next.setBounds(400,535,100,30);
        next.setFont(new Font("Calibri",1,15));
        next.setBackground(new Color(6, 125, 248));
        next.setForeground(Color.white);
        add(next);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                pageCount = pageCount + 1;
                pageNo.setText(pageCount + "");

                if(pageCount == 1){

                    scrollPane.setVisible(true);
                    scrollPane2.setVisible(false);
                    scrollPane3.setVisible(false);
                    scrollPane4.setVisible(false);
                    scrollPane5.setVisible(false);


                    pageNoView.setText("1 - 20");
                }

                if(pageCount == 2){

                    scrollPane.setVisible(false);
                    scrollPane2.setVisible(true);
                    scrollPane3.setVisible(false);
                    scrollPane4.setVisible(false);
                    scrollPane5.setVisible(false);

                    pageNoView.setText("21 - 40");
                }



                if(pageCount == 3){

                    scrollPane.setVisible(false);
                    scrollPane2.setVisible(false);
                    scrollPane3.setVisible(true);
                    scrollPane4.setVisible(false);
                    scrollPane5.setVisible(false);


                    pageNoView.setText("41 - 60");
                }


                if(pageCount == 4){

                    scrollPane.setVisible(false);
                    scrollPane2.setVisible(false);
                    scrollPane3.setVisible(false);
                    scrollPane4.setVisible(true);
                    scrollPane5.setVisible(false);

                    pageNoView.setText("61 - 80");
                }


                if(pageCount == 5){

                    scrollPane.setVisible(false);
                    scrollPane2.setVisible(false);
                    scrollPane3.setVisible(false);
                    scrollPane4.setVisible(false);
                    scrollPane5.setVisible(true);


                    pageNoView.setText("81 - 100");
                }



                if(pageCount > 4){

                    next.setEnabled(false);
                }

                if(pageCount > 1){

                    previous.setEnabled(true);

                }



            }
        });










       // setBackground(new Color(255, 220, 0));
        setBackground(Color.white);
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

      JButton  button = (JButton) e.getSource();
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

