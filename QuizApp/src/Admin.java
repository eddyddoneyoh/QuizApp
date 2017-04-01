/**
 * Created by EdidiongEyo on 11/19/2016.
 */
/**
 * Created by EdidiongEyo on 11/5/2016.
 */
/**
 * Created by EdidiongEyo on 11/5/2016.
 */
import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.RandomAccessFile;
import java.sql.*;


public class Admin extends JPanel {


    static JFrame f = new JFrame("");


    int x;
    int y;

    int heightdiv;
    int widthdiv;




    public static JPanel panel  = new JPanel();;


    static JPanel participant1 =  new JPanel();
    static JPanel participant2 =  new JPanel();
    static JPanel participant3 =  new JPanel();
    static JPanel participant4 =  new JPanel();
    static JPanel participant5 =  new JPanel();
    static JPanel participant6 =  new JPanel();
    static JPanel participant7 =  new JPanel();
    static JPanel participant8 =  new JPanel();
    static JPanel participant9 =  new JPanel();
    static JPanel participant10 =  new JPanel();
    static JPanel participant11 =  new JPanel();
    static JPanel participant12 =  new JPanel();
    static JPanel participant13 =  new JPanel();
    static JPanel participant14 =  new JPanel();
    static JPanel participant15 =  new JPanel();
    static JPanel participant16 =  new JPanel();
    static JPanel participant17 =  new JPanel();
    static JPanel participant18 =  new JPanel();
    static JPanel participant19 =  new JPanel();
    static JPanel participant20 =  new JPanel();
    static JPanel participant21 =  new JPanel();
    static JPanel participant22 =  new JPanel();
    static JPanel participant23 =  new JPanel();
    static JPanel participant24 =  new JPanel();
    static JPanel participant25 =  new JPanel();
    static JPanel participant26 =  new JPanel();
    static JPanel participant27 =  new JPanel();
    static JPanel participant28 =  new JPanel();
    static JPanel participant29 =  new JPanel();
    static JPanel participant30 =  new JPanel();
    static JPanel participant31 =  new JPanel();
    static JPanel participant32 =  new JPanel();
    static JPanel participant33 =  new JPanel();
    static JPanel participant34 =  new JPanel();
    static JPanel participant35 =  new JPanel();
    static JPanel participant36 =  new JPanel();
    static JPanel participant37 =  new JPanel();
    static JPanel participant38 =  new JPanel();
    static JPanel participant39 =  new JPanel();
    static JPanel participant40 =  new JPanel();
    static JPanel participant41 =  new JPanel();
    static JPanel participant42 =  new JPanel();
    static  JPanel participant43 =  new JPanel();
    static JPanel participant44 =  new JPanel();
    static JPanel participant45 =  new JPanel();
    static JPanel participant46 =  new JPanel();
    static JPanel participant47 =  new JPanel();
    static JPanel participant48 =  new JPanel();
    static JPanel participant49 =  new JPanel();
    static JPanel participant50 =  new JPanel();
    static JPanel participant51 =  new JPanel();
    static JPanel participant52 =  new JPanel();
    static JPanel participant53 =  new JPanel();
    static JPanel participant54 =  new JPanel();
    static JPanel participant55 =  new JPanel();
    static  JPanel participant56 =  new JPanel();
    static JPanel participant57 =  new JPanel();
    static JPanel participant58 =  new JPanel();
    static JPanel participant59 =  new JPanel();
    static JPanel participant60 =  new JPanel();
    static JPanel participant61 =  new JPanel();
    static JPanel participant62 =  new JPanel();
    static JPanel participant63 =  new JPanel();
    static JPanel participant64 =  new JPanel();
    static JPanel participant65 =  new JPanel();
    static JPanel participant66 =  new JPanel();
    static JPanel participant67 =  new JPanel();
    static JPanel participant68 =  new JPanel();
    static JPanel participant69 =  new JPanel();
    static  JPanel participant70 =  new JPanel();
    static  JPanel participant71 =  new JPanel();
    static  JPanel participant72 =  new JPanel();
    static JPanel participant73 =  new JPanel();
    static  JPanel participant74 =  new JPanel();
    static JPanel participant75 =  new JPanel();
    static JPanel participant76 =  new JPanel();
    static JPanel participant77 =  new JPanel();
    static JPanel participant78 =  new JPanel();
    static JPanel participant79 =  new JPanel();
    static JPanel participant80 =  new JPanel();
    static  JPanel participant81 =  new JPanel();
    static  JPanel participant82 =  new JPanel();
    static JPanel participant83 =  new JPanel();
    static JPanel participant84 =  new JPanel();
    static  JPanel participant85 =  new JPanel();
    static JPanel participant86 =  new JPanel();
   static JPanel participant87 =  new JPanel();
    static JPanel participant88 =  new JPanel();
    static JPanel participant89 =  new JPanel();
    static JPanel participant90 =  new JPanel();
    static JPanel participant91 =  new JPanel();
    static JPanel participant92 =  new JPanel();
    static JPanel participant93 =  new JPanel();
    static JPanel participant94 =  new JPanel();
    static JPanel participant95 =  new JPanel();
    static JPanel participant96 =  new JPanel();
    static JPanel participant97 =  new JPanel();
    static JPanel participant98 =  new JPanel();
    static  JPanel participant99 =  new JPanel();
    static JPanel participant100 =  new JPanel();



    static JTextField part1name =  new JTextField("Question 1");
    static JTextField part1name2  = new JTextField("Option 1");
    static JTextField part1name3 =  new JTextField("Option 2");
    static JTextField part1name4 =  new JTextField("Option 3");
    static JTextField part1name5 =  new JTextField("Option 4");
    static JTextField part1name6 =  new JTextField("Answer");
    static JTextField part1ID =  new JTextField("1");

    static  JTextField part2name =  new JTextField("Question 2");
    static  JTextField part2name2  = new JTextField("Option 1");
    static  JTextField part2name3 =  new JTextField("Ooption 2");
    static JTextField part2name4 =  new JTextField("Option 3");
    static  JTextField part2name5 =  new JTextField("Option 4");
    static  JTextField part2name6 =  new JTextField("Answer");
    static JTextField part2ID =  new JTextField("2");

    static JTextField part3name =  new JTextField("Question 3");
    static JTextField part3name2  = new JTextField("Option 1");
    static JTextField part3name3 =  new JTextField("Option 2");
    static  JTextField part3name4 =  new JTextField("Option 3");
    static  JTextField part3name5 =  new JTextField("Option 4");
    static JTextField part3name6 =  new JTextField("Answer");
    static JTextField part3ID =  new JTextField("3");

    static JTextField part4name =  new JTextField("Question 4");
    static  JTextField part4name2  = new JTextField("Option 1");
    static  JTextField part4name3 =  new JTextField("Option 2");
    static  JTextField part4name4 =  new JTextField("Option 3");
    static  JTextField part4name5 =  new JTextField("Option 4");
    static JTextField part4name6 =  new JTextField("Answer");
    static JTextField part4ID =  new JTextField("4");

    static  JTextField part5name =  new JTextField("Question 5");
    static JTextField part5name2  = new JTextField("Option 1");
    static  JTextField part5name3 =  new JTextField("Option 2");
    static  JTextField part5name4 =  new JTextField("Option 3");
    static  JTextField part5name5 =  new JTextField("Option 4");
    static  JTextField part5name6 =  new JTextField("Answer");
    static  JTextField part5ID =  new JTextField("5");

    static  JTextField part6name =  new JTextField("Question 6");
    static   JTextField part6name2  = new JTextField("Option 1");
    static JTextField part6name3 =  new JTextField("Option 2");
    static  JTextField part6name4 =  new JTextField("Option 3");
    static  JTextField part6name5 =  new JTextField("Option 4");
    static  JTextField part6name6 =  new JTextField("Answer");
    static  JTextField part6ID =  new JTextField("6");

    static JTextField part7name =  new JTextField("Question 7");
    static  JTextField part7name2  = new JTextField("Option 1");
    static  JTextField part7name3 =  new JTextField("Option 2");
    static  JTextField part7name4 =  new JTextField("Option 3");
    static JTextField part7name5 =  new JTextField("Option 4");
    static JTextField part7name6 =  new JTextField("Answer");
    static JTextField part7ID =  new JTextField("7");

    static  JTextField part8name =  new JTextField("Question 8");
    static  JTextField part8name2  = new JTextField("Option 1");
    static  JTextField part8name3 =  new JTextField("Option 2");
    static  JTextField part8name4 =  new JTextField("Option 3");
    static  JTextField part8name5 =  new JTextField("Option 4");
    static  JTextField part8name6 =  new JTextField("Answer");
    static  JTextField part8ID =  new JTextField("8");

    static  JTextField part9name =  new JTextField("Question 9");
    static JTextField part9name2  = new JTextField("Option 1");
    static  JTextField part9name3 =  new JTextField("Option 2");
    static  JTextField part9name4 =  new JTextField("Option 3");
    static  JTextField part9name5 =  new JTextField("Option 4");
    static  JTextField part9name6 =  new JTextField("Answer");
    static  JTextField part9ID =  new JTextField("9");

    static JTextField part10name =  new JTextField("Question 10");
    static JTextField part10name2  = new JTextField("Option 1");
    static  JTextField part10name3 =  new JTextField("Option 2");
    static  JTextField part10name4 =  new JTextField("Option 3");
    static  JTextField part10name5 =  new JTextField("Option 4");
    static  JTextField part10name6 =  new JTextField("Answer");
    static JTextField part10ID =  new JTextField("10");

    static JTextField part11name =  new JTextField("Question 11");
    static  JTextField part11name2  = new JTextField("Option 1");
    static  JTextField part11name3 =  new JTextField("Option 2");
    static  JTextField part11name4 =  new JTextField("Option 3");
    static JTextField part11name5 =  new JTextField("Option 4");
    static JTextField part11name6 =  new JTextField("Answer");
    static  JTextField part11ID =  new JTextField("11");

    static JTextField part12name =  new JTextField("Question 12");
    static JTextField part12name2  = new JTextField("Option 1");
    static  JTextField part12name3 =  new JTextField("Option 2");
    static  JTextField part12name4 =  new JTextField("Option 3");
    static JTextField part12name5 =  new JTextField("Option 4");
    static JTextField part12name6 =  new JTextField("Answer");
    static  JTextField part12ID =  new JTextField("12");

    static  JTextField part13name =  new JTextField("Question 13");
    static JTextField part13name2  = new JTextField("Option 1");
    static JTextField part13name3 =  new JTextField("Option 2");
    static JTextField part13name4 =  new JTextField("Option 3");
    static JTextField part13name5 =  new JTextField("Option 4");
    static JTextField part13name6 =  new JTextField("Answer");
    static JTextField part13ID =  new JTextField("13");

    static JTextField part14name =  new JTextField("Question 14");
    static JTextField part14name2  = new JTextField("Option 1");
    static JTextField part14name3 =  new JTextField("Option 2");
    static JTextField part14name4 =  new JTextField("Option 3");
    static JTextField part14name5 =  new JTextField("Option 4");
    static JTextField part14name6 =  new JTextField("Answer");
    static JTextField part14ID =  new JTextField("14");

    static JTextField part15name =  new JTextField("Question 15");
    static JTextField part15name2  = new JTextField("Option 1");
    static  JTextField part15name3 =  new JTextField("Option 2");
    static  JTextField part15name4 =  new JTextField("Option 3");
    static JTextField part15name5 =  new JTextField("Option 4");
    static JTextField part15name6 =  new JTextField("Answer");
    static  JTextField part15ID =  new JTextField("15");

    static JTextField part16name =  new JTextField("Question 16");
    static JTextField part16name2  = new JTextField("Option 1");
    static  JTextField part16name3 =  new JTextField("Option 2");
    static JTextField part16name4 =  new JTextField("Option 3");
    static  JTextField part16name5 =  new JTextField("Option 4");
    static JTextField part16name6 =  new JTextField("Answer");
    static  JTextField part16ID =  new JTextField("16");

    static JTextField part17name =  new JTextField("Question 17");
    static JTextField part17name2  = new JTextField("Option 1");
    static  JTextField part17name3 =  new JTextField("Option 2");
    static  JTextField part17name4 =  new JTextField("Option 3");
    static  JTextField part17name5 =  new JTextField("Option 4");
    static  JTextField part17name6 =  new JTextField("Answer");
    static  JTextField part17ID =  new JTextField("17");

    static  JTextField part18name =  new JTextField("Question 18");
    static  JTextField part18name2  = new JTextField("Option 1");
    static JTextField part18name3 =  new JTextField("Option 2");
    static  JTextField part18name4 =  new JTextField("Option 3");
    static  JTextField part18name5 =  new JTextField("Option 4");
    static  JTextField part18name6 =  new JTextField("Answer");
    static  JTextField part18ID =  new JTextField("18");

    static JTextField part19name =  new JTextField("Question 19");
    static JTextField part19name2  = new JTextField("Option 1");
    static  JTextField part19name3 =  new JTextField("Option 2");
    static  JTextField part19name4 =  new JTextField("Option 3");
    static  JTextField part19name5 =  new JTextField("Option 4");
    static  JTextField part19name6 =  new JTextField("Answer");
    static  JTextField part19ID =  new JTextField("19");

    static  JTextField part20name =  new JTextField("Question 20");
    static  JTextField part20name2  = new JTextField("Option 1");
    static  JTextField part20name3 =  new JTextField("Option 2");
    static  JTextField part20name4 =  new JTextField("Option 3");
    static  JTextField part20name5 =  new JTextField("Option 4");
    static  JTextField part20name6 =  new JTextField("Answer");
    static  JTextField part20ID =  new JTextField("20");

    static  JTextField part21name =  new JTextField("Question 21");
    static  JTextField part21name2  = new JTextField("Option 1");
    static JTextField part21name3 =  new JTextField("Option 2");
    static  JTextField part21name4 =  new JTextField("Option 3");
    static  JTextField part21name5 =  new JTextField("Option 4");
    static  JTextField part21name6 =  new JTextField("Answer");
    static  JTextField part21ID =  new JTextField("21");

    static  JTextField part22name =  new JTextField("Question 22");
    static  JTextField part22name2  = new JTextField("Option 1");
    static  JTextField part22name3 =  new JTextField("Option 2");
    static  JTextField part22name4 =  new JTextField("Option 3");
    static  JTextField part22name5 =  new JTextField("Option 4");
    static  JTextField part22name6 =  new JTextField("Answer");
    static  JTextField part22ID =  new JTextField("22");

    static  JTextField part23name =  new JTextField("Question 23");
    static  JTextField part23name2  = new JTextField("Option 1");
    static JTextField part23name3 =  new JTextField("Option 2");
    static JTextField part23name4 =  new JTextField("Option 3");
    static JTextField part23name5 =  new JTextField("Option 4");
    static JTextField part23name6 =  new JTextField("Answer");
    static  JTextField part23ID =  new JTextField("23");

