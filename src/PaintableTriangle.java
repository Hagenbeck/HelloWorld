import java.awt.Color;
import java.awt.Polygon;

public class PaintableTriangle extends SimpleTriangle implements Paintable {
    
    public PaintableTriangle(double x, double y, double width, Color color){
        super(new Vertex(x, y), width, color);
    }

    public void paintTo(java.awt.Graphics g){
        Polygon triangle = new Polygon();
        triangle.addPoint((int)pos.x, (int)pos.y);
        triangle.addPoint((int)pos.x + (int)width/2, (int)pos.y + (int)heigth);
        triangle.addPoint((int)pos.x - (int)width/2, (int)pos.y + (int)heigth);

        g.setColor(color);
        g.fillPolygon(triangle);      
    }
}