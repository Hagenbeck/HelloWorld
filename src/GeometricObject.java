public class GeometricObject {
    Vertex pos;
    
    double width;
    double heigth;

    public GeometricObject(Vertex pos, double width, double heigth){
        this.pos=pos;
        this.width=width;
        this.heigth=heigth;  
    
        if(width < 0){
            this.width = -width;
        }
        if(heigth < 0){
            this.heigth = -heigth;
        }
        if(pos.x < 0){
            this.pos.x = -pos.x;
        }
        if(pos.y < 0){
            this.pos.y= -pos.y;
        }
    }

    public GeometricObject(double x, double y, double width, double heigth){
        this(new Vertex(x,y), width, heigth);    
    }

    public GeometricObject(double width, double heigth){
        this(0.0, 0.0, width, heigth);    
    }

    public GeometricObject(Vertex pos, double width){
        this(pos, width, width);
    }

    public GeometricObject(double heigth){
        this(0.0,0.0,heigth, heigth);
    }

    public GeometricObject(){
        this(0.0, 0.0, 100.0, 100.0); 
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

    @Override
    public String toString(){
        String ret = pos + "(width: "+ width+";heigth: "+heigth +")";
        return ret;
    }
}
