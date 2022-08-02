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
