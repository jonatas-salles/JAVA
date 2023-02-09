import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        String[] list = input.split(" ");
        String str = "";

        for(String word:list) {
            str += word;
        }

        String invertedString = "";

        for(int i = str.length() - 1; i >= 0; i--) {
                invertedString += str.charAt(i);
            }

        if(str.equals(invertedString)) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
    }
}
