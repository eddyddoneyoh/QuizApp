/**
 * Created by EdidiongEyo on 11/5/2016.
 */
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JPanel {


    JFrame f = new JFrame();


    int x;
    int y;

    int heightdiv;
    int widthdiv;

    static JTextField uname = new JTextField();
    JPasswordField passfield = new JPasswordField();
    JButton login = new JButton("Login");
    JButton home =  new JButton("Cancel");
    JLabel show = new JLabel();
    JLabel forgot = new JLabel("forgot password");


    public Login() {


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        y = screenSize.height;
        x = screenSize.width;

        heightdiv = y / 2;
        widthdiv = x / 2;

        setBackground(Color.white);
        setLayout(null);


        uname.setBounds(45, 115, 200, 30);
        uname.setFont(new Font("Calibri", 1, 18));
        add(uname);

        passfield.setBounds(45, 185, 200, 30);
        passfield.setFont(new Font("Calibri", 1, 22));
        passfield.addCaretListener(new CaretListener() {
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
        show.setFont(new Font("Calibri", 2 + Font.BOLD, 17));
        show.setIcon(new ImageIcon("C:\\Users\\EdidiongEyo\\IdeaProjects\\QuizApp\\img\\eye2.png"));
        show.setForeground(new Color(0, 168, 89));
        show.setVisible(false);
        add(show);

        show.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mouseClicked(e);
                passfield.setFont(new Font("Calibri", 1, 17));
                passfield.setEchoChar((char) 0);
            }


            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                passfield.setFont(new Font("Calibri", 1, 22));
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

                HolderPage.f.setEnabled(true);
                HolderPage.f.setAutoRequestFocus(true);
                f.dispose();
                uname.setText("");
                passfield.setText("");




            }

        });


        //f.getRootPane().setDefaultButton(login);

        f.add(this);
        //f.setAlwaysOnTop(true);
        HolderPage.f.setEnabled(false);


        f.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

                f.dispose();
                HolderPage.f.setEnabled(true);
                //HolderPage.f.setAutoRequestFocus(true);

            }

            @Override
            public void windowClosed(WindowEvent e) {


               // f.dispose();
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });

        f.setSize(300, 370);
        f.setLocation(widthdiv - 200, heightdiv - 200);
        // f.setUndecorated(true);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        f.setResizable(false);

    }












    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.setColor(new Color(0, 168, 89));
        g.fillRect(0, 0, 350, 40);
        g.setColor(new Color(240, 200, 30));


        g.setColor(new Color(240, 180, 30));
        g.setFont(new Font("Calibri", 1, 18));


        g.drawString("Username", 100, 100);
        g.drawString("Password", 103, 170);


        g.setColor(Color.white);

        g.drawString("Enter your login details", 50, 25);
    }



    @SuppressWarnings("deprecation")
    public void login1(){


                try {


                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                    Connection conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/db.mdb;");

                    Statement st = conn.createStatement();
                    ResultSet rec = st.executeQuery("SELECT username, password FROM Login");
                    boolean isExist = false;

                    while (rec.next()) {
                        String x = uname.getText();
                        String y = passfield.getText();



                            if ((x.equals(rec.getString("username"))) && (y.equals(rec.getString("password")))) {


                                isExist = true;


                                HolderPage.f.setEnabled(true);

                                HolderPage.content.removeAll();

                                HolderPage.content.add(new Admin());


                                HolderPage.content.updateUI();

                                HolderPage.f.setTitle("QuizApp 2016 - Admin Control");


                                uname.setText("");
                                passfield.setText("");

                                f.dispose();


                            }

                        }



                    if (!isExist) {

                        JOptionPane.showMessageDialog(null, "Your credentials are wrong", "WRONG CREDENTIALS", JOptionPane.PLAIN_MESSAGE);

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
