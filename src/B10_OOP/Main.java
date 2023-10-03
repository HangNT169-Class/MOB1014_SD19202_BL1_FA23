/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_OOP;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    //2. Nhập dữ liệu của 1 đối tượng sinh viên từ bàn phím và in ra màn hình 
    public static void main(String[] args) {
        // SV : 7(mssv,ten,tuoi...)
        // B1: Nhap thong tin cua SV(mssv,ten,tuoi...) tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap mssv: ");
        String mssv = sc.nextLine();
        System.out.print("Moi nhap ten: ");
        String name = sc.nextLine();
        System.out.print("moi nhap tuoi: ");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.print("gioi tinh: ");
        boolean gioitinh = Boolean.valueOf(sc.nextLine());
        System.out.print("ki hoc: ");
        int kyHoc = Integer.valueOf(sc.nextLine());
        System.out.print("Dia chi: ");
        String diaChi = sc.nextLine();
        System.out.print("mk facebook: ");
        String mkFacebook = sc.nextLine();
        // B2: Khoi tao doi tuong
        // C1: Khong tham so 
//        SinhVien sv = new SinhVien();
//        // B3: Thay doi gia tri cho thuoc tinh
//        sv.setDiaChi(diaChi);
//        sv.setGioiTinh(gioitinh);
//        sv.setKyHoc(kyHoc);
//        sv.setMkFacebook(mkFacebook);
//        sv.setMssv(mssv);
//        sv.setTen(name);
//        sv.setTuoi(tuoi);
//        // B4: In thong tin
//        System.out.println("Thong tin cua sv");
//        sv.inThongTin();
          // C2: Contructor full tham so
          SinhVien sv = new SinhVien(mssv, name, tuoi, gioitinh, kyHoc, diaChi, mkFacebook);
          sv.inThongTin();
    }
}
