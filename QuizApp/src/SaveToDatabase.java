

import MaterialDesign.MaterialColor;
import MaterialDesign.MaterialTextField;
import MaterialDesign.MaterialWindow;
import MaterialDesign.Roboto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SaveToDatabase extends JPanel{


    MaterialWindow f = new MaterialWindow();



    JLabel topBar = new JLabel("");
    JLabel downBar = new JLabel();


    public static JTextArea tarea =  new JTextArea();
    public static MaterialTextField amenu = new MaterialTextField();
    public static MaterialTextField bmenu = new MaterialTextField();
    public static MaterialTextField cmenu = new MaterialTextField();
    public static MaterialTextField dmenu = new MaterialTextField();


    JRadioButton answer1 = new JRadioButton();
    JRadioButton answer2 = new JRadioButton();
    JRadioButton answer3 = new JRadioButton();
    JRadioButton answer4 = new JRadioButton();

    static public ButtonGroup buttonGroup =  new ButtonGroup();


    JLabel labelA = new JLabel("A");
    JLabel labelB =  new JLabel("B");
    JLabel labelC =  new JLabel("C");
    JLabel labelD =  new JLabel("D");


    JLabel hint = new JLabel("                            Options                                       Answer");

    JButton save =  new JButton("Save");
    JButton cancel =  new JButton("Cancel");


    JButton close = new JButton("X");




    public SaveToDatabase() {


        new Move().move(f,topBar);


        setBackground(Color.white);
        setLayout(null);

        HolderPage.f.setEnabled(false);
        HolderPage.f.setFocusable(false);
        HolderPage.f.setFocusableWindowState(false);
        f.requestFocus();




        hint.setBounds(40, 180,400, 30);
        add(hint);
        hint.setOpaque(false);
        hint.setForeground(MaterialColor.BLACK);
        hint.setFont(new Font("Calibri", 1, 16));




        tarea.setWrapStyleWord(true);
        tarea.setLineWrap(true);
        tarea.setFont(Roboto.REGULAR.deriveFont(17f));
        tarea.setEditable(true);
        tarea.setEnabled(true);



        JScrollPane scroll =  new JScrollPane(tarea);

        scroll.setBounds(40,70,370,100);
        scroll.getVerticalScrollBar().setUI(new MyScrollBarUI());
        add(scroll);




        amenu.setBounds(40,220, 300,35);
        add(amenu);

        bmenu.setBounds(40,290, 300,35);
        add(bmenu);

        cmenu.setBounds(40,360, 300,35);
        add(cmenu);

        dmenu.setBounds(40,430, 300,35);
        add(dmenu);




        answer1.setBounds(380,220, 30,30);
        add(answer1);

        answer2.setBounds(380,290, 30,30);
        add(answer2);

        answer3.setBounds(380,360, 30,30);
        add(answer3);

        answer4.setBounds(380,430, 30,30);
        add(answer4);



        labelA.setBounds(15,225, 30,30);
        labelA.setFont(new Font("Calibri", 1, 17));
        add(labelA);

        labelB.setBounds(15,295, 30,30);
        labelB.setFont(new Font("Calibri", 1, 17));
        add(labelB);

        labelC.setBounds(15,365, 30,30);
        labelC.setFont(new Font("Calibri", 1, 17));
        add(labelC);

        labelD.setBounds(15,435, 30,30);
        labelD.setFont(new Font("Calibri", 1, 17));
        add(labelD);




        buttonGroup.add(answer1);
        buttonGroup.add(answer2);
        buttonGroup.add(answer3);
        buttonGroup.add(answer4);


        answer1.setBounds(380,220, 30,30);
        answer1.setActionCommand("A");
        add(answer1);

        answer2.setBounds(380,290, 30,30);
        answer2.setActionCommand("B");
        add(answer2);

        answer3.setBounds(380,360, 30,30);
        answer3.setActionCommand("C");
        add(answer3);

        answer4.setBounds(380,430, 30,30);
        answer4.setActionCommand("D");
        add(answer4);



        labelA.setBounds(15,225, 30,30);
        labelA.setFont(new Font("Calibri", 1, 17));
        add(labelA);

        labelB.setBounds(15,295, 30,30);
        labelB.setFont(new Font("Calibri", 1, 17));
        add(labelB);

        labelC.setBounds(15,365, 30,30);
        labelC.setFont(new Font("Calibri", 1, 17));
        add(labelC);

        labelD.setBounds(15,435, 30,30);
        labelD.setFont(new Font("Calibri", 1, 17));
        add(labelD);




        buttonGroup.add(answer1);
        buttonGroup.add(answer2);
        buttonGroup.add(answer3);
        buttonGroup.add(answer4);







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

                new UpdateToDatabase();


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




        f.add(this);

        f.setSize(470, 550);

        int locationX = HolderPage.f.getX()  + 280;
        int locationY =  HolderPage.f.getY() + 20;



       // f.setLocation(locationX, locationY);

        f.setLocationRelativeTo(HolderPage.f);

        f.setResizable(false);

        f.setVisible(true);
        updateUI();

    }









    public void fill(String questn, String option1, String option2, String option3, String option4,String answer, String action) {

        tarea.setText(questn);
        amenu.setText(option1);
        bmenu.setText(option2);
        cmenu.setText(option3);
        dmenu.setText(option4);
        topBar.setText("   Question  "  + action   + "                    "  + Admin.contestantStatus.getText() );




        try {

            if(answer.equals(answer1.getActionCommand())){

                answer1.setSelected(true);

            }
            else if(answer.equals(answer2.getActionCommand())){

                answer2.setSelected(true);

            }
            else if(answer.equals(answer3.getActionCommand())){

                answer3.setSelected(true);

            }
            else if(answer.equals(answer4.getActionCommand())){

                answer4.setSelected(true);

            }
            else if(answer.equals(null)){

                answer1.setSelected(false);
                answer2.setSelected(false);
                answer3.setSelected(false);
                answer4.setSelected(false);
            }



        }
        catch (java.lang.NullPointerException fg){}




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
                new SaveToDatabase();
            }
        });



    }

}

