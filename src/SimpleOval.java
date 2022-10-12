import java.awt.Color;
public class SimpleOval extends GeometricObject{
    public SimpleOval(Vertex pos, double width, double heigth, Color color){
        super(pos, width, heigth, color);
    }

    public SimpleOval(double x, double y, double width, double heigth, Color color){
        this(new Vertex(x,y), width, heigth, color);       
    }

@Override
    public double area(){
        return Math.PI*width*heigth/4;
    }

@ Override
    public String toString(){
        return "SimpleOval: " + super.toString();
    }

@ Override
    public boolean equalsTo(Object that){
        return (that instanceof SimpleOval) && this.equals(that);
    }
}
