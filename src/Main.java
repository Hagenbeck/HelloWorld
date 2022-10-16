import java.awt.Color;
public class Main {
    public static void main(String[] args){
        /*String url = "wasserfall.jpg";
        GeometricImage gi = new GeometricImage(url,0, 0);
        PaintablePanel p = new PaintablePanel(gi);
        */

        PaintablePanel p = new PaintablePanel(new PaintableStar(200, 100, 100, Color.green));

        ShowInFrame.show(p, "Bild");      
        
    }   
}