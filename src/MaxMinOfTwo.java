import java.util.Scanner;

public class MaxMinOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int memo = 0;

        System.out.print("Please enter your first number: ");
        int max = scan.nextInt();

        System.out.print("Please enter your last number: ");
        int min = scan.nextInt();

        if (min > max) {
            memo = min;
            min = max;
            max = memo;
            System.out.printf("The max number is %d, the min number is %d\n", max, min);
        } else if (min == max) System.out.println("Both of the numbers are equal");
        else System.out.println("There are ERROR");

        System.out.println("The end");
    }
}
