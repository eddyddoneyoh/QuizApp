import javax.swing.*;
import java.io.RandomAccessFile;
import java.sql.*;

/**
 * Created by EdidiongEyo on 11/6/2016.
 */
public class SpellingBeeProcess {

    public static int act;


    public static int start = 1;
    public static int count = 0;
    public static int max = 0;




    public static void entry(String actioncommand)
    {



        String query = "SELECT ID, Word, Meaning FROM SpellingBee";




        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/Questions.mdb;");
            Statement st =  conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rec = st.executeQuery(query);


            act = Integer.parseInt(actioncommand);

            String x = act+"";

            String present =  "false";



            while (rec.next()) {



                try {




                    if (x.equals(rec.getString("ID"))) {



                        QuestionSpellingBee.tarea2.setText("");
                        QuestionSpellingBee.tareaMeaning2.setText("");


                        present = "true";


                        new QuestionSpellingBee().fill(rec.getString("Word"),rec.getString("Meaning"));

                        break;
                    }


                }
                catch (java.sql.SQLException jg){ jg.printStackTrace(); }



            }



            if(present.equals("false")){


                JOptionPane.showMessageDialog(HolderPage.f,"No question has been set! Please choose another question","NO QUESTION!",JOptionPane.INFORMATION_MESSAGE);


            }



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



                QuestionSpellingBee.fillName(rec.getString("participant"));

            }





            st.close();
            conn.close();


        } catch (SQLException g) {
            g.printStackTrace();
        } catch (ClassNotFoundException h) {
            h.printStackTrace();
        }



    }


}
