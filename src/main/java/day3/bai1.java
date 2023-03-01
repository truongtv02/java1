package day3;

import java.util.Scanner;

public class bai1 {
    public static double chuVi(double r){
        return 2*r*Math.PI;
    }

    public static void printArray(double[] Arr){
        System.out.println("Array:");
        for (Double d: Arr){
            System.out.println(d+"\t");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n= ");
        int n = in.nextInt();
        System.out.println("Nhập các phần tử cho mảng: ");

        double Arr[] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Arr[%d]= ",i);
            Arr[i] = in.nextDouble();
        }
        //Nhap va in ra mang
        printArray(Arr);

        //Duyet mang so thuc -> loc ra nhung gia tri duong
        int count = 0;
        double tongCV = 0; double maxCV = 0;
        for (int i=0; i<n; i++){
            if (Arr[i]>0){
                //cac gia tri hop le
                count ++;
                double cv = chuVi(Arr[i]);
                if (cv> maxCV){
                    maxCV = cv;
                }
                tongCV = tongCV + cv;
            }
        }
        System.out.printf("co tat ca %d chu vi hop le \n",count);
        System.out.println("tong chu vi = "+ tongCV);
        System.out.println("hinh tron co vhu vi lon nhat = "+ maxCV);
    }
}
