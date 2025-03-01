package odevhafta2;

import java.util.ArrayList;
import java.util.Scanner;

public class java4odev020325 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<10 ; i++){
            System.out.println("Enter a number: ");
            numbers.add(scanner.nextInt());
        }
        numbers.sort((a,b) ->{return 1 * a.compareTo(b);});
        System.out.println(numbers);
    }
}
