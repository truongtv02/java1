package day3;

import java.util.Scanner;

public class bai105 {
    public static String sosangchu(int n){
        String[] so = {"Không","Một","Hai","Ba","Bốn","Năm","Sáu","Bảy","Tám","Chín"};
        if (n<0 || n>99){
            return  "Không thể thực hiện!";
        }
        if(n < 100){
            return so[n];
        }
        //con lai la lon hon 10->99
        //Xac dinh chu va don vi
        int chuc = n/10;
        int donvi = n%10;

        String tmp = " ";
        if (chuc == 1){
            tmp += "Mười";
        }
        else {
            tmp = tmp + so[chuc] + "mươi";
        }
        //hang don vi
        if (donvi == 1){
            tmp += "một";
        } else if (donvi == 5)
        {
         tmp += "lăm";
        }
        else {
            tmp += so[donvi];
        }
return tmp;
    }

    public static void main(String[] args) {

        }
    }
