package ArrayRotation;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int[] ints= Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int rotates=Integer.parseInt(sc.nextLine());

        for (int i = 0; i < rotates; i++) {
            int temp=ints[0];
            for (int j = 0; j < ints.length-1; j++) {
                ints[j]=ints[j+1];
            }
            ints[ints.length-1]=temp;

        }

        for (Integer el:ints) {
            System.out.print(el+" ");
        }



    }
}
