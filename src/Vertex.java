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

    //distance between to vertexes
    public double distToVer(Vertex v2){      
        double delX = v2.x-this.x;
        double delY = v2.y-this.y;

        return Math.sqrt(delX*delX + delY*delY);
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
    public void addMod(Vertex v2){
        this.x=v2.x+x;
        this.y=v2.y+y;
    }

    public Vertex addNew(Vertex v2){
        return new Vertex(v2.x+this.x,v2.y+this.y);
    }

    //substract a second vertex of the first one
    public void sub(Vertex v2){
        this.x=x-v2.x;
        this.y=y-v2.y;
    }

    public Vertex normalize(){
        double factor = this.distToOrig();

        return new Vertex(x/factor, y/factor);
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

    //dasgleiche Vertex?
    public boolean equalsTo(Object thatObj){
        if(thatObj instanceof Vertex){
            Vertex that = (Vertex) thatObj;

            return (that.x == this.x)&&(that.y==this.y);
        }        
            return false;       
    }
}