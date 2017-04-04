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



    JPanel menuPanel =  new JPanel();
    JButton previous =  new JButton("Previous");
    JButton next =  new JButton("Next");


    JLabel rightLabel  =  new JLabel();
    JLabel leftLabel  =  new JLabel();
    int count  =  0;
    int pageCount = 1;

    public Entry() {


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = (Integer) y / 2;
        widthdiv = (Integer) x / 2;


        leftLabel.setBounds(0,190,200,210);
        leftLabel.setOpaque(true);
        leftLabel.setBackground(new Color(41, 170, 248));
        add(leftLabel);

        rightLabel.setBounds(780,190,215,210);
        rightLabel.setOpaque(true);
        rightLabel.setBackground(new Color(41, 170, 248));
        add(rightLabel);


        menuPanel.setBounds(210,200,1130,180);
        menuPanel.setLayout(null);
        menuPanel.setOpaque(false);
        add(menuPanel);






        previous.setBounds(300,400,100,30);
        add(previous);

        previous.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {






                pageCount = pageCount + 1;

                if(pageCount == 1){

                    previous.setEnabled(true);
                    next.setEnabled(false);


                }

                if(pageCount == 2){

                    previous.setEnabled(true);
                    next.setEnabled(true);
                }



                if(pageCount == 3){

                    previous.setEnabled(true);
                    next.setEnabled(true);
                }


                if(pageCount == 4){

                    previous.setEnabled(false);
                    next.setEnabled(true);
                }






                new Timer(1, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        count = count + 1;

                        menuPanel.setLocation(menuPanel.getX() - 38, 200);

                        if (count == 5) {
                            ((Timer) e.getSource()).stop();
                            System.out.println("Timer stopped");
                            count = 0;
                        }


                        }

                }).start();




            }
        });






        next.setBounds(500,400,100,30);
        next.setEnabled(false);
        add(next);


        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {




                pageCount = pageCount - 1;

                if(pageCount == 1){

                    previous.setEnabled(true);
                    next.setEnabled(false);


                }

                if(pageCount == 2){

                    previous.setEnabled(true);
                    next.setEnabled(true);
                }



                if(pageCount == 3){

                    previous.setEnabled(true);
                    next.setEnabled(true);
                }


                if(pageCount == 4){

                    previous.setEnabled(false);
                    next.setEnabled(true);
                }






                new Timer(1, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        count = count + 1;

                        menuPanel.setLocation(menuPanel.getX() + 38, 200);

                        if (count == 5) {
                            ((Timer) e.getSource()).stop();
                            System.out.println("Timer stopped");
                            count = 0;
                        }




                    }
                }).start();
            }
        });





        newQuiz.setBounds(0, 0, 180, 180);
        newQuiz.setFont(new Font("Calibri", 1, 19));
        newQuiz.setHorizontalAlignment(SwingConstants.CENTER);
        newQuiz.setBackground(new Color(0, 168, 89));
        newQuiz.setForeground(Color.white);
        menuPanel.add(newQuiz);

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



        resume.setBounds(190, 0, 180, 180);
        resume.setFont(new Font("Calibri", 1, 19));
        resume.setHorizontalAlignment(SwingConstants.CENTER);
        resume.setBackground(new Color(0, 168, 89));
        resume.setForeground(Color.white);
        menuPanel.add(resume);


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


        login.setBounds(380, 0, 180, 180);
        login.setFont(new Font("Calibri", 1, 19));
        login.setHorizontalAlignment(SwingConstants.CENTER);
        login.setBackground(new Color(0, 168, 89));
        login.setForeground(Color.white);
        menuPanel.add(login);

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


        settings.setBounds(570, 0, 180, 180);
        settings.setFont(new Font("Calibri", 1, 19));
        settings.setHorizontalAlignment(SwingConstants.CENTER);
        settings.setBackground(new Color(0, 168, 89));
        settings.setForeground(Color.white);
        menuPanel.add(settings);


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




        help.setBounds(760, 0, 180, 180);
        help.setFont(new Font("Calibri", 1, 19));
        help.setHorizontalAlignment(SwingConstants.CENTER);
        help.setBackground(new Color(0, 168, 89));
        help.setForeground(Color.white);
        menuPanel.add(help);


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




        about.setBounds(950, 0, 180, 180);
        about.setFont(new Font("Calibri", 1, 19));
        about.setHorizontalAlignment(SwingConstants.CENTER);
        about.setBackground(new Color(0, 168, 89));
        about.setForeground(Color.white);
        menuPanel.add(about);


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


