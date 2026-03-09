package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Tổng số người dùng: ");
        int total = Integer.parseInt(sc.nextLine());
        System.out.printf("Số lượng nhóm muốn chia: ");
        int group = Integer.parseInt(sc.nextLine());
        try{
            int newGroup = total/group;

            System.out.printf("Mỗi nhóm có %d người\n", newGroup);
        }catch(ArithmeticException e){
            System.out.println("Không thể chia cho 0");
        }

        System.out.println("Chương trình đang tiếp tục chạy");

    }
}