    static  JTextField part24name =  new JTextField("Question 24");
    static JTextField part24name2  = new JTextField("Option 1");
    static JTextField part24name3 =  new JTextField("Option 2");
    static JTextField part24name4 =  new JTextField("Option 3");
    static JTextField part24name5 =  new JTextField("Option 4");
    static JTextField part24name6 =  new JTextField("Answer");
    static  JTextField part24ID =  new JTextField("24");

    static JTextField part25name =  new JTextField("Question 25");
    static  JTextField part25name2  = new JTextField("Option 1");
    static  JTextField part25name3 =  new JTextField("Option 2");
    static JTextField part25name4 =  new JTextField("Option 3");
    static JTextField part25name5 =  new JTextField("Option 4");
    static  JTextField part25name6 =  new JTextField("Answer");
    static  JTextField part25ID =  new JTextField("25");

    static  JTextField part26name =  new JTextField("Question 26");
    static JTextField part26name2  = new JTextField("Option 1");
    static JTextField part26name3 =  new JTextField("Option 2");
    static JTextField part26name4 =  new JTextField("Option 3");
    static JTextField part26name5 =  new JTextField("Option 4");
    static JTextField part26name6 =  new JTextField("Answer");
    static JTextField part26ID =  new JTextField("26");

    static  JTextField part27name =  new JTextField("Question 27");
    static  JTextField part27name2  = new JTextField("Option 1");
    static JTextField part27name3 =  new JTextField("Option 2");
    static JTextField part27name4 =  new JTextField("Option 3");
    static  JTextField part27name5 =  new JTextField("Option 4");
    static  JTextField part27name6 =  new JTextField("Answer");
    static JTextField part27ID =  new JTextField("27");

    static JTextField part28name =  new JTextField("Question 28");
    static JTextField part28name2  = new JTextField("Option 1");
    static JTextField part28name3 =  new JTextField("Option 2");
    static  JTextField part28name4 =  new JTextField("Option 3");
    static JTextField part28name5 =  new JTextField("Option 4");
    static JTextField part28name6 =  new JTextField("Answer");
    static JTextField part28ID =  new JTextField("28");

    static JTextField part29name =  new JTextField("Question 29");
    static JTextField part29name2  = new JTextField("Option 1");
    static JTextField part29name3 =  new JTextField("Option 2");
    static JTextField part29name4 =  new JTextField("Option 3");
    static JTextField part29name5 =  new JTextField("Option 4");
    static JTextField part29name6 =  new JTextField("Answer");
    static JTextField part29ID =  new JTextField("29");

    static JTextField part30name =  new JTextField("Question 30");
    static JTextField part30name2  = new JTextField("Option 1");
    static JTextField part30name3 =  new JTextField("Option 2");
    static JTextField part30name4 =  new JTextField("Option 3");
    static JTextField part30name5 =  new JTextField("Option 4");
    static  JTextField part30name6 =  new JTextField("Answer");
    static  JTextField part30ID =  new JTextField("30");

    static JTextField part31name =  new JTextField("Question 31");
    static  JTextField part31name2  = new JTextField("Option 1");
    static JTextField part31name3 =  new JTextField("Option 2");
    static JTextField part31name4 =  new JTextField("Option 3");
    static JTextField part31name5 =  new JTextField("Option 4");
    static JTextField part31name6 =  new JTextField("Answer");
    static JTextField part31ID =  new JTextField("31");

 static JTextField part32name =  new JTextField("Question 32");
 static JTextField part32name2  = new JTextField("Option 1");
 static JTextField part32name3 =  new JTextField("Option 2");
 static JTextField part32name4 =  new JTextField("Option 3");
 static JTextField part32name5 =  new JTextField("Option 4");
 static JTextField part32name6 =  new JTextField("Answer");
 static JTextField part32ID =  new JTextField("32");

 static JTextField part33name =  new JTextField("Question 33");
 static JTextField part33name2  = new JTextField("Option 1");
 static JTextField part33name3 =  new JTextField("Option 2");
 static JTextField part33name4 =  new JTextField("Option 3");
 static JTextField part33name5 =  new JTextField("Option 4");
 static JTextField part33name6 =  new JTextField("Answer");
 static JTextField part33ID =  new JTextField("33");

 static JTextField part34name =  new JTextField("Question 34");
 static JTextField part34name2  = new JTextField("Option 1");
 static JTextField part34name3 =  new JTextField("Option 2");
 static  JTextField part34name4 =  new JTextField("Option 3");
 static  JTextField part34name5 =  new JTextField("Option 4");
 static  JTextField part34name6 =  new JTextField("Answer");
 static  JTextField part34ID =  new JTextField("34");

 static JTextField part35name =  new JTextField("Question 35");
 static JTextField part35name2  = new JTextField("Option 1");
 static JTextField part35name3 =  new JTextField("Option 2");
 static JTextField part35name4 =  new JTextField("Option 3");
 static JTextField part35name5 =  new JTextField("Option 4");
 static JTextField part35name6 =  new JTextField("Answer");
 static JTextField part35ID =  new JTextField("35");

 static JTextField part36name =  new JTextField("Question 36");
 static JTextField part36name2  = new JTextField("Option 1");
 static  JTextField part36name3 =  new JTextField("Option 2");
 static  JTextField part36name4 =  new JTextField("Option 3");
 static  JTextField part36name5 =  new JTextField("Option 4");
 static JTextField part36name6 =  new JTextField("Answer");
 static JTextField part36ID =  new JTextField("36");

 static  JTextField part37name =  new JTextField("Question 37");
 static JTextField part37name2  = new JTextField("Option 1");
 static JTextField part37name3 =  new JTextField("Option 2");
 static JTextField part37name4 =  new JTextField("Option 3");
 static  JTextField part37name5 =  new JTextField("Option 4");
 static  JTextField part37name6 =  new JTextField("Answer");
 static  JTextField part37ID =  new JTextField("37");

 static JTextField part38name =  new JTextField("Question 38");
 static  JTextField part38name2  = new JTextField("Option 1");
 static  JTextField part38name3 =  new JTextField("Option 2");
 static JTextField part38name4 =  new JTextField("Option 3");
 static JTextField part38name5 =  new JTextField("Option 4");
 static JTextField part38name6 =  new JTextField("Answer");
 static JTextField part38ID =  new JTextField("38");

 static JTextField part39name =  new JTextField("Question 39");
 static JTextField part39name2  = new JTextField("Option 1");
 static JTextField part39name3 =  new JTextField("Option 2");
 static JTextField part39name4 =  new JTextField("Option 3");
 static  JTextField part39name5 =  new JTextField("Option 4");
 static  JTextField part39name6 =  new JTextField("Answer");
 static  JTextField part39ID =  new JTextField("39");

 static  JTextField part40name =  new JTextField("Question 40");
 static  JTextField part40name2  = new JTextField("Option 1");
 static  JTextField part40name3 =  new JTextField("Option 2");
 static  JTextField part40name4 =  new JTextField("Option 3");
 static  JTextField part40name5 =  new JTextField("Option 4");
 static  JTextField part40name6 =  new JTextField("Answer");
 static JTextField part40ID =  new JTextField("40");

 static JTextField part41name =  new JTextField("Question 41");
 static  JTextField part41name2  = new JTextField("Option 1");
 static  JTextField part41name3 =  new JTextField("Option 2");
 static JTextField part41name4 =  new JTextField("Option 3");
 static JTextField part41name5 =  new JTextField("Option 4");
 static JTextField part41name6 =  new JTextField("Answer");
 static JTextField part41ID =  new JTextField("41");

 static JTextField part42name =  new JTextField("Question 42");
 static  JTextField part42name2  = new JTextField("Option 1");
 static  JTextField part42name3 =  new JTextField("Option 2");
 static  JTextField part42name4 =  new JTextField("Option 3");
 static JTextField part42name5 =  new JTextField("Option 4");
 static  JTextField part42name6 =  new JTextField("Answer");
 static  JTextField part42ID =  new JTextField("42");

 static JTextField part43name =  new JTextField("Question 43");
 static JTextField part43name2  = new JTextField("Option 1");
 static JTextField part43name3 =  new JTextField("Option 2");
 static  JTextField part43name4 =  new JTextField("Option 3");
 static  JTextField part43name5 =  new JTextField("Option 4");
 static JTextField part43name6 =  new JTextField("Answer");
 static  JTextField part43ID =  new JTextField("43");

 static  JTextField part44name =  new JTextField("Question 44");
 static JTextField part44name2  = new JTextField("Option 1");
 static  JTextField part44name3 =  new JTextField("Option 2");
 static  JTextField part44name4 =  new JTextField("Option 3");
 static  JTextField part44name5 =  new JTextField("Option 4");
 static  JTextField part44name6 =  new JTextField("Answer");
 static  JTextField part44ID =  new JTextField("44");

 static JTextField part45name =  new JTextField("Question 45");
 static  JTextField part45name2  = new JTextField("Option 1");
 static  JTextField part45name3 =  new JTextField("Option 2");
 static  JTextField part45name4 =  new JTextField("Option 3");
 static  JTextField part45name5 =  new JTextField("Option 4");
 static  JTextField part45name6 =  new JTextField("Answer");
 static  JTextField part45ID =  new JTextField("45");

 static  JTextField part46name =  new JTextField("Question 46");
 static  JTextField part46name2  = new JTextField("Option 1");
 static  JTextField part46name3 =  new JTextField("Option 2");
 static  JTextField part46name4 =  new JTextField("Option 3");
 static  JTextField part46name5 =  new JTextField("Option 4");
 static  JTextField part46name6 =  new JTextField("Answer");
 static JTextField part46ID =  new JTextField("46");

 static JTextField part47name =  new JTextField("Question 47");
 static JTextField part47name2  = new JTextField("Option 1");
 static JTextField part47name3 =  new JTextField("Option 2");
 static  JTextField part47name4 =  new JTextField("Option 3");
 static  JTextField part47name5 =  new JTextField("Option 4");
 static  JTextField part47name6 =  new JTextField("Answer");
 static JTextField part47ID =  new JTextField("47");

 static JTextField part48name =  new JTextField("Question 48");
 static  JTextField part48name2  = new JTextField("Option 1");
 static  JTextField part48name3 =  new JTextField("Option 2");
 static  JTextField part48name4 =  new JTextField("Option 3");
 static JTextField part48name5 =  new JTextField("Option 4");
 static JTextField part48name6 =  new JTextField("Answer");
 static JTextField part48ID =  new JTextField("48");

    static JTextField part49name =  new JTextField("Question 49");
    static JTextField part49name2  = new JTextField("Option 1");
    static JTextField part49name3 =  new JTextField("Option 2");
    static JTextField part49name4 =  new JTextField("Option 3");
    static JTextField part49name5 =  new JTextField("Option 4");
    static JTextField part49name6 =  new JTextField("Answer");
    static JTextField part49ID =  new JTextField("49");

    static JTextField part50name =  new JTextField("Question 50");
    static JTextField part50name2  = new JTextField("Option 1");
    static JTextField part50name3 =  new JTextField("Option 2");
    static JTextField part50name4 =  new JTextField("Option 3");
    static JTextField part50name5 =  new JTextField("Option 4");
    static JTextField part50name6 =  new JTextField("Answer");
    static JTextField part50ID =  new JTextField("50");

    static JTextField part51name =  new JTextField("Question 51");
    static JTextField part51name2  = new JTextField("Option 1");
    static JTextField part51name3 =  new JTextField("Option 2");
    static JTextField part51name4 =  new JTextField("Option 3");
    static JTextField part51name5 =  new JTextField("Option 4");
    static JTextField part51name6 =  new JTextField("Answer");
    static JTextField part51ID =  new JTextField("51");

    static JTextField part52name =  new JTextField("Question 52");
    static JTextField part52name2  = new JTextField("Option 1");
    static JTextField part52name3 =  new JTextField("Option 2");
    static JTextField part52name4 =  new JTextField("Option 3");
    static JTextField part52name5 =  new JTextField("Option 4");
    static JTextField part52name6 =  new JTextField("Answer");
    static JTextField part52ID =  new JTextField("52");

    static JTextField part53name =  new JTextField("Question 53");
    static JTextField part53name2  = new JTextField("Option 1");
    static JTextField part53name3 =  new JTextField("Option 2");
    static JTextField part53name4 =  new JTextField("Option 3");
    static JTextField part53name5 =  new JTextField("Option 4");
    static JTextField part53name6 =  new JTextField("Answer");
    static JTextField part53ID =  new JTextField("53");

    static JTextField part54name =  new JTextField("Question 54");
    static JTextField part54name2  = new JTextField("Option 1");
    static JTextField part54name3 =  new JTextField("Option 2");
    static JTextField part54name4 =  new JTextField("Option 3");
    static JTextField part54name5 =  new JTextField("Option 4");
    static JTextField part54name6 =  new JTextField("Answer");
    static JTextField part54ID =  new JTextField("54");

    static JTextField part55name =  new JTextField("Question 55");
    static JTextField part55name2  = new JTextField("Option 1");
    static JTextField part55name3 =  new JTextField("Option 2");
    static JTextField part55name4 =  new JTextField("Option 3");
    static JTextField part55name5 =  new JTextField("Option 4");
    static JTextField part55name6 =  new JTextField("Answer");
    static  JTextField part55ID =  new JTextField("55");

    static JTextField part56name =  new JTextField("Question 56");
    static JTextField part56name2  = new JTextField("Option 1");
    static JTextField part56name3 =  new JTextField("Option 2");
    static JTextField part56name4 =  new JTextField("Option 3");
    static JTextField part56name5 =  new JTextField("Option 4");
    static JTextField part56name6 =  new JTextField("Answer");
    static JTextField part56ID =  new JTextField("56");

    static JTextField part57name =  new JTextField("Question 57");
    static JTextField part57name2  = new JTextField("Option 1");
    static JTextField part57name3 =  new JTextField("Option 2");
    static JTextField part57name4 =  new JTextField("Option 3");
    static JTextField part57name5 =  new JTextField("Option 4");
    static JTextField part57name6 =  new JTextField("Answer");
    static JTextField part57ID =  new JTextField("57");

    static JTextField part58name =  new JTextField("Question 58");
    static JTextField part58name2  = new JTextField("Option 1");
    static JTextField part58name3 =  new JTextField("Option 2");
    static JTextField part58name4 =  new JTextField("Option 3");
    static JTextField part58name5 =  new JTextField("Option 4");
    static JTextField part58name6 =  new JTextField("Answer");
    static JTextField part58ID =  new JTextField("58");

    static JTextField part59name =  new JTextField("Question 59");
    static JTextField part59name2  = new JTextField("Option 1");
    static JTextField part59name3 =  new JTextField("Option 2");
    static JTextField part59name4 =  new JTextField("Option 3");
    static JTextField part59name5 =  new JTextField("Option 4");
    static JTextField part59name6 =  new JTextField("Answer");
    static JTextField part59ID =  new JTextField("59");

    static JTextField part60name =  new JTextField("Question 60");
    static JTextField part60name2  = new JTextField("Option 1");
    static JTextField part60name3 =  new JTextField("Option 2");
    static JTextField part60name4 =  new JTextField("Option 3");
    static JTextField part60name5 =  new JTextField("Option 4");
    static JTextField part60name6 =  new JTextField("Answer");
    static JTextField part60ID =  new JTextField("60");

