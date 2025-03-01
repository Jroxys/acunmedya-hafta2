package odevhafta2;

import java.util.ArrayList;
import java.util.Arrays;

public class java9odev020325 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5,4,59,6));
        //get() gets element in spesific index
        numbers.get(2); // 59
        //set() update element in spesific index
        numbers.set(2,29); // 59 (2.index) will be 29 rightnow
        //remove() remove object from list
        numbers.remove(4); // 4 is not in list anymore
        //clear() clears all elements from list
        numbers.clear(); // numbers is empty rightnow
        //size() returns number of elements in list
        numbers.size(); // it should be 0 because we cleared list
    }
}
