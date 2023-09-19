/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B4_ReNhanh.P1_ReNhanh;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class SwitchCaseOnTap {

    /**
     * int, String => Truyen ten bien kieu so nguyen hoac ky tu switch(ten
     * bien){ case gia tri:{ // code break; } // So luong case khong gioi han
     * default:{ // Cac truong hop con lai break; } } // B1: nhap vao 1 thang
     * kieu so nguyen. Kiem tra day la thang nao trong nam // B2: Tao 1 menu gom
     * cac chuc nang sau 1. Tinh tong cua 2 so nguyen nhap tu ban phim 2. Nhap
     * tu ban phim thong tin ca nhan cua ban than va in ra man hinh(ten, tuoi,
     * diaChi) 3. Thoat
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi nhap thang:");
        int thang = Integer.valueOf(scan.nextLine());
        switch (thang) {
            case 1: {
                System.out.println("Thang thu nhat");
                break;
            }
            case 2: {
                System.out.println("Thang thu hai");
                break;
            }
            case 3: {
                System.out.println("Thang thu ba");
                break;
            }
            case 4: {
                System.out.println("Thang thu tu");
                break;
            }
            case 5: {
                System.out.println("Thang thu nam");
                break;
            }
            case 6: {
                System.out.println("Thang thu sau");
                break;
            }
            case 7: {
                System.out.println("Thang thu bay");
                break;
            }
            case 8: {
                System.out.println("Thang thu tam");
                break;
            }
            case 9: {
                System.out.println("Thang thu chin");
                break;
            }
            case 10: {
                System.out.println("Thang thu muoi");
                break;
            }
            case 11: {
                System.out.println("Thang thu 11");
                break;
            }
            case 12: {
                System.out.println("Thang thu 12");
                break;
            }
            default: {
                System.out.println("Khong thuoc thang nao trong nam");
                break;
            }
        }
    }
}
