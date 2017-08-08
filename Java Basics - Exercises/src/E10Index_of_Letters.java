import java.util.Arrays;
import java.util.Scanner;

public class E10Index_of_Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toLowerCase().toCharArray();

        char[] letters = new char[26];
        int index = 0;

        for (char i = 'a'; i <= 'z'; i++) {
            letters[index] = i;
            index++;
        }

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                if (input[i] == letters[j]) {
                    System.out.println(input[i] + " -> " + j);
                }
            }
        }


    }
}
