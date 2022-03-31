package selenium;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1);
        Employee emp2 = new Employee(1);
        Map<Employee, String> map = new HashMap<Employee, String>();
        map.put(emp1, "Siddharth");
        map.put(emp2, "Siddharth");
        System.out.println(map.size());
        System.out.println(map.entrySet());

        Integer i = new Integer(1);
        Integer i1 = new Integer(1);
        Map<Integer,String> map1 = new HashMap<Integer, String >();
        map1.put(i, "one");
        map1.put(i1, "one");
        System.out.println(map1.size());

    }
}
class Employee {
    int id;
    public Employee(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
