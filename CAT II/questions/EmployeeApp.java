package questions;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeApp {
    static ArrayList<Employee> elist = new ArrayList<Employee>();
    static void pushElement(Employee obj) {
        elist.add(obj);
    }
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many employees' information have to be stored?");
        int count = in.nextInt();
        for (int i = 0; i <= count; i++) {
            System.out.println("Enter Employee ID: ");
            int eid = in.nextInt();
            System.out.println("Enter Employee Name: ");
            String ename = in.next();
            System.out.println("Enter Department ID: ");
            int did = in.nextInt();
            System.out.println("Enter Department Name: ");
            String dname = in.next();
            System.out.println("Enter Department designation: ");
            String designation = in.next();
            Department dept = new Department(did, dname, designation);
            Employee eobj = new Employee(eid, ename, dept);
            pushElement(eobj);
            System.out.println("---Employee information---");
            for (Employee obj : elist) {
                System.out.println("Employee ID: " + obj.eid);
                System.out.println("Employee Name: " + obj.ename);
                Department department = obj.department;
                System.out.println("Department ID: " + obj.department.did);
                System.out.println("Department Name: " + obj.department.dname);
                System.out.println("Department designation: " + obj.department.designation);
            }

        }
    }

}
class Employee {
    int eid;
    String ename;
    Department department;
    public Employee(int eid, String ename, Department department) {
        this.eid = eid;
        this.ename = ename;
        this.department = department;
    }
}
class Department {
    int did;
    String dname;
    String designation;
    public Department(int did, String dname, String designation) {
        this.did = did;
        this.dname = dname;
        this.designation = designation;
    }
}
