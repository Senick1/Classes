package сlass4;

public class Cat {
    static String name;
    static int age;
    static String randomName = "";
    private String nameFor;
    private int ageFor;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Cat.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Cat.age = age;
    }

    public Cat(String nameFor, int AgeFor) {
        this.nameFor = nameFor;
        this.ageFor = ageFor;
    }

    public Cat() {
    }
    @Override
    public String toString() {
        return "Cat{" +
                "nameFor='" + nameFor + '\'' +
                ", ageFor=" + ageFor +
                '}';
    }
}