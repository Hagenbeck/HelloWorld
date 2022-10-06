package util;


import javax.swing.*;

public class ShowInFrame {
    public void show(JComponent c, String title){
        JFrame f = new JFrame(title);
        f.add(c);
        f.setSize(1920, 1080);
        f.setVisible(true);
    
    }
}
