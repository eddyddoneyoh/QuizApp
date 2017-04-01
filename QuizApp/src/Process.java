import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.RandomAccessFile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.*;

/**
 * Created by EdidiongEyo on 11/6/2016.
 */
public class Process {

    public static int act;
    public static String quizdb = "";



    public static int start = 1;
    public static int count = 0;
    public static int max = 0;

    static Timer timer;


    public static void entry(String actioncommand)
    {







        RandomAccessFile config;


        try{

            config = new RandomAccessFile("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\DB\\QuizDB", "r");
            //conf.seek(0);
            quizdb = config.readLine();


        }
        catch (Exception exception)
        {
            System.out.println("config-file read error: " + exception.toString());
        }



        String query = "SELECT ID, Type, Question, Option1, Option2, Option3, Option4 FROM " + quizdb;





        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/Questions.mdb;");
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rec = st.executeQuery(query);
            String questrad = "radio";
            String questchk = "check";



            act = Integer.parseInt(actioncommand);


            if(rec.absolute(act)){


                if (questrad.equals(rec.getString("Type")))  {

                    QuestionRadio.tarea.setText("");
                    QuestionRadio.amenu.setText("");
                    QuestionRadio.bmenu.setText("");
                    QuestionRadio.cmenu.setText("");
                    QuestionRadio.dmenu.setText("");


                    new QuestionRadio().fill(rec.getString("Question"),rec.getString("Option1"),rec.getString("Option2"),rec.getString("Option3"),rec.getString("Option4"));

                }
                else if ((questchk.equals(rec.getString("Type")))) {

                    new QuestionCheck().fill(rec.getString("Question"), rec.getString("Option1"), rec.getString("Option2"), rec.getString("Option3"), rec.getString("Option4"));

                }

            }
            else{ timer.start();
                timer.stop();}


            st.close();
            conn.close();


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }






        String participantsCount = "";
        String participantMax = "";
        String quizCount = "";

        String sqlString;
        RandomAccessFile conf;


        try{

            conf = new RandomAccessFile("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\DB\\participants", "r");
            //conf.seek(0);
            participantsCount = conf.readLine();
            participantMax = conf.readLine();
            quizCount = conf.readLine();

            start = Integer.parseInt(quizCount);


        }
        catch (Exception exception)
        {
            System.out.println("config-file read error: " + exception.toString());
        }










        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");
            Statement st = conn.createStatement();
            ResultSet rec = st.executeQuery("SELECT participant FROM Participants WHERE Id = '" + start + "' ");



            while (rec.next()) {



                QuestionRadio.fillName(rec.getString("participant"));

            }





            st.close();
            conn.close();


        } catch (SQLException g) {
            g.printStackTrace();
        } catch (ClassNotFoundException h) {
            h.printStackTrace();
        }





        QuestionRadio.counterMethod();

        int delay = 1000; //milliseconds
        final ActionListener taskPerformer = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent evt) {

                QuestionRadio.timerlabel.setText(String.valueOf(QuestionRadio.counter) + "s");
                System.out.println("The counter is :   " + QuestionRadio.counter );
                QuestionRadio.counter--;

                if (QuestionRadio.counter < 15) {

                    QuestionRadio.timerlabel.setForeground(Color.red);
                }
                if (QuestionRadio.counter < -1) {

                    QuestionRadio.timerlabel.setText("0s");
                    timer.stop();
                    //resetCounterLabel();
                    QuestionRadio.acceptBut();


                }

            }
        };

            timer = new Timer(delay,taskPerformer);
            //timer.setRepeats(true);
            timer.start();






    }






















}
