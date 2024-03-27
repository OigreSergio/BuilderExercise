class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAdress(String email) {
        this.address = email;
        return this;
    }

    public Person build() {
        return new Person(this);
    }

    @Override
    public String toString() {
        return "PersonBuilder{" +
                "name ='" + name + '\'' +
                ", surname ='" + surname + '\'' +
                ", age =" + age +
                ", address ='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return address;
    }
}
