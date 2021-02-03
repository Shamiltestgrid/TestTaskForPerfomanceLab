package task3;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FW {

    public void newFile(String filePath) {
        FileWriter nFile = null;
        int currentLevel = 0;
        try {
            nFile = new FileWriter(filePath);
            nFile.write("num;date;person;action;amount;result;currentLevel;maxLevel\n");
            for (int i = 1; i < 99; i++){
                Date date = new Date(System.currentTimeMillis() + i*1000);
                SimpleDateFormat ftr= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
                int k = (int)(Math.random() * 2);
                String action = "";
                if (k == 0){
                    action = "give";
                }
                else if (k == 1){
                    action = "take";
                }
                else {
                    System.err.println("wtf");
                }

                int amount = (int)(Math.random() * 50);

                String result = "";


                if (action.equals("give") && amount + currentLevel <= 50){
                    result = "success";
                    currentLevel += amount;
                }
                else if (action.equals("take") && currentLevel - amount >= 0){
                    result = "success";
                    currentLevel -= amount;
                }
                else {
                    result = "fail";
                }

                nFile.write(i+";"+ftr.format(date)+";user"+ ((i%2) + 1) +";"+ action +";"+ amount +";"
                        + result +";"+ currentLevel +";"+ 50 +"\n");
            }


            nFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
