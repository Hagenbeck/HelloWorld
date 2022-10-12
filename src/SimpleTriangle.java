import java.awt.Color;
public class SimpleTriangle extends GeometricObject{

    public SimpleTriangle(Vertex pos, double width, Color color){
        super(pos, width, width * Math.cos(0.52359878), color);    
    }

    public SimpleTriangle(double x, double y, double width, Color color){
        this(new Vertex(x,y), width, color);       
    }

@ Override
    public double area(){ 
        return width*heigth/2 ;
    }

@ Override
    public String toString(){
        return "SimpleTriangle: " + super.toString();
    }

@ Override
    public boolean equalsTo(Object that){
        return (that instanceof SimpleTriangle) && this.equals(that);
    }
}