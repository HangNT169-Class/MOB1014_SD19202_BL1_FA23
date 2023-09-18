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
public class Bai3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap tt cua ban: ");
        System.out.println("Nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Nhap tuoi: ");
//        int age = scan.nextInt();
//        String ageStr = scan.nextLine();
//        // Ep String => Integer
//        int age = Integer.valueOf(ageStr);
        int age = Integer.valueOf(scan.nextLine());
//        Float.valueOf(name);
//                Double.valueOf(name);
        // C1: Xoá bộ nhớ đêm như C
        // java => nextLine
        // C2: Ep kieu
        // Coi tat ca moi thu nhap tu ban phim vao
        // luon luon la chuoi 
        // Sau do moi ep kieu ve kieu du lieu tuong ung
//        scan.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = scan.nextLine();
        System.out.println("Nhap chieu cao: ");
        float height = scan.nextFloat();
        // nextLine
//        scan.nextLine();
        System.out.println("Nhap Nganh hoc: ");
        String major = scan.nextLine();
        System.out.println("Nhap ky hoc: ");
        String semester = scan.nextLine();
        System.out.println("Nhap que quan: ");
        String country = scan.nextLine();

        System.out.println("Thong tin cua ban la:");
        System.out.println("Ten la: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Dia chi la: " + address);
        System.out.println("Chieu cao la: " + height);
        System.out.println("Nganh hoc la: " + major);
        System.out.println("Ky hoc: " + semester);
        System.out.println("Que quan la: " + country);

    }
}
