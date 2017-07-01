import java.sql.*;


public class RetrieveDB {

    public static int act;
    public static String quizdb = "";


    public static void entry(String actioncommand)
    {


        quizdb = Admin.contestantStatus.getText();


        String query = "SELECT ID, Type, Question, Option1, Option2, Option3, Option4, Answer  FROM " + quizdb;



        try {

           // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           // Connection conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/Questions.mdb;");


            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://DB/Questions.mdb");



            //Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            Statement st =  conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rec = st.executeQuery(query);
            String questrad = "radio";
            String questchk = "check";





            act = Integer.parseInt(actioncommand);


           // if(rec.absolute(act)){
            String present =  "false";

            String x = act + "";




                        while (rec.next()) {



                            try {


                                String type1 = "quiz";
                                String type2 = "spellingbee";


                            if ((x.equals( rec.getString("ID")))){




                                SaveToDatabase.tarea.setText("");
                                SaveToDatabase.amenu.setText("");
                                SaveToDatabase.bmenu.setText("");
                                SaveToDatabase.cmenu.setText("");
                                SaveToDatabase.dmenu.setText("");


                                present = "true";

                               new SaveToDatabase().fill(rec.getString("Question"), rec.getString("Option1"), rec.getString("Option2"), rec.getString("Option3"), rec.getString("Option4"), rec.getString("Answer"), actioncommand);


                                break;
                            }


                        }
                        catch (java.sql.SQLException jg){ jg.printStackTrace(); }



                    }




            if(present.equals("false")){


                SaveToDatabase.tarea.setText("");
                SaveToDatabase.amenu.setText("");
                SaveToDatabase.bmenu.setText("");
                SaveToDatabase.cmenu.setText("");
                SaveToDatabase.dmenu.setText("");


                new SaveToDatabase().fill("NO QUESTION HAS BEEN SET", "OPTION 1","OPTION 2", "OPTION 3","OPTION 4","ANSWER", actioncommand);


            }






            st.close();
            conn.close();


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }





    }



}
