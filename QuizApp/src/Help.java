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

import MaterialDesign.MaterialColor;
import MaterialDesign.MaterialWindow;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;


public class Help extends JPanel implements TreeSelectionListener  {




    MaterialWindow frame =  new MaterialWindow();


    JLabel downbar  = new JLabel();



    JButton home =  new JButton("X");




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

    JLabel yellowUp = new JLabel();


    JLabel topBar =  new JLabel();


    public Help() {






        new Move().move(frame,topBar);





        frame.setSize(800,500);
        frame.add(this);



        setBounds(0,0, 800, 500);




        //Create the nodes.
        DefaultMutableTreeNode top =
                new DefaultMutableTreeNode("The Java Series");
        createNodes(top);

        //Create a tree that allows one selection at a time.
        tree = new JTree(top);
        tree.getSelectionModel().setSelectionMode
                (TreeSelectionModel.SINGLE_TREE_SELECTION);

        //Listen for when the selection changes.
        tree.addTreeSelectionListener(this);

        if (playWithLineStyle) {
            System.out.println("line style = " + lineStyle);
            tree.putClientProperty("JTree.lineStyle", lineStyle);
        }

        //Create the scroll pane and add the tree to it.
        JScrollPane treeView = new JScrollPane(tree);
        treeView.setBounds(30,60,250,370);
        treeView.getVerticalScrollBar().setUI(new MyScrollBarUI());
        treeView.getHorizontalScrollBar().setUI(new MyScrollBarUI());
        add(treeView);


        treeView.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 3,true));



        //Create the HTML viewing pane.
        htmlPane = new JEditorPane();
        htmlPane.setEditable(false);
        initHelp();
        JScrollPane htmlView = new JScrollPane(htmlPane);
        htmlView.setBounds(290,60,460,370);
        htmlView.getVerticalScrollBar().setUI(new MyScrollBarUI());
        htmlView.getHorizontalScrollBar().setUI(new MyScrollBarUI());
        add(htmlView);



        htmlView.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 3,true));




        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setBounds(280,60,52,370);
        add(splitPane);





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


                    }
                });


            }
        });









        topBar.setBounds(0,0, 800, 35);
        topBar.setBackground(MaterialColor.BLUE_700);
        topBar.setForeground(MaterialColor.WHITE);
        topBar.setFont(new Font("Calibri",1,15));
        topBar.setText("       Help");
        topBar.setOpaque(true);
        add(topBar);







        downbar.setBounds(0,450,800,30);
        downbar.setBackground(new Color(233, 233, 233));
        downbar.setOpaque(true);
        add(downbar);





        setBackground(Color.white);
        setLayout(null);



        int locationX = HolderPage.f.getX()  + 100;
        int locationY =  HolderPage.f.getY()  +  50;

        frame.setLocation(locationX, locationY);
        //frame.setLocationRelativeTo(HolderPage.f);



        frame.setVisible(true);
        frame.setResizable(false);



    }








    /** Required by TreeSelectionListener interface. */
    public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode node = (DefaultMutableTreeNode)
                tree.getLastSelectedPathComponent();

        if (node == null) return;

        Object nodeInfo = node.getUserObject();
        if (node.isLeaf()) {
            BookInfo book = (BookInfo)nodeInfo;
            displayURL(book.bookURL);
            if (DEBUG) {
                System.out.print(book.bookURL + ":  \n    ");
            }
        } else {
            displayURL(helpURL);
        }
        if (DEBUG) {
            System.out.println(nodeInfo.toString());
        }
    }

    private class BookInfo {
        public String bookName;
        public URL bookURL;

        public BookInfo(String book, String filename) {
            bookName = book;
            bookURL = getClass().getResource(filename);
            if (bookURL == null) {
                System.err.println("Couldn't find file: "
                        + filename);
            }
        }

        public String toString() {
            return bookName;
        }
    }

    private void initHelp() {
        String s = "HelpFIles//TreeDemoHelp.html";
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

    private void createNodes(DefaultMutableTreeNode top) {
        DefaultMutableTreeNode category = null;
        DefaultMutableTreeNode book = null;

        category = new DefaultMutableTreeNode("Books for Java Programmers");
        top.add(category);

        //original Tutorial
        book = new DefaultMutableTreeNode(new BookInfo
                ("The Java Tutorial: A Short Course on the Basics",
                        "HelpFiles//tutorial.html"));
        category.add(book);

        //Tutorial Continued
        book = new DefaultMutableTreeNode(new BookInfo
                ("The Java Tutorial Continued: The Rest of the JDK",
                        "HelpFiles//tutorialcont.html"));
        category.add(book);

        //JFC Swing Tutorial
        book = new DefaultMutableTreeNode(new BookInfo
                ("The JFC Swing Tutorial: A Guide to Constructing GUIs",
                        "HelpFiles//swingtutorial.html"));
        category.add(book);

        //Bloch
        book = new DefaultMutableTreeNode(new BookInfo
                ("Effective Java Programming Language Guide",
                        "HelpFiles//bloch.html"));
        category.add(book);

        //Arnold/Gosling
        book = new DefaultMutableTreeNode(new BookInfo
                ("The Java Programming Language", "HelpFiles//arnold.html"));
        category.add(book);

        //Chan
        book = new DefaultMutableTreeNode(new BookInfo
                ("The Java Developers Almanac",
                        "HelpFiles//chan.html"));
        category.add(book);

        category = new DefaultMutableTreeNode("Books for Java Implementers");
        top.add(category);

        //VM
        book = new DefaultMutableTreeNode(new BookInfo
                ("The Java Virtual Machine Specification",
                        "HelpFiles//vm.html"));
        category.add(book);

        //Language Spec
        book = new DefaultMutableTreeNode(new BookInfo
                ("The Java Language Specification",
                        "HelpFiles//jls.html"));
        category.add(book);
    }




    public void paintComponent(Graphics g){

        super.paintComponent(g);




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
                new Help();
            }
        });



    }

}


