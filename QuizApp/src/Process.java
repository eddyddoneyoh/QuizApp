import javax.swing.*;
import java.io.RandomAccessFile;
import java.sql.*;

/**
 * Created by EdidiongEyo on 11/6/2016.
 */
public class Process {

    public static int act;
    public static String quizdb = "";



    public static int start = 1;
    public static int count = 0;
    public static int max = 0;




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




           String query = "SELECT ID, Question, Option1, Option2, Option3, Option4, Answer FROM " + quizdb;




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



                          //  QuestionRadio.tarea2.setText("");
                            QuestionRadio.amenu.setText("");
                            QuestionRadio.bmenu.setText("");
                            QuestionRadio.cmenu.setText("");
                            QuestionRadio.dmenu.setText("");

                            present = "true";


                            new QuestionRadio().fill(rec.getString("Question"),rec.getString("Option1"),rec.getString("Option2"),rec.getString("Option3"),rec.getString("Option4"));

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



                QuestionRadio.fillName(rec.getString("participant"));

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
