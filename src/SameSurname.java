import java.lang.reflect.Array;
import java.util.Scanner;

public class SameSurname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first-man first name: ");
        String fn1 = sc.nextLine();
        System.out.print("Enter first-man last name: ");
        String ln1 = sc.nextLine();
        System.out.print("Enter second-man first name: ");
        String fn2 = sc.nextLine();
        System.out.print("Enter second-man last name: ");
        String ln2 = sc.nextLine();

        System.out.print("There are ");

        if (fn1.equals(fn2) & !(ln1.equals(ln2))) System.out.println("the same first names");
        if (!fn1.equals(fn2) & ln1.equals(ln2)) System.out.println("the same last names");
        if (!fn1.equals(fn2) & !ln1.equals(ln2)) System.out.println("don't match at all");
        if (fn1.equals(fn2) & ln1.equals(ln2)) System.out.println("complete match");

        System.out.println("The end of the program");








/*
        String empty = "";
        for (int i = 0; i < fn1.length(); i++) {
            char str = fn1.charAt(i);
            System.out.println(str);
            System.out.println((int)str + "");
            empty = empty.concat((int)str + "");
            System.out.println(empty);
        }
*/

/*
        char[] Array = fn1.toCharArray();
        System.out.println(Array.hashCode());

        System.out.println(fn1.hashCode()-fn2.hashCode());
*/

    }
}
