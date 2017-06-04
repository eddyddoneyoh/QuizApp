import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
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


    DateFormat dateFormat = new SimpleDateFormat("EEE. MMMMMMMMMMMMMM, yyyy  |  hh:mm aaa");


    Date dated = new Date();

    Timer rf = null;

    Random r = new Random();

    private int i = 0;


    JLabel yellowUp =  new JLabel();
    JLabel yellowDown =  new JLabel();


    JLabel topBar = new JLabel("QuizApp");




    int x1 = 0;
    int y1 = 0;
    int fx = 0;
    int fy = 0;


//////////////////////////////////////////////////////////////////////////////////////////////

    JLabel breadCrumb =  new JLabel("Home");


    JButton exitButton = new JButton();
    JButton minimize =  new JButton();
    JButton topMenu =  new JButton();



    public static MaterialProgressSpinner spinner = new MaterialProgressSpinner();
    public static JLabel loading  = new JLabel("Loading");





    public Entry() {



        new Move().move(HolderPage.f,topBar);



        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = y / 2;
        widthdiv = x / 2;












        leftLabel.setBounds(0,190,200,210);
        leftLabel.setOpaque(true);
        leftLabel.setBackground(new Color(198, 198, 198));
        //leftLabel.setBackground(Color.gray);
        //add(leftLabel);

        rightLabel.setBounds(780,190,215,210);
        rightLabel.setOpaque(true);
        //rightLabel.setBackground(new Color(41, 170, 248));
        rightLabel.setBackground(new Color(198, 198, 198));
        //add(rightLabel);


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
        //add(previous);


        previousHidden.setBounds(380,400,66,50);
        //previous.setBackground(new Color(41, 170, 248));
        previousHidden.setIcon(new ImageIcon("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\img\\left.png"));
        previousHidden.setOpaque(false);
        previousHidden.setEnabled(false);
       // add(previousHidden);


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
        //add(next);


        nextHidden.setBounds(530,400,66,50);
        //next.setBackground(new Color(41, 170, 248));
        nextHidden.setEnabled(false);
        nextHidden.setVisible(true);
        nextHidden.setIcon(new ImageIcon("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\img\\right.png"));
        nextHidden.setOpaque(false);
        //add(nextHidden);



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
        newQuiz.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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



//
//                        TextToast toast =  new TextToast("this is a test");
//
//                        toast.setYOffset(200);
//                        toast.setSize(100,200);
//                        toast.setVisible(true);
//                        toast.show(true);
//
//
//                        ToastBar mh =  new ToastBar();
//                        mh.add(toast);
//                        mh.setVisible(true);
//                        mh.show(true);







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
        resume.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
        login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
        settings.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        //menuPanel.add(settings);


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
        help.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        //menuPanel.add(help);


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
        about.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        //menuPanel.add(about);


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







        minimize.setBounds(880,5,30,30);
        minimize.setIcon(new ImageIcon("img//minimize.png"));
        minimize.setRolloverIcon(new ImageIcon("img//minimizeR.png"));
        add(minimize);

        minimize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                HolderPage.f.setState(Frame.ICONIFIED);
            }
        });

        topMenu.setBounds(825,5,30,30);
        topMenu.setIcon(new ImageIcon("img//menu.png"));
        topMenu.setRolloverIcon(new ImageIcon("img//menuR.png"));
        add(topMenu);

        topMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                new TopMenu();

            }
        });








        exitButton.setBounds(926, 5,30,30);
        exitButton.setFont(new Font("Calibri",0,21));
        exitButton.setIcon(new ImageIcon("img//power.png"));
        exitButton.setRolloverIcon(new ImageIcon("img//powerR.png"));
        add(exitButton);



        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });







        ToastBar toastBar = new ToastBar();
        toastBar.setSize(300, 170);
        toastBar.setLocation(650, 110);
        add(toastBar);
        setComponentZOrder(toastBar, 0);

        TextToast tesjk =  new TextToast("Welcome Back User!");


        if(HolderPage.welcomeToastCount == 0){

            toastBar.display(tesjk);

            HolderPage.welcomeToastCount = HolderPage.welcomeToastCount  + 1;
        }




        spinner.setBounds(5,5,30,25);
        spinner.setForeground(MaterialColor.ORANGE_200);
        add(spinner);


        loading.setBounds(40,5,100,30);
        loading.setForeground(MaterialColor.ORANGE_200);
        loading.setFont(new Font("Calibri",1,15));
        add(loading);



        topBar.setBounds(0,0,1000,40);
        topBar.setOpaque(true);
        topBar.setBackground(MaterialColor.BLUE_800);
        topBar.setForeground(MaterialColor.DARK_WHITE);
        topBar.setFont(new Font("Calibri",1, 20));
        topBar.setHorizontalAlignment(SwingConstants.CENTER);
        add(topBar);










        panelAbove.setBounds(0,40,1000,35);
        panelAbove.setLayout(null);
        panelAbove.setBackground(MaterialColor.ORANGE_400);
        add(panelAbove);




        breadCrumb.setBounds(40,0,400,35);
        breadCrumb.setForeground(MaterialColor.WHITE);
        breadCrumb.setFont(new Font("Calibri", 1, 18));
        panelAbove.add(breadCrumb);



        date.setBounds(750,0,400,35);
        date.setForeground(MaterialColor.WHITE);
        date.setFont(new Font("Calibri", 1, 18));
        panelAbove.add(date);


      java.util.Timer timer4 = new java.util.Timer();
        TimerTask myTask = new TimerTask() {
            @Override
            public void run() {


                dated = new Date();
                date.setText(dateFormat.format(dated));


            }
        };

        timer4.scheduleAtFixedRate(myTask,0,1000);








        yellowDown.setBounds(0,485,1000, 5);
        yellowDown.setBackground(MaterialColor.ORANGE_400);
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


        JPanel checkerboard = new Checkerboard();
        checkerboard.setBounds(0,0,1000,600);
        add(checkerboard);




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

                    //HolderPage.blocker.setVisible(true);
                    new HolderPage.Blocker();
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








    private static class Checkerboard extends JPanel {
        private static final int DIVISIONS = 10;
        static final int CHECKER_SIZE = 60;
        public void paintComponent(Graphics g) {
            g.setColor(MaterialColor.ORANGE_400);
            g.fillRect(0, 0, getWidth(), getHeight());
            g.setColor(MaterialColor.BLUE_800);
            for (int stripeX = 0; stripeX < getWidth(); stripeX += CHECKER_SIZE) {
                for (int y = 0, row = 0; y < getHeight(); y += CHECKER_SIZE/2, ++row) {
                    int x = (row % 2 == 0) ? stripeX : (stripeX + CHECKER_SIZE/2);
                    g.fillRect(x, y, CHECKER_SIZE/2, CHECKER_SIZE/2);
                }
            }
        }
    }







    class Move{


        public void move(final JFrame frame, JLabel l){




            l.addMouseMotionListener(


                    new MouseMotionAdapter(){



                        public void mouseDragged(MouseEvent evt){


                            fx = evt.getXOnScreen() - x1;

                            fy = evt.getYOnScreen() - y1;


                            frame.setLocation(fx,fy);



                        }

                    });



            l.addMouseListener(


                    new MouseAdapter(){


                        public void mousePressed(MouseEvent t){


                            x1 = t.getX();
                            y1 = t.getY();



                        }


                    });





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
        catch(Exception e){e.printStackTrace();}



        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Entry();
            }
        });



    }

}


