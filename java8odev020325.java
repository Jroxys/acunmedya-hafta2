package odevhafta2;

import java.util.ArrayList;
import java.util.Arrays;

public class java8odev020325 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5,13,2,35,36,48,98,15,27,29));
        int min = numbers.get(0);
        int max = numbers.get(0);
        for (int number:numbers) {
            if (number<min) {
                min = number;
            }
            if (number> max) {
                max = number;
            }
        }
        System.out.println("Max : " + max +"\nMin : " + min );
    }
}
