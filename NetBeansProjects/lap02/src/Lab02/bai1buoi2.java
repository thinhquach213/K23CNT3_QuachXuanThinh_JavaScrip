package Lab02;

import java.util.Scanner;

public class bai1buoi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cai gi cung duoc (1-12): ");
        int thang = sc.nextInt();
        System.out.println("nhap vao nam:");
        int nam = sc.nextInt();
        int soNgay;

        switch (thang) {
            case 1, 3, 5, 7, 8, 10, 12 -> soNgay = 31;
            case 4, 6, 9, 11 -> soNgay = 30;
            case 2 -> {
                if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0)
                    soNgay = 29;
                else
                    soNgay = 28;
            }
            default -> {
                System.out.println("thang ko hop le!");
                return;
            }
        }

        System.out.printf("Thang %d năm %d có %d ngay.\n", thang, nam, soNgay);
    }
}
