import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class Move{




    int x1 = 0;
    int y1 = 0;
    int fx = 0;
    int fy = 0;



    public void move(final JFrame frame, JLabel l){




        l.addMouseMotionListener(


                new MouseMotionAdapter(){



                    public void mouseDragged(MouseEvent evt){


                        fx = evt.getXOnScreen() - x1;

                        fy = evt.getYOnScreen() - y1;


                        frame.setLocation(fx - 10,fy -10);

                        int dx = fx + 660;
                        int dy = fy + 100;



                        FadingToast.wind.setLocation(dx, dy);

                        int dx2 = fx;
                        int dy2 = fy + 75;


                        HolderPage.blocker.setLocation(dx2,dy2);



                    }

                });



        l.addMouseListener(


                new MouseAdapter(){


                    public void mousePressed(MouseEvent t){


                        x1 = t.getX();
                        y1 = t.getY();



                    }


                });





    }








    public void move(final Component frame, JLabel l){




        l.addMouseMotionListener(


                new MouseMotionAdapter(){



                    public void mouseDragged(MouseEvent evt){


                        fx = evt.getXOnScreen() - x1;

                        fy = evt.getYOnScreen() - y1;


                        frame.setLocation(fx,fy);



                    }

                });



        l.addMouseListener(


                new MouseAdapter(){


                    public void mousePressed(MouseEvent t){


                        x1 = t.getX();
                        y1 = t.getY();



                    }


                });





    }







}



