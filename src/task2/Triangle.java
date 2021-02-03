package task2;

public class Triangle {

    int pointA[], pointB[], pointC[];

    public Triangle(int pointA[], int pointB[], int pointC[]) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Double sideLengthOfTriangle(int[] pointOne, int[] pointTwo){

        return Math.sqrt(Math.pow(pointTwo[0] - pointOne[0], 2) + Math.pow(pointTwo[1] - pointOne[1], 2)
                + Math.pow(pointTwo[2] - pointOne[2], 2));
    }
}
