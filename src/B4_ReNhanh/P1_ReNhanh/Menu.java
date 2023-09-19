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
public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap chuc nang:");
        int chucNang = Integer.valueOf(sc.nextLine());
        switch (chucNang) {
            case 1: {
                System.out.print("Moi nhap so thu 1 ");
                int so1 = Integer.valueOf(sc.nextLine());
                System.out.println("Moi nhap so thu 2");
                int so2 = Integer.valueOf(sc.nextLine());
                int tong = so1 + so2;
                System.out.println("Tong cua 2 so la: " + tong);
                break;
            }
            case 2: {
                System.out.println("nhap ten");
                String ten = sc.nextLine();
                System.out.println("nhap tuoi");
                int tuoi = Integer.valueOf(sc.nextLine());
                System.out.println("nhap dia chi");
                String diachi = sc.nextLine();
                System.out.println("ten" + ten);
                System.out.println("tuoi" + tuoi);
                System.out.println("dia chi" + diachi);
                break;
            }
            case 3: {
                break;
            }
            default: {
                System.out.println("Chuc nang khong ton tai");
                break;
            }
        }
    }
}
