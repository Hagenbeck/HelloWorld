import java.awt.Color;
import java.util.*;
public class Main {
    public static void main(String[] args){
        String url = "wasserfall.jpg";
        /*GeometricImage gi = new GeometricImage(url,0, 0);
        PaintablePanel p = new PaintablePanel(gi);
        */

        //PaintablePanel p  = new PaintablePanel(new PaintableStar(200, 100, 100, Color.green));


        List<Paintable> ps = new ArrayList<Paintable>();
        ps.add(new PaintableStar(400, 100, 100, Color.green));
        ps.add(new GeometricImage(url,0, 0));


        ShowInFrame.show(new PaintablesPanel(ps, 1000, 1000),"Bild");     
        
    }   
}