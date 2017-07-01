import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class SpellingBeeUpdateDB {


    String actionCommand = SpellingBeeRetrieveDB.act + "";


    public SpellingBeeUpdateDB(){


        String queryDelete = "DELETE FROM SpellingBee WHERE ID = '" + actionCommand +"'";
        String queryUpdate = "INSERT INTO SpellingBee (ID, Word, Meaning) " + "VALUES (? , ? , ? )";


        String questionSQL = SpellingBeeSave.tarea.getText();
        String meaningSQL = SpellingBeeSave.tareaMeaning.getText();



        PreparedStatement ps = null;
        Connection conn = null;

        try {


            //   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            // conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/Questions.mdb;");


            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conn = DriverManager.getConnection("jdbc:ucanaccess://DB/Questions.mdb");




            ps = conn.prepareStatement(queryDelete);
            ps.execute();


            ps = conn.prepareStatement(queryUpdate);


            ps.setString (1, actionCommand);
            ps.setString (2, questionSQL);
            ps.setString (3, meaningSQL);


            ps.executeUpdate();


            JOptionPane.showMessageDialog(null, "Database Updated", "SUCCESS", JOptionPane.PLAIN_MESSAGE);


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
                conn.close();
            } // end try
            catch ( Exception exception )
            {
                exception.printStackTrace();

            } // end catch
        } // end finally



    }




}
