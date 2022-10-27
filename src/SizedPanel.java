import javax.swing.*;

import java.awt.Dimension;

public class SizedPanel extends JPanel {

    int preferredWidth = 1500;
    int preferredHeight = 1000;

    public SizedPanel(int w, int h) {
        preferredWidth = w;
        preferredHeight = h;
    }

    public SizedPanel() {
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(preferredWidth, preferredHeight);
    }
}