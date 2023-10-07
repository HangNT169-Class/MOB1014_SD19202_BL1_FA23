/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B12_BaiMauCRUD;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class DienThoaiService {
    // Co bao nhieu chuc nang => it nhat co bang day ham

    public void nhapDienThoai(ArrayList<DienThoai> lists) {
        // Dien thoai : ma - int, ten - String, hang - String, mau - String,
        // boNho - int, gia - int 
        Scanner sc = new Scanner(System.in);
        // B1: Nhap toan bo du lieu cua doi tuong tu ban phim 
        System.out.println("Moi nhap vao ma dt: ");
        int ma = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap vao ten dt: ");
        String name = sc.nextLine();
        System.out.println("Nhap vao hang dt: ");
        String hang = sc.nextLine();
        System.out.println("Nhap vao mau dt: ");
        String mau = sc.nextLine();
        System.out.println("Nhap vao bo nho: ");
        int boNho = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap vao gia dt: ");
        int gia = Integer.valueOf(sc.nextLine());
        // B2: Khoi tao 1 doi tuong (contructor)
        DienThoai dt = new DienThoai(ma, name, hang, mau, boNho, gia);
        // B3: Add vao list
        lists.add(dt);
    }

    public void inDanhSachDienThoai(ArrayList<DienThoai> listDienThoai) {
        for (DienThoai dt : listDienThoai) {
            dt.inThongTin();
        }
    }

    // ten => String => compareTo 
    public void sapXepGiamDanTheoTen(ArrayList<DienThoai> a) {
        a.sort((o1, o2) -> {
            return o2.getTen().compareTo(o1.getTen()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        });
    }

    // gia (int) => -
    public void sapXepTangDanTheoGia(ArrayList<DienThoai> b) {
        b.sort((o1, o2) -> {
            return o1.getGia() - o2.getGia(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        });
    }
    
    public void xoaTheoViTri(ArrayList<DienThoai>lists , int viTri){
        lists.remove(viTri);
    }
    
}
