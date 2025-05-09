/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class bai3buoi2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,r;
        System.out.println("nhap a: ");
        a=sc.nextInt();
        System.out.println("nhap b: ");
        b=sc.nextInt();
        int bscnn=a*b;
        while (b != 0){
            r=a%b;
            a=b;
            b=r;
        }
        System.out.printf("USCLN la: %d",a);
        System.out.printf("BSCNN la: %d",bscnn/a);
    }
}
