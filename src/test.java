public class test {
    public static void main(String[] args){
        Vertex v1 = new Vertex(3, 4);
        Vertex v2 = new Vertex(42, 3);
        Vertex vv = new Vertex(1920,1080);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(vv);


        System.out.println("Distance to Origin(v1):" + v1.distToOrig());
        System.out.println("Distance to Origin(v2):" + v2.distToOrig());
        System.out.println("Distance to Origin(vv):" + vv.distToOrig());

        System.out.print("skalarMult:");
        Vertex vS = v1.skalarMult(5);
        System.out.println(vS.distToOrig());

        System.out.print("skalarMultMod:");
        v2.skalarMultMod(6);
        System.out.println(v2.distToOrig());
    }
}