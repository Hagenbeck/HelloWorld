public class Vertex {
    public double x,y;
    
    public Vertex(double x, double y){
        this.x=x;
        this.y=y;
    }

    public String toString(){
        return "(x:"+x+"; y:"+y+")";
    }

    public double distToOrig(){
        return Math.sqrt(x*x+y*y);
    }
}