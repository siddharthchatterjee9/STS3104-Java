package mcq;

import java.util.*;

public class Main2 {
    public static void main (String[] args) {
        Deque<String> d = new LinkedList<String>();
        d.add("5");
        d.addFirst("1");
        d.addLast("9");
        d.push("7");
        d.offer("8");
        d.offerFirst("6");
        d.offerLast("2");
        System.out.println(d);
    }
}
