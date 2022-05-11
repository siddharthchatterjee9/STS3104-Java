package shrutcoding;

import java.util.Scanner;

class Square {
    public float sq(float x) {
        return x*x;
    }
}
class Rectangle extends Square {
    public void rectArea(float L, float B) {
        System.out.println(L*B);
    }
}
class Triangle extends Square {
    public void triarea(float b, float h) {
        System.out.println(0.5 * (b*h));
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int B = in.nextInt();
        int b = in.nextInt();
        int h = in.nextInt();
        Rectangle r = new Rectangle();
        r.rectArea(L, B);
        Triangle t = new Triangle();
        t.triarea(b, h);
    }
}
