/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_OOP;

/**
 *
 * @author hangnt
 */
public class SinhVien {
    private String mssv;  // => gia tri mac dinh:null
    private String ten;
    private int tuoi; // => int : 0 
    private boolean gioiTinh;
    private int kyHoc;
    private String diaChi;
    private String mkFacebook;

    // C1: Click chuot phai => insert code 
//    public SinhVien() {
//    }
//
//    public SinhVien(String mssv, String ten, int tuoi, boolean gioiTinh, int kyHoc, String diaChi, String mkFacebook) {
//        this.mssv = mssv;
//        this.ten = ten;
//        this.tuoi = tuoi;
//        this.gioiTinh = gioiTinh;
//        this.kyHoc = kyHoc;
//        this.diaChi = diaChi;
//        this.mkFacebook = mkFacebook;
//    }
    /**
     * Contructor:
     * Dau hieu nhan biet:
     *  - Ten contructor trung voi ten class
     *  - Contructor khong co kieu du lieu tra ve(khong co return)
     * Contructor: Dung de khoi tao 1 doi tuong.
     * Có 2 loại contructor:
     *  - Có tham số.
     *  - Không tham số.
     * Default của 1 class là loại contructor khong tham so.
     */
    
    // C2: Ctrl space 2 lan 
    public SinhVien() {
    }

    public SinhVien(String mssv, String ten, int tuoi, boolean gioiTinh, int kyHoc, String diaChi, String mkFacebook) {
        this.mssv = mssv;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.kyHoc = kyHoc;
        this.diaChi = diaChi;
        this.mkFacebook = mkFacebook;
    }

    // getter: Lay ra thong tin cua thuoc tinh cua doi tuong
    public String getMssv() {
        return mssv;
    }
    
    // Setter : Thay doi gia tri cua thuoc tinh cua doi tuong
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMkFacebook() {
        return mkFacebook;
    }

    public void setMkFacebook(String mkFacebook) {
        this.mkFacebook = mkFacebook;
    }

    // Ham => public 
    // Hien tai
    // Bien => private 
    // Ham => public 
    // In tat ca thong tin cua sinh vien ra man hinh
    public void inThongTin(){
        // In du cac thuoc tinh cua sinh vien 
        System.out.println("MSSV = "+mssv);
        System.out.println("Ten = "+ten);
        System.out.println("Tuoi = "+tuoi);
        System.out.println("Dia chi = "+diaChi);        
    }
    
    
}
