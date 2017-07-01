

import MaterialDesign.MaterialColor;
import MaterialDesign.MaterialWindow;
import MaterialDesign.Roboto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SpellingBeeSave extends JPanel{


    MaterialWindow f = new MaterialWindow();



    JLabel topBar = new JLabel("");
    JLabel downBar = new JLabel();


    public static JTextArea tarea =  new JTextArea();
    public static JTextArea tareaMeaning =  new JTextArea();


    JButton save =  new JButton("Save");
    JButton cancel =  new JButton("Cancel");


    JButton close = new JButton("X");

    JLabel wordToSpell =  new JLabel("Word to Spell");
    JLabel definition =  new JLabel("Definition");



    public SpellingBeeSave() {


        new Move().move(f,topBar);


        setBackground(Color.white);
        setLayout(null);



        HolderPage.f.setEnabled(false);
        HolderPage.f.setFocusable(false);
        HolderPage.f.setFocusableWindowState(false);
        f.requestFocus();




        wordToSpell.setBounds(40,65,130,30);
        wordToSpell.setFont(new Font("Calibri",0,17));
        wordToSpell.setForeground(MaterialColor.GREEN_600);
        add(wordToSpell);


        tarea.setWrapStyleWord(true);
        tarea.setLineWrap(true);
        tarea.setFont(Roboto.REGULAR.deriveFont(17f));
        tarea.setEditable(true);
        tarea.setEnabled(true);



        JScrollPane scroll =  new JScrollPane(tarea);

        scroll.setBounds(40,90,370,150);
        scroll.getVerticalScrollBar().setUI(new MyScrollBarUI());
        add(scroll);



        definition.setBounds(40,250,130,30);
        definition.setFont(new Font("Calibri",0,17));
        definition.setForeground(MaterialColor.GREEN_600);
        add(definition);

        tareaMeaning.setWrapStyleWord(true);
        tareaMeaning.setLineWrap(true);
        tareaMeaning.setFont(Roboto.REGULAR.deriveFont(17f));
        tareaMeaning.setEditable(true);
        tareaMeaning.setEnabled(true);
        tareaMeaning.setText("This is the meaning");



        JScrollPane scrollMeaning =  new JScrollPane(tareaMeaning);

        scrollMeaning.setBounds(40,280,370,150);
        scrollMeaning.getVerticalScrollBar().setUI(new MyScrollBarUI());
        add(scrollMeaning);



        close.setBounds(400 ,5,40,30);
        close.setBackground(MaterialColor.RED_500);
        close.setForeground(MaterialColor.WHITE);
        close.setFont(new Font("Calibri", 1, 15));
        add(close);


        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {




                HolderPage.f.setEnabled(true);
                HolderPage.f.setFocusable(true);
                HolderPage.f.setFocusableWindowState(true);
                HolderPage.f.requestFocus();
                f.dispose();

            }
        });



        topBar.setBackground(MaterialColor.BLUE_700);
        topBar.setBounds(0,0,470, 40);
        topBar.setOpaque(true);
        topBar.setForeground(MaterialColor.WHITE);
        topBar.setFont(new Font("Calibri", 1, 18));
        add(topBar);


        save.setBounds(250,499 , 60,30);
        save.setBackground(MaterialColor.BLUE_700);
        save.setForeground(MaterialColor.WHITE);
        save.setFont(new Font("Calibri",1,15));
        add(save);


        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

              new SpellingBeeUpdateDB();


            }
        });




        cancel.setBounds(320,499 , 73,30);
        cancel.setBackground(MaterialColor.BLUE_700);
        cancel.setForeground(MaterialColor.WHITE);
        cancel.setFont(new Font("Calibri",1,16));
        add(cancel);



        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                HolderPage.f.setEnabled(true);
                HolderPage.f.setFocusable(true);
                HolderPage.f.setFocusableWindowState(true);
                HolderPage.f.requestFocus();
                f.dispose();

            }
        });


        downBar.setBackground(MaterialColor.GREY_400);
        downBar.setBounds(0,490,470, 40);
        downBar.setOpaque(true);
        downBar.setForeground(MaterialColor.WHITE);
        downBar.setFont(new Font("Calibri", 1, 18));
        add(downBar);






        f.setSize(470, 550);
        f.add(this);

        int locationX = HolderPage.f.getX()  + 280;
        int locationY =  HolderPage.f.getY() + 20;



       // f.setLocation(locationX, locationY);
        f.setLocationRelativeTo(HolderPage.f);

        f.setResizable(false);

        f.setVisible(true);
        updateUI();

    }









    public void fill(String questn, String meaning, String action) {

        tarea.setText(questn);
        tareaMeaning.setText(meaning);

        topBar.setText("   Question  "  + action   + "                    "  + "Spelling Bee" );




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
                new SpellingBeeSave();
            }
        });



    }

}

