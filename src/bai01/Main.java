package bai01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try{
            System.out.printf("Nhập năm sinh của bạn: ");
            String year = sc.nextLine();

            int birth = Integer.parseInt(year);

            int age = 2026 - birth;
            System.out.println("Tuổi của bạn: "+age);
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Bạn phải nhặp năm sinh là số");
        } finally {
            System.out.println("Đang dọn dẹp");
        }
    }
}
