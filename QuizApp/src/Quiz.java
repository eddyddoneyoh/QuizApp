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
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.RandomAccessFile;
import java.sql.*;
import java.util.Vector;
import MaterialDesign.*;


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


    static JPanel quicScores =  new JPanel();
    MaterialButton fullScores = new MaterialButton();
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


    MaterialButton previous = new MaterialButton();
    MaterialButton next =  new MaterialButton();
    JLabel pageNo = new JLabel("1");
    JLabel pageNoView = new JLabel("1 - 20");
    int pageCount = Integer.parseInt(pageNo.getText());


    JLabel downbar =  new JLabel();



    //JFormattedTextField addField = new JFormattedTextField("");
    MaterialFormattedTextField addField =  new MaterialFormattedTextField();


    static String actionCommandText = "";

   // String quizdb = "";




    String quizdb = "";

    RandomAccessFile configMain;

    Boolean gd;




    public Quiz() {


        setBounds(0,0,980,515);


        HolderPage.breadCrumb.setText("Home > New Quiz > Quiz Start");



        data.clear();
        resultset("SELECT id, participant, score FROM Participants");
        table.updateUI();






        String[] labels = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};


        panel.setBackground(Color.white);

        JButton button;

        for (String label : labels) {
            button = new JButton();
            button.setText(label);
            button.addActionListener(this);
          //  button.setBackground(new Color(0, 168, 89));
            button.setBackground(MaterialColor.GREEN_700);
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
            button2.setBackground(MaterialColor.GREEN_700);
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
            button3.setBackground(MaterialColor.GREEN_700);
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
            button4.setBackground(MaterialColor.GREEN_700);
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
            button5.setBackground(MaterialColor.GREEN_700);
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



        quicScores.setBounds(530,35,400,250);
       quicScores.setLayout(null);
        quicScores.setBackground(Color.white);
        //quicScores.setBorder(BorderFactory.createTitledBorder("Quick Scores"));
        quicScores.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(200, 200, 200),3,true),"Quick Scores", 2,2,new Font("Calibri",1,20),Color.black));

        add(quicScores);


        MaterialButton saveGame = new MaterialButton();
        saveGame.setBounds(550, 335, 150, 50);
        saveGame.setFont(new Font("Calibri", 1, 17));
        saveGame.setHorizontalAlignment(SwingConstants.CENTER);
        saveGame.setBackground(MaterialColor.GREEN_500);
        saveGame.setForeground(Color.white);
        saveGame.setText("Save Quiz");
        add(saveGame);

        saveGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new NewDB();

            }
        });


        MaterialButton quitGame = new MaterialButton();
        quitGame.setBounds(770, 335, 150, 50);
        quitGame.setFont(new Font("Calibri", 1, 17));
        quitGame.setHorizontalAlignment(SwingConstants.CENTER);
        quitGame.setBackground(MaterialColor.RED_500);
        quitGame.setForeground(Color.white);
        quitGame.setText("Quit Quiz");
        add(quitGame);

        quitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {




                JOptionPane pane = new JOptionPane("Are you really sure you want to exit?", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION);
                JDialog dialog2 = pane.createDialog(HolderPage.f, "Exit");
                dialog2.setVisible(true);

                String selectedValue = "";

                try {

                    selectedValue = pane.getValue().toString();
                }
                catch (java.lang.NullPointerException f){selectedValue = "2";}




                if (selectedValue.equals("0")) {


                    HolderPage.content.removeAll();

                    HolderPage.content.add(new Entry());
                    HolderPage.content.updateUI();


                } else if (selectedValue.equals("1")){


                    dialog2.setVisible(false);
                } else if (selectedValue.equals("2")){


                    dialog2.setVisible(false);
                }



            }
        });




        fullScores.setBounds(85, 190, 250, 50);
        fullScores.setFont(new Font("Calibri", 1, 17));
        fullScores.setHorizontalAlignment(SwingConstants.CENTER);
        fullScores.setBackground(MaterialColor.BLUE_700);
        fullScores.setForeground(Color.white);
        fullScores.setText("View Full Scores");
        quicScores.add(fullScores);

        fullScores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new FullScores();
                //QuestionRadio.f.dispose();
            }
        });






        final JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setBounds(30,35,450,370);
        scrollPane.setAutoscrolls(true);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.getViewport().putClientProperty("EnableWindowBlit", Boolean.TRUE);
        scrollPane.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
        scrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(200, 200, 200),3,true),"Select Your Question Below!", 2,2,new Font("Calibri",1,20),Color.black));
        scrollPane.getVerticalScrollBar().setUI(new MyScrollBarUI());
        add(scrollPane);





        final JScrollPane scrollPane2 = new JScrollPane(panel2);
        scrollPane2.setBounds(30,35,450,370);
        scrollPane2.setAutoscrolls(true);
        scrollPane2.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane2.getViewport().putClientProperty("EnableWindowBlit", Boolean.TRUE);
        scrollPane2.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
        scrollPane2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(200, 200, 200),3,true),"Select Your Question Below!", 2,2,new Font("Calibri",1,20),Color.black));
        scrollPane2.getVerticalScrollBar().setUI(new MyScrollBarUI());

        add(scrollPane2);
        scrollPane2.setVisible(false);


        final JScrollPane scrollPane3 = new JScrollPane(panel3);
        scrollPane3.setBounds(30,35,450,370);
        scrollPane3.setAutoscrolls(true);
        scrollPane3.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane3.getViewport().putClientProperty("EnableWindowBlit", Boolean.TRUE);
        scrollPane3.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
        scrollPane3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(200, 200, 200),3,true),"Select Your Question Below!", 2,2,new Font("Calibri",1,20),Color.black));
        scrollPane3.getVerticalScrollBar().setUI(new MyScrollBarUI());

        add(scrollPane3);
        scrollPane3.setVisible(false);

        final JScrollPane scrollPane4 = new JScrollPane(panel4);
        scrollPane4.setBounds(30,35,450,370);
        scrollPane4.setAutoscrolls(true);
        scrollPane4.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane4.getViewport().putClientProperty("EnableWindowBlit", Boolean.TRUE);
        scrollPane4.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
        scrollPane4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(200, 200, 200),3,true),"Select Your Question Below!", 2,2,new Font("Calibri",1,20),Color.black));
        scrollPane4.getVerticalScrollBar().setUI(new MyScrollBarUI());

        add(scrollPane4);
        scrollPane4.setVisible(false);


        final JScrollPane scrollPane5 = new JScrollPane(panel5);
        scrollPane5.setBounds(30,35,450,370);
        scrollPane5.setAutoscrolls(true);
        scrollPane5.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane5.getViewport().putClientProperty("EnableWindowBlit", Boolean.TRUE);
        scrollPane5.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
        scrollPane5.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(200, 200, 200),3,true),"Select Your Question Below!", 2,2,new Font("Calibri",1,20),Color.black));
        scrollPane5.getVerticalScrollBar().setUI(new MyScrollBarUI());

        add(scrollPane5);
        scrollPane5.setVisible(false);




        //////PAGE NUMBERING CODE STARTS//////////////



        pageNo.setBounds(130,480,50,30);
        pageNo.setOpaque(true);
        pageNo.setHorizontalAlignment(SwingConstants.CENTER);
        //add(pageNo);


        pageNoView.setBounds(190,420,100,25);
        pageNoView.setOpaque(true);
        pageNoView.setHorizontalAlignment(SwingConstants.CENTER);
        pageNoView.setForeground(Color.white);
        pageNoView.setFont(new Font("Calibri", 1, 20));
        pageNoView.setBackground(MaterialColor.LIGHT_BLACK);
        add(pageNoView);


        previous.setBounds(50,410,100,45);
        previous.setEnabled(false);
        previous.setFont(new Font("Calibri",1,15));
        previous.setBackground(MaterialColor.BLUE_700);
        previous.setForeground(Color.white);
        previous.setText("Previous");
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





        next.setBounds(330,410,100,45);
        next.setFont(new Font("Calibri",1,15));
        next.setBackground(new Color(6, 125, 248));
        next.setForeground(Color.white);
        next.setText("Next");
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







        downbar.setBounds(0,465,1000,40);
        downbar.setBackground(new Color(233, 233, 233));
        downbar.setOpaque(true);
        add(downbar);


        scroll.getVerticalScrollBar().setUI(new MyScrollBarUI());








        try{

            configMain = new RandomAccessFile("DB\\QuizDB", "r");
            quizdb = configMain.readLine();
            configMain.close();


        }
        catch (Exception exception)
        {
            System.out.println("config-file read error: " + exception.toString());
        }



        gd = quizdb.equals("SpellingBee");



        setBackground(Color.white);
        setLayout(null);



    }












    public void actionPerformed(ActionEvent e) {

      JButton  button = (JButton) e.getSource();



        if(button.getBackground().toString().equals("java.awt.Color[r=56,g=142,b=60]") ){

            button.setBackground(Color.red);
            button.setForeground(Color.white);
            button.setFont(new Font("Calibri", 1, 20));



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

                conf.close();



            }
            catch (Exception exception)
            {
                System.out.println("config-file read error: " + exception.toString());
            }



            counterMethod();





                if(start < max) {



                    actionCommandText = button.getActionCommand();

                    if(gd){


                        SpellingBeeProcess.entry(button.getActionCommand());
                        QuestionSpellingBee.questionNumner.setText("Question  " + button.getActionCommand().toString());


                    }
                    else{


                        Process.entry(button.getActionCommand());
                        QuestionRadio.questionNumner.setText("Question  " + button.getActionCommand().toString());



                    }



                    start = start + 1;

                    String stringCount = start + "";


                    try {

                        conf = new RandomAccessFile("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\DB\\participants", "rw");
                        //conf.seek(0);
                        conf.writeBytes(participantsCount + "\n");
                        conf.writeBytes(participantMax + "\n");
                        conf.writeBytes(stringCount + "");
                        conf.close();


                    } catch (Exception exception) {
                        System.out.println("config-file read error: " + exception.toString());
                    }


                    //QuestionRadio.count = start;

                    if (start == max) {

                        start = 1;

                        try {

                            conf = new RandomAccessFile("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\DB\\participants", "rw");
                            //conf.seek(0);
                            conf.writeBytes(participantsCount + "\n");
                            conf.writeBytes(participantMax + "\n");
                            conf.writeBytes(start + "");
                            conf.close();


                        } catch (Exception exception) {
                            System.out.println("config-file read error: " + exception.toString());
                        }


                    }


                }








            }

        else if(button.getBackground().toString().equals("java.awt.Color[r=255,g=0,b=0]") ){

            JOptionPane.showMessageDialog(HolderPage.f, "Please Choose Another Question", "QUESTION TAKEN", JOptionPane.PLAIN_MESSAGE);

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
        table.removeMouseListener(null);

        scroll = new JScrollPane(table);
        scroll.setBounds(10,25,380,160);
        scroll.setBackground(Color.white);
        //scroll.getVerticalScrollBar().setUI(new MyScrollBarUI());
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




        if(counterNow.equals("30secs") ){

            QuestionRadio.counter = 30;
            QuestionSpellingBee.counter = 30;

        }

        if(counterNow.equals("45secs") ){

            QuestionRadio.counter = 45;
            QuestionSpellingBee.counter = 45;

        }


        if(counterNow.equals("60secs") ){

            QuestionRadio.counter = 60;
            QuestionSpellingBee.counter = 60;

        }

    }



















    public class NewDB {

        JDialog dlog = new JDialog();

        MaterialButton addButton = new MaterialButton();
        MaterialButton cancel = new MaterialButton();
        MaskFormatter fv;

        JLabel tobBar =  new JLabel();


        public NewDB() {




            new Move().move(dlog,tobBar);




            dlog.setLayout(null);




            tobBar.setBounds(0,0,250,40);
            tobBar.setText("       Save Quiz");
            tobBar.setOpaque(true);
            tobBar.setHorizontalAlignment(SwingConstants.CENTER);
            tobBar.setBackground(MaterialColor.BLUE_600);
            tobBar.setForeground(MaterialColor.WHITE);
            tobBar.setFont(new Font("Calibri",1, 16));
            dlog.add(tobBar);






            try {

                MaskFormatter fv = new MaskFormatter("********************");
                fv.setInvalidCharacters("' ',',', '.','/', ']','[', ';',':' ");

            } catch (Exception e) {
            }



            addField = new MaterialFormattedTextField(fv);
            addField.setText("");
            addField.setBounds(30, 70, 220, 40);
            addField.setFont(new Font("Calibri", 1, 17));
            addField.setHint("Enter quiz name");
            addField.setOpaque(false);
            dlog.add(addField);


            addButton.setBounds(100, 130, 100, 50);
            addButton.setFont(new Font("Calibri", 1, 17));
            addButton.setHorizontalAlignment(SwingConstants.CENTER);
            addButton.setBackground(MaterialColor.BLUE_600);
            addButton.setForeground(MaterialColor.WHITE);
            addButton.setText(" Create");
            dlog.add(addButton);

            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {


                    // createTable();
                    // goaction();
                    // comboBox();

                   // dlog.setVisible(false);

                    //JOptionPane.showMessageDialog(null, "Database Updated", "SUCCESS", JOptionPane.PLAIN_MESSAGE);


                }
            });


            cancel.setBounds(240,-10,70,58);
            cancel.setFont(new Font("Calibri", 1, 17));
            cancel.setHorizontalAlignment(SwingConstants.CENTER);
            cancel.setBackground(MaterialColor.RED_500);
            cancel.setForeground(MaterialColor.WHITE);
            cancel.setText("X");
            dlog.add(cancel);

            cancel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    addField.setText("");
                    dlog.setVisible(false);
                }
            });





            dlog.setLayout(null);
            dlog.setSize(300, 200);
            dlog.setLocationRelativeTo(HolderPage.f);
            dlog.getContentPane().setBackground(MaterialColor.ORANGE_400);
            dlog.setUndecorated(true);
            dlog.setVisible(true);

            dlog.setAlwaysOnTop(true);


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

