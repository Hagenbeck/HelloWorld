import javax.swing.JPanel;

public class PaintableImage extends JPanel implements Paintable {
    MyImage mi;
    double x;
    double y;

    public PaintableImage(MyImage mi, double x, double y){
        this.mi=mi;
        this.x = x;
        this.y = y;
    }

    public PaintableImage(String name, double x, double y){
        this.mi=new MyImage(name);
        this.x = x;
        this.y = y;
    }

    public PaintableImage(String name){
        this.mi=new MyImage(name);
        this.x = 0;
        this.y = 0;
    }


    public void paintTo(java.awt.Graphics g){
        g.drawImage(mi.get(), (int)x, (int)y, this);      
    }
}
