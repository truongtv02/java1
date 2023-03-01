package btvnday2;

import java.util.Scanner;

public class bai216 {
    public static void main(String[] args) {
        int n;
        int  tongsochan = 0;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = in.nextInt();
        } while (n <= 0);

        int A[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        //trả về độ dài của mảng
        for (int i = 0; i < n; i++) {
//            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = in.nextInt();
        }

        // chẵn trong mảng
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                tongsochan++;
            }
            }
        System.out.println("Số lượng số nguyên chẵn trong mảng = " +tongsochan);
    }
}
