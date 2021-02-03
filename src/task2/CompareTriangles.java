package task2;

public class CompareTriangles {


    public boolean compare(Triangle t1, Triangle t2){

        boolean b = (t1.sideLengthOfTriangle(t1.pointB, t1.pointA) / t2.sideLengthOfTriangle(t2.pointB, t2.pointA)
                == t1.sideLengthOfTriangle(t1.pointB, t1.pointC) / t2.sideLengthOfTriangle(t2.pointB, t2.pointC)
                && t1.sideLengthOfTriangle(t1.pointC, t1.pointA) / t2.sideLengthOfTriangle(t2.pointC, t2.pointA)
                == t1.sideLengthOfTriangle(t1.pointB, t1.pointA) / t2.sideLengthOfTriangle(t2.pointB, t2.pointA)
                && t1.sideLengthOfTriangle(t1.pointC, t1.pointA) / t2.sideLengthOfTriangle(t2.pointC, t2.pointA)
                == t1.sideLengthOfTriangle(t1.pointB, t1.pointC) / t2.sideLengthOfTriangle(t2.pointB, t2.pointC))
                || (t1.sideLengthOfTriangle(t1.pointB, t1.pointA) / t2.sideLengthOfTriangle(t2.pointC, t2.pointA)
                == t1.sideLengthOfTriangle(t1.pointB, t1.pointC) / t2.sideLengthOfTriangle(t2.pointC, t2.pointB)
                && t1.sideLengthOfTriangle(t1.pointC, t1.pointA) / t2.sideLengthOfTriangle(t2.pointB, t2.pointA)
                == t1.sideLengthOfTriangle(t1.pointB, t1.pointA) / t2.sideLengthOfTriangle(t2.pointC, t2.pointA)
                && t1.sideLengthOfTriangle(t1.pointC, t1.pointA) / t2.sideLengthOfTriangle(t2.pointB, t2.pointA)
                == t1.sideLengthOfTriangle(t1.pointB, t1.pointC) / t2.sideLengthOfTriangle(t2.pointC, t2.pointB))
                || (t1.sideLengthOfTriangle(t1.pointB, t1.pointA) / t2.sideLengthOfTriangle(t2.pointA, t2.pointB)
                == t1.sideLengthOfTriangle(t1.pointB, t1.pointC) / t2.sideLengthOfTriangle(t2.pointA, t2.pointC)
                && t1.sideLengthOfTriangle(t1.pointC, t1.pointA) / t2.sideLengthOfTriangle(t2.pointC, t2.pointB)
                == t1.sideLengthOfTriangle(t1.pointB, t1.pointA) / t2.sideLengthOfTriangle(t2.pointA, t2.pointB)
                && t1.sideLengthOfTriangle(t1.pointC, t1.pointA) / t2.sideLengthOfTriangle(t2.pointC, t2.pointB)
                == t1.sideLengthOfTriangle(t1.pointB, t1.pointC) / t2.sideLengthOfTriangle(t2.pointA, t2.pointC));
        return b;

    }
}
