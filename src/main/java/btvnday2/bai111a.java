package btvnday2;

import java.util.Scanner;

public class bai111a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //chieu cao h=4, toi da la 2h-1

        System.out.print("Nhap chieu cao h= ");
        int a,b,h;
        h = in.nextInt();
        System.out.println("Ve tam giac can chieu cao h: \n");
        for (a=1; a<=h; a++)
        {
            for (b=1; b<=h-a; b++)
                System.out.print(" \t");
            for (b=1; b<=2*a-1; b++)
                System.out.print("*\t");
            System.out.print("\n");
        }
    }
}
