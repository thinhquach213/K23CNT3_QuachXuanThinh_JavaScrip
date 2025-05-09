/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lap01;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Lap01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner (System.in);
         System.out.print("Nhap vao so bat ky :");
         int a, b, c;
         a=sc.nextInt();
         b=sc.nextInt();
         c=a+b;
         System.out.printf("Tong cua 2 so la: %d",c);
         sc.close();
    }
    
}
