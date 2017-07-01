/**
 * Created by EdidiongEyo on 11/19/2016.
 */
/**
 * Created by EdidiongEyo on 11/5/2016.
 */
/**
 * Created by EdidiongEyo on 11/5/2016.
 */

import MaterialDesign.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.sql.*;

public class Admin extends JPanel  implements ActionListener{



    int x;
    int y;

    int heightdiv;
    int widthdiv;


    JPanel buttonsPanel = new JPanel();

    ////////////////////////////////  SLIDING PANEL BUTTONS  //////////////////////////////////////////////

     MaterialButton dashboard = new MaterialButton();
     MaterialButton history = new MaterialButton();
     MaterialButton account = new MaterialButton();
     MaterialButton importButton = new MaterialButton();
    MaterialButton exit = new MaterialButton();


    //////////////////////////////////////////////////////////////////////////////////


    JButton delete = new JButton("Delete");

    JButton retrieve = new JButton("Retrieve");

    static JLabel contestantStatus = new JLabel("Load a database");



    GridLayout buttonsPanellayout = new GridLayout(34, 3, 5, 5);


    static MaterialComboBox combo = new MaterialComboBox();
    JButton refresh = new JButton();
    JButton newDB = new JButton("New DB");


    ///////////////////////////////////////////////////////////////////////

   // public static MaterialDialog dlog2 = new MaterialDialog();


    DefaultListModel data = new DefaultListModel();

    JList listID  =  new JList(data);

    JScrollPane scroll2 =  new JScrollPane(listID);
    JTextField selected = new JTextField();


    //////////////////////////////////////////////////////////////////////////////////


    ////////////SLIDING PANEL ///////////////////////////////////////////////////////


    JPanel slidingPanel = new JPanel();


    JLabel accountPix = new JLabel();
    JLabel adminName =  new JLabel();
    JLabel adminStatus = new JLabel();

    //////////////END OF SLIDING PANEL//////////////////////////////////////////



    JLabel downbar = new JLabel();



    //////////////////////////////////////////////////////////////////////////////


    JLabel behindComboBox =  new JLabel();
    JLabel behindJLabels =  new JLabel();


    JFormattedTextField addField = new JFormattedTextField("");

    JButton questionButtons;


    ///////////////////////////  ALL PANELS  ////////////////////////////

    JPanel mainContent = new JPanel();
    JPanel historyPanel = new JPanel();
    JPanel importDBPanel = new JPanel();
    JPanel accountPanel = new JPanel();


    ///////////////////////////////////////////////////////////////////////


    ///////////////////////  HISTORY MENU COMPONENTS  //////////////////////////////


    DefaultListModel dataHistory = new DefaultListModel();


    JList listIDHistory =  new JList(dataHistory);


    MaterialButton  clearHistory =  new MaterialButton();
    MaterialButton refreshHistory = new MaterialButton();

    JScrollPane scrollHistory =  new JScrollPane(listID);




    ///////////////////////////////////////////////////////////////////////////////




    JLabel actName = new JLabel("Name:");
     MaterialTextField acctNameTxt = new MaterialTextField();
    JLabel status = new JLabel("Status:");
     MaterialComboBox statusCombo =  new MaterialComboBox();
     JLabel actImage  =  new JLabel();
    MaterialButton choosePix =  new MaterialButton();
    MaterialButton saveAcctInfo =  new MaterialButton();





    //private JDialog deleteDialog = new JDialog();

    MaterialDialog deleteDialog = new MaterialDialog();



    /////////////////////////////////////////////////////////////////

    JRadioButton quizbutton =  new JRadioButton("Quiz");
    JRadioButton spellingBeeButton = new JRadioButton("SpellingBee");


    ///////////////////////////////////////////////////////////////////



    File outputfile;
    JSystemFileChooser chooser;



    public Admin() {


        setLayout(null);
        setBounds(0,0,980,515);



        comboBox();


        deleteDialog.addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent e) {

            }

