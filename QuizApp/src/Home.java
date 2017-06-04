/**
 * Created by EdidiongEyo on 11/5/2016.
 */

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.*;
import java.io.RandomAccessFile;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;


@SuppressWarnings({"SpellCheckingInspection", "FieldCanBeLocal", "WeakerAccess"})
public class Home extends JPanel {


    public static JFrame f = new JFrame("");


    int x;
    int y;

    int heightdiv;
    int widthdiv;


    private JButton up = new JButton();
    private JButton down =  new JButton();


    private static JPanel panel  = new JPanel();


    private MaterialPanel participant1 =  new MaterialPanel();
    private JPanel participant2 =  new JPanel();
    private JPanel participant3 =  new JPanel();
    private JPanel participant4 =  new JPanel();
    private JPanel participant5 =  new JPanel();

    private MaterialTextField part1name =  new MaterialTextField();
    private JTextField part1ID =  new JTextField("1");

    private MaterialTextField part2name =  new MaterialTextField();
    private JTextField part2ID =  new JTextField("2");

    private MaterialTextField part3name =  new MaterialTextField();
    private JTextField part3ID =  new JTextField("3");

    private MaterialTextField part4name =  new MaterialTextField();
    private JTextField part4ID =  new JTextField("4");

    private MaterialTextField part5name =  new MaterialTextField();
    private JTextField part5ID =  new JTextField("5");

    private JLabel reset1 = new JLabel("Clear");
    private JLabel reset2 = new JLabel("Clear");
    private JLabel reset3 = new JLabel("Clear");
    private JLabel reset4= new JLabel("Clear");
    private JLabel reset5 = new JLabel("Clear");


    private JButton go = new JButton();
    private JButton start = new JButton();
    JButton reset = new JButton();

    private JButton retrieve =  new JButton();

    private JLabel contestantStatus = new JLabel("No Contestant!");

    private static int count = 0;
    private static int participantMax = 0;
    private static int startCount = 1;

    private FlowLayout layout =  new FlowLayout(FlowLayout.CENTER,10,20);
   private JScrollPane scroll;

    //private MaterialScrollPane scroll;

    private MaterialPanel settings =  new MaterialPanel();

    private JComboBox combo = new JComboBox();

    private JComboBox rangestart = new JComboBox();

    private JComboBox rangestop = new JComboBox();
    private MaterialComboBox time = new MaterialComboBox();
    private MaterialComboBox point = new MaterialComboBox();

    private JLabel questLabel =  new JLabel("No of Questions:");
    private JLabel timeLabel =  new JLabel("Time:");
    private JLabel pointLabel = new JLabel("Points:");

    JLabel quizname =  new JLabel("QuizDB:");

    JTextField quiznametext =  new JTextField();

    MaterialButton updateSettings = new MaterialButton();
    MaterialButton edit = new MaterialButton();





   // Image imaget = new ImageIcon("img/home.png").getImage();


    MaterialButton selectDB =  new MaterialButton ();




    ///////////////////////////////////////////////////////////////////////
    //MaterialWindow dlog2 = new MaterialWindow();

    public static MaterialDialog dlog2 = new MaterialDialog();


    DefaultListModel data = new DefaultListModel();

    JList listID  =  new JList(data);




    MaterialButton  addButton =  new MaterialButton();
    JButton cancel = new JButton("Cancel");

    JScrollPane scroll2 =  new JScrollPane(listID);
    static JTextField selected = new JTextField();




    //////////////////////////////////////////////////////////////////////////////////


    JButton home = new JButton();



    JLabel downbar =  new JLabel();
    JLabel yellowUp =  new JLabel();




    JLabel topBar = new JLabel("QuizApp");




    int x1 = 0;
    int y1 = 0;
    int fx = 0;
    int fy = 0;


    JButton close = new JButton();
    JButton minimize =  new JButton();
    JButton topMenu =  new JButton();


    //////////////////////////////////////////////////////////////////////////////////////





    JLabel date = new JLabel();

    DateFormat dateFormat = new SimpleDateFormat("EEE. MMMMMMMMMMMMMM, yyyy  |  hh:mm aaa");

    Date dated = new Date();



    //////////////////////////////////////////////////////////////////////////////

    JLabel breadCrumb =  new JLabel("Home > New Quiz");



