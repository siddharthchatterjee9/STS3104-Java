package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
    public static void main (String[] args) {
        HashSet<String> set = new HashSet<String>();
        // Here data is not added as in indexing approach
        // We got hashCodes for elements which are being added
        //TreeSet<String> set = new TreeSet<String>(); // Data is unordered but it is alphabetically sorted

        set.add("Siddharth");
        set.add("Ishan");
        set.add("Yashvi");
        set.add("Ishan");
        set.add("Hanivant");
        set.add("Yash");
        // 1. Data is unique, no redundancy
        // 2. Data is unordered in output due to hashing
        System.out.println("set is: " + set );
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
        }
        set.remove("Yash");
        System.out.println("set after removing Yash is: " + set);
        if (set.contains("Hanivant")) {
            System.out.println("Hanivant is in the set!");
        }
        System.out.println("set size is: " + set.size());

    }
}
