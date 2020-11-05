import java.util.Scanner;

/*
Bissextile.java
Пользователь вводит год. Определить, является ли он високосным. Год является високосным, если он делится на 4.
При этом если год делится на 100, то он обычный, кроме тех, которые делятся на 400.
Например, 1700, 1800 – обычные года, 1600 и 2000 – високосные года.
 */
public class Bissextile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("To find a leap year, enter a value right here: ");
        int year = sc.nextInt();

        byte options;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    options = 1;
                } else options = 0;
            } else options = 1;
        } else options = 0;

        if (options == 1) {
            System.out.println(year + " is a leap year.");
        } else System.out.println(year + " is NOT a leap year");
        System.out.println("The end");



    }
}
