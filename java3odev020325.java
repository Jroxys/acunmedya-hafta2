package odevhafta2;

public class java3odev020325 {
    public static void main(String[] args) {
        int[] numbers = {5,16,23,19,-8,-7,-69,36};
        int totalPositive=0;
        int totalNegative = 0;
        for (int number:numbers){
            if (number<0){
                totalNegative+=number;
            }else{
                totalPositive+=number;
            }
        }
        System.out.println("Positive : " + totalPositive + "\n" + "Negative : " + totalNegative);
    }
}
