import java.util.Scanner;

public class Palyndrom3digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter three digits number: ");
        int inNum = sc.nextInt();
        if ((inNum/100) == (inNum % 10)) System.out.println("there is the palindrome");
        else System.out.println("there is not a palindrome");
        System.out.println("the end");
    }
}
