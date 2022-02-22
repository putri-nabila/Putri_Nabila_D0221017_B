import java.util.Scanner;

public class day4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        double y = scan.nextDouble();
        scan.nextLine();
        String z = scan.nextLine();

        System.out.println("String: " + z);
        System.out.println("Double: " + y);
        System.out.println("Int: " + x);
    }
}
