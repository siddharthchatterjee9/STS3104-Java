package mcqs;
import java.util.*;
public class Main1 {
    public static void main (String[] args) {
        int array[] = new int[5];
        for (int i = 5; i > 0; i--)
            array[5 - i] = i;
            //Collections.sort(array);
        for (int i = 0; i < 5; ++i)
            System.out.print(array[i]);
    }

}
