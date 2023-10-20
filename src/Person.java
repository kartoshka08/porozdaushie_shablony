import java.util.OptionalInt;

public class Person extends PersonBuilder {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String adress;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public boolean hasAge() {
        if (this.age == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean hasAddress() {
        if (this.adress == null) {
            return false;
        } else {
            return true;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public OptionalInt getAge() {
        if (hasAge()) {
            return OptionalInt.of(this.age);
        } else {
            return null;
        }
    }

    public String getAddress() {
        if (hasAddress()) {
            return this.adress;
        } else {
            return "no adress";
        }
    }

    public PersonBuilder setAddress(String address) {
        this.adress = address;
        return null;
    }

    public void happyBirthday() {
        this.age++;
    }

    @Override
    public String toString() {
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
        return " ";
    }

//    @Override
//    public int hashCode() { /*...*/ }

    public PersonBuilder newChildBuilder() throws IllegalAccessException {
        PersonBuilder childPers = new PersonBuilder();
        childPers.setSurname(this.surname)
                .setName(this.name)
                .setAge(this.age)
                .setAddress(this.adress)
                .build();
        return childPers;
    }
}