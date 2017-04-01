/**
 * Created by EdidiongEyo on 11/5/2016.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.RandomAccessFile;
import java.sql.*;


@SuppressWarnings({"SpellCheckingInspection", "FieldCanBeLocal", "WeakerAccess"})
public class Home extends JPanel {


    public static JFrame f = new JFrame("");


    int x;
    int y;

    int heightdiv;
    int widthdiv;


    private JButton up = new JButton("Add");
    private JButton down =  new JButton("Remove");


    private static JPanel panel  = new JPanel();


    private JPanel participant1 =  new JPanel();
    private JPanel participant2 =  new JPanel();
    private JPanel participant3 =  new JPanel();
    private JPanel participant4 =  new JPanel();
    private JPanel participant5 =  new JPanel();

    private JTextField part1name =  new JTextField("Name");
    private JTextField part1ID =  new JTextField("1");

    private JTextField part2name =  new JTextField("Name");
    private JTextField part2ID =  new JTextField("2");

    private JTextField part3name =  new JTextField("Name");
    private JTextField part3ID =  new JTextField("3");

    private JTextField part4name =  new JTextField("Name");
    private JTextField part4ID =  new JTextField("4");

    private JTextField part5name =  new JTextField("Name");
    private JTextField part5ID =  new JTextField("5");

    private JLabel reset1 = new JLabel("Clear");
    private JLabel reset2 = new JLabel("Clear");
    private JLabel reset3 = new JLabel("Clear");
    private JLabel reset4= new JLabel("Clear");
    private JLabel reset5 = new JLabel("Clear");


    private JButton go = new JButton("Apply and Update");
    private JButton start = new JButton("Start");

    private JButton retrieve =  new JButton("Retrieve");

    private JLabel contestantStatus = new JLabel("No Contestant!");

    private static int count = 0;
    private static int participantMax = 0;
    private static int startCount = 1;

    private FlowLayout layout =  new FlowLayout(FlowLayout.CENTER,10,20);
    private JScrollPane scroll;


    private JPanel settings =  new JPanel();

    private JComboBox combo = new JComboBox();

    private JComboBox rangestart = new JComboBox();

    private JComboBox rangestop = new JComboBox();
    private JComboBox time = new JComboBox();
    private JComboBox point = new JComboBox();

    private JLabel questLabel =  new JLabel("No of Questions:");
    private JLabel timeLabel =  new JLabel("Time:");
    private JLabel pointLabel = new JLabel("Points:");

    JLabel quizname =  new JLabel("QuizDB:");

    JTextField quiznametext =  new JTextField();

    JButton updateSettings = new JButton("Update");
    JButton edit = new JButton("Edit");





    Image imaget = new ImageIcon("img/home.png").getImage();


    JButton selectDB =  new JButton("Choose");




    ///////////////////////////////////////////////////////////////////////
    JDialog dlog2 = new JDialog();


    DefaultListModel data = new DefaultListModel();

    JList listID  =  new JList(data);




    JButton addButton =  new JButton("Choose");
    JButton cancel = new JButton("Cancel");

    JScrollPane scroll2 =  new JScrollPane(listID);
    static JTextField selected = new JTextField();




    //////////////////////////////////////////////////////////////////////////////////













    public Home() {


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = y / 2;
        widthdiv = x / 2;

        setBackground(Color.white);
        setLayout(null);

        panel.setLayout(layout);
        panel.setBackground(new Color(0, 168, 89));
        panel.setPreferredSize(new Dimension(400,380));
        panel.updateUI();

        scroll = new JScrollPane(panel);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(45,100,500,380);
        add(scroll);
        scroll.updateUI();

        contestantStatus.setBounds(45, 50, 200, 30);
        contestantStatus.setFont(new Font("Calibri", 1, 20));
        contestantStatus.setBackground(new Color(0, 168, 89));
        contestantStatus.setHorizontalAlignment(SwingConstants.CENTER);
        contestantStatus.setOpaque(true);
        contestantStatus.setForeground(Color.white);
        add(contestantStatus);


        resetButtons();

        panelsAndTextFields();


        up.setBounds(260, 50, 80, 30);
        up.setBackground(new Color(0, 168, 89));
        up.setHorizontalAlignment(SwingConstants.CENTER);
        up.setForeground(Color.white);
        up.setFont(new Font("Calibri", 1, 17));
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

        down.setBounds(350, 50, 100, 30);
        down.setBackground(new Color(0, 168, 89));
        down.setEnabled(false);
        down.setHorizontalAlignment(SwingConstants.CENTER);
        down.setFont(new Font("Calibri", 1, 17));
        down.setForeground(Color.white);
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


        JButton reset = new JButton("Reset");
        reset.setBounds(460, 50, 80, 30);
        reset.setBackground(new Color(250, 2, 2));
        reset.setFont(new Font("Calibri", 1, 17));
        reset.setHorizontalAlignment(SwingConstants.CENTER);
        reset.setForeground(Color.white);
        add(reset);

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                totalReset();
            }
        });



        go.setBounds(45, 500, 200, 32);
        go.setFont(new Font("Calibri", 1, 17));
        go.setHorizontalAlignment(SwingConstants.CENTER);
        go.setBackground(new Color(0, 168, 89));
        go.setForeground(Color.white);
        go.setEnabled(false);
        add(go);

        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                goaction();
                participantCount();


            }

        });



        start.setBounds(250, 500, 100, 32);
        start.setFont(new Font("Calibri", 1, 17));
        start.setHorizontalAlignment(SwingConstants.CENTER);
        start.setBackground(new Color(0, 168, 89));
        start.setForeground(Color.white);
        start.setEnabled(false);
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



        retrieve.setBounds(360, 500, 150, 32);
        retrieve.setFont(new Font("Calibri", 1, 17));
        retrieve.setHorizontalAlignment(SwingConstants.CENTER);
        retrieve.setBackground(new Color(0, 168, 89));
        retrieve.setForeground(Color.white);
        add(retrieve);

        retrieve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    retrieveDB();

            }
        });


        JButton login = new JButton("Return Home");
        login.setBounds(800, 50, 150, 32);
        login.setFont(new Font("Calibri", 1, 17));
        login.setHorizontalAlignment(SwingConstants.CENTER);
        login.setBackground(new Color(245, 3, 6));
        login.setForeground(Color.white);
        add(login);


        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                JOptionPane pane = new JOptionPane("Are you really sure you want to exit?", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION);
                JDialog dialog = pane.createDialog(null, "Exit");
                dialog.show();
                String selectedValue = pane.getValue().toString();

                if(selectedValue.equals("0")){

                    totalReset();

                    HolderPage.content.removeAll();

                    HolderPage.content.add(new Entry());

                    HolderPage.content.updateUI();

                    HolderPage.f.setTitle("QuizApp 2016 - Welcome!");


                }
                else{

                    dialog.show(false);
                }





            }
        });







        settings.setLayout(null);
        //settings.setBounds(600,100,380,200);
        settings.setBackground(new Color(0, 168, 89));
        settings.setPreferredSize(new Dimension(360,200));

        add(settings);


        JScrollPane settingsScroll =  new JScrollPane();

        settingsScroll = new JScrollPane(settings);
        settingsScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        settingsScroll.setBounds(600,100,380,200);
        settingsScroll.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2,true),"Quick Settings", 1,2,new Font("Calibri",1,14),Color.red));
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


        time.addItem("5secs");
        time.addItem("10secs");
        time.addItem("15secs");
        time.addItem("30secs");
       time.addItem("45secs");
       time.addItem("60secs");

        time.setBounds(205 ,20,75 ,30);
        settings.add(time);


        point.addItem("1pt");
        point.addItem("3pts");
        point.addItem("5pts");
       // point.addItem("10pts");


        point.setBounds(75,20,63,30);
        settings.add(point);




         //combo.setEnabled(false);
        //point.setEnabled(false);
        //time.setEnabled(false);
        //rangestop.setEnabled(false);
        //rangestart.setEnabled(false);


        updateSettings.setBounds(280, 150, 80,30);
        updateSettings.setBackground(new Color(255, 197, 0));
        updateSettings.setForeground(Color.BLACK);
        updateSettings.setFont(new Font("Calibri", 1, 15));
        //updateSettings.setVisible(false);
        settings.add(updateSettings);


        edit.setBounds(280, 150, 80,30);
        edit.setBackground(new Color(255, 197, 0));
        edit.setForeground(Color.BLACK);
        edit.setFont(new Font("Calibri", 1, 15));
        edit.setEnabled(true);
        edit.setVisible(false);
        settings.add(edit);



        selectDB.setBounds(280, 70, 80,30);
        selectDB.setBackground(new Color(255, 197, 0));
        selectDB.setForeground(Color.BLACK);
        selectDB.setFont(new Font("Calibri", 1, 15));


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

                updateSettings.setVisible(false);
                edit.setVisible(true);

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


//        f.add(this);
//        f.setSize(1000,600);
//        f.setDefaultCloseOperation(3);
//        f.setVisible(true);
//        updateUI();

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


            part1name.setBounds(10,70,200,30);
            part1name.setFont(new Font("Calibri", 1, 15));
            participant1.add(part1name);

            part2ID.setBounds(10, 20, 100, 30);
            part2ID.setFont(new Font("Calibri", 1, 15));
            part2ID.setEditable(false);
            participant2.add(part2ID);


            part2name.setBounds(10,70,200,30);
            part2name.setFont(new Font("Calibri", 1, 15));
            participant2.add(part2name);


            part3ID.setBounds(10, 20, 100, 30);
            part3ID.setFont(new Font("Calibri", 1, 15));
            part3ID.setEditable(false);
            participant3.add(part3ID);


            part3name.setBounds(10,70,200,30);
            part3name.setFont(new Font("Calibri", 1, 15));
            participant3.add(part3name);


            part4ID.setBounds(10, 20, 100, 30);
            part4ID.setFont(new Font("Calibri", 1, 15));
            part4ID.setEditable(false);
            participant4.add(part4ID);


            part4name.setBounds(10,70,200,30);
            part4name.setFont(new Font("Calibri", 1, 15));
            participant4.add(part4name);



            part5ID.setBounds(10, 20, 100, 30);
            part5ID.setFont(new Font("Calibri", 1, 15));
            part5ID.setEditable(false);
            participant5.add(part5ID);


            part5name.setBounds(10,70,200,30);
            part5name.setFont(new Font("Calibri", 1, 15));
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


//        PreparedStatement ps = null;
//        Connection conn = null;
//
//
//
//        try {
//
//
//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//            conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");
//
//
//            ps = conn.prepareStatement("UPDATE QuizSettings SET attr = '"+count+"' WHERE id = '"+1+"'");
//            ps.executeUpdate();
//            conn.close();
//            ps.close();
//
//
//        }
//
//
//
//        catch ( SQLException sqlException )
//        {
//            sqlException.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Error in Uploading records", "FAILURE", JOptionPane.PLAIN_MESSAGE);
//
//        } // end catch
//        catch ( ClassNotFoundException classNotFound )
//        {
//            classNotFound.printStackTrace();
//
//        } // end catch
//





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



    public void settingsUpdate(){




        String counterNow = time.getSelectedItem().toString();
        String questionID = quiznametext.getText();
        RandomAccessFile conf;


        try{

            conf = new RandomAccessFile("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\DB\\counter", "rw");
            //conf.seek(0);
            conf.writeBytes(counterNow);
            conf.close();


        }
        catch (Exception exception)
        {
            System.out.println("config-file read error: " + exception.toString());
        }





        try{

            conf = new RandomAccessFile("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\DB\\QuizDB", "rw");
            //conf.seek(0);
           // conf.writeBytes("   ");
            conf.writeBytes(questionID + "                ");
            conf.close();


        }
        catch (Exception exception)
        {
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


            ps = conn.prepareStatement("UPDATE QuizSettings SET attr = '"+point.getSelectedItem().toString()+"' WHERE id = '"+2+"'");
            ps.executeUpdate();

            ps = conn.prepareStatement("UPDATE QuizSettings SET attr = '"+combo.getSelectedItem().toString()+"' WHERE id = '"+3+"'");
            ps.executeUpdate();

            ps = conn.prepareStatement("UPDATE QuizSettings SET attr = '"+time.getSelectedItem().toString()+"' WHERE id = '"+4+"'");
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




    }




    public void paintComponent(Graphics g){

        super.paintComponent(g);




        //	g.setFont(new Font("Calibri (Body)", 1, 11));

        g.drawImage(imaget, 0, 0,1000,570,this);



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















    public  class SaveDB
    {





        public SaveDB() {


            dlog2.setTitle("Select Quiz Database");


            selected.setBounds(20, 10, 240, 30);
            selected.setEditable(false);
            dlog2.add(selected);


            scroll2.setBounds(20, 50, 240, 150);
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

            addButton.setBounds(100, 220, 100, 30);
            addButton.setFont(new Font("Calibri", 1, 17));
            addButton.setHorizontalAlignment(SwingConstants.CENTER);
            addButton.setBackground(new Color(0, 168, 89));
            addButton.setForeground(Color.white);
            dlog2.add(addButton);

            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {


                    //SaveToDatabase.goaction();
                    quiznametext.setText(selected.getText());
                    dlog2.hide();


                }
            });


            dlog2.setLayout(null);
            dlog2.setSize(300, 300);
            dlog2.setVisible(true);
            dlog2.setLocationRelativeTo(Home.f);
            dlog2.setAlwaysOnTop(true);


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

