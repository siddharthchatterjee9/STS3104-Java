package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntro {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<String> a = new ArrayList<String>(n);
        for (int i = 0; i < n; i++) {
            a.add(in.nextLine());
        }
        System.out.println(a);


    }
}
