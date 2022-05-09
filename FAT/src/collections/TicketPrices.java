package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TicketPrices {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Integer> price = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            price.add(in.nextInt());
        }
        for (int j = 0; j < n; j++) {
            System.out.println(price.get(j) + " ");
        }
        System.out.println();
        System.out.println(Collections.min(price) + " ");
        System.out.println(Collections.max(price));
    }
}
