import javax.swing.*;

public class SimpleButton extends JPanel {

    JButton b1 = new JButton("increment");
    JButton b2 = new JButton("decrement");
    JButton b3 = new JButton("reset");
    JLabel l = new JLabel("  0");

    SimpleButton() {
        add(b1);
        add(b2);
        add(b3);
        add(l);
    }

}