            @Override
            public void windowLostFocus(WindowEvent e) {


                deleteDialog.dispose();
            }
        });




        mainContent.setLayout(null);
        mainContent.setBounds(230,0,749,470);
        mainContent.setBackground(MaterialColor.WHITE);
        add(mainContent);

        historyPanel.setLayout(null);
        historyPanel.setBounds(230,0,749,465);
        historyPanel.setBackground(MaterialColor.WHITE);

        importDBPanel.setLayout(null);
        importDBPanel.setBounds(230,0,749,465);
        importDBPanel.setBackground(MaterialColor.WHITE);

        accountPanel.setLayout(null);
        accountPanel.setBounds(230,0,749,465);
        accountPanel.setBackground(MaterialColor.GREY_50);




        HolderPage.breadCrumb.setText("Home > Admin Panel > Dashboard");
        HolderPage.home.setVisible(true);


        /////sliding Panel program begins////////////////


        slidingPanel.setBackground(MaterialColor.GREY_300);
        slidingPanel.setBounds(0, 0, 230, 465);
        slidingPanel.setLayout(null);
        add(slidingPanel);


        adminName.setBounds(115,30,100,30);
        adminName.setHorizontalAlignment(SwingConstants.CENTER);
        adminName.setText("User Name");
        adminName.setForeground(Color.black);
        adminName.setFont(new Font("Calibri", 1, 16));
        slidingPanel.add(adminName);

        adminStatus.setBounds(115,50,100,30);
        adminStatus.setText("status");
        adminStatus.setHorizontalAlignment(SwingConstants.CENTER);
        adminStatus.setForeground(Color.black);
        adminStatus.setFont(new Font("Calibri", Font.ITALIC, 15));
        slidingPanel.add(adminStatus);



        accountPix.setBounds(10,10,100,100);
        accountPix.setOpaque(true);
        Image imgSmall =  new ImageIcon("DB/Accounts/mainPicture.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        accountPix.setIcon(new ImageIcon(imgSmall));
        slidingPanel.add(accountPix);


        dashboard.setBounds(-10, 120, 250, 65);
        dashboard.setBackground(MaterialColor.ORANGE_700);
        dashboard.setHorizontalAlignment(SwingConstants.CENTER);
        dashboard.setForeground(Color.yellow);
        dashboard.setText("Dashboard");
        dashboard.setFont(new Font("Calibri", 1, 17));
        slidingPanel.add(dashboard);


        dashboard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                dashboard.setForeground(Color.yellow);
                history.setForeground(Color.white);
                importButton.setForeground(Color.white);
                account.setForeground(Color.white);
                exit.setForeground(Color.white);



                HolderPage.breadCrumb.setText("Home > Admin Panel > Dashboard");
                remove(historyPanel);
                remove(importDBPanel);
                remove(accountPanel);
                add(mainContent);
                updateUI();
            }
        });


        history.setBounds(-10, 168, 250, 65);
        history.setBackground(MaterialColor.ORANGE_700);
        history.setHorizontalAlignment(SwingConstants.CENTER);
        history.setFont(new Font("Calibri", 1, 17));
        history.setForeground(Color.white);
        history.setText("History");
        slidingPanel.add(history);


        history.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                history.setForeground(Color.yellow);
                dashboard.setForeground(Color.white);
                importButton.setForeground(Color.white);
                account.setForeground(Color.white);
                exit.setForeground(Color.white);




                HolderPage.breadCrumb.setText("Home > Admin Panel > History");
                remove(mainContent);
                remove(importDBPanel);
                remove(accountPanel);
                add(historyPanel);

                comboBoxHistory();

                updateUI();
            }
        });


        importButton.setBounds(-10, 216, 250, 65);
        importButton.setBackground(MaterialColor.ORANGE_700);
        importButton.setHorizontalAlignment(SwingConstants.CENTER);
        importButton.setFont(new Font("Calibri", 1, 17));
        importButton.setForeground(Color.white);
        importButton.setText("Import DB");
        slidingPanel.add(importButton);


        importButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                importButton.setForeground(Color.yellow);
                dashboard.setForeground(Color.white);
                history.setForeground(Color.white);
                account.setForeground(Color.white);
                exit.setForeground(Color.white);


                HolderPage.breadCrumb.setText("Home > Admin Panel > Import DB");
                remove(mainContent);
                remove(historyPanel);
                remove(accountPanel);
                add(importDBPanel);
                updateUI();
            }
        });


        account.setBounds(-10, 264, 250, 65);
        account.setBackground(MaterialColor.ORANGE_700);
        account.setHorizontalAlignment(SwingConstants.CENTER);
        account.setFont(new Font("Calibri", 1, 17));
        account.setForeground(Color.white);
        account.setText("Account");
        slidingPanel.add(account);

        account.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                account.setForeground(Color.yellow);
                dashboard.setForeground(Color.white);
                history.setForeground(Color.white);
                importButton.setForeground(Color.white);
                exit.setForeground(Color.white);


                HolderPage.breadCrumb.setText("Home > Admin Panel > Account");
                remove(mainContent);
                remove(historyPanel);
                remove(importDBPanel);
                add(accountPanel);
                updateUI();


            }
        });

        exit.setBounds(-10, 312, 250, 65);
        exit.setBackground(MaterialColor.ORANGE_700);
        exit.setHorizontalAlignment(SwingConstants.CENTER);
        exit.setFont(new Font("Calibri", 1, 17));
        exit.setForeground(Color.white);
        exit.setText("Exit");
        slidingPanel.add(exit);


        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                exit.setForeground(Color.yellow);
                dashboard.setForeground(Color.white);
                history.setForeground(Color.white);
                importButton.setForeground(Color.white);
                account.setForeground(Color.white);



                JOptionPane pane = new JOptionPane("Are you really sure you want to exit?", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION);
                JDialog dialog2 = pane.createDialog(HolderPage.f, "Exit");
               dialog2.setVisible(true);

                String selectedValue = "";

                try {

                    selectedValue = pane.getValue().toString();
                }
                catch (java.lang.NullPointerException f){selectedValue = "2";}




                if (selectedValue.equals("0")) {


                    HolderPage.content.removeAll();

                    HolderPage.content.add(new Entry());
                    HolderPage.content.updateUI();


                } else if (selectedValue.equals("1")){

                    dialog2.setVisible(false);
                } else if (selectedValue.equals("2")){


                    dialog2.setVisible(false);
                }



            }
        });






        ////////sliding panel program ends/////////////////////////////////////////////////////////




        //////////////////MAIN CONTENT PREOGRAM BEGINS HERE ///////////////////////////////////////////////////



        final JPanel choiceOptions =  new JPanel();
        choiceOptions.setBounds(450,100,270,250);
        choiceOptions.setLayout(null);
        choiceOptions.setBackground(MaterialColor.WHITE);
        mainContent.add(choiceOptions);





        ButtonGroup optionsButtons = new ButtonGroup();


        quizbutton.setBounds(470,55,60,30);
        quizbutton.setFont(Roboto.REGULAR.deriveFont(18f));
        quizbutton.setSelected(true);
        quizbutton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if(quizbutton.isSelected()){

                    choiceOptions.setVisible(true);

                }
                else{

                    choiceOptions.setVisible(false);

                }

            }
        });
        mainContent.add(quizbutton);


        spellingBeeButton.setBounds(560,55,130,30);
        spellingBeeButton.setFont(Roboto.REGULAR.deriveFont(18f));
        mainContent.add(spellingBeeButton);

        spellingBeeButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if(spellingBeeButton.isSelected()){

                    choiceOptions.setVisible(false);

                }
                else{

                    choiceOptions.setVisible(true);

                }

            }
        });



        optionsButtons.add(quizbutton);
        optionsButtons.add(spellingBeeButton);









        contestantStatus.setBounds(0, 0, 270, 45);
        contestantStatus.setFont(new Font("Calibri", 1, 20));
        contestantStatus.setBackground(new Color(0, 168, 89));
        contestantStatus.setHorizontalAlignment(SwingConstants.CENTER);
        contestantStatus.setOpaque(true);
        contestantStatus.setForeground(Color.white);
        choiceOptions.add(contestantStatus);



        combo.setBounds(10, 70, 220, 30);
        combo.setFont(new Font("Calibri", 1, 17));
        choiceOptions.add(combo);



        refresh.setBounds(233, 70, 30, 30);
        refresh.setOpaque(false);
        refresh.setIcon(new ImageIcon("img//reset.png"));
        refresh.setRolloverIcon(new ImageIcon("img//resetR.png"));
        choiceOptions.add(refresh);


        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                comboBox();
                contestantStatus.setText("Load a database");
            }
        });



        retrieve.setBounds(10, 130, 70, 30);
        retrieve.setText("Load");
        retrieve.setBackground(MaterialColor.BLUE_400);
        retrieve.setForeground(MaterialColor.WHITE);
        retrieve.setFont(new Font("Calibri", 1, 16));

        choiceOptions.add(retrieve);

        retrieve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                contestantStatus.setText(combo.getSelectedItem().toString());
                //combo.setEnabled(false);

            }
        });






        newDB.setBounds(85, 130, 60, 30);
        newDB.setText("New");
        newDB.setBackground(MaterialColor.BLUE_400);
        newDB.setForeground(MaterialColor.WHITE);
        newDB.setFont(new Font("Calibri", 1, 16));
        choiceOptions.add(newDB);

        newDB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                new NewDB();


            }
        });




        delete.setBounds(150, 130, 80, 30);
        delete.setText("Delete");
        delete.setBackground(MaterialColor.RED_400);
        delete.setForeground(MaterialColor.WHITE);
        delete.setFont(new Font("Calibri", 1, 14));
        choiceOptions.add(delete);



        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                new DeleteDB();

            }
        });



        behindComboBox.setBounds(0,45,270,150);
        behindComboBox.setOpaque(true);
        behindComboBox.setBackground(MaterialColor.ORANGE_300);
        choiceOptions.add(behindComboBox);


        behindJLabels.setBounds(450,45,270,55);
        behindJLabels.setOpaque(true);
        behindJLabels.setBackground(MaterialColor.GREY_300);
        mainContent.add(behindJLabels);




        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                comboBox();
            }
        });






        String[] labels = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20","21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
                "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50",
                "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70",
                "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90",
                "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"};



        for (String label : labels) {
            questionButtons = new JButton();
            questionButtons.setText(label);
            questionButtons.setBackground(MaterialColor.GREEN_700);
            questionButtons.setPreferredSize(new Dimension(100,100));
            questionButtons.setFont(new Font("Calibri", 1, 25));
            questionButtons.setActionCommand(label);
            buttonsPanel.add(questionButtons);
            questionButtons.setForeground(Color.white);
            questionButtons.setIgnoreRepaint(true);
            questionButtons.setRolloverEnabled(false);
            questionButtons.setBorderPainted(false);
            questionButtons.setFocusPainted(false);
            questionButtons.setBorderPainted(false);
            questionButtons.addActionListener(this);

        }



        buttonsPanel.setLayout(buttonsPanellayout);
        buttonsPanel.setBackground(Color.white);



        final JScrollPane scrollPane = new JScrollPane(buttonsPanel);
        scrollPane.setBounds(20,35,400,400);
        scrollPane.setAutoscrolls(true);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.getViewport().putClientProperty("EnableWindowBlit", Boolean.TRUE);
        scrollPane.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
        scrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(200, 200, 200),3,true),"Select a question to edit!", 2,2,new Font("Calibri",1,20),Color.black));
        scrollPane.getVerticalScrollBar().setUI(new MyScrollBarUI());
        mainContent.add(scrollPane);




        downbar.setBounds(0, 465, 1000, 40);
        downbar.setBackground(new Color(233, 233, 233));
        downbar.setOpaque(true);
        add(downbar);




        //////////////////////FOR HISTORY COMPONENTS ///////////////////




        scrollHistory.setBounds(50, 30, 650, 300);
        listIDHistory.setFont(new Font("Calibri", 0, 20));
        listIDHistory.setFixedCellHeight(30);
        listIDHistory.setSelectionBackground(MaterialColor.ORANGE_600);
        listIDHistory.setSelectionForeground(MaterialColor.FULLWHITE);
        listIDHistory.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollHistory.getViewport().setView(listIDHistory);
        scrollHistory.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollHistory.getVerticalScrollBar().setUI(new MyScrollBarUI());
        historyPanel.add(scrollHistory);



        clearHistory.setBounds(400,400,130,50);
        clearHistory.setText("   Clear history");
        clearHistory.setBackground(MaterialColor.BLUE_500);
        clearHistory.setForeground(MaterialColor.WHITE);
        clearHistory.setFont(new Font("Calibri",1,15));
        clearHistory.setHorizontalAlignment(SwingConstants.CENTER);
        historyPanel.add(clearHistory);



        refreshHistory.setBounds(540,400,100,50);
        refreshHistory.setText(" Refresh");
        refreshHistory.setBackground(MaterialColor.BLUE_500);
        refreshHistory.setForeground(MaterialColor.WHITE);
        refreshHistory.setFont(new Font("Calibri",1,15));
        refreshHistory.setHorizontalAlignment(SwingConstants.CENTER);
        historyPanel.add(refreshHistory);

        //////////////////////////////////////////////////////////////////




        //////////////////// ACCOUNT COMPONENTS  /////////////////////////////



        actName.setBounds(20,50,50,30);
        actName.setFont(new Font("Calibri",1,17));
        accountPanel.add(actName);

        acctNameTxt.setBounds(74,50,250,35);
        accountPanel.add(acctNameTxt);

        status.setBounds(20,110,50,30);
        status.setFont(new Font("Calibri",1,17));
        accountPanel.add(status);

        statusCombo.setBounds(74,110,250,35);
        accountPanel.add(statusCombo);
        statusCombo.addItem("Admin");
        statusCombo.addItem("Editor");

        final JLabel removePix =  new JLabel("Remove");
        removePix.setBounds(460,210,190,30);
        removePix.setBackground(MaterialColor.RED_500);
        removePix.setForeground(MaterialColor.WHITE);
        removePix.setFont(new Font("Calibri",1,16));
        removePix.setHorizontalAlignment(SwingConstants.CENTER);
        removePix.setVisible(false);
        accountPanel.add(removePix);



        removePix.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                Image img =  new ImageIcon("img/accountLarge.png").getImage();
                Image imageIcon =  img.getScaledInstance(220, 200, Image.SCALE_SMOOTH);
                ImageIcon imageIcon2 =  new ImageIcon(imageIcon);
                actImage.setIcon(imageIcon2);


            }
        });




        actImage.setBounds(450,50,200,200);
        actImage.setBorder(BorderFactory.createLineBorder(MaterialColor.GREY_300,5,false));
        Image imgBig =  new ImageIcon("DB/Accounts/mainPicture.png").getImage().getScaledInstance(220, 200, Image.SCALE_SMOOTH);
        actImage.setIcon(new ImageIcon(imgBig));
        accountPanel.add(actImage);


        actImage.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                removePix.setVisible(true);


            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                removePix.setVisible(false);
            }
        });




        choosePix.setBounds(440,253,220,50);
        choosePix.setText("Choose pix");
        choosePix.setBackground(MaterialColor.BLUE_400);
        choosePix.setForeground(MaterialColor.WHITE);
        choosePix.setFont(new Font("Calibri",1,15));
        accountPanel.add(choosePix);


        choosePix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                chooser = new JSystemFileChooser();

                FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG,GIF,PNG", "jpg", "gif","png");
                chooser.setFileFilter(filter);
                int returnVal = chooser.showOpenDialog(HolderPage.f);
                if(returnVal == JFileChooser.APPROVE_OPTION) {

                    Image img =  new ImageIcon(chooser.getSelectedFile().getPath()).getImage();

                    outputfile = new File(chooser.getSelectedFile().getPath());


                    Image imageIcon =  img.getScaledInstance(220, 200, Image.SCALE_SMOOTH);
                    ImageIcon imageIcon2 =  new ImageIcon(imageIcon);
                    actImage.setIcon(imageIcon2);




                }

            }
        });



        saveAcctInfo.setBounds(250,380,200,50);
        saveAcctInfo.setText("Save Info");
        saveAcctInfo.setBackground(MaterialColor.BLUE_400);
        saveAcctInfo.setForeground(MaterialColor.WHITE);
        saveAcctInfo.setFont(new Font("Calibri",1,15));
        accountPanel.add(saveAcctInfo);


        saveAcctInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                saveAccountInformation();
                retrieveAccountInformation();
            }
        });



        retrieveAccountInformation();


        /////////////////////////////////////////////////////////////////////



    }



    public void actionPerformed(ActionEvent e) {

        JButton  button = (JButton) e.getSource();


        if(quizbutton.isSelected()){


            if(contestantStatus.getText().equals("Load a database")){

                JOptionPane.showMessageDialog(null,"Select and Load a database","",JOptionPane.WARNING_MESSAGE);
            }
            else {

                HolderPage.f.setEnabled(false);
                RetrieveDB.entry(button.getActionCommand());

            }



        }





        if(spellingBeeButton.isSelected()){

            HolderPage.f.setEnabled(false);
            SpellingBeeRetrieveDB.entry(button.getActionCommand());


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




       combo.removeItem("SpellingBee");

    }








    public class NewDB {

        JDialog dlog = new JDialog();

        JButton addButton = new JButton("Create");
        JButton cancel = new JButton("Cancel");
        MaskFormatter fv;


        public NewDB() {


            dlog.setTitle("NewDB");


            dlog.setLayout(null);


            try {

                MaskFormatter fv = new MaskFormatter("********************");
                fv.setInvalidCharacters("' ',',', '.','/', ']','[', ';',':' ");

            } catch (Exception e) {
            }


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


                    int itemcount = combo.getItemCount();
                    String presentDB = "false";


                    for (int i = 0; i < itemcount ; i++) {

                        if (addField.getText().equals(combo.getItemAt(i))) {

                            presentDB = "true";
                            dlog.setVisible(false);
                            JOptionPane.showMessageDialog(null, "Database name already exists. Choose another name!", "Update Failed", JOptionPane.WARNING_MESSAGE);
                          break;
                        }


                    }

                    if(addField.getText().toLowerCase().equals("spellingbee")){

                        presentDB = "true";
                        dlog.setVisible(false);
                        JOptionPane.showMessageDialog(null, "Database name already exists. Choose another name!", "Update Failed", JOptionPane.WARNING_MESSAGE);

                    }


                    if(presentDB.equals("false")){

                        createTable();
                        goaction();
                        comboBox();

                        dlog.setVisible(false);

                      JOptionPane.showMessageDialog(null, "Database Updated", "SUCCESS", JOptionPane.PLAIN_MESSAGE);


                    }






                }
            });


            cancel.setBounds(180, 100, 100, 32);
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
            dlog.setSize(300, 200);
            dlog.setLocationRelativeTo(HolderPage.f);
            dlog.setVisible(true);
            dlog.setAlwaysOnTop(true);


        }






        public void createTable() {


            Connection conn = null;
            Statement stmt = null;

            try {


                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/Questions.mdb;");

                stmt = conn.createStatement();

                String dataID = addField.getText();

                String creat = "CREATE TABLE  " + dataID;


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

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error in Uploading records", "FAILURE", JOptionPane.PLAIN_MESSAGE);

                //JOptionPane.showMessageDialog(null, "Please fill all fields!");

            } // end catch
            catch (ClassNotFoundException classNotFound) {
                classNotFound.printStackTrace();

            } // end catch
            finally // ensure statement and connection are closed properly
            {
                try {
                    conn.close();
                } // end try
                catch (Exception exception) {
                    exception.printStackTrace();

                } // end catch
            } // end finally


            dlog.setVisible(false);


        }


    }










    public void goaction(){


        PreparedStatement ps = null;
        Connection conn = null;

        try {


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/Questions.mdb;");



            ps = conn.prepareStatement ("INSERT INTO QName (ID, Qname) "+ "VALUES (?, ?)");



            ps.setString (1, addField.getText());
            ps.setString (2, addField.getText());

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









    public void deleteAction(){


        PreparedStatement ps = null;
        Connection conn = null;

        String selectedDeleted = selected.getText();

        try {


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/Questions.mdb;");


            ps = conn.prepareStatement("DELETE FROM QName WHERE ID = '" + selectedDeleted +"'");

            ps.execute();



            Statement stmt =  conn.createStatement();
            String[] types =  {"TABLE"};
            ResultSet checkTable =  conn.getMetaData().getTables(null,null,"%",types);
            String tableName =  null;

                while (checkTable.next()) {

                    tableName = checkTable.getString(3);


                    if (tableName.equals(selectedDeleted)) {

                        try {

                            int temp = stmt.executeUpdate("DROP TABLE " + selectedDeleted);
                            break;
                        } catch (Exception e) {
                            System.out.println("There was an exception in deleting");
                        }


                    }


                    }


                    stmt.close();

        }




        //



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









    public  void comboBox2() {


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


        data.removeElement("SpellingBee");


    }






    public  void comboBoxHistory() {


        dataHistory.clear();

        try {


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/Questions.mdb;");

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT Qname FROM QName");


            while (rs.next()) {

                dataHistory.addElement(rs.getString("Qname"));

            }

            rs.close();
            conn.close();


        } catch (SQLException d) {
            d.printStackTrace();
        } catch (ClassNotFoundException f) {
            f.printStackTrace();
        }



    }










    public  class DeleteDB
    {


        MaterialButton  addButton =  new MaterialButton();
        MaterialButton cancelDialog = new MaterialButton();

        int x1 = 0;
        int y1 = 0;
        int fx = 0;
        int fy = 0;


        JLabel tobBar =  new JLabel();

        JPanel pan = new JPanel();

        JCheckBox confirm =  new JCheckBox("I confirm this delete action!");



        public DeleteDB() {


            new Move().move(deleteDialog,tobBar);


            HolderPage.f.setFocusable(false);
            HolderPage.f.setFocusableWindowState(false);

            deleteDialog.requestFocus();



            selected.setText("");
            confirm.setSelected(false);



            tobBar.setBounds(0,0,239,40);
            tobBar.setText("       Select database to delete");
            deleteDialog.add(tobBar);
            tobBar.setOpaque(true);
            tobBar.setHorizontalAlignment(SwingConstants.LEFT);
            tobBar.setBackground(MaterialColor.RED_500);
            tobBar.setForeground(Color.white);
            tobBar.setFont(new Font("Calibri",1, 17));




            cancelDialog.setBounds(229,-9,70,57);
            cancelDialog.setText("X");
            cancelDialog.setFont(new Font("Calibri", 1, 17));
            cancelDialog.setHorizontalAlignment(SwingConstants.CENTER);
            cancelDialog.setBackground(MaterialColor.WHITE);
            cancelDialog.setForeground(MaterialColor.RED_500);
            //cancelDialog.setContentAreaFilled(false);
            deleteDialog.add(cancelDialog);

            cancelDialog.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    deleteDialog.setVisible(false);
                    HolderPage.f.setFocusable(true);
                    HolderPage.f.setFocusableWindowState(true);
                    HolderPage.f.requestFocus();

                }
            });



            selected.setBounds(20, 50, 240, 30);
            selected.setFont(new Font("Calibri", 1, 18));
            selected.setOpaque(false);
            selected.setBackground(MaterialColor.DARK_WHITE);
            selected.setHorizontalAlignment(SwingConstants.CENTER);
            selected.setEditable(false);
            deleteDialog.add(selected);


            scroll2.setBounds(20, 90, 240, 150);
            listID.setFont(new Font("Calibri", 0, 20));
            listID.setFixedCellHeight(25);
            listID.setSelectionBackground(new Color(255, 250, 152));
            listID.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            scroll2.getViewport().setView(listID);
            scroll2.getVerticalScrollBar().setUI(new MyScrollBarUI());
            deleteDialog.add(scroll2);

            listID.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    selected.setText(listID.getSelectedValue().toString());
                }
            });

            comboBox2();



            confirm.setBounds(20, 250, 200, 30);
            deleteDialog.add(confirm);


            confirm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {


                    if(confirm.isSelected()){

                        addButton.setEnabled(true);
                    }
                    else{

                        addButton.setEnabled(false);
                    }
                }
            });





            addButton.setBounds(100, 280, 100, 45);
            addButton.setFont(new Font("Calibri", 1, 17));
            addButton.setHorizontalAlignment(SwingConstants.CENTER);
            addButton.setBackground(MaterialColor.RED_400);
            addButton.setForeground(Color.white);
            addButton.setText("Delete");
            addButton.setEnabled(false);
            deleteDialog.add(addButton);

            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {



                    addButton.setEnabled(false);
                    confirm.setSelected(false);

                    contestantStatus.setText("Load a database");
                    HolderPage.f.setFocusable(true);
                    HolderPage.f.setFocusableWindowState(true);
                    deleteDialog.setVisible(false);
                    HolderPage.f.requestFocus();

                    deleteAction();
                    comboBox();
                    JOptionPane.showMessageDialog(null,"Database succesfully deleted","",JOptionPane.INFORMATION_MESSAGE);

                    //quiznametext.setText(selected.getText());
                    //dlog2.dispose();




                }
            });



            deleteDialog.setLayout(null);
            deleteDialog.setSize(290, 330);





            int locationX = HolderPage.f.getX() ;
            int locationY =  HolderPage.f.getY();


            deleteDialog.getContentPane().setBackground(MaterialColor.GREY_200);
            deleteDialog.setUndecorated(true);
            deleteDialog.setVisible(true);
            deleteDialog.setLocation(locationX  + 400,locationY + 160);




        }


    }




            public void retrieveAccountInformation(){


                try {


                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                    Connection conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/Accounts/Accounts.mdb;");

                    Statement st = conn.createStatement();

                    ResultSet rs = st.executeQuery("SELECT ID, NameID, status FROM account WHERE ID = 'admin'");


                    while (rs.next()) {

                        adminName.setText(rs.getString("NameID"));
                        adminStatus.setText(rs.getString("status"));

                    }

                    rs.close();
                    conn.close();


                } catch (SQLException d) {
                    d.printStackTrace();
                } catch (ClassNotFoundException f) {
                    f.printStackTrace();
                }





                Image imgSmall =  new ImageIcon("DB/Accounts/mainPicture.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                accountPix.setIcon(new ImageIcon(imgSmall));
                Image imgBig =  new ImageIcon("DB/Accounts/mainPicture.png").getImage().getScaledInstance(220, 200, Image.SCALE_SMOOTH);
                actImage.setIcon(new ImageIcon(imgBig));


            }









    public void saveAccountInformation(){


        PreparedStatement ps = null;
        Connection conn = null;

        try {


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/Accounts/Accounts.mdb;");


            ps = conn.prepareStatement("DELETE FROM account WHERE ID = 'admin'");
            ps.execute();

            ps = conn.prepareStatement ("INSERT INTO account (ID, NameID, status) "+ "VALUES (?, ?, ?)");



            ps.setString (1, "admin");
            ps.setString (2, acctNameTxt.getText());
            ps.setString (3, statusCombo.getSelectedItem().toString());


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






        try{

            MyImage.setImage("mainPicture", outputfile);


        }
        catch (Exception fg){fg.printStackTrace();}





        JOptionPane.showMessageDialog(HolderPage.f,"Information Updated","",JOptionPane.INFORMATION_MESSAGE);

    }

















    public static void main(String[] args) {



//
//        try
//        {
//            for(UIManager.LookAndFeelInfo info: UIManager.getInstalledLookAndFeels())
//            {
//                if ("Nimbus".equals(info.getName())) {
//                    UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        }
//        catch(Exception e){}


//
//        try{
//
//
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//
//        }
//        catch(Exception e){}

//


        new Admin();
    }

}


