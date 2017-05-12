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
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.TimerTask;



public class Entry extends JPanel {


    JFrame f = new JFrame("");


    int x;
    int y;

    int heightdiv;
    int widthdiv;






    Image imaget = new ImageIcon("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\img\\bg.png").getImage();
    Icon androidPix = new ImageIcon("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\img\\android.png");
    Icon applePix = new ImageIcon("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\img\\apple.png");







      JButton newQuiz =  new JButton();
     JButton resume =  new JButton();
     JButton login =  new JButton();
     JButton settings =  new JButton();
     JButton help =  new JButton();
     JButton about =  new JButton();



    JPanel menuPanel =  new JPanel();
     JLabel previous =  new JLabel();
     JLabel next =  new JLabel();
     JLabel nextHidden =  new JLabel();
     JLabel previousHidden =  new JLabel();


    JLabel rightLabel  =  new JLabel();
    JLabel leftLabel  =  new JLabel();
    int count  =  0;
    int pageCount = 1;


    JPanel panelBelow  = new JPanel();
    JPanel panelAbove =  new JPanel();
    JLabel date = new JLabel();

    JLabel android = new JLabel();
    JLabel apple =  new JLabel();


    DateFormat dateFormat = new SimpleDateFormat("EEE MMMMMMMMMMMMMM, yyyy  |  hh:mm aaa");


    Date dated = new Date();

    Timer rf = null;

    Random r = new Random();

    private int i = 0;


    JLabel yellowUp =  new JLabel();
    JLabel yellowDown =  new JLabel();


