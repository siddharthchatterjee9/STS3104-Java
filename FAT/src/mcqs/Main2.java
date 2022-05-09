package mcqs;
import java.util.*;
public class Main2 {
    public static void main (String[] args) {
        String elements[] = {"A","B","C","D","E"};
        Set s1 = new HashSet(Arrays.asList(elements));
        elements = new String[] {"A","B","C"};
        Set s2 = new HashSet(Arrays.asList(elements));
        System.out.println(s1.containsAll(s2));
    }

}
