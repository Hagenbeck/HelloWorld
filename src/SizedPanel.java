import javax.swing.*;
import java.awt.Dimension;

public class SizedPanel extends JPanel{
    int preferredWidth=400;
    int preferredHeight=300;  

    	public SizedPanel(int w, int h){
            preferredHeight = h;
            preferredWidth = w;
        }

        public SizedPanel(){

        }
@Override
    public Dimension getPreferredSize(){
        return new Dimension(preferredWidth,preferredHeight);
    }

 
}