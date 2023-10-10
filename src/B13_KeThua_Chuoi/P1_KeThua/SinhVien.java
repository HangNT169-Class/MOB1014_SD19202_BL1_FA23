/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13_KeThua_Chuoi.P1_KeThua;

/**
 *
 * @author hangnt
 */
public class SinhVien extends Nguoi {

    /**
     * Tinh ke thua : extends. Class con se ke thua cac thuoc tinh phuong thuc
     * cua class Cha (TRU CAC THUOC TINH VA PHUONG THUC PRIVATE)
     */
    private double diem;
    private String mssv;
    // SV=> Co 7 thuoc tinh : 
    //ten - String , 
    // tuoi - int,
    // gioiTinh - int (1-Nam, 0- Nữ), 
    // queQuan - String , 
    // sdt - String , 
    // email - String 
    // diem - double 

    public SinhVien() {
    }

    public SinhVien(double diem, String mssv, String ten, int tuoi, int gioiTinh, String queQuan, String sdt, String email) {
        super(ten, tuoi, gioiTinh, queQuan, sdt, email);
        this.diem = diem;
        this.mssv = mssv;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public void display() {
        // In ra tat ca cac thuoc tinh cua sv 
        // 8 thuoc tinh 
        // De lay cac thuoc tinh/phuong thuc cua class Cha => supper
//        System.out.println("Ten : " + super.getTen());
//        System.out.println("Tuoi: " + super.getTuoi());
//        System.out.println("Gioi Tinh: " + super.getGioiTinh());
//        System.out.println("Que Quan: " + super.getQueQuan());
//        System.out.println("Sdt: " + super.getSdt());
//        System.out.println("Email: " + super.getEmail());
        super.display();
        System.out.println("Diem: " + diem);
    }
}
