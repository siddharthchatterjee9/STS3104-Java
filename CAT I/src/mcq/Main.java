package mcq;

import java.util.*;

public class Main {
    public static void main (String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Programming");
        list.add("Java");
        list.add("Engineers");
        Iterator iter = list.iterator();

        while (iter.hasNext())
            System.out.printf(iter.next()+" ");
        System.out.println();
    }
}