    public Home() {




          dlog2.addWindowFocusListener(new WindowFocusListener() {
              @Override
              public void windowGainedFocus(WindowEvent e) {

              }

              @Override
              public void windowLostFocus(WindowEvent e) {

                  //System.out.println("true");
                  dlog2.dispose();
              }
          });



        new Move().move(HolderPage.f,topBar);





        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = y / 2;
        widthdiv = x / 2;

        setBackground(Color.white);
        setLayout(null);

        panel.setLayout(layout);
        panel.setBackground(MaterialColor.ORANGE_300);
       // panel.setBackground(new Color(233, 233, 233));
        panel.setPreferredSize(new Dimension(400,380));
        panel.updateUI();

        scroll = new JScrollPane(panel);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
       // scroll.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2,true),"Contestants", 1,2,new Font("Calibri",1,14),Color.red));
        scroll.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(200, 200, 200),3,true),"Contestants", 2,2,new Font("Calibri",1,20),Color.black));
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        scroll.getViewport().putClientProperty("EnableWindowBlit", Boolean.TRUE);
        scroll.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
        scroll.getVerticalScrollBar().setUI(new MyScrollBarUI());
        scroll.setBounds(30,100,500,380);
        add(scroll);
        scroll.updateUI();

        contestantStatus.setBounds(45, 488, 150, 25);
        contestantStatus.setFont(new Font("Calibri", 1, 16));
        contestantStatus.setBackground(new Color(0, 168, 89));
        contestantStatus.setHorizontalAlignment(SwingConstants.CENTER);
        contestantStatus.setOpaque(true);
        contestantStatus.setForeground(Color.white);
        add(contestantStatus);


        resetButtons();

        panelsAndTextFields();


        up.setBounds(220, 485, 30, 30);
        up.setIcon(new ImageIcon("img//add.png"));
        up.setRolloverIcon(new ImageIcon("img//addR.png"));
        up.setContentAreaFilled(false);
        up.setToolTipText("Add new contestant");
        add(up);

        up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                go.setEnabled(true);

                count = count + 1;

                if(count == 5){

                    up.setEnabled(false);

                }

                if(count > 0){

                    down.setEnabled(true);

                }


                    if (count == 1){

                        participant1.setVisible(true);
                        panel.setPreferredSize(new Dimension(400,380));
                        contestantStatusProg();

                    }


                if (count == 2){

                    participant2.setVisible(true);
                    panel.setPreferredSize(new Dimension(400,380));
                    contestantStatusProg();

                }

                if (count == 3){

                    participant3.setVisible(true);
                    panel.setPreferredSize(new Dimension(400,430));
                    contestantStatusProg();

                }


                if (count == 4){

                    participant4.setVisible(true);
                    panel.setPreferredSize(new Dimension(400,580));
                    contestantStatusProg();

                }

                if (count == 5){

                    participant5.setVisible(true);
                    panel.setPreferredSize(new Dimension(400,720));
                    contestantStatusProg();

                }

            }
        });

        down.setBounds(260, 485, 30, 30);
        down.setEnabled(false);
        down.setIcon(new ImageIcon("img//down.png"));
        down.setRolloverIcon(new ImageIcon("img//downR.png"));
        down.setContentAreaFilled(false);
        down.setToolTipText("Remove existing contestant");
        add(down);


        down.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                count = count - 1;

                if(count < 5){

                    up.setEnabled(true);

                }

                if(count == 0){

                    down.setEnabled(false);
                    go.setEnabled(false);
                    contestantStatusProg();
                }


                if (count == 4){

                    participant5.setVisible(false);
                    part5name.setText("Name");
                    panel.setPreferredSize(new Dimension(400,480));
                    contestantStatusProg();

                }

                if (count == 3){

                    participant4.setVisible(false);
                    part4name.setText("Name");
                    panel.setPreferredSize(new Dimension(400,430));
                    contestantStatusProg();

                }

                if (count == 2){

                    participant3.setVisible(false);
                    part3name.setText("Name");
                    panel.setPreferredSize(new Dimension(400,380));
                    contestantStatusProg();

                }

                if (count == 1){

                    participant2.setVisible(false);
                    part2name.setText("Name");
                    panel.setPreferredSize(new Dimension(400,380));
                    contestantStatusProg();


                }


                if (count == 0){

                    participant1.setVisible(false);
                    part1name.setText("Name");
                    panel.setPreferredSize(new Dimension(400,380));
                    contestantStatusProg();


                }

            }
        });



        reset.setBounds(300, 485, 30, 30);
        reset.setIcon(new ImageIcon("img//reset.png"));
       reset.setRolloverIcon(new ImageIcon("img//resetR.png"));
        reset.setToolTipText("Reset contestants information");
        add(reset);

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                totalReset();
            }
        });



        go.setBounds(340, 485, 30, 30);
        go.setEnabled(false);
        go.setIcon(new ImageIcon("img//save.png"));
        go.setToolTipText("Save contestants information");
        add(go);

        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                goaction();
                participantCount();


            }

        });



        start.setBounds(380, 485, 30, 30);
        start.setIcon(new ImageIcon("img//start.png"));
        start.setRolloverIcon(new ImageIcon("img//startR.png"));
        start.setEnabled(false);
        start.setToolTipText("Start quiz");
        add(start);



        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if(updateSettings.isVisible()){

                    JOptionPane.showMessageDialog(null, "Please Update Quiz Settings","SETTINGS", JOptionPane.INFORMATION_MESSAGE);

                }
                else{

                   // f.dispose();
                  // new Quiz();

                    totalReset();
                    HolderPage.content.removeAll();

                    HolderPage.content.add(new Quiz());


                    HolderPage.content.updateUI();

                    HolderPage.f.setTitle("QuizApp 2016 - Quiz");



                }



            }

        });



        retrieve.setBounds(420, 485, 30, 30);
        retrieve.setIcon(new ImageIcon("img//retrieve.png"));
        retrieve.setRolloverIcon(new ImageIcon("img//retrieveR.png"));
        retrieve.setToolTipText("Retrieve from existing database");
        add(retrieve);

        retrieve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    retrieveDB();

            }
        });






        home.setBounds(300, 42, 30, 30);
        home.setIcon( new ImageIcon("img//home.png"));
        home.setRolloverIcon( new ImageIcon("img//homeR.png"));
        home.setToolTipText("Return to home");

        add(home);


        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JOptionPane pane = new JOptionPane("Are you really sure you want to exit?", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION);
                JDialog dialog2 = pane.createDialog(null, "Exit");
                //dialog2.setUndecorated(true);
                dialog2.show();
               String selectedValue = pane.getValue().toString();

                if(selectedValue.equals("0")){

                    totalReset();

                    HolderPage.content.removeAll();

                    HolderPage.content.add(new Entry());

                    HolderPage.content.updateUI();

                    HolderPage.f.setTitle("QuizApp 2016 - Welcome!");


                }
                else{

                    dialog2.show(false);
                }





            }
        });







        settings.setLayout(null);
        //settings.setBounds(600,100,380,200);
        settings.setBackground(MaterialColor.ORANGE_300);
        settings.setPreferredSize(new Dimension(360,200));

        add(settings);


        JScrollPane settingsScroll =  new JScrollPane();

        settingsScroll = new JScrollPane(settings);
        settingsScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        settingsScroll.setBounds(570,100,380,220);
       // settingsScroll.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2,true),"Quick Settings", 1,2,new Font("Calibri",1,14),Color.red));
        settingsScroll.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(200, 200, 200),3,true),"Quick Settings", 2,2,new Font("Calibri",1,20),Color.black));
        settingsScroll.getVerticalScrollBar().setUnitIncrement(16);
        settingsScroll.getViewport().putClientProperty("EnableWindowBlit", Boolean.TRUE);
        settingsScroll.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
        settingsScroll.getVerticalScrollBar().setUI(new MyScrollBarUI());

        add(settingsScroll);

        //ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED


        questLabel.setBounds(20,20, 140,30);
        questLabel.setForeground(Color.white);
        questLabel.setFont(new Font("Calibri", 1,16));
        //settings.add(questLabel);

        timeLabel.setBounds(160,20, 140,30);
        timeLabel.setForeground(Color.white);
        timeLabel.setFont(new Font("Calibri", 1,16));
        settings.add(timeLabel);

        pointLabel.setBounds(20,20, 140,30);
        pointLabel.setForeground(Color.white);
        pointLabel.setFont(new Font("Calibri", 1,16));
        settings.add(pointLabel);


        quizname.setBounds(20,70, 80,30);
        quizname.setForeground(Color.white);
        quizname.setFont(new Font("Calibri", 1,16));
        settings.add(quizname);

        quiznametext.setBounds(90,70, 180,30);
        quiznametext.setFont(new Font("Calibri", 0,16));
        quiznametext.setEditable(false);
        settings.add(quiznametext);



        combo.addItem("All");
        combo.addItem("Range");

        combo.setBounds(140,20,80,30);
        //settings.add(combo);

        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(combo.getSelectedItem().toString().equals("Range")){

                    rangestart.setVisible(true);
                    rangestop.setVisible(true);

                }
                else{

                    rangestart.setVisible(false);
                    rangestop.setVisible(false);

                }
            }
        });





        rangestart.addItem("1");
        rangestart.addItem("2");
        rangestart.addItem("3");

        rangestart.setBounds(220,20,50,30);
        rangestart.setVisible(false);
        //settings.add(rangestart);


        rangestop.addItem("1");
        rangestop.addItem("2");
        rangestop.addItem("3");

        rangestop.setBounds(270,20,50,30);
        rangestop.setVisible(false);
        //settings.add(rangestop);


        //time.addItem("5secs");
       // time.addItem("10secs");
      //  time.addItem("15secs");
        time.addItem("30secs");
       time.addItem("45secs");
       time.addItem("60secs");

        time.setBounds(205 ,20,75 ,28);
        settings.add(time);


        point.addItem("1pt");
        point.addItem("3pts");
        point.addItem("5pts");
       // point.addItem("10pts");


        point.setBounds(75,20,63,28);
        settings.add(point);




         //combo.setEnabled(false);
        //point.setEnabled(false);
        //time.setEnabled(false);
        //rangestop.setEnabled(false);
        //rangestart.setEnabled(false);


        updateSettings.setBounds(120, 120, 120,50);
        updateSettings.setBackground(MaterialColor.BLUE_700);
        updateSettings.setForeground(Color.WHITE);
        updateSettings.setFont(new Font("Calibri", 1, 16));
        updateSettings.setText("Update");
        settings.add(updateSettings);


        edit.setBounds(120, 120, 120,50);
        edit.setBackground(MaterialColor.BLUE_700);
        edit.setForeground(Color.WHITE);
        edit.setFont(new Font("Calibri", 1, 16));
        edit.setEnabled(true);
        edit.setVisible(false);
        edit.setText("Edit");
        settings.add(edit);



        selectDB.setBounds(278, 63, 80,45);
        selectDB.setBackground(new Color(0, 168, 89));
        selectDB.setForeground(Color.WHITE);
        selectDB.setFont(new Font("Calibri", 1, 15));
        selectDB.setText("Choose");



        settings.add(selectDB);


        selectDB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                selected.setText("");
              new SaveDB();





            }
        });





        updateSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                settingsUpdate();


            }
        });





        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                combo.setEnabled(true);
                point.setEnabled(true);
                time.setEnabled(true);
                rangestop.setEnabled(true);
                rangestart.setEnabled(true);
                quiznametext.setEnabled(true);
                selectDB.setEnabled(true);

               edit.setVisible(false);
                updateSettings.setVisible(true);




            }
        });







        close.setBounds(926,5,30,30);
        close.setIcon(new ImageIcon("img//power.png"));
       close.setRolloverIcon(new ImageIcon("img//powerR.png"));
        add(close);


        minimize.setBounds(880,5,30,30);
        minimize.setIcon(new ImageIcon("img//minimize.png"));
        minimize.setRolloverIcon(new ImageIcon("img//minimizeR.png"));
        add(minimize);

        minimize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                HolderPage.f.setState(Frame.ICONIFIED);
            }
        });

        topMenu.setBounds(825,5,30,30);
        topMenu.setIcon(new ImageIcon("img//menu.png"));
        topMenu.setRolloverIcon(new ImageIcon("img//menuR.png"));
        add(topMenu);

        topMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                new TopMenu();

            }
        });





        topBar.setBounds(0,0,1000,40);
        topBar.setOpaque(true);
        topBar.setBackground(MaterialColor.BLUE_800);
        topBar.setForeground(MaterialColor.DARK_WHITE);
        topBar.setFont(new Font("Calibri",1, 20));
        topBar.setHorizontalAlignment(SwingConstants.CENTER);
        add(topBar);




        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);

            }
        });



        breadCrumb.setBounds(40,40,400,35);
        breadCrumb.setForeground(MaterialColor.WHITE);
        breadCrumb.setFont(new Font("Calibri", 1, 18));
        add(breadCrumb);




        date.setBounds(750,40,400,35);
        date.setForeground(MaterialColor.WHITE);
        date.setFont(new Font("Calibri", 1, 18));
        add(date);


        java.util.Timer timer4 = new java.util.Timer();
        TimerTask myTask = new TimerTask() {
            @Override
            public void run() {


                dated = new java.util.Date();
                date.setText(dateFormat.format(dated).toString());


            }
        };

        timer4.scheduleAtFixedRate(myTask,0,1000);





        yellowUp.setBounds(0,40,1000,35);
        yellowUp.setBackground(MaterialColor.ORANGE_400);
        yellowUp.setOpaque(true);
       add(yellowUp);








        downbar.setBounds(0,530,1000,40);
        downbar.setBackground(new Color(233, 233, 233));
        downbar.setOpaque(true);
        add(downbar);



        setBackground(Color.white);


    }






    public void goaction(){


        String name1SQL = part1name.getText();
        String name2SQL = part2name.getText();
        String name3SQL = part3name.getText();
        String name4SQL = part4name.getText();
        String name5SQL = part5name.getText();




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
                start.setEnabled(true);


                reset1.setVisible(false);
                reset2.setVisible(false);
                reset3.setVisible(false);
                reset4.setVisible(false);
                reset5.setVisible(false);

    }


        public void retrieveDB(){


            try {

                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");
                Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                ResultSet rec = st.executeQuery("SELECT Id, Participant FROM Participants");


                if(rec.absolute(1)){

                    part1name.setText(rec.getString("participant"));
                    participant1.setVisible(true);
                    go.setEnabled(true);
                    count = 1;

                    participant2.setVisible(false);
                    participant3.setVisible(false);
                    participant4.setVisible(false);
                    participant5.setVisible(false);

                    down.setEnabled(true);
                    contestantStatusProg();

                    panel.setPreferredSize(new Dimension(400,380));
                }

                if(rec.absolute(2)){

                    part2name.setText(rec.getString("participant"));
                    participant2.setVisible(true);
                    count = 2;

                    participant3.setVisible(false);
                    participant4.setVisible(false);
                    participant5.setVisible(false);

                    contestantStatusProg();

                    panel.setPreferredSize(new Dimension(400,380));

                }

                if(rec.absolute(3)){

                    part3name.setText(rec.getString("participant"));
                    participant3.setVisible(true);
                    count = 3;

                    participant4.setVisible(false);
                    participant5.setVisible(false);

                    contestantStatusProg();

                    panel.setPreferredSize(new Dimension(400,430));
                }

                if(rec.absolute(4)){

                    part4name.setText(rec.getString("participant"));
                    participant4.setVisible(true);
                    count = 4;

                    participant5.setVisible(false);

                    panel.setPreferredSize(new Dimension(400,580));

                    contestantStatusProg();
                }

                if(rec.absolute(5)){

                    part5name.setText(rec.getString("participant"));
                    participant5.setVisible(true);
                    count = 5;

                    panel.setPreferredSize(new Dimension(400,720));

                    up.setEnabled(false);

                    contestantStatusProg();

                }



                st.close();
                conn.close();


            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }


        }




        public void resetButtons(){

            reset1.setBounds(220, 69, 50, 30);
            reset1.setFont(new Font("Calibri", 2, 15));
            reset1.setForeground(Color.red);
            reset1.setOpaque(false);
            participant1.add(reset1);

            reset1.addMouseListener(new MouseAdapter() {
                                        @Override
                                        public void mouseClicked(MouseEvent e) {
                                            super.mouseClicked(e);
                                            part1name.setText("");
                                        }
                                    }
            );


            reset2.setBounds(220, 69, 50, 30);
            reset2.setFont(new Font("Calibri", 2, 15));
            reset2.setForeground(Color.red);
            reset2.setOpaque(false);
            participant2.add(reset2);

            reset2.addMouseListener(new MouseAdapter() {
                                        @Override
                                        public void mouseClicked(MouseEvent e) {
                                            super.mouseClicked(e);
                                            part2name.setText("");
                                        }
                                    }
            );


            reset3.setBounds(220, 69, 50, 30);
            reset3.setFont(new Font("Calibri", 2, 15));
            reset3.setForeground(Color.red);
            reset3.setOpaque(false);
            participant3.add(reset3);

            reset3.addMouseListener(new MouseAdapter() {
                                        @Override
                                        public void mouseClicked(MouseEvent e) {
                                            super.mouseClicked(e);
                                            part3name.setText("");
                                        }
                                    }
            );


            reset4.setBounds(220, 69, 50, 30);
            reset4.setFont(new Font("Calibri", 2, 15));
            reset4.setForeground(Color.red);
            reset4.setOpaque(false);
            participant4.add(reset4);

            reset4.addMouseListener(new MouseAdapter() {
                                        @Override
                                        public void mouseClicked(MouseEvent e) {
                                            super.mouseClicked(e);
                                            part4name.setText("");
                                        }
                                    }
            );


            reset5.setBounds(220, 69, 50, 30);
            reset5.setFont(new Font("Calibri", 2, 15));
            reset5.setForeground(Color.red);
            reset5.setOpaque(false);
            participant5.add(reset5);

            reset5.addMouseListener(new MouseAdapter() {
                                        @Override
                                        public void mouseClicked(MouseEvent e) {
                                            super.mouseClicked(e);
                                            part5name.setText("");
                                        }
                                    }
            );

        }




        public void panelsAndTextFields(){


            part1ID.setBounds(10,20,100,30);
            part1ID.setFont(new Font("Calibri", 1, 15));
            part1ID.setEditable(false);
            participant1.add(part1ID);


            part1name.setBounds(10,70,200,35);
            part1name.setFont(Roboto.REGULAR.deriveFont(16f));
            part1name.setHint("Contestant One details");
            participant1.add(part1name);

            part2ID.setBounds(10, 20, 100, 30);
            part2ID.setFont(new Font("Calibri", 1, 15));
            part2ID.setEditable(false);
            participant2.add(part2ID);


            part2name.setBounds(10,70,200,30);
            part2name.setFont(Roboto.REGULAR.deriveFont(16f));
            part2name.setHint("Contestant Two details");
            participant2.add(part2name);


            part3ID.setBounds(10, 20, 100, 30);
            part3ID.setFont(new Font("Calibri", 1, 15));
            part3ID.setEditable(false);
            participant3.add(part3ID);


            part3name.setBounds(10,70,200,30);
            part3name.setFont(Roboto.REGULAR.deriveFont(16f));
            part3name.setHint("Contestant Three details");
            participant3.add(part3name);


            part4ID.setBounds(10, 20, 100, 30);
            part4ID.setFont(new Font("Calibri", 1, 15));
            part4ID.setEditable(false);
            participant4.add(part4ID);


            part4name.setBounds(10,70,200,30);
            part4name.setFont(Roboto.REGULAR.deriveFont(16f));
            part4name.setHint("Contestant Four details");
            participant4.add(part4name);



            part5ID.setBounds(10, 20, 100, 30);
            part5ID.setFont(new Font("Calibri", 1, 15));
            part5ID.setEditable(false);
            participant5.add(part5ID);


            part5name.setBounds(10,70,200,30);
            part5name.setFont(Roboto.REGULAR.deriveFont(16f));
            part5name.setHint("Contestant Five details");
            participant5.add(part5name);



            participant1.setLayout(null);
            participant1.setPreferredSize(new Dimension(450,120));
            participant1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.blue,1), "Contestant 1"));
            participant1.setBackground(Color.white);

            participant2.setLayout(null);
            participant2.setPreferredSize(new Dimension(450,120));
            participant2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.blue,1), "Contestant 2"));
            participant2.setBackground(Color.white);

            participant3.setLayout(null);
            participant3.setPreferredSize(new Dimension(450,120));
            participant3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.blue,1), "Contestant 3"));
            participant3.setBackground(Color.white);

            participant4.setLayout(null);
            participant4.setPreferredSize(new Dimension(450,120));
            participant4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.blue,1), "Contestant 4"));
            participant4.setBackground(Color.white);

            participant5.setLayout(null);
            participant5.setPreferredSize(new Dimension(450,120));
            participant5.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.blue,1), "Contestant 5"));
            participant5.setBackground(Color.white);


            panel.add(participant1);
            participant1.setVisible(false);

            panel.add(participant2);
            participant2.setVisible(false);

            panel.add(participant3);
            participant3.setVisible(false);

            panel.add(participant4);
            participant4.setVisible(false);

            panel.add(participant5);
            participant5.setVisible(false);

        }


        public  void contestantStatusProg(){

            if(count == 0){

                contestantStatus.setText("No Contestant!");
            }
           else if(count == 1){

                contestantStatus.setText("One Contestant");
            }
            else if(count == 2){

                contestantStatus.setText("Two Contestants");
            }
            else if(count == 3){

                contestantStatus.setText("Three Contestants");
            }
            else if(count == 4){

                contestantStatus.setText("Four Contestants");
            }
            else if(count == 5){

                contestantStatus.setText("Five Contestants");
            }



        }



            public void totalReset(){


                    count = 0;
                    contestantStatusProg();

                    go.setEnabled(false);
                    start.setEnabled(false);


                    participant5.setVisible(false);
                    part5name.setText("Name");

                    participant4.setVisible(false);
                    part4name.setText("Name");

                    participant3.setVisible(false);
                    part3name.setText("Name");

                    participant2.setVisible(false);
                    part2name.setText("Name");

                    participant1.setVisible(false);
                    part1name.setText("Name");

                    up.setEnabled(true);
                    down.setEnabled(false);
                    retrieve.setEnabled(true);

                    reset1.setVisible(true);
                    reset2.setVisible(true);
                    reset3.setVisible(true);
                    reset4.setVisible(true);
                    reset5.setVisible(true);


                panel.setPreferredSize(new Dimension(400,380));


            }





    public void participantCount(){


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
            conf.close();


        }
        catch (Exception exception)
        {
            System.out.println("config-file read error: " + exception.toString());
        }














    }



    public void settingsUpdate() {


        if (quiznametext.getText().equals("") || quizname.getText() == null) {



            JOptionPane.showMessageDialog(null, "No Question Choosen", "", JOptionPane.INFORMATION_MESSAGE);


            updateSettings.setVisible(true);
            edit.setVisible(false);


        } else {



            updateSettings.setVisible(false);
            edit.setVisible(true);



            String counterNow = time.getSelectedItem().toString();
            String questionID = quiznametext.getText();
            RandomAccessFile conf;


            try {

                conf = new RandomAccessFile("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\DB\\counter", "rw");
                //conf.seek(0);
                conf.writeBytes(counterNow);
                conf.close();


            } catch (Exception exception) {
                System.out.println("config-file read error: " + exception.toString());
            }


            try {

                conf = new RandomAccessFile("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\DB\\QuizDB", "rw");
                //conf.seek(0);
                // conf.writeBytes("   ");
                conf.writeBytes(questionID + "                ");
                conf.close();


            } catch (Exception exception) {
                System.out.println("config-file read error: " + exception.toString());
            }


            combo.setEnabled(false);
            point.setEnabled(false);
            time.setEnabled(false);
            rangestop.setEnabled(false);
            rangestart.setEnabled(false);
            quiznametext.setEnabled(false);
            selectDB.setEnabled(false);


            PreparedStatement ps = null;
            Connection conn = null;


            try {


                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");


                ps = conn.prepareStatement("UPDATE QuizSettings SET attr = '" + point.getSelectedItem().toString() + "' WHERE id = '" + 2 + "'");
                ps.executeUpdate();

                ps = conn.prepareStatement("UPDATE QuizSettings SET attr = '" + combo.getSelectedItem().toString() + "' WHERE id = '" + 3 + "'");
                ps.executeUpdate();

                ps = conn.prepareStatement("UPDATE QuizSettings SET attr = '" + time.getSelectedItem().toString() + "' WHERE id = '" + 4 + "'");
                ps.executeUpdate();

                conn.close();
                ps.close();


            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error in Uploading records", "FAILURE", JOptionPane.PLAIN_MESSAGE);

            } // end catch
            catch (ClassNotFoundException classNotFound) {
                classNotFound.printStackTrace();

            } // end catch


        }


    }




