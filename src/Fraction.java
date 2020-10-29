import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int numerator = sc.nextInt();
        System.out.print("Enter the denominator: ");
        int denominator = sc.nextInt();
        if (denominator == 0) System.out.println("The fraction cannot be calculated");
        else if (numerator > denominator)
            System.out.printf("It is improper fraction, the whole part is %d", numerator / denominator);
        else System.out.println("The fraction is normal");
        System.out.println("\nThe ends");
    }
}