    static JTextField part61name =  new JTextField("Question 61");
    static  JTextField part61name2  = new JTextField("Option 1");
    static  JTextField part61name3 =  new JTextField("Option 2");
    static JTextField part61name4 =  new JTextField("Option 3");
    static JTextField part61name5 =  new JTextField("Option 4");
    static JTextField part61name6 =  new JTextField("Answer");
    static JTextField part61ID =  new JTextField("61");

    static JTextField part62name =  new JTextField("Question 62");
    static  JTextField part62name2  = new JTextField("Option 1");
    static JTextField part62name3 =  new JTextField("Option 2");
    static JTextField part62name4 =  new JTextField("Option 3");
    static JTextField part62name5 =  new JTextField("Option 4");
    static JTextField part62name6 =  new JTextField("Answer");
    static JTextField part62ID =  new JTextField("62");

    static JTextField part63name =  new JTextField("Question 63");
    static JTextField part63name2  = new JTextField("Option 1");
    static JTextField part63name3 =  new JTextField("Option 2");
    static JTextField part63name4 =  new JTextField("Option 3");
    static JTextField part63name5 =  new JTextField("Option 4");
    static JTextField part63name6 =  new JTextField("Answer");
    static JTextField part63ID =  new JTextField("63");

    static  JTextField part64name =  new JTextField("Question 64");
    static JTextField part64name2  = new JTextField("Option 1");
    static JTextField part64name3 =  new JTextField("Option 2");
    static JTextField part64name4 =  new JTextField("Option 3");
    static JTextField part64name5 =  new JTextField("Option 4");
    static JTextField part64name6 =  new JTextField("Answer");
    static JTextField part64ID =  new JTextField("64");

    static JTextField part65name =  new JTextField("Question 65");
    static JTextField part65name2  = new JTextField("Option 1");
    static JTextField part65name3 =  new JTextField("Option 2");
    static JTextField part65name4 =  new JTextField("Option 3");
    static JTextField part65name5 =  new JTextField("Option 4");
    static JTextField part65name6 =  new JTextField("Answer");
    static JTextField part65ID =  new JTextField("65");

    static JTextField part66name =  new JTextField("Question 66");
    static JTextField part66name2  = new JTextField("Option 1");
    static  JTextField part66name3 =  new JTextField("Option 2");
    static JTextField part66name4 =  new JTextField("Option 3");
    static JTextField part66name5 =  new JTextField("Option 4");
    static JTextField part66name6 =  new JTextField("Answer");
    static JTextField part66ID =  new JTextField("66");

    static JTextField part67name =  new JTextField("Question 67");
    static JTextField part67name2  = new JTextField("Option 1");
    static JTextField part67name3 =  new JTextField("Option 2");
    static JTextField part67name4 =  new JTextField("Option 3");
    static JTextField part67name5 =  new JTextField("Option 4");
    static JTextField part67name6 =  new JTextField("Answer");
    static JTextField part67ID =  new JTextField("67");

    static JTextField part68name =  new JTextField("Question 68");
    static JTextField part68name2  = new JTextField("Option 1");
    static JTextField part68name3 =  new JTextField("Option 2");
    static JTextField part68name4 =  new JTextField("Option 3");
    static JTextField part68name5 =  new JTextField("Option 4");
    static JTextField part68name6 =  new JTextField("Answer");
    static JTextField part68ID =  new JTextField("68");

    static JTextField part69name =  new JTextField("Question 69");
    static JTextField part69name2  = new JTextField("Option 1");
    static JTextField part69name3 =  new JTextField("Option 2");
    static JTextField part69name4 =  new JTextField("Option 3");
    static JTextField part69name5 =  new JTextField("Option 4");
    static JTextField part69name6 =  new JTextField("Answer");
    static JTextField part69ID =  new JTextField("69");

    static JTextField part70name =  new JTextField("Question 70");
    static JTextField part70name2  = new JTextField("Option 1");
    static JTextField part70name3 =  new JTextField("Option 2");
    static JTextField part70name4 =  new JTextField("Option 3");
    static JTextField part70name5 =  new JTextField("Option 4");
    static JTextField part70name6 =  new JTextField("Answer");
    static JTextField part70ID =  new JTextField("70");

    static JTextField part71name =  new JTextField("Question 71");
    static JTextField part71name2  = new JTextField("Option 1");
    static JTextField part71name3 =  new JTextField("Option 2");
    static JTextField part71name4 =  new JTextField("Option 3");
    static JTextField part71name5 =  new JTextField("Option 4");
    static JTextField part71name6 =  new JTextField("Answer");
    static JTextField part71ID =  new JTextField("71");

    static JTextField part72name =  new JTextField("Question 72");
    static JTextField part72name2  = new JTextField("Option 1");
    static JTextField part72name3 =  new JTextField("Option 2");
    static JTextField part72name4 =  new JTextField("Option 3");
    static JTextField part72name5 =  new JTextField("Option 4");
    static JTextField part72name6 =  new JTextField("Answer");
    static JTextField part72ID =  new JTextField("72");

    static JTextField part73name =  new JTextField("Question 73");
    static JTextField part73name2  = new JTextField("Option 1");
    static JTextField part73name3 =  new JTextField("Option 2");
    static JTextField part73name4 =  new JTextField("Option 3");
    static JTextField part73name5 =  new JTextField("Option 4");
    static JTextField part73name6 =  new JTextField("Answer");
    static JTextField part73ID =  new JTextField("73");

    static JTextField part74name =  new JTextField("Question 74");
    static JTextField part74name2  = new JTextField("Option 1");
    static JTextField part74name3 =  new JTextField("Option 2");
    static JTextField part74name4 =  new JTextField("Option 3");
    static  JTextField part74name5 =  new JTextField("Option 4");
    static JTextField part74name6 =  new JTextField("Answer");
    static JTextField part74ID =  new JTextField("74");

    static JTextField part75name =  new JTextField("Question 75");
    static JTextField part75name2  = new JTextField("Option 1");
    static JTextField part75name3 =  new JTextField("Option 2");
    static JTextField part75name4 =  new JTextField("Option 3");
    static JTextField part75name5 =  new JTextField("Option 4");
    static JTextField part75name6 =  new JTextField("Answer");
    static JTextField part75ID =  new JTextField("75");

    static JTextField part76name =  new JTextField("Question 76");
    static JTextField part76name2  = new JTextField("Option 1");
    static JTextField part76name3 =  new JTextField("Option 2");
    static JTextField part76name4 =  new JTextField("Option 3");
    static JTextField part76name5 =  new JTextField("Option 4");
    static JTextField part76name6 =  new JTextField("Answer");
    static JTextField part76ID =  new JTextField("76");

    static JTextField part77name =  new JTextField("Question 77");
    static JTextField part77name2  = new JTextField("Option 1");
    static JTextField part77name3 =  new JTextField("Option 2");
    static JTextField part77name4 =  new JTextField("Option 3");
    static JTextField part77name5 =  new JTextField("Option 4");
    static JTextField part77name6 =  new JTextField("Answer");
    static JTextField part77ID =  new JTextField("77");

    static JTextField part78name =  new JTextField("Question 78");
    static JTextField part78name2  = new JTextField("Option 1");
    static JTextField part78name3 =  new JTextField("Option 2");
    static JTextField part78name4 =  new JTextField("Option 3");
    static JTextField part78name5 =  new JTextField("Option 4");
    static JTextField part78name6 =  new JTextField("Answer");
    static JTextField part78ID =  new JTextField("78");

    static JTextField part79name =  new JTextField("Question 79");
    static JTextField part79name2  = new JTextField("Option 1");
    static JTextField part79name3 =  new JTextField("Option 2");
    static JTextField part79name4 =  new JTextField("Option 3");
    static JTextField part79name5 =  new JTextField("Option 4");
    static JTextField part79name6 =  new JTextField("Answer");
    static JTextField part79ID =  new JTextField("79");

    static JTextField part80name =  new JTextField("Question 80");
    static JTextField part80name2  = new JTextField("Option 1");
    static JTextField part80name3 =  new JTextField("Option 2");
    static JTextField part80name4 =  new JTextField("Option 3");
    static JTextField part80name5 =  new JTextField("Option 4");
    static JTextField part80name6 =  new JTextField("Answer");
    static JTextField part80ID =  new JTextField("80");

    static JTextField part81name =  new JTextField("Question 81");
    static JTextField part81name2  = new JTextField("Option 1");
    static JTextField part81name3 =  new JTextField("Option 2");
    static JTextField part81name4 =  new JTextField("Option 3");
    static JTextField part81name5 =  new JTextField("Option 4");
    static JTextField part81name6 =  new JTextField("Answer");
    static JTextField part81ID =  new JTextField("81");

    static JTextField part82name =  new JTextField("Question 82");
    static JTextField part82name2  = new JTextField("Option 1");
    static JTextField part82name3 =  new JTextField("Option 2");
    static JTextField part82name4 =  new JTextField("Option 3");
    static JTextField part82name5 =  new JTextField("Option 4");
    static JTextField part82name6 =  new JTextField("Answer");
    static JTextField part82ID =  new JTextField("82");

    static JTextField part83name =  new JTextField("Question 83");
    static JTextField part83name2  = new JTextField("Option 1");
    static JTextField part83name3 =  new JTextField("Option 2");
    static JTextField part83name4 =  new JTextField("Option 3");
    static JTextField part83name5 =  new JTextField("Option 4");
    static JTextField part83name6 =  new JTextField("Answer");
    static JTextField part83ID =  new JTextField("83");

    static JTextField part84name =  new JTextField("Question 84");
    static JTextField part84name2  = new JTextField("Option 1");
    static JTextField part84name3 =  new JTextField("Option 2");
    static JTextField part84name4 =  new JTextField("Option 3");
    static JTextField part84name5 =  new JTextField("Option 4");
    static JTextField part84name6 =  new JTextField("Answer");
    static JTextField part84ID =  new JTextField("84");

    static  JTextField part85name =  new JTextField("Question 85");
    static  JTextField part85name2  = new JTextField("Option 1");
    static  JTextField part85name3 =  new JTextField("Option 2");
    static  JTextField part85name4 =  new JTextField("Option 3");
    static JTextField part85name5 =  new JTextField("Option 4");
    static JTextField part85name6 =  new JTextField("Answer");
    static JTextField part85ID =  new JTextField("85");

    static JTextField part86name =  new JTextField("Question 86");
    static JTextField part86name2  = new JTextField("Option 1");
    static JTextField part86name3 =  new JTextField("Option 2");
    static JTextField part86name4 =  new JTextField("Option 3");
    static JTextField part86name5 =  new JTextField("Option 4");
    static JTextField part86name6 =  new JTextField("Answer");
    static JTextField part86ID =  new JTextField("86");

    static JTextField part87name =  new JTextField("Question 87");
    static JTextField part87name2  = new JTextField("Option 1");
    static JTextField part87name3 =  new JTextField("Option 2");
    static  JTextField part87name4 =  new JTextField("Option 3");
    static JTextField part87name5 =  new JTextField("Option 4");
    static JTextField part87name6 =  new JTextField("Answer");
    static JTextField part87ID =  new JTextField("87");

    static JTextField part88name =  new JTextField("Question 88");
    static JTextField part88name2  = new JTextField("Option 1");
    static JTextField part88name3 =  new JTextField("Option 2");
    static JTextField part88name4 =  new JTextField("Option 3");
    static JTextField part88name5 =  new JTextField("Option 4");
    static JTextField part88name6 =  new JTextField("Answer");
    static JTextField part88ID =  new JTextField("88");

    static JTextField part89name =  new JTextField("Question 89");
    static JTextField part89name2  = new JTextField("Option 1");
    static JTextField part89name3 =  new JTextField("Option 2");
    static JTextField part89name4 =  new JTextField("Option 3");
    static JTextField part89name5 =  new JTextField("Option 4");
    static JTextField part89name6 =  new JTextField("Answer");
    static JTextField part89ID =  new JTextField("89");

    static JTextField part90name =  new JTextField("Question 90");
    static JTextField part90name2  = new JTextField("Option 1");
    static JTextField part90name3 =  new JTextField("Option 2");
    static JTextField part90name4 =  new JTextField("Option 3");
    static JTextField part90name5 =  new JTextField("Option 4");
    static JTextField part90name6 =  new JTextField("Answer");
    static  JTextField part90ID =  new JTextField("90");

    static JTextField part91name =  new JTextField("Question 91");
    static JTextField part91name2  = new JTextField("Option 1");
    static JTextField part91name3 =  new JTextField("Option 2");
    static JTextField part91name4 =  new JTextField("Option 3");
    static JTextField part91name5 =  new JTextField("Option 4");
    static JTextField part91name6 =  new JTextField("Answer");
    static JTextField part91ID =  new JTextField("91");

    static  JTextField part92name =  new JTextField("Question 92");
    static JTextField part92name2  = new JTextField("Option 1");
    static JTextField part92name3 =  new JTextField("Option 2");
    static JTextField part92name4 =  new JTextField("Option 3");
    static JTextField part92name5 =  new JTextField("Option 4");
    static JTextField part92name6 =  new JTextField("Answer");
    static JTextField part92ID =  new JTextField("92");

    static JTextField part93name =  new JTextField("Question 93");
    static JTextField part93name2  = new JTextField("Option 1");
    static JTextField part93name3 =  new JTextField("Option 2");
    static JTextField part93name4 =  new JTextField("Option 3");
    static  JTextField part93name5 =  new JTextField("Option 4");
    static JTextField part93name6 =  new JTextField("Answer");
    static JTextField part93ID =  new JTextField("93");

    static JTextField part94name =  new JTextField("Question 94");
    static JTextField part94name2  = new JTextField("Option 1");
    static JTextField part94name3 =  new JTextField("Option 2");
    static JTextField part94name4 =  new JTextField("Option 3");
    static JTextField part94name5 =  new JTextField("Option 4");
    static JTextField part94name6 =  new JTextField("Answer");
    static JTextField part94ID =  new JTextField("94");

    static JTextField part95name =  new JTextField("Question 95");
    static JTextField part95name2  = new JTextField("Option 1");
    static JTextField part95name3 =  new JTextField("Option 2");
    static JTextField part95name4 =  new JTextField("Option 3");
    static JTextField part95name5 =  new JTextField("Option 4");
    static JTextField part95name6 =  new JTextField("Answer");
    static JTextField part95ID =  new JTextField("95");

    static JTextField part96name =  new JTextField("Question 96");
    static JTextField part96name2  = new JTextField("Option 1");
    static JTextField part96name3 =  new JTextField("Option 2");
    static JTextField part96name4 =  new JTextField("Option 3");
    static JTextField part96name5 =  new JTextField("Option 4");
    static  JTextField part96name6 =  new JTextField("Answer");
    static JTextField part96ID =  new JTextField("96");

    static JTextField part97name =  new JTextField("Question 97");
    static JTextField part97name2  = new JTextField("Option 1");
    static JTextField part97name3 =  new JTextField("Option 2");
    static JTextField part97name4 =  new JTextField("Option 3");
    static JTextField part97name5 =  new JTextField("Option 4");
    static JTextField part97name6 =  new JTextField("Answer");
    static JTextField part97ID =  new JTextField("97");