//    public void paintComponent(Graphics g){
//
//        super.paintComponent(g);
//
//
//
//
//        //	g.setFont(new Font("Calibri (Body)", 1, 11));
//
//       // g.drawImage(imaget, 0, 0,1000,570,this);
//
//
//
//    }





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















    public  class SaveDB
    {


        int x1 = 0;
        int y1 = 0;
        int fx = 0;
        int fy = 0;


        JLabel tobBar =  new JLabel();

        JPanel pan = new JPanel();



        public SaveDB() {


            new Move().move(dlog2,tobBar);


            HolderPage.f.setFocusable(false);
            HolderPage.f.setFocusableWindowState(false);

            dlog2.requestFocus();
            //dlog2.setAutoRequestFocus(true);




            tobBar.setBounds(0,0,290,40);
            tobBar.setText("                      Select quiz database");
            dlog2.add(tobBar);
            tobBar.setOpaque(true);
            tobBar.setHorizontalAlignment(SwingConstants.LEFT);
            tobBar.setBackground(new Color(0, 168, 89));
            tobBar.setForeground(Color.white);
            tobBar.setFont(new Font("Calibri",1, 16));



            selected.setBounds(20, 50, 240, 30);
            selected.setFont(new Font("Calibri", 1, 18));
            selected.setOpaque(false);
            selected.setBackground(new Color(230, 230, 230));
            selected.setHorizontalAlignment(SwingConstants.CENTER);
            selected.setEditable(false);
           dlog2.add(selected);


            scroll2.setBounds(20, 90, 240, 150);
            listID.setFont(new Font("Calibri", 0, 20));
            listID.setFixedCellHeight(25);
            listID.setSelectionBackground(new Color(255, 250, 152));
            listID.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            scroll2.getViewport().setView(listID);
            dlog2.add(scroll2);

            listID.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    selected.setText(listID.getSelectedValue().toString());
                }
            });

            comboBox();

            addButton.setBounds(100, 250, 100, 45);
            addButton.setFont(new Font("Calibri", 1, 17));
            addButton.setHorizontalAlignment(SwingConstants.CENTER);
            addButton.setBackground(new Color(0, 168, 89));
            addButton.setForeground(Color.white);
            addButton.setText("Choose");
            dlog2.add(addButton);

            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {



                    HolderPage.f.setFocusable(true);
                    HolderPage.f.setFocusableWindowState(true);

                    quiznametext.setText(selected.getText());
                    dlog2.dispose();



                }
            });



            dlog2.setLayout(null);
            dlog2.setSize(290, 300);





            int locationX = HolderPage.f.getX() ;
            int locationY =  HolderPage.f.getY();


            dlog2.getContentPane().setBackground(Color.white);
            dlog2.setVisible(true);
            dlog2.setLocation(locationX  + 400,locationY + 160);




        }


        }









    class Move{


        public void move(final Component frame, JLabel l){




            l.addMouseListener(


                    new MouseAdapter(){


                        public void mousePressed(MouseEvent t){


                            x1 = t.getX();
                            y1 = t.getY();



                        }


                    });




            l.addMouseMotionListener(


                    new MouseMotionAdapter(){



                        public void mouseDragged(MouseEvent evt){


                            fx = evt.getXOnScreen() - x1;

                            fy = evt.getYOnScreen() - y1;


                            frame.setLocation(fx,fy);



                        }

                    });








        }

    }








    class MyScrollBarUI extends BasicScrollBarUI {
        private final Dimension d = new Dimension();

        @Override
        protected JButton createDecreaseButton(int orientation) {
            return new JButton() {
                @Override
                public Dimension getPreferredSize() {
                    return d;
                }
            };
        }

        @Override
        protected JButton createIncreaseButton(int orientation) {
            return new JButton() {
                @Override
                public Dimension getPreferredSize() {
                    return d;
                }
            };
        }

        @Override
        protected void paintTrack(Graphics g, JComponent c, Rectangle r) {
        }

        @Override
        protected void paintThumb(Graphics g, JComponent c, Rectangle r) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            Color color = null;
            JScrollBar sb = (JScrollBar) c;
            if (!sb.isEnabled() || r.width > r.height) {
                return;
            } else if (isDragging) {
                color = MaterialColor.GREY_500;
            } else if (isThumbRollover()) {
                color = MaterialColor.GREY_500;
            } else {
                color = Color.LIGHT_GRAY;
            }
            g2.setPaint(color);
           // g2.fillRoundRect(r.x, r.y, r.width, r.height, 10, 10);
            g2.fillRect(r.x, r.y, r.width, r.height);
            g2.setPaint(Color.WHITE);
           // g2.drawRoundRect(r.x, r.y, r.width, r.height, 10, 10);
            g2.dispose();
        }

        @Override
        protected void setThumbBounds(int x, int y, int width, int height) {
            super.setThumbBounds(x, y, width, height);
            scrollbar.repaint();
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




        new Home();

    }

}

