/**
 * Created by EdidiongEyo on 11/6/2016.
 */

import MaterialDesign.MaterialColor;
import MaterialDesign.Roboto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.RandomAccessFile;
import java.sql.*;
import java.util.Enumeration;


public class QuestionRadio extends JPanel implements ActionListener {


      JFrame f  = new JFrame();


    int x;
    int y;


   public static JTextArea tarea2 = new JTextArea();

    public static JRadioButton amenu = new JRadioButton("Option A");
    public static JRadioButton bmenu = new JRadioButton("Option B");
    public static JRadioButton cmenu = new JRadioButton("Option C");
    public  static JRadioButton dmenu = new JRadioButton("Option D");
    public static JRadioButton emenu = new JRadioButton("Option E");


    public static JLabel optionA = new JLabel();
    public static JLabel optionB = new JLabel();
    public static JLabel optionC = new JLabel();
    public static JLabel optionD = new JLabel();
    JLabel optionE = new JLabel();



    JLabel optionALabel =  new JLabel("A");
    JLabel optionBLabel =  new JLabel("B");
    JLabel optionCLabel =  new JLabel("C");
    JLabel optionDLabel =  new JLabel("D");


    JButton accept = new JButton("Accept");
    static ButtonGroup group = new ButtonGroup();
    public static JLabel particpant = new JLabel();


    public static int point  = 0;

    JLabel timermast =  new JLabel("TIME LEFT");
    public static JLabel timerlabel = new JLabel();;


    public static int counter = 0;


    public static int count = 1;

    public static JLabel questionNumner =  new JLabel("Question");
    


    private String participantsCount = "";
    private String participantMax = "";
    private String quizCount = "";





    JLabel topBar = new JLabel();
    JButton home =  new JButton("X");





    static public Timer timer = null;

    JLabel downbar =  new JLabel();


