/*
Osmar adora chocolates e vai para a loja com N dinheiro no bolso. O preço de cada chocolate é C. A loja oferece um desconto: para cada M embalagens que ele dá para a loja, ele ganha um chocolate grátis. Quantos chocolates Osmar consegue comer? Por exemplo:

Para N=10, C=2, M=5, ele pode comprar 5 chocolates por $10 e trocar as 5 embalagens por mais 1 chocolate, fazendo com que o número total de chocolates que ele pode comer seja 6.
Faça um programa que leia inteiros N, C e M e imprima a quantidade de chocolates que Osmar pode comer. C e M são inteiros positivos.
*/

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
