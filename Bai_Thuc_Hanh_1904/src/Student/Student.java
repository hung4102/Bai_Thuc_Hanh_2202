package Student;
import Person.*;
import java.util.Scanner;
public class Student extends Person {
    protected String gender;
    protected String address;
    public Student(){
        gender = "";
        address = "";
    }
    public Student( String gender, String address){
        this.gender = gender;
        this.address = address;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap student: ");
        System.out.print("Gioi tinh: "); gender = sc.nextLine();
        System.out.print("Dia chi: "); address = sc.nextLine();
    }
    public void hienThi(){

        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
    }

}
