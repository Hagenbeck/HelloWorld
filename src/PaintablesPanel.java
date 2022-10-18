import java.util.*;

public class PaintablesPanel extends SimpleSizedPanel{
    List<Paintable> pas;

    public PaintablesPanel(List<Paintable> pas){
        this.pas = pas;
    } 

    public PaintablesPanel(List<Paintable> pas, int x,int y){
        super(x,y);
        this.pas = pas;
    } 
    
    public void paintComponent(java.awt.Graphics g){
        for(Paintable pa:pas) pa.paintTo(g); 
    }
}
