import Employee.Employee;
import OfflineStudent.OfflineStudent;
import OnlineStudent.OnlineStudent;
import Person.Person;
import Student.Student;
public class main {
    public static void main(String[] args) {
        Person Person = new Person();
        Person.nhap();
        Person.hienThi();

        Student Student = new Student();
        Student.nhap();
        Student.hienThi();

        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.nhap();
        onlineStudent.hienThi();

        OfflineStudent OfflineStudent = new OfflineStudent();
        OfflineStudent.nhap();
        OfflineStudent.hienThi();

        Employee Employee=new Employee();
        Employee.nhap();
        Employee.hienThi();
    }
}
