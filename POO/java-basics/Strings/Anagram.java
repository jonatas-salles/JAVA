import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine().toLowerCase();
        String string2 = scanner.nextLine().toLowerCase();

        String[] list1 = string1.split("");
        String[] list2 = string2.split("");
        Arrays.sort(list1);
        Arrays.sort(list2);

        for(String s:list1) {
            string1 = "";
            string1 += s;
        }
        for(String s:list2) {
            string2 = "";
            string2 += s;
        }

        if(string1.equals(string2)) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }

    }
}
