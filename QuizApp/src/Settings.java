/**
 * Created by EdidiongEyo on 1/12/2017.
 */
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
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Settings extends JPanel {



    MaterialWindow frame =  new MaterialWindow();

   // MaterialDialog frame = new MaterialDialog();


    int x;
    int y;

    int heightdiv;
    int widthdiv;



   // JPanel


    JPanel settingsPanel =  new JPanel();
    JScrollPane scrollPane =  new JScrollPane(settingsPanel);



    JLabel divider1 =  new JLabel("_________________________________________________________________");
    JLabel divider2 =  new JLabel("_________________________________________________________________");
    JLabel divider3 =  new JLabel("_________________________________________________________________");
    JLabel divider4 =  new JLabel("_________________________________________________________________");



    JLabel general =  new JLabel("General");
    JLabel fontType = new JLabel("Font");
    JLabel security =  new JLabel("Security");
    JLabel sync =  new JLabel("Sync");



    JCheckBox shutdown =  new JCheckBox("Confirm application exit");
    JCheckBox syncCheckBox = new JCheckBox("Save game automatically");


    JLabel prefFontType = new JLabel("Preferred Font Type:");
    JComboBox comboFontType  =  new JComboBox();
    JLabel prefFontSize =  new JLabel("Preferred Font Size:");
    JComboBox comboFontSize = new JComboBox();
    JLabel prefTheme =  new JLabel("Preferred Theme:");
    JComboBox comboTheme =  new JComboBox();


    JLabel securityLabel =  new JLabel("Set security status:");
    JButton securityButton =  new JButton("Disabled");




    Image imaget = new ImageIcon("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\img\\bg.png").getImage();





    JButton restore = new JButton("Restore Default");
    JButton saveButton =  new JButton("Save");
    JButton cancelButton =  new JButton("Cancel");



    JButton home =  new JButton("X");






    ////////////////////////////////////////////////////////


    Boolean enableCheckBoxStatus = null;




    ///////////////////////////////////////////////////////



    JLabel downBar = new JLabel();
    JLabel topBar =  new JLabel();




    int x1 = 0;
    int y1 = 0;
    int fx = 0;
    int fy = 0;




    public Settings() {




        new Move().move(frame,topBar);





        frame.setSize(800,500);
        frame.add(this);



        setBounds(0,0, frame.getWidth(), frame.getHeight());



        // frame.setEnabled(true);





        //HolderPage.blocker.setVisible(true);
        //HolderPage.f.setFocusable(false);



        checkEnableStatus(securityButton);


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = y / 2;
        widthdiv = x / 2;


        settingsPanel.setLayout(null);
        settingsPanel.setPreferredSize(new Dimension(550, 750));


        //---------------------------------------------------------------------------------------

        general.setBounds(30,30,500,30);
        general.setFont(new Font("Calibri", 1, 19));
        general.setBackground(new Color(233, 233, 233));
        general.setOpaque(true);
        settingsPanel.add(general);


        shutdown.setBounds(30, 65, 200, 40);
        shutdown.setFont(new Font("Calibri", 0, 17));
        settingsPanel.add(shutdown);

        divider1.setBounds(30,100,500,15);
        settingsPanel.add(divider1);

        //---------------------------------------------------------------------------------------


        fontType.setBounds(30,125,500,30);
        fontType.setFont(new Font("Calibri", 1, 19));
        fontType.setBackground(new Color(233, 233, 233));
        fontType.setOpaque(true);
        settingsPanel.add(fontType);


        prefFontType.setBounds(30, 165, 170, 40);
        prefFontType.setFont(new Font("Calibri", 0, 17));
        settingsPanel.add(prefFontType);


        comboFontType.addItem("Calibri");
        comboFontType.addItem("Arial");
        comboFontType.addItem("Times Roman");


        comboFontType.setBounds(185,170,150,25);
        settingsPanel.add(comboFontType);

                    //---------------

        prefFontSize.setBounds(30, 205, 170, 40);
        prefFontSize.setFont(new Font("Calibri", 0, 17));
        settingsPanel.add(prefFontSize);


        comboFontSize.addItem("Small");
        comboFontSize.addItem("Medium");
        comboFontSize.addItem("Large");


        comboFontSize.setBounds(185,210,150,25);
        settingsPanel.add(comboFontSize);


                    //---------------

        prefTheme.setBounds(30, 245, 170, 40);
        prefTheme.setFont(new Font("Calibri", 0, 17));
        settingsPanel.add(prefTheme);



        comboTheme.addItem("Default");
        comboTheme.addItem("Dark");
        comboTheme.addItem("Venus");


        comboTheme.setBounds(185,250,150,25);
        settingsPanel.add(comboTheme);


        divider2.setBounds(30,285,500,15);
        settingsPanel.add(divider2);


        //---------------------------------------------------------------------------------------


        sync.setBounds(30,310,500,30);
        sync.setFont(new Font("Calibri", 1, 19));
        sync.setBackground(new Color(233, 233, 233));
        sync.setOpaque(true);
        settingsPanel.add(sync);


        syncCheckBox.setBounds(30, 350, 200, 40);
        syncCheckBox.setFont(new Font("Calibri", 0, 17));
        settingsPanel.add(syncCheckBox);

        divider3.setBounds(30,390,500,15);
        settingsPanel.add(divider3);


        //----------------------------------------------------------------------------------------


        security.setBounds(30,420,500,30);
        security.setFont(new Font("Calibri", 1, 19));
        security.setBackground(new Color(233, 233, 233));
        security.setOpaque(true);
        settingsPanel.add(security);


        securityLabel.setBounds(30, 470, 140, 30);
        securityLabel.setFont(new Font("Calibri", 0, 17));
        settingsPanel.add(securityLabel);

        securityButton.setBounds(185, 470, 100,30);
        securityButton.setFont(new Font("Calibri", 0, 15));
        settingsPanel.add(securityButton);

        securityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


               new Security(securityButton) ;



            }
        });


        divider4.setBounds(30,500,500,15);
        settingsPanel.add(divider4);





        restore.setBounds(150,650,150,30);
        restore.setFont(new Font("Calibri", 1, 15));
        restore.setHorizontalAlignment(SwingConstants.CENTER);
        settingsPanel.add(restore);

        saveButton.setBounds(310,650, 100, 30);
        saveButton.setFont(new Font("Calibri", 1, 15));
        saveButton.setHorizontalAlignment(SwingConstants.CENTER);
        saveButton.setBackground(new Color(6, 125, 248));
        saveButton.setForeground(Color.white);
        settingsPanel.add(saveButton);

        cancelButton.setBounds(420, 650, 100, 30);
        cancelButton.setFont(new Font("Calibri", 1, 15));
        cancelButton.setHorizontalAlignment(SwingConstants.CENTER);
        settingsPanel.add(cancelButton);


        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    public void run() {


                        HolderPage.content.removeAll();

                        HolderPage.content.add(new Entry());

                        HolderPage.content.updateUI();

                        HolderPage.f.setTitle("QuizApp 2016 - Home");



                    }
                });


            }
        });




        home.setBounds(730,0, 50, 35);
        home.setFont(new Font("Calibri", 1, 19));
        home.setHorizontalAlignment(SwingConstants.CENTER);
        home.setBackground(MaterialColor.RED_400);
        home.setForeground(Color.white);
        add(home);


        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    public void run() {



                        frame.dispose();
                       // HolderPage.blocker.dispose();
                       // HolderPage.blocker.setVisible(false);

                        HolderPage.blocker.dispose();
                        HolderPage.f.setFocusable(true);




                    }
                });


            }
        });




        settingsPanel.setBackground(Color.white);






        scrollPane.setBounds(90,50,600,380);
        scrollPane.setAutoscrolls(true);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.getViewport().putClientProperty("EnableWindowBlit", Boolean.TRUE);
        scrollPane.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
       // scrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.gray,2, true),"Settings"));
        scrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(200, 200, 200),3,true),"", 2,2,new Font("Calibri",1,20),Color.black));
        scrollPane.getVerticalScrollBar().setUI(new MyScrollBarUI());
        add(scrollPane);





        topBar.setBounds(0,0, frame.getWidth(), 35);
        topBar.setBackground(MaterialColor.BLUE_700);
        topBar.setForeground(MaterialColor.WHITE);
        topBar.setFont(new Font("Calibri",1,15));
        topBar.setText("       Settings");
        topBar.setOpaque(true);
        add(topBar);





        downBar.setBounds(0,450, frame.getWidth(), 40);
        downBar.setBackground(new Color(233, 233, 233));
        downBar.setOpaque(true);
        add(downBar);




        setBackground(Color.white);
        setLayout(null);



        int locationX = HolderPage.f.getX()  + 100;
        int locationY =  HolderPage.f.getY()  +  50;

       // frame.setLocation(locationX, locationY);
        frame.setLocationRelativeTo(HolderPage.f);



        frame.setVisible(true);
        frame.setResizable(false);


    }




