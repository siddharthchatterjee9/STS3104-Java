package abstractclassinterface;

import java.util.Scanner;

interface Stall {
    void display();
}
class GoldStall implements Stall {
    private String stallName;
    private int cost;
    private String ownerName;
    private int tvSet;
    public void display() {
        System.out.println(stallName + " " + cost + " " + ownerName + " " + tvSet);
    }
    public GoldStall() {
        this.stallName = null;
        this.cost = 0;
        this.ownerName = null;
        this.tvSet = 0;
    }
    public GoldStall(String stallName, int cost, String ownerName, int tvSet) {
        this.stallName = stallName;
        this.cost = 0;
        this.ownerName = ownerName;
        this.tvSet = 0;
    }
    public String getStallName() {
        return stallName;
    }
    public void setStallName(String stallName) {
        this.stallName = stallName;
    }

    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getTvSet() {
        return tvSet;
    }
    public void setTvSet(int tvSet) {
        this.tvSet = tvSet;
    }
}
public class StallMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = Integer.parseInt(in.nextLine());
        if (choice == 1) {
            GoldStall g = new GoldStall();
            g.setStallName(in.nextLine());
            g.setCost(Integer.parseInt(in.nextLine()));
            g.setOwnerName(in.nextLine());
            g.setTvSet(Integer.parseInt(in.nextLine()));
            g.display();
        }
    }
}
