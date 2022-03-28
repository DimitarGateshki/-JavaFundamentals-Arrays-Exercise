package TopIntegers;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int[] ints= Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        boolean token=true;

        for (int i = 0; i <=ints.length-1; i++) {
            token=true;
            for (int j = i+1; j < ints.length ; j++) {
                if (ints[i]<=ints[j]) {
                    token = false;
                }
            }

            if (token){
                System.out.print(ints[i]+" ");
            }

        }
    }
}
