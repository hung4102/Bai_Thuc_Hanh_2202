package OfflineStudent;

import Student.Student;

import java.util.Scanner;
public class OfflineStudent extends Student{
    private String dateTime;
    public OfflineStudent(){
        dateTime = "";
    }
    public OfflineStudent(String dateTime){
        this.dateTime = dateTime;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap OfflineStudent: ");
        System.out.print("Ngay sinh: "); dateTime = sc.nextLine();

    }
    public void hienThi(){
        System.out.println("Date: " + dateTime);

    }
}
