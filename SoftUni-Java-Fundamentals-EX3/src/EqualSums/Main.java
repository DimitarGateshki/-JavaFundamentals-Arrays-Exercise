package EqualSums;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int[] ints= Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        boolean token=true;
        int sumLeft=0;
        int sumRight=0;
        boolean prints=false;
        for (int i = 0; i < ints.length ; i++) {
            sumLeft=0;
            sumRight=0;
            for (int j = 0; j < i; j++) {
                sumLeft+=ints[j];
            }

            for (int j = i+1; j < ints.length; j++) {
                sumRight+=ints[j];
            }

            if (sumLeft==sumRight){
                System.out.println(i);
                prints=true;
            }
        }

        if (!prints){
            System.out.println("no");
        }

    }
}
