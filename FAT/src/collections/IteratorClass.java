package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Stall {
    private String name;
    private String detail;
    private String type;
    private String ownerName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public Stall() {
        this.name = null;
        this.detail = null;
        this.type = null;
        this.ownerName = null;
    }
    public Stall(String name, String detail, String type, String ownerName) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.ownerName = ownerName;
    }
    public String toString() {
        return name + " " + detail + " " + type + " " + ownerName;
    }
}
public class IteratorClass {
    public static void main (String... args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Stall> s = new ArrayList<Stall>(n);
        Stall[] st = new Stall[n];
        for (int i = 0; i < n; i++) {
            st[i] = new Stall();
            st[i].setName(in.nextLine());
            st[i].setDetail(in.nextLine());
            st[i].setType(in.nextLine());
            st[i].setOwnerName(in.nextLine());
            s.add(st[i]);
        }
        Iterator iterator = s.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

}
