/**
 * Created by EdidiongEyo on 11/20/2016.
 */
/**
 * Created by EdidiongEyo on 11/20/2016.
 */
/**
 * Created by EdidiongEyo on 11/6/2016.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.RandomAccessFile;
import java.sql.*;
import javax.swing.event.*;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.Dimension;
import java.util.Vector;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;




public class Entry extends JPanel {


    JFrame f = new JFrame("");


    int x;
    int y;

    int heightdiv;
    int widthdiv;






    Image imaget = new ImageIcon("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\img\\bg.png").getImage();







    JButton newQuiz =  new JButton("New Quiz");
    JButton resume =  new JButton("Resume Quiz");
    JButton login =  new JButton("Login");
    JButton settings =  new JButton("Settings");
    JButton help =  new JButton("Help");
    JButton about =  new JButton("About");


    public Entry() {


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = (Integer) y / 2;
        widthdiv = (Integer) x / 2;



        newQuiz.setBounds(130, 80, 180, 180);
        newQuiz.setFont(new Font("Calibri", 1, 19));
        newQuiz.setHorizontalAlignment(SwingConstants.CENTER);
        newQuiz.setBackground(new Color(0, 168, 89));
        newQuiz.setForeground(Color.white);
        add(newQuiz);

        newQuiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    public void run() {


                        HolderPage.content.removeAll();

                        HolderPage.content.add(new Home());

                        HolderPage.content.updateUI();

                        HolderPage.f.setTitle("QuizApp 2016 - New Quiz");



                    }
                });





            }
        });



        resume.setBounds(410, 80, 180, 180);
        resume.setFont(new Font("Calibri", 1, 19));
        resume.setHorizontalAlignment(SwingConstants.CENTER);
        resume.setBackground(new Color(0, 168, 89));
        resume.setForeground(Color.white);
        add(resume);


        resume.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    public void run() {


                        HolderPage.content.removeAll();

                        HolderPage.content.add(new SavedGame());

                        HolderPage.content.updateUI();

                        HolderPage.f.setTitle("QuizApp 2016 - Resume Game");



                    }
                });





            }
        });


        login.setBounds(700, 80, 180, 180);
        login.setFont(new Font("Calibri", 1, 19));
        login.setHorizontalAlignment(SwingConstants.CENTER);
        login.setBackground(new Color(0, 168, 89));
        login.setForeground(Color.white);
        add(login);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                f.dispose();
               // new Login();



                HolderPage.f.setEnabled(true);

                HolderPage.content.removeAll();

                HolderPage.content.add(new Admin());


                HolderPage.content.updateUI();

                HolderPage.f.setTitle("QuizApp 2016 - Admin Control");




            }
        });


        settings.setBounds(130, 320, 180, 180);
        settings.setFont(new Font("Calibri", 1, 19));
        settings.setHorizontalAlignment(SwingConstants.CENTER);
        settings.setBackground(new Color(0, 168, 89));
        settings.setForeground(Color.white);
        add(settings);


        settings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    public void run() {


                        HolderPage.content.removeAll();

                        HolderPage.content.add(new Settings());

                        HolderPage.content.updateUI();

                        HolderPage.f.setTitle("QuizApp 2016 - New Quiz");



                    }
                });





            }
        });




        help.setBounds(410, 320, 180, 180);
        help.setFont(new Font("Calibri", 1, 19));
        help.setHorizontalAlignment(SwingConstants.CENTER);
        help.setBackground(new Color(0, 168, 89));
        help.setForeground(Color.white);
        add(help);


        help.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    public void run() {


                        HolderPage.content.removeAll();

                        HolderPage.content.add(new Help());

                        HolderPage.content.updateUI();

                        HolderPage.f.setTitle("QuizApp 2016 - Quiz Help");



                    }
                });





            }
        });




        about.setBounds(700, 320, 180, 180);
        about.setFont(new Font("Calibri", 1, 19));
        about.setHorizontalAlignment(SwingConstants.CENTER);
        about.setBackground(new Color(0, 168, 89));
        about.setForeground(Color.white);
        add(about);


        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    public void run() {


                        HolderPage.content.removeAll();

                        HolderPage.content.add(new About());

                        HolderPage.content.updateUI();

                        HolderPage.f.setTitle("QuizApp 2016 - Quiz Help");



                    }
                });





            }
        });




        setBackground(new Color(32, 173, 248));
        setLayout(null);



    }






    public void paintComponent(Graphics g){

        super.paintComponent(g);




        //	g.setFont(new Font("Calibri (Body)", 1, 11));

        g.drawImage(imaget, 0, 0,1000,570,this);



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
                new Entry();
            }
        });



    }

}


