import java.awt.Color;
public class Main {
    public static void main(String[] args){
        String url = "wasserfall.jpg";
        PaintableImage pi = new PaintableImage(url,0, 0);
        PaintablePanel p = new PaintablePanel(pi);
        
        ShowInFrame.show(p, "Titel");        
    }   
}