import java.util.Scanner;

/*
Пользователь вводит час суток (число от 1 до 24). Вывести словом (строкой) время суток
(morning, noon, afternoon, evening, tonight, midnight, night).
 */
public class TimeOfDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number of hour here (1...24): ");
        int numOfHour = sc.nextInt();
        System.out.print("There is ");
        if (numOfHour > 0 && numOfHour < 5) System.out.print("night");
        else if (numOfHour > 4 && numOfHour < 12) System.out.print("morning");
        else if (numOfHour == 12) System.out.print("noon");
        else if (numOfHour > 12 && numOfHour < 18) System.out.print("afternoon");
        else if (numOfHour > 17 && numOfHour < 23) System.out.print("evening");
        else if (numOfHour == 23) System.out.print("tonight");
        else if (numOfHour == 24) System.out.print("midnight");
        else System.out.print("incorrect number");
        System.out.println("\nThe end");
    }
}
