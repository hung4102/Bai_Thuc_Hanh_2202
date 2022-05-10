package main;

import java.util.Scanner;

import static java.lang.System.in;

public class NhanVien {

    public String name;
    public String id;
    public String address;
    public NhanVien(){
        name="";
        id="";
        address="";
    }
    public NhanVien(String name, String id, String address){
        this.name = name;
        this.id = id;
        this.address=address;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    //        public void nhap(){
//            var sc= new Scanner(in);
//            System.out.println("nhập id:");
//            setId(sc.nextLine());
//            System.out.println("Nhập name: ");
//            setName(sc.nextLine());
//            System.out.println("nhập địa chỉ: ");
//            setAddress(sc.nextLine());
//        }
//        public void HienThi(){
//            System.out.println("Mã nhân viên: " +getId());
//            System.out.println("Ho ten: "+ getName());
//            System.out.println("Dia chi: "+ getAddress());
//        }


}
