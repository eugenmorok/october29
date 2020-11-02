import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For the equation (ax2 + bx + c = 0) enter your values: ");
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();

        int d = b * b - 4 * a * c;

        if (d > 0) System.out.println("The equation has 2 square root");
        else if (d == 0) System.out.println("The equation has 1 square root");
        else System.out.println("The equation has NOT any square root");
        System.out.println("The end");

    }
}