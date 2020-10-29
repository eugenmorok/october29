import java.util.Scanner;

public class Palyndrom4digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter four digits number: ");
        int inNum = sc.nextInt();
        int express1 = inNum / 100;
        int express2 = inNum % 10 * 10 + inNum / 10 % 10;
        if (express1 == express2) System.out.println("the number is palindrome");
        else System.out.println("the number not a palindrome");
        System.out.println("the end");
    }

}
