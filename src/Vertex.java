public class Vertex {
    public double x,y;
    
    public Vertex(double x, double y){
        this.x=x;
        this.y=y;
    }

    public String toString(){
        String s1 = "(x:"+x+"; y:"+y+")";

        return s1;
    }

    public double distToOrig(){
        double dist = Math.sqrt(x*x+y*y);

        return dist;
    }
}