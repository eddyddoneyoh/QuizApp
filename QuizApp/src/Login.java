/**
 * Created by EdidiongEyo on 11/5/2016.
 */
import MaterialDesign.MaterialPasswordField;
import MaterialDesign.MaterialWindow;
import MaterialDesign.Roboto;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;


public class Login extends JPanel {


    MaterialWindow f = new MaterialWindow();


    int x;
    int y;

    int heightdiv;
    int widthdiv;

    static JTextField uname = new JTextField();
    MaterialPasswordField passfield = new MaterialPasswordField();
    JButton login = new JButton("Login");
    JButton home =  new JButton("Cancel");
    JLabel show = new JLabel();
    JLabel forgot = new JLabel("forgot password");

    JLabel tobBar =  new JLabel();

    public Login() {



        new Move().move(f,tobBar);

        f.requestFocus();

        HolderPage.f.setFocusable(false);
        HolderPage.f.setFocusableWindowState(false);



        setBackground(Color.white);
        setLayout(null);







        passfield.setBounds(45, 185, 200, 35);
       // passfield.setFont(new Font("Calibri", 1, 22));
        passfield.addCaretListener(new CaretListener() {
            @SuppressWarnings("deprecation")
            @Override
            public void caretUpdate(CaretEvent e) {
                if(passfield.getText().length() > 0){

                    show.setVisible(true);
                }
                else{

                    show.setVisible(false);
                }
            }
        });
        add(passfield);

        show.setBounds(249, 185, 50, 30);
        //show.setFont(new Font("Calibri", 2 + Font.BOLD, 17));
        show.setIcon(new ImageIcon("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\img\\eye2.png"));
        show.setForeground(new Color(0, 168, 89));
        show.setVisible(false);
        add(show);

        show.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mouseClicked(e);
                passfield.setFont(Roboto.MEDIUM.deriveFont(17f));
                passfield.setEchoChar((char) 0);
            }


            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                passfield.setFont(Roboto.MEDIUM.deriveFont(22f));
                passfield.setEchoChar('*');
            }
        });



        forgot.setBounds(150, 220, 150,20 );
        forgot.setFont(new Font("Calibri", 2, 14));
        forgot.setForeground(new Color(0, 168, 89));
        add(forgot);


        login.setBounds(45, 245, 200, 32);
        login.setFont(new Font("Calibri", 1, 17));
        login.setHorizontalAlignment(SwingConstants.CENTER);
        login.setBackground(new Color(0, 168, 89));
        login.setForeground(Color.white);
        add(login);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                login1();


            }

        });





        home.setBounds(45, 280, 200, 32);
        home.setFont(new Font("Calibri", 1, 17));
        home.setHorizontalAlignment(SwingConstants.CENTER);
        home.setBackground(new Color(32, 173, 248));
        home.setForeground(Color.white);
        add(home);


        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                HolderPage.blocker.dispose();

                HolderPage.f.setEnabled(true);
                HolderPage.f.setFocusable(true);
                HolderPage.f.setFocusableWindowState(true);
                HolderPage.f.requestFocus();



                f.dispose();
                uname.setText("");
                passfield.setText("");
          }

        });



        tobBar.setBounds(0,0,350,40);
        tobBar.setText("                        Admin Login");
        add(tobBar);
        tobBar.setOpaque(true);
        tobBar.setHorizontalAlignment(SwingConstants.LEFT);
        tobBar.setBackground(new Color(0, 168, 89));
        tobBar.setForeground(Color.white);
        tobBar.setFont(new Font("Calibri",1, 16));






        f.setSize(320, 380);


        int locationX = HolderPage.f.getX()  + 380;
        int locationY =  HolderPage.f.getY()  +  100;


        f.setLocation(locationX, locationY);




        f.add(this);
        //f.setAlwaysOnTop(true);
        HolderPage.f.setEnabled(false);

        // f.setUndecorated(true);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        f.setResizable(false);

    }












    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(new Color(240, 180, 30));
        g.setFont(new Font("Calibri", 1, 18));

        g.drawString("Password", 103, 170);


        g.setColor(Color.white);


    }



    @SuppressWarnings("deprecation")
    public void login1(){


                try {


                   //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                   //Connection conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");



                  Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                  Connection conn = DriverManager.getConnection("jdbc:ucanaccess://DB/db.mdb");




                    Statement st = conn.createStatement();
                    ResultSet rec = st.executeQuery("SELECT password FROM Login");
                    boolean isExist = false;

                    while (rec.next()) {

                        String y = passfield.getText();


                                 if ((y.equals(rec.getString("password")))) {


                                isExist = true;


                                     HolderPage.blocker.dispose();

                                    HolderPage.f.setFocusable(true);
                                    HolderPage.f.setFocusableWindowState(true);
                                    HolderPage.f.requestFocus();


                                HolderPage.f.setEnabled(true);

                                HolderPage.content.removeAll();

                                HolderPage.content.add(new Admin());


                                HolderPage.content.updateUI();


                                passfield.setText("");

                                f.dispose();


                            }

                        }



                    if (!isExist) {

                        JOptionPane.showMessageDialog(null, "Your credentials are wrong", "WRONG CREDENTIALS", JOptionPane.PLAIN_MESSAGE);
                        HolderPage.f.setFocusable(true);
                        HolderPage.f.setFocusableWindowState(true);
                        HolderPage.f.requestFocus();

                    }


                    st.close();
                    conn.close();
                } catch (SQLException d) {
                    d.printStackTrace();
                } catch (ClassNotFoundException f) {
                    f.printStackTrace();
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




        new Login();

    }

}
