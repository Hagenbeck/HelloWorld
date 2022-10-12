import java.awt.Color;
public class Main {
    public static void main(String[] args){
        PaintablePanel p = new PaintablePanel(new PaintableTriangle(100, 100, 400, new Color(0,255,0)));
        ShowInFrame.show(p, "Titel");
    }   
}