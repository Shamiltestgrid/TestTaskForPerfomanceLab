package task1;

import task2.CreateTriangle;

public class Main {

    public static void main(String[] args) {
        NumWorker nw = new NumWorker();
        CreateTriangle ct = new CreateTriangle();

        String s[] = ct.fileReader(args[0]);


        Integer[] integers = nw.bubbleSort(nw.stringToInt(s));

        System.out.println(nw.sumNumeralOfArrayNumbersBetweenAverageAndPercent(integers,
                nw.calculateIndexOfAverageNumber(integers), nw.calculateIndexOfPercentNumber(integers)));
    }
}
