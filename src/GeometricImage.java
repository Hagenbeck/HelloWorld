import javax.swing.*;

public class GeometricImage extends GeometricObject implements Paintable{
    ImageIcon icon;

    public GeometricImage(String name,double x,double y){
        super(x,y, 0, 0, 0);
        icon=new ImageIcon(getClass().getClassLoader().getResource(name));
        init() ;
    }
    public GeometricImage(ImageIcon icon,double x,double y){
        super(x,y, 0, 0, 0);
        this.icon=icon;
        init();
    }
    void init () {
        width=icon.getImage().getWidth(icon.getImageObserver());
        heigth=icon.getImage().getHeight(icon.getImageObserver());
    }

    public void paintTo(java.awt.Graphics g){
        icon.paintIcon(null,g,(int)pos.x,(int)pos.y);
    }

}
