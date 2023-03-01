package day5A.example;

public class Main {
    public static void main(String[] args) {
        /*
        --- MENU HINH HOC ---
        1. Thêm hình học (tối đa 100 hình)
        2. In ra tất cả các hình
        3. In ra hình có diện tích lớn nhất
        4. In ra hình có diện tích bé nhất
        5. Sắp xếp theo chu vi tăng dần
        0. Thoát
         */

        HinhHoc[] hinhHocs = new HinhHoc[3];

        hinhHocs[0] = new HinhTron(3);
        hinhHocs[1] = new HinhVuong(4);
        hinhHocs[2] = new HinhChuNhat(5, 6);

        // In ra tat cac hinh
        for (HinhHoc h:  hinhHocs) {
            System.out.println(h);
        }

        // In ra hinh co chu vi lon nhat
        double cvMax = hinhHocs[0].tinhchuVi();
        int vtMax = 0;

        for(int i = 1; i < hinhHocs.length; i++){
            if(cvMax < hinhHocs[i].tinhchuVi()){
                cvMax = hinhHocs[i].tinhchuVi();
                vtMax = i;
            }
        }
        System.out.println("Hinh co chu vi lon nhat la : ");
        System.out.println(hinhHocs[vtMax]);
    }
}
