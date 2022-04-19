package PartTimeEmpoyee;
import Employee.*;
public class PartTimeEmpoyee extends Employee {
    private int gioLamViec;
    public PartTimeEmpoyee(String ten, int gioLamViec){

        this.gioLamViec = gioLamViec;
    }

    public void tinhLuong(){
        luong =  gioLamViec;
    }
    public void xuatThongTin(){

        System.out.println("loai chuc vu : Nhan vien thoi vu" );
        System.out.println("Luong:"+luong);
        System.out.println("========================");

    }
}
