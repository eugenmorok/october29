import java.util.Scanner;

public class Store3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("to calculate store capacity enter values");
        System.out.print("store width: ");
        int a = sc.nextInt();
        System.out.print("store length: ");
        int b = sc.nextInt();
        System.out.print("store height: ");
        int c = sc.nextInt();
        System.out.print("box width: ");
        int x = sc.nextInt();
        System.out.print("box length: ");
        int y = sc.nextInt();
        System.out.print("box height: ");
        int h = sc.nextInt();
        int volume = (a / x) * (b / y) * (c / h);
        System.out.println("the store capacity is " + volume + " boxes");
        System.out.println("the end");
    }
}
