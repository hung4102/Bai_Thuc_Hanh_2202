package Person;

import java.util.Scanner;
public class Person {
    public String personID;
    public String personName;
    public Person(){
        personID = "";
        personName = "";
    }
    public Person(String personID, String personName, boolean gender, String address){
        this.personID = personID;
        this.personName = personName;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Person: ");
        System.out.print("Nhap ID: "); personID = sc.next();
        sc.nextLine();
        System.out.print("Nhap ten: "); personName = sc.nextLine();
    }
    public void hienThi(){
        System.out.println("Person: ");
        System.out.println("ID: " + personID);
        System.out.println("Ten: " + personName);

    }
}