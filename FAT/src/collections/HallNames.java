package collections;


import java.util.ArrayList;
import java.util.Scanner;

public class HallNames {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<String> halls = new ArrayList<String>(n);
        for (int i = 0; i < n; i++) {
            halls.add(in.nextLine());
        }
        String searchHall = in.nextLine();
        if (halls.contains(searchHall)) {
            System.out.println(halls.indexOf(searchHall));
        }
        else {
            System.out.println(searchHall + " hall is not found");
        }
    }
}
