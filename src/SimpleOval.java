
public class SimpleOval extends GeometricObject{
    public SimpleOval(Vertex pos, double width, double heigth){
        super(pos, width, heigth);
    }

    public SimpleOval(double x, double y, double width, double heigth){
        this(new Vertex(x,y), width, heigth);       
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
