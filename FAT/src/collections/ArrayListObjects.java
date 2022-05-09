package collections;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

class ItemType {
    private String name;
    private double deposit;
    private double costPerDay;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }
    public ItemType() {
        this.name = null;
        this.deposit = 0;
        this.costPerDay = 0;
    }
    public ItemType(String name, double deposit, double costPerDay) {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }
}
public class ArrayListObjects {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.0");
        int n = Integer.parseInt(in.nextLine());
        ArrayList<ItemType> item = new ArrayList<ItemType>(n);
        ItemType[] it = new ItemType[n];
        for (int i = 0; i < n; i++) {
            it[i] = new ItemType();
            it[i].setName(in.nextLine());
            it[i].setDeposit(Double.parseDouble(in.nextLine()));
            it[i].setCostPerDay(Double.parseDouble(in.nextLine()));
            item.add(it[i]);
        }
        //System.out.println("%-20s%-20s%-20s\n", "Name", "Deposit", "CostPerDay");
        for (int i = 0; i < n; i++) {
            //System.out.println("%-20s%-20s%-20s\n", item.get(i).getName(), d.format(item.get(i).getDeposit()), d.format(item.get(i).getCostPerDay()));
        }
    }

}
