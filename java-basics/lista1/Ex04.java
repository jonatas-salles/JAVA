import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        if (c > 0 && m > 0 && n / c > 0) {

            int purchase = n / c;
            int canEat = purchase;
            int extra;

            if (purchase >= m) {
                extra = purchase / m;
                canEat += extra;

            }
            System.out.println(canEat);
        } else
            System.out.println(0);
    }
}
