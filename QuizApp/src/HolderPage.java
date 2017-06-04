/**
 * Created by EdidiongEyo on 12/1/2016.
 */
/**
 * Created by EdidiongEyo on 11/5/2016.
 */
/**
 * Created by EdidiongEyo on 11/5/2016.
 */

import javax.swing.*;
import java.awt.*;


public class HolderPage  {


    public static MaterialWindow f = new MaterialWindow();
    //public static JFrame f =  new JFrame();
    public static JPanel content =  new JPanel();



    int x;
    int y;

    int heightdiv;
    int widthdiv;

    Image imaget = new ImageIcon("img/home.png").getImage();



    static public int holderPage_pageCount = 1;

    static public int welcomeToastCount = 0;



    public static MaterialBlocker blocker =  new MaterialBlocker(HolderPage.f);



    public HolderPage() {



        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = y / 2;
        widthdiv = x / 2;



        f.setSize(1000, 590);




        content.setLayout(new BorderLayout());

        content.add(new Admin());
       // content.add(new Entry());
        //content.add(new Home());
        //content.add(new Quiz());

       // new SaveDB();


        f.add(content);


        f.setEnabled(true);
        f.setLocation(widthdiv - 500, heightdiv - 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setResizable(false);


    }







    public  static class Blocker
    {


        int x1 = 0;
        int y1 = 0;
        int fx = 0;
        int fy = 0;


        JLabel tobBar =  new JLabel();

        JPanel pan = new JPanel();



        public Blocker() {



            blocker.setLayout(null);
            blocker.setSize(f.getWidth(), f.getHeight());
            blocker.setAutoRequestFocus(false);
            blocker.setFocusable(false);
            blocker.setFocusableWindowState(false);









            int locationX = HolderPage.f.getX() ;
            int locationY =  HolderPage.f.getY();



            //blocker.getContentPane().setBackground(Color.white);
            blocker.setVisible(true);

            //blocker.setLocation(0,0);
            //blocker.setLocationRelativeTo(f);
          blocker.setLocation(locationX  ,locationY );




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




        new HolderPage();

    }

}

