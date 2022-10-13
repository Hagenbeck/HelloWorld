import java.awt.Color;
public class Main {
    public static void main(String[] args){
        String url = "wasserfall.jpg";
        GeometricImage gi = new GeometricImage(url,0, 0);
        PaintablePanel p = new PaintablePanel(gi);
        
        ShowInFrame.show(p, "Bild");      
        
        
        System.out.println(gi.getHeigth());
    }   
}