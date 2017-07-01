import MaterialDesign.MaterialColor;
import MaterialDesign.MaterialDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.net.URI;




public class TopMenu extends JPanel{




    MaterialDialog dlog2 =  new MaterialDialog();


    JTextField selected =  new JTextField();

    JPanel pan = new JPanel();

    JButton settings =  new JButton();
    JButton feedback =  new JButton();
    JButton about =  new JButton();
    JButton help =  new JButton();
    JButton update =  new JButton();


    Thread finalT2;



    public TopMenu() {





        dlog2.addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent e) {

            }

            @Override
            public void windowLostFocus(WindowEvent e) {

                //System.out.println("true");
                dlog2.dispose();
            }
        });








        dlog2.setLayout(null);
        dlog2.setSize(160, 165);

        setBackground(MaterialColor.WHITE);
        setBounds(0,0,dlog2.getWidth(),dlog2.getHeight());
        setLayout(null);
        dlog2.add(this);




        settings.setBounds(0,0,dlog2.getWidth(),32);
        settings.setBackground(MaterialColor.WHITE);
        //settings.setFocusPainted(false);
        settings.setText("Settings");
        settings.setFont(new Font("Calibri",0,16));
        settings.setHorizontalAlignment(SwingConstants.LEFT);
        settings.setIcon(new ImageIcon("img//settings.png"));
       // settings.setContentAreaFilled(false);
        this.add(settings);



        settings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                        dlog2.dispose();


                        finalT2 = new Thread(new Runnable() {
                            @Override
                            public void run() {

                              HolderPage.f.setEnabled(false);

                                new Settings();

                                finalT2.stop();

                            }
                        });
                        finalT2.start();



            }
        });



        help.setBounds(0,33,dlog2.getWidth(),32);
        help.setBackground(MaterialColor.WHITE);
        help.setText("Help");
        help.setFont(new Font("Calibri",0,16));
        help.setHorizontalAlignment(SwingConstants.LEFT);
        help.setIcon(new ImageIcon("img//helpTM.png"));
        this.add(help);



        help.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    public void run() {


                        dlog2.dispose();
                        new Help();


                    }
                });

            }
        });



        feedback.setBounds(0,65,dlog2.getWidth(),32);
        feedback.setBackground(MaterialColor.WHITE);
        feedback.setText("Feedback");
        feedback.setFont(new Font("Calibri",0,16));
        feedback.setHorizontalAlignment(SwingConstants.LEFT);
        feedback.setIcon(new ImageIcon("img//message.png"));
        this.add(feedback);

        feedback.addActionListener(

                new ActionListener(){

                    public void actionPerformed(ActionEvent e){

                        dlog2.dispose();

                        String url = new String("www.google.com/feedback");

                        if(Desktop.isDesktopSupported()){

                            try{

                                Desktop.getDesktop().browse(new URI(url));

                            }catch(Exception f){f.printStackTrace();}


                        }
                        else{


                            try{

                                Runtime runtime = Runtime.getRuntime();
                                runtime.exec("/usr/bin/firefox -new-window " + url);


                            }catch(Exception f){f.printStackTrace();}

                        }


                    }


                }

        );


        update.setBounds(0,98,dlog2.getWidth(),32);
        update.setBackground(MaterialColor.WHITE);
        update.setText("Update");
        update.setFont(new Font("Calibri",0,16));
        update.setHorizontalAlignment(SwingConstants.LEFT);
        update.setIcon(new ImageIcon("img//update.png"));
        this.add(update);


        update.addActionListener(

                new ActionListener(){

                    public void actionPerformed(ActionEvent e){

                        String url = new String("www.google.com/update");

                        if(Desktop.isDesktopSupported()){

                            try{

                                Desktop.getDesktop().browse(new URI(url));

                            }catch(Exception f){f.printStackTrace();}


                        }
                        else{


                            try{

                                Runtime runtime = Runtime.getRuntime();
                                runtime.exec("/usr/bin/firefox -new-window " + url);


                            }catch(Exception f){f.printStackTrace();}

                        }


                    }


                }

        );




        about.setBounds(0,131,dlog2.getWidth(),32);
        about.setBackground(MaterialColor.WHITE);
        about.setText("About");
        about.setFont(new Font("Calibri",0,16));
        about.setHorizontalAlignment(SwingConstants.LEFT);
        about.setIcon(new ImageIcon("img//aboutTM.png"));
        this.add(about);



        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    public void run() {

                        dlog2.dispose();
                        new About();


                    }
                });

            }
        });




        int locationX = HolderPage.f.getX()  + 770;
        int locationY =  HolderPage.f.getY()  +  50;


        //dlog2.getContentPane().setBackground(MaterialColor.GREY_200);

       //dlog2.setLocationRelativeTo(HolderPage.f);
        dlog2.setLocation(locationX,locationY);
        dlog2.setVisible(true);

        //dlog2.setAlwaysOnTop(true);



    }



    public void paint(Graphics g) {

        super.paint(g);


        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.BLACK);


        //g2.fillPolygon(new int[]{75 , 80,  85}, new int[]{ 13,  -10,  13}, 3);
    }













}





