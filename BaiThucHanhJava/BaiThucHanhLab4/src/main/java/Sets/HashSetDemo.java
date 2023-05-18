package Sets;
import java.util.HashSet;
import java.util.Scanner;
import Lists.*;
public class HashSetDemo {
    public static void main(String[] args) {
        System.out.println("Nhap vao so phan tu cua HashSet:");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        HashSet<Student> SET = new HashSet<>();

        for (int i = 0 ; i < temp; i++){
            System.out.println("Phan tu thu "+ (i +1));
            Student a = new Student();
            a.NhapThongTin();
            SET.add(a);
        }
        

        int TempAction;
        do{
            System.out.println("Menu \n1:Them phan tu  \n2:Xoa Phan tu  \n3:Hien thi danh sach \n4:Sua Thong Tin\n5:Thoat chuong trinh");
            TempAction = sc.nextInt();
        switch (TempAction) {
            case 1:
                Student tempStudent = new Student();
                tempStudent.NhapThongTin();
                if(SET.contains(tempStudent)){
                    System.out.println("Them Phan Tu Khong Thanh Cong");
                } else {
                    SET.add(tempStudent);
                }
                break;
            case 2:
                System.out.println("Phan tu Can Xoa:");
                Student tempStudent2 = new Student();
                tempStudent2.NhapThongTin();
                for (Student element : SET) {
                    if(element == tempStudent2) SET.remove(tempStudent2);
                }
                break;
            case 3:
            for (Student element : SET) {
                element.HienThiThongTin();
                System.out.println();
            }
            break;
            case 4:
            System.out.println("thong tin Phan tu Can thay doi:");
            Student tempStudent3 = new Student();
                tempStudent3.NhapThongTin();
                if(SET.contains(tempStudent3)){
                System.out.println("Nhap Thong tin:");
                Student a = new Student();
                a.NhapThongTin();
                if(SET.contains(a)){
                    System.out.println("Them Phan Tu Khong Thanh Cong");
                    
                } else {
                    SET.add(a);
                    SET.remove(tempStudent3);
                }

            }
            break;
            default:
                break;
        }
        }while( TempAction!= 5);
}
}
