public class CreatePerson {
    private String name;
    private String surname;
    private int age;
    private double many;

    public CreatePerson() {
    }

    public CreatePerson setPersonName(String name) {
        this.name = name;
        return this;
    }

    public CreatePerson setPersonSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public CreatePerson setPersonAge(int age) {
        this.age = age;
        return this;
    }

    public CreatePerson setPersonMany(double many) {
        this.many = many;
        return this;
    }

    public Person createAnHuman() {
        return new Person(name, surname, age, many);
    }
}
