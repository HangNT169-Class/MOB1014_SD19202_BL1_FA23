/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_OnTapNhapXuat.P1_OnTap;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * 1. Nhập chiều cao, cân nặng, tuổi của nyc và in ra màn hình 2. Nhập tên,
     * khu vực sống, địa chỉ của con chó nhà hàng xóm và in ra màn hình 3. Nhập
     * tên,tuoi, dia chi, chieu cao, nganh hoc, ky hoc, que quan cua ban than va
     * in ra man hinh
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap chieu cao cua ");
        int chieuCao = scan.nextInt();
        System.out.println("Nhap can nang: ");
        float canNang = scan.nextFloat();
        System.out.println("Nhap tuoi:");
        long doTuoi = scan.nextLong();
        System.out.println("chieu cao la" + chieuCao);
        System.out.println("can nang la " + canNang);
        System.out.println("Tuoi la  " + doTuoi);

    }

}