//
//
//    public void paintComponent(Graphics g){
//
//        super.paintComponent(g);
//
//
//
//       // g.setFont(new Font("Calibri (Body)", 1, 11));
//
//
//
//       // g.drawImage(imaget, 0, 0,1000,570,this);
//
//
//
//    }










    public class Security
    {

         JDialog dlog = new JDialog();

        JCheckBox enable = new JCheckBox("Enable Pin Code");

        JPasswordField pass1 = new JPasswordField();
        JPasswordField pass2 = new JPasswordField();

        JLabel question = new JLabel("Security Question");
        JComboBox questions =  new JComboBox();
        JTextField answer = new JTextField("Your answer");

        JButton cancel =  new JButton("Cancel");
        JButton save =  new JButton("Save");

        JLabel downbar =  new JLabel();



        public Security(JButton b) {


            dlog.setLayout(null);


            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();


            dlog.setTitle("Security");





            if(b.getText().equals("Enabled")){

                enable.setSelected(true);
                enableCheckBoxStatus = true;

                pass1.setEnabled(true);
                pass2.setEnabled(true);
                questions.setEnabled(true);
                answer.setEnabled(true);


            }



            if(b.getText().equals("Disabled")){

                enable.setSelected(false);

                enableCheckBoxStatus = false;

                pass1.setEnabled(false);
                pass2.setEnabled(false);
                questions.setEnabled(false);
                answer.setEnabled(false);



            }



            enable.setBounds(20,20,150,40);
            dlog.add(enable);

            enable.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if(enable.isSelected()){

                        enableCheckBoxStatus = true;

                        pass1.setEnabled(true);
                        pass2.setEnabled(true);
                        questions.setEnabled(true);
                        answer.setEnabled(true);




                    }else{


                        enableCheckBoxStatus = false;

                        pass1.setEnabled(false);
                        pass2.setEnabled(false);
                        questions.setEnabled(false);
                        answer.setEnabled(false);



                    }


                }
            });




            pass1.setBounds(20,70,150,30);
            //pass1.setEnabled(false);
           dlog.add(pass1);

            pass2.setBounds(20,110,150,30);
            // pass2.setEnabled(false);
            dlog.add(pass2);

            question.setBounds(20,150,150,30);
            dlog.add(question);

            questions.setBounds(20,190, 150, 30);
            // questions.setEnabled(false);
            dlog.add(questions);

            questions.addItem("What is your name?");
            questions.addItem("What is your age?");

            answer.setBounds(20,230, 150,30);
            //answer.setEnabled(false);
            dlog.add(answer);

            cancel.setBounds(20,270, 80,30);
            //cancel.setBackground(new Color(6, 125, 248));
            //cancel.setFont(new Font("Calibri", 1, ));
            dlog.add(cancel);


            cancel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    dlog.setVisible(false);
                }
            });

            save.setBounds(110,270, 80,30);
            save.setBackground(new Color(6, 125, 248));
            save.setForeground(Color.white);
            dlog.add(save);


            save.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {


                    loginSetup();
                    checkEnableStatus(securityButton);

                    dlog.setVisible(false);






                }
            });






            downbar.setBounds(0,270, 350, 70);
            downbar.setBackground(new Color(233, 233, 233));
            downbar.setOpaque(true);
            //dlog.add(downbar);



            dlog.setLayout(null);
            dlog.setSize(300,370);
            dlog.setLocationRelativeTo(HolderPage.f);
            dlog.setVisible(true);
            dlog.setAlwaysOnTop(true);


                    }



        }









        public void loginSetup(){


        PreparedStatement  ps = null;
        Connection conn = null;




        try{

        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");


            ps = conn.prepareStatement("DELETE FROM LoginStatus WHERE Key = 'key'");
            ps.execute();



              ps = conn.prepareStatement ("INSERT INTO LoginStatus (Key, Status ) "+ "VALUES (?, ?)");



            if(enableCheckBoxStatus == true){



                ps.setString (1, "key");
                ps.setString (2, "true");
                ps.execute();


                //  Settings.securityButton.setText("Enabled");


            }else{


                ps.setString (1, "key");
                ps.setString (2, "false");
                ps.execute();
               // Settings.securityButton.setText("Disabled");

                // loginSetup();



            }





    }
	catch(NullPointerException Nullexcept){ JOptionPane.showMessageDialog(null,"Please insert all fields");}



        catch ( SQLException sqlException )
    {
        sqlException.printStackTrace();



    }
        catch ( ClassNotFoundException classNotFound )
    {
        classNotFound.printStackTrace();

    }
        finally
    {
        try
        {
            ps.close();
            conn.close();
        }
        catch ( Exception exception )
        {
            exception.printStackTrace();

        }
    }





}










    public static void checkEnableStatus(JButton button){


        try {


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");

            Statement st = conn.createStatement();
            //ResultSet rec = st.executeQuery("SELECT username, password FROM Login");
            ResultSet rec = st.executeQuery("SELECT Status FROM LoginStatus");
            boolean isExist = false;

            while (rec.next()) {



                //String status = rec.getString("Status") + "";
                String status = "true";
                String statusf = "false";

                if(status.equals(rec.getString("Status"))){

                   //securityButton.setText("Enabled");
                    button.setText("Enabled");
                }
                else{


                    //securityButton.setText("Disabled");
                    button.setText("Disabled");
                }

//                    HolderPage.f.setEnabled(true);
//
//                    HolderPage.content.removeAll();
//
//                    HolderPage.content.add(new Admin());


                   // HolderPage.content.updateUI();



                }



            st.close();
            conn.close();
        } catch (SQLException d) {
            d.printStackTrace();
        } catch (ClassNotFoundException f) {
            f.printStackTrace();
        }


    }









    class MyScrollBarUI extends BasicScrollBarUI {
        private final Dimension d = new Dimension();

        @Override
        protected JButton createDecreaseButton(int orientation) {
            return new JButton() {
                @Override
                public Dimension getPreferredSize() {
                    return d;
                }
            };
        }

        @Override
        protected JButton createIncreaseButton(int orientation) {
            return new JButton() {
                @Override
                public Dimension getPreferredSize() {
                    return d;
                }
            };
        }

        @Override
        protected void paintTrack(Graphics g, JComponent c, Rectangle r) {
        }

        @Override
        protected void paintThumb(Graphics g, JComponent c, Rectangle r) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            Color color = null;
            JScrollBar sb = (JScrollBar) c;
            if (!sb.isEnabled() || r.width > r.height) {
                return;
            } else if (isDragging) {
                color = MaterialColor.GREY_500;
            } else if (isThumbRollover()) {
                color = MaterialColor.GREY_500;
            } else {
                color = Color.LIGHT_GRAY;
            }
            g2.setPaint(color);
            // g2.fillRoundRect(r.x, r.y, r.width, r.height, 10, 10);
            g2.fillRect(r.x, r.y, r.width, r.height);
            g2.setPaint(Color.WHITE);
            // g2.drawRoundRect(r.x, r.y, r.width, r.height, 10, 10);
            g2.dispose();
        }

        @Override
        protected void setThumbBounds(int x, int y, int width, int height) {
            super.setThumbBounds(x, y, width, height);
            scrollbar.repaint();
        }
    }











    class Move{


        public void move(final Component frame, JLabel l){




            l.addMouseListener(


                    new MouseAdapter(){


                        public void mousePressed(MouseEvent t){


                            x1 = t.getX();
                            y1 = t.getY();



                        }


                    });




            l.addMouseMotionListener(


                    new MouseMotionAdapter(){



                        public void mouseDragged(MouseEvent evt){


                            fx = evt.getXOnScreen() - x1;

                            fy = evt.getYOnScreen() - y1;


                            frame.setLocation(fx,fy);



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
        catch(Exception e){}



        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {


                new Settings();
            }
        });



    }

}


