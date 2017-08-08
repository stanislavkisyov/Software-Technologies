import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E09Most_Frequent_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

        Map<Integer,Integer> dictionary=new HashMap<Integer,Integer>();

        for(int number:numbers){
            if(!dictionary.containsKey(number)){
                dictionary.put(number,0);
            }else{
                dictionary.put(number,dictionary.get(number)+1);
            }
        }
        int count=1;
        int key=numbers[0];
        for(int number:numbers){
            if(count<dictionary.get(number)){
                count=dictionary.get(number);
                key=number;
            }
        }
        System.out.println(key);
    }
}
