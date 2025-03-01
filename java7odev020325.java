package odevhafta2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class java7odev020325 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("İstanbul","Eskişehir","Sivas","Ankara","İzmir"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your city: ");
        String userCity= scanner.next();
        if (cities.contains(userCity)){
            System.out.println("Your city's index is : " + cities.indexOf(userCity));
        }else {
            System.out.println("Your city is not in list.");
        }
    }
}
