package Lists;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo {
    public static void main(String[] args) {
        System.out.println("Nhap vao so phan tu cua Arraylist:");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        ArrayList<Student> arr = new ArrayList<Student>();

        for (int i = 0 ; i < temp; i++){
            System.out.println("Phan tu thu "+ (i +1));
            Student a = new Student();
            a.NhapThongTin();
            arr.add(a);
        }

        for (int i = 0 ; i < arr.size(); i++){
            System.out.println("STT "+ (i + 1));
            arr.get(i).HienThiThongTin();
            System.out.println();
        }
        

        int TempAction;
        do{
            System.out.println("Menu \n1:Them phan tu  \n2:Xoa Phan tu tai vi tri i \n3:Hien thi danh sach \n4:Sua Thong Tin tai vi tri i\n5:Thoat chuong trinh");
            TempAction = sc.nextInt();
        switch (TempAction) {
            case 1:
                Student tempStudent = new Student();
                tempStudent.NhapThongTin();
                arr.add(tempStudent);
                break;
            case 2:
                System.out.println("Vi Tri Can Xoa:");
                int Position = sc.nextInt();
                arr.get(Position - 1).Delete();
                break;
            case 3:
            for (int i = 0 ; i < arr.size(); i++){
                System.out.println("STT "+ (i + 1));
                arr.get(i).HienThiThongTin();
            }
            break;
            case 4:
            System.out.println("Vi Tri Can Thay Doi:");
            int Position2 = sc.nextInt();
            arr.get(Position2 - 1).ThayDoiThongTin();
            break;
            default:
                break;
        }
        }while( TempAction!= 5);
}
}
