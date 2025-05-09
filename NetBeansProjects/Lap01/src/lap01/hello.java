/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap01;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class hello {
    
     public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        s = sc.nextLine();
        System.out.println("Hello " + s);
        sc.close();
    }
}
