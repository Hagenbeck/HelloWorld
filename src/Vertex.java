public class Vertex {
    public double x,y;
    
    public Vertex(double x, double y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString(){
        return "(x:"+x+"; y:"+y+")";
    }


    //distance to (0;0) using pythagoras
    public double distToOrig(){
        return Math.sqrt(x*x+y*y);
    }

    //return new Vertex s times bigger
    public Vertex skalarMult(double s){
        return new Vertex(x*s, y*s);
    }

    //scaling the vertex by s times
    public void skalarMultMod(double s){
        this.x = x*s;
        this.y = y*s;
    }

    //add a second vertex to the first one
    public void add(Vertex v2){
        this.x=v2.x+x;
        this.y=v2.y+y;
    }

    //add a new Vertex with the same values
    public Vertex copyVer(){
        return new Vertex(x, y);
    }


//get Methods
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }


//set Methods
    public void setX(double xN){
        x=xN;
    }

    public void setY(double yN){
        y=yN;
    }
}