package CommonElements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] first = sc.nextLine().split("\\s+");
        String[] second = sc.nextLine().split("\\s+");

        for (String el : first) {
            for (String el2 : second) {
                if (el.equals(el2)) {
                    System.out.print(el + " ");
                }
            }
        }

    }
}
