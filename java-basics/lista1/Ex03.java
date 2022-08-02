import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int year = Integer.parseInt(scanner.nextLine());

        if (year > 0) {
            if (year % 400 == 0) {
                System.out.println("Ano bissexto");
            }
            else if (year % 4 == 0 && year % 100 != 0) {
                System.out.println("Ano bissexto");
            }
            else {
                System.out.println("Ano nao bissexto");
            }
        } else
            System.out.println("Erro");
    }
}
