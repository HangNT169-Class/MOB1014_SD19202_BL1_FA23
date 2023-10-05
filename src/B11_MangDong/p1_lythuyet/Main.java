/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11_MangDong.p1_lythuyet;

import java.util.ArrayList;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * Mang trong C: Bat buoc phai nhap vao size roi moi khai bao mang => Lang
     * phi bo nho => Mang dong : Khong can quan tâm size của phần tử. =>
     * Collections . J1: ArrayList. Cu pháp:
     */
//    ArrayList<Kieu du lieu>ten bien = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        // kiem tra so phan tu : size
        System.out.println(lists.size());
        // Them phan tu : add
        lists.add("IT17317");
        lists.add("IT17307");
        lists.add("abc");
//        System.out.println("Size luc sau = " + lists.size());
//        // Xoa : 
//        lists.remove(0);// remove truyen vao vi tri can xoa
//        lists.remove("IT17307");// remove truyen vao gia tri muon xoa
//        System.out.println("Size luc sau = " + lists.size());
        // Mang co dinh : arr, vi tri i
        // gia tri o vi tri i : arr[i]
        // Mang dong : lists, vi tri i 
        // gia tri o vi tri i : lists.get(i)
        // In cac phan tu trong mang
        // C1: for thuong (for i)
//        for (int i = 0; i < lists.size(); i++) {
//            System.out.println(lists.get(i));
//        }
        // C2: for each
//        for (String str : lists) {
//            System.out.println(str);
//        }
        // C3: for each + lamda(->): Java 8 
//        lists.forEach(s->System.out.println(s));
        // Tao 1 class DongVat gom cac thuoc tinh maDV - String,
        // ten - String, canNang - double va cac contructor getter, setter
        // inThongTin(): void
        // Tao class Main. 
        //Su dung ArrayList de luu thong tin cua doi tuong dong 
        //vat vua nhap tu ban phim va in ra man hinh
    }
}
