package mcqs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class shuffle {
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        mylist.add("hello");
        mylist.add("there");
        mylist.add("my");
        mylist.add("miss");
        mylist.add("sunshine");
        Collections.shuffle(mylist);
        System.out.println(mylist + "\n");
        Collections.shuffle(mylist, new Random());
        System.out.println(mylist + "\n");
        Collections.shuffle(mylist, new Random(3));
        System.out.println(mylist + "\n");

    }
}
