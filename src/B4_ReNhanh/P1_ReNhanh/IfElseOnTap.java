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
public class IfElseOnTap {

    /**
     * if(dieukien){ // Code }else if(dieu kien){ // code }// Co the co rat
     * nhieu else if else{ // Cac truong hop con lai } Luon luon chi co 1 if, 1
     * else - ket thuc con lai bn dk => else if
     */
    // VD:
    // B1: Nhap vao 1 so kiem tra day la so chan hay le
    // B2: Nhap vao 1 so.
    // Kiem tra day la so >5 hay =5 hay <5 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap :");
        int number = Integer.valueOf(sc.nextLine());
//        if (number % 2 == 0) {
//            System.out.println("Day la so chan");
//        } else {
//            System.out.println("Day la so le ");
//        }
        if (number > 5) {
            System.out.println("Day la so lon hon 5");
        } else if (number == 5) {
            System.out.println("Day la so 5");
        } else {
            System.out.println("Day la so nho hon 5");
        }
    }
}
