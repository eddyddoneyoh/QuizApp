
import MaterialDesign.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class About extends JPanel{




    MaterialWindow frame =  new MaterialWindow();

    JButton home =  new JButton("X");
     JLabel aboutPix = new JLabel();


    public About() {






        new Move().move(frame,aboutPix);





        frame.setSize(415,328);
        frame.add(this);



        setBounds(0,0, 415, 328);



        home.setBounds(355,5, 35, 30);
        home.setFont(new Font("Calibri", 1, 13));
        home.setBackground(MaterialColor.RED_400);
        home.setForeground(Color.white);
        add(home);



        aboutPix.setBounds(0,0,415,328);
        aboutPix.setIcon(new ImageIcon("img//aboutPix.png"));
        aboutPix.setOpaque(true);
        add(aboutPix);



        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    public void run() {



                        frame.dispose();


                    }
                });


            }
        });





        setBackground(Color.white);
        setLayout(null);



        int locationX = HolderPage.f.getX()  + 300;
        int locationY =  HolderPage.f.getY()  +  150;

        frame.setLocation(locationX, locationY);
        //frame.setLocationRelativeTo(HolderPage.f);



        frame.setVisible(true);
        frame.setResizable(false);



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
                new About();
            }
        });



    }

}


