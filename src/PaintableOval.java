
public class PaintableOval extends SimpleOval implements Paintable {
    
    public PaintableOval(double x, double y, double width, double heigth){
        super(new Vertex(x, y), width, heigth);
    } 

    public void paintTo(java.awt.Graphics g){
        g.fillOval((int)pos.x, (int)pos.y, (int)width, (int)heigth);
    }
}
