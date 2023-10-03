/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_OOP;

/**
 *
 * @author hangnt
 */
public class InThongTinFixCungSinhVien {
    public static void main(String[] args) {
//        // Khoi tao 1 doi tuong = new (contructor)
//        SinhVien sv = new SinhVien();
//        // in sinh vien 
//        sv.inThongTin();
        // Co 2 cach de in thong tin cua 1 sinh vien nao day
        // C1: Su dung contructor khong tham so 
        // B1: Khoi tao doi tuong = contructor khong tham so
//        SinhVien sv = new SinhVien();
//        // B2: Thay doi gia tri thuoc tinh cua doi tuong
//        // Co bao nhieu thuoc tinh => Co bang day setter
////        String ten = "Hieu";
//        sv.setTen("Hieu");
//        sv.setTuoi(10);
//        sv.setDiaChi("abc");
//        sv.setGioiTinh(true);
//        sv.setKyHoc(7);
//        sv.setMkFacebook("12345");
//        sv.setMssv("abcd");
//        // B3: In thong tin sv
//        sv.inThongTin();
        // C2: Su dung contructor full tham so 
        SinhVien sv = new SinhVien("he130461", "hang", 10, false, 9, "ha noi", "123456");
        sv.inThongTin();
    }
}
