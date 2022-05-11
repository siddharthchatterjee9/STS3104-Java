package mcqs;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        try {
            if(age > 150)
                throw new IncorrectAgeException("Please Enter Correct Age.");
            else {
                System.out.println("welcome");
            }
        }
        catch (IncorrectAgeException a) {
            System.out.print(a);
        }
    }
}

class IncorrectAgeException extends Exception {
    public IncorrectAgeException(String str) {
        System.out.print(str);
    }
}