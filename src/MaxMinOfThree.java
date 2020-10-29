import java.util.Scanner;

public class MaxMinOfThree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 0, med = 0, max = 0;

        System.out.print("Please enter your first number: ");
        int a = scan.nextInt();
        System.out.print("Please enter your second number: ");
        int b = scan.nextInt();
        System.out.print("Please enter your last number: ");
        int c = scan.nextInt();

        byte i = 0;

        if (a < b & b < c) {
            max = c;
            med = b;
            min = a;
        } else if (a < c & c < b) {
            max = b;
            med = c;
            min = a;
        } else if (b < a & a < c) {
            max = c;
            med = a;
            min = b;
        } else if (b < c & c < a) {
            max = a;
            med = c;
            min = b;
        } else if (c < a & a < b) {
            max = b;
            med = a;
            min = c;
        } else if (c < b & b < a) {
            max = a;
            med = b;
            min = c;
        } else if (c == a & a == b) {
            i = 1;
        } else if (c == a & a > b) {
            max = a;
            min = b;
            i = 2;
        } else if (c == a & a < b) {
            max = b;
            min = c;
            i = 2;
        } else if (b == a & a < c) {
            max = c;
            min = a;
            i = 3;
        } else if (b == a & a > c) {
            max = a;
            min = c;
            i = 3;
        } else if (b == c & c > a) {
            max = c;
            min = a;
            i = 4;
        } else if (b == c & c < a) {
            max = a;
            min = c;
            i = 4;
        } else System.out.println("The ERROR is here");

        switch (i) {
            case (0):
                System.out.printf("\nThere are max is %d, medium is %d, min is %d\n", max, med, min);
                break;
            case (1):
                System.out.printf("\nAll numbers are equal, and the number is: %d\n", a);
                break;
            case (2):
                System.out.printf("\nThere are the first and last numbers are equal: %d," +
                        " and the max is %d, min is %d\n", a, max, min);
                break;
            case (3):
                System.out.printf("\nThere are the first and second numbers are equal: %d" +
                        " and the max is %d, min is %d\n", b, max, min);
                break;
            case (4):
                System.out.printf("\nThere are the second and last numbers are equal: %d" +
                        " and the max is %d, min is %d\n", b, max, min);
                break;
        }

        System.out.println("The end");
    }
}
