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
public class Main {
    /**
     * Vong lap dung de lap di lap lai 1 cong viec
     * 1.while
     * while(dieukien){
     *      // code
     * }
     * 2.do...while
     * do{
     *  // code
     * }while(dieukien);
     * 3.for
     * for(gia tri khoi tao;dieu kien;buoc nhay){
     *      // code 
     * }
     */
    // VD: 
    // 1. Nhap 1 so nguyen n . In cac so tu 0 - n
    // 2. Nhap 1 so nguyen n. Tinh tong cac so nguyen tu 0-n
    // 3. Nhap 1 so nguyen n. Tinh tich cac so nguyen tu 1-n
    public static void main(String[] args) {
        // B1:
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 so nguyen: ");
        int soNguyen = Integer.parseInt(sc.nextLine());
//        for (int i = 0; i < soNguyen + 1; i++) {
//            System.out.println(i);
//        }
//        int sum = 0;
//        for (int i = 0; i < soNguyen + 1; i++) {
//            sum+=i;
//        }
//        System.out.println("Sum = " +sum);
        int tich = 1;
        for (int i = 1; i < soNguyen + 1 ; i++) {
            tich *=i;
        }
        System.out.println("Tich = "+tich);
    }
}
