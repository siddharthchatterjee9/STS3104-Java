package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
    public static void main (String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList list2 = new ArrayList();

        //1. Adding data to lists
        list1.add("Siddharth");
        list1.add("Ishan");
        list1.add("Yashvi");
        list1.add("Yash");
        list2.add("Om");
        list2.add(217);
        System.out.println("list1 is: " + list1);
        System.out.println("list2 is: " + list2);

        //2. Getting element from lists
        String name = list1.get(2);
        System.out.println("Name is: " + name);

        Object o = list2.get(1);
        System.out.println("o is: " + o);

        //3. Updating element in lists
        list1.set(1, "Hanivant");
        System.out.println("Updated list1 is: " + list1);

        //4. Removing element from list
        System.out.println(list1.remove(1));
        System.out.println("New list1 is: " + list1);
        // list1.size(); --> gives u the size
        // list1.clear(); --> Remove all


        //5. Iterating (enhanced for loop) in ArrayList
        System.out.println("=====Iterating with enhanced for loop=====");
        for (String str: list1) {
            System.out.println(str);
        }
        System.out.println("=========");

        //5. Iterating (with Iterator) in ArrayList
        System.out.println("=====Iterating with iterator=====");
        Iterator<String> itr = list1.iterator();
        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
            if (str.equals("Yash")) {
                itr.remove();
            }
        }
        System.out.println("========");
        System.out.println("list1 after iteration is: " + list1);
    }
}
