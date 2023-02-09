/*
Sejam a, b e c os três lados de um triângulo. Elabore um algoritmo que verifica se o triângulo é:

Escaleno (todos os lados diferentes)
Isósceles (possui dois lados iguais)
Equilátero (todos os lados iguais)
Não forma triângulo (a soma de dois lados deve ser maior que o terceiro lado)
Os três números devem ser inteiros positivos e lidos na mesma linha (Ex: 3 4 5) Exemplos de entrada e saída esperada:

Exemplo 1: Entrada = 2 3 2 | Saída = Isosceles
Exemplo 2: Entrada = 2 2 2 | Saída = Equilatero
Exemplo 3: Entrada = 1 2 4 | Saída = Nao forma triangulo
Exemplo 4: Entrada = -1 2 4 | Saída = Erro
Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
*/

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int side1 = Integer.parseInt(scanner.next());
        final int side2 = Integer.parseInt(scanner.next());
        final int side3 = Integer.parseInt(scanner.next());

        if (side1 > 0 && side2 > 0 && side3 > 0){

            if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2){
                if (side1 != side2 && side2 != side3 && side3 != side1)
                    System.out.println("Escaleno");
                else if (side1 == side2 && side2 == side3)
                    System.out.println("Equilatero");
                else
                    System.out.println("Isosceles");
            } else {
                System.out.println("Nao forma triangulo");
            }
        } else
            System.out.println("Erro");

    }
}
