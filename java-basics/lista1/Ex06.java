/*
Sabe-se que uma lata de tinta tem um custo C e é capaz de pintar uma área de M metros quadrados. Faça um programa que leia a largura L, a altura A de uma parede, o valor C de uma lata de tinta e o rendimento M desta lata. Após isso, imprima quantas latas de tintas são necessárias e o custo total (com duas casas decimais). Assuma que não é possível comprar lata de tinta fracionada.
*/

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
