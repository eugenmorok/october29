import java.util.Scanner;

public class Bricket {
    /*
    Выяснить, пройдёт ли кирпич со сторонами a, b и c в прямоугольное отверстие со сторонами x и y.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the brick width:");
        int a = sc.nextInt();
        System.out.println("enter the brick length:");
        int b = sc.nextInt();
        System.out.println("enter the brick height:");
        int c = sc.nextInt();
        System.out.println("enter the hole width:");
        int x = sc.nextInt();
        System.out.println("enter the hole height:");
        int y = sc.nextInt();

        if (
                ((a <= x) & (b <= y)) | ((a <= x) & (c <= y)) | ((b <= x) & (c <= y)) |
                        ((a <= y) & (b <= x)) | ((a <= y) & (c <= x)) | ((b <= y) & (c <= x))
        ) System.out.println("brick will to pass through the hole");
        else System.out.println("brick will not to pass through the hole");

        System.out.println("The end");


    }

}
