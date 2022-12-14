import java.awt.Color;

public class PaintableOval extends SimpleOval implements Paintable {
    
    public PaintableOval(double x, double y, double width, double heigth, Color color){
        super(new Vertex(x, y), width, heigth, color);
    } 

    public void paintTo(java.awt.Graphics g){
        g.setColor(color);
        g.fillOval((int)pos.x, (int)pos.y, (int)width, (int)heigth);   
    }
}
