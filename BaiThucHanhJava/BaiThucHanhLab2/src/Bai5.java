import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        int number, sum = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            // bắt đầu vòng lặp
            // kiểm tra nếu biến sum còn nhỏ hơn 100 thì còn thực hiện.
            while (sum < 100) {
                System.out.println("Nhập vào số nguyên bất kỳ: ");
                number = scanner.nextInt();
                sum += number;  // sum = sum + number;
            }
        }
         
        System.out.println("Tổng các số nguyên vừa nhập = " + sum);
    }
}
