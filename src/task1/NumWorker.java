package task1;

public class NumWorker {

    public Integer[] stringToInt(String strings[]){
        Integer[] numbers = new Integer[strings.length];
        for (byte i = 0; i < strings.length; i++){
            numbers[i] = Integer.parseInt(strings[i]);
        }
        return numbers;
    }

    public Integer[] bubbleSort(Integer[] array){
        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( array[j] > array[j+1] ){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return array;
    }

    public Integer calculateIndexOfAverageNumber(Integer[] numbers){
        Integer sum = 0;

        for (byte i = 0; i < numbers.length; i++){
            sum+= numbers[i];
        }
        Integer index = 0;
        while (sum/numbers.length <= numbers[index]){
            index++;
        }
        return index;
    }

    public Integer calculateIndexOfPercentNumber(Integer[] numbers){
        double n = numbers[numbers.length - 1] * 0.9;
        Integer index = 0;
        while (numbers[index] < n){
            index++;
        }
        return index;
    }

    public Integer sumNumeralOfArrayNumbersBetweenAverageAndPercent(Integer [] numbers, Integer average, Integer percent){
        Integer sum = 0;
        for(byte i = 0; i < numbers.length; i++){
            if (i >= average && i <= percent){
                String s[] = String.valueOf(numbers[i]).split("");
                for (int j = 0; j < s.length; j++){
                    sum = sum + Integer.parseInt(s[j]);
                }
            }
        }
        return sum;
    }

}
