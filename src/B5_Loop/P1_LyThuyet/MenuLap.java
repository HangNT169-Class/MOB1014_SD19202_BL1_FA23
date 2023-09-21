/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B5_Loop.P1_LyThuyet;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class MenuLap {

    /**
     * Xay dung memu gom cac chuc nang sau. Menu lap lai toi khi chon 3 thi dung
     * 1. Nhap vao 2 so nguyen duong. Tinh thuong cua 2 so nguyen day 2. Nhap
     * vao ten, tuoi, dia chi cua ban than va in ra man hinh 3. Thoat
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chucNang;
        do {
            System.out.println("Moi nhap chuc nang: ");
            chucNang = Integer.valueOf(scan.nextLine());
            // viet menu 
            switch (chucNang) {
                case 1: {
                    System.out.println("Day la chuc nang 1");
                    System.out.println("Nhap so thu nhat: ");
                    int num1 = Integer.valueOf(scan.nextLine());
                    System.out.println("Nhap so thu 2: ");
                    int num2 = Integer.valueOf(scan.nextLine());
                    double thuong = (num1 / num2)*1.0;
                    System.out.println( thuong + "Thuong cua 2 so la: ");
                    break;
                }
                case 2: {
                    System.out.println("Day la chuc nang 2");
                    System.out.println("Moi ban nhap ten: ");
                    String ten = scan.nextLine();
                    System.out.println("Moi ban nhap tuoi: ");
                    int tuoi = Integer.valueOf(scan.nextLine());
                    System.out.println("Moi ban nhap dia chi: ");
                    String diaChi = scan.nextLine();
                    System.out.println("Ten: "+ten);
                    System.out.println("Tuoi: "+tuoi);
                    System.out.println("Dia chi: "+diaChi);
                    break;
                }
                case 3: {
                    break;
                }
                default: {
                    System.out.println("Chuc nang ban chon khong co");
                    break;
                }
            }
        } while (chucNang != 3);

    }
}
