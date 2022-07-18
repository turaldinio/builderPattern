public class PersonBuilder {
    private final Person person;

    public PersonBuilder() {
        person = new Person();
    }


    public PersonBuilder setName(String name) {
        person.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        person.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalAccessException {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Указан недопустимый возраст " + age + ". Укажите возраст от 0 до 100 лет");
        }
        person.age = age;
        return this;
    }

    public PersonBuilder setAddress(String city) {
        person.city = city;
        return this;
    }

    public Person build() {
        if (person.getSurname() == null) {
            throw new IllegalStateException("Укажите фамилию");
        }
        if (person.getName() == null) {
            throw new IllegalStateException("Укажите имя");
        }
        return person;
    }

}

