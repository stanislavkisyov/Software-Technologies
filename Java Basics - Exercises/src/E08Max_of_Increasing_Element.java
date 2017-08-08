import java.util.Arrays;
import java.util.Scanner;

public class E08Max_of_Increasing_Element {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int currentStart = 0;
        int currentLen = 1;
        int bestStart = 0;
        int bestLen = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                currentLen++;
                if (currentLen > bestLen) {
                    bestLen = currentLen;
                    bestStart = currentStart;
                }
            } else {
                currentLen = 1;
                currentStart++;
                i = currentStart;
            }
        }
        for (int i = bestStart; i < bestStart + bestLen; i++){
            System.out.print(numbers[i] + " ");
        }

    }
}
