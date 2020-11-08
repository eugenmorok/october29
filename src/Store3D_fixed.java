import java.util.Scanner;

public class Store3D_fixed {
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


        int volume1 = (a / x) * (b / y) * (c / h);
        int volume2 = (a / y) * (b / x) * (c / h);
        int volume3 = (a / x) * (b / h) * (c / x);
        int volume4 = (a / x) * (b / h) * (c / y);
        int volume5 = (a / x) * (b / x) * (c / y);
        int volume6 = (a / h) * (b / y) * (c / x);

        int way = 1;
        int volume = volume1;

        if (volume2 > volume) {
            volume = volume2;
            way = 2;
        }
        if (volume3 > volume) {
            volume = volume3;
            way = 3;
        }
        if (volume4 > volume) {
            volume = volume4;
            way = 4;
        }
        if (volume5 > volume) {
            volume = volume5;
            way = 5;
        }
        if (volume6 > volume) {
            volume = volume6;
            way = 6;
        }

        System.out.print("the best way is: ");

        switch (way) {
            case 1:
                System.out.println("store a to box x and store b to box y and store c to box h");
                break;
            case 2:
                System.out.println("store a to box y and store b to box x and store c to box h");
                break;
            case 3:
                System.out.println("store a to box y and store b to box h and store c to box x");
                break;
            case 4:
                System.out.println("store a to box x and store b to box h and store c to box y");
                break;
            case 5:
                System.out.println("store a to box h and store b to box x and store c to box y");
                break;
            case 6:
                System.out.println("store a to box h and store b to box y and store c to box x");
                break;
        }


        System.out.println("the store capacity is " + volume + " boxes");
        System.out.println("the end");


    }
}
