package bao_dong;

public class Student {
  private String fullName;
  private int age;

    public String getName() {
        return fullName;
    }

    public void setName(String name) {
        this.fullName = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=18){
            this.age = age;
        }

    }
}
