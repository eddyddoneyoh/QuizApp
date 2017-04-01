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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.RandomAccessFile;
import java.sql.*;
import javax.swing.event.*;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.Dimension;
import java.util.Vector;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;




public class Settings extends JPanel {





    int x;
    int y;

    int heightdiv;
    int widthdiv;



   // JPanel


    JPanel settingsPanel =  new JPanel();
    JScrollPane scrollPane =  new JScrollPane(settingsPanel);



    JLabel divider1 =  new JLabel("_________________________________________________________________");
    JLabel divider2 =  new JLabel("_________________________________________________________________");
    JLabel divider3 =  new JLabel("_________________________________________________________________");
    JLabel divider4 =  new JLabel("_________________________________________________________________");



    JLabel general =  new JLabel("General");
    JLabel fontType = new JLabel("Font");
    JLabel security =  new JLabel("Security");
    JLabel sync =  new JLabel("Sync");



    JCheckBox shutdown =  new JCheckBox("Confirm application exit");
    JCheckBox syncCheckBox = new JCheckBox("Save game automatically");


    JLabel prefFontType = new JLabel("Preferred Font Type:");
    JComboBox comboFontType  =  new JComboBox();
    JLabel prefFontSize =  new JLabel("Preferred Font Size:");
    JComboBox comboFontSize = new JComboBox();
    JLabel prefTheme =  new JLabel("Preferred Theme:");
    JComboBox comboTheme =  new JComboBox();


    JLabel securityLabel =  new JLabel("Set security status:");
    JButton securityButton =  new JButton("Enabled");




    Image imaget = new ImageIcon("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\img\\bg.png").getImage();







    JButton home =  new JButton("Home");




    public Settings() {


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = (Integer) y / 2;
        widthdiv = (Integer) x / 2;


        settingsPanel.setLayout(null);
        settingsPanel.setPreferredSize(new Dimension(740, 700));


        //---------------------------------------------------------------------------------------

        general.setBounds(30,30,100,30);
        general.setFont(new Font("Calibri", 1, 23));
        settingsPanel.add(general);


        shutdown.setBounds(30, 65, 200, 40);
        shutdown.setFont(new Font("Calibri", 0, 17));
        settingsPanel.add(shutdown);

        divider1.setBounds(30,100,500,15);
        settingsPanel.add(divider1);

        //---------------------------------------------------------------------------------------


        fontType.setBounds(30,125,100,30);
        fontType.setFont(new Font("Calibri", 1, 23));
        settingsPanel.add(fontType);


        prefFontType.setBounds(30, 165, 170, 40);
        prefFontType.setFont(new Font("Calibri", 0, 17));
        settingsPanel.add(prefFontType);


        comboFontType.addItem("Calibri");
        comboFontType.addItem("Arial");
        comboFontType.addItem("Times Roman");


        comboFontType.setBounds(185,170,150,25);
        settingsPanel.add(comboFontType);

                    //---------------

        prefFontSize.setBounds(30, 205, 170, 40);
        prefFontSize.setFont(new Font("Calibri", 0, 17));
        settingsPanel.add(prefFontSize);


        comboFontSize.addItem("Small");
        comboFontSize.addItem("Medium");
        comboFontSize.addItem("Large");


        comboFontSize.setBounds(185,210,150,25);
        settingsPanel.add(comboFontSize);


                    //---------------

        prefTheme.setBounds(30, 245, 170, 40);
        prefTheme.setFont(new Font("Calibri", 0, 17));
        settingsPanel.add(prefTheme);



        comboTheme.addItem("Default");
        comboTheme.addItem("Dark");
        comboTheme.addItem("Venus");


        comboTheme.setBounds(185,250,150,25);
        settingsPanel.add(comboTheme);


        divider2.setBounds(30,285,500,15);
        settingsPanel.add(divider2);


        //---------------------------------------------------------------------------------------


        sync.setBounds(30,310,100,30);
        sync.setFont(new Font("Calibri", 1, 23));
        settingsPanel.add(sync);


        syncCheckBox.setBounds(30, 350, 200, 40);
        syncCheckBox.setFont(new Font("Calibri", 0, 17));
        settingsPanel.add(syncCheckBox);

        divider3.setBounds(30,390,500,15);
        settingsPanel.add(divider3);


        //----------------------------------------------------------------------------------------


        security.setBounds(30,420,100,30);
        security.setFont(new Font("Calibri", 1, 23));
        settingsPanel.add(security);


        securityLabel.setBounds(30, 470, 140, 30);
        securityLabel.setFont(new Font("Calibri", 0, 17));
        settingsPanel.add(securityLabel);

        securityButton.setBounds(185, 470, 100,30);
        securityButton.setFont(new Font("Calibri", 0, 15));
        settingsPanel.add(securityButton);

        securityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if(securityButton.getText().equals("Disabled")){

                    securityButton.setText("Enabled");
                }

                else if(securityButton.getText().equals("Enabled")){

                    JOptionPane.showMessageDialog(null, "weldone", "welldone", JOptionPane.INFORMATION_MESSAGE);
                    securityButton.setText("Disabled");
                }




            }
        });


        divider4.setBounds(30,500,500,15);
        settingsPanel.add(divider4);








        home.setBounds(400, 500, 180, 30);
        home.setFont(new Font("Calibri", 1, 19));
        home.setHorizontalAlignment(SwingConstants.CENTER);
        home.setBackground(new Color(0, 168, 89));
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


            }
        });




        settingsPanel.setBackground(Color.white);






        scrollPane.setBounds(100,50,770,430);
        scrollPane.setAutoscrolls(true);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.getViewport().putClientProperty("EnableWindowBlit", Boolean.TRUE);
        scrollPane.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
        add(scrollPane);






        setBackground(new Color(32, 173, 248));
        setLayout(null);



    }






    public void paintComponent(Graphics g){

        super.paintComponent(g);



       // g.setFont(new Font("Calibri (Body)", 1, 11));



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
                new Settings();
            }
        });



    }

}


