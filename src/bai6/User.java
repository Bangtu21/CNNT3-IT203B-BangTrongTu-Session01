package bai6;

public class User {
    String name;
    int age;

    public void setName(String name) {
        if (name!=null && !name.isEmpty()){
            this.name = name;
        }else{
            System.out.println("Tên không được để trống");
        }
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age<0){
            throw new InvalidAgeException("Tuổi không hợp lệ");
        }else{
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
