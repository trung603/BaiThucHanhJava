package com.mycompany.baithuchanhlab4;
import java.util.ArrayList;
import java.util.Scanner;

public class Slide22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Nhap vao Kich Thuoc cua mang:"); // import value of arraylist
        int number = sc.nextInt();
        for(int i = 0; i< number; i++){
            System.out.println("Nhap vao gia tri thu"+(i+1));
            int temp = sc.nextInt();
            arr.add(temp);
        }

        int max,min; 
        max = min = arr.get(0); //find min max
        for(int temp : arr){
            if(temp > max) max = temp;
            if(temp < min) min = temp;
        }
        System.out.printf("gia tri lon nhat: %d, Gia tri nho nhat: %d",max,min);

    }
    
}
