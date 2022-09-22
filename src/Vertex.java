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

    public double distToOrig(){
        return Math.sqrt(x*x+y*y);
    }

    public Vertex skalarMult(double s){
        return new Vertex(x*s, y*s);
    }

    public void skalarMultMod(double s){
        this.x = x*s;
        this.y = y*s;
    }
}