package HomeWorkTask01BaseTask04;

public class Test04 {


    public static void main(String[] args) {
        Animal01 cat = new Animal01("Трнити", 11);
        System.out.println(cat.getInfo());
        Animal01 cat02 = new Animal01("Барс", 15);
        System.out.println(cat02.getInfo());
        String name = cat.getName();
        System.out.println (name);
        String name02 = cat02.getName();
        System.out.println (name02);
        cat.setAge(12);
        int newAge = cat.getAge();
        System.out.println(newAge);
        cat02.setAge(16);
        int newAge02 = cat02.getAge();
        System.out.println(newAge02);
    }
}
