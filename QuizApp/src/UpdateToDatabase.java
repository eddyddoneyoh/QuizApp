import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class UpdateToDatabase {



    String quizdb = "";
    String actionCommand = RetrieveDB.act + "";


    public UpdateToDatabase(){


        quizdb = Admin.contestantStatus.getText();


        String queryDelete = "DELETE FROM "+quizdb+" WHERE ID = '" + actionCommand +"'";
        //String queryDelete = "DELETE FROM "+quizdb+" WHERE ID = '2'";
        String queryUpdate = "INSERT INTO "+quizdb+" (ID, Type, Question, Option1, Option2, Option3, Option4, Answer) " + "VALUES (? , ? , ? , ? , ?, ?, ?, ?)";


        String questionSQL = SaveToDatabase.tarea.getText();
        String optionASQL = SaveToDatabase.amenu.getText();
        String optionBSQL = SaveToDatabase.bmenu.getText();
        String optionCSQL = SaveToDatabase.cmenu.getText();
        String optionDSQL = SaveToDatabase.dmenu.getText();
        String buttonSelectedSQL = "";

        String buttonSelected  =  SaveToDatabase.buttonGroup.getSelection().getActionCommand();


        if(buttonSelected.equals("A")){

            buttonSelectedSQL = "A";
        }
        else if(buttonSelected.equals("B")){

            buttonSelectedSQL = "B";
        }
        else if(buttonSelected.equals("C")){

            buttonSelectedSQL = "C";
        }
        else if(buttonSelected.equals("D")){

            buttonSelectedSQL = "D";
        }










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
                ps.setString (2, "radio");
                ps.setString (3, questionSQL);
                ps.setString (4, optionASQL);
                ps.setString (5, optionBSQL);
                ps.setString (6, optionCSQL);
                ps.setString (7, optionDSQL);
                ps.setString (8, buttonSelectedSQL);

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
