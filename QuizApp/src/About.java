/**
 * Created by EdidiongEyo on 1/12/2017.
 */
/**
 * Created by EdidiongEyo on 1/12/2017.
 */
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
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;




public class About extends JPanel {





    int x;
    int y;

    int heightdiv;
    int widthdiv;






    Image imaget = new ImageIcon("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\img\\bg.png").getImage();







    JButton home =  new JButton("Home");





    private JEditorPane htmlPane;
    private JTree tree;
    private URL helpURL;
    private static boolean DEBUG = false;

    //Optionally play with line styles.  Possible values are
    //"Angled" (the default), "Horizontal", and "None".
    private static boolean playWithLineStyle = false;
    private static String lineStyle = "Horizontal";

    //Optionally set the look and feel.
    private static boolean useSystemLookAndFeel = false;



    JLabel downbar =  new JLabel();
    JLabel yelloDown = new JLabel();


    public About() {


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = y / 2;
        widthdiv = x / 2;



        home.setBounds(420, 520, 180, 30);
        home.setFont(new Font("Calibri", 1, 19));
        home.setHorizontalAlignment(SwingConstants.CENTER);
        home.setBackground(new Color(6, 125, 248));
        home.setForeground(Color.white);
        add(home);


        home.addActionListener(new ActionListener() {
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


               // HolderPage.menuAdjuster();
               // HolderPage.content.updateUI();



            }
        });






        htmlPane = new JEditorPane();
        htmlPane.setEditable(false);
        initHelp();
        JScrollPane htmlView = new JScrollPane(htmlPane);
        htmlView.setBounds(150,30,700,450);

        htmlView.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 4,true));

        add(htmlView);




        yelloDown.setBounds(0,495,1000,5);
        yelloDown.setBackground(new Color(232, 161, 28));
        yelloDown.setOpaque(true);
        add(yelloDown);



        downbar.setBounds(0,500,1000,70);
        downbar.setBackground(new Color(233, 233, 233));
        downbar.setOpaque(true);
        add(downbar);


        setBackground(Color.white);
        setLayout(null);



    }






    private void initHelp() {
        String s = "HelpFiles/arnold.html";
        helpURL = getClass().getResource(s);
        if (helpURL == null) {
            System.err.println("Couldn't open help file: " + s);
        } else if (DEBUG) {
            System.out.println("Help URL is " + helpURL);
        }

        displayURL(helpURL);
    }

    private void displayURL(URL url) {
        try {
            if (url != null) {
                htmlPane.setPage(url);
            } else { //null url
                htmlPane.setText("File Not Found");
                if (DEBUG) {
                    System.out.println("Attempted to display a null URL.");
                }
            }
        } catch (IOException e) {
            System.err.println("Attempted to read a bad URL: " + url);
        }
    }




    public void paintComponent(Graphics g){

        super.paintComponent(g);




        //	g.setFont(new Font("Calibri (Body)", 1, 11));

        // g.drawImage(imaget, 0, 0,1000,570,this);



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


