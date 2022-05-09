package collections;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class EmailSearch {
    public static void main (String... args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        Set<String> mail = new HashSet<String>(n);
        for (int i = 0; i < n; i++) {
            mail.add(in.nextLine());
        }
        Set<String> mail1 = new HashSet<String>();
        String detail = in.nextLine();
        String m[] = detail.split(",");
        for (String m1: m) {
            mail1.add(m1);
        }
        if (mail.contains(mail1)) {
            System.out.println("Email addresses are present");
        }
        else {
            System.out.println("Email addresses are not present");
        }

    }
}
