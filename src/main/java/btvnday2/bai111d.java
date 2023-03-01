package btvnday2;

import java.util.Scanner;

public class bai111d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap chieu cao h= ");
        int a,b,h;
        h = in.nextInt();
        System.out.println("Ve tam giac can chieu cao h: \n");
        for (a=1; a<=h; a++)
        {
            if (a!=h)
                for (b=1;b<=2*h-1;b++)
                    if ((b==h-a+1)||(b==h+a-1)) System.out.print("*");
                    else System.out.print(" ");
            for (b=1; b<=h-1; b++)
                System.out.print(" ");
            for (b=1; b<=2*a; b++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
