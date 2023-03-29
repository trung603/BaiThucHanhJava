import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        int age, year;
        String name, ageGroup;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhập vào tên: ");
            name = scanner.nextLine();
            System.out.println("Nhập vào năm sinh: ");
            year = scanner.nextInt();
        }

        // Xác định độ tuổi tương ứng
        age = 2023 - year; // 2023 là năm hiện tại
        if (age < 16 ){
            ageGroup = "Tuổi vị thành niên.";
        } else if (age >= 16 || age < 18 ){
            ageGroup = "Tuổi trưởng thành.";

        } else {
            ageGroup = "Đã già.";
        }

        System.out.println("Bạn"+ name +"thuộc nhóm"+ ageGroup);


    }
}
