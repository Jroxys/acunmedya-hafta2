package odevhafta2;

import java.util.ArrayList;
import java.util.Scanner;

public class java5odev020325 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<10 ; i++){
            System.out.println("Enter a word :");
            words.add(scanner.next());
        }
        words.sort((a,b) ->  {return 1*a.compareTo(b);});
        System.out.println(words);
    }

}
