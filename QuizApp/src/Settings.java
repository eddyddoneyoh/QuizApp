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

import MaterialDesign.MaterialButton;
import MaterialDesign.MaterialColor;
import MaterialDesign.MaterialWindow;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Settings extends JPanel {



    MaterialWindow frame =  new MaterialWindow();

    int x;
    int y;


    JLabel generalLabel =  new JLabel("General");
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
    JButton securityButtonDialog =  new JButton("Disabled");




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








    JPanel buttonsPanel = new JPanel();
    ////////////////////////////////  SLIDING PANEL BUTTONS  //////////////////////////////////////////////

    MaterialButton generalButton = new MaterialButton();
    MaterialButton contentButton = new MaterialButton();
    MaterialButton securityButton = new MaterialButton();
    MaterialButton syncButton = new MaterialButton();
    MaterialButton updateButton = new MaterialButton();


    //////////////////////////////////////////////////////////////////////////////////




    JPanel generalContent = new JPanel();
    JPanel contentContent = new JPanel();
    JPanel securityContent = new JPanel();
    JPanel syncContent = new JPanel();
    JPanel updateContent = new JPanel();




    public Settings() {




        new Move().move(frame,topBar);



        frame.setSize(800,500);


       setBounds(0,0, 800, 500);


        HolderPage.f.setEnabled(false);
        HolderPage.f.setFocusable(false);
        HolderPage.f.setFocusableWindowState(false);
        frame.requestFocus();

        checkEnableStatus(securityButtonDialog);







        home.setBounds(730,0, 50, 35);
        home.setFont(new Font("Calibri", 1, 19));
        home.setHorizontalAlignment(SwingConstants.CENTER);
        home.setBackground(MaterialColor.RED_400);
        home.setForeground(Color.white);
        add(home);


        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                HolderPage.f.setEnabled(true);
                HolderPage.f.setFocusable(true);
                HolderPage.f.setFocusableWindowState(true);
                HolderPage.f.requestFocus();
                frame.dispose();



            }
        });

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






        ////////buttons panel program begins/////////////////////////////////////////////////////////




        buttonsPanel.setBackground(MaterialColor.GREY_300);
        buttonsPanel.setBounds(0, 35, 199, 418);
        buttonsPanel.setLayout(null);
        add(buttonsPanel);



        generalButton.setBounds(0, 60, 199, 65);
        generalButton.setBackground(MaterialColor.ORANGE_700);
        generalButton.setHorizontalAlignment(SwingConstants.CENTER);
        generalButton.setForeground(Color.yellow);
        generalButton.setText("General");
        generalButton.setFont(new Font("Calibri", 1, 17));
        buttonsPanel.add(generalButton);


        generalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                generalButton.setForeground(Color.yellow);
                contentButton.setForeground(Color.white);
                securityButton.setForeground(Color.white);
                syncButton.setForeground(Color.white);
                updateButton.setForeground(Color.white);



//                HolderPage.breadCrumb.setText("Home > Admin Panel > Dashboard");
                remove(contentContent);
                remove(securityContent);
                remove(syncContent);
                remove(updateContent);
                add(generalContent);
                updateUI();
            }
        });



        contentButton.setBounds(0, 120, 199, 65);
        contentButton.setBackground(MaterialColor.ORANGE_700);
        contentButton.setHorizontalAlignment(SwingConstants.CENTER);
        contentButton.setFont(new Font("Calibri", 1, 17));
        contentButton.setForeground(Color.white);
        contentButton.setText("Content");
        buttonsPanel.add(contentButton);


        contentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                contentButton.setForeground(Color.yellow);
                generalButton.setForeground(Color.white);
                contentButton.setForeground(Color.white);
                securityButton.setForeground(Color.white);
                syncButton.setForeground(Color.white);
                updateButton.setForeground(Color.white);




