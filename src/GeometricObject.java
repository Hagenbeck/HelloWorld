public class GeometricObject {
    Vertex pos;
    
    double width, heigth;

    public GeometricObject(Vertex pos, double width, double heigth){
        this.pos=pos;
        this.width=width;
        this.heigth=heigth;
    }

    public double getX(){
        return pos.getX();
    }

    public double getY(){
        return pos.getY();
    }

    public double getWidth(){
        return width;
    }

    public double getHeigth(){
        return heigth;
    }
}
