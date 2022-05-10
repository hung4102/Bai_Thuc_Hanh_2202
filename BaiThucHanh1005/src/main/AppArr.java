package main;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class AppArr {
    private ArrayList<NhanVien> danhSach;

    public AppArr() {
        this.danhSach = new ArrayList<NhanVien>();
    }

    public AppArr(ArrayList<NhanVien> danhSach) {
        this.danhSach = danhSach;
    }

    public void themNhanVien(NhanVien nv) {
        this.danhSach.add(nv);
    }

    public void inDanhSachNhanVien() {
        for (NhanVien nhanVien : danhSach) {
            System.out.println(nhanVien);
        }
    }
    public int laySoLuongNhanVien() {
        return this.danhSach.size();
    }

    public void lamRongDanhSach() {
        this.danhSach.removeAll(danhSach);
    }

    public void timNhanVien(String ten) {
        for (NhanVien nhanVien : danhSach) {
            if(nhanVien.getName().indexOf(ten)>=0) {
                System.out.println(nhanVien);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        AppArr arr = new AppArr();
                System.out.println("Nhập họ và tên: "); String name = sc.nextLine();
                System.out.println("Nhập mã nhân viên: "); String id = sc.nextLine();
                System.out.println("Nhập địa chỉ: "); String address = sc.nextLine();
                NhanVien nv= new NhanVien(name, id,address );
                arr.themNhanVien(nv);

                arr.inDanhSachNhanVien();

                System.out.println("Số lượng hiện tại: "+ arr.laySoLuongNhanVien());

                System.out.println("Nhập họ và tên: ");
                name = sc.nextLine();
                System.out.println("Kết quả tìm kiếm: ");
                arr.timNhanVien(name);
                arr.lamRongDanhSach();
            }

}

