package task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CreateTriangle {

    public String [] fileReader(String path) {
        String fileText[] = new String[100];
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            byte i = 0;
            while ((line = reader.readLine()) != null && i < 100){
                fileText[i] = line;
//                System.out.println(fileText[i]);
                i++;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        int k = 0;
        while (fileText[k] != null){
            k++;
        }

        String strings[] = new String[k];

        for (byte i = 0; i < strings.length; i++){
            strings[i] = fileText[i];
        }
        fileText = null;
        System.gc();
        return strings;
    }


    public Integer[][] getPoints(String triangleInfo[], int numbLine){
        Integer temp[][] = new Integer[3][3];
        int index0 = 0, index1 = 0, index2 = 0;
        index0 = index0 + numbLine*56;
        for (int i = 0; i <= 0; i++){
            index1 = triangleInfo[i].indexOf("[", index0);
            for (int j = 0; j <= 2; j++) {
                index2 = triangleInfo[i].indexOf(",", index1);
                temp[j][0] = Integer.parseInt(triangleInfo[i].substring(index1 + 1, index2));
//                System.out.println(temp[j][0]);
                index1 = index2;
                index2 = triangleInfo[i].indexOf(",", index1 + 1);
                temp[j][1] = Integer.parseInt(triangleInfo[i].substring(index1 + 2, index2));
//                System.out.println(temp[j][1]);
                index1 = index2;
                index2 = triangleInfo[i].indexOf("]", index1 + 1);
                temp[j][2] = Integer.parseInt(triangleInfo[i].substring(index1 + 2, index2));
//                System.out.println(temp[j][2]);
                index1 = index2;
                index2 = triangleInfo[i].indexOf("[", index1 + 1);
                index1 = index2;
            }
        }
        return temp;
    }

    public Triangle newTriangle(Integer points[][]){
        Triangle t = new Triangle(new int[]{points[0][0], points[0][1], points[0][2]},
                new int[]{points[1][0], points[1][1], points[1][2]},
                new int[]{points[2][0], points[2][1], points[2][2]});
        return t;
    }
}
