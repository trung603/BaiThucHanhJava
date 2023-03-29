import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        System.out.println("Input integer(1-7):");
        try (Scanner sc = new Scanner(System.in)) {
            int in = sc.nextInt();
                switch (in) {
                    case 1:
                        System.out.println("Ban vua chon Chu Nhat");
                        break;
                    case 2:
                        System.out.println("Ban vua chon Thu Hai");
                        break;
                    case 3:
                        System.out.println("Ban vua chon Thu Ba");
                        break;
                    case 4:
                        System.out.println("Ban vua chon Thu Tu");
                        break;
                    case 5:
                        System.out.println("Ban vua chon Thu Nam");
                        break;
                    case 6:
                        System.out.println("Ban vua chon Thu Sau");
                        break;
                    case 7:
                        System.out.println("Ban vua chon Thu Bay");
                        break;
                    default:
                        System.out.println("Input need to be >= 1 and <= 7:");
                }
        }
            
        }
}
