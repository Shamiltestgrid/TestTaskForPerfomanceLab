package task3;

import task2.CreateTriangle;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        CreateTriangle ct = new CreateTriangle();
        String s[] = ct.fileReader(args[0]);

        StringWorker stringWorker = new StringWorker();


//        for (String ss : stringWorker.getHeaders(s)){
//            System.out.print(ss + " ");
//        }
//        System.out.println();
//
//        for(String[] row: stringWorker.getEntries(s))
//        {
//            for(String element: row){
//
//                System.out.print(element+ " ");
//            }
//            System.out.println();
//        }


//    FW fw = new FW();
//        fw.newFile(args[0]);

        try {

//            dateExample "2021-02-03 00:18:04 MSK"
            StatisticCalculator sc = new StatisticCalculator(
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z").parse(args[1]),
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z").parse(args[2]),
                    stringWorker,
                    stringWorker.getEntries(s));

                System.out.println(sc.numberOfAttemptsToPourWater());
                System.out.println(sc.percentOfWrongs());
                System.out.println(sc.successfullyPoured());
                System.out.println(sc.notSuccessfullyPoured());
                System.out.println(sc.successfullyPickUp());
                System.out.println(sc.notSuccessfullyPickUp());
                System.out.println(sc.levelOfWaterAtStart());
                System.out.println(sc.levelOfWaterAtEnd());

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}