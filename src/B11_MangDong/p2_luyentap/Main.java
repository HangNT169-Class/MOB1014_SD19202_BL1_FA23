/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11_MangDong.p2_luyentap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<DongVat> listDongVat = new ArrayList<>();
        //B1: Nhap doi tuong dong vat tu ban phim 
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap maDV");
        String maDV = sc.nextLine();
        System.out.println("nhap ten");
        String ten = sc.nextLine();
        System.out.println("nhap can nang");
        double canNang = Double.valueOf(sc.nextLine());
        DongVat sv = new DongVat();
        sv.setMaDv(maDV);
        sv.setTen(ten);
        sv.setCanNang(canNang);
        // B2: Add dong vat vao list
        listDongVat.add(sv);
        // B3: In list ra man hinh
//        for (DongVat dongVat : listDongVat) {
//            dongVat.inThongTin();
//        }
//        listDongVat.forEach(s -> s.inThongTin());
        // C4: for each + method reference (::)
        listDongVat.forEach(DongVat::inThongTin);
    }
}
