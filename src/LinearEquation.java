import java.util.Scanner;

public class LinearEquation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For the equation (ax + b = cx + d) enter your values: ");
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();
        System.out.print("d: ");
        int d = sc.nextInt();

        System.out.printf("Your answer is: %d\nThe end",(d - b) / (a - c));
    }

}
