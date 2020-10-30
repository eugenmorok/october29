import java.util.Scanner;

public class LetterInLatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User enter character: ");
        String str = sc.nextLine();
        char st = str.charAt(0);
        //System.out.println((int)s);
        int s = (int)st;
        if ((s > 64 & s < 91) | (s > 96 & s < 123)) System.out.println("The " +
                "character is a letter of the Latin alphabet");
        else System.out.println("The character is NOT a letter of the Latin alphabet\nThe end");
    }
}
