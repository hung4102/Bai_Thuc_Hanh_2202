package FullTimeEmpoyee;
import Employee.*;

import java.util.Scanner;

public class FullTimeEmpoyee extends Employee{
        private Scanner scanner ;
        private int ngayLamThem;
        private int loaiChucVu;
        public FullTimeEmpoyee(String ten) {
            this.ten = ten;
        }
        public FullTimeEmpoyee( int ngayLamThem){

            this.ngayLamThem = ngayLamThem;
        }
        public void setLoaiChucVu(int loaiChucVu){

            this.loaiChucVu= loaiChucVu;
        }

        public String loaiNhanVien() {
            return "Nhan vien toan phan";
        }

        public void xuatThongTin() {

            System.out.println("loai chuc vu :"+ loaiChucVu);
            System.out.println("ngay lam them :"+ngayLamThem);
            System.out.println("Luong:" + luong);
            System.out.println("=======================");
        }
    }

