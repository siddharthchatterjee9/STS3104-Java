package stack;

import java.util.Stack;

public class StacksRFun {
    public static void main (String[] args) {
        Stack<String> games = new Stack<String>();
        games.add("Call of Duty");
        games.add("Uncharted 4");
        games.add("Shenmue");
        System.out.println(games.pop());
        System.out.println(games.peek());

        Stack<Character> tower = new Stack<Character>();
        tower.add('R');
        tower.add('B');
        tower.add('Y');
        System.out.println(tower.empty());
        System.out.println(tower.contains('B'));
        System.out.println(tower.get(1)); //indexing starts from bottom to top
        tower.set(1, 'G');
        System.out.println(tower);
        System.out.println(tower.size());
    }
}
