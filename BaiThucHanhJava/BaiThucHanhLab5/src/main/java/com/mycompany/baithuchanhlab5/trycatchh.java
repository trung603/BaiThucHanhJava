
package com.mycompany.baithuchanhlab5;
import java.util.Scanner;
public class trycatchh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        //nhap kich thuoc mang
        do{
                try{
                    System.out.print("n=");
                    String str = sc.nextLine();
                    n = Integer.parseInt(str);
                }
                catch(Exception ex){
                    
                }
        }while(n < 1);
        //khai bao mang voi kich thuoc vua nhap vao
        int[]A = new int [n];
        //nhap vao cac phan tu cua mang
        for(int i = 0; i < n; i++)
        {
            do{
                try
                {
                        System.out.printf("A[%d] = ",i );
                        String str = sc.nextLine();
                        A[i] = Integer.parseInt(str);
                                
                }catch(Exception ex)
                {
                    A[i] = -2147483648;
                }
            }while(A[i] <= -2147483647);
        }
    }
    //hien thi cac phan tu
}

