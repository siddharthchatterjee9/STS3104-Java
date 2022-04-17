package inheritance;

import java.util.Scanner;

class Person {
    private String name;
    private int birthYear;
    public Person(String n, int byear) {
        this.name = n;
        this.birthYear = byear;
    }
    public String toString() {
        return "Name : " + name + "\nBirthYear : " + birthYear + "";
    }
}
class Staff extends Person {
    protected double salary;
    public Staff (String n, int byear, double s) {
        super(n, byear);
        this.salary = s;
    }
    public String toString() {
        return super.toString() + "\nOld Salary: " + salary;
    }
}
class Student extends Person {
    private String major;
    private double att;
    public Student (String n, int byear, String m, double at) {
        super(n, byear);
        this.major = m;
        this.att = at;
    }
    public String atten(double att) {
        return (att>=75)?"Yes":"No";
    }
    public String toString() {
        return super.toString() + "\nDepartment: " + major + "\nEligible: " + atten(att);
    }
}
class TeachingStaff extends Staff {
    private String subject;
    private double result;
    public TeachingStaff(String n, int byear, double s, String sub, double res) {
        super(n, byear, s);
        this.subject = sub;
        this.result = res;
    }
    double tsalCalc() {
        return salary + (salary*(result/1000));
    }
    public String toString() {
        return super.toString() + "\nSubject: " + subject + "\nNew Salary: " + tsalCalc();
    }
}
class NonTeachingStaff extends Staff {
    private String lab;
    private double exp;
    public NonTeachingStaff(String n, int byear, double s, String l, double expr) {
        super(n, byear, s);
        this.lab = l;
        this.exp = expr;
    }
    double ntsalCalc() {
        return salary + (salary*(exp/100));
    }
    public String toString() {
        return super.toString() + "\nLab: " + "\nNew Salary: " + ntsalCalc();
    }
}
class PersonTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = Integer.parseInt(in.nextLine());
        String name = in.nextLine();
        int byear = Integer.parseInt(in.nextLine());

        if (choice == 1) {
            String major = in.nextLine();
            double att = in.nextDouble();
            Student st = new Student(name, byear, major, att);
            System.out.println(st);
        }
        else if (choice == 2) {
            String sub = in.nextLine();
            double result = in.nextDouble();
            double sal = in.nextDouble();
            TeachingStaff ts = new TeachingStaff(name, byear, sal, sub, result);
            System.out.println(ts);
        }
        else if (choice == 3) {
            String lab = in.nextLine();
            double exp = in.nextDouble();
            double sal = in.nextDouble();
            NonTeachingStaff nts = new NonTeachingStaff(name, byear, sal, lab, exp);
            System.out.println(nts);
        }
    }
}
/*
Input format
Person code
(1 for student, 2 for Teaching Staff, 3 for Nonteaching staff)
Name
Year of birth
Next 2 or 3 lines are based on below conditions
Department and Attendance percentage if Person code is 1
Subject, Result percentage and salary if Person code is 2
Lab Name, Experience and Salary if Person code is 3
 */