//                HolderPage.breadCrumb.setText("Home > Admin Panel > History");
                remove(generalContent);
                remove(securityContent);
                remove(syncContent);
                remove(updateContent);
                add(contentContent);
//
//                comboBoxHistory();

                updateUI();
            }
        });


        securityButton.setBounds(0, 180, 199, 65);
        securityButton.setBackground(MaterialColor.ORANGE_700);
        securityButton.setHorizontalAlignment(SwingConstants.CENTER);
        securityButton.setFont(new Font("Calibri", 1, 17));
        securityButton.setForeground(Color.white);
        securityButton.setText("Security");
        buttonsPanel.add(securityButton);


        securityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                securityButton.setForeground(Color.yellow);
                generalButton.setForeground(Color.white);
                contentButton.setForeground(Color.white);
                syncButton.setForeground(Color.white);
                updateButton.setForeground(Color.white);


//                HolderPage.breadCrumb.setText("Home > Admin Panel > Import DB");
                remove(generalContent);
                remove(contentContent);
                remove(syncContent);
                remove(updateContent);
                add(securityContent);

                updateUI();
            }
        });


        syncButton.setBounds(0, 240, 199, 65);
        syncButton.setBackground(MaterialColor.ORANGE_700);
        syncButton.setHorizontalAlignment(SwingConstants.CENTER);
        syncButton.setFont(new Font("Calibri", 1, 17));
        syncButton.setForeground(Color.white);
        syncButton.setText("Sync");
        buttonsPanel.add(syncButton);

        syncButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                syncButton.setForeground(Color.yellow);
                generalButton.setForeground(Color.white);
                contentContent.setForeground(Color.white);
                securityContent.setForeground(Color.white);
                updateButton.setForeground(Color.white);

