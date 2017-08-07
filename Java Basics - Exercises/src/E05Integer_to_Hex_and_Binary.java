import java.util.Scanner;

public class E05Integer_to_Hex_and_Binary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());

        String reslt = Integer.toHexString((int) input);
        String reslt1 = Integer.toBinaryString((int) input);

        System.out.println(reslt.toUpperCase());
        System.out.println(reslt1);
    }
}
