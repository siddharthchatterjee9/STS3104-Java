package premcoding;
import java.util.*;

class Address {
    String city,state,country;
    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

}
public class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name,Address address) {
        this.id = id;
        this.name = name;
        this.address=address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        Address address1=new Address(s1, s2, s3);
        int id = sc.nextInt();
        String name = sc.next();
        Emp e=new Emp(id, name, address1);
        e.display();


    }
}