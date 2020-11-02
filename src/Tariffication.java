import java.util.Scanner;

/*
Вводится длительность разговора в секундах и его тип (местный, городской, роуминг). Рассчитать его стоимость, если:
менее 3 секунд, тариф равен 0;
менее 60 секунд и звонок местный, тариф равен 3 рубля в минуту, тарификация посекундная;
более 60 секунд и звонок местный, тариф равен 30 копеек за минуту, тарификация посекундная;
звонок городской, тариф равен 4 рубля в минуту, тарификация поминутная;
роуминг, тариф равен 20 рублей в минуту, тарификация поминутная, плюс плата за соединение 10 рублей.
 */
public class Tariffication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the call(s): ");
        double call = sc.nextInt();

        int callMinutes = 0;

        if (call % 60 != 0) {
            callMinutes = (int) call / 60 + 1;
        } else {
            callMinutes = (int) call / 60;
        }

        double tax1 = 0.0;
        double tax2 = 5.0; //sec
        double tax3 = 0.5; //sec
        int tax4 = 4; //min
        int tax5 = 20; //min + 10

        System.out.print("Enter the type of the call(1: local, 2: city-call, 3: roaming): ");
        int type = sc.nextInt();

        if (call < 3 & type != 3) {
            System.out.println("The cost of call is: 0.\nThe end.");

        } else if (type == 1 & call <= 60) {
            double cost = call * tax2;
            int costR = (int) (cost) / 100;
            int costK = (int) (cost) % 100;
            System.out.println("The cost of call is: " + costR + " рубля " + costK + " копеек.\nThe end.");

        } else if (type == 1 & call > 60) {
            double cost = call * tax3;
            int costR = (int) (cost) / 100;
            int costK = (int) (cost) % 100;
            System.out.println("The cost of call is: " + costR + " рубля " + costK + " копеек.\nThe end.");

        } else if (type == 2) {
            int cost = callMinutes * tax4;
            System.out.println("The cost of call is: " + cost + " рубля.\nThe end.");

        } else if (type == 3 & call >= 3) {
            int costR = callMinutes * tax5 + 10;
            System.out.println("The cost of call is: " + costR + " рубля.\nThe end.");

        } else if (type == 3 & call < 3) {
            System.out.println("The cost of call is: 10 рубля.\nThe end.");

        } else System.out.println("No tariff");


    }
}
