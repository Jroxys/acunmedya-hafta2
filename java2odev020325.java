package odevhafta2;

import java.util.HashSet;

public class java2odev020325 {
    public static void main(String[] args) {
        int[] numbers = {3,5,3,19,23,19,7};
        HashSet<Integer> tempNums = new HashSet<>();
        HashSet<Integer> dups = new HashSet<>();

        for (int number:numbers){
            if(!tempNums.add(number)){
                dups.add(number);
            }
        }
        System.out.println("Duplicates : "+ dups);
    }
}