    static JTextField part98name =  new JTextField("Question 98");
    static JTextField part98name2  = new JTextField("Option 1");
    static JTextField part98name3 =  new JTextField("Option 2");
    static JTextField part98name4 =  new JTextField("Option 3");
    static JTextField part98name5 =  new JTextField("Option 4");
    static JTextField part98name6 =  new JTextField("Answer");
    static JTextField part98ID =  new JTextField("98");

    static  JTextField part99name =  new JTextField("Question 99");
    static JTextField part99name2  = new JTextField("Option 1");
    static JTextField part99name3 =  new JTextField("Option 2");
    static JTextField part99name4 =  new JTextField("Option 3");
    static JTextField part99name5 =  new JTextField("Option 4");
    static JTextField part99name6 =  new JTextField("Answer");
    static JTextField part99ID =  new JTextField("99");

    static JTextField part100name =  new JTextField("Question 100");
    static  JTextField part100name2  = new JTextField("Option 1");
    static  JTextField part100name3 =  new JTextField("Option 2");
    static  JTextField part100name4 =  new JTextField("Option 3");
    static  JTextField part100name5 =  new JTextField("Option 4");
    static JTextField part100name6 =  new JTextField("Answer");
    static JTextField part100ID =  new JTextField("100");



    static JButton up = new JButton("Add");
    static JButton down =  new JButton("Remove");
   static JButton reset = new JButton("Reset");

    static JButton go = new JButton("Apply and Update");


    static JButton retrieve =  new JButton("Retrieve");

    static JLabel contestantStatus = new JLabel("No Question!");

    public static int count = 0;
    public static int participantMax = 0;
    public static int startCount = 1;

    FlowLayout layout =  new FlowLayout(FlowLayout.CENTER,10,20);
    JScrollPane scroll;


    static JComboBox combo =  new JComboBox();
    JButton refresh =  new JButton("Refresh");
    JButton newDB =  new JButton("New DB");
    JButton exit =  new JButton("Exit");
    JDialog dlog =  new JDialog();





   static public String selectedInSaveDB = "";

    ///////////////////////////////////////////////////////////////////////
//   static public JDialog dlog2 = new JDialog();
//
//
//    DefaultListModel data = new DefaultListModel();
//
//    JList listID  =  new JList(data);
//
//
//
//
//    JButton addButton =  new JButton("Save");
//    JButton cancel = new JButton("Cancel");
//
//    JScrollPane scroll2 =  new JScrollPane(listID);
//    static JTextField selected = new JTextField();
//




    //////////////////////////////////////////////////////////////////////////////////


