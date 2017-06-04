

import org.jdesktop.core.animation.timing.Animator;
import org.jdesktop.core.animation.timing.interpolators.SplineInterpolator;
import org.jdesktop.swing.animation.timing.sources.SwingTimerTimingSource;

import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

/**
 * A Material Design single-line text field.
 *
 * @see <a href="https://www.google.com/design/spec/components/text-fields.html">Text fields (Google design guidelines)</a>
 */
public class MaterialTextField extends JTextField {
    private FloatingLabel floatingLabel = new FloatingLabel(this);
    private Line line = new Line(this);
    private String hint = "";

    /**
     * Creates a new text field.
     */
    public MaterialTextField() {
        setBorder(null);
        setFont(Roboto.REGULAR.deriveFont(18f));
        setBackground(MaterialColor.DEEPORANGE_50);
        //setFont(new Font("Calibri",Font.PLAIN, 14));
        floatingLabel.setText("");

        setCaret(new DefaultCaret() {
            @Override
            protected synchronized void damage(Rectangle r) {
                MaterialTextField.this.repaint(); //fix caret not being removed completely
            }
        });
        getCaret().setBlinkRate(500);
    }

    /**
     * Gets the text of the floating label.
     *
     * @return text of the floating label
     */
    public String getLabel() {
        return floatingLabel.getText();
    }

    /**
     * Sets the text of the floating label.
     *
     * @param label text of the floating label
     */
    public void setLabel(String label) {
        floatingLabel.setText(label);
        repaint();
    }

    /**
     * Gets the hint text.
     *
     * @return hint text
     */
    public String getHint() {
        return hint;
    }

    /**
     * Sets the hint text.
     *
     * @param hint hint text
     */
    public void setHint(String hint) {
        this.hint = hint;
        repaint();
    }

    @Override
    public void setText(String s) {
        super.setText(s);
        floatingLabel.update();
        line.update();
    }

    @Override
    protected void processFocusEvent(FocusEvent e) {
        super.processFocusEvent(e);
        floatingLabel.update();
        line.update();
    }

    @Override
    protected void processKeyEvent(KeyEvent e) {
        super.processKeyEvent(e);
        floatingLabel.update();
        line.update();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        g2.setColor(getBackground());
        g2.fillRect(0,  0, getWidth(), getHeight());

        g2.translate(0, 3);
        super.paintComponent(g);
        g2.translate(0, -9);

        if (!getHint().isEmpty() && getText().isEmpty() && (getLabel().isEmpty() || isFocusOwner()) && floatingLabel.isFloatingAbove()) {
            g.setFont(Roboto.REGULAR.deriveFont(16f));
            g2.setColor(MaterialColor.MIN_BLACK);
            FontMetrics metrics = g.getFontMetrics(g.getFont());
            g.drawString(getHint(), 0, metrics.getAscent() + 15);
        }

        floatingLabel.paint(g2);

        g2.setColor(MaterialColor.GREY_300);
        g2.fillRect(0, getHeight() +4, getWidth(), 3);

        g2.setColor(MaterialColor.CYAN_500);
        g2.fillRect((int) ((getWidth() - line.getWidth()) / 2), getHeight() + 2, (int) line.getWidth(), 2);
    }

    @Override
    protected void paintBorder(Graphics g) {
        //intentionally left blank
    }

    /**
     * An animated line below a text field.
     */
    public static class Line {
        private final SwingTimerTimingSource timer;
        private final JComponent target;
        private Animator animator;
        private SafePropertySetter.Property<Double> width;

        Line(JComponent target) {
            this.target = target;
            this.timer = new SwingTimerTimingSource();
            timer.init();
            width = SafePropertySetter.animatableProperty(target, 0d);
        }

        void update() {
            if (animator != null) {
                animator.stop();
            }
            animator = new Animator.Builder(timer)
                    .setDuration(200, TimeUnit.MILLISECONDS)
                    .setEndBehavior(Animator.EndBehavior.HOLD)
                    .setInterpolator(new SplineInterpolator(0.4, 0, 0.2, 1))
                    .addTarget(SafePropertySetter.getTarget(width, width.getValue(), target.isFocusOwner() ? (double) target.getWidth() + 1 : 0d))
                    .build();
            animator.start();
        }

        public double getWidth() {
            return width.getValue();
        }
    }

    /**
     * A floating label of a text field.
     */
    public static class FloatingLabel {
        private final SwingTimerTimingSource timer;
        private final JTextField target;
        private Animator animator;
        private final SafePropertySetter.Property<Double> y;
        private final SafePropertySetter.Property<Double> fontSize;
        private final SafePropertySetter.Property<Color> color;
        private String text;

        FloatingLabel(JTextField target) {
            this.target = target;
            this.timer = new SwingTimerTimingSource();
            timer.init();

            y = SafePropertySetter.animatableProperty(target, 36d);
            fontSize = SafePropertySetter.animatableProperty(target, 16d);
            color = SafePropertySetter.animatableProperty(target, MaterialColor.MIN_BLACK);
        }

        void update() {
            if (animator != null) {
                animator.stop();
            }
            Animator.Builder builder = new Animator.Builder(timer)
                    .setDuration(200, TimeUnit.MILLISECONDS)
                    .setEndBehavior(Animator.EndBehavior.HOLD)
                    .setInterpolator(new SplineInterpolator(0.4, 0, 0.2, 1));
            double targetFontSize = (target.isFocusOwner() || !target.getText().isEmpty()) ? 12d : 16d;
            if (fontSize.getValue() != targetFontSize) {
                builder.addTarget(SafePropertySetter.getTarget(fontSize, fontSize.getValue(), targetFontSize));
            }
            double targetY = target.isFocusOwner() || !target.getText().isEmpty() ? 16d : 36d;
            if (Math.abs(targetY - y.getValue()) > 0.1) {
                builder.addTarget(SafePropertySetter.getTarget(y, y.getValue(), targetY));
            }
            Color targetColor;
            if (target.getText().isEmpty() && target.isFocusOwner()) {
                targetColor = MaterialColor.CYAN_500;
            } else {
                if (target.getText().isEmpty()) {
                    targetColor = MaterialColor.MIN_BLACK;
                } else {
                    targetColor = MaterialColor.LIGHT_BLACK;
                }
            }
            if (!targetColor.equals(color.getValue())) {
                builder.addTarget(SafePropertySetter.getTarget(color, color.getValue(), targetColor));
            }
            animator = builder.build();
            animator.start();
        }

        String getText() {
            return text;
        }

        void setText(String text) {
            this.text = text;
        }

        void paint(Graphics2D g) {
            g.setFont(Roboto.REGULAR.deriveFont(fontSize.getValue().floatValue()));
           // g.setFont(new Font("Calibri",Font.PLAIN, 14));
            g.setColor(color.getValue());
            FontMetrics metrics = g.getFontMetrics(g.getFont());
            g.drawString(getText(), 0, metrics.getAscent() + y.getValue().intValue());
        }

        boolean isFloatingAbove() {
            return y.getValue() < 17d;
        }
    }
}
