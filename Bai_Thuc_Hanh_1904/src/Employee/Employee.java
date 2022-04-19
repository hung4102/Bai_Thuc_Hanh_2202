package Employee;
import Person.*;

import java.util.Scanner;

public class Employee extends Person {
    protected long luong;
    public String EmployeeAge;
    public String EmployeeRole;
    public Employee(){
    this.EmployeeAge=EmployeeAge;
    this.EmployeeRole=EmployeeRole;
    }

    public void nhap(){
        System.out.println("Nhap Employee: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập tuổi: ");
        EmployeeAge = sc.nextLine();
        System.out.print("nhập chức vụ: ");
        EmployeeRole = sc.nextLine();
        System.out.println("= Luong : "+ luong + " VND");
    }
    public void hienThi(){
        System.out.println("tuổi " + EmployeeAge);
        System.out.println("chức vụ " + EmployeeRole);
        System.out.println("= Luong : "+ luong);
    }
}
