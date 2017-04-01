/**
 * Created by EdidiongEyo on 12/1/2016.
 */
/**
 * Created by EdidiongEyo on 11/5/2016.
 */
/**
 * Created by EdidiongEyo on 11/5/2016.
 */
import sun.swing.SwingUtilities2;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.RandomAccessFile;
import java.sql.*;


public class HolderPage  {


    public static JFrame f = new JFrame("");
    public static JPanel content =  new JPanel();


    int x;
    int y;

    int heightdiv;
    int widthdiv;

    Image imaget = new ImageIcon("img/home.png").getImage();

    public HolderPage() {



        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = (Integer) y / 2;
        widthdiv = (Integer) x / 2;

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

