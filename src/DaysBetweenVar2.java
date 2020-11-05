import java.util.Scanner;

public class DaysBetweenVar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first month number here: ");
        int month = sc.nextInt();
        System.out.println("Enter a first day number here: ");
        int day = sc.nextInt();

        System.out.println("Enter a last month number here: ");
        int month1 = sc.nextInt();
        System.out.println("Enter a last day number here: ");
        int day1 = sc.nextInt();

        int m01 = 31;
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

        if (month > month1) {
            month = month ^ month1;
            month1 = month ^ month1;
            month = month ^ month1;

            day = day ^ day1;
            day1 = day ^ day1;
            day = day ^ day1;
        }

        if (month == month1 && day1 < day) {
            day = day ^ day1;
            day1 = day ^ day1;
            day = day ^ day1;
        }

        int days = 0;
        int days1 = 0;

        if (month == 1) {
            days = day;
        } else if (month == 2) {
            days = day + m01;
        } else if (month == 3) {
            days = day + m01 + m02;
        } else if (month == 4) {
            days = day + m01 + m02 + m03;
        } else if (month == 5) {
            days = day + m01 + m02 + m03 + m04;
        } else if (month == 6) {
            days = day + m01 + m02 + m03 + m04 + m05;
        } else if (month == 7) {
            days = day + m01 + m02 + m03 + m04 + m05 + m06;
        } else if (month == 8) {
            days = day + m01 + m02 + m03 + m04 + m05 + m06 + m07;
        } else if (month == 9) {
            days = day + m01 + m02 + m03 + m04 + m05 + m06 + m07 + m08;
        } else if (month == 10) {
            days = day + m01 + m02 + m03 + m04 + m05 + m06 + m07 + m08 + m09;
        } else if (month == 11) {
            days = day + m01 + m02 + m03 + m04 + m05 + m06 + m07 + m08 + m09 + m10;
        } else if (month == 12) {
            days = day + m01 + m02 + m03 + m04 + m05 + m06 + m07 + m08 + m09 + m10 + m11;
        }


        if (month1 == 1) {
            days1 = m02 + m03 + m04 + m05 + m06 + m07 + m08 + m09 + m10 + m11 + m12 + (m01 - day1);
        } else if (month1 == 2) {
            days1 = m03 + m04 + m05 + m06 + m07 + m08 + m09 + m10 + m11 + m12 + (m02 - day1);
        } else if (month1 == 3) {
            days1 = m04 + m05 + m06 + m07 + m08 + m09 + m10 + m11 + m12 + (m03 - day1);
        } else if (month1 == 4) {
            days1 = m05 + m06 + m07 + m08 + m09 + m10 + m11 + m12 + (m04 - day1);
        } else if (month1 == 5) {
            days1 = m06 + m07 + m08 + m09 + m10 + m11 + m12 + (m05 - day1);
        } else if (month1 == 6) {
            days1 = m07 + m08 + m09 + m10 + m11 + m12 + (m06 - day1);
        } else if (month1 == 7) {
            days1 = m08 + m09 + m10 + m11 + m12 + (m07 - day1);
        } else if (month1 == 8) {
            days1 = m09 + m10 + m11 + m12 + (m08 - day1);
        } else if (month1 == 9) {
            days1 = m10 + m11 + m12 + (m09 - day1);
        } else if (month1 == 10) {
            days1 = m11 + m12 + (m10 - day1);
        } else if (month1 == 11) {
            days1 = m12 + (m11 - day1);
        } else if (month1 == 12) {
            days1 = m12 - day1;
        }

        int days2 = 365 - days - days1;

        System.out.println(days2);

    }
}
