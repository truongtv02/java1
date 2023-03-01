package day3;
/*
-METHODS == FUCNTION: HÀM (CHƯƠNG TRÌNH CON)
-SỬ DỤNG CHO NỮNG CÔNG VIỆC LẶP LẠI, CẦN TÁI SỬ DỤNG NHIỀU LẦN

 ** modifier returnType nameOfMethod( Paramerter Lít) {
        //method body
}
 **returntype: kiểu giá trị trả về
 ** nameofmethod: tên phương thức
- parameters: danh sách tham số

phân loại method-function:
loại 1: ko có tham số và ko có giá trị trả về
loại 2: ko có tham số nhưng có gt trả về
loại 3: có tham sô và ko có gt trả về
looại 4: có tham số và có gt trả về
 */
public class function {
    // static: tĩnh

    public static double chuvi(double a, double b){
        if (a>0 && b>0){
            return (a+b)*2;
        }
        return -1;
    }
    public static void main(String[] args) {
        double t = chuvi(4,5);
        System.out.println(t);
    }
}
