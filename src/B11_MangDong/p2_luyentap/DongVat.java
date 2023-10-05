/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11_MangDong.p2_luyentap;

/**
 *
 * @author hangnt
 */
public class DongVat {

    private String ten;
    private String maDv;
    private double canNang;

    public DongVat() {
    }

    public DongVat(String ten, String maDv, double canNang) {
        this.ten = ten;
        this.maDv = maDv;
        this.canNang = canNang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaDv() {
        return maDv;
    }

    public void setMaDv(String maDv) {
        this.maDv = maDv;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public void inThongTin() {
        System.out.println("maDV: " + maDv);
        System.out.println("ten: " + ten);
        System.out.println("canNang: " + canNang);

    }

}
