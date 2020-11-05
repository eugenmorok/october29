import java.util.Scanner;

public class DaysBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first month number here: ");
        int month = sc.nextInt();
        System.out.print("Enter a first day number here: ");
        int day = sc.nextInt();

        System.out.print("Enter a last month number here: ");
        int month1 = sc.nextInt();
        System.out.print("Enter a last day number here: ");
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

 /*       if (month > month1) {
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
*/

        int days = 0;
        int days1 = 0;
        int days2 = 0;

        if ((month1 > month) || (month1 == month && day < day1)) {
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
                days1 = day1;
            } else if (month1 == 2) {
                days1 = day1 + m01;
            } else if (month1 == 3) {
                days1 = day1 + m01 + m02;
            } else if (month1 == 4) {
                days1 = day1 + m01 + m02 + m03;
            } else if (month1 == 5) {
                days1 = day1 + m01 + m02 + m03 + m04;
            } else if (month1 == 6) {
                days1 = day1 + m01 + m02 + m03 + m04 + m05;
            } else if (month1 == 7) {
                days1 = day1 + m01 + m02 + m03 + m04 + m05 + m06;
            } else if (month == 8) {
                days1 = day1 + m01 + m02 + m03 + m04 + m05 + m06 + m07;
            } else if (month == 9) {
                days1 = day1 + m01 + m02 + m03 + m04 + m05 + m06 + m07 + m08;
            } else if (month == 10) {
                days1 = day1 + m01 + m02 + m03 + m04 + m05 + m06 + m07 + m08 + m09;
            } else if (month1 == 11) {
                days1 = day1 + m01 + m02 + m03 + m04 + m05 + m06 + m07 + m08 + m09 + m10;
            } else if (month1 == 12) {
                days1 = day1 + m01 + m02 + m03 + m04 + m05 + m06 + m07 + m08 + m09 + m10 + m11;
            }

            days2 = days1 - days;

        } else {
            if (month == 1) {
                days = m02 + m03 + m04 + m05 + m06 + m07 + m08 + m09 + m10 + m11 + m12 + (m01 - day);
            } else if (month == 2) {
                days = m03 + m04 + m05 + m06 + m07 + m08 + m09 + m10 + m11 + m12 + (m02 - day);
            } else if (month == 3) {
                days = m04 + m05 + m06 + m07 + m08 + m09 + m10 + m11 + m12 + (m03 - day);
            } else if (month == 4) {
                days = m05 + m06 + m07 + m08 + m09 + m10 + m11 + m12 + (m04 - day);
            } else if (month == 5) {
                days = m06 + m07 + m08 + m09 + m10 + m11 + m12 + (m05 - day);
            } else if (month == 6) {
                days = m07 + m08 + m09 + m10 + m11 + m12 + (m06 - day);
            } else if (month == 7) {
                days = m08 + m09 + m10 + m11 + m12 + (m07 - day);
            } else if (month == 8) {
                days = m09 + m10 + m11 + m12 + (m08 - day);
            } else if (month == 9) {
                days = m10 + m11 + m12 + (m09 - day);
            } else if (month == 10) {
                days = m11 + m12 + (m10 - day);
            } else if (month == 11) {
                days = m12 + (m11 - day);
            } else if (month == 12) {
                days = m12 - day;
            }

            if (month1 == 1) {
                days1 = day1;
            } else if (month1 == 2) {
                days1 = day1 + m01;
            } else if (month1 == 3) {
                days1 = day1 + m01 + m02;
            } else if (month1 == 4) {
                days1 = day1 + m01 + m02 + m03;
            } else if (month1 == 5) {
                days1 = day1 + m01 + m02 + m03 + m04;
            } else if (month1 == 6) {
                days1 = day1 + m01 + m02 + m03 + m04 + m05;
            } else if (month1 == 7) {
                days1 = day1 + m01 + m02 + m03 + m04 + m05 + m06;
            } else if (month1 == 8) {
                days1 = day1 + m01 + m02 + m03 + m04 + m05 + m06 + m07;
            } else if (month == 9) {
                days1 = day1 + m01 + m02 + m03 + m04 + m05 + m06 + m07 + m08;
            } else if (month1 == 10) {
                days1 = day1 + m01 + m02 + m03 + m04 + m05 + m06 + m07 + m08 + m09;
            } else if (month1 == 11) {
                days1 = day1 + m01 + m02 + m03 + m04 + m05 + m06 + m07 + m08 + m09 + m10;
            } else if (month == 12) {
                days1 = day1 + m01 + m02 + m03 + m04 + m05 + m06 + m07 + m08 + m09 + m10 + m11;
            }


            days2 = days1 + days - 1;
        }


        System.out.println("number of days between specified values is " + days2);

    }
}
