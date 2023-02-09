import java.util.Scanner;

public class AlphabeticalSubstrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int inputLen = Integer.parseInt(scanner.nextLine());

        if (inputLen > 0 && input.length() >= inputLen) {
            String lower = input.substring(0, inputLen);
            String higher = input.substring(0, inputLen);

            for (int i = 0; i < input.length(); i++) {
                if (i + inputLen > input.length()) {
                    break;
                }
                String word = input.substring(i, i + inputLen);
                int resultLower = word.compareTo(lower);
                int resultHigher = word.compareTo(higher);

                if (resultLower < 0) {
                    lower = word;
                }
                if (resultHigher > 0) {
                    higher = word;
                }
            }

            System.out.println(lower + " " + higher);
        } else {
            System.out.println("");
        }

    }
}
