import java.sql.*;


public class SpellingBeeRetrieveDB {

    public static int act;


    public static void entry(String actioncommand)
    {


        String query = "SELECT ID, Word, Meaning  FROM  SpellingBee";



        try {

            // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            // Connection conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/Questions.mdb;");


            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://DB/Questions.mdb");

            Statement st =  conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rec = st.executeQuery(query);


            act = Integer.parseInt(actioncommand);

            String present =  "false";

            String x = act + "";




            while (rec.next()) {



                try {


                    if ((x.equals( rec.getString("ID")))){




                        SpellingBeeSave.tarea.setText("");
                        SpellingBeeSave.tareaMeaning.setText("");


                        present = "true";

                        new SpellingBeeSave().fill(rec.getString("Word"), rec.getString("Meaning"), actioncommand);


                        break;
                    }


                }
                catch (java.sql.SQLException jg){ jg.printStackTrace(); }



            }




            if(present.equals("false")){

                SpellingBeeSave.tarea.setText("");
                SpellingBeeSave.tareaMeaning.setText("");

                new SpellingBeeSave().fill("NO QUESTION HAS BEEN SET", "NO DEFINITION HAS BEEN SET", actioncommand);


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
