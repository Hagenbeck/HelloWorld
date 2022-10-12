import java.awt.Color;
public class Main {
    public static void main(String[] args){
        PaintablePanel p = new PaintablePanel(new PaintableRectangle(10,10,100,200, new Color(255,100,100)));
        ShowInFrame.show(p, "Titel");
    }   
}