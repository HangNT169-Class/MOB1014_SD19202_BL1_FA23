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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chucNang;
        ArrayList<DienThoai>list = new ArrayList<>();
        DienThoaiService service = new DienThoaiService();
        do {
            System.out.println("Moi ban nhap chuc nang : ");
            chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1: {
                    System.out.println("Chuc nang 1");
                    service.nhapDienThoai(list);
                    break;
                }
                case 2: {
                    System.out.println("Chuc nang 2");
                    service.inDanhSachDienThoai(list);
                    break;
                }
                case 3: {
                    System.out.println("Chuc nang 3");
                    break;
                }
                case 4: {
                    System.out.println("Chuc nang 4");
                    break;
                }
                case 5: {
                    System.out.println("Chuc nang 5");
                    service.sapXepGiamDanTheoTen(list);
                    // in ra
                    service.inDanhSachDienThoai(list);
                    break;
                }
                case 6: {
                    System.out.println("Chuc nang 6");
                    break;
                }
                case 7: {
                    System.out.println("Chuc nang 7");
                    System.out.println("Moi nhap vi tri can xoa:");
                    int viTri = Integer.valueOf(sc.nextLine());
                    service.xoaTheoViTri(list, viTri);
                    System.out.println("List sau khi xoa:");
                    service.inDanhSachDienThoai(list);
                    break;
                }
                case 8: {
                    System.out.println("Chuc nang 8");
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Chuc nang k ton tai");
                    break;
                }
            }

        } while (chucNang != 0);

    }
}
