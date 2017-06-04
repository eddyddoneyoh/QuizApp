/**
 * Created by EdidiongEyo on 11/17/2016.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Splash extends JPanel{

    MaterialProgressSpinner spinner = new MaterialProgressSpinner();

    MaterialWindow f = new MaterialWindow();

    private int i = 0;



    private JProgressBar bar = new JProgressBar(0,100);

    private Timer time = null;

    private Random r = new Random();


    private Image imaget = new ImageIcon("img/logo.png").getImage();


    int x ;
    int y ;

    int heightdiv;
    int widthdiv;


    public Splash(){



        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = y /2;
        widthdiv = x /2;




        spinner.setBounds(250,335,30,30);
        spinner.setForeground(MaterialColor.ORANGE_900);
        add(spinner);

        bar.setBounds(0,375,550,3);
        bar.setValue(i);
        bar.setStringPainted(true);

        bar.setBackground(new Color(5, 168, 39));

        bar.setBorder(BorderFactory.createLineBorder(Color.white,0));
       add(bar);


        time = new Timer(300, new MyTimer());
        time.start();







        setLayout(null);


        f.add(this);

        f.setSize(550,430);
        f.setLocation(	widthdiv - 250, heightdiv - 200);

        //f.setUndecorated(true);
        f.setVisible(true);
       // f.setDefaultCloseOperation(3);



    }





    public void paintComponent(Graphics g){

        super.paintComponent(g);

        g.drawImage(imaget, 0, 0,550,416,this);





    }



    private class MyTimer implements ActionListener{

        public void actionPerformed(ActionEvent evt){

            int k = r.nextInt(100);

            i = i + k;

            if(i < 100 ){

                bar.setValue(i);


            }

            else{


                time.stop();
                bar.setVisible(false);
                f.dispose();
                new HolderPage();
                //HolderPage.f.setTitle("QuizApp 2016 - Welcome!");



            }




        }





    }





    public static void main(String args[]){




//         	try{
//
//         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//
//
//         }
//         	catch(Exception e){e.printStackTrace();}




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




        new Splash();

    }

}
