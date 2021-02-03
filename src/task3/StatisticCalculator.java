package task3;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StatisticCalculator {

    Date startSearch;
    Date endSearch;
    StringWorker stringWorker;
    String[][] entries;

    public StatisticCalculator(Date startSearch, Date endSearch, StringWorker stringWorker, String[][] entries) {
        this.startSearch = startSearch;
        this.endSearch = endSearch;
        this.stringWorker = stringWorker;
        this.entries = entries;
    }


    public int numberOfAttemptsToPourWater(){
        int count = 0;
        for (int i = 0; i < entries.length; i++){
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z").parse(entries[i][1]);
                if (date.after(startSearch) && date.before(endSearch) && entries[i][3].equals("give")){
                    count++;
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return count;
    }

    public double percentOfWrongs(){
        int count = 0;
        for (int i = 0; i < entries.length; i++){
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z").parse(entries[i][1]);
                if (date.after(startSearch) && date.before(endSearch) && entries[i][5].equals("fail")){
                    count++;
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        int l = entries.length;
        double res = (count*100)/l;

        return res;
    }
    public int successfullyPoured(){
        int sum = 0;
        for (int i = 0; i < entries.length; i++){
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z").parse(entries[i][1]);
                if (date.after(startSearch) && date.before(endSearch) && entries[i][3].equals("give")
                        && entries[i][5].equals("success")){
                    sum+=Integer.parseInt(entries[i][4]);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return sum;
    }

    public int notSuccessfullyPoured(){
        int sum = 0;
        for (int i = 0; i < entries.length; i++){
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z").parse(entries[i][1]);
                if (date.after(startSearch) && date.before(endSearch) && entries[i][3].equals("give")
                        && entries[i][5].equals("fail")){
                    sum+=Integer.parseInt(entries[i][4]);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return sum;
    }

    public int successfullyPickUp(){
        int sum = 0;
        for (int i = 0; i < entries.length; i++){
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z").parse(entries[i][1]);
                if (date.after(startSearch) && date.before(endSearch) && entries[i][3].equals("take")
                        && entries[i][5].equals("success")){
                    sum+=Integer.parseInt(entries[i][4]);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return sum;
    }

    public int notSuccessfullyPickUp(){
        int sum = 0;
        for (int i = 0; i < entries.length; i++){
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z").parse(entries[i][1]);
                if (date.after(startSearch) && date.before(endSearch) && entries[i][3].equals("take")
                        && entries[i][5].equals("fail")){
                    sum+=Integer.parseInt(entries[i][4]);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return sum;
    }

    public int levelOfWaterAtStart(){
        int level = 0;
        int index = 0;
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z").parse(entries[index][1]);
            while (!date.after(startSearch)){
                date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z").parse(entries[index][1]);
                index++;
            }
            level = Integer.parseInt(entries[index][6]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return level;
    }

    public int levelOfWaterAtEnd(){
        int level = 0;
        int index = 0;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z").parse(entries[index][1]);

            while (date.before(endSearch) && index < entries.length){
                date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z").parse(entries[index][1]);
                index++;
            }
            level = Integer.parseInt(entries[index-1][6]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return level;
    }


}
