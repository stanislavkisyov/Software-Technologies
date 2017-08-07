import java.util.Scanner;

public class E03Reverse_Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] letters = new char[3];

        for (int i = 0; i < 3; i++) {
            letters[i] = scanner.nextLine().charAt(0);
        }
            for (int j = letters.length - 1; j >= 0; j--) {
                System.out.print(letters[j]);
            }
    }
}
