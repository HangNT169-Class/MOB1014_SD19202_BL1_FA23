/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_KieuDuLieuVaNhapXuat.P2_LuyenTap;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Bai1 {
    // B1: Nhap ten,diaChi,nganhHoc cua ban than va in ra man hinh
    // B2: Nhap tuoi,canNang,chieuCao cua ban than va in r
    // B3: Nhap ten,tuoi,diaChi,kyHoc,nganhHoc cua nyc va in ra man hinh
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Moi nhap dia chi: ");
        String address = sc.nextLine();
        System.out.println("Moi nhap nganh hoc: ");
        String nganhHoc = sc.nextLine();
        System.out.println("Ten: "+name);
        System.out.println("Dia chi: "+address);
        System.out.println("Nganh hoc: "+nganhHoc);
    }
}
