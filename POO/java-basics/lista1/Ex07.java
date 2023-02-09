/*
Um motorista de Uber estipula o preço de uma determinada viagem dada a quantidade de quilômetros percorrida. Para viagens de até X km, é cobrado um valor R$ V1 por km. Acima de X km, é cobrado o valor R$ V2. Faça um programa que leia X, V1, V2 e a quantidade de quilômetros A da viagem e imprima o valor total com duas casas decimais.
*/

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double v1 = Double.parseDouble(scanner.nextLine());
        double v2 = Double.parseDouble(scanner.nextLine());
        double race = Double.parseDouble(scanner.nextLine());

        double total;

        if (race > x) {
            total = race * v2;
        } else
            total = race * v1;

        System.out.printf(java.util.Locale.US, "%.2f", total);
    }
}
