package MagicSum;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int[] ints= Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int target=Integer.parseInt(sc.nextLine());

        for (int i = 0; i < ints.length ; i++) {
            for (int j = i+1; j < ints.length; j++) {
                if (ints[i]+ints[j]==target){
                    System.out.println(ints[i]+" "+ints[j]);

                }
            }
        }
    }
}
