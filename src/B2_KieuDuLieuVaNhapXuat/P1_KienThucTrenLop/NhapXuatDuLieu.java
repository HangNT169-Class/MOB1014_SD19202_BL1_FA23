/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_KieuDuLieuVaNhapXuat.P1_KienThucTrenLop;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class NhapXuatDuLieu {

    /**
     * Trong C nhap du lieu tu ban phim => scanf Trong Java => Scanner
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Cu phap khai bao Scanner
        // Nhap ten tu ban phim
        // Co 2 cach de nhap String 
        // C1: .next => Khi gap khoang cach thi k doc duoc nua
        // C2:.nextLine
//        System.out.println("Moi ban nhap ten:");
//        String name = scan.next();

//        System.out.println("Moi ban nhap ten1:");
//        String name1 = scan.nextLine();

        // In ra man hinh
//        System.out.println("ten 1: "+name+" name 2: "+name1);
//        System.out.println("Ten 1: " + name);
//        System.out.println("Ten 2: " + name1);
        // Nhap cac kieu du lieu khac 
        System.out.println("Moi nhap:");
        int number = scan.nextInt();
        float number1 = scan.nextFloat();
//        double => nextDouble
//        long => nextLong
        // B1: Nhap ten,diaChi,nganhHoc cua ban than va in ra man hinh
        // B2: Nhap tuoi,canNang,chieuCao cua ban than va in ra man hinh
        // B3: Nhap ten,tuoi,diaChi,kyHoc,nganhHoc cua nyc va in ra man hinh
    }
}
