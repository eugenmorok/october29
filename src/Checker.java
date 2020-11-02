import java.util.Scanner;

/*
Пользователь вводит два числа и знак операции: + - * / %, сам вводит ответ.
Программа должна выдать сообщение о верности решения. Если неверно, указать верное решение
 */

public class Checker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.println("enter first number");
        int x = sc.nextInt();
        System.out.println("enter operator");
        String oper = str.nextLine();
        char op = oper.charAt(0);
        int o = (int) op;
        System.out.println("enter second number");
        int y = sc.nextInt();
        System.out.println("enter your answer");
        int answer = sc.nextInt();

        int result = 0;

        switch (o) {
            case (43):
                result = x + y;
                break;
            case (45):
                result = x - y;
                break;
            case (42):
                result = x * y;
                break;
            case (47):
                result = x / y;
                break;
            case (37):
                result = x % y;
                break;
        }

        if (answer == result) System.out.println("Your answer is correct");
        else System.out.println("Your answer is not correct, the correct is: " + result);
        System.out.println("The end");


    }
}
