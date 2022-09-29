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


    public double circumference(){
        return 2*(width+heigth);
    }

    public double area(){
        return width*heigth;
    }

    public boolean contains(Vertex ver){
        return  ver.x>=pos.x && ver.x<=pos.x+width
                && 
                ver.y>=pos.y && ver.y<=pos.y+heigth;
                
    }

    public boolean biggerThan(GeometricObject g2){
        return this.area()>g2.area();
    }

    public void moveTo(Vertex newV){
        this.pos=newV;
    }

    public void moveTo(double x, double y){
        moveTo(new Vertex(x,y));
    }

    public void move(Vertex vm){
        this.pos.addMod(vm);
    }

    public void move(double x, double y){
        move(new Vertex(x,y));
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

    public boolean equalsTo(Object obj){
        if(obj instanceof GeometricObject){
           GeometricObject objGeo = (GeometricObject) obj;

           return objGeo.pos.equalsTo(this.pos) 
                  && this.width==objGeo.width
                  && this.heigth==objGeo.heigth;
        }
        
        return false;
    }

    @Override
    public String toString(){
        String ret = pos + "(width: "+ width+";heigth: "+heigth +")";
        return ret;
    }
}
