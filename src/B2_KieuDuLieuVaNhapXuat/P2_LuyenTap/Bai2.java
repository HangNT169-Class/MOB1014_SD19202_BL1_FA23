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
public class Bai2 {

    // B2: Nhap tuoi,canNang,chieuCao cua ban than va in r
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap tuoi: ");
        int age = scan.nextInt();
        System.out.println("Nhap can nang: ");
        float canNang = scan.nextFloat();
        System.out.println("Nhap chieuCao");
        Long chieuCao = scan.nextLong();
        System.out.println("Tuoi: " + age);
        System.out.println("can nang: " + canNang);
        System.out.println("chieu cao: " + chieuCao);

    }

}
