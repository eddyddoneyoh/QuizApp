/**
 * Created by EdidiongEyo on 11/6/2016.
 */

import MaterialDesign.MaterialColor;
import MaterialDesign.Roboto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.RandomAccessFile;
import java.sql.*;


public class QuestionSpellingBee extends JPanel {


    JFrame f = new JFrame();
   // static MaterialWindow f =  new MaterialWindow();


    int x;
    int y;


   public static JTextArea tarea2 = new JTextArea();
   public static JTextArea tareaMeaning2 = new JTextArea();


    JButton correct = new JButton("Correct");
    JButton failed = new JButton("Wrong");


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






    public QuestionSpellingBee() {



        new Move().move(f, topBar);

        setBackground(MaterialColor.WHITE);
        setLayout(null);



        HolderPage.f.setFocusable(false);
        HolderPage.f.setFocusableWindowState(false);

        setBorder(BorderFactory.createLineBorder(MaterialColor.BLUE_700,6,false));

        f.requestFocus();




        tarea2.setFont(Roboto.REGULAR.deriveFont(18f));
        //tarea.setText("");
        tarea2.setWrapStyleWord(true);
        tarea2.setLineWrap(true);
        tarea2.setEnabled(true);
        tarea2.setEditable(false);



        JScrollPane scroll =  new JScrollPane(tarea2);
        scroll.setBounds(50, 55, 600, 150);
        scroll.getVerticalScrollBar().setUI(new MyScrollBarUI());
        add(scroll);





        tareaMeaning2.setFont(Roboto.REGULAR.deriveFont(18f));
        //tarea.setText("");
        tareaMeaning2.setWrapStyleWord(true);
        tareaMeaning2.setLineWrap(true);
        tareaMeaning2.setEnabled(true);
        tareaMeaning2.setEditable(false);



        JScrollPane scrollMeaning =  new JScrollPane(tareaMeaning2);
        scrollMeaning.setBounds(50, 220, 600, 150);
        scrollMeaning.getVerticalScrollBar().setUI(new MyScrollBarUI());
        add(scrollMeaning);





        point();



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


                    HolderPage.f.setFocusable(true);
                    HolderPage.f.setFocusableWindowState(true);
                    HolderPage.f.requestFocus();


                    acceptBut();


                }

            }
        };



        timer = new Timer(800,taskPerformer);

        timer.start();






        correct.setBounds(100, 450, 200, 50);
        correct.setBackground(new Color(0, 168, 89));
        correct.setHorizontalAlignment(SwingConstants.CENTER);
        correct.setForeground(Color.white);
        correct.setFont(new Font("Calibri", 1, 20));
        add(correct);
        correct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                acceptBut();
                attempted();

                Quiz.data.clear();
                Quiz.resultset("SELECT id, participant, score FROM Participants");
                Quiz.table.updateUI();


            }


        });




        failed.setBounds(350, 450, 200, 50);
        failed.setBackground(new Color(0, 168, 89));
        failed.setHorizontalAlignment(SwingConstants.CENTER);
        failed.setForeground(Color.white);
        failed.setFont(new Font("Calibri", 1, 20));
        add(failed);
        failed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                failedtBut();
                attempted();

                Quiz.data.clear();
                Quiz.resultset("SELECT id, participant, score FROM Participants");
                Quiz.table.updateUI();


            }


        });





        f.add(this);
        f.setSize(900, 600);
        f.setLocationRelativeTo(HolderPage.f);
        f.setUndecorated(true);
        f.setVisible(true);
        updateUI();

    }





    public void fill(String word, String meaning) {

        tarea2.setText(word);
        tareaMeaning2.setText(meaning);


    }




    public void acceptBut(){

            timer.stop();
            addscore();
            corect();

           // JOptionPane.showMessageDialog(this, "Correct Answer", "CORRECT", JOptionPane.PLAIN_MESSAGE);


            timerlabel.setText("0s");

            HolderPage.f.setFocusable(true);
            HolderPage.f.setFocusableWindowState(true);
            HolderPage.f.requestFocus();


            f.dispose();


        }




    public void failedtBut(){


                timer.stop();
                failure();


                timerlabel.setText("0s");

                HolderPage.f.setFocusable(true);
                HolderPage.f.setFocusableWindowState(true);
                HolderPage.f.requestFocus();



                f.dispose();


                }





public static void fillName(String nameID) {

        particpant.setText(nameID);


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





    public static void main(String[] args) {


        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new QuestionSpellingBee();
            }
        });



    }

}

