package OnlineStudent;
import Student.Student;

import java.util.Scanner;

public class OnlineStudent extends Student{
    private boolean relationship;
        public OnlineStudent(){
            relationship= true;
        }
        public OnlineStudent(boolean relationship){
            this.relationship=relationship;
        }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap OnlineStudent: ");
        System.out.print("Tình trạng hôn nhân: "); relationship = sc.nextBoolean();
    }
    public void hienThi(){
        System.out.println("Gender: " + relationship);
    }
}
