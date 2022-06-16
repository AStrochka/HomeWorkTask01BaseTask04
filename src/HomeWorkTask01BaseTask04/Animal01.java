package HomeWorkTask01BaseTask04;

public class Animal01 {
    private String name;
    private int age;

    Animal01(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String getInfo() {
        return this.name + " " + this.age + " лет";
    }
    String getName() {
        return "имя кошки - " + this.name;
    }
    void setAge(int newAge) {
        this.age = newAge;
    }
    int getAge() {
        return age;
    }
}
