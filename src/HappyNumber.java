import java.util.Scanner;

public class HappyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you have the happy number? (enter 100000...999999): ");
        int num = sc.nextInt();
        if (
                (num % 1000000 / 100000 +
                        num % 100000 / 10000 +
                        num % 10000 / 1000) ==
                        (num % 1000 / 100 +
                                num % 100 / 10 +
                                num % 10 / 1)
        ) {
            System.out.println("There is the happy number");
        } else {
            System.out.println("There is not happy number");
        }
        System.out.println("The end");
    }

}
