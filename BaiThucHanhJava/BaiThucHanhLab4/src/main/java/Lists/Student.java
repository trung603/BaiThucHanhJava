package Lists;
import java.util.Scanner;
public class Student {
    String FullName;
    int Age;

    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ten:");
        FullName = sc.nextLine();
        System.out.println("Tuoi:");
        Age = sc.nextInt();
    }
    public void Delete() {
        this.Age = 0;
        this.FullName = null;
    }

    public void HienThiThongTin() {
        System.out.printf("Ho va ten: %s, Tuoi: %d",FullName,Age);
    }

    public void ThayDoiThongTin() {
        Scanner sc = new Scanner(System.in);
        int action;
       do {
        System.out.println("Nhap 1 de thay doi ten \nNhap 2 de thay doi tuoi\nNhap 3 De Thay doi Ca Ten Va Tuoi");
        action = sc.nextInt();
       } while (action != 1 || action != 2 || action != 3);
    
        switch (action) {
            case 1:
            System.out.println("Nhap ten can thay doi:");
            String temp = sc.nextLine();
            this.FullName = temp;
                break;
        
            case 2:
            System.out.println("Nhap tuoi can thay doi:");
            int temp2 = sc.nextInt();
            this.Age = temp2;
                break;
            case 3:
            System.out.println("Nhap ten can thay doi:");
            String Ten = sc.nextLine();
            this.FullName = Ten;
            System.out.println("Nhap tuoi can thay doi:");
            int Tuoi = sc.nextInt();
            this.Age = Tuoi;

        }

        
    }
}
