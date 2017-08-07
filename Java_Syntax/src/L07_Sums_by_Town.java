import java.util.Scanner;
import java.util.TreeMap;

public class L07_Sums_by_Town {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        TreeMap<String, Double> towns = new TreeMap<>();

        for (int i = 0; i < num; i++) {
            String [] line = scanner.nextLine().split("\\s+\\|\\s+");
            String town = line[0];

            double income = Double.parseDouble(line[1]);

            if (!towns.containsKey(town)){
                towns.put(town, 0.0);
            }

            towns.put(town, towns.get(town) + income);
        }

        towns.forEach((e, v) -> System.out.println(e + " -> " + v));
    }
}
