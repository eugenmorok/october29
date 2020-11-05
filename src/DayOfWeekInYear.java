import java.util.Scanner;

/*
Bissextile.java
Пользователь вводит день недели для 1 января, високосность года и произвольное число
от 1 до 365 или 366 для високосного года. Определить день недели введённого числа.
 */
public class DayOfWeekInYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is this a leap year? (enter '1' if yes, or '0' if not): ");
        int leap = sc.nextInt();
        System.out.printf("To find the day of the week of a day number (1...%d) enter him right here: ", 365 + leap);
        int number = sc.nextInt();
        System.out.print("Please enter day of week fo 1 January of the year (1...7): ");
        int day = sc.nextInt();

/*      int m01 = 31;
        int m02 = 28;
        int m03 = 31;
        int m04 = 30;
        int m05 = 31;
        int m06 = 30;
        int m07 = 31;
        int m08 = 31;
        int m09 = 30;
        int m10 = 31;
        int m11 = 30;
        int m12 = 31;
*/
        int x = 0;

        if (number % 7 == 0) {
            x = day - 1;
        } else {
            x = number % 7 + day - 1;
        }

        if (x > 7) {
            x -= 7;
        }

        switch (x) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("your number is incorrect");
                System.out.println("the end");
        }


    }
}
