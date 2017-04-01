import java.awt.*;
import java.sql.*;

public class RetrieveDB {



    public static void retrieveDB(){



        SetPanelsInvisible.setPanels(
                Admin.participant1, Admin.participant2, Admin.participant3,Admin.participant4, Admin.participant5, Admin.participant6, Admin.participant7, Admin.participant8, Admin.participant9, Admin.participant10,
                Admin.participant11, Admin.participant12, Admin.participant13, Admin.participant14,Admin.participant15, Admin.participant16, Admin.participant17, Admin.participant18, Admin.participant19, Admin.participant20,
                Admin.participant21, Admin.participant22, Admin.participant23, Admin.participant24, Admin.participant25, Admin.participant26, Admin.participant27, Admin.participant28, Admin.participant29, Admin.participant30,
                Admin.participant31, Admin.participant32, Admin.participant33, Admin.participant34, Admin.participant35, Admin.participant36, Admin.participant37, Admin.participant38, Admin.participant39, Admin.participant40,
                Admin.participant41, Admin.participant42, Admin.participant43, Admin.participant44, Admin.participant45, Admin.participant46, Admin.participant47, Admin.participant48, Admin.participant49, Admin.participant50,
                Admin.participant51, Admin.participant52, Admin.participant53, Admin.participant54, Admin.participant55, Admin.participant56, Admin.participant57, Admin.participant58, Admin.participant59, Admin.participant60,
                Admin.participant61, Admin.participant62, Admin.participant63, Admin.participant64, Admin.participant65, Admin.participant66, Admin.participant67, Admin.participant68, Admin.participant69, Admin.participant70,
                Admin.participant71, Admin.participant72, Admin.participant73, Admin.participant74, Admin.participant75, Admin.participant76, Admin.participant77, Admin.participant78, Admin.participant79, Admin.participant80,
                Admin.participant81, Admin.participant82, Admin.participant83, Admin.participant84, Admin.participant85, Admin.participant86, Admin.participant87, Admin.participant88, Admin.participant89, Admin.participant90,
                Admin.participant91, Admin.participant92, Admin.participant93, Admin.participant94, Admin.participant75, Admin.participant96, Admin.participant97, Admin.participant98, Admin.participant99, Admin.participant100,
                Admin.panel);


        Admin.go.setEnabled(false);  Admin.down.setVisible(false);



        String comboname =  Admin.combo.getSelectedItem().toString();
        String query =  "SELECT ID, Question, Option1, Option2 , Option3 , Option4 , Answer  FROM " + comboname;
        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/Questions.mdb;");
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rec = st.executeQuery(query);


            if(rec.absolute(1)){

                Admin.part1name.setText(rec.getString("Question"));  Admin.part1name2.setText(rec.getString("Option1")); Admin.part1name3.setText(rec.getString("Option2"));
                Admin.part1name4.setText(rec.getString("Option3"));  Admin.part1name5.setText(rec.getString("Option4")); Admin.part1name6.setText(rec.getString("Answer"));

                Admin.participant1.setVisible(true); Admin.go.setEnabled(true); Admin.count = 1;

                Admin.down.setVisible(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,380));

                Admin.up.setEnabled(true);
            }

