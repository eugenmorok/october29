import java.util.Scanner;

public class DigitsOfSeries {
    /*
    Вводится число k от 1 до 2700. Определить k-ую цифру в последовательности,
    состоящей из подряд идущих трёхзначных чисел 100101102103…998999.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the k-number (1...2700): ");
        int k = sc.nextInt();

        int number = (k - 1) / 3 + 100;

        switch (k % 3) {
            case (0):
                System.out.println(number % 10);
                break;

            case (1):
                System.out.println(number / 100);
                break;

            case (2):
                System.out.println(number / 10 % 10);
                break;

            default:
                System.out.println("Some error is here");
        }
        System.out.println("The end of the program");

    }
}
