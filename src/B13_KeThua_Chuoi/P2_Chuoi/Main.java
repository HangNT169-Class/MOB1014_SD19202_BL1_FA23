/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13_KeThua_Chuoi.P2_Chuoi;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * Cac ham hay dung String
     */
    public static void main(String[] args) {
        String str = "HangNT169";
        // Do dai cua 1 string: length()
        //System.out.println(str.length());
        // So sanh 2 chuoi
        // 1.compareTo => Phan biet hoa thuong => tra ve int
        //System.out.println(str.compareTo("hangnt169"));
        // >0 => chuoi 1 > chuoi 2
        // = 0=> 2 chuoi = 
        // <0 => chuoi 1 < chuoi 2 
        // dua vao bang ma ascii
        // 2.compareToIgnoreCase => Khong phan biet hoa thuong => int
        //System.out.println(str.compareToIgnoreCase("hangnt169"));
        //3. equals => Phan biet hoa thuong => boolean
        //System.out.println(str.equals("hangnt169"));
        // 4. equalsIgnoreCase => k phan biet hoa thuong => boolean
        //System.out.println(str.equalsIgnoreCase("hangnt169"));
        // Viet hoa het => toUpperCase()
//        System.out.println(str.toUpperCase());
//        // Viet thuong het => toLowerCase()
//        System.out.println(str.toLowerCase());
        // Xoa khoang cah dau , cuoi => trim()
//        System.out.println(str.trim());
        // xoa khoang cach giua => regex trong Java =>matches
//        str.matches(" truyen doan regex vao day")
        //han g => hang
        // Kiem tra chua => contains
        // => Kiem tra su xuat hien cua 1 chuoi khac trong chuoi ban dau
//        System.out.println(str.contains("H"));
        // kiem tra chuoi bat dau bang => startsWith
        System.out.println(str.startsWith("H"));
        // Kiem tra chuoi ket thuc bang => endsWith
        System.out.println(str.endsWith("9"));
    }
}
