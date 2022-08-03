import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double efficiency = Double.parseDouble(scanner.nextLine());

        double area = width * height;
        int tin = (int) Math.ceil(area / efficiency);
        double total = tin * price;

        System.out.println(tin);
        System.out.printf(java.util.Locale.US,"%.2f", total);

    }
}
