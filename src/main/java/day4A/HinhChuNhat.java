package day4A;

public class HinhChuNhat {
    private double chieuDai = 1;
    private double chieuRong = 1;
    public HinhChuNhat(){
    }

    public HinhChuNhat(double chieuDai, double chieuRong){
        if (chieuDai >= 0 && chieuRong > 0){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;}

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
    public double chuVi(){
        return (chieuRong + chieuDai)*2;
    }
    public double dienTich(){
        return chieuDai*chieuRong;
    }

    @Override
    public String toString() {

        return getClass().getSimpleName()+"{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                ", chuVi="+chuVi()+
                ", dienTich="+dienTich()+
                '}';
    }
}