            if(rec.absolute(2)){

                Admin.part2name.setText(rec.getString("Question"));  Admin.part2name2.setText(rec.getString("Option1")); Admin.part2name3.setText(rec.getString("Option2"));
                Admin.part2name4.setText(rec.getString("Option3"));  Admin.part2name5.setText(rec.getString("Option4")); Admin.part2name6.setText(rec.getString("Answer"));

                Admin.participant2.setVisible(true); Admin.go.setEnabled(true); Admin.count = 2;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,380));


            }

            if(rec.absolute(3)){

                Admin.part3name.setText(rec.getString("Question")); Admin.part3name2.setText(rec.getString("Option1")); Admin.part3name3.setText(rec.getString("Option2"));
                Admin.part3name4.setText(rec.getString("Option3"));  Admin.part3name5.setText(rec.getString("Option4")); Admin.part3name6.setText(rec.getString("Answer"));

                Admin.participant3.setVisible(true); Admin.go.setEnabled(true); Admin.count = 3;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));

            }

            if(rec.absolute(4)){

                Admin.part4name.setText(rec.getString("Question")); Admin.part4name2.setText(rec.getString("Option1")); Admin.part4name3.setText(rec.getString("Option2"));
                Admin.part4name4.setText(rec.getString("Option3"));  Admin.part4name5.setText(rec.getString("Option4")); Admin.part4name6.setText(rec.getString("Answer"));

                Admin.participant4.setVisible(true); Admin.go.setEnabled(true); Admin.count = 4;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(5)){

                Admin.part5name.setText(rec.getString("Question")); Admin.part5name2.setText(rec.getString("Option1")); Admin.part5name3.setText(rec.getString("Option2"));
                Admin.part5name4.setText(rec.getString("Option3"));  Admin.part5name5.setText(rec.getString("Option4")); Admin.part5name6.setText(rec.getString("Answer"));

                Admin.participant5.setVisible(true); Admin.go.setEnabled(true); Admin.count = 5;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(6)){

                Admin.part6name.setText(rec.getString("Question")); Admin.part6name2.setText(rec.getString("Option1")); Admin.part6name3.setText(rec.getString("Option2"));
                Admin.part6name4.setText(rec.getString("Option3"));  Admin.part6name5.setText(rec.getString("Option4")); Admin.part6name6.setText(rec.getString("Answer"));

                Admin.participant6.setVisible(true); Admin.go.setEnabled(true); Admin.count = 6;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(7)){

                Admin.part7name.setText(rec.getString("Question")); Admin.part7name2.setText(rec.getString("Option1")); Admin.part7name3.setText(rec.getString("Option2"));
                Admin.part7name4.setText(rec.getString("Option3"));  Admin.part7name5.setText(rec.getString("Option4")); Admin.part7name6.setText(rec.getString("Answer"));

                Admin.participant7.setVisible(true); Admin.go.setEnabled(true); Admin.count = 7;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(8)){

                Admin.part8name.setText(rec.getString("Question")); Admin.part8name2.setText(rec.getString("Option1")); Admin.part8name3.setText(rec.getString("Option2"));
                Admin.part8name4.setText(rec.getString("Option3"));  Admin.part8name5.setText(rec.getString("Option4")); Admin.part8name6.setText(rec.getString("Answer"));

                Admin.participant8.setVisible(true); Admin.go.setEnabled(true); Admin.count = 8;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }

            if(rec.absolute(9)){

                Admin.part9name.setText(rec.getString("Question")); Admin.part9name2.setText(rec.getString("Option1")); Admin.part9name3.setText(rec.getString("Option2"));
                Admin.part9name4.setText(rec.getString("Option3"));  Admin.part9name5.setText(rec.getString("Option4")); Admin.part9name6.setText(rec.getString("Answer"));

                Admin.participant9.setVisible(true); Admin.go.setEnabled(true); Admin.count = 9;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }

            if(rec.absolute(10)){

                Admin.part10name.setText(rec.getString("Question")); Admin.part10name2.setText(rec.getString("Option1")); Admin.part10name3.setText(rec.getString("Option2"));
                Admin.part10name4.setText(rec.getString("Option3"));  Admin.part10name5.setText(rec.getString("Option4")); Admin.part10name6.setText(rec.getString("Answer"));

                Admin.participant10.setVisible(true); Admin.go.setEnabled(true); Admin.count = 10;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }

            if(rec.absolute(11)){

                Admin.part11name.setText(rec.getString("Question")); Admin.part11name2.setText(rec.getString("Option1")); Admin.part11name3.setText(rec.getString("Option2"));
                Admin.part11name4.setText(rec.getString("Option3"));  Admin.part11name5.setText(rec.getString("Option4")); Admin.part11name6.setText(rec.getString("Answer"));

                Admin.participant11.setVisible(true); Admin.go.setEnabled(true); Admin.count = 11;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(12)){

                Admin.part12name.setText(rec.getString("Question")); Admin.part12name2.setText(rec.getString("Option1")); Admin.part12name3.setText(rec.getString("Option2"));
                Admin.part12name4.setText(rec.getString("Option3"));  Admin.part12name5.setText(rec.getString("Option4")); Admin.part12name6.setText(rec.getString("Answer"));

                Admin.participant12.setVisible(true); Admin.go.setEnabled(true); Admin.count = 12;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(13)){

                Admin.part13name.setText(rec.getString("Question")); Admin.part13name2.setText(rec.getString("Option1")); Admin.part13name3.setText(rec.getString("Option2"));
                Admin.part13name4.setText(rec.getString("Option3"));  Admin.part13name5.setText(rec.getString("Option4")); Admin.part13name6.setText(rec.getString("Answer"));

                Admin.participant13.setVisible(true); Admin.go.setEnabled(true); Admin.count = 13;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(14)){

                Admin.part14name.setText(rec.getString("Question")); Admin.part14name2.setText(rec.getString("Option1")); Admin.part14name3.setText(rec.getString("Option2"));
                Admin.part14name4.setText(rec.getString("Option3"));  Admin.part14name5.setText(rec.getString("Option4")); Admin.part14name6.setText(rec.getString("Answer"));

                Admin.participant14.setVisible(true); Admin.go.setEnabled(true); Admin.count = 14;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(15)){

                Admin.part15name.setText(rec.getString("Question")); Admin.part15name2.setText(rec.getString("Option1")); Admin.part15name3.setText(rec.getString("Option2"));
                Admin.part15name4.setText(rec.getString("Option3"));  Admin.part15name5.setText(rec.getString("Option4")); Admin.part15name6.setText(rec.getString("Answer"));

                Admin.participant15.setVisible(true); Admin.go.setEnabled(true); Admin.count = 15;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }

            if(rec.absolute(16)){

                Admin.part16name.setText(rec.getString("Question")); Admin.part16name2.setText(rec.getString("Option1")); Admin.part16name3.setText(rec.getString("Option2"));
                Admin.part16name4.setText(rec.getString("Option3"));  Admin.part16name5.setText(rec.getString("Option4")); Admin.part16name6.setText(rec.getString("Answer"));

                Admin.participant16.setVisible(true); Admin.go.setEnabled(true); Admin.count = 16;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }

            if(rec.absolute(17)){

                Admin.part17name.setText(rec.getString("Question")); Admin.part17name2.setText(rec.getString("Option1")); Admin.part17name3.setText(rec.getString("Option2"));
                Admin.part17name4.setText(rec.getString("Option3"));  Admin.part17name5.setText(rec.getString("Option4")); Admin.part17name6.setText(rec.getString("Answer"));

                Admin.participant17.setVisible(true); Admin.go.setEnabled(true); Admin.count = 17;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }

            if(rec.absolute(18)){

                Admin.part18name.setText(rec.getString("Question")); Admin.part18name2.setText(rec.getString("Option1")); Admin.part18name3.setText(rec.getString("Option2"));
                Admin.part18name4.setText(rec.getString("Option3"));  Admin.part18name5.setText(rec.getString("Option4")); Admin.part18name6.setText(rec.getString("Answer"));

                Admin.participant18.setVisible(true); Admin.go.setEnabled(true); Admin.count = 18;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }

            if(rec.absolute(19)){

                Admin.part19name.setText(rec.getString("Question")); Admin.part19name2.setText(rec.getString("Option1")); Admin.part19name3.setText(rec.getString("Option2"));
                Admin.part19name4.setText(rec.getString("Option3"));  Admin.part19name5.setText(rec.getString("Option4")); Admin.part19name6.setText(rec.getString("Answer"));

                Admin.participant19.setVisible(true); Admin.go.setEnabled(true); Admin.count = 19;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(20)){

                Admin.part20name.setText(rec.getString("Question")); Admin.part20name2.setText(rec.getString("Option1")); Admin.part20name3.setText(rec.getString("Option2"));
                Admin.part20name4.setText(rec.getString("Option3"));  Admin.part20name5.setText(rec.getString("Option4")); Admin.part20name6.setText(rec.getString("Answer"));

                Admin.participant20.setVisible(true); Admin.go.setEnabled(true); Admin.count = 20;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(21)){

                Admin.part21name.setText(rec.getString("Question")); Admin.part21name2.setText(rec.getString("Option1")); Admin.part21name3.setText(rec.getString("Option2"));
                Admin.part21name4.setText(rec.getString("Option3"));  Admin.part21name5.setText(rec.getString("Option4")); Admin.part21name6.setText(rec.getString("Answer"));

                Admin.participant21.setVisible(true); Admin.go.setEnabled(true); Admin.count = 21;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(22)){

                Admin.part22name.setText(rec.getString("Question")); Admin.part22name2.setText(rec.getString("Option1")); Admin.part22name3.setText(rec.getString("Option2"));
                Admin.part22name4.setText(rec.getString("Option3"));  Admin.part22name5.setText(rec.getString("Option4")); Admin.part22name6.setText(rec.getString("Answer"));

                Admin.participant22.setVisible(true); Admin.go.setEnabled(true); Admin.count = 22;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(23)){

                Admin.part23name.setText(rec.getString("Question")); Admin.part23name2.setText(rec.getString("Option1")); Admin.part23name3.setText(rec.getString("Option2"));
                Admin.part23name4.setText(rec.getString("Option3"));  Admin.part23name5.setText(rec.getString("Option4")); Admin.part23name6.setText(rec.getString("Answer"));

                Admin.participant23.setVisible(true); Admin.go.setEnabled(true); Admin.count = 23;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(24)){

                Admin.part24name.setText(rec.getString("Question")); Admin.part24name2.setText(rec.getString("Option1")); Admin.part24name3.setText(rec.getString("Option2"));
                Admin.part24name4.setText(rec.getString("Option3"));  Admin.part24name5.setText(rec.getString("Option4")); Admin.part24name6.setText(rec.getString("Answer"));

                Admin.participant24.setVisible(true); Admin.go.setEnabled(true); Admin.count = 24;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(25)){

                Admin.part25name.setText(rec.getString("Question")); Admin.part25name2.setText(rec.getString("Option1")); Admin.part25name3.setText(rec.getString("Option2"));
                Admin.part25name4.setText(rec.getString("Option3"));  Admin.part25name5.setText(rec.getString("Option4")); Admin.part25name6.setText(rec.getString("Answer"));

                Admin.participant25.setVisible(true); Admin.go.setEnabled(true); Admin.count = 25;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(26)){

                Admin.part26name.setText(rec.getString("Question")); Admin.part26name2.setText(rec.getString("Option1")); Admin.part26name3.setText(rec.getString("Option2"));
                Admin.part26name4.setText(rec.getString("Option3"));  Admin.part26name5.setText(rec.getString("Option4")); Admin.part26name6.setText(rec.getString("Answer"));

                Admin.participant26.setVisible(true); Admin.go.setEnabled(true); Admin.count = 26;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(27)){

                Admin.part27name.setText(rec.getString("Question")); Admin.part27name2.setText(rec.getString("Option1")); Admin.part27name3.setText(rec.getString("Option2"));
                Admin.part27name4.setText(rec.getString("Option3"));  Admin.part27name5.setText(rec.getString("Option4")); Admin.part27name6.setText(rec.getString("Answer"));

                Admin.participant27.setVisible(true); Admin.go.setEnabled(true); Admin.count = 27;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(28)){

                Admin.part28name.setText(rec.getString("Question")); Admin.part28name2.setText(rec.getString("Option1")); Admin.part28name3.setText(rec.getString("Option2"));
                Admin.part28name4.setText(rec.getString("Option3"));  Admin.part28name5.setText(rec.getString("Option4")); Admin.part28name6.setText(rec.getString("Answer"));

                Admin.participant28.setVisible(true); Admin.go.setEnabled(true); Admin.count = 28;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(29)){

                Admin.part29name.setText(rec.getString("Question")); Admin.part29name2.setText(rec.getString("Option1")); Admin.part29name3.setText(rec.getString("Option2"));
                Admin.part29name4.setText(rec.getString("Option3"));  Admin.part29name5.setText(rec.getString("Option4")); Admin.part29name6.setText(rec.getString("Answer"));

                Admin.participant29.setVisible(true); Admin.go.setEnabled(true); Admin.count = 29;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(30)){

                Admin.part30name.setText(rec.getString("Question")); Admin.part30name2.setText(rec.getString("Option1")); Admin.part30name3.setText(rec.getString("Option2"));
                Admin.part30name4.setText(rec.getString("Option3"));  Admin.part30name5.setText(rec.getString("Option4")); Admin.part30name6.setText(rec.getString("Answer"));

                Admin.participant30.setVisible(true); Admin.go.setEnabled(true); Admin.count = 30;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(31)){

                Admin.part31name.setText(rec.getString("Question")); Admin.part31name2.setText(rec.getString("Option1")); Admin.part31name3.setText(rec.getString("Option2"));
                Admin.part31name4.setText(rec.getString("Option3"));  Admin.part31name5.setText(rec.getString("Option4")); Admin.part31name6.setText(rec.getString("Answer"));

                Admin.participant31.setVisible(true); Admin.go.setEnabled(true); Admin.count = 31;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(32)){

                Admin.part32name.setText(rec.getString("Question")); Admin.part32name2.setText(rec.getString("Option1")); Admin.part32name3.setText(rec.getString("Option2"));
                Admin.part32name4.setText(rec.getString("Option3"));  Admin.part32name5.setText(rec.getString("Option4")); Admin.part32name6.setText(rec.getString("Answer"));

                Admin.participant32.setVisible(true); Admin.go.setEnabled(true); Admin.count = 32;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(33)){

                Admin.part33name.setText(rec.getString("Question")); Admin.part33name2.setText(rec.getString("Option1")); Admin.part33name3.setText(rec.getString("Option2"));
                Admin.part33name4.setText(rec.getString("Option3"));  Admin.part33name5.setText(rec.getString("Option4")); Admin.part33name6.setText(rec.getString("Answer"));

                Admin.participant33.setVisible(true); Admin.go.setEnabled(true); Admin.count = 33;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(34)){

                Admin.part34name.setText(rec.getString("Question")); Admin.part34name2.setText(rec.getString("Option1")); Admin.part34name3.setText(rec.getString("Option2"));
                Admin.part34name4.setText(rec.getString("Option3"));  Admin.part34name5.setText(rec.getString("Option4")); Admin.part34name6.setText(rec.getString("Answer"));

                Admin.participant34.setVisible(true); Admin.go.setEnabled(true); Admin.count = 34;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(35)){

                Admin.part35name.setText(rec.getString("Question")); Admin.part35name2.setText(rec.getString("Option1")); Admin.part35name3.setText(rec.getString("Option2"));
                Admin.part35name4.setText(rec.getString("Option3"));  Admin.part35name5.setText(rec.getString("Option4")); Admin.part35name6.setText(rec.getString("Answer"));

                Admin.participant35.setVisible(true); Admin.go.setEnabled(true); Admin.count = 35;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(36)){

                Admin.part36name.setText(rec.getString("Question")); Admin.part36name2.setText(rec.getString("Option1")); Admin.part36name3.setText(rec.getString("Option2"));
                Admin.part36name4.setText(rec.getString("Option3"));  Admin.part36name5.setText(rec.getString("Option4")); Admin.part36name6.setText(rec.getString("Answer"));

                Admin.participant36.setVisible(true); Admin.go.setEnabled(true); Admin.count = 36;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(37)){

                Admin.part37name.setText(rec.getString("Question")); Admin.part37name2.setText(rec.getString("Option1")); Admin.part37name3.setText(rec.getString("Option2"));
                Admin.part37name4.setText(rec.getString("Option3"));  Admin.part37name5.setText(rec.getString("Option4")); Admin.part37name6.setText(rec.getString("Answer"));

                Admin.participant37.setVisible(true); Admin.go.setEnabled(true); Admin.count = 37;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(38)){

                Admin.part38name.setText(rec.getString("Question")); Admin.part38name2.setText(rec.getString("Option1")); Admin.part38name3.setText(rec.getString("Option2"));
                Admin.part38name4.setText(rec.getString("Option3"));  Admin.part38name5.setText(rec.getString("Option4")); Admin.part38name6.setText(rec.getString("Answer"));

                Admin.participant38.setVisible(true); Admin.go.setEnabled(true); Admin.count = 38;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(39)){

                Admin.part39name.setText(rec.getString("Question")); Admin.part39name2.setText(rec.getString("Option1")); Admin.part39name3.setText(rec.getString("Option2"));
                Admin.part39name4.setText(rec.getString("Option3"));  Admin.part39name5.setText(rec.getString("Option4")); Admin.part39name6.setText(rec.getString("Answer"));

                Admin.participant39.setVisible(true); Admin.go.setEnabled(true); Admin.count = 39;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(40)){

                Admin.part40name.setText(rec.getString("Question")); Admin.part40name2.setText(rec.getString("Option1")); Admin.part40name3.setText(rec.getString("Option2"));
                Admin.part40name4.setText(rec.getString("Option3"));  Admin.part40name5.setText(rec.getString("Option4")); Admin.part40name6.setText(rec.getString("Answer"));

                Admin.participant40.setVisible(true); Admin.go.setEnabled(true); Admin.count = 40;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(41)){

                Admin.part41name.setText(rec.getString("Question")); Admin.part41name2.setText(rec.getString("Option1")); Admin.part41name3.setText(rec.getString("Option2"));
                Admin.part41name4.setText(rec.getString("Option3"));  Admin.part41name5.setText(rec.getString("Option4")); Admin.part41name6.setText(rec.getString("Answer"));

                Admin.participant41.setVisible(true); Admin.go.setEnabled(true); Admin.count = 41;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(42)){

                Admin.part42name.setText(rec.getString("Question")); Admin.part42name2.setText(rec.getString("Option1")); Admin.part42name3.setText(rec.getString("Option2"));
                Admin.part42name4.setText(rec.getString("Option3"));  Admin.part42name5.setText(rec.getString("Option4")); Admin.part42name6.setText(rec.getString("Answer"));

                Admin.participant42.setVisible(true); Admin.go.setEnabled(true); Admin.count = 42;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }if(rec.absolute(43)){

                Admin.part43name.setText(rec.getString("Question")); Admin.part43name2.setText(rec.getString("Option1")); Admin.part43name3.setText(rec.getString("Option2"));
                Admin.part43name4.setText(rec.getString("Option3"));  Admin.part43name5.setText(rec.getString("Option4")); Admin.part43name6.setText(rec.getString("Answer"));

                Admin.participant43.setVisible(true); Admin.go.setEnabled(true); Admin.count = 43;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(44)){

                Admin.part44name.setText(rec.getString("Question")); Admin.part44name2.setText(rec.getString("Option1")); Admin.part44name3.setText(rec.getString("Option2"));
                Admin.part44name4.setText(rec.getString("Option3"));  Admin.part44name5.setText(rec.getString("Option4")); Admin.part44name6.setText(rec.getString("Answer"));

                Admin.participant44.setVisible(true); Admin.go.setEnabled(true); Admin.count = 44;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }if(rec.absolute(45)){

                Admin.part45name.setText(rec.getString("Question")); Admin.part45name2.setText(rec.getString("Option1")); Admin.part45name3.setText(rec.getString("Option2"));
                Admin.part45name4.setText(rec.getString("Option3"));  Admin.part45name5.setText(rec.getString("Option4")); Admin.part45name6.setText(rec.getString("Answer"));

                Admin.participant45.setVisible(true); Admin.go.setEnabled(true); Admin.count = 45;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(46)){

                Admin.part46name.setText(rec.getString("Question")); Admin.part46name2.setText(rec.getString("Option1")); Admin.part46name3.setText(rec.getString("Option2"));
                Admin.part46name4.setText(rec.getString("Option3"));  Admin.part46name5.setText(rec.getString("Option4")); Admin.part46name6.setText(rec.getString("Answer"));

                Admin.participant46.setVisible(true); Admin.go.setEnabled(true); Admin.count = 46;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(47)){

                Admin.part47name.setText(rec.getString("Question")); Admin.part47name2.setText(rec.getString("Option1")); Admin.part47name3.setText(rec.getString("Option2"));
                Admin.part47name4.setText(rec.getString("Option3"));  Admin.part47name5.setText(rec.getString("Option4")); Admin.part47name6.setText(rec.getString("Answer"));

                Admin.participant47.setVisible(true); Admin.go.setEnabled(true); Admin.count = 47;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(48)){

                Admin.part48name.setText(rec.getString("Question")); Admin.part48name2.setText(rec.getString("Option1")); Admin.part48name3.setText(rec.getString("Option2"));
                Admin.part48name4.setText(rec.getString("Option3"));  Admin.part48name5.setText(rec.getString("Option4")); Admin.part48name6.setText(rec.getString("Answer"));

                Admin.participant48.setVisible(true); Admin.go.setEnabled(true); Admin.count = 48;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(49)){

                Admin.part49name.setText(rec.getString("Question")); Admin.part49name2.setText(rec.getString("Option1")); Admin.part49name3.setText(rec.getString("Option2"));
                Admin.part49name4.setText(rec.getString("Option3"));  Admin.part49name5.setText(rec.getString("Option4")); Admin.part49name6.setText(rec.getString("Answer"));

                Admin.participant49.setVisible(true); Admin.go.setEnabled(true); Admin.count = 49;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(50)){

                Admin.part50name.setText(rec.getString("Question")); Admin.part50name2.setText(rec.getString("Option1")); Admin.part50name3.setText(rec.getString("Option2"));
                Admin.part50name4.setText(rec.getString("Option3"));  Admin.part50name5.setText(rec.getString("Option4")); Admin.part50name6.setText(rec.getString("Answer"));

                Admin.participant50.setVisible(true); Admin.go.setEnabled(true); Admin.count = 50;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(51)){

                Admin.part51name.setText(rec.getString("Question")); Admin.part51name2.setText(rec.getString("Option1")); Admin.part51name3.setText(rec.getString("Option2"));
                Admin.part51name4.setText(rec.getString("Option3"));  Admin.part51name5.setText(rec.getString("Option4")); Admin.part51name6.setText(rec.getString("Answer"));

                Admin.participant51.setVisible(true); Admin.go.setEnabled(true); Admin.count = 51;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(52)){

                Admin.part52name.setText(rec.getString("Question")); Admin.part52name2.setText(rec.getString("Option1")); Admin.part52name3.setText(rec.getString("Option2"));
                Admin.part52name4.setText(rec.getString("Option3"));  Admin.part52name5.setText(rec.getString("Option4")); Admin.part52name6.setText(rec.getString("Answer"));

                Admin.participant52.setVisible(true); Admin.go.setEnabled(true); Admin.count = 52;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(53)){

                Admin.part53name.setText(rec.getString("Question")); Admin.part53name2.setText(rec.getString("Option1")); Admin.part53name3.setText(rec.getString("Option2"));
                Admin.part53name4.setText(rec.getString("Option3"));  Admin.part53name5.setText(rec.getString("Option4")); Admin.part53name6.setText(rec.getString("Answer"));

                Admin.participant53.setVisible(true); Admin.go.setEnabled(true); Admin.count = 53;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(54)){

                Admin.part54name.setText(rec.getString("Question")); Admin.part54name2.setText(rec.getString("Option1")); Admin.part54name3.setText(rec.getString("Option2"));
                Admin.part54name4.setText(rec.getString("Option3"));  Admin.part54name5.setText(rec.getString("Option4")); Admin.part54name6.setText(rec.getString("Answer"));

                Admin.participant54.setVisible(true); Admin.go.setEnabled(true); Admin.count = 54;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(55)){

                Admin.part55name.setText(rec.getString("Question")); Admin.part55name2.setText(rec.getString("Option1")); Admin.part55name3.setText(rec.getString("Option2"));
                Admin.part55name4.setText(rec.getString("Option3"));  Admin.part55name5.setText(rec.getString("Option4")); Admin.part55name6.setText(rec.getString("Answer"));

                Admin.participant55.setVisible(true); Admin.go.setEnabled(true); Admin.count = 55;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(56)){

                Admin.part56name.setText(rec.getString("Question")); Admin.part56name2.setText(rec.getString("Option1")); Admin.part56name3.setText(rec.getString("Option2"));
                Admin.part56name4.setText(rec.getString("Option3"));  Admin.part56name5.setText(rec.getString("Option4")); Admin.part56name6.setText(rec.getString("Answer"));

                Admin.participant56.setVisible(true); Admin.go.setEnabled(true); Admin.count = 56;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(57)){

                Admin.part57name.setText(rec.getString("Question")); Admin.part57name2.setText(rec.getString("Option1")); Admin.part57name3.setText(rec.getString("Option2"));
                Admin.part57name4.setText(rec.getString("Option3"));  Admin.part57name5.setText(rec.getString("Option4")); Admin.part57name6.setText(rec.getString("Answer"));

                Admin.participant57.setVisible(true); Admin.go.setEnabled(true); Admin.count = 57;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(58)){

                Admin.part58name.setText(rec.getString("Question")); Admin.part58name2.setText(rec.getString("Option1")); Admin.part58name3.setText(rec.getString("Option2"));
                Admin.part58name4.setText(rec.getString("Option3"));  Admin.part58name5.setText(rec.getString("Option4")); Admin.part58name6.setText(rec.getString("Answer"));

                Admin.participant58.setVisible(true); Admin.go.setEnabled(true); Admin.count = 58;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(59)){

                Admin.part59name.setText(rec.getString("Question")); Admin.part59name2.setText(rec.getString("Option1")); Admin.part59name3.setText(rec.getString("Option2"));
                Admin.part59name4.setText(rec.getString("Option3"));  Admin.part59name5.setText(rec.getString("Option4")); Admin.part59name6.setText(rec.getString("Answer"));

                Admin.participant59.setVisible(true); Admin.go.setEnabled(true); Admin.count = 59;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(60)){

                Admin.part60name.setText(rec.getString("Question")); Admin.part60name2.setText(rec.getString("Option1")); Admin.part60name3.setText(rec.getString("Option2"));
                Admin.part60name4.setText(rec.getString("Option3"));  Admin.part60name5.setText(rec.getString("Option4")); Admin.part60name6.setText(rec.getString("Answer"));

                Admin.participant60.setVisible(true); Admin.go.setEnabled(true); Admin.count = 60;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(61)){

                Admin.part61name.setText(rec.getString("Question")); Admin.part61name2.setText(rec.getString("Option1")); Admin.part61name3.setText(rec.getString("Option2"));
                Admin.part61name4.setText(rec.getString("Option3"));  Admin.part61name5.setText(rec.getString("Option4")); Admin.part61name6.setText(rec.getString("Answer"));

                Admin.participant61.setVisible(true); Admin.go.setEnabled(true); Admin.count = 61;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(62)){

                Admin.part62name.setText(rec.getString("Question")); Admin.part62name2.setText(rec.getString("Option1")); Admin.part62name3.setText(rec.getString("Option2"));
                Admin.part62name4.setText(rec.getString("Option3"));  Admin.part62name5.setText(rec.getString("Option4")); Admin.part62name6.setText(rec.getString("Answer"));

                Admin.participant62.setVisible(true); Admin.go.setEnabled(true); Admin.count = 62;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(63)){

                Admin.part63name.setText(rec.getString("Question")); Admin.part63name2.setText(rec.getString("Option1")); Admin.part63name3.setText(rec.getString("Option2"));
                Admin.part63name4.setText(rec.getString("Option3"));  Admin.part63name5.setText(rec.getString("Option4")); Admin.part63name6.setText(rec.getString("Answer"));

                Admin.participant63.setVisible(true); Admin.go.setEnabled(true); Admin.count = 63;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(64)){

                Admin.part64name.setText(rec.getString("Question")); Admin.part64name2.setText(rec.getString("Option1")); Admin.part64name3.setText(rec.getString("Option2"));
                Admin.part64name4.setText(rec.getString("Option3"));  Admin.part64name5.setText(rec.getString("Option4")); Admin.part64name6.setText(rec.getString("Answer"));

                Admin.participant64.setVisible(true); Admin.go.setEnabled(true); Admin.count = 64;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(65)){

                Admin.part65name.setText(rec.getString("Question")); Admin.part65name2.setText(rec.getString("Option1")); Admin.part65name3.setText(rec.getString("Option2"));
                Admin.part65name4.setText(rec.getString("Option3"));  Admin.part65name5.setText(rec.getString("Option4")); Admin.part65name6.setText(rec.getString("Answer"));

                Admin.participant65.setVisible(true); Admin.go.setEnabled(true); Admin.count = 65;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(66)){

                Admin.part66name.setText(rec.getString("Question")); Admin.part66name2.setText(rec.getString("Option1")); Admin.part66name3.setText(rec.getString("Option2"));
                Admin.part66name4.setText(rec.getString("Option3"));  Admin.part66name5.setText(rec.getString("Option4")); Admin.part66name6.setText(rec.getString("Answer"));

                Admin.participant66.setVisible(true); Admin.go.setEnabled(true); Admin.count = 66;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(67)){

                Admin.part67name.setText(rec.getString("Question")); Admin.part67name2.setText(rec.getString("Option1")); Admin.part67name3.setText(rec.getString("Option2"));
                Admin.part67name4.setText(rec.getString("Option3"));  Admin.part67name5.setText(rec.getString("Option4")); Admin.part67name6.setText(rec.getString("Answer"));

                Admin.participant67.setVisible(true); Admin.go.setEnabled(true); Admin.count = 67;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(68)){

                Admin.part68name.setText(rec.getString("Question")); Admin.part68name2.setText(rec.getString("Option1")); Admin.part68name3.setText(rec.getString("Option2"));
                Admin.part68name4.setText(rec.getString("Option3"));  Admin.part68name5.setText(rec.getString("Option4")); Admin.part68name6.setText(rec.getString("Answer"));

                Admin.participant68.setVisible(true); Admin.go.setEnabled(true); Admin.count = 68;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(69)){

                Admin.part69name.setText(rec.getString("Question")); Admin.part69name2.setText(rec.getString("Option1")); Admin.part69name3.setText(rec.getString("Option2"));
                Admin.part69name4.setText(rec.getString("Option3"));  Admin.part69name5.setText(rec.getString("Option4")); Admin.part69name6.setText(rec.getString("Answer"));

                Admin.participant69.setVisible(true); Admin.go.setEnabled(true); Admin.count = 69;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(70)){

                Admin.part70name.setText(rec.getString("Question")); Admin.part70name2.setText(rec.getString("Option1")); Admin.part70name3.setText(rec.getString("Option2"));
                Admin.part70name4.setText(rec.getString("Option3"));  Admin.part70name5.setText(rec.getString("Option4")); Admin.part70name6.setText(rec.getString("Answer"));

                Admin.participant70.setVisible(true); Admin.go.setEnabled(true); Admin.count = 70;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(71)){

                Admin.part71name.setText(rec.getString("Question")); Admin.part71name2.setText(rec.getString("Option1")); Admin.part71name3.setText(rec.getString("Option2"));
                Admin.part71name4.setText(rec.getString("Option3"));  Admin.part71name5.setText(rec.getString("Option4")); Admin.part71name6.setText(rec.getString("Answer"));

                Admin.participant71.setVisible(true); Admin.go.setEnabled(true); Admin.count = 71;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(72)){

                Admin.part72name.setText(rec.getString("Question")); Admin.part72name2.setText(rec.getString("Option1")); Admin.part72name3.setText(rec.getString("Option2"));
                Admin.part72name4.setText(rec.getString("Option3"));  Admin.part72name5.setText(rec.getString("Option4")); Admin.part72name6.setText(rec.getString("Answer"));

                Admin.participant72.setVisible(true); Admin.go.setEnabled(true); Admin.count = 72;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(73)){

                Admin.part73name.setText(rec.getString("Question")); Admin.part73name2.setText(rec.getString("Option1")); Admin.part73name3.setText(rec.getString("Option2"));
                Admin.part73name4.setText(rec.getString("Option3"));  Admin.part73name5.setText(rec.getString("Option4")); Admin.part73name6.setText(rec.getString("Answer"));

                Admin.participant73.setVisible(true); Admin.go.setEnabled(true); Admin.count = 73;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(74)){

                Admin.part74name.setText(rec.getString("Question")); Admin.part74name2.setText(rec.getString("Option1")); Admin.part74name3.setText(rec.getString("Option2"));
                Admin.part74name4.setText(rec.getString("Option3"));  Admin.part74name5.setText(rec.getString("Option4")); Admin.part74name6.setText(rec.getString("Answer"));

                Admin.participant74.setVisible(true); Admin.go.setEnabled(true); Admin.count = 74;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(75)){

                Admin.part75name.setText(rec.getString("Question")); Admin.part75name2.setText(rec.getString("Option1")); Admin.part75name3.setText(rec.getString("Option2"));
                Admin.part75name4.setText(rec.getString("Option3"));  Admin.part75name5.setText(rec.getString("Option4")); Admin.part75name6.setText(rec.getString("Answer"));

                Admin.participant75.setVisible(true); Admin.go.setEnabled(true); Admin.count = 75;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(76)){

                Admin.part76name.setText(rec.getString("Question")); Admin.part76name2.setText(rec.getString("Option1")); Admin.part76name3.setText(rec.getString("Option2"));
                Admin.part76name4.setText(rec.getString("Option3"));  Admin.part76name5.setText(rec.getString("Option4")); Admin.part76name6.setText(rec.getString("Answer"));

                Admin.participant76.setVisible(true); Admin.go.setEnabled(true); Admin.count = 76;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(77)){

                Admin.part77name.setText(rec.getString("Question")); Admin.part77name2.setText(rec.getString("Option1")); Admin.part77name3.setText(rec.getString("Option2"));
                Admin.part77name4.setText(rec.getString("Option3"));  Admin.part77name5.setText(rec.getString("Option4")); Admin.part77name6.setText(rec.getString("Answer"));

                Admin.participant77.setVisible(true); Admin.go.setEnabled(true); Admin.count = 77;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(78)){

                Admin.part78name.setText(rec.getString("Question")); Admin.part78name2.setText(rec.getString("Option1")); Admin.part78name3.setText(rec.getString("Option2"));
                Admin.part78name4.setText(rec.getString("Option3"));  Admin.part78name5.setText(rec.getString("Option4")); Admin.part78name6.setText(rec.getString("Answer"));

                Admin.participant78.setVisible(true); Admin.go.setEnabled(true); Admin.count = 78;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(79)){

                Admin.part79name.setText(rec.getString("Question")); Admin.part79name2.setText(rec.getString("Option1")); Admin.part79name3.setText(rec.getString("Option2"));
                Admin.part79name4.setText(rec.getString("Option3"));  Admin.part79name5.setText(rec.getString("Option4")); Admin.part79name6.setText(rec.getString("Answer"));

                Admin.participant79.setVisible(true); Admin.go.setEnabled(true); Admin.count = 79;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(80)){

                Admin.part80name.setText(rec.getString("Question")); Admin.part80name2.setText(rec.getString("Option1")); Admin.part80name3.setText(rec.getString("Option2"));
                Admin.part80name4.setText(rec.getString("Option3"));  Admin.part80name5.setText(rec.getString("Option4")); Admin.part80name6.setText(rec.getString("Answer"));

                Admin.participant80.setVisible(true); Admin.go.setEnabled(true); Admin.count = 80;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(81)){

                Admin.part81name.setText(rec.getString("Question")); Admin.part81name2.setText(rec.getString("Option1")); Admin.part81name3.setText(rec.getString("Option2"));
                Admin.part81name4.setText(rec.getString("Option3"));  Admin.part81name5.setText(rec.getString("Option4")); Admin.part81name6.setText(rec.getString("Answer"));

                Admin.participant81.setVisible(true); Admin.go.setEnabled(true); Admin.count = 81;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(82)){

                Admin.part82name.setText(rec.getString("Question")); Admin.part82name2.setText(rec.getString("Option1")); Admin.part82name3.setText(rec.getString("Option2"));
                Admin.part82name4.setText(rec.getString("Option3"));  Admin.part82name5.setText(rec.getString("Option4")); Admin.part82name6.setText(rec.getString("Answer"));

                Admin.participant82.setVisible(true); Admin.go.setEnabled(true); Admin.count = 82;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }if(rec.absolute(83)){

                Admin.part83name.setText(rec.getString("Question")); Admin.part83name2.setText(rec.getString("Option1")); Admin.part83name3.setText(rec.getString("Option2"));
                Admin.part83name4.setText(rec.getString("Option3"));  Admin.part83name5.setText(rec.getString("Option4")); Admin.part83name6.setText(rec.getString("Answer"));

                Admin.participant83.setVisible(true); Admin.go.setEnabled(true); Admin.count = 83;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(84)){

                Admin.part84name.setText(rec.getString("Question")); Admin.part84name2.setText(rec.getString("Option1")); Admin.part84name3.setText(rec.getString("Option2"));
                Admin.part84name4.setText(rec.getString("Option3"));  Admin.part84name5.setText(rec.getString("Option4")); Admin.part84name6.setText(rec.getString("Answer"));

                Admin.participant84.setVisible(true); Admin.go.setEnabled(true); Admin.count = 84;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }if(rec.absolute(85)){

                Admin.part85name.setText(rec.getString("Question")); Admin.part85name2.setText(rec.getString("Option1")); Admin.part85name3.setText(rec.getString("Option2"));
                Admin.part85name4.setText(rec.getString("Option3"));  Admin.part85name5.setText(rec.getString("Option4")); Admin.part85name6.setText(rec.getString("Answer"));

                Admin.participant85.setVisible(true); Admin.go.setEnabled(true); Admin.count = 85;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }if(rec.absolute(86)){

                Admin.part86name.setText(rec.getString("Question")); Admin.part86name2.setText(rec.getString("Option1")); Admin.part86name3.setText(rec.getString("Option2"));
                Admin.part86name4.setText(rec.getString("Option3"));  Admin.part86name5.setText(rec.getString("Option4")); Admin.part86name6.setText(rec.getString("Answer"));

                Admin.participant86.setVisible(true); Admin.go.setEnabled(true); Admin.count = 86;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(87)){

                Admin.part87name.setText(rec.getString("Question")); Admin.part87name2.setText(rec.getString("Option1")); Admin.part87name3.setText(rec.getString("Option2"));
                Admin.part87name4.setText(rec.getString("Option3"));  Admin.part87name5.setText(rec.getString("Option4")); Admin.part87name6.setText(rec.getString("Answer"));

                Admin.participant87.setVisible(true); Admin.go.setEnabled(true); Admin.count = 87;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(88)){

                Admin.part88name.setText(rec.getString("Question")); Admin.part88name2.setText(rec.getString("Option1")); Admin.part88name3.setText(rec.getString("Option2"));
                Admin.part88name4.setText(rec.getString("Option3"));  Admin.part88name5.setText(rec.getString("Option4")); Admin.part88name6.setText(rec.getString("Answer"));

                Admin.participant88.setVisible(true); Admin.go.setEnabled(true); Admin.count = 88;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(89)){

                Admin.part89name.setText(rec.getString("Question")); Admin.part89name2.setText(rec.getString("Option1")); Admin.part89name3.setText(rec.getString("Option2"));
                Admin.part89name4.setText(rec.getString("Option3"));  Admin.part89name5.setText(rec.getString("Option4")); Admin.part89name6.setText(rec.getString("Answer"));

                Admin.participant89.setVisible(true); Admin.go.setEnabled(true); Admin.count = 89;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(90)){

                Admin.part90name.setText(rec.getString("Question")); Admin.part90name2.setText(rec.getString("Option1")); Admin.part90name3.setText(rec.getString("Option2"));
                Admin.part90name4.setText(rec.getString("Option3"));  Admin.part90name5.setText(rec.getString("Option4")); Admin.part90name6.setText(rec.getString("Answer"));

                Admin.participant90.setVisible(true); Admin.go.setEnabled(true); Admin.count = 90;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(91)){

                Admin.part91name.setText(rec.getString("Question")); Admin.part91name2.setText(rec.getString("Option1")); Admin.part91name3.setText(rec.getString("Option2"));
                Admin.part91name4.setText(rec.getString("Option3"));  Admin.part91name5.setText(rec.getString("Option4")); Admin.part91name6.setText(rec.getString("Answer"));

                Admin.participant91.setVisible(true); Admin.go.setEnabled(true); Admin.count = 91;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(92)){

                Admin.part92name.setText(rec.getString("Question")); Admin.part92name2.setText(rec.getString("Option1")); Admin.part92name3.setText(rec.getString("Option2"));
                Admin.part92name4.setText(rec.getString("Option3"));  Admin.part92name5.setText(rec.getString("Option4")); Admin.part92name6.setText(rec.getString("Answer"));

                Admin.participant92.setVisible(true); Admin.go.setEnabled(true); Admin.count = 92;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(93)){

                Admin.part93name.setText(rec.getString("Question")); Admin.part93name2.setText(rec.getString("Option1")); Admin.part93name3.setText(rec.getString("Option2"));
                Admin.part93name4.setText(rec.getString("Option3"));  Admin.part93name5.setText(rec.getString("Option4")); Admin.part93name6.setText(rec.getString("Answer"));

                Admin.participant93.setVisible(true); Admin.go.setEnabled(true); Admin.count = 93;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }if(rec.absolute(94)){

                Admin.part94name.setText(rec.getString("Question")); Admin.part94name2.setText(rec.getString("Option1")); Admin.part94name3.setText(rec.getString("Option2"));
                Admin.part94name4.setText(rec.getString("Option3"));  Admin.part94name5.setText(rec.getString("Option4")); Admin.part94name6.setText(rec.getString("Answer"));

                Admin.participant94.setVisible(true); Admin.go.setEnabled(true); Admin.count = 94;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }if(rec.absolute(95)){

                Admin.part95name.setText(rec.getString("Question")); Admin.part95name2.setText(rec.getString("Option1")); Admin.part95name3.setText(rec.getString("Option2"));
                Admin.part95name4.setText(rec.getString("Option3"));  Admin.part95name5.setText(rec.getString("Option4")); Admin.part95name6.setText(rec.getString("Answer"));

                Admin.participant95.setVisible(true); Admin.go.setEnabled(true); Admin.count = 95;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }if(rec.absolute(96)){

                Admin.part96name.setText(rec.getString("Question")); Admin.part96name2.setText(rec.getString("Option1")); Admin.part96name3.setText(rec.getString("Option2"));
                Admin.part96name4.setText(rec.getString("Option3"));  Admin.part96name5.setText(rec.getString("Option4")); Admin.part96name6.setText(rec.getString("Answer"));

                Admin.participant96.setVisible(true); Admin.go.setEnabled(true); Admin.count = 96;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(97)){

                Admin.part97name.setText(rec.getString("Question")); Admin.part97name2.setText(rec.getString("Option1")); Admin.part97name3.setText(rec.getString("Option2"));
                Admin.part97name4.setText(rec.getString("Option3"));  Admin.part97name5.setText(rec.getString("Option4")); Admin.part97name6.setText(rec.getString("Answer"));

                Admin.participant97.setVisible(true); Admin.go.setEnabled(true); Admin.count = 97;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }
            if(rec.absolute(98)){

                Admin.part98name.setText(rec.getString("Question")); Admin.part98name2.setText(rec.getString("Option1")); Admin.part98name3.setText(rec.getString("Option2"));
                Admin.part98name4.setText(rec.getString("Option3"));  Admin.part98name5.setText(rec.getString("Option4")); Admin.part98name6.setText(rec.getString("Answer"));

                Admin.participant98.setVisible(true); Admin.go.setEnabled(true); Admin.count = 98;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));
            }if(rec.absolute(99)){

                Admin.part99name.setText(rec.getString("Question")); Admin.part99name2.setText(rec.getString("Option1")); Admin.part99name3.setText(rec.getString("Option2"));
                Admin.part99name4.setText(rec.getString("Option3"));  Admin.part99name5.setText(rec.getString("Option4")); Admin.part99name6.setText(rec.getString("Answer"));

                Admin.participant99.setVisible(true); Admin.go.setEnabled(true); Admin.count = 99;

                Admin.down.setEnabled(true); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));

                Admin.up.setEnabled(true);
            }
            if(rec.absolute(100)){

                Admin.part100name.setText(rec.getString("Question")); Admin.part100name2.setText(rec.getString("Option1")); Admin.part100name3.setText(rec.getString("Option2"));
                Admin.part100name4.setText(rec.getString("Option3"));  Admin.part100name5.setText(rec.getString("Option4")); Admin.part100name6.setText(rec.getString("Answer"));

                Admin.participant100.setVisible(true); Admin.go.setEnabled(true); Admin.count = 100;

                Admin.down.setEnabled(false); Admin.contestantStatusProg(); Admin.panel.setPreferredSize(new Dimension(400,Admin.count * 211));

                Admin.up.setEnabled(false);

            }






            st.close();
            conn.close();


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


}
