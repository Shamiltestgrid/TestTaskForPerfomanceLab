package task2;


public class Main {

    public static void main(String[] args) {
        CreateTriangle ct = new CreateTriangle();
        Triangle t1 = ct.newTriangle(ct.getPoints(ct.fileReader(args[0]), 0));
        Triangle t2 = ct.newTriangle(ct.getPoints(ct.fileReader(args[0]), 1));

        CompareTriangles ctt = new CompareTriangles();
        if(ctt.compare(t1,t2)){
            System.out.println("yeah");
        }
        else System.out.println("no");
    }
}
