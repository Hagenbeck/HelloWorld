import java.awt.Color;
public class Main {
    public static void main(String[] args){
        /*String url = "wasserfall.jpg";
        GeometricImage gi = new GeometricImage(url,0, 0);
        PaintablePanel p = new PaintablePanel(gi);
        */

        PaintablePanel p = new PaintablePanel(new PaintableStar(300, 100, 200, Color.black));

        ShowInFrame.show(p, "Bild");      
        
    }   
}