//
//                HolderPage.breadCrumb.setText("Home > Admin Panel > Account");
                remove(generalContent);
                remove(contentContent);
                remove(securityContent);
                remove(updateContent);
                add(syncContent);
                updateUI();


            }
        });

        updateButton.setBounds(0, 300, 199, 65);
        updateButton.setBackground(MaterialColor.ORANGE_700);
        updateButton.setHorizontalAlignment(SwingConstants.CENTER);
        updateButton.setFont(new Font("Calibri", 1, 17));
        updateButton.setForeground(Color.white);
        updateButton.setText("Update");
        buttonsPanel.add(updateButton);


        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                updateButton.setForeground(Color.yellow);
                generalButton.setForeground(Color.white);
                contentButton.setForeground(Color.white);
                securityButton.setForeground(Color.white);
                syncButton.setForeground(Color.white);


                remove(generalContent);
                remove(contentContent);
                remove(securityContent);
                remove(syncContent);
                add(updateContent);
                updateUI();


            }
            });

        ////////buttons panel program ends/////////////////////////////////////////////////////////




        generalContent.setLayout(null);
        generalContent.setBounds(200,35,600,418);
        generalContent.setBackground(MaterialColor.WHITE);
        add(generalContent);

        contentContent.setLayout(null);
        contentContent.setBounds(200,35,600,418);
        contentContent.setBackground(MaterialColor.WHITE);

        securityContent.setLayout(null);
        securityContent.setBounds(200,35,600,418);
        securityContent.setBackground(MaterialColor.WHITE);

        syncContent.setLayout(null);
        syncContent.setBounds(200,35,600,418);
        syncContent.setBackground(MaterialColor.WHITE);

        updateContent.setLayout(null);
        updateContent.setBounds(200,35,600,418);
        updateContent.setBackground(MaterialColor.WHITE);





        shutdown.setBounds(30, 65, 200, 40);
        shutdown.setFont(new Font("Calibri", 0, 17));
        generalContent.add(shutdown);



        comboFontType.addItem("Calibri");
        comboFontType.addItem("Arial");
        comboFontType.addItem("Times Roman");


        comboFontType.setBounds(185,170,150,25);
       // fontContent.add(comboFontType);

                    //---------------

        prefFontSize.setBounds(30, 205, 170, 40);
        prefFontSize.setFont(new Font("Calibri", 0, 17));
       // fontContent.add(prefFontSize);


        comboFontSize.addItem("Small");
        comboFontSize.addItem("Medium");
        comboFontSize.addItem("Large");


        comboFontSize.setBounds(185,210,150,25);
        //fontContent.add(comboFontSize);


                    //---------------

        prefTheme.setBounds(30, 245, 170, 40);
        prefTheme.setFont(new Font("Calibri", 0, 17));
       // fontContent.add(prefTheme);



        comboTheme.addItem("Default");
        comboTheme.addItem("Dark");
        comboTheme.addItem("Venus");


        comboTheme.setBounds(185,250,150,25);
       // fontContent.add(comboTheme);




        //---------------------------------------------------------------------------------------


        sync.setBounds(30,20,500,30);
        sync.setFont(new Font("Calibri", 1, 19));
        sync.setBackground(new Color(233, 233, 233));
        sync.setOpaque(true);
        syncContent.add(sync);


        syncCheckBox.setBounds(30, 60, 200, 40);
        syncCheckBox.setFont(new Font("Calibri", 0, 17));
        syncContent.add(syncCheckBox);


        //----------------------------------------------------------------------------------------


        security.setBounds(30,420,500,30);
        security.setFont(new Font("Calibri", 1, 19));
        security.setBackground(new Color(233, 233, 233));
        security.setOpaque(true);
        generalContent.add(security);


        securityLabel.setBounds(30, 470, 140, 30);
        securityLabel.setFont(new Font("Calibri", 0, 17));
        generalContent.add(securityLabel);

        securityButton.setBounds(185, 470, 100,30);
        securityButton.setFont(new Font("Calibri", 0, 15));
        generalContent.add(securityButton);

        securityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


              new Security(securityButtonDialog) ;



            }
        });






        restore.setBounds(150,650,150,30);
        restore.setFont(new Font("Calibri", 1, 15));
        restore.setHorizontalAlignment(SwingConstants.CENTER);
        generalContent.add(restore);

        saveButton.setBounds(310,650, 100, 30);
        saveButton.setFont(new Font("Calibri", 1, 15));
        saveButton.setHorizontalAlignment(SwingConstants.CENTER);
        saveButton.setBackground(new Color(6, 125, 248));
        saveButton.setForeground(Color.white);
        generalContent.add(saveButton);

        cancelButton.setBounds(420, 650, 100, 30);
        cancelButton.setFont(new Font("Calibri", 1, 15));
        cancelButton.setHorizontalAlignment(SwingConstants.CENTER);
        generalContent.add(cancelButton);


        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    public void run() {


                        HolderPage.content.removeAll();

                        HolderPage.content.add(new Entry());


                    }
                });


            }
        });









        generalContent.setBackground(Color.white);





        setBackground(Color.white);
        setLayout(null);


        frame.setLocationRelativeTo(HolderPage.f);


        frame.add(this);

        frame.setVisible(true);
        frame.setResizable(false);


    }






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


            if(enableCheckBoxStatus == true){



                try{


                    WriteFile data = new WriteFile("DB/Accounts/LoginTest", false);

                    data.writeToFile("true");

                }
                catch (Exception e) { e.printStackTrace();

                }

            }else{


                try{


                    WriteFile data = new WriteFile("DB/Accounts/LoginTest", false);

                    data.writeToFile("false");

                }
                catch (Exception e) { e.printStackTrace();

                }


            }

        }










    public static void checkEnableStatus(JButton button){



        try {

            RandomAccessFile configMain = new RandomAccessFile("DB/Accounts/LoginTest", "r");
            String quizdb = configMain.readLine();
            configMain.close();


            if (quizdb.equals("true")) {

                button.setText("Enabled");


            } else if(quizdb.equals("false")) {

                button.setText("Disabled");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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


