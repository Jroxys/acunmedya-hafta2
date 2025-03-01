package odevhafta2;

import java.util.ArrayList;
import java.util.Arrays;

public class java10odev020325 {
    public static void main(String[] args) {
        int[] numbers = {1,5,9,3,4};

        //Arrays.sort() sort elements in natural order.
        Arrays.sort(numbers);
        //Arrays.binarySearch() search index for spesific element. array must be sorted
        Arrays.binarySearch(numbers,5); //3 when sorted
        //Arrays.copyOfRange() coppies an array to another in spesific range
        int [] methodTest = Arrays.copyOfRange(numbers,1,3); //[5,9,3]
        //Arrays.equals() checks if arrays are equal
        Arrays.equals(numbers,methodTest); // false
        //Arrays.fill() fills all elements of an array with a specified value
        Arrays.fill(numbers,8); // numbers is now [8,8,8,8,8]
    }
}
