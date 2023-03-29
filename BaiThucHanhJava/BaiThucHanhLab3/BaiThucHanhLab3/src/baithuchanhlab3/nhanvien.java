package baithuchanhlab3;
import java.util.Scanner;
public class nhanvien {
    String hoten;
    int tuoi;
    float hesoluong;
    final float luongcoban = 1490000f;
    float luong;
    void nhaphoten()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ho va ten:");
        hoten = sc.nextLine();
    }
    void nhaptuoi()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao tuoi:");
        tuoi = sc.nextInt();
    }
    void hesoluong()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao he so luong:");
        hesoluong = sc.nextInt();
    }
    void tinhluong()
    {
        luong = hesoluong * luongcoban;
    }
    void hienthi()
    {
        System.out.printf("hoten:%s, tuoi:%d, hesoluong:%f, luong:%f", hoten, tuoi, hesoluong, luong);
    }
    
}
