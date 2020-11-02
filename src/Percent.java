import java.util.Scanner;
/*
Вводится стоимость покупки. Рассчитать стоимость покупки с учётом скидки. Если первоначальная стоимость:
больше 1000, скидка 5%,
больше 3000, скидка 7%,
больше 5000, скидка 10%,
больше 10 000, скидка 15%.
 */
public class Percent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the purchase price");
        int buy = sc.nextInt();

        if (buy > 1000 & buy < 3001) buy *= 0.95;
        else if (buy > 3000 & buy < 5001) buy *= 0.93;
        else if (buy > 5000 & buy < 10001) buy *= 0.9;
        else if (buy > 10000) buy *= 0.85;

        System.out.println("Your total cost is: " + buy);


    }
}
