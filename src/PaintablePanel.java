public class PaintablePanel extends SimpleSizedPanel{
    Paintable pa;

    public PaintablePanel(Paintable pa){
        this.pa = pa;
    }

    public void paintComponent(java.awt.Graphics g){
        pa.paintTo(g);
    }
}
