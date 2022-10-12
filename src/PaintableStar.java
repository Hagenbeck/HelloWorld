import java.awt.Color;
// @Czernohous: Funktioniert noch nicht
public class PaintableStar implements Paintable {
    int[] x,y;
    int n;
    Color color;

    public PaintableStar(int[] x, int[] y, int n, Color color){
        this.x = x;
        this.y = y;
        this.n = n;
        this.color = color;
    }

    public void paintTo(java.awt.Graphics g){
        g.setColor(color);
        g.fillPolygon(x, y, n);
    }
}
