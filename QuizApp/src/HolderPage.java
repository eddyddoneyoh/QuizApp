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


    public static JFrame f = new JFrame("");
    public static JPanel content =  new JPanel();


    int x;
    int y;

    int heightdiv;
    int widthdiv;

    Image imaget = new ImageIcon("img/home.png").getImage();



    static public int holderPage_pageCount = 1;


    public HolderPage() {



        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = y / 2;
        widthdiv = x / 2;

        content.setLayout(new BorderLayout());

        //content.add(new Admin());
        content.add(new Entry());
        //content.add(new Home());

        f.add(content);

        f.setSize(1000, 600);
        f.setEnabled(true);
        f.setLocation(widthdiv - 500, heightdiv - 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setResizable(false);


    }


//
//
//
//    public static void menuAdjuster(){
//
//
//
//        if(holderPage_pageCount == 1){
//
//            Entry.previousHidden.setVisible(false);
//            Entry.previous.setEnabled(true);
//            Entry.previous.setVisible(true);
//            Entry.next.setVisible(false);
//
//
//
//
//            Entry.newQuiz.setEnabled(true);
//            Entry.resume.setEnabled(true);
//            Entry.login.setEnabled(true);
//            Entry.settings.setEnabled(false);
//            Entry.help.setEnabled(false);
//            Entry.about.setEnabled(true);
//
//
//
//
//        }
//
//        if(holderPage_pageCount == 2){
//
//            Entry.previousHidden.setVisible(false);
//            Entry.previous.setEnabled(true);
//            Entry.previous.setVisible(true);
//            Entry.next.setVisible(true);
//
//
//
//            Entry.newQuiz.setEnabled(false);
//            Entry.resume.setEnabled(true);
//            Entry.login.setEnabled(true);
//            Entry.settings.setEnabled(true);
//            Entry.help.setEnabled(false);
//            Entry.about.setEnabled(false);
//
//        }
//
//
//
//        if(holderPage_pageCount == 3){
//
//            Entry.previousHidden.setVisible(false);
//            Entry.previous.setEnabled(true);
//            Entry.previous.setVisible(true);
//            Entry.next.setVisible(true);
//
//
//            Entry.newQuiz.setEnabled(false);
//            Entry.resume.setEnabled(false);
//            Entry.login.setEnabled(true);
//            Entry.settings.setEnabled(true);
//            Entry.help.setEnabled(true);
//            Entry.about.setEnabled(false);
//
//
//
//
//
//        }
//
//
//        if(holderPage_pageCount == 4){
//
//
//            System.out.println("Holder Page count  =  "  + holderPage_pageCount);
//
//
//            Entry.menuPanel.setLocation(590 , 200);
//            HolderPage.content.updateUI();
//
//            Entry.previousHidden.setVisible(true);
//            Entry.previous.setVisible(false);
//            Entry.next.setEnabled(true);
//            Entry.next.setVisible(true);
//
//
//
//            Entry.newQuiz.setEnabled(false);
//            Entry.resume.setEnabled(false);
//            Entry.login.setEnabled(false);
//            Entry.settings.setEnabled(true);
//            Entry.help.setEnabled(true);
//            Entry.about.setEnabled(true);
//
//
//
//        }
//
//
//
//
//
//    }
//

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

