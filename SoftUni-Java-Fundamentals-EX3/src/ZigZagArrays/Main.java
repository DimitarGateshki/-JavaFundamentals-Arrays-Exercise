package ZigZagArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines=Integer.parseInt(sc.nextLine());

        int[] first=new int[lines];
        int[] second=new int[lines];

        for (int i = 0; i < lines; i++) {
            int[] ints= Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            if (i%2!=0){
                first[i]= ints[1];
                second[i]= ints[0];
            }else {
                first[i]= ints[0];
                second[i]= ints[1];
            }
        }


        for (Integer el:first) {
            System.out.print(el+" ");
        }

        System.out.println();

        for (Integer el:second) {
            System.out.print(el+" ");
        }


    }
}
