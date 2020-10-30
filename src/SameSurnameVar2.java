import java.util.Scanner;

public class SameSurnameVar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first-man first name: ");
        int fn1 = sc.nextLine().hashCode();
        System.out.print("Enter first-man last name: ");
        int ln1 = sc.nextLine().hashCode();
        System.out.print("Enter second-man first name: ");
        int fn2 = sc.nextLine().hashCode();
        System.out.print("Enter second-man last name: ");
        int ln2 = sc.nextLine().hashCode();

        System.out.print("There are ");

        if (fn1 == fn2 & ln1 != ln2) System.out.println("the same first names");
        if (fn1 != fn2 & ln1 == ln2) System.out.println("the same last names");
        if (fn1 != fn2 & ln1 != ln2) System.out.println("don't match at all");
        if (fn1 == fn2 & ln1 == ln2) System.out.println("complete match");

        System.out.println("The end of the program");

    }
}
