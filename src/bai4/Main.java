package bai4;

import java.io.IOException;

public class Main {
    // Method C
    public static void saveToFile() throws IOException {
        System.out.println("Working c");

        // Giả lập lỗi
        throw new IOException("Lỗi c");
    }

    // Method B
    public static void processUserData() throws IOException {
        System.out.println("Working B");

        // Gọi method C và đẩy lỗi lên trên
        saveToFile();
    }

    // Method A
    public static void main(String[] args) {
        try {
            processUserData(); //gọi method B
        }
        catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }
}
