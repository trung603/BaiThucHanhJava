package com.mycompany.baithuchanhlab5;
import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan tu: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Mang da nhap la: ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
        catch (Exception ex ){
            System.out.println("loi:");
        }
        finally{
            System.out.println("vui long nhap dung du lieu ");
        }
  }
}    


