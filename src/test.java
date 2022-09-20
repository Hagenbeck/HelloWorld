public class test {
    public static void main(String[] args){
        Vertex v1 = new Vertex(3, 4);

        String sv = v1.toString();
        System.out.println(sv);

        double dis1 = v1.distToOrig();
        System.out.println("Distance to Origin:" + dis1);

    }
}