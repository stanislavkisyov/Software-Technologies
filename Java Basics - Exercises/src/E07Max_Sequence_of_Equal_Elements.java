import java.util.Arrays;
import java.util.Scanner;

public class E07Max_Sequence_of_Equal_Elements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int currentLen = 1;
        int currentPos = 0;
        int bestLen = 1;


        for (int i = 1; i < input.length; i++) {
            if (input[i] == input[i - 1]) {
                currentLen++;
                if (currentLen > bestLen) {
                    bestLen = currentLen;
                    currentPos = i;
                }
            } else {
                currentLen = 1;

            }
        }
        for (int i = 0; i < bestLen; i++) {
            System.out.print(input[currentPos] + " ");
        }
    }

}
