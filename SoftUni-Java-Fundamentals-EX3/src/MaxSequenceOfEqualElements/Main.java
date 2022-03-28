package MaxSequenceOfEqualElements;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int[] ints= Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int count=0;
        int index=0;
        int interCount=0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = i+1; j <ints.length ; j++) {
                if (ints[i]==ints[j]){
                    count++;
                }else {
                    break;
                }
            }
            if (interCount<count){
                index=i;
                interCount=count;
            }
            count=0;

        }

        for (int i = 0; i <=interCount ; i++) {
            System.out.print(ints[index+i]+" ");

        }
    }
}
