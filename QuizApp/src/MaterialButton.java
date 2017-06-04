

//import Material.de.craften.ui.swingmaterial.ElevationEffect;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

/**
 * A Material Design button.
 *
 * @see <a href="https://www.google.com/design/spec/components/buttons.html">Buttons (Google design guidelines)</a>
 */
public class MaterialButton extends JButton {
    private RippleEffect ripple;
    private ElevationEffect elevation;
    private Type type = Type.DEFAULT;
    private boolean isMousePressed = false;
    private boolean isMouseOver = false;
    private Color rippleColor = Color.WHITE;
    private Cursor cursor = super.getCursor();

    /**
     * Creates a new button.
     */




    public MaterialButton() {
        ripple = RippleEffect.applyTo(this);
        elevation = ElevationEffect.applyTo(this, 0);
        setOpaque(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                isMousePressed = true;
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                isMousePressed = false;
                repaint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                isMouseOver = true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                isMouseOver = false;
                repaint();
            }
        });

        //setFont(Roboto.MEDIUM.deriveFont(14f));

        //setFont(new Font("Calibri", 1, 14));
        setUI(new BasicButtonUI() {
            @Override
            public boolean contains(JComponent c, int x, int y) {
                return x > MaterialShadow.OFFSET_LEFT && y > MaterialShadow.OFFSET_TOP
                        && x < getWidth() - MaterialShadow.OFFSET_RIGHT && y < getHeight() - MaterialShadow.OFFSET_BOTTOM;
            }
        });
    }

    /**
     * Gets the type of this button.
     *
     * @return the type of this button
     */
    public Type getType() {
        return type;
    }

    /**
     * Sets the type of this button.
     *
     * @param type the type of this button
     */
    public void setType(Type type) {
        this.type = type;
        repaint();
    }

    /**
     * Gets the ripple color.
     *
     * @return the ripple color
     */
    public Color getRippleColor() {
        return rippleColor;
    }

    /**
     * Sets the ripple color. You should only do this for flat buttons.
     *
     * @param rippleColor the ripple color
     */
    public void setRippleColor(Color rippleColor) {
        this.rippleColor = rippleColor;
    }

    @Override
    public void setEnabled(boolean b) {
        super.setEnabled(b);
        elevation.setLevel(getElevation());
        super.setCursor(b ? cursor : Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }

    @Override
    public void setCursor(Cursor cursor) {
        super.setCursor(cursor);
        this.cursor = cursor;
    }





    @Override
    protected void processFocusEvent(FocusEvent focusEvent) {
        super.processFocusEvent(focusEvent);
        elevation.setLevel(getElevation());
    }

    @Override
    protected void processMouseEvent(MouseEvent mouseEvent) {
        super.processMouseEvent(mouseEvent);
        elevation.setLevel(getElevation());
    }

    private int getElevation() {
        if (isMousePressed) {
            return 2;
        } else if (type == Type.RAISED || isFocusOwner() || isMouseOver) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        if (type != Type.FLAT && isEnabled()) {
            elevation.paint(g);
        }
        g2.translate(MaterialShadow.OFFSET_LEFT, MaterialShadow.OFFSET_TOP);

        final int offset_lr = MaterialShadow.OFFSET_LEFT + MaterialShadow.OFFSET_RIGHT;
        final int offset_td = MaterialShadow.OFFSET_TOP + MaterialShadow.OFFSET_BOTTOM;

        if (isEnabled()) {
            g2.setColor(getBackground());
            g2.fill(new RoundRectangle2D.Float(0, 0, getWidth() - offset_lr, getHeight() - offset_td, 3, 3));

            g2.setColor(new Color(rippleColor.getRed() / 255f, rippleColor.getBlue() / 255f, rippleColor.getBlue() / 255f, 0.12f));
            if ((type == Type.FLAT && isMouseOver) || isFocusOwner()) {
                g2.fill(new RoundRectangle2D.Float(0, 0, getWidth() - offset_lr, getHeight() - offset_td, 3, 3));
            }
        } else {
            Color bg = getBackground();
            g2.setColor(new Color(bg.getRed() / 255f, bg.getGreen() / 255f, bg.getBlue() / 255f, 0.6f));
            g2.fill(new RoundRectangle2D.Float(0, 0, getWidth() - offset_lr, getHeight() - offset_td, 3, 3));
        }

        FontMetrics metrics = g.getFontMetrics(getFont());
        int x = (getWidth() - offset_lr - metrics.stringWidth(getText().toUpperCase())) / 2;
        int y = (getHeight() - offset_td - metrics.getHeight()) / 2 + metrics.getAscent();
        g2.setFont(getFont());
        if (isEnabled()) {
            g2.setColor(getForeground());
        } else {
            Color fg = getForeground();
            g2.setColor(new Color(fg.getRed() / 255f, fg.getGreen() / 255f, fg.getBlue() / 255f, 0.6f));
        }
        g2.drawString(getText(), x, y);

        if (isEnabled()) {
            g2.setClip(new RoundRectangle2D.Float(0, 0, getWidth() - offset_lr, getHeight() - offset_td, 3, 3));
            g2.setColor(rippleColor);
            ripple.paint(g2);
        }
    }


    @Override
    protected void paintBorder(Graphics g) {
        //intentionally left blank
    }

    /**
     * Button types.
     */
    public enum Type {
        /**
         * A default button.
         */
        DEFAULT,
        /**
         * A raised button. Raised buttons have shadow even if they are not focused.
         */
        RAISED,
        /**
         * A flat button. Flat buttons don't have shadows and are typically transparent.
         */
        FLAT
    }




}
