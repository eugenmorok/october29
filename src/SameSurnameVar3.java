import java.util.Scanner;

public class SameSurnameVar3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first-man first name: ");
        String fn1 = sc.nextLine();
        int fn1Len = fn1.length();
        System.out.print("Enter first-man last name: ");
        String ln1 = sc.nextLine();
        int ln1Len = fn1.length();
        System.out.print("Enter second-man first name: ");
        String fn2 = sc.nextLine();
        int fn2Len = fn1.length();
        System.out.print("Enter second-man last name: ");
        String ln2 = sc.nextLine();
        int ln2Len = fn1.length();

        System.out.print("There are ");

        short jNames = 1;

        if (fn1.charAt(0) == fn2.charAt(0) & fn1Len != 1) {
            jNames++;

            if ((int)fn1.charAt(1) == (int)fn2.charAt(1) & fn1Len != 2) {
                jNames++;

                if (fn1.charAt(2) == fn2.charAt(2) & fn1Len != 3) {
                    jNames++;

                    if (fn1.charAt(3) == fn2.charAt(3) & fn1Len != 4) {
                        jNames++;

                        if (fn1.charAt(4) == fn2.charAt(4) & fn1Len != 5) {
                            jNames++;

                            if (fn1.charAt(5) == fn2.charAt(5) & fn1Len != 6) {
                                jNames++;

                                if (fn1.charAt(6) == fn2.charAt(6) & fn1Len != 7) {
                                    jNames++;

                                    if (fn1.charAt(7) == fn2.charAt(7) & fn1Len != 8) {
                                        jNames++;

                                        if (fn1.charAt(8) == fn2.charAt(8) & fn1Len != 9) {
                                            jNames++;

                                            if (fn1.charAt(9) == fn2.charAt(9) & fn1Len != 10) {
                                                jNames++;

                                                if (fn1.charAt(10) == fn2.charAt(10) & fn1Len != 11) {
                                                    jNames++;

                                                    if (fn1.charAt(11) == fn2.charAt(11) & fn1Len != 12) {
                                                        jNames++;

                                                        if (fn1.charAt(12) == fn2.charAt(12) & fn1Len != 13) {
                                                            jNames++;

                                                            if (fn1.charAt(13) == fn2.charAt(13) & fn1Len != 14) {
                                                                jNames++;

                                                                if (fn1.charAt(14) == fn2.charAt(14) & fn1Len != 15) {
                                                                    jNames++;

                                                                    if (fn1.charAt(15) == fn2.charAt(15) & fn1Len != 16) {
                                                                        jNames++;

                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }else {
                jNames = 1; //  different names length
            }

        } else {
            jNames = 1; //  different names length
        }


        if (ln1.charAt(0) == ln2.charAt(0) & ln1Len != 1) {


            if (ln1.charAt(1) == ln2.charAt(1) & ln1Len != 2) {

                if (ln1.charAt(2) == ln2.charAt(2) & ln1Len != 3) {

                    if (ln1.charAt(3) == ln2.charAt(3) & ln1Len != 4) {

                        if (ln1.charAt(4) == ln2.charAt(4) & ln1Len != 5) {

                            if (ln1.charAt(5) == ln2.charAt(5) & ln1Len != 6) {

                                if (ln1.charAt(6) == ln2.charAt(6) & ln1Len != 7) {

                                    if (ln1.charAt(7) == ln2.charAt(7) & ln1Len != 8) {

                                        if (ln1.charAt(8) == ln2.charAt(8) & ln1Len != 9) {

                                            if (ln1.charAt(9) == ln2.charAt(9) & ln1Len != 10) {

                                                if (ln1.charAt(10) == ln2.charAt(10) & ln1Len != 11) {

                                                    if (ln1.charAt(11) == ln2.charAt(11) & ln1Len != 12) {

                                                        if (ln1.charAt(12) == ln2.charAt(12) & ln1Len != 13) {

                                                            if (ln1.charAt(13) == ln2.charAt(13) & ln1Len != 14) {

                                                                if (ln1.charAt(14) == ln2.charAt(14) & ln1Len != 15) {

                                                                    if (ln1.charAt(15) == ln2.charAt(15) & ln1Len != 16) {

                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        } else {
            int d ; //  different lasts  length
        }


        System.out.println(jNames);
        System.out.println("The end of the program");


    }
}
