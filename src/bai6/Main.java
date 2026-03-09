package bai6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Tú");
        try{
            user.setAge(5);
            System.out.println(user.getName());
            System.out.println(user.getAge());
        }catch (InvalidAgeException e){
            System.err.println("Lỗi: "+e.getMessage()+" - "+ LocalDate.now());
        }


    }
}
