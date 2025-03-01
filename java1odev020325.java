package odevhafta2;

import java.util.ArrayList;
import java.util.Scanner;

public class java1odev020325 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> higherThan50 = new ArrayList<Integer>();
        int[] numbers = new int[10];
        for (int i = 0; i <10 ; i++){
            System.out.println("Number "+(i+1) +": ");
            int number = scanner.nextInt();
            numbers[i] = number;
        }
        int total = 0;
        for(int number:numbers){
            total+=number;
            if (number>50){
                higherThan50.add(number);
            }
        }
        int averageTotal = total/10;
        System.out.println("Numbers average is = " +averageTotal);
        for (int higherThan50Num:higherThan50){
            System.out.println("This number is higher than 50 : "+ higherThan50Num);
        }
    }
}
