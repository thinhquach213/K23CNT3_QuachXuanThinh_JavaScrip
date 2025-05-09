package Lab02;

import java.util.Scanner;

public class bai2buoi2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen duong: ");
        int n = sr.nextInt();

        if (n <= 1) {
            System.out.println(n + " khong phai so nguyen to.");
        } else {
            boolean nt = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    nt = false;
                    break;
                }
            }

            if (nt) {
                System.out.println(n + " la so nguyen to.");
            } else {
                System.out.println(n + " khong phai so nguyen to.");
            }
        }

        sr.close();
    }
}
