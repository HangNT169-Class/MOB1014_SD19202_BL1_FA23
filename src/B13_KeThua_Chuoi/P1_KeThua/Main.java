/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13_KeThua_Chuoi.P1_KeThua;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
//        Nhập thông tin của 1 sinh viên và in ra màn hình ( Sử dụng constructor không tham số)   
        // SV => 7 
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap ten");
        String ten = sc.nextLine();
        System.out.println("moi nhap tuoi");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.println("nhap gioi tinh");
        int gioiTinh = Integer.valueOf(sc.nextLine());
        System.out.println("nhap que quan");
        String queQuan = sc.nextLine();
        System.out.println("nhap sdt");
        String sdt = sc.nextLine();
        System.out.println("nhap email");
        String email = sc.nextLine();
        System.out.println("nhap diem");
        double diem = Double.valueOf(sc.nextLine());
        SinhVien sv = new SinhVien();
        sv.setTen(ten);
        sv.setTuoi(tuoi);
        sv.setGioiTinh(gioiTinh);
        sv.setQueQuan(queQuan);
        sv.setSdt(sdt);
        sv.setEmail(email);
        sv.setDiem(diem);
        sv.display();
    }
}
