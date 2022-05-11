package mcqs;

import java.util.Scanner;

public class InputMismatchException extends Throwable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int x = in.nextInt();
            try {
                int y = in.nextInt();
                int division = x/y;
                System.out.println(division);
            }
            catch (ArithmeticException a) {
                System.out.println("java.util.ArithmeticException");
            }
        }
        catch (Exception e) {
            System.out.println("java.util.InputMismatchException");
        }
    }
}
