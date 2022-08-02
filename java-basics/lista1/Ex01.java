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
