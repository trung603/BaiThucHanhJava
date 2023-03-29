import java.text.DecimalFormat;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");

            System.out.println("Nhập vào số thứ nhất: ");
            int so1 = scanner.nextInt();
            System.out.println("Nhập vào số thứ hai: ");
            int so2 = scanner.nextInt();
             
            // 1. Tính tổng, hiệu, tích, thương, phép chia lấy dư của 2 số đó.
            int tong = so1 + so2;
            System.out.println(so1+"+"+ so2 +"="+ tong);

            int hieu = so1 - so2;
            System.out.println(so1 +"-"+ so2 +"-"+ hieu);

            int tich = so1 * so2;
            System.out.println(so1 +"*"+ so2 +"="+ tich);

            float thuong = (float) so1 / so2;
            System.out.println(so1 +"/"+ so2 +"="+ decimalFormat.format(thuong));// làm tròn thương đến 2 chữ số thập phân.
            int PhanDu = so1 % so2;
            System.out.println(so1 +"%"+ so2 +"="+ PhanDu);

            // 2. Sử dụng các toán tử đã học để so sánh 2 số đó.
            System.out.println("Kết quả so sánh bằng 2 số"+ so1 +"và"+ so2 +"là"+ (so1 == so2));
            System.out.println("Kết quả so sánh không bằng 2 số"+ so1 +"và"+ so2 +"là"+ (so1 != so2));
            System.out.println("Kết quả so sánh lớn hơn 2 số"+ so1 +"và"+ so2 +"là"+ (so1 > so2));
            System.out.println("Kết quả so sánh lớn hơn bằng 2 số"+ so1 +"và"+ so2 +"là"+ (so1 >= so2));
            System.out.println("Kết quả so sánh nhỏ hơn 2 số"+ so1 +"và"+ so2 +"là"+ (so1 < so2));
            System.out.println("Kết quả so sánh nhỏ hơn bằng 2 số"+ so1 +"và"+ so2 +"là"+ (so1 <= so2));
        } 
    }
    
}
