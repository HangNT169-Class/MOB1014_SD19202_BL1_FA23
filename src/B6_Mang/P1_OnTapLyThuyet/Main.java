/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B6_Mang.P1_OnTapLyThuyet;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {
    /**
     * Mảng là tập hơn chứa tất cả các phần tử cùng kiểu dữ 
     * Co 2 loại mảng:
     *  - Mảng cố định(cố định size n. Chỉ được phép maxping n phần tử)
     *  - Mảng động : Size là động k cần quản tâm hay nhập vào size(học sau)
     * // VD:       -3, 9, 6, 7 => giá trị của các phần tử trong mang
     * => Vị trí :   0  1  2  3
     * Vị trí trong mảng luôn luôn bắt đầu bằng 0
     * và kết thuc là n -1
     * Mang :
     *  - gia tri
     *  - vi tri 
     * Gia tri cua vi tri dau tien: arr[0]
     * Gia tri o vi tri cuoi cung : arr[n-1]
     * Gia tri o vi tri i bat ki : arr[i]
     */
    // Luyen tap
    // Nhap 1 mang so nguyen gom n phan tu.
    // In mang so nguyen ra man hinh
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // B1: Nhap so luong phan tu trong mang
        System.out.print("Nhap vao so luong phan tu cua mang: ");
        int n = Integer.parseInt(sc.nextLine());
        // B2: Khai bao mang
        int arr[] = new int[n]; // 5
        // B3: Nhap cac phan tu vao mang
        // Cac phan tu trong mang se duoc nhap tu ban phim
        // => viec lap di lap lai => vong lap
        System.out.println("Moi nhap cac phan tu trong mang:");
        for (int i = 0; i < n; i++) {
            // nhap cac so tu ban phim
            arr[i]=Integer.valueOf(sc.nextLine());
        }
        // B4: In ra man hinh
        System.out.println("Cac phan tu trong mang la:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
