import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int velocityLimit = Integer.parseInt(scanner.nextLine());
        double trafficTicket = Double.parseDouble(scanner.nextLine());
        double additional = Double.parseDouble(scanner.nextLine());
        int velocityCaught = Integer.parseInt(scanner.nextLine());

        if (velocityCaught > velocityLimit) {
            int additionalVelocity = velocityCaught - velocityLimit;
            double total = trafficTicket + (additional * additionalVelocity);
            System.out.printf(java.util.Locale.US,"%.2f", total);
        } else
            System.out.printf(java.util.Locale.US, "%.2f", 0.00);

    }
}
