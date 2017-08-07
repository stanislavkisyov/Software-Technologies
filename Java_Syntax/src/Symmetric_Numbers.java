import java.util.*;

public class Symmetric_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());



        for (int i = 1; i <= n; i++) {
         String[] temp = Integer.toString(i).split("");
            Collections.reverse(Arrays.asList(temp));
            int reversed = Integer.parseInt(String.join("", temp));

            if (reversed == i){
                System.out.print(i + " ");
            }
        }


    }
}
