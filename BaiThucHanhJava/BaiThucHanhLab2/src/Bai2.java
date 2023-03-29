import java.util.Scanner;
public class Bai2 {
     public static void main(String[] args) {
       int n;
       try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Nhập vào số cần kiểm tra n:");
           n = scanner.nextInt();
    }
       // thực hiện câu lệnh if else để kiểm tra điều kiện
       if (n %2 == 0){
        System.out.println(n +"là số chẵn!");
       } else{
        System.out.println(n +"là số lẻ!");
       }

   }
}
