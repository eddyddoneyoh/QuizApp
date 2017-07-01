/**
 * Created by EdidiongEyo on 12/1/2016.
 */
/**
 * Created by EdidiongEyo on 11/5/2016.
 */
/**
 * Created by EdidiongEyo on 11/5/2016.
 */

import MaterialDesign.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.TimerTask;



public class HolderPage  {


    static MaterialWindow f = new MaterialWindow();
    static JPanel top =  new JPanel();
    static JPanel content =  new JPanel();


    int x;
    int y;

    int heightdiv;
    int widthdiv;

    Image imaget = new ImageIcon("img/home.png").getImage();

    static int welcomeToastCount = 0;



    static MaterialBlocker blocker =  new MaterialBlocker(HolderPage.f);

    static JButton home = new JButton();
    static JButton loclButton =  new JButton();



    JLabel yellowUp = new JLabel();


    JLabel topBar = new JLabel("QuizApp");


    int x1 = 0;
    int y1 = 0;
    int fx = 0;
    int fy = 0;


    JButton close = new JButton();
    JButton minimize = new JButton();
    JButton topMenu = new JButton();


    //////////////////////////////////////////////////////////////////////////////////////


    JLabel date = new JLabel();

    DateFormat dateFormat = new SimpleDateFormat("EEE. MMMMMMMMMMMMMM, yyyy  |  hh:mm aaa");

    java.util.Date dated = new java.util.Date();


    //////////////////////////////////////////////////////////////////////////////

    static public JLabel breadCrumb = new JLabel();



    public static MaterialProgressSpinner spinner = new MaterialProgressSpinner();
    public static JLabel loading  = new JLabel("Loading UI");



    private int i = 0;

    private Timer time = null;

    private Random r = new Random();




    Thread finalT;




    //////////////// LOCK COMPONENTS  /////////////////////////////////////////

    static MaterialButton access =  new MaterialButton();
        JLabel lockedLabel  = new JLabel("LOCKED");
     JLabel lockBehindPanel  =  new JLabel();

    //////////////////////////////////////////////////////////////////////////////////


    Action logout;


