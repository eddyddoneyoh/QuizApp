/**
 * Created by EdidiongEyo on 11/6/2016.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.event.*;


public class QuestionCheck extends JPanel{


    JFrame f = new JFrame("");


    int x;
    int y;

    int heightdiv;
    int widthdiv;

    JTextArea tarea =  new JTextArea();

    JCheckBox amenu = new JCheckBox("Option A");
    JCheckBox bmenu = new JCheckBox("Option A");
    JCheckBox cmenu = new JCheckBox("Option A");
    JCheckBox dmenu = new JCheckBox("Option A");

    JButton accept = new JButton("Accept");

    public QuestionCheck() {


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = (Integer) y / 2;
        widthdiv = (Integer) x / 2;



        tarea.setBounds(50,30,300,100);
        tarea.setEditable(false);
        add(tarea);

        amenu.setBounds(50,140,500,30);
        add(amenu);

        bmenu.setBounds(50,180,500,30);
        add(bmenu);

        cmenu.setBounds(50,220,500,30);
        add(cmenu);

        dmenu.setBounds(50,260,500,30);
        add(dmenu);





        setBackground(Color.white);
        setLayout(null);


        f.add(this);

        f.setSize(1000, 600);
        f.setLocation(widthdiv - 500, heightdiv - 300);
        // f.setUndecorated(true);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setResizable(false);

    }


    public void fill(String questn, String option1, String option2, String option3, String option4){

        tarea.setText(questn);
        amenu.setText(option1);
        bmenu.setText(option2);
        cmenu.setText(option3);
        dmenu.setText(option4);



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
                new QuestionCheck();
            }
        });



    }

}