    public QuestionRadio() {



        new Move().move(f, topBar);

        setBackground(MaterialColor.WHITE);
        setLayout(null);


        HolderPage.f.setFocusable(false);
        HolderPage.f.setFocusableWindowState(false);

        setBorder(BorderFactory.createLineBorder(MaterialColor.BLUE_700,6,false));
        f.requestFocus();



        tarea2.setBounds(50, 55, 600, 150);
        tarea2.setFont(Roboto.REGULAR.deriveFont(18f));
        tarea2.setWrapStyleWord(true);
        tarea2.setLineWrap(true);
        tarea2.setEditable(false);
        tarea2.setEnabled(true);



        JScrollPane scroll =  new JScrollPane(tarea2);
        scroll.setBounds(50, 55, 600, 150);
        scroll.getVerticalScrollBar().setUI(new MyScrollBarUI());
        add(scroll);




        point();
        totalResetOptionColorAndMenu();



        RandomAccessFile conf2;

        try{

            conf2 = new RandomAccessFile("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\DB\\participants", "rw");
            //conf.seek(0);
            participantsCount = conf2.readLine();
            participantMax = conf2.readLine();
            quizCount = conf2.readLine();

            count = Integer.parseInt(quizCount);
           // max = Integer.parseInt(participantMax);

        }
        catch (Exception exception)
        {
            System.out.println("config-file read error: " + exception.toString());
        }


        home.setBounds(820,3, 50, 35);
        home.setFont(new Font("Calibri", 1, 19));
        home.setHorizontalAlignment(SwingConstants.CENTER);
        home.setBackground(MaterialColor.RED_400);
        home.setForeground(Color.white);
        home.requestFocus(false);
        add(home);


        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    public void run() {


                        timer.stop();

                        HolderPage.f.setFocusable(true);
                        HolderPage.f.setFocusableWindowState(true);
                        HolderPage.f.requestFocus();

                        f.dispose();

                    }
                });


            }
        });






        particpant.setBounds(50, 0, 100, 40);
        particpant.setFont(new Font("Calibri",1, 20));
        particpant.setForeground(MaterialColor.DARK_WHITE);
        add(particpant);


        questionNumner.setBounds(400,0,150,40);
        questionNumner.setFont(new Font("Calibri",1, 20));
        questionNumner.setForeground(MaterialColor.DARK_WHITE);
        add(questionNumner);



        topBar.setBounds(0, 0, 990, 40);
        topBar.setOpaque(true);
        topBar.setBackground(MaterialColor.BLUE_800);
        topBar.setForeground(MaterialColor.DARK_WHITE);
        topBar.setFont(new Font("Calibri", 1, 20));
        topBar.setHorizontalAlignment(SwingConstants.CENTER);
        add(topBar);




        optionALabel.setBounds(20,227,25,35);
        optionALabel.setFont(Roboto.REGULAR.deriveFont(24f));
        optionALabel.setForeground(MaterialColor.GREEN_700);
        add(optionALabel);

        optionBLabel.setBounds(20,282,25,35);
        optionBLabel.setFont(Roboto.REGULAR.deriveFont(24f));
        optionBLabel.setForeground(MaterialColor.GREEN_700);
        add(optionBLabel);

        optionCLabel.setBounds(20,340,25,35);
        optionCLabel.setFont(Roboto.REGULAR.deriveFont(24f));
        optionCLabel.setForeground(MaterialColor.GREEN_700);
        add(optionCLabel);

        optionDLabel.setBounds(20,397,25,35);
        optionDLabel.setFont(Roboto.REGULAR.deriveFont(24f));
        optionDLabel.setForeground(MaterialColor.GREEN_700);
        add(optionDLabel);


        amenu.setBounds(50, 220, 600, 50);
        amenu.setActionCommand("A");
        amenu.setFont(Roboto.REGULAR.deriveFont(18f));
        amenu.setBackground(MaterialColor.ORANGE_100);
        amenu.addActionListener(this);
        add(amenu);


        amenu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                amenu.setOpaque(true);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                amenu.setOpaque(false);
            }
        });



        bmenu.setBounds(50, 275, 600, 50);
        bmenu.setActionCommand("B");
        bmenu.setFont(Roboto.REGULAR.deriveFont(18f));
        bmenu.setBackground(MaterialColor.ORANGE_100);
        bmenu.addActionListener(this);
        add(bmenu);


        bmenu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                bmenu.setOpaque(true);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                bmenu.setOpaque(false);
            }
        });



        cmenu.setBounds(50, 333, 600, 50);
        cmenu.setActionCommand("C");
        cmenu.setFont(Roboto.REGULAR.deriveFont(18f));
        cmenu.setBackground(MaterialColor.ORANGE_100);
        cmenu.addActionListener(this);
        add(cmenu);


        cmenu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                cmenu.setOpaque(true);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                cmenu.setOpaque(false);
            }
        });



        dmenu.setBounds(50, 390, 600, 50);
        dmenu.setActionCommand("D");
        dmenu.setFont(Roboto.REGULAR.deriveFont(18f));
        dmenu.setBackground(MaterialColor.ORANGE_100);
        dmenu.addActionListener(this);
        add(dmenu);

        dmenu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                dmenu.setOpaque(true);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                dmenu.setOpaque(false);
            }
        });




        group.add(amenu);
        group.add(bmenu);
        group.add(cmenu);
        group.add(dmenu);
        group.add(emenu);

        emenu.setActionCommand("E");
        emenu.setSelected(true);



        optionA.setBounds(50,220,600,50);
        optionA.setBackground(new Color(233, 233, 233));
        optionA.setOpaque(true);
        optionA.setVisible(false);
        add(optionA);



        optionB.setBounds(50,275,600,50);
        optionB.setBackground(new Color(233, 233, 233));
        optionB.setOpaque(true);
        optionB.setVisible(false);
        add(optionB);

        optionC.setBounds(50,333,600,50);
        optionC.setBackground(new Color(233, 233, 233));
        optionC.setOpaque(true);
        optionC.setVisible(false);
        add(optionC);

        optionD.setBounds(50,390,600,50);
        optionD.setBackground(new Color(233, 233, 233));
        optionD.setOpaque(true);
        optionD.setVisible(false);
        add(optionD);




        timermast.setBounds(700,55,150,40);
        timermast.setOpaque(true);
        timermast.setFont(new Font("Calibri", 1, 20));
        timermast.setForeground(Color.white);
        timermast.setHorizontalAlignment(SwingConstants.CENTER);
        timermast.setBackground(new Color(32, 173, 248));
        add(timermast);

        timerlabel.setBounds(700,95,150,60);
        timerlabel.setOpaque(true);
        timerlabel.setFont(new Font("Calibri", 1, 35));
        timerlabel.setForeground(new Color(0, 168, 89));
        timerlabel.setHorizontalAlignment(SwingConstants.CENTER);
        timerlabel.setBackground(new Color(255, 220, 0));
        add(timerlabel);



        final ActionListener taskPerformer = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent evt) {

                timerlabel.setText(String.valueOf(counter) + "s");
                counter--;

                if (counter < 15) {

                    timerlabel.setForeground(Color.red);

                }
                if (counter < -1) {

                    timerlabel.setText("0s");
                    timer.stop();

                    acceptBut();

                    HolderPage.f.setFocusable(true);
                    HolderPage.f.setFocusableWindowState(true);
                    HolderPage.f.requestFocus();


                }

            }
        };






        timer = new Timer(500,taskPerformer);

        timer.start();




        accept.setBounds(450, 450, 200, 50);
        accept.setBackground(new Color(0, 168, 89));
        accept.setHorizontalAlignment(SwingConstants.CENTER);
        accept.setForeground(Color.white);
        accept.setFont(new Font("Calibri", 1, 20));
        add(accept);
        accept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                acceptBut();
                attempted();

                Quiz.data.clear();
                Quiz.resultset("SELECT id, participant, score FROM Participants");
                Quiz.table.updateUI();


            }


        });



        downbar.setBounds(6,555,888,40);
        downbar.setBackground(new Color(233, 233, 233));
        downbar.setOpaque(true);
        add(downbar);




        f.setSize(900, 600);
        f.add(this);
        f.setLocationRelativeTo(HolderPage.f);
        f.setUndecorated(true);
        f.setVisible(true);
        updateUI();

    }





    public void fill(String questn, String option1, String option2, String option3, String option4) {

        tarea2.setText("");

        tarea2.setText(questn);
        amenu.setText(option1);
        bmenu.setText(option2);
        cmenu.setText(option3);
        dmenu.setText(option4);

    }




    public void acceptBut(){


       String query = "SELECT ID, Answer FROM  "  + Process.quizdb;
       // String query = "SELECT ID,  Answer FROM  edidiong";


        String correctAnswer = "";



        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/Questions.mdb;");
            Statement st =  conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rec = st.executeQuery(query);


            String x = Quiz.actionCommandText;




            while (rec.next()) {



                try {


                    if (x.equals(rec.getString("ID"))) {



                        correctAnswer = rec.getString("Answer");

                        break;
                    }


                }
                catch (java.sql.SQLException jg){ jg.printStackTrace(); }



            }

            st.close();
            conn.close();


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }









            String selectedbutton = getSelectedButtonActionCommand(group);


        String correct = "false";


                if (selectedbutton.equals(correctAnswer)) {

                    correct = "true";


                   timer.stop();
                    changeOptionColorGreen();
                    addscore();
                    corect();

                    JOptionPane.showMessageDialog(this, "Correct Answer", "CORRECT", JOptionPane.PLAIN_MESSAGE);


                    timerlabel.setText("0s");

                    HolderPage.f.setFocusable(true);
                    HolderPage.f.setFocusableWindowState(true);
                    HolderPage.f.requestFocus();


                    f.dispose();


                }



                if(correct.equals("false")){



                   timer.stop();
                   changeOptionColorRed();
                    failure();

                    JOptionPane.showMessageDialog(this, "Wrong Answer", "WRONG", JOptionPane.PLAIN_MESSAGE);



                    timerlabel.setText("0s");

                    HolderPage.f.setFocusable(true);
                    HolderPage.f.setFocusableWindowState(true);
                    HolderPage.f.requestFocus();



                    f.dispose();


                }


            }







    public static void fillName(String nameID) {

        particpant.setText(nameID);



    }


    public static String getSelectedButtonActionCommand(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements(); ) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getActionCommand();
            }
        }

        return null;
    }



    public static void addscore() {

        Integer score = 0;

        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");
            Statement st = conn.createStatement();
            ResultSet rec = st.executeQuery("SELECT score FROM Participants WHERE Id = '" + count + "' ");


            while (rec.next()) {

                    String scorename = rec.getString("score");

                try{
                    score = Integer.parseInt(scorename);
                }
                catch (NumberFormatException e){e.printStackTrace();}



               score = score + point;

                mainadder(score);


            }


            st.close();
            conn.close();


        } catch (SQLException g) {
            g.printStackTrace();
        } catch (ClassNotFoundException h) {
            h.printStackTrace();
        }


    }




    public static void mainadder(int score){



        PreparedStatement ps = null;
        Connection conn2 = null;
        String score2 = score + "";

        try {


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn2 = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");

            ps = conn2.prepareStatement ("UPDATE Participants SET Score = '" + score2 +"' WHERE id  = '" + count + "'" );

            ps.executeUpdate();

        }

        catch ( SQLException sqlException )
        {
            sqlException.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in Uploading records", "FAILURE", JOptionPane.PLAIN_MESSAGE);

        } // end catch
        catch ( ClassNotFoundException classNotFound )
        {
            classNotFound.printStackTrace();

        } // end catch
        finally // ensure statement and connection are closed properly
        {
            try
            {
                ps.close();
                conn2.close();
            } // end try
            catch ( Exception exception )
            {
                exception.printStackTrace();

            } // end catch
        } // end finally


    }









    public static void corect(){


        Connection conn = null;


        try {


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rec = st.executeQuery("SELECT correct FROM Participants" );



            if(rec.absolute(count)) {

                    int scor = Integer.parseInt(rec.getString("correct")) ;
                    scor = scor + 1;
                    corectAdd(scor);

            }



                st.close();
                conn.close();

        }

        catch ( SQLException sqlException )
        {
            sqlException.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in Uploading records", "FAILURE", JOptionPane.PLAIN_MESSAGE);

        } // end catch
        catch ( ClassNotFoundException classNotFound )
        {
            classNotFound.printStackTrace();

        } // end catch


    }




    public static void corectAdd(int correct){


        Connection conn;


        try {


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");
            PreparedStatement ps = conn.prepareStatement("UPDATE Participants SET correct = '"+correct+"' WHERE id  = '" + count + "'" );
            ps.executeUpdate();
            ps.close();

            conn.close();
            ps.close();

        }

        catch ( SQLException sqlException )
        {
            sqlException.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in Uploading records", "FAILURE", JOptionPane.PLAIN_MESSAGE);

        } // end catch
        catch ( ClassNotFoundException classNotFound )
        {
            classNotFound.printStackTrace();

        } // end catch


    }





    public static void failure(){


        Connection conn;


        try {


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rec = st.executeQuery("SELECT failed FROM Participants" );


            if(rec.absolute(count)) {

                int scor = Integer.parseInt(rec.getString("failed")) ;
                scor = scor + 1;
                failedAdd(scor);

            }



            st.close();
            conn.close();

        }

        catch ( SQLException sqlException )
        {
            sqlException.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in Uploading records", "FAILURE", JOptionPane.PLAIN_MESSAGE);

        } // end catch
        catch ( ClassNotFoundException classNotFound )
        {
            classNotFound.printStackTrace();

        } // end catch


    }




    public static void failedAdd(int failed){


        Connection conn = null;


        try {


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");
            // Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            PreparedStatement ps = conn.prepareStatement("UPDATE Participants SET failed = '"+failed+"' WHERE id  = '" + count + "'" );
            ps.executeUpdate();
            ps.close();

            conn.close();

        }

        catch ( SQLException sqlException )
        {
            sqlException.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in Uploading records", "FAILURE", JOptionPane.PLAIN_MESSAGE);

        } // end catch
        catch ( ClassNotFoundException classNotFound )
        {
            classNotFound.printStackTrace();

        } // end catch


    }



    public void attempted(){


        Connection conn = null;


        try {


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rec = st.executeQuery("SELECT attempted FROM Participants" );





            if(rec.absolute(count)) {

                int scor = Integer.parseInt(rec.getString("attempted")) ;
                scor = scor + 1;
                attemptedAdd(scor);





            }



            st.close();
            conn.close();

        }

        catch ( SQLException sqlException )
        {
            sqlException.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in Uploading records", "FAILURE", JOptionPane.PLAIN_MESSAGE);

        } // end catch
        catch ( ClassNotFoundException classNotFound )
        {
            classNotFound.printStackTrace();

        } // end catch


    }




    public void attemptedAdd(int attempted){


        Connection conn = null;


        try {


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");
            // Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            PreparedStatement ps = conn.prepareStatement("UPDATE Participants SET attempted = '"+attempted+"' WHERE id  = '" + count + "'" );
            ps.executeUpdate();
            ps.close();

            conn.close();

        }

        catch ( SQLException sqlException )
        {
            sqlException.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in Uploading records", "FAILURE", JOptionPane.PLAIN_MESSAGE);

        } // end catch
        catch ( ClassNotFoundException classNotFound )
        {
            classNotFound.printStackTrace();

        } // end catch


    }







    public  void point() {


        try {

            Connection conn = null;

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rec = st.executeQuery("SELECT attr FROM QuizSettings");


            if (rec.absolute(2)) {


                if (rec.getString("attr").equals("1pt")) {


                    point = 1;


                } else if (rec.getString("attr").equals("3pts")) {


                    point = 3;


                }else  {


                    point = 5;


                }



            }




            st.close();
            conn.close();

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in Uploading records", "FAILURE", JOptionPane.PLAIN_MESSAGE);

        } // end catch
        catch (ClassNotFoundException classNotFound) {
            classNotFound.printStackTrace();

        } // end catch


    }



    public void actionPerformed(ActionEvent e){

                    if(amenu.isSelected() == true){

                        optionA.setVisible(true);
                        optionB.setVisible(false);
                        optionC.setVisible(false);
                        optionD.setVisible(false);

                    }

                    if(bmenu.isSelected() == true){

                        optionA.setVisible(false);
                        optionB.setVisible(true);
                        optionC.setVisible(false);
                        optionD.setVisible(false);

                    }

                    if(cmenu.isSelected() == true){

                        optionA.setVisible(false);
                        optionB.setVisible(false);
                        optionC.setVisible(true);
                        optionD.setVisible(false);

                    }

                    if(dmenu.isSelected() == true){

                        optionA.setVisible(false);
                        optionB.setVisible(false);
                        optionC.setVisible(false);
                        optionD.setVisible(true);

                    }

                }




                public static void changeOptionColorGreen(){



                    if(amenu.isSelected() == true){

                        optionA.setBackground(new Color(0, 168, 89));
                        amenu.setForeground(Color.white);


                    }

                    if(bmenu.isSelected() == true){

                        optionB.setBackground(new Color(0, 168, 89));
                        bmenu.setForeground(Color.white);

                    }

                    if(cmenu.isSelected() == true){

                        optionC.setBackground(new Color(0, 168, 89));
                        cmenu.setForeground(Color.white);

                    }

                    if(dmenu.isSelected() == true){

                        optionD.setBackground(new Color(0, 168, 89));
                        dmenu.setForeground(Color.white);

                    }
                }




    public static void changeOptionColorRed(){



        if(amenu.isSelected() == true){

            optionA.setBackground(new Color(245, 3, 6));
            amenu.setForeground(Color.white);


        }

        if(bmenu.isSelected() == true){

            optionB.setBackground(new Color(245, 3, 6));
            bmenu.setForeground(Color.white);

        }

        if(cmenu.isSelected() == true){

            optionC.setBackground(new Color(245, 3, 6));
            cmenu.setForeground(Color.white);

        }

        if(dmenu.isSelected() == true){

            optionD.setBackground(new Color(245, 3, 6));
            dmenu.setForeground(Color.white);

        }
    }






        public static void totalResetOptionColorAndMenu(){



            amenu.setForeground(Color.black);
            optionA.setBackground(new Color(233, 233, 233));
            optionA.setVisible(false);


            bmenu.setForeground(Color.black);
            optionB.setBackground(new Color(233, 233, 233));
            optionB.setVisible(false);

            cmenu.setForeground(Color.black);
            optionC.setBackground(new Color(233, 233, 233));
            optionC.setVisible(false);

            dmenu.setForeground(Color.black);
            optionD.setBackground(new Color(233, 233, 233));
            optionD.setVisible(false);



        }



    public static void main(String[] args) {



        new QuestionRadio();


    }

}