    public Entry() {


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = y / 2;
        widthdiv = x / 2;


        leftLabel.setBounds(0,190,200,210);
        leftLabel.setOpaque(true);
        leftLabel.setBackground(new Color(198, 198, 198));
        //leftLabel.setBackground(Color.gray);
        add(leftLabel);

        rightLabel.setBounds(780,190,215,210);
        rightLabel.setOpaque(true);
        //rightLabel.setBackground(new Color(41, 170, 248));
        rightLabel.setBackground(new Color(198, 198, 198));
        add(rightLabel);


        menuPanel.setBounds(210,200,1130,180);
        menuPanel.setLayout(null);
        menuPanel.setOpaque(false);
        add(menuPanel);



        settings.setEnabled(false);
        help.setEnabled(false);




        previous.setBounds(380,400,66,50);
        //previous.setBackground(new Color(41, 170, 248));
        previous.setIcon(new ImageIcon("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\img\\left.png"));
        previous.setOpaque(false);
        add(previous);


        previousHidden.setBounds(380,400,66,50);
        //previous.setBackground(new Color(41, 170, 248));
        previousHidden.setIcon(new ImageIcon("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\img\\left.png"));
        previousHidden.setOpaque(false);
        previousHidden.setEnabled(false);
        add(previousHidden);


        previous.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                pageCount = pageCount + 1;
               HolderPage.holderPage_pageCount = pageCount;

                if(pageCount == 1){

                    previousHidden.setVisible(false);
                    previous.setEnabled(true);
                    previous.setVisible(true);
                    next.setVisible(false);




                    newQuiz.setEnabled(true);
                    resume.setEnabled(true);
                    login.setEnabled(true);
                    settings.setEnabled(false);
                    help.setEnabled(false);
                    about.setEnabled(true);




                }

                if(pageCount == 2){

                    previousHidden.setVisible(false);
                    previous.setEnabled(true);
                    previous.setVisible(true);
                    next.setVisible(true);



                    newQuiz.setEnabled(false);
                    resume.setEnabled(true);
                    login.setEnabled(true);
                    settings.setEnabled(true);
                    help.setEnabled(false);
                    about.setEnabled(false);

                }



                if(pageCount == 3){

                    previousHidden.setVisible(false);
                    previous.setEnabled(true);
                    previous.setVisible(true);
                    next.setVisible(true);


                    newQuiz.setEnabled(false);
                    resume.setEnabled(false);
                    login.setEnabled(true);
                    settings.setEnabled(true);
                    help.setEnabled(true);
                    about.setEnabled(false);



                }


                if(pageCount == 4){


                   previousHidden.setVisible(true);
                    previous.setVisible(false);
                    next.setEnabled(true);
                    next.setVisible(true);



                    newQuiz.setEnabled(false);
                    resume.setEnabled(false);
                    login.setEnabled(false);
                    settings.setEnabled(true);
                    help.setEnabled(true);
                    about.setEnabled(true);



                }






                new Timer(1, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        count = count + 1;

                        menuPanel.setLocation(menuPanel.getX() - 38, 200);

                        if (count == 5) {
                            ((Timer) e.getSource()).stop();
                            //System.out.println("Timer stopped");
                            count = 0;
                        }


                    }

                }).start();




            }
        });









        next.setBounds(530,400,66,50);
        next.setVisible(false);
        next.setIcon(new ImageIcon("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\img\\right.png"));
        next.setOpaque(false);
        add(next);


        nextHidden.setBounds(530,400,66,50);
        //next.setBackground(new Color(41, 170, 248));
        nextHidden.setEnabled(false);
        nextHidden.setVisible(true);
        nextHidden.setIcon(new ImageIcon("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\img\\right.png"));
        nextHidden.setOpaque(false);
        add(nextHidden);



        next.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                pageCount = pageCount - 1;
                HolderPage.holderPage_pageCount = pageCount;

                if(pageCount == 1){

                    previous.setEnabled(true);
                    previous.setVisible(true);
                    next.setVisible(false);
                    nextHidden.setVisible(true);



                    newQuiz.setEnabled(true);
                    resume.setEnabled(true);
                    login.setEnabled(true);
                    settings.setEnabled(false);
                    help.setEnabled(false);
                    about.setEnabled(true);


                }

                if(pageCount == 2){

                    previous.setEnabled(true);
                    previous.setVisible(true);
                    next.setVisible(true);
                    nextHidden.setVisible(false);


                    newQuiz.setEnabled(false);
                    resume.setEnabled(true);
                    login.setEnabled(true);
                    settings.setEnabled(true);
                    help.setEnabled(false);
                    about.setEnabled(false);

                }



                if(pageCount == 3){

                    previous.setEnabled(true);
                    previous.setVisible(true);
                    next.setVisible(true);
                    nextHidden.setVisible(false);


                    newQuiz.setEnabled(false);
                    resume.setEnabled(false);
                    login.setEnabled(true);
                    settings.setEnabled(true);
                    help.setEnabled(true);
                    about.setEnabled(false);

                }


                if(pageCount == 4){

                    previous.setEnabled(false);
                    previous.setVisible(false);
                    next.setVisible(true);
                    nextHidden.setVisible(false);



                    newQuiz.setEnabled(false);
                    resume.setEnabled(false);
                    login.setEnabled(false);
                    settings.setEnabled(true);
                    help.setEnabled(true);
                    about.setEnabled(true);


                }






                new Timer(1, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        count = count + 1;

                        menuPanel.setLocation(menuPanel.getX() + 38, 200);

                        if (count == 5) {
                            ((Timer) e.getSource()).stop();
                            // System.out.println("Timer stopped");
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
        newQuiz.setIcon(new ImageIcon("img//NewQuiz.png"));
        newQuiz.setRolloverIcon(new ImageIcon("img//NewQuizH.png"));
        newQuiz.setBorder(BorderFactory.createLineBorder(Color.white,4,true));
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
        //resume.setBackground(new Color(0, 168, 89));
       // resume.setForeground(Color.white);
        resume.setIcon(new ImageIcon("img//Resume.png"));
        resume.setRolloverIcon(new ImageIcon("img//ResumeH.png"));
        resume.setBorder(BorderFactory.createLineBorder(Color.white,4,true));
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
        login.setIcon(new ImageIcon("img//Login.png"));
        login.setRolloverIcon(new ImageIcon("img//LoginH.png"));
        login.setBorder(BorderFactory.createLineBorder(Color.white,4,true));
        menuPanel.add(login);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

              //  f.dispose();


                loginTest();


               // new Login();





            }
        });


        settings.setBounds(570, 0, 180, 180);
        settings.setFont(new Font("Calibri", 1, 19));
        settings.setHorizontalAlignment(SwingConstants.CENTER);
       // settings.setBackground(new Color(0, 168, 89));
        //settings.setForeground(Color.white);
        settings.setIcon(new ImageIcon("img//Setup.png"));
        settings.setRolloverIcon(new ImageIcon("img//SetupH.png"));
        settings.setBorder(BorderFactory.createLineBorder(Color.white,4,true));
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
      //  help.setBackground(new Color(0, 168, 89));
       // help.setForeground(Color.white);
        help.setIcon(new ImageIcon("img//Help.png"));
        help.setRolloverIcon(new ImageIcon("img//HelpH.png"));
        help.setBorder(BorderFactory.createLineBorder(Color.white,4,true));
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
       // about.setBackground(new Color(0, 168, 89));
        //about.setForeground(Color.white);
        about.setIcon(new ImageIcon("img//About.png"));
        about.setRolloverIcon(new ImageIcon("img//AboutH.png"));
        about.setBorder(BorderFactory.createLineBorder(Color.white,4,true));
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



        panelAbove.setBounds(0,0,1000,55);
        panelAbove.setLayout(null);
        panelAbove.setBackground(Color.white);
        add(panelAbove);


        yellowUp.setBounds(0,56,1000,5);
        yellowUp.setBackground(new Color(232, 161, 28));
        yellowUp.setOpaque(true);
        add(yellowUp);





        date.setBounds(620,5,370,50);
     //   date.setForeground(new Color(41, 170, 248));
        date.setForeground(new Color(68, 68, 68));
        date.setFont(new Font("Calibri", 1, 30));
        panelAbove.add(date);


      java.util.Timer timer4 = new java.util.Timer();
        TimerTask myTask = new TimerTask() {
            @Override
            public void run() {


                dated = new Date();
                date.setText(dateFormat.format(dated).toString());


            }
        };

        timer4.scheduleAtFixedRate(myTask,0,1000);



        yellowDown.setBounds(0,485,1000, 5);
        yellowDown.setBackground(new Color(232, 161, 28));
        yellowDown.setOpaque(true);
        add(yellowDown);





        panelBelow.setBounds(0,490,1000,80);
        panelBelow.setLayout(null);
        panelBelow.setBackground(Color.white);
        add(panelBelow);






        android.setBounds(300,15,166,50);
        android.setIcon(androidPix);
        panelBelow.add(android);

        apple.setBounds(500,15,166,50);
        apple.setIcon(applePix);
        panelBelow.add(apple);




        setBackground(new Color(198, 198, 198));

        setLayout(null);



    }







    public void paintComponent(Graphics g){

        super.paintComponent(g);




        //	g.setFont(new Font("Calibri (Body)", 1, 11));

       // g.drawImage(imaget, 0, 0,1000,570,this);



    }




    public void loginTest(){


        try {


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");

            Statement st = conn.createStatement();
            //ResultSet rec = st.executeQuery("SELECT username, password FROM Login");
            ResultSet rec = st.executeQuery("SELECT status FROM LoginStatus");
            boolean isExist = false;

            while (rec.next()) {
                String x = "true";
                String y = rec.getString("status");


                if (x.equals(y)) {


                    new Login();

                }
                else{


                    HolderPage.f.setEnabled(true);

                    HolderPage.content.removeAll();

                    HolderPage.content.add(new Admin());






                    HolderPage.content.updateUI();

                    HolderPage.f.setTitle("QuizApp 2016 - Admin Control");



                }




                }



            st.close();
            conn.close();
        } catch (SQLException d) {
            d.printStackTrace();
        } catch (ClassNotFoundException f) {
            f.printStackTrace();
        }


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


