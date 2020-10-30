import java.util.Scanner;
/*
Пользователь вводит два целых числа. Вывести ближайшее к
первому числу число, делящееся на второе число без остатка.
 */
public class NearDivided {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first int number: ");
        int a = sc.nextInt();
        System.out.print("Enter second int number: ");
        int b = sc.nextInt();
        if (b == 0) System.out.println("Error, divided by zero");
        else {
            int c = a / b * b;
            System.out.println(c);
        }

        System.out.println("The end");
    }

}
