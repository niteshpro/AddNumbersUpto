import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scobject = new Scanner(System.in);
        System.out.println("Number upto which you want to add: ");
        int value = scobject.nextInt();
        int result = sum(value);
        System.out.println("sum of numbers upto "+ value + " " + result);
    }
    public static int sum(int value){
        if(value > 0){
            return value + sum(value-1);
        }
        else
            return 0;
    }
}