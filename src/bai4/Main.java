package bai4;

import java.io.IOException;

public class Main {
    // Method C
    public static void saveToFile() throws IOException {
        System.out.println("Đang ghi dữ liệu vào file");

        // Giả lập lỗi khi ghi file
        throw new IOException("Lỗi ghi file");
    }

    // Method B
    public static void processUserData() throws IOException {
        System.out.println("Đang xử lý dữ liệu người dùng");

        // Gọi method C và đẩy lỗi lên trên
        saveToFile();
    }

    // Method A
    public static void main(String[] args) {
        try {
            processUserData(); //gọi method B
        }
        catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi lưu dữ liệu: " + e.getMessage());
        }
    }
}
