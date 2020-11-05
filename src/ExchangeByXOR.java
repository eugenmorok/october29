import java.util.Scanner;

public class ExchangeByXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number to change: ");
        int a = sc.nextInt();
        System.out.print("Enter second number to change: ");
        int b = sc.nextInt();
        System.out.printf("first values: a = %d, b = %d\n", a, b);
        a = a ^ b;
        System.out.printf("second values: a = %d, b = %d\n", a, b);
        b = a ^ b;
        System.out.printf("second values: a = %d, b = %d\n", a, b);
        a = a ^ b;
        System.out.printf("last values: a = %d, b = %d\n", a, b);
        System.out.println("The end of the program");
    }
}
