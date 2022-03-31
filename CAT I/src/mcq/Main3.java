package mcq;

import java.util.*;

public class Main3 {
    public static void main (String[] args) {
        Deque<Integer>de_que = new ArrayDeque<Integer>(10);
        de_que.add(10);
        de_que.add(20);
        de_que.clear();
        de_que.addFirst(564);
        de_que.addFirst(291);
        de_que.addLast(14);
        System.out.println(de_que.element());
        System.out.println(de_que.getFirst());
        System.out.println(de_que.getLast());
    }
}
