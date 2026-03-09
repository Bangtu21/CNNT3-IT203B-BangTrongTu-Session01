package bai5;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        try{
            user.setAge(-10);
            System.out.printf("Tuổi: %d", user.getAge());
        }catch(InvalidAgeException e){
            System.out.println("Lỗi: "+e.getMessage());
        }
    }
}
