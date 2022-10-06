package objects;
public class SimpleRectangle extends GeometricObject{
    
    public SimpleRectangle(Vertex pos, double width, double heigth){
        super(pos, width, heigth);
    }

    public SimpleRectangle(double x, double y, double width, double heigth){
        this(new Vertex(x,y), width, heigth);

    }

@Override
    public double area(){
        return super.area();
    }

@ Override
    public String toString(){
        return "SimpleRectangle: " + super.toString();
    }

@ Override
    public boolean equalsTo(Object that){
        return (that instanceof SimpleRectangle) && this.equals(that);
    }
}