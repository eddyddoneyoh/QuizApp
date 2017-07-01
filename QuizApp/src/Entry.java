import MaterialDesign.MaterialColor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;



public class Entry extends JPanel {

    //Image imaget = new ImageIcon("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\img\\bg.png").getImage();
    Icon androidPix = new ImageIcon("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\img\\android.png");
    Icon applePix = new ImageIcon("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\img\\apple.png");


      JButton newQuiz =  new JButton();
     JButton resume =  new JButton();
     JButton login =  new JButton();


    JPanel menuPanel =  new JPanel();

    JPanel panelBelow  = new JPanel();

    JLabel android = new JLabel();
    JLabel apple =  new JLabel();


    Random r = new Random();

    private int i = 0;


    JLabel yellowDown =  new JLabel();



    Thread finalT;
    Thread finalT2;




    public Entry() {


        setBounds(0,0,980,515);


        HolderPage.breadCrumb.setText("Home");
        HolderPage.home.setEnabled(false);



        menuPanel.setBounds(210,135,1130,180);
        menuPanel.setLayout(null);
        menuPanel.setOpaque(false);
        add(menuPanel);



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



                    }
                });





            }
        });



        resume.setBounds(190, 0, 180, 180);
        resume.setFont(new Font("Calibri", 1, 19));
        resume.setHorizontalAlignment(SwingConstants.CENTER);
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



                finalT = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        loginTest();


                    }
                });
                finalT.start();





            }
        });




//
//        ToastBar toastBar = new ToastBar();
//        toastBar.setSize(300, 170);
//        toastBar.setLocation(650, 45);
//        //add(toastBar);
//        setComponentZOrder(toastBar, 0);
//
//        TextToast tesjk =  new TextToast("Welcome Back User!");


        if(HolderPage.welcomeToastCount == 0){

            //toastBar.display(tesjk);

            new FadingToast();

            HolderPage.welcomeToastCount = HolderPage.welcomeToastCount  + 1;
        }





        yellowDown.setBounds(0,415,1000, 5);
        yellowDown.setBackground(MaterialColor.ORANGE_400);
        yellowDown.setOpaque(true);
        add(yellowDown);





        panelBelow.setBounds(0,420,1000,80);
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
        checkerboard.setBounds(0,0,1000,414);
        add(checkerboard);




        setBackground(new Color(198, 198, 198));

        setLayout(null);



    }






    public void loginTest(){



        try {

            RandomAccessFile configMain = new RandomAccessFile("DB/Accounts/LoginTest", "r");
            String quizdb = configMain.readLine();
            configMain.close();


            if (quizdb.equals("true")) {


                 finalT2 = new Thread(new Runnable() {
                    @Override
                    public void run() {

                      // new HolderPage.Blocker();
                        HolderPage.f.setEnabled(false);
                       // HolderPage.blocker.setEnabled(false);
                        new Login();

                        finalT2.stop();

                    }
                });
                finalT2.start();



            } else if(quizdb.equals("false")) {


                finalT2 = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        HolderPage.f.setEnabled(true);

                        HolderPage.content.removeAll();

                        HolderPage.content.add(new Admin());

                        HolderPage.content.updateUI();

                        finalT2.stop();

                    }
                });
                finalT2.start();


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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


