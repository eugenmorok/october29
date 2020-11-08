import java.util.Scanner;

public class Store2D_fixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("to calculate store capacity enter values");
        System.out.print("store width: ");
        int a = sc.nextInt();

        System.out.print("store length: ");
        int b = sc.nextInt();

        System.out.print("box width: ");
        int x = sc.nextInt();

        System.out.print("box length: ");
        int y = sc.nextInt();

        int volume1 = (a / x) * (b / y);
        int volume2 = (a / y) * (b / x);

        int way = 1;
        int volume = volume1;

        if (volume2 > volume) {
            volume = volume2;
            way = 2;
        }

        System.out.print("the best way is: ");

        switch (way) {
            case 1:
                System.out.println("store a to box x and store b to box y");
                break;
            case 2:
                System.out.println("store a to box y and store b to box x");
                break;
        }

        System.out.println("the store capacity is " + volume + " boxes");
        System.out.println("the end");
    }
}
