public class PersonBuilder {
    public PersonBuilder(String name , double many){
    this.name = name ;
    this.many = many ;
    }
    private String name;
    private String surname;
    private int age;
    private double many;

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;

    }
    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public Person build(String surname,double many) {
        return new Person(surname,many);
    }

    @Override
    public String toString() {
        return "PersonBuilder{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", many=" + many +
                '}';
    }
}