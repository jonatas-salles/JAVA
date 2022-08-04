/*
A avenida principal da cidade de Algoritmopolis possui limite de velocidade de L km/h. Se o motorista ultrapassar essa velocidade, é aplicado uma multa de R$ M, mais R$ A por cada km acima do limite. Faça um programa que leia o limite L, o valor da multa M, o valor adicional A e a velocidade V captada pelo radar e informe o valor total da multa. Considere L e V sempre como números inteiros. Apresente a resposta com duas casas decimais.
*/

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
