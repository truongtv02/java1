package btvnday2;

import java.util.Scanner;

public class bai110 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a,b,c;
//        int count = 0;
//        for (a=1; a<=200;a++);
//        for (b=1; b<=100;b++);
//        for (c=1; a<=40 ;c++);
//            if (a * 1000 + b * 2000 + c * 5000 == 200000) {
//                System.out.printf("\n Co %2d to 1k, %2d to 2k, %2d to 5k\n", a, b, c);
//                count ++ ;
//            }
//            System.out.printf("Co %d phuong an", count);
        int sum = 200000;
        int count = 0;
        for(int i = 0; i <= (sum/1000); i++)
            for(int j = 0; j <= (sum/2000); j++)
                for(int z = 0; z <= (sum/5000); z++)
                    if((i*1000 + j*2000 + z*5000 == sum))
                        count ++;
        System.out.println(count);
    }
}