    public HolderPage() {


        new Move().move(f, topBar);



        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = y / 2;
        widthdiv = x / 2;




        f.setSize(1000, 590);
        f.setLayout(null);

        top.setLayout(null);
        content.setLayout(null);




       //content.add(new Admin());
        content.add(new Entry());
        //content.add(new Home());
       // content.add(new Quiz());
        //content.add(new SavedGame());



        spinner.setBounds(10,5,30,35);
        spinner.setForeground(MaterialColor.ORANGE_200);
        top.add(spinner);


        loading.setBounds(45,5,100,30);
        loading.setForeground(MaterialColor.ORANGE_200);
        loading.setFont(new Font("Calibri",1,15));
        top.add(loading);



        home.setBounds(350, 42, 30, 30);
        home.setIcon(new ImageIcon("img//home.png"));
        home.setRolloverIcon(new ImageIcon("img//homeR.png"));
        home.setToolTipText("Return to home");
        top.add(home);


        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JOptionPane pane = new JOptionPane("Are you really sure you want to exit?", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION);
                JDialog dialog2 = pane.createDialog(HolderPage.f, "Exit");
                dialog2.setVisible(true);

                String selectedValue = "";

                try {

                     selectedValue = pane.getValue().toString();
                }
                catch (java.lang.NullPointerException f){selectedValue = "2";}



                if (selectedValue.equals("0")) {


                    content.removeAll();

                    HolderPage.content.add(new Entry());
                    content.updateUI();


                } else if (selectedValue.equals("1")){

                    dialog2.setVisible(false);
                } else if (selectedValue.equals("2")){


                    dialog2.setVisible(false);
                }


            }
        });





        loclButton.setBounds(410, 42, 30, 30);
        loclButton.setIcon(new ImageIcon("img//lock.png"));
        loclButton.setRolloverIcon(new ImageIcon("img//lockR.png"));
        loclButton.setToolTipText("Lock QuizApp");
        top.add(loclButton);


        loclButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new Blocker();
               loclButton.setEnabled(false);
                home.setEnabled(false);
            }
        });






        close.setBounds(926, 5, 30, 30);
        close.setIcon(new ImageIcon("img//power.png"));
        close.setRolloverIcon(new ImageIcon("img//powerR.png"));
        top.add(close);




        minimize.setBounds(880, 5, 30, 30);
        minimize.setIcon(new ImageIcon("img//minimize.png"));
        minimize.setRolloverIcon(new ImageIcon("img//minimizeR.png"));
        top.add(minimize);

        minimize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                HolderPage.f.setState(Frame.ICONIFIED);
            }
        });

        topMenu.setBounds(825, 5, 30, 30);
        topMenu.setIcon(new ImageIcon("img//menu.png"));
        topMenu.setRolloverIcon(new ImageIcon("img//menuR.png"));
        top.add(topMenu);

        topMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                new TopMenu();

            }
        });


        topBar.setBounds(0, 0, 990, 40);
        topBar.setOpaque(true);
        topBar.setBackground(MaterialColor.BLUE_800);
        topBar.setForeground(MaterialColor.DARK_WHITE);
        topBar.setFont(new Font("Calibri", 1, 20));
        topBar.setHorizontalAlignment(SwingConstants.CENTER);
        top.add(topBar);


        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);

            }
        });


        breadCrumb.setBounds(40, 40, 400, 35);
        breadCrumb.setForeground(MaterialColor.WHITE);
        breadCrumb.setFont(new Font("Calibri", 1, 18));
        top.add(breadCrumb);


        date.setBounds(730, 40, 400, 35);
        date.setForeground(MaterialColor.WHITE);
        date.setFont(new Font("Calibri", 1, 18));
        top.add(date);


        java.util.Timer timer4 = new java.util.Timer();
        TimerTask myTask = new TimerTask() {
            @Override
            public void run() {


                dated = new java.util.Date();
                date.setText(dateFormat.format(dated));


            }
        };

        timer4.scheduleAtFixedRate(myTask, 0, 1000);


        yellowUp.setBounds(0, 40, 980, 35);
        yellowUp.setBackground(MaterialColor.ORANGE_400);
        yellowUp.setOpaque(true);
        top.add(yellowUp);









        top.setBounds(10,10,980,75);
        content.setBounds(10,86,980,515);


        time = new Timer(250, new MyTimer());
        time.start();



        f.add(content);
        f.add(top);
        f.setEnabled(true);
        f.setLocation(widthdiv - 500, heightdiv - 300);
        f.setVisible(true);
        f.setResizable(false);



         logout = new AbstractAction()
        {
            public void actionPerformed(ActionEvent e)
            {
              //  JFrame frame = (JFrame)e.getSource();

                new Blocker();
                loclButton.setEnabled(false);
            }
        };

        InactivityListener listener = new InactivityListener(f, logout, 1);
        listener.start();


    }





    private class MyTimer implements ActionListener{

        public void actionPerformed(ActionEvent evt){

            int k = r.nextInt(7);

            i = i + k;

            if(i < 20 ){

                    loading.setText("Loading UI");
            }
            else if (i > 20 && i < 50){

                loading.setText("Refreshing DB");

            }
            else if(i > 50 && i < 100){

                loading.setText("Finishing tasks");
            }

            else{


                time.stop();
                loading.setVisible(false);
               spinner.setVisible(false);

            }

        }

    }






     class Blocker
    {


        Blocker() {



            blocker.setLayout(null);
            blocker.setSize(980, 495);
            blocker.setAutoRequestFocus(false);
            blocker.setFocusable(false);
            blocker.setFocusableWindowState(false);
            blocker.getContentPane().setBackground(MaterialColor.WHITE);



            access.setBounds(420, 250, 150, 50);
            access.setBackground(MaterialColor.WHITE);
            access.setForeground(MaterialColor.BLUE_700);
            access.setText("Enter");
            blocker.getContentPane().add(access);

            access.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    loclButton.setEnabled(true);
                    home.setEnabled(true);
                    blocker.dispose();


                    InactivityListener listener = new InactivityListener(f, logout, 1);
                    listener.start();


//                    Connection c = null;
//
////                    try {
////                        Class.forName("org.sqlite.JDBC");
////                        c = DriverManager.getConnection("jdbc:sqlite:test.db");
////                    } catch (Exception f) {
////                        System.err.println(e.getClass().getName() + ": " + f.getMessage());
////                    }
////                    System.out.println("Opened database successfully");
////
////
//
//
//
//
//                    Statement stmt = null;
//
//                    try {
//                        Class.forName("org.sqlite.JDBC");
//                        c = DriverManager.getConnection("jdbc:sqlite:test.db");
//                        System.out.println("Opened database successfully");
//
//                        stmt = c.createStatement();
//                        String sql = "CREATE TABLE COMPANY " +
//                                "(ID INT PRIMARY KEY     NOT NULL," +
//                                " NAME           TEXT    NOT NULL, " +
//                                " AGE            INT     NOT NULL, " +
//                                " ADDRESS        CHAR(50), " +
//                                " SALARY         REAL)";
//                        stmt.executeUpdate(sql);
//                        stmt.close();
//                        c.close();
//                    } catch ( Exception g ) {
//                        System.err.println( g.getClass().getName() + ": " + g.getMessage() );
//                        System.exit(0);
//                    }
//                    System.out.println("Table created successfully");




                }
            });



            lockedLabel.setBounds(400,150,200,80);
            lockedLabel.setFont(new Font("Calibri", 1, 60));
            lockedLabel.setForeground(MaterialColor.WHITE);
            blocker.getContentPane().add(lockedLabel);


            lockBehindPanel.setBounds(300,100,400,250);
            lockBehindPanel.setBackground(MaterialColor.BLUE_700);
            lockBehindPanel.setOpaque(true);
            blocker.getContentPane().add(lockBehindPanel);





            int locationX = HolderPage.f.getX() + 10;
            int locationY =  HolderPage.f.getY()  +  85;


            blocker.setLocation(locationX, locationY);


            blocker.setVisible(true);


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
                new HolderPage();
            }
        });



    }

}

