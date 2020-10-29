import java.util.Scanner;

/*
Вводится четырёхзначное число. Вывести результат его округления по правилам
арифметики до десятков, сотен и тысяч.
 */
public class Rounding {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter six digits number for rounding: ");
        int num = sc.nextInt();
        int tens = num / 10 * 10;
        int hundreds = num / 100 * 100;
        int thousands = num / 1000 * 1000;

        int ifNeg = num;
        if (ifNeg < 0) ifNeg *= -1;

        if (ifNeg % 10 > 5) tens += 10;
        if (ifNeg % 100 > 5) hundreds += 100;
        if (ifNeg % 1000 > 5) thousands += 1000;

        System.out.printf("Your answers here:\n" +
                "for tens is %d\n" +
                "for hundreds is %d\n" +
                "for thousands is %d\n" +
                "The end", tens, hundreds, thousands);

    }

}
