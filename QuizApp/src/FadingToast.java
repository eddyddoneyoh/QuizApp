import MaterialDesign.MaterialColor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class FadingToast  {

    float alpha = 1.0f;

    //JTextArea label =  new JTextArea("Welcome to QuizApp! I'm trying to do just what I enjoy doing most times apart from eating! lol");
    JLabel label =  new JLabel("Welcome to QuizApp!");

    static Window wind =  new Window(HolderPage.f);

   // JDesktopPane wind =  new JDesktopPane();





    private int i = 0;
    private int i2 = 0;


    private Timer timeDelay = null;
    private Timer time = null;

    private Random r = new Random();

    JButton close =  new JButton();



    /** Creates a new instance of FadingButton */
    public FadingToast() {


        wind.setBounds(855,195,300,80);
        wind.setLayout(null);
        wind.setOpacity(1.0f);
        wind.setVisible(true);



        close.setBounds(265,3,33,33);
        close.setFont(new Font("Calibri", 0, 10));
       // close.setHorizontalAlignment(SwingConstants.CENTER);
        close.setBackground(MaterialColor.WHITE);
        close.setForeground(MaterialColor.RED_500);
        close.setText("X");
        wind.add(close);




        label.setBounds(0,0,300,80);
        label.setFont(new Font("Calibri",1 , 16));
        label.setOpaque(true);
        label.setBackground(MaterialColor.GREY_600);
        label.setForeground(MaterialColor.WHITE);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        wind.add(label);





        timeDelay = new Timer(200, new MyTimerDelay());
        timeDelay.start();


        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                try{

                    timeDelay.stop();
                    time.stop();
                    i = 0;
                    i2 = 0;
                    wind.setVisible(false);

                }
                catch (java.lang.NullPointerException f){

                    i = 0;
                    i2 = 0;
                    wind.setVisible(false);


                }






            }
        });


    }








    private class MyTimerDelay implements ActionListener {

        public void actionPerformed(ActionEvent evt){

            int k = r.nextInt(10);

            i = i + k;

            if(i < 70 ){

                alpha = 1.0f;
                wind.setOpacity(alpha);


            }

            else{



                timeDelay.stop();


                i = 0;

                time = new Timer(100, new MyTimer());
                time.start();


            }

        }


    }






    private class MyTimer implements ActionListener {

        public void actionPerformed(ActionEvent evt){

            int k = r.nextInt(10);

            i2 = i2 + k;

            if(i2 < 50 ){

                alpha = alpha * 0.5f;
                wind.setOpacity(alpha);


            }

            else{


                time.stop();

                i2 = 0;

                wind.setVisible(false);


            }

        }

    }



}