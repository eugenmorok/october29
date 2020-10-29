import java.util.Scanner;

public class EqualDigitsOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter three digits number: ");
        int inNum = sc.nextInt();
        int u1 = inNum / 100;
        int u2 = inNum % 100 / 10;
        int u3 = inNum % 10;

        if (u1 == u2 | u1 == u3 | u2 == u3) System.out.println("our number has the equal digits");
        else System.out.println(("our number has't the equal digits"));
        System.out.println("the end");
    }
}