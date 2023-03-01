package day3;

public class bai116 {
    //input, output
    //neu khong hop le -> outphut= -1
    public static long tongS(int n){
        if (n<0){
            return -1;
        }
        long t=0;
        for (int i=1;i<n;i++){
            t=t+i;
        }
        // Lưu ý: ko nên in
        // System.out.println(t);
        return t;
    }
    public static void main(String[] args) {
        System.out.println(tongS(10));
    }
}
