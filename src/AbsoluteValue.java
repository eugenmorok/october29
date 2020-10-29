import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        System.out.print("Please your number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 0) number = -1 * number;
        System.out.println("Your abs number is: " + number);
    }

}
