import java.util.Scanner;

public class Divisibility {

    public static void main(String[] args) {
        int s1 = 2, s2 = 3, s3 = 5, s4 = 7, s5 = 11;

        System.out.print("Enter your number here: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (
                (number % s1 == 0) |
                (number % s2 == 0) |
                (number % s3 == 0) |
                (number % s4 == 0) |
                (number % s5 == 0)
        ) {
            if (number % s1 == 0)
                System.out.print("\nThe number is divisible by " + s1);
            if (number % s2 == 0)
                System.out.print("\nThe number is divisible by " + s2);
            if (number % s3 == 0)
                System.out.print("\nThe number is divisible by " + s3);
            if (number % s4 == 0)
                System.out.print("\nThe number is divisible by " + s4);
            if (number % s5 == 0)
                System.out.print("\nThe number is divisible by " + s5);
        } else System.out.println("The number is not divisible by the first five simple numbers");

        System.out.println("\n\nThe end of the program");
    }

}
