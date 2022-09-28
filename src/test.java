public class test {
    public static void main(String[] args){
    /*  MethodTest
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
        System.out.println(vS);

        System.out.print("skalarMultMod:");
        v2.skalarMultMod(6);
        System.out.println(v2);

        vS.add(v2);
        System.out.println(vS);

        System.out.println(v1.equalsTo(vv));

        Vertex vN = vv.copyVer();
        System.out.println(vN.equalsTo(vv));
         
        
        Vertex v1 = new Vertex(0, 0);
        Vertex v2 = new Vertex(42, 10);
        Vertex v3 = new Vertex(80,75);

        System.out.println("distance v1-v2: "+v1.distToVer(v2));
        System.out.println("Distance to Origin(v2):" + v2.distToOrig());

        System.out.println("distance v2-v3: "+v2.distToVer(v3));
        */
        Vertex v1 = new Vertex(0, 0);
        double d1 = 10.0;
        double d2 = 20.0;
        
        GeometricObject g1 = new GeometricObject(v1, d1, d2);
        System.out.println(g1);
    }
}