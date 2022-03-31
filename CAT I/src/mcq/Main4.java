package mcq;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        List<String> L = new ArrayList<String>();
        L.add("a");
        L.add("b");
        Iterator<String> it = L.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            L.add("c");
        }
    }
}
