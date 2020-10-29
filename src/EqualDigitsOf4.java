import java.util.Scanner;

public class EqualDigitsOf4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter three digits number: ");
        int inNum = sc.nextInt();
        int u1 = inNum % 10000 / 1000;
        int u2 = inNum % 1000 / 100;
        int u3 = inNum % 100 / 10;
        int u4 = inNum % 10 / 1; //this view for me

        //System.out.println("--------------------\n" + u1 + "," + u2 + "," + u3 + "," + u4);


        if (u1 == u2 | u1 == u3 | u1 == u4 | u2 == u3 | u2 == u4 | u3 == u4) System.out.println("" +
                "our number has the equal digits");
        else System.out.println("our number has't the equal digits");
        System.out.println("the end");
    }

}
