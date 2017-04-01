/**
 * Created by EdidiongEyo on 11/6/2016.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.RandomAccessFile;
import java.sql.*;
import javax.swing.event.*;
import java.util.Enumeration;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;


public class QuestionRadio extends JPanel implements ActionListener {


    public static JFrame f = new JFrame("");


    int x;
    int y;

    int heightdiv;
    int widthdiv;

   public static JTextArea tarea = new JTextArea();

    public static JRadioButton amenu = new JRadioButton("Option A");
    public static JRadioButton bmenu = new JRadioButton("Option B");
    public  static JRadioButton cmenu = new JRadioButton("Option C");
    public static JRadioButton dmenu = new JRadioButton("Option D");
    public static JRadioButton emenu = new JRadioButton("Option E");


    static JLabel optionA = new JLabel();
    static JLabel optionB = new JLabel();
    static JLabel optionC = new JLabel();
    static JLabel optionD = new JLabel();
    JLabel optionE = new JLabel();


    JButton accept = new JButton("Accept");
    static ButtonGroup group = new ButtonGroup();
    public static JLabel particpant = new JLabel();


    public static int point  = 0;

    JLabel timermast =  new JLabel("TIME LEFT");
    public static JLabel timerlabel = new JLabel();;


    //public static int counter = 0;
    public static int counter;


    public static int count = 1;

    public static JLabel questionNumner =  new JLabel("Question");

    JLabel rightsideBanner = new JLabel();
    JLabel upsideBanner = new JLabel();
    JLabel downsideBanner =  new JLabel();
    JLabel leftsideBanner =  new JLabel();



    private String participantsCount = "";
    private String participantMax = "";
    private String quizCount = "";



    public QuestionRadio() {


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = (Integer) y / 2;
        widthdiv = (Integer) x / 2;




        f.getContentPane().setLayout(null);
        f.getContentPane().setBackground(Color.white);
        f.add(this);
        setLayout(null);


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


        //counterMethod();


        questionNumner.setBounds(400,0,500,30);
        questionNumner.setOpaque(true);
        questionNumner.setBackground(new Color(32, 173, 248));
        questionNumner.setForeground(Color.white);
        questionNumner.setFont(new Font("Calibri",1, 20));
        questionNumner.setHorizontalAlignment(SwingConstants.CENTER);
        f.getContentPane().add(questionNumner);

        tarea.setBounds(50, 55, 600, 150);
        tarea.setEditable(false);
        tarea.setBorder(BorderFactory.createLineBorder(new Color(172, 172, 172),4));
        tarea.setFont(new Font("Calibri", 1, 20));
        tarea.setText("this is a test resjsd JAKDJFKLJ jflskjdf");
        f.getContentPane().add(tarea);

        amenu.setBounds(50, 230, 500, 30);
        amenu.addActionListener(this);
        amenu.setFont(new Font("Calibri", 1, 16));
        f.getContentPane().add(amenu);

        optionA.setBounds(40,220,610,50);
        optionA.setBackground(new Color(233, 233, 233));
        optionA.setOpaque(true);
        optionA.setVisible(false);
        f.getContentPane().add(optionA);


        bmenu.setBounds(50, 285, 500, 30);
        bmenu.addActionListener(this);
        bmenu.setFont(new Font("Calibri", 1, 16));
        f.getContentPane().add(bmenu);

        optionB.setBounds(40,275,610,50);
        optionB.setBackground(new Color(233, 233, 233));
        optionB.setOpaque(true);
        optionB.setVisible(false);
        f.getContentPane().add(optionB);

        cmenu.setBounds(50, 343, 500, 30);
        cmenu.addActionListener(this);
        cmenu.setFont(new Font("Calibri", 1, 16));
        f.getContentPane().add(cmenu);

        optionC.setBounds(40,333,610,50);
        optionC.setBackground(new Color(233, 233, 233));
        optionC.setOpaque(true);
        optionC.setVisible(false);
        f.getContentPane().add(optionC);

        dmenu.setBounds(50, 400, 500, 30);
        dmenu.addActionListener(this);
        dmenu.setFont(new Font("Calibri", 1, 16));
        f.getContentPane().add(dmenu);

        optionD.setBounds(40,390,610,50);
        optionD.setBackground(new Color(233, 233, 233));
        optionD.setOpaque(true);
        optionD.setVisible(false);
        f.getContentPane().add(optionD);



        timermast.setBounds(700,55,150,40);
        timermast.setOpaque(true);
        timermast.setFont(new Font("Calibri", 1, 20));
        timermast.setForeground(Color.white);
        timermast.setHorizontalAlignment(SwingConstants.CENTER);
        timermast.setBackground(new Color(32, 173, 248));
        f.getContentPane().add(timermast);

        timerlabel.setBounds(700,95,150,60);
        timerlabel.setOpaque(true);
        timerlabel.setFont(new Font("Calibri", 1, 35));
        timerlabel.setForeground(new Color(0, 168, 89));
        timerlabel.setHorizontalAlignment(SwingConstants.CENTER);
        timerlabel.setBackground(new Color(255, 220, 0));
        f.getContentPane().add(timerlabel);



        rightsideBanner.setBounds(670,31,230,550);
        rightsideBanner.setOpaque(true);
        rightsideBanner.setBackground(Color.white);
        //add(rightsideBanner);


        upsideBanner.setBounds(0,31,670,180);
        upsideBanner.setOpaque(true);
        upsideBanner.setBackground(Color.white);
        //add(upsideBanner);


        downsideBanner.setBounds(0,515,670,160);
        downsideBanner.setOpaque(true);
        downsideBanner.setBackground(Color.white);
        //add(downsideBanner);


        leftsideBanner.setBounds(0,200,30,320);
        leftsideBanner.setOpaque(true);
        leftsideBanner.setBackground(Color.white);
        //add(leftsideBanner);



//
//        int delay = 1000; //milliseconds
//        final ActionListener taskPerformer = new ActionListener() {
//            public void actionPerformed(ActionEvent evt) {
//
//                timerlabel.setText(String.valueOf(counter) + "s");
//                System.out.println("The counter is :   " + counter );
//                counter--;
//
//                if (counter < 15) {
//                    //timer.removeActionListener(this);
//                    timerlabel.setForeground(Color.red);
//                }
//                if (counter < -1) {
//
//                    timerlabel.setText("0s");
//                    timer.stop();
//                    //resetCounterLabel();
//
//                    acceptBut();
//
//
//                }
//
//            }
//        };
//
//            timer = new Timer(delay,taskPerformer);
//            timer.setRepeats(true);
//            timer.start();










        group.add(amenu);
        group.add(bmenu);
        group.add(cmenu);
        group.add(dmenu);
        group.add(emenu);

        emenu.setSelected(true);

        accept.setBounds(450, 450, 200, 50);
        accept.setBackground(new Color(0, 168, 89));
        accept.setHorizontalAlignment(SwingConstants.CENTER);
        accept.setForeground(Color.white);
        accept.setFont(new Font("Calibri", 1, 20));
        f.getContentPane().add(accept);
        accept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                acceptBut();
                attempted();
               // timer.restart();


                Quiz.data.clear();
                Quiz.resultset("SELECT id, participant, score FROM Participants");
                Quiz.table.updateUI();


            }


        });


        particpant.setBounds(0, 0, 400, 30);
        particpant.setOpaque(true);
        particpant.setFont(new Font("Calibri",1, 20));
        particpant.setBackground(new Color(32, 173, 248));
        particpant.setForeground(Color.white);
        particpant.setHorizontalAlignment(SwingConstants.CENTER);
        f.getContentPane().add(particpant);

        f.setSize(900, 600);
        f.setLocation(widthdiv - 450, heightdiv - 300);
        //f.setUndecorated(true);

            f.addWindowListener(new WindowListener() {
                @Override
                public void windowOpened(WindowEvent e) {

                }

                @Override
                public void windowClosing(WindowEvent e) {


                    Process.timer.stop();

                }

                @Override
                public void windowClosed(WindowEvent e) {

                    //Process.timer.stop();
                }

                @Override
                public void windowIconified(WindowEvent e) {

                }

                @Override
                public void windowDeiconified(WindowEvent e) {

                }

                @Override
                public void windowActivated(WindowEvent e) {

                }

                @Override
                public void windowDeactivated(WindowEvent e) {

                }
            });
       // f.setDefaultCloseOperation(3);
        f.setResizable(false);
        f.setVisible(true);
        updateUI();
    }




    public static void acceptBut(){


        String ac = Process.act + "";
        String quizdbname  = Process.quizdb;

        String query = "SELECT Answer FROM " + quizdbname;


        System.out.print(query);


        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/Questions.mdb;");
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rec = st.executeQuery(query);

            String selectedbutton = getSelectedButtonText(group);


           /// while (rec.next()) {


                if(rec.absolute(Process.act)){

                if ((selectedbutton.equals(rec.getString("Answer")))) {

                   Process.timer.stop();
                    changeOptionColorGreen();
                    //resetCounterLabel();
                    addscore();
                    corect();



                    JOptionPane.showMessageDialog(null, "Correct Answer", "CORRECT", JOptionPane.PLAIN_MESSAGE);



                    f.dispose();






                }

                else {


                   Process.timer.stop();
                   changeOptionColorRed();
                    failure();



                   // resetCounterLabel();

                    JOptionPane.showMessageDialog(null, "Wrong Answer", "WRONG", JOptionPane.PLAIN_MESSAGE);
                    f.dispose();


                }


            }


            st.close();
            conn.close();


        } catch (SQLException g) {
            g.printStackTrace();
            Process.timer.stop();
        } catch (ClassNotFoundException h) {
            h.printStackTrace();
            Process.timer.stop();
        }






    }





    public void fill(String questn, String option1, String option2, String option3, String option4) {

        tarea.setText(questn);
        amenu.setText(option1);
        bmenu.setText(option2);
        cmenu.setText(option3);
        dmenu.setText(option4);


    }


    public static void fillName(String nameID) {

        particpant.setText(nameID);



    }


    public static String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements(); ) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
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
            //Connection conn = DriverManager.getConnection("jdbc:odbc:bank");

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
            //Connection conn = DriverManager.getConnection("jdbc:odbc:bank");
            ResultSet rec = st.executeQuery("SELECT correct FROM Participants" );
            //ResultSet rec = st.executeQuery("SELECT correct FROM Participants" );





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


        Connection conn = null;


        try {


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");
           // Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            PreparedStatement ps = conn.prepareStatement("UPDATE Participants SET correct = '"+correct+"' WHERE id  = '" + count + "'" );
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





    public static void failure(){


        Connection conn = null;


        try {


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            //Connection conn = DriverManager.getConnection("jdbc:odbc:bank");
            ResultSet rec = st.executeQuery("SELECT failed FROM Participants" );
            //ResultSet rec = st.executeQuery("SELECT correct FROM Participants" );





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


    public static void counterMethod()
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

            counter = 10;

        }

        if(counterNow.equals("15secs") ){

            counter = 15;

        }


        if(counterNow.equals("30secs") ){

                counter = 30;

        }

        if(counterNow.equals("45secs") ){

            counter = 45;

        }


        if(counterNow.equals("60secs") ){

            counter = 60;

        }

    }





    public void resetCounterLabel()
    {



        String counterNow = "";

        RandomAccessFile conf;


        try{

            conf = new RandomAccessFile("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\DB\\counter", "r");
           // conf.seek(0);
            counterNow = conf.readLine();
            conf.close();


        }
        catch (Exception exception)
        {
            System.out.println("config-file read error: " + exception.toString());
        }




        if(counterNow.equals("10secs") ){

            timerlabel.setText("10s");

        }

        if(counterNow.equals("15secs") ){

           timerlabel.setText("15s");

        }


        if(counterNow.equals("30secs") ){

            timerlabel.setText("30s");

        }


        if(counterNow.equals("45secs") ){

            timerlabel.setText("45s");

        }


        if(counterNow.equals("60secs") ){

            timerlabel.setText("60s");

        }

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
                new QuestionRadio();
            }
        });



    }

}

