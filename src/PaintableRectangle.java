import java.awt.Color;
public class PaintableRectangle extends SimpleRectangle implements Paintable {
    
    public PaintableRectangle(double x, double y, double width, double heigth, Color color){
        super(new Vertex(x, y), width, heigth, color);
    }

    public void paintTo(java.awt.Graphics g){
        g.setColor(color);
        g.fillRect((int)pos.x, (int)pos.y, (int)width, (int)heigth);       
    }
}
