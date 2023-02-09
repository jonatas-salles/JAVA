/*
Uma livraria está fazendo uma promoção para pagamento a vista. O comprador pode escolher entre dois planos de pagamento:

Critério A: R$ 0,25 por livro + R$ 7,50 fixo
Critério B: R$ 0,50 por livro + R$ 2,50 fixo
Faça um programa em que o usuário informe a quantidade positiva e não nula de livros seja impresso qual o melhor plano de pagamento.

Exemplo 1: Entrada = 100 | Saída = Criterio A
Exemplo 2: Entrada = 5 | Saída = Criterio B
Exemplo 3: Entrada = 20 | Saída = Indiferente
Exemplo 4: Entrada = -5 | Saída = Erro
Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
*/

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int i = Integer.parseInt(scanner.nextLine());

        double criterioA = 0.25 * i + 7.5;
        double criterioB = 0.5 * i + 2.5;

        if (i > 0) {
            if (criterioA == criterioB)
                System.out.println("Indiferente");

            else if (criterioA < criterioB)
                System.out.println("Criterio A");

            else
                System.out.println("Criterio B");
        } else
            System.out.println("Erro");

    }

}
