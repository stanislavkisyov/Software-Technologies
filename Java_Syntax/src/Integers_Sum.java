import java.util.Scanner;

public class Integers_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int num1 = numbers[0];
        int num2 = numbers[1];
        int num3 = numbers[2];

        if (!chekNumbers(num1, num2, num3) &&
                !chekNumbers(num3, num1, num2) &&
                !chekNumbers(num2, num3, num1)) {
            System.out.println("No");

        }
    }

    private static boolean chekNumbers(int num1, int num2, int sum) {
        if (num1 + num2 != sum) {
            return false;
        }

        if (num1 <= num2) {
            System.out.printf("%d + %d = %d%n", num1, num2, sum);
        } else {

            System.out.printf("%d + %d = %d%n", num2, num1, sum);
        }
        return true;
    }
}

