package day5A.example;

import java.util.Scanner;

public class HinhChuNhat implements HinhHoc{
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(){}
    public HinhChuNhat(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }


    @Override
    public double tinhchuVi(){

    return (chieuRong+chieuDai)*2;
    }

    @Override
    public  double tinhdienTich(){

    return chieuRong*chieuDai;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
    @Override
    public void initFromKeyBoard(Scanner scanner) {
        System.out.print("Nhập chiều dài: ");
        chieuDai = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập chiều rộng: ");
        chieuRong = Double.parseDouble(scanner.nextLine());

    }
}
