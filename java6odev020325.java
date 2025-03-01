package odevhafta2;

import java.util.ArrayList;
import java.util.Arrays;

public class java6odev020325 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,4,6,3,9,15,25,36,48,63,34,23,85,14,25,34,12,136,189,326));
        ArrayList<Integer> evenNums = new ArrayList<>();
        for (int number:numbers){
            if (number%2==0){
                evenNums.add(number);
            }
        }
        System.out.println(evenNums);
    }
}
