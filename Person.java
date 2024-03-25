public class Person {
    private String name;
    private String surname;
    private int age;
    private String email;
    private String password;

    protected Person(PersonBuilder builder){
        this.name = builder.getName();
        this.age = builder.getAge();
        this.surname = builder.getSurname();
        this.email = builder.getEmail();
        this.password = builder.getPassword();
    }
    public static PersonBuilder builder(String email , String password){
        return new PersonBuilder(email,password);
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", age=" + age + ", email='" + email + '\'' + ", password='" + password + '\'' + '}';
    }
}

