


import javax.swing.*;

public class ShowInFrame {
    public static void show(JComponent c, String title){
        JFrame f = new JFrame(title);
        f.add(c);
        f.pack();
      
        f.setLocationRelativeTo(null); 
        f.setVisible(true);
        f.repaint();
    }
}
