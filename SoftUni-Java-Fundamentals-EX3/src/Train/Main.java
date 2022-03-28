package Train;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int length=Integer.parseInt(sc.nextLine());

    int[] train=new int[length];

    for (int i = 0; i < length; i++) {
        int wagon=Integer.parseInt(sc.nextLine());
        train[i]=wagon;
    }

    int sum=0;
    for (Integer el :train
    ) {

        System.out.print(el+" ");
        sum+=el;
    }

    System.out.println();
    System.out.print(sum);
}

}
