// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setGreeting();
    }
}

class Person {
    Scanner in = new Scanner(System.in);
    String name = in.nextLine();
    public void setGreeting() {
        String greeting = "Hi";
        System.out.println(greeting + " " + name);
    }
}