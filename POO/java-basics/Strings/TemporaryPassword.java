import java.util.Scanner;

public class TemporaryPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        String password = "";

        if(input.length() > 1) {
            for (int i = 1; i < input.length(); i++) {
                if (i == 1) {
                    password += input.substring(0, i);
                } else {
                    password += "*" + input.substring(0, i);
                }
            }

            for (int i = input.length() - 1; i > 0; i--) {
                password += "*" + input.substring(0, i);
            }

            System.out.println(password);

        } else {
            System.out.println("Invalido");
        }
    }
}
