import java.awt.Color;
// @Czernohous: Funktioniert noch nicht
public class PaintableStar implements Paintable {
    double x,y;
    int width;
    Color color;

    public PaintableStar(double x, double y, int width, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.color = color;
    }

    public void paintTo(java.awt.Graphics g){
       int xo = (int) x;
       int yo = (int) y;
       
       int[] xa = {xo, xo + width/8, xo +width/2, xo + width/4, xo+width/3+width/8, xo, xo-width/3-width/8, xo - width/4, xo -width/2, xo - width/8};
       int[] ya = {yo, yo+width/3, yo+width/3 , yo+width/3+width/4, yo+width, yo+width/4*3, yo+width, yo+width/3+width/4, yo+width/3, yo+width/3} ;
        
        
        
        
        g.setColor(color);
        g.fillPolygon((xa), (ya), 10);
    }
}
