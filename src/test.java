public class test {
    public static void main(String[] args){
        Vertex vTri = new Vertex(0,0);
        double width = 100;
        SimpleTriangle triAgain = new SimpleTriangle(vTri, width);
        System.out.println(triAgain);
        System.out.println("Area of triAgain: " + triAgain.area());
    }
}