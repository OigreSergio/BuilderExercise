public class Person {
    private String name;
    private String surname;
    private int age;
    private double many;

    public Person(String name, String surname, int age, double many) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.many = many;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", many=" + many +
                '}';
    }
}
