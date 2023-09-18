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
public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten vao: ");
        String ten = sc.nextLine();
        System.out.println("Nhap khu vuc song: ");
        String khuVucSong = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi = sc.nextLine();

        System.out.println("Ten con cho: " + ten);
        System.out.println("Khu vuc song: "+ khuVucSong);
        System.out.println("Dia chi: " + diaChi);
    }
}
