public class Main {
    public static void main(String[] args){
        PaintablePanel p = new PaintablePanel(new PaintableRectangle(10,10,100,200));
        ShowInFrame.show(p, "Titel");
    }   
}