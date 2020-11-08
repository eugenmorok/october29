import java.util.Scanner;

public class SameSurname_shortVariant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first-man first name: ");
        String fn1 = sc.nextLine();

        int fn1Len = fn1.length();

        System.out.print("Enter first-man last name: ");
        String ln1 = sc.nextLine();

        int ln1Len = ln1.length();

        System.out.print("Enter second-man first name: ");
        String fn2 = sc.nextLine();

        int fn2Len = fn2.length();

        System.out.print("Enter second-man last name: ");
        String ln2 = sc.nextLine();

        int ln2Len = ln2.length();


        boolean areFNames = false;
        boolean areLNames = false;

        // block of the first names


        if (fn1Len == fn2Len) {

            switch (fn1Len) {
                case 15:
                    if (fn1.charAt(14) != fn2.charAt(14)) break;
                case 14:
                    if (fn1.charAt(13) != fn2.charAt(13)) break;
                case 13:
                    if (fn1.charAt(12) != fn2.charAt(12)) break;
                case 12:
                    if (fn1.charAt(11) != fn2.charAt(11)) break;
                case 11:
                    if (fn1.charAt(10) != fn2.charAt(10)) break;
                case 10:
                    if (fn1.charAt(9) != fn2.charAt(9)) break;
                case 9:
                    if (fn1.charAt(8) != fn2.charAt(8)) break;
                case 8:
                    if (fn1.charAt(7) != fn2.charAt(7)) break;
                case 7:
                    if (fn1.charAt(6) != fn2.charAt(6)) break;
                case 6:
                    if (fn1.charAt(5) != fn2.charAt(5)) break;
                case 5:
                    if (fn1.charAt(4) != fn2.charAt(4)) break;
                case 4:
                    if (fn1.charAt(3) != fn2.charAt(3)) break;
                case 3:
                    if (fn1.charAt(2) != fn2.charAt(2)) break;
                case 2:
                    if (fn1.charAt(1) != fn2.charAt(1)) break;
                case 1: {
                    if (fn1.charAt(0) == fn2.charAt(0)) {
                        areFNames = true;
                        break;
                    }
                }
                default:
                    System.out.println("Is not correct");
            }
        }


        //block of last names


        if (ln1Len == ln2Len) {

            switch (ln1Len) {
                case 15:
                    if (ln1.charAt(14) != ln2.charAt(14)) break;
                case 14:
                    if (ln1.charAt(13) != ln2.charAt(13)) break;
                case 13:
                    if (ln1.charAt(12) != ln2.charAt(12)) break;
                case 12:
                    if (ln1.charAt(11) != ln2.charAt(11)) break;
                case 11:
                    if (ln1.charAt(10) != ln2.charAt(10)) break;
                case 10:
                    if (ln1.charAt(9) != ln2.charAt(9)) break;
                case 9:
                    if (ln1.charAt(8) != ln2.charAt(8)) break;
                case 8:
                    if (ln1.charAt(7) != ln2.charAt(7)) break;
                case 7:
                    if (ln1.charAt(6) != ln2.charAt(6)) break;
                case 6:
                    if (ln1.charAt(5) != ln2.charAt(5)) break;
                case 5:
                    if (ln1.charAt(4) != ln2.charAt(4)) break;
                case 4:
                    if (ln1.charAt(3) != ln2.charAt(3)) break;
                case 3:
                    if (ln1.charAt(2) != ln2.charAt(2)) break;
                case 2:
                    if (ln1.charAt(1) != ln2.charAt(1)) break;
                case 1:
                    if (ln1.charAt(0) == ln2.charAt(0)) {
                        areLNames = true;
                        break;
                    }
                default:
                    System.out.println("Is not correct");
            }
        }


        //code processing

        if (areFNames && areLNames) {
            System.out.println("The firs names and the last names are equal");

        } else if (areFNames && !areLNames) {
            System.out.println("There are only firs names are equal");

        } else if (!areFNames && areLNames) {
            System.out.println("There are only last names are equal");
        } else System.out.println("Is not correct");


        System.out.println("The end of the program");


    }
}
