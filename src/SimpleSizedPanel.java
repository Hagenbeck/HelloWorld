import javax.swing.*;
import java.awt.*;


public class SimpleSizedPanel extends JPanel{
    int preferredWidth=400;
    int preferredHeight=300;

    	public SimpleSizedPanel(int w, int h){
            preferredHeight = h;
            preferredWidth = w;
        }

        public SimpleSizedPanel(){

        }

        public void paintComponent(Graphics g){
            g.fillRect(0,0, 10,10);
        }
@Override
    public Dimension getPreferredSize(){
        return new Dimension(preferredWidth,preferredHeight);
    }

}