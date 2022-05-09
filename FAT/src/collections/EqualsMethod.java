package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class EqualsMethod {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<String> a = new ArrayList<String>(n);
        ArrayList<String> b = new ArrayList<String>(n);
        for (int i = 0; i < n; i++) {
            a.add(in.nextLine());
        }
        for (int j = 0; j < n; j++) {
            b.add(in.nextLine());
        }
        if (a.equals(b)) {
            System.out.println("Both lists are same");
        }
        else {
            System.out.println("Both lists are different");
        }
    }
}
