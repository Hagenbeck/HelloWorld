public class SimpleTriangle extends GeometricObject{

    public SimpleTriangle(Vertex pos, double width){
        super(pos, width, width * Math.cos(0.52359878));    
    }

    public SimpleTriangle(double x, double y, double width){
        this(new Vertex(x,y), width);       
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