package task3;


public class StringWorker {

    public String[] getHeaders(String[] fileText){
        String headers[] = String.valueOf(fileText[0]).split(";");
        return headers;
    }

    public int getIndexColumnOfHeader(String[] headers, String header){
        int index = 0;
        while (header != headers[index]){
            index++;
        }
        return index;
    }

    public String[][] getEntries(String[] fileText){
        String strings[][] = new String[fileText.length - 1][getHeaders(fileText).length];
        for (int i = 1; i < fileText.length; i++){
            String entries[] = String.valueOf(fileText[i]).split(";");
            for (int j = 0; j < entries.length; j++){
                strings[i-1][j] = entries[j];
            }
        }
        return strings;
    }

}