    public Admin() {


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = (Integer) y / 2;
        widthdiv = (Integer) x / 2;

        setBackground(new Color(255, 220, 0));
        setLayout(null);

        contestantStatus.setBounds(45, 10, 200, 30);
        contestantStatus.setFont(new Font("Calibri", 1, 20));
        contestantStatus.setBackground(new Color(0, 168, 89));
        contestantStatus.setHorizontalAlignment(SwingConstants.CENTER);
        contestantStatus.setOpaque(true);
        contestantStatus.setForeground(Color.white);
        add(contestantStatus);

        comboBox();

        panelsAndTextFields();







        up.setBounds(45, 530, 80, 32);
        up.setBackground(new Color(0, 168, 89));
        up.setHorizontalAlignment(SwingConstants.CENTER);
        up.setForeground(Color.white);
        up.setFont(new Font("Calibri", 1, 17));
        add(up);

        up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {










                count = count + 1;


                if (count == 1){

                    makePanelsVisible2(panel,participant1);
                    panel.setPreferredSize(new Dimension(400,470));

                }


                if (count == 2){


                    makePanelsVisible2(panel,participant2);
                    panel.setPreferredSize(new Dimension(400,470));

                }

                if (count == 3)


                    makePanelsVisible2(panel,participant3);
                if(count == 4)
                    makePanelsVisible2(panel,participant4);
                if (count == 5)
                    makePanelsVisible2(panel,participant5);
                if(count == 6)
                    makePanelsVisible2(panel,participant6);
                if (count == 7)
                    makePanelsVisible2(panel,participant7);
                if(count == 8)
                    makePanelsVisible2(panel,participant8);
                if (count == 9)
                    makePanelsVisible2(panel,participant9);
                if(count == 10)
                    makePanelsVisible2(panel,participant10);
                if (count == 11)
                    makePanelsVisible(panel,participant11);
                if(count == 12)
                    makePanelsVisible(panel,participant12);
                if (count == 13)
                    makePanelsVisible(panel,participant13);
                if(count == 14)
                    makePanelsVisible(panel,participant14);
                if (count == 15)
                    makePanelsVisible(panel,participant15);
                if(count == 16)
                    makePanelsVisible(panel,participant16);
                if (count == 17)
                    makePanelsVisible(panel,participant17);
                if(count == 18)
                    makePanelsVisible(panel,participant18);
                if (count == 19)
                    makePanelsVisible(panel,participant19);
                if(count == 20)
                    makePanelsVisible(panel,participant20);
                if (count == 21)
                    makePanelsVisible(panel,participant21);
                if(count == 22)
                    makePanelsVisible(panel,participant22);
                if (count == 23)
                    makePanelsVisible(panel,participant23);
                if(count == 24)
                    makePanelsVisible(panel,participant24);
                if (count == 25)
                    makePanelsVisible(panel,participant25);
                if(count == 26)
                    makePanelsVisible(panel,participant26);
                if (count == 27)
                    makePanelsVisible(panel,participant27);
                if(count == 28)
                    makePanelsVisible(panel,participant28);
                if (count == 29)
                    makePanelsVisible(panel,participant29);
                if(count == 30)
                    makePanelsVisible(panel,participant30);
                if (count == 31)
                    makePanelsVisible(panel,participant31);
                if(count == 32)
                    makePanelsVisible(panel,participant32);
                if (count == 33)
                    makePanelsVisible(panel,participant33);
                if(count == 34)
                    makePanelsVisible(panel,participant34);
                if (count == 35)
                    makePanelsVisible(panel,participant35);
                if(count == 36)
                    makePanelsVisible(panel,participant36);
                if (count == 37)
                    makePanelsVisible(panel,participant37);
                if(count == 38)
                    makePanelsVisible(panel,participant38);
                if (count == 39)
                    makePanelsVisible(panel,participant39);
                if(count == 40)
                    makePanelsVisible(panel,participant40);
                if (count == 41)
                    makePanelsVisible(panel,participant41);
                if(count == 42)
                    makePanelsVisible(panel,participant42);
                if (count == 43)
                    makePanelsVisible(panel,participant43);
                if(count == 44)
                    makePanelsVisible(panel,participant44);
                if (count == 45)
                    makePanelsVisible(panel,participant45);
                if(count == 46)
                    makePanelsVisible(panel,participant46);
                if (count == 47)
                    makePanelsVisible(panel,participant47);
                if(count == 48)
                    makePanelsVisible(panel,participant48);
                if (count == 49)
                    makePanelsVisible(panel,participant49);
                if(count == 50)
                    makePanelsVisible(panel,participant50);
                if (count == 51)
                    makePanelsVisible(panel,participant51);
                if(count == 52)
                    makePanelsVisible(panel,participant52);
                if (count == 53)
                    makePanelsVisible(panel,participant53);
                if(count == 54)
                    makePanelsVisible(panel,participant54);
                if (count == 55)
                    makePanelsVisible(panel,participant55);
                if(count == 56)
                    makePanelsVisible(panel,participant56);
                if (count == 57)
                    makePanelsVisible(panel,participant57);
                if(count == 58)
                    makePanelsVisible(panel,participant58);
                if (count == 59)
                    makePanelsVisible(panel,participant59);
                if(count == 60)
                    makePanelsVisible(panel,participant60);
                if (count == 61)
                    makePanelsVisible(panel,participant61);
                if(count == 62)
                    makePanelsVisible(panel,participant62);
                if (count == 63)
                    makePanelsVisible(panel,participant63);
                if(count == 64)
                    makePanelsVisible(panel,participant64);
                if (count == 65)
                    makePanelsVisible(panel,participant65);
                if(count == 66)
                    makePanelsVisible(panel,participant66);
                if (count == 67)
                    makePanelsVisible2(panel,participant67);
                if(count == 68)
                    makePanelsVisible2(panel,participant68);
                if (count == 69)
                    makePanelsVisible2(panel,participant69);
                if(count == 70)
                    makePanelsVisible2(panel,participant70);
                if(count == 71)
                    makePanelsVisible2(panel,participant71);
                if (count == 72)
                    makePanelsVisible2(panel,participant72);
                if(count == 73)
                    makePanelsVisible2(panel,participant73);
                if (count == 74)
                    makePanelsVisible2(panel,participant74);
                if(count == 75)
                    makePanelsVisible2(panel,participant75);
                if(count == 76)
                    makePanelsVisible2(panel,participant76);
                if (count == 77)
                    makePanelsVisible2(panel,participant77);
                if(count == 78)
                    makePanelsVisible2(panel,participant78);
                if (count == 79)
                    makePanelsVisible2(panel,participant79);
                if(count == 80)
                    makePanelsVisible2(panel,participant80);
                if(count == 81)
                    makePanelsVisible2(panel,participant81);
                if (count == 82)
                    makePanelsVisible2(panel,participant82);
                if(count == 83)
                    makePanelsVisible2(panel,participant83);
                if (count == 84)
                    makePanelsVisible2(panel,participant84);
                if(count == 85)
                    makePanelsVisible2(panel,participant85);
                if(count == 86)
                    makePanelsVisible2(panel,participant86);
                if (count == 87)
                    makePanelsVisible2(panel,participant87);
                if(count == 88)
                    makePanelsVisible2(panel,participant88);
                if (count == 89)
                    makePanelsVisible2(panel,participant89);
                if(count == 90)
                    makePanelsVisible2(panel,participant90);
                if(count == 91)
                    makePanelsVisible2(panel,participant91);
                if (count == 92)
                    makePanelsVisible2(panel,participant92);
                if(count == 93)
                    makePanelsVisible2(panel,participant93);
                if (count == 94)
                    makePanelsVisible2(panel,participant94);
                if(count == 95)
                    makePanelsVisible2(panel,participant95);
                if(count == 96)
                    makePanelsVisible2(panel,participant96);
                if (count == 97)
                    makePanelsVisible2(panel,participant97);
                if(count == 98)
                    makePanelsVisible2(panel,participant98);
                if (count == 99)
                    makePanelsVisible2(panel,participant99);
                if(count == 100)
                    makePanelsVisible2(panel,participant100);


                System.out.println(count);




            }
        });

        down.setBounds(140, 530, 100, 32);
        down.setBackground(new Color(0, 168, 89));
        down.setEnabled(false);
        down.setHorizontalAlignment(SwingConstants.CENTER);
        down.setFont(new Font("Calibri", 1, 17));
        down.setForeground(Color.white);
        down.setVisible(false);
        add(down);


        down.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                count = count - 1;


                if(count == 0){


                    makePanelsHidden(participant1, panel, part1name, part1name2, part1name3, part1name4, part1name5, part1name6);
                    panel.setPreferredSize(new Dimension(400,470));

                }


                if (count == 1){
                    makePanelsHidden(participant2, panel, part2name, part2name2, part2name3, part2name4, part2name5, part2name6);
                panel.setPreferredSize(new Dimension(400,470)); }

                if (count == 2){
                    makePanelsHidden(participant3, panel, part3name, part3name2, part3name3, part3name4, part3name5, part3name6);
                panel.setPreferredSize(new Dimension(400,470));}
                if (count == 3)
                    makePanelsHidden(participant4, panel, part4name, part4name2, part4name3, part4name4, part4name5, part4name6);
                if (count == 4)
                     makePanelsHidden(participant5, panel, part5name, part5name2,part5name3, part5name4, part5name5, part5name6);
                if (count == 5)
                    makePanelsHidden(participant6, panel, part6name, part6name2, part6name3, part6name4, part6name5, part6name6);
                if (count == 6)
                    makePanelsHidden(participant7, panel, part7name, part7name2,part7name3, part7name4, part7name5, part7name6);
                if (count == 7)
                    makePanelsHidden(participant8, panel, part8name, part8name2, part8name3, part8name4, part8name5, part8name6);
                if (count == 8)
                    makePanelsHidden(participant9, panel, part9name, part9name2,part9name3, part9name4, part9name5, part9name6);
                if (count == 9)
                    makePanelsHidden(participant10, panel, part10name, part10name2, part10name3, part10name4, part10name5, part10name6);
                if (count == 10)
                    makePanelsHidden(participant11, panel, part11name, part11name2,part11name3, part11name4, part11name5, part11name6);
                if (count == 11)
                    makePanelsHidden(participant12, panel, part12name, part12name2,part12name3, part12name4, part12name5, part12name6);
                if (count == 12)
                    makePanelsHidden(participant13, panel, part13name, part13name2,part13name3, part13name4, part13name5, part13name6);
                if (count == 13)
                    makePanelsHidden(participant14, panel, part14name, part14name2,part14name3, part14name4, part14name5, part14name6);
                if (count == 14)
                    makePanelsHidden(participant15, panel, part15name, part15name2,part15name3, part15name4, part15name5, part15name6);
                if (count == 15)
                    makePanelsHidden(participant16, panel, part16name, part16name2,part16name3, part16name4, part16name5, part16name6);
                if (count == 16)
                    makePanelsHidden(participant17, panel, part17name, part17name2,part17name3, part17name4, part17name5, part17name6);
                if (count == 17)
                    makePanelsHidden(participant18, panel, part18name, part18name2,part18name3, part18name4, part18name5, part18name6);
                if (count == 18)
                    makePanelsHidden(participant19, panel, part19name, part19name2,part19name3, part19name4, part19name5, part19name6);
                if (count == 19)
                    makePanelsHidden(participant20, panel, part20name, part20name2,part20name3, part20name4, part20name5, part20name6);
                if (count == 20)
                    makePanelsHidden(participant21, panel, part21name, part21name2,part21name3, part21name4, part21name5, part21name6);
                if (count == 21)
                    makePanelsHidden(participant22, panel, part22name, part22name2,part22name3, part22name4, part22name5, part22name6);
                if (count == 22)
                    makePanelsHidden(participant23, panel, part23name, part23name2,part23name3, part23name4, part23name5, part23name6);
                if (count == 23)
                    makePanelsHidden(participant24, panel, part24name, part24name2,part24name3, part24name4, part24name5, part24name6);
                if (count == 24)
                    makePanelsHidden(participant25, panel, part25name, part25name2,part25name3, part25name4, part25name5, part25name6);
                if (count == 25)
                    makePanelsHidden(participant26, panel, part26name, part26name2,part26name3, part26name4, part26name5, part26name6);
                if (count == 26)
                    makePanelsHidden(participant27, panel, part27name, part27name2,part27name3, part27name4, part27name5, part27name6);
                if (count == 27)
                    makePanelsHidden(participant28, panel, part28name, part28name2,part28name3, part28name4, part28name5, part28name6);
                if (count == 28)
                    makePanelsHidden(participant29, panel, part29name, part29name2,part29name3, part29name4, part29name5, part29name6);
                if (count == 29)
                    makePanelsHidden(participant30, panel, part30name, part30name2,part30name3, part30name4, part30name5, part30name6);
                if (count == 30)
                    makePanelsHidden(participant31, panel, part31name, part31name2,part31name3, part31name4, part31name5, part31name6);
                if (count == 31)
                    makePanelsHidden(participant32, panel, part32name, part32name2,part32name3, part32name4, part32name5, part32name6);
                if (count == 32)
                    makePanelsHidden(participant33, panel, part33name, part33name2,part33name3, part33name4, part33name5, part33name6);
                if (count == 33)
                    makePanelsHidden(participant34, panel, part34name, part34name2,part34name3, part34name4, part34name5, part34name6);
                if (count == 34)
                    makePanelsHidden(participant35, panel, part35name, part35name2,part35name3, part35name4, part35name5, part35name6);
                if (count == 35)
                    makePanelsHidden(participant36, panel, part36name, part36name2,part36name3, part36name4, part36name5, part36name6);
                if (count == 36)
                    makePanelsHidden(participant37, panel, part37name, part37name2,part37name3, part37name4, part37name5, part37name6);
                if (count == 37)
                    makePanelsHidden(participant38, panel, part38name, part38name2,part38name3, part38name4, part38name5, part38name6);
                if (count == 38)
                    makePanelsHidden(participant39, panel, part39name, part39name2,part39name3, part39name4, part39name5, part39name6);
                if (count == 39)
                    makePanelsHidden(participant40, panel, part40name, part40name2,part40name3, part40name4, part40name5, part40name6);
                if (count == 40)
                    makePanelsHidden(participant41, panel, part41name, part41name2,part41name3, part41name4, part41name5, part41name6);
                if (count == 41)
                    makePanelsHidden(participant42, panel, part42name, part42name2,part42name3, part42name4, part42name5, part42name6);
                if (count == 42)
                    makePanelsHidden(participant43, panel, part43name, part43name2,part43name3, part43name4, part43name5, part43name6);
                if (count == 43)
                    makePanelsHidden(participant44, panel, part44name, part44name2,part44name3, part44name4, part44name5, part44name6);
                if (count == 44)
                    makePanelsHidden(participant45, panel, part45name, part45name2,part45name3, part45name4, part45name5, part45name6);
                if (count == 45)
                    makePanelsHidden(participant46, panel, part46name, part46name2,part46name3, part46name4, part46name5, part46name6);
                if (count == 46)
                    makePanelsHidden(participant47, panel, part47name, part47name2,part47name3, part47name4, part47name5, part47name6);
                if (count == 47)
                    makePanelsHidden(participant48, panel, part48name, part48name2,part48name3, part48name4, part48name5, part48name6);
                if (count == 48)
                    makePanelsHidden(participant49, panel, part49name, part49name2,part49name3, part49name4, part49name5, part49name6);
                if (count == 49)
                    makePanelsHidden(participant50, panel, part50name, part50name2,part50name3, part50name4, part50name5, part50name6);
                if (count == 50)
                    makePanelsHidden(participant51, panel, part51name, part51name2,part51name3, part51name4, part51name5, part51name6);
                if (count == 51)
                    makePanelsHidden(participant52, panel, part52name, part52name2,part52name3, part52name4, part52name5, part52name6);
                if (count == 52)
                    makePanelsHidden(participant53, panel, part53name, part53name2,part53name3, part53name4, part53name5, part53name6);
                if (count == 53)
                    makePanelsHidden(participant54, panel, part54name, part54name2,part54name3, part54name4, part54name5, part54name6);
                if (count == 54)
                    makePanelsHidden(participant55, panel, part55name, part55name2,part55name3, part55name4, part55name5, part55name6);
                if (count == 55)
                    makePanelsHidden(participant56, panel, part56name, part56name2,part56name3, part56name4, part56name5, part56name6);
                if (count == 56)
                    makePanelsHidden(participant57, panel, part57name, part57name2,part57name3, part57name4, part57name5, part57name6);
                if (count == 57)
                    makePanelsHidden(participant58, panel, part58name, part58name2,part58name3, part58name4, part58name5, part58name6);
                if (count == 58)
                    makePanelsHidden(participant59, panel, part59name, part59name2,part59name3, part59name4, part59name5, part59name6);
                if (count == 59)
                    makePanelsHidden(participant60, panel, part60name, part60name2,part60name3, part60name4, part60name5, part60name6);
                if (count == 60)
                    makePanelsHidden(participant61, panel, part61name, part61name2,part61name3, part61name4, part61name5, part61name6);
                if (count == 61)
                    makePanelsHidden(participant62, panel, part62name, part62name2,part62name3, part62name4, part62name5, part62name6);
                if (count == 62)
                    makePanelsHidden(participant63, panel, part63name, part63name2,part63name3, part63name4, part63name5, part63name6);
                if (count == 63)
                    makePanelsHidden(participant64, panel, part64name, part64name2,part64name3, part64name4, part64name5, part64name6);
                if (count == 64)
                    makePanelsHidden(participant65, panel, part65name, part65name2,part65name3, part65name4, part65name5, part65name6);
                if (count == 65)
                    makePanelsHidden(participant66, panel, part66name, part66name2,part66name3, part66name4, part66name5, part66name6);
                if (count == 66)
                    makePanelsHidden(participant67, panel, part67name, part67name2,part67name3, part67name4, part67name5, part67name6);
                if (count == 67)
                    makePanelsHidden(participant68, panel, part68name, part68name2,part68name3, part68name4, part68name5, part68name6);
                if (count == 68)
                    makePanelsHidden(participant69, panel, part69name, part69name2,part69name3, part69name4, part69name5, part69name6);
                if (count == 69)
                    makePanelsHidden(participant70, panel, part70name, part70name2,part70name3, part70name4, part70name5, part70name6);
                if (count == 70)
                    makePanelsHidden(participant71, panel, part71name, part71name2,part71name3, part71name4, part71name5, part71name6);
                if (count == 71)
                    makePanelsHidden(participant72, panel, part72name, part72name2,part72name3, part72name4, part72name5, part72name6);
                if (count == 72)
                    makePanelsHidden(participant73, panel, part73name, part73name2,part73name3, part73name4, part73name5, part73name6);
                if (count == 73)
                    makePanelsHidden(participant74, panel, part74name, part74name2,part74name3, part74name4, part74name5, part74name6);
                if (count == 74)
                    makePanelsHidden(participant75, panel, part75name, part75name2,part75name3, part75name4, part75name5, part75name6);
                if (count == 75)
                    makePanelsHidden(participant76, panel, part76name, part76name2,part76name3, part76name4, part76name5, part76name6);
                if (count == 76)
                    makePanelsHidden(participant77, panel, part77name, part77name2,part77name3, part77name4, part77name5, part77name6);
                if (count == 77)
                    makePanelsHidden(participant78, panel, part78name, part78name2,part78name3, part78name4, part78name5, part78name6);
                if (count == 78)
                    makePanelsHidden(participant79, panel, part79name, part79name2,part79name3, part79name4, part79name5, part79name6);
                if (count == 79)
                    makePanelsHidden(participant80, panel, part80name, part80name2,part80name3, part80name4, part80name5, part80name6);
                if (count == 80)
                    makePanelsHidden(participant81, panel, part81name, part81name2,part81name3, part81name4, part81name5, part81name6);
                if (count == 81)
                    makePanelsHidden(participant82, panel, part82name, part82name2,part82name3, part82name4, part82name5, part82name6);
                if (count == 82)
                    makePanelsHidden(participant83, panel, part83name, part83name2,part83name3, part83name4, part83name5, part83name6);
                if (count == 83)
                    makePanelsHidden(participant84, panel, part84name, part84name2,part84name3, part84name4, part84name5, part84name6);
                if (count == 84)
                    makePanelsHidden(participant85, panel, part85name, part85name2,part85name3, part85name4, part85name5, part85name6);
                if (count == 85)
                    makePanelsHidden(participant86, panel, part86name, part86name2,part86name3, part86name4, part86name5, part86name6);
                if (count == 86)
                    makePanelsHidden(participant87, panel, part87name, part87name2,part87name3, part87name4, part87name5, part87name6);
                if (count == 87)
                    makePanelsHidden(participant88, panel, part88name, part88name2,part88name3, part88name4, part88name5, part88name6);
                if (count == 88)
                    makePanelsHidden(participant89, panel, part89name, part89name2,part89name3, part89name4, part89name5, part89name6);
                if (count == 89)
                    makePanelsHidden(participant90, panel, part90name, part90name2,part90name3, part90name4, part90name5, part90name6);
                if (count == 90)
                    makePanelsHidden(participant91, panel, part91name, part91name2,part91name3, part91name4, part91name5, part91name6);
                if (count == 91)
                    makePanelsHidden(participant92, panel, part92name, part92name2,part92name3, part92name4, part92name5, part92name6);
                if (count == 92)
                    makePanelsHidden(participant93, panel, part93name, part93name2,part93name3, part93name4, part93name5, part93name6);
                if (count == 93)
                    makePanelsHidden(participant94, panel, part94name, part94name2,part94name3, part94name4, part94name5, part94name6);
                if (count == 94)
                    makePanelsHidden(participant95, panel, part95name, part95name2,part95name3, part95name4, part95name5, part95name6);
                if (count == 95)
                    makePanelsHidden(participant96, panel, part96name, part96name2,part96name3, part96name4, part96name5, part96name6);
                if (count == 96)
                    makePanelsHidden(participant97, panel, part97name, part97name2,part97name3, part97name4, part97name5, part97name6);
                if (count == 97)
                    makePanelsHidden(participant98, panel, part98name, part98name2,part98name3, part98name4, part98name5, part98name6);
                if (count == 98)
                    makePanelsHidden(participant99, panel, part99name, part99name2,part99name3, part99name4, part99name5, part99name6);
                if (count == 99)
                    makePanelsHidden(participant100, panel, part100name, part100name2,part100name3, part100name4, part100name5, part100name6);
                if (count == 100)
                    down.setVisible(false);
                    //makePanelsHidden(participant11, panel, part11name, part11name2,part11name3, part11name4, part11name5, part11name6);




                System.out.println(count);

                    panel.updateUI();

            }
        });


        go.setBounds(260, 530, 200, 32);
        go.setFont(new Font("Calibri", 1, 17));
        go.setHorizontalAlignment(SwingConstants.CENTER);
        go.setBackground(new Color(0, 168, 89));
        go.setForeground(Color.white);
        go.setEnabled(false);
        add(go);

        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                //goaction();
                //participantCount();
                new SaveDB();



            }

        });


        reset.setBounds(480, 530, 80, 30);
        reset.setBackground(new Color(250, 2, 2));
        reset.setFont(new Font("Calibri", 1, 17));
        reset.setHorizontalAlignment(SwingConstants.CENTER);
        reset.setForeground(Color.white);
        add(reset);

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JOptionPane pane = new JOptionPane("Are you really sure you want to reset? You will lose all unsaved records!", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION);
                JDialog dialog = pane.createDialog(null, "Reset");
                dialog.show();
                String selectedValue = pane.getValue().toString();
                System.out.print(selectedValue);

                try{




                    if(selectedValue.equals("0")){

                        comboBox();
                        totalReset();

                    }
                    else{

                        dialog.show(false);
                    }


                }catch (java.lang.NullPointerException d){dialog.show(false);}
                catch (Exception er){dialog.show(false);}




            }
        });


        exit.setBounds(580, 530, 80, 30);
        exit.setBackground(new Color(6, 125, 248));
        exit.setFont(new Font("Calibri", 1, 17));
        exit.setHorizontalAlignment(SwingConstants.CENTER);
        exit.setForeground(Color.white);
        add(exit);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JOptionPane pane = new JOptionPane("Are you really sure you want to exit?", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION);
                JDialog dialog = pane.createDialog(null, "Exit");
                dialog.show();
                String selectedValue = pane.getValue().toString();
                System.out.print(selectedValue);
                if(selectedValue.equals("0")){

                    totalReset();
                    HolderPage.content.removeAll();

                    HolderPage.content.add(new Entry());

                    HolderPage.content.updateUI();

                    HolderPage.f.setTitle("QuizApp 2016 - New Quiz");


                }
                else{

                    dialog.show(false);
                }



            }
        });




        retrieve.setBounds(720, 10, 100, 30);
        retrieve.setFont(new Font("Calibri", 1, 17));
        retrieve.setHorizontalAlignment(SwingConstants.CENTER);
        retrieve.setBackground(new Color(0, 168, 89));
        retrieve.setForeground(Color.white);
        add(retrieve);

        retrieve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                RetrieveDB.retrieveDB();

            }
        });


        combo.setBounds(400, 10, 300, 30);
        combo.setFont(new Font("Calibri", 1, 17));;
        add(combo);

        refresh.setBounds(840, 10, 100, 30);
        refresh.setFont(new Font("Calibri", 1, 17));
        refresh.setHorizontalAlignment(SwingConstants.CENTER);
        refresh.setBackground(new Color(0, 168, 89));
        refresh.setForeground(Color.white);
        add(refresh);

        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                comboBox();
            }
        });

        newDB.setBounds(270, 10, 100, 30);
        newDB.setFont(new Font("Calibri", 1, 17));
        newDB.setHorizontalAlignment(SwingConstants.CENTER);
        newDB.setBackground(new Color(0, 168, 89));
        newDB.setForeground(Color.white);
        add(newDB);

        newDB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                new NewDB();
                //NewDB.dlog.show(true);




            }
        });


        panel.setLayout(layout);
        panel.setBackground(new Color(0, 168, 89));
        panel.setPreferredSize(new Dimension(800,450));

        scroll = new JScrollPane(panel);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(45,50,900,470);
        scroll.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2,true),"Questions Tab", 1,2,new Font("Calibri",1,18),Color.red));
        scroll.setAutoscrolls(true);
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        scroll.getViewport().putClientProperty("EnableWindowBlit", Boolean.TRUE);
        scroll.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
        add(scroll);




    }






    public void goaction(){


        String name1SQL = part1name.getText();
        String name2SQL = part2name.getText();
        String name3SQL = part3name.getText();
        String name4SQL = part4name.getText();
        String name5SQL = part5name.getText();
        String name6SQL = part6name.getText();




        PreparedStatement ps = null;
        Connection conn = null;

        try {


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");


            ps = conn.prepareStatement("DELETE FROM Participants WHERE id = '1'");
            ps.execute();
            ps = conn.prepareStatement("DELETE FROM Participants WHERE id = '2'");
            ps.execute();
            ps = conn.prepareStatement("DELETE FROM Participants WHERE id = '3'");
            ps.execute();
            ps = conn.prepareStatement("DELETE FROM Participants WHERE id = '4'");
            ps.execute();
            ps = conn.prepareStatement("DELETE FROM Participants WHERE id = '5'");
            ps.execute();
            ps = conn.prepareStatement("DELETE FROM Participants WHERE id = '6'");
            ps.execute();


            ps = conn.prepareStatement ("INSERT INTO Participants (id,  participant) "+ "VALUES (? , ? )");

            if(count ==  1){

                ps.setString (1, "1");
                ps.setString (2, name1SQL);

                ps.executeUpdate();

            }

            if(count == 2){

                ps.setString (1, "1");
                ps.setString (2, name1SQL);

                ps.executeUpdate();

                ps.setString (1, "2");
                ps.setString (2, name2SQL);

                ps.executeUpdate();

            }

            if(count == 3){

                ps.setString (1, "1");
                ps.setString (2, name1SQL);

                ps.executeUpdate();

                ps.setString (1, "2");
                ps.setString (2, name2SQL);

                ps.executeUpdate();

                ps.setString (1, "3");
                ps.setString (2, name3SQL);

                ps.executeUpdate();

            }

            if(count == 4){

                ps.setString (1, "1");
                ps.setString (2, name1SQL);

                ps.executeUpdate();

                ps.setString (1, "2");
                ps.setString (2, name2SQL);

                ps.executeUpdate();

                ps.setString (1, "3");
                ps.setString (2, name3SQL);

                ps.executeUpdate();

                ps.setString (1, "4");
                ps.setString (2, name4SQL);

                ps.executeUpdate();

            }

            if(count == 5){

                ps.setString (1, "1");
                ps.setString (2, name1SQL);

                ps.executeUpdate();

                ps.setString (1, "2");
                ps.setString (2, name2SQL);

                ps.executeUpdate();

                ps.setString (1, "3");
                ps.setString (2, name3SQL);

                ps.executeUpdate();

                ps.setString (1, "4");
                ps.setString (2, name4SQL);

                ps.executeUpdate();

                ps.setString (1, "5");
                ps.setString (2, name5SQL);

                ps.executeUpdate();

            }

            JOptionPane.showMessageDialog(null, "Database Updated", "SUCCESS", JOptionPane.PLAIN_MESSAGE);

            go.setEnabled(false);
        }



        catch ( SQLException sqlException )
        {
            sqlException.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in Uploading records", "FAILURE", JOptionPane.PLAIN_MESSAGE);
            go.setEnabled(true);
            //JOptionPane.showMessageDialog(null, "Please fill all fields!");

        } // end catch
        catch ( ClassNotFoundException classNotFound )
        {
            classNotFound.printStackTrace();

        } // end catch
        finally // ensure statement and connection are closed properly
        {
            try
            {
                ps.close();
                conn.close();
            } // end try
            catch ( Exception exception )
            {
                exception.printStackTrace();

            } // end catch
        } // end finally


        part1name.setEditable(false);
        part2name.setEditable(false);
        part3name.setEditable(false);
        part4name.setEditable(false);
        part5name.setEditable(false);

        up.setEnabled(false);
        down.setEnabled(false);
        retrieve.setEnabled(false);




    }













    public void panelsAndTextFields(){

        addComponents(part1name, part1name2, part1name3, part1name4, part1name5, part1name6, part1ID, participant1, panel);
        addComponents(part2name, part2name2, part2name3, part2name4, part2name5, part2name6, part2ID, participant2, panel);
        addComponents(part3name, part3name2, part3name3, part3name4, part3name5, part3name6,part3ID, participant3, panel);
        addComponents(part4name, part4name2, part4name3, part4name4, part4name5, part4name6,part4ID, participant4, panel);
        addComponents(part5name, part5name2, part5name3, part5name4, part5name5, part5name6, part5ID, participant5, panel);
        addComponents(part6name, part6name2, part6name3, part6name4, part6name5, part6name6,part6ID, participant6, panel);
        addComponents(part7name, part7name2, part7name3, part7name4, part7name5, part7name6,part7ID, participant7, panel);
        addComponents(part8name, part8name2, part8name3, part8name4, part8name5, part8name6,part8ID, participant8, panel);
        addComponents(part9name, part9name2, part9name3, part9name4, part9name5, part9name6,part9ID, participant9, panel);
        addComponents(part10name, part10name2, part10name3, part10name4, part10name5, part10name6, part10ID, participant10, panel);
        addComponents(part11name, part11name2, part11name3, part11name4, part11name5, part11name6,part11ID, participant11, panel);
        addComponents(part12name, part12name2, part12name3, part12name4, part12name5, part12name6,part12ID, participant12, panel);
        addComponents(part13name, part13name2, part12name3, part13name4, part13name5, part13name6,part13ID, participant13, panel);
        addComponents(part14name, part14name2, part14name3, part14name4, part14name5, part14name6,part14ID, participant14, panel);
        addComponents(part15name, part15name2, part15name3, part15name4, part15name5, part15name6,part15ID, participant15, panel);
        addComponents(part16name, part16name2, part16name3, part16name4, part16name5, part16name6,part16ID, participant16, panel);
        addComponents(part17name, part17name2, part17name3, part17name4, part17name5, part17name6,part17ID, participant17, panel);
        addComponents(part18name, part18name2, part18name3, part18name4, part18name5, part18name6,part18ID, participant18, panel);
        addComponents(part19name, part19name2, part19name3, part19name4, part19name5, part19name6,part19ID, participant19, panel);
        addComponents(part20name, part20name2, part20name3, part20name4, part20name5, part20name6,part20ID, participant20, panel);
        addComponents(part21name, part21name2, part21name3, part21name4, part21name5, part21name6,part21ID, participant21, panel);
        addComponents(part22name, part22name2, part22name3, part22name4, part22name5, part22name6,part22ID, participant22, panel);
        addComponents(part23name, part23name2, part23name3, part23name4, part23name5, part23name6,part23ID, participant23, panel);
        addComponents(part24name, part24name2, part24name3, part24name4, part24name5, part24name6,part24ID, participant24, panel);
        addComponents(part25name, part25name2, part25name3, part25name4, part25name5, part25name6,part25ID, participant25, panel);
        addComponents(part26name, part26name2, part26name3, part26name4, part26name5, part26name6,part26ID, participant26, panel);
        addComponents(part27name, part27name2, part27name3, part27name4, part27name5, part27name6,part27ID, participant27, panel);
        addComponents(part28name, part28name2, part28name3, part28name4, part28name5, part28name6,part28ID, participant28, panel);
        addComponents(part29name, part29name2, part29name3, part29name4, part29name5, part29name6,part29ID, participant29, panel);
        addComponents(part30name, part30name2, part30name3, part30name4, part30name5, part30name6,part30ID, participant30, panel);
        addComponents(part31name, part31name2, part31name3, part31name4, part31name5, part31name6,part31ID, participant31, panel);
        addComponents(part32name, part32name2, part32name3, part32name4, part32name5, part32name6,part32ID, participant32, panel);
        addComponents(part33name, part33name2, part33name3, part33name4, part33name5, part33name6,part33ID, participant33, panel);
        addComponents(part34name, part34name2, part34name3, part34name4, part34name5, part34name6,part34ID, participant34, panel);
        addComponents(part35name, part35name2, part35name3, part35name4, part35name5, part35name6,part35ID, participant35, panel);
        addComponents(part36name, part36name2, part36name3, part36name4, part36name5, part36name6,part36ID, participant36, panel);
        addComponents(part37name, part37name2, part37name3, part37name4, part37name5, part37name6,part37ID, participant37, panel);
        addComponents(part38name, part38name2, part38name3, part38name4, part38name5, part38name6,part38ID, participant38, panel);
        addComponents(part39name, part39name2, part39name3, part39name4, part39name5, part39name6,part39ID, participant39, panel);
        addComponents(part40name, part40name2, part40name3, part40name4, part40name5, part40name6,part40ID, participant40, panel);
        addComponents(part41name, part41name2, part41name3, part41name4, part41name5, part41name6,part41ID, participant41, panel);
        addComponents(part42name, part42name2, part42name3, part42name4, part42name5, part42name6,part42ID, participant42, panel);
        addComponents(part43name, part43name2, part43name3, part43name4, part43name5, part43name6,part43ID, participant43, panel);
        addComponents(part44name, part44name2, part44name3, part44name4, part44name5, part44name6,part44ID, participant44, panel);
        addComponents(part45name, part45name2, part45name3, part45name4, part45name5, part45name6,part45ID, participant45, panel);
        addComponents(part46name, part46name2, part46name3, part46name4, part46name5, part46name6,part46ID, participant46, panel);
        addComponents(part47name, part47name2, part47name3, part47name4, part47name5, part47name6,part47ID, participant47, panel);
        addComponents(part48name, part48name2, part48name3, part48name4, part48name5, part48name6,part48ID, participant48, panel);
        addComponents(part49name, part49name2, part49name3, part49name4, part49name5, part49name6,part49ID, participant49, panel);
        addComponents(part50name, part50name2, part50name3, part50name4, part50name5, part50name6,part50ID, participant50, panel);
        addComponents(part51name, part51name2, part51name3, part51name4, part51name5, part51name6,part51ID, participant51, panel);
        addComponents(part52name, part52name2, part52name3, part52name4, part52name5, part52name6,part52ID, participant52, panel);
        addComponents(part53name, part53name2, part53name3, part53name4, part53name5, part53name6,part53ID, participant53, panel);
        addComponents(part54name, part54name2, part54name3, part54name4, part54name5, part54name6,part54ID, participant54, panel);
        addComponents(part55name, part55name2, part55name3, part55name4, part55name5, part55name6,part55ID, participant55, panel);
        addComponents(part56name, part56name2, part56name3, part56name4, part56name5, part56name6,part56ID, participant56, panel);
        addComponents(part57name, part57name2, part57name3, part57name4, part57name5, part57name6,part57ID, participant57, panel);
        addComponents(part58name, part58name2, part58name3, part58name4, part58name5, part58name6,part58ID, participant58, panel);
        addComponents(part59name, part59name2, part59name3, part59name4, part59name5, part59name6,part59ID, participant59, panel);
        addComponents(part60name, part60name2, part60name3, part60name4, part60name5, part60name6,part60ID, participant60, panel);
        addComponents(part61name, part61name2, part61name3, part61name4, part61name5, part61name6,part61ID, participant61, panel);
        addComponents(part62name, part62name2, part62name3, part62name4, part62name5, part62name6,part62ID, participant62, panel);
        addComponents(part63name, part63name2, part63name3, part63name4, part63name5, part63name6,part63ID, participant63, panel);
        addComponents(part64name, part64name2, part64name3, part64name4, part64name5, part64name6,part64ID, participant64, panel);
        addComponents(part65name, part65name2, part65name3, part65name4, part65name5, part65name6,part65ID, participant65, panel);
        addComponents(part66name, part66name2, part66name3, part66name4, part66name5, part66name6,part66ID, participant66, panel);
        addComponents(part67name, part67name2, part67name3, part67name4, part67name5, part67name6,part67ID, participant67, panel);
        addComponents(part68name, part68name2, part68name3, part68name4, part68name5, part68name6,part68ID, participant68, panel);
        addComponents(part69name, part69name2, part69name3, part69name4, part69name5, part69name6,part69ID, participant69, panel);
        addComponents(part70name, part70name2, part70name3, part70name4, part70name5, part70name6,part70ID, participant70, panel);
        addComponents(part71name, part71name2, part71name3, part71name4, part71name5, part71name6,part71ID, participant71, panel);
        addComponents(part72name, part72name2, part72name3, part72name4, part72name5, part72name6,part72ID, participant72, panel);
        addComponents(part73name, part73name2, part73name3, part73name4, part73name5, part73name6,part73ID, participant73, panel);
        addComponents(part74name, part74name2, part74name3, part74name4, part74name5, part74name6,part74ID, participant74, panel);
        addComponents(part75name, part75name2, part75name3, part75name4, part75name5, part75name6,part75ID, participant75, panel);
        addComponents(part76name, part76name2, part76name3, part76name4, part76name5, part76name6,part76ID, participant76, panel);
        addComponents(part77name, part77name2, part77name3, part77name4, part77name5, part77name6,part77ID, participant77, panel);
        addComponents(part78name, part78name2, part78name3, part78name4, part78name5, part78name6,part78ID, participant78, panel);
        addComponents(part79name, part79name2, part79name3, part79name4, part79name5, part79name6,part79ID, participant79, panel);
        addComponents(part80name, part80name2, part80name3, part80name4, part80name5, part80name6,part80ID, participant80, panel);
        addComponents(part81name, part81name2, part81name3, part81name4, part81name5, part81name6,part81ID, participant81, panel);
        addComponents(part82name, part82name2, part82name3, part82name4, part82name5, part82name6,part82ID, participant82, panel);
        addComponents(part83name, part83name2, part83name3, part83name4, part83name5, part83name6,part83ID, participant83, panel);
        addComponents(part84name, part84name2, part84name3, part84name4, part84name5, part84name6,part84ID, participant84, panel);
        addComponents(part85name, part85name2, part85name3, part85name4, part85name5, part85name6,part85ID, participant85, panel);
        addComponents(part86name, part86name2, part86name3, part86name4, part86name5, part86name6,part86ID, participant86, panel);
        addComponents(part87name, part87name2, part87name3, part87name4, part87name5, part87name6,part87ID, participant87, panel);
        addComponents(part88name, part88name2, part88name3, part88name4, part88name5, part88name6,part88ID, participant88, panel);
        addComponents(part89name, part89name2, part89name3, part89name4, part89name5, part89name6,part89ID, participant89, panel);
        addComponents(part90name, part90name2, part90name3, part90name4, part90name5, part90name6,part90ID, participant90, panel);
        addComponents(part91name, part91name2, part91name3, part91name4, part91name5, part91name6,part91ID, participant91, panel);
        addComponents(part92name, part92name2, part92name3, part92name4, part92name5, part92name6,part92ID, participant92, panel);
        addComponents(part93name, part93name2, part93name3, part93name4, part93name5, part93name6,part93ID, participant93, panel);
        addComponents(part94name, part94name2, part94name3, part94name4, part94name5, part94name6,part94ID, participant94, panel);
        addComponents(part95name, part95name2, part95name3, part95name4, part95name5, part95name6,part95ID, participant95, panel);
        addComponents(part96name, part96name2, part96name3, part96name4, part96name5, part96name6,part96ID, participant96, panel);
        addComponents(part97name, part97name2, part97name3, part97name4, part97name5, part97name6,part97ID, participant97, panel);
        addComponents(part98name, part98name2, part98name3, part98name4, part98name5, part98name6,part98ID, participant98, panel);
        addComponents(part99name, part99name2, part99name3, part99name4, part99name5, part99name6,part99ID, participant99, panel);
        addComponents(part100name, part100name2, part100name3, part100name4, part100name5, part100name6,part100ID, participant100, panel);


    }


    public static void contestantStatusProg(){

        if(count == 0){

            contestantStatus.setText("No Question!");
        }
        else if(count == 1){

            contestantStatus.setText("1 Question");
        }
        else if(count == 2){

            contestantStatus.setText("2 Questions");
        }
        else if(count == 3){

            contestantStatus.setText("3 Questions");
        }
        else if(count == 4){

            contestantStatus.setText("4 Questions");
        }
        else if(count == 5){

            contestantStatus.setText("5 Questions");
        }
        else if(count == 6){

            contestantStatus.setText("6 Questions");
        }
        else if(count == 7){

            contestantStatus.setText("7 Questions");
        }
        else if(count == 8){

            contestantStatus.setText("8 Questions");
        }
        else if(count == 9){

            contestantStatus.setText("9 Questions");
        }
        else if(count == 10){

            contestantStatus.setText("10 Questions");
        }
        else if(count == 11){

            contestantStatus.setText("11 Questions");
        }
        else if(count == 12){

            contestantStatus.setText("12 Questions");
        }
        else if(count == 13){

            contestantStatus.setText("13 Questions");
        }
        else if(count == 14){

            contestantStatus.setText("14 Questions");
        }
        else if(count == 15){

            contestantStatus.setText("15 Questions");
        }
        else if(count == 16){

            contestantStatus.setText("16 Questions");
        }
        else if(count == 17){

            contestantStatus.setText("17 Questions");
        }
        else if(count == 18){

            contestantStatus.setText("18 Questions");
        }
        else if(count == 19){

            contestantStatus.setText("19 Questions");
        }
        else if(count == 20){

            contestantStatus.setText("20 Questions");
        }
        else if(count == 21){

            contestantStatus.setText("21 Questions");
        }
        else if(count == 22){

            contestantStatus.setText("22 Questions");
        }
        else if(count == 23){

            contestantStatus.setText("23 Questions");
        }
        else if(count == 24){

            contestantStatus.setText("24 Questions");
        }
        else if(count == 25){

            contestantStatus.setText("25 Questions");
        }
        else if(count == 26){

            contestantStatus.setText("26 Questions");
        }
        else if(count == 27){

            contestantStatus.setText("27 Questions");
        }
        else if(count == 28){

            contestantStatus.setText("28 Questions");
        }
        else if(count == 29){

            contestantStatus.setText("29 Questions");
        }
        else if(count == 30){

            contestantStatus.setText("30 Questions");
        }
        else if(count == 31){

            contestantStatus.setText("31 Questions");
        }
        else if(count == 32){

            contestantStatus.setText("32 Questions");
        }
        else if(count == 33){

            contestantStatus.setText("33 Questions");
        }
        else if(count == 34){

            contestantStatus.setText("34 Questions");
        }
        else if(count == 35){

            contestantStatus.setText("35 Questions");
        }
        else if(count == 36){

            contestantStatus.setText("36 Questions");
        }
        else if(count == 37){

            contestantStatus.setText("37 Questions");
        }
        else if(count == 38){

            contestantStatus.setText("38 Questions");
        }
        else if(count == 39){

            contestantStatus.setText("39 Questions");
        }
        else if(count == 40){

            contestantStatus.setText("40 Questions");
        }
        else if(count == 41){

            contestantStatus.setText("41 Questions");
        }
        else if(count == 42){

            contestantStatus.setText("42 Questions");
        }
        else if(count == 43){

            contestantStatus.setText("43 Questions");
        }
        else if(count == 44){

            contestantStatus.setText("44 Questions");
        }
        else if(count == 45){

            contestantStatus.setText("45 Questions");
        }
        else if(count == 46){

            contestantStatus.setText("46 Questions");
        }
        else if(count == 47){

            contestantStatus.setText("47 Questions");
        }
        else if(count == 48){

            contestantStatus.setText("48 Questions");
        }
        else if(count == 49){

            contestantStatus.setText("49 Questions");
        }
        else if(count == 50){

            contestantStatus.setText("50 Questions");
        }
        else if(count == 51){

            contestantStatus.setText("51 Questions");
        }
        else if(count == 52){

            contestantStatus.setText("52 Questions");
        }
        else if(count == 53){

            contestantStatus.setText("53 Questions");
        }
        else if(count == 54){

            contestantStatus.setText("54 Questions");
        }
        else if(count == 55){

            contestantStatus.setText("55 Questions");
        }
        else if(count == 56){

            contestantStatus.setText("56 Questions");
        }
        else if(count == 57){

            contestantStatus.setText("57 Questions");
        }
        else if(count == 58){

            contestantStatus.setText("58 Questions");
        }
        else if(count == 59){

            contestantStatus.setText("59 Questions");
        }
        else if(count == 60){

            contestantStatus.setText("60 Questions");
        }
        else if(count == 61){

            contestantStatus.setText("61 Questions");
        }
        else if(count == 62){

            contestantStatus.setText("62 Questions");
        }
        else if(count == 63){

            contestantStatus.setText("63 Questions");
        }
        else if(count == 64){

            contestantStatus.setText("64 Questions");
        }
        else if(count == 65){

            contestantStatus.setText("65 Questions");
        }
        else if(count == 66){

            contestantStatus.setText("66 Questions");
        }
        else if(count == 67){

            contestantStatus.setText("67 Questions");
        }
        else if(count == 68){

            contestantStatus.setText("68 Questions");
        }
        else if(count == 69){

            contestantStatus.setText("69 Questions");
        }
        else if(count == 70){

            contestantStatus.setText("70 Questions");
        }
        else if(count == 71){

            contestantStatus.setText("71 Questions");
        }
        else if(count == 72){

            contestantStatus.setText("72 Questions");
        }
        else if(count == 73){

            contestantStatus.setText("73 Questions");
        }
        else if(count == 74){

            contestantStatus.setText("74 Questions");
        }
        else if(count == 75){

            contestantStatus.setText("75 Questions");
        }
        else if(count == 76){

            contestantStatus.setText("76 Questions");
        }
        else if(count == 77){

            contestantStatus.setText("77 Questions");
        }
        else if(count == 78){

            contestantStatus.setText("78 Questions");
        }
        else if(count == 79){

            contestantStatus.setText("79 Questions");
        }
        else if(count == 80){

            contestantStatus.setText("80 Questions");
        }
        else if(count == 81){

            contestantStatus.setText("81 Questions");
        }
        else if(count == 82){

            contestantStatus.setText("82 Questions");
        }
        else if(count == 83){

            contestantStatus.setText("83 Questions");
        }
        else if(count == 84){

            contestantStatus.setText("84 Questions");
        }
        else if(count == 85){

            contestantStatus.setText("85 Questions");
        }
        else if(count == 86){

            contestantStatus.setText("86 Questions");
        }
        else if(count == 87){

            contestantStatus.setText("87 Questions");
        }
        else if(count == 88){

            contestantStatus.setText("88 Questions");
        }
        else if(count == 89){

            contestantStatus.setText("89 Questions");
        }
        else if(count == 90){

            contestantStatus.setText("90 Questions");
        }
        else if(count == 91){

            contestantStatus.setText("91 Questions");
        }
        else if(count == 92){

            contestantStatus.setText("92 Questions");
        }
        else if(count == 93){

            contestantStatus.setText("93 Questions");
        }
        else if(count == 94){

            contestantStatus.setText("94 Questions");
        }
        else if(count == 95){

            contestantStatus.setText("95 Questions");
        }
        else if(count == 96){

            contestantStatus.setText("96 Questions");
        }
        else if(count == 97){

            contestantStatus.setText("97 Questions");
        }
        else if(count == 98){

            contestantStatus.setText("98 Questions");
        }
        else if(count == 99){

            contestantStatus.setText("99 Questions");
        }
        else if(count == 100){

            contestantStatus.setText("100 Contestants");
        }



    }



    public void totalReset(){





                    count = 0;
                    contestantStatusProg();

                    go.setEnabled(false);
                    up.setEnabled(true);
                    down.setEnabled(false);
                    retrieve.setEnabled(true);


                    makePanelsHidden(participant1, panel, part1name, part1name2, part1name3, part1name4, part1name5, part1name6);
                    makePanelsHidden(participant2, panel, part2name, part2name2, part2name3, part2name4, part2name5, part2name6);
                    makePanelsHidden(participant3, panel, part3name, part3name2, part3name3, part3name4, part3name5, part3name6);
                    makePanelsHidden(participant4, panel, part4name, part4name2, part4name3, part4name4, part4name5, part4name6);
                    makePanelsHidden(participant5, panel, part5name, part5name2,part5name3, part5name4, part5name5, part5name6);
                    makePanelsHidden(participant6, panel, part6name, part6name2, part6name3, part6name4, part6name5, part6name6);
                    makePanelsHidden(participant7, panel, part7name, part7name2,part7name3, part7name4, part7name5, part7name6);
                    makePanelsHidden(participant8, panel, part8name, part8name2, part8name3, part8name4, part8name5, part8name6);
                    makePanelsHidden(participant9, panel, part9name, part9name2,part9name3, part9name4, part9name5, part9name6);
                    makePanelsHidden(participant10, panel, part10name, part10name2, part10name3, part10name4, part10name5, part10name6);
                    makePanelsHidden(participant11, panel, part11name, part11name2,part11name3, part11name4, part11name5, part11name6);
                    makePanelsHidden(participant12, panel, part12name, part12name2,part12name3, part12name4, part12name5, part12name6);
                    makePanelsHidden(participant13, panel, part13name, part13name2,part13name3, part13name4, part13name5, part13name6);
                    makePanelsHidden(participant14, panel, part14name, part14name2,part14name3, part14name4, part14name5, part14name6);
                    makePanelsHidden(participant15, panel, part15name, part15name2,part15name3, part15name4, part15name5, part15name6);
                    makePanelsHidden(participant16, panel, part16name, part16name2,part16name3, part16name4, part16name5, part16name6);
                    makePanelsHidden(participant17, panel, part17name, part17name2,part17name3, part17name4, part17name5, part17name6);
                    makePanelsHidden(participant18, panel, part18name, part18name2,part18name3, part18name4, part18name5, part18name6);
                    makePanelsHidden(participant19, panel, part19name, part19name2,part19name3, part19name4, part19name5, part19name6);
                    makePanelsHidden(participant20, panel, part20name, part20name2,part20name3, part20name4, part20name5, part20name6);
                    makePanelsHidden(participant21, panel, part21name, part21name2,part21name3, part21name4, part21name5, part21name6);
                    makePanelsHidden(participant22, panel, part22name, part22name2,part22name3, part22name4, part22name5, part22name6);
                    makePanelsHidden(participant23, panel, part23name, part23name2,part23name3, part23name4, part23name5, part23name6);
                    makePanelsHidden(participant24, panel, part24name, part24name2,part24name3, part24name4, part24name5, part24name6);
                    makePanelsHidden(participant25, panel, part25name, part25name2,part25name3, part25name4, part25name5, part25name6);
                    makePanelsHidden(participant26, panel, part26name, part26name2,part26name3, part26name4, part26name5, part26name6);
                    makePanelsHidden(participant27, panel, part27name, part27name2,part27name3, part27name4, part27name5, part27name6);
                    makePanelsHidden(participant28, panel, part28name, part28name2,part28name3, part28name4, part28name5, part28name6);
                    makePanelsHidden(participant29, panel, part29name, part29name2,part29name3, part29name4, part29name5, part29name6);
                    makePanelsHidden(participant30, panel, part30name, part30name2,part30name3, part30name4, part30name5, part30name6);
                    makePanelsHidden(participant31, panel, part31name, part31name2,part31name3, part31name4, part31name5, part31name6);
                    makePanelsHidden(participant32, panel, part32name, part32name2,part32name3, part32name4, part32name5, part32name6);
                    makePanelsHidden(participant33, panel, part33name, part33name2,part33name3, part33name4, part33name5, part33name6);
                    makePanelsHidden(participant34, panel, part34name, part34name2,part34name3, part34name4, part34name5, part34name6);
                    makePanelsHidden(participant35, panel, part35name, part35name2,part35name3, part35name4, part35name5, part35name6);
                    makePanelsHidden(participant36, panel, part36name, part36name2,part36name3, part36name4, part36name5, part36name6);
                    makePanelsHidden(participant37, panel, part37name, part37name2,part37name3, part37name4, part37name5, part37name6);
                    makePanelsHidden(participant38, panel, part38name, part38name2,part38name3, part38name4, part38name5, part38name6);
                    makePanelsHidden(participant39, panel, part39name, part39name2,part39name3, part39name4, part39name5, part39name6);
                    makePanelsHidden(participant40, panel, part40name, part40name2,part40name3, part40name4, part40name5, part40name6);
                    makePanelsHidden(participant41, panel, part41name, part41name2,part41name3, part41name4, part41name5, part41name6);
                    makePanelsHidden(participant42, panel, part42name, part42name2,part42name3, part42name4, part42name5, part42name6);
                    makePanelsHidden(participant43, panel, part43name, part43name2,part43name3, part43name4, part43name5, part43name6);
                    makePanelsHidden(participant44, panel, part44name, part44name2,part44name3, part44name4, part44name5, part44name6);
                    makePanelsHidden(participant45, panel, part45name, part45name2,part45name3, part45name4, part45name5, part45name6);
                    makePanelsHidden(participant46, panel, part46name, part46name2,part46name3, part46name4, part46name5, part46name6);
                    makePanelsHidden(participant47, panel, part47name, part47name2,part47name3, part47name4, part47name5, part47name6);
                    makePanelsHidden(participant48, panel, part48name, part48name2,part48name3, part48name4, part48name5, part48name6);
                    makePanelsHidden(participant49, panel, part49name, part49name2,part49name3, part49name4, part49name5, part49name6);
                    makePanelsHidden(participant50, panel, part50name, part50name2,part50name3, part50name4, part50name5, part50name6);
                    makePanelsHidden(participant51, panel, part51name, part51name2,part51name3, part51name4, part51name5, part51name6);
                    makePanelsHidden(participant52, panel, part52name, part52name2,part52name3, part52name4, part52name5, part52name6);
                    makePanelsHidden(participant53, panel, part53name, part53name2,part53name3, part53name4, part53name5, part53name6);
                    makePanelsHidden(participant54, panel, part54name, part54name2,part54name3, part54name4, part54name5, part54name6);
                    makePanelsHidden(participant55, panel, part55name, part55name2,part55name3, part55name4, part55name5, part55name6);
                    makePanelsHidden(participant56, panel, part56name, part56name2,part56name3, part56name4, part56name5, part56name6);
                    makePanelsHidden(participant57, panel, part57name, part57name2,part57name3, part57name4, part57name5, part57name6);
                    makePanelsHidden(participant58, panel, part58name, part58name2,part58name3, part58name4, part58name5, part58name6);
                    makePanelsHidden(participant59, panel, part59name, part59name2,part59name3, part59name4, part59name5, part59name6);
                    makePanelsHidden(participant60, panel, part60name, part60name2,part60name3, part60name4, part60name5, part60name6);
                    makePanelsHidden(participant61, panel, part61name, part61name2,part61name3, part61name4, part61name5, part61name6);
                    makePanelsHidden(participant62, panel, part62name, part62name2,part62name3, part62name4, part62name5, part62name6);
                    makePanelsHidden(participant63, panel, part63name, part63name2,part63name3, part63name4, part63name5, part63name6);
                    makePanelsHidden(participant64, panel, part64name, part64name2,part64name3, part64name4, part64name5, part64name6);
                    makePanelsHidden(participant65, panel, part65name, part65name2,part65name3, part65name4, part65name5, part65name6);
                    makePanelsHidden(participant66, panel, part66name, part66name2,part66name3, part66name4, part66name5, part66name6);
                    makePanelsHidden(participant67, panel, part67name, part67name2,part67name3, part67name4, part67name5, part67name6);
                    makePanelsHidden(participant68, panel, part68name, part68name2,part68name3, part68name4, part68name5, part68name6);
                    makePanelsHidden(participant69, panel, part69name, part69name2,part69name3, part69name4, part69name5, part69name6);
                    makePanelsHidden(participant70, panel, part70name, part70name2,part70name3, part70name4, part70name5, part70name6);
                    makePanelsHidden(participant71, panel, part71name, part71name2,part71name3, part71name4, part71name5, part71name6);
                    makePanelsHidden(participant72, panel, part72name, part72name2,part72name3, part72name4, part72name5, part72name6);
                    makePanelsHidden(participant73, panel, part73name, part73name2,part73name3, part73name4, part73name5, part73name6);
                    makePanelsHidden(participant74, panel, part74name, part74name2,part74name3, part74name4, part74name5, part74name6);
                    makePanelsHidden(participant75, panel, part75name, part75name2,part75name3, part75name4, part75name5, part75name6);
                    makePanelsHidden(participant76, panel, part76name, part76name2,part76name3, part76name4, part76name5, part76name6);
                    makePanelsHidden(participant77, panel, part77name, part77name2,part77name3, part77name4, part77name5, part77name6);
                    makePanelsHidden(participant78, panel, part78name, part78name2,part78name3, part78name4, part78name5, part78name6);
                    makePanelsHidden(participant79, panel, part79name, part79name2,part79name3, part79name4, part79name5, part79name6);
                    makePanelsHidden(participant80, panel, part80name, part80name2,part80name3, part80name4, part80name5, part80name6);
                    makePanelsHidden(participant81, panel, part81name, part81name2,part81name3, part81name4, part81name5, part81name6);
                    makePanelsHidden(participant82, panel, part82name, part82name2,part82name3, part82name4, part82name5, part82name6);
                    makePanelsHidden(participant83, panel, part83name, part83name2,part83name3, part83name4, part83name5, part83name6);
                    makePanelsHidden(participant84, panel, part84name, part84name2,part84name3, part84name4, part84name5, part84name6);
                    makePanelsHidden(participant85, panel, part85name, part85name2,part85name3, part85name4, part85name5, part85name6);
                    makePanelsHidden(participant86, panel, part86name, part86name2,part86name3, part86name4, part86name5, part86name6);
                    makePanelsHidden(participant87, panel, part87name, part87name2,part87name3, part87name4, part87name5, part87name6);
                    makePanelsHidden(participant88, panel, part88name, part88name2,part88name3, part88name4, part88name5, part88name6);
                    makePanelsHidden(participant89, panel, part89name, part89name2,part89name3, part89name4, part89name5, part89name6);
                    makePanelsHidden(participant90, panel, part90name, part90name2,part90name3, part90name4, part90name5, part90name6);
                    makePanelsHidden(participant91, panel, part91name, part91name2,part91name3, part91name4, part91name5, part91name6);
                    makePanelsHidden(participant92, panel, part92name, part92name2,part92name3, part92name4, part92name5, part92name6);
                    makePanelsHidden(participant93, panel, part93name, part93name2,part93name3, part93name4, part93name5, part93name6);
                    makePanelsHidden(participant94, panel, part94name, part94name2,part94name3, part94name4, part94name5, part94name6);
                    makePanelsHidden(participant95, panel, part95name, part95name2,part95name3, part95name4, part95name5, part95name6);
                    makePanelsHidden(participant96, panel, part96name, part96name2,part96name3, part96name4, part96name5, part96name6);
                    makePanelsHidden(participant97, panel, part97name, part97name2,part97name3, part97name4, part97name5, part97name6);
                    makePanelsHidden(participant98, panel, part98name, part98name2,part98name3, part98name4, part98name5, part98name6);
                    makePanelsHidden(participant99, panel, part99name, part99name2,part99name3, part99name4, part99name5, part99name6);
                    makePanelsHidden(participant100, panel, part100name, part100name2,part100name3, part100name4, part100name5, part100name6);

                    panel.setPreferredSize(new Dimension(400,470));

                    HolderPage.content.updateUI();



    }





    public void participantCount(){


        PreparedStatement ps = null;
        Connection conn = null;



        try {


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");


            ps = conn.prepareStatement("UPDATE QuizSettings SET attr = '"+count+"' WHERE id = '"+1+"'");
            ps.executeUpdate();
            conn.close();
            ps.close();


        }



        catch ( SQLException sqlException )
        {
            sqlException.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in Uploading records", "FAILURE", JOptionPane.PLAIN_MESSAGE);

        } // end catch
        catch ( ClassNotFoundException classNotFound )
        {
            classNotFound.printStackTrace();

        } // end catch






        String participantsCount = count + "";
        participantMax = count + 1;

        String max = participantMax + "";
        RandomAccessFile conf;


        String quizCount = startCount + "";


        try{

            conf = new RandomAccessFile("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\DB\\participants", "rw");
            //conf.seek(0);
            conf.writeBytes(participantsCount + "\n");
            conf.writeBytes(max + "\n");
            conf.writeBytes(quizCount);


        }
        catch (Exception exception)
        {
            System.out.println("config-file read error: " + exception.toString());
        }


    }




    public void addComponents(JTextField name1, JTextField name2, JTextField name3, JTextField name4,
                              JTextField name5, JTextField name6,  JTextField id, JPanel panel, JPanel mainPain){

        name1.setBounds(10,20,780,30); name2.setBounds(10,60,350,30); name3.setBounds(400,60,350,30);
        name4.setBounds(10,100,350,30); name5.setBounds(400,100,350,30); name6.setBounds(200,140,400,30);
        name1.setFont(new Font("Calibri", 1, 15)); name2.setFont(new Font("Calibri", 1, 15));
        name3.setFont(new Font("Calibri", 1, 15)); name4.setFont(new Font("Calibri", 1, 15));
        name5.setFont(new Font("Calibri", 1, 15)); name6.setFont(new Font("Calibri", 1, 15));
        panel.add(name1); panel.add(name2); panel.add(name3); panel.add(name4); panel.add(name5); panel.add(name6);
        mainPain.add(panel);

        panel.setLayout(null); panel.setPreferredSize(new Dimension(800,190));
       // panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.blue,1), "Question " + id.getText()));
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2,true),"Question  " + id.getText(), 2,2,new Font("Calibri",1,15),Color.red));
        panel.setBackground(Color.white);
        panel.setVisible(false);

    }



    public void makePanelsVisible(JPanel panels, JPanel mainPanels ){

        contestantStatusProg();
        panels.setPreferredSize(new Dimension(400,count * 211));

        mainPanels.setVisible(true);

        go.setEnabled(true);
        if(count == 100)
            up.setEnabled(false);

        if(count > 0){
            down.setEnabled(true);
            down.setVisible(true);
        }






    }

    public void makePanelsVisible2(JPanel panels, JPanel mainPanels ){

        contestantStatusProg();
        panels.setPreferredSize(new Dimension(400,count * 210));

        mainPanels.setVisible(true);
        if(count > 0){
            down.setEnabled(true);
            down.setVisible(true);

        }

        go.setEnabled(true);
        if(count == 100)
            up.setEnabled(false);






    }


    public void makePanelsHidden(JPanel topPanel, JPanel mainPanel, JTextField field1, JTextField field2,
                                 JTextField field3, JTextField field4, JTextField field5 , JTextField field6) {

        contestantStatusProg();
        up.setEnabled(true);

        int countstatus_makePanelsHidden = count + 1;

        topPanel.setVisible(false);
        field1.setText("Question  " + countstatus_makePanelsHidden);
        field2.setText("Option 1");
        field3.setText("Option 2");
        field4.setText("Option 3");
        field5.setText("Option 4");
        field6.setText("Answer");
        mainPanel.setPreferredSize(new Dimension(400, count * 211));



        if (count == 100)
            up.setEnabled(false);
        if (contestantStatus.getText().equals("No Question!")){

            go.setEnabled(false);
            //down.setVisible(false);
            down.setVisible(false);
            down.setEnabled(false);
            //down.setVisible(true);

            }


    }






    public static void comboBox() {


        combo.removeAllItems();

        try {


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/Questions.mdb;");

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT Qname FROM QName");


            while (rs.next()) {

                combo.addItem(rs.getString("Qname"));

            }

            rs.close();
            conn.close();


        } catch (SQLException d) {
            d.printStackTrace();
        } catch (ClassNotFoundException f) {
            f.printStackTrace();
        }




    }














    public class NewDB
    {

         JDialog dlog = new JDialog();




         JFormattedTextField addField = new JFormattedTextField("");
        JButton addButton =  new JButton("Create");
        JButton cancel = new JButton("Cancel");
        MaskFormatter fv;


        public NewDB(){



            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();


            dlog.setTitle("NewDB");


            dlog.setLayout(null);



            try{

                MaskFormatter fv = new MaskFormatter("********************");
                fv.setInvalidCharacters("' ',',', '.','/', ']','[', ';',':' ");

            }
            catch (Exception e){}


            addField = new JFormattedTextField(fv);



            addButton.setBounds(50, 100, 100, 30);
            addButton.setFont(new Font("Calibri", 1, 17));
            addButton.setHorizontalAlignment(SwingConstants.CENTER);
            addButton.setBackground(new Color(0, 168, 89));
            addButton.setForeground(Color.white);
            dlog.add(addButton);

            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    goaction();
                    createTable();
                    Admin.comboBox();

                    JOptionPane.showMessageDialog(null, "Database Updated", "SUCCESS", JOptionPane.PLAIN_MESSAGE);
                    //addField.setText(null);
                    //addField.setText("");
                    dlog.setVisible(false);
                }
            });


            cancel.setBounds(180, 100, 100, 30);
            cancel.setFont(new Font("Calibri", 1, 17));
            cancel.setHorizontalAlignment(SwingConstants.CENTER);
            cancel.setBackground(new Color(0, 168, 89));
            cancel.setForeground(Color.white);
            //dlog.add(cancel);

            cancel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    addField.setText("");
                    dlog.setVisible(false);
                }
            });



            addField.setBounds(50, 50, 220, 30);
            addField.setFont(new Font("Calibri", 1, 17));
            //addButton.setHorizontalAlignment(SwingConstants.CENTER);
            dlog.add(addField);



            dlog.setLayout(null);
            dlog.setSize(300,200);
            dlog.setLocationRelativeTo(Admin.f);
            dlog.setVisible(true);
            dlog.setAlwaysOnTop(true);





        }










        public void goaction(){


            PreparedStatement ps = null;
            Connection conn = null;

            try {


                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/Questions.mdb;");



                ps = conn.prepareStatement ("INSERT INTO QName (Qname) "+ "VALUES (?)");



                ps.setString (1, addField.getText());

                ps.executeUpdate();





            }



            catch ( SQLException sqlException )
            {
                sqlException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error in Uploading records", "FAILURE", JOptionPane.PLAIN_MESSAGE);

                //JOptionPane.showMessageDialog(null, "Please fill all fields!");

            } // end catch
            catch ( ClassNotFoundException classNotFound )
            {
                classNotFound.printStackTrace();

            } // end catch
            finally // ensure statement and connection are closed properly
            {
                try
                {
                    ps.close();
                    conn.close();
                } // end try
                catch ( Exception exception )
                {
                    exception.printStackTrace();

                } // end catch
            } // end finally



        }







        public void createTable(){


            Connection conn = null;
            Statement stmt = null;

            try {


                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/Questions.mdb;");

                stmt = conn.createStatement();

                String dataID =  addField.getText();

                String creat = "CREATE TABLE  "  + dataID;


                String sql = creat +
                        "(ID VARCHAR not NULL, " +
                        " Type VARCHAR(255), " +
                        " Question VARCHAR(255), " +
                        " Option1 VARCHAR(255), " +
                        " Option2 VARCHAR(255), " +
                        " Option3 VARCHAR(255), " +
                        " Option4 VARCHAR(255), " +
                        " Answer VARCHAR(255), " +
                        " PRIMARY KEY ( ID ))";

                stmt.executeUpdate(sql);

            }



            catch ( SQLException sqlException )
            {
                sqlException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error in Uploading records", "FAILURE", JOptionPane.PLAIN_MESSAGE);

                //JOptionPane.showMessageDialog(null, "Please fill all fields!");

            } // end catch
            catch ( ClassNotFoundException classNotFound )
            {
                classNotFound.printStackTrace();

            } // end catch
            finally // ensure statement and connection are closed properly
            {
                try
                {
                    conn.close();
                } // end try
                catch ( Exception exception )
                {
                    exception.printStackTrace();

                } // end catch
            } // end finally


            dlog.setVisible(false);


        }



    }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





    public  class SaveDB
    {


         public JDialog dlog2 = new JDialog();


        DefaultListModel data = new DefaultListModel();

        JList listID  =  new JList(data);




        JButton addButton =  new JButton("Save");
        JButton cancel = new JButton("Cancel");

        JScrollPane scroll2 =  new JScrollPane(listID);
         JTextField selected = new JTextField();



        public SaveDB(){


            dlog2.setTitle("SaveDB");


            selected.setBounds(20,10,240,30);
            selected.setEditable(false);
            dlog2.add(selected);


            scroll2.setBounds(20,50,240,150);
            listID.setFont(new Font("Calibri", 0, 20));
            listID.setFixedCellHeight(25);
            listID.setSelectionBackground(new Color(255, 250, 152));
            listID.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
            scroll2.getViewport().setView(listID);
            dlog2.add(scroll2);

            listID.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    selected.setText(listID.getSelectedValue().toString());
                    selectedInSaveDB  = listID.getSelectedValue().toString();
                }
            });


            comboBox();

            addButton.setBounds(100, 220, 100, 30);
            addButton.setFont(new Font("Calibri", 1, 17));
            addButton.setHorizontalAlignment(SwingConstants.CENTER);
            addButton.setBackground(new Color(0, 168, 89));
            addButton.setForeground(Color.white);
            dlog2.add(addButton);

            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {


                   new SaveToDatabase();
                    dlog2.dispose();
                    JOptionPane.showMessageDialog(null, "Database Updated", "SUCCESS", JOptionPane.PLAIN_MESSAGE);



                }
            });


            dlog2.setLayout(null);
            dlog2.setSize(300,300);
            dlog2.setVisible(true);
            dlog2.setLocationRelativeTo(Admin.f);
            dlog2.setAlwaysOnTop(true);





        }






        public  void comboBox() {


            data.clear();

            try {


                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/Questions.mdb;");

                Statement st = conn.createStatement();

                ResultSet rs = st.executeQuery("SELECT Qname FROM QName");


                while (rs.next()) {

                    data.addElement(rs.getString("Qname"));

                }

                rs.close();
                conn.close();


            } catch (SQLException d) {
                d.printStackTrace();
            } catch (ClassNotFoundException f) {
                f.printStackTrace();
            }




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




        new Admin();
    }

}


