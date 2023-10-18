public class PersonBuilder {
    static String name = "";
    static String surname = "";
    static int age = 0;
    static String adress = "";

    public PersonBuilder setName(String name) {
        this.name = name;
        return null;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return null;
    }
    public PersonBuilder setAge(int age) {
        this.age = age;
        return  null;
    }

    public PersonBuilder setAddress(String address) {
        this.adress = address;
        return null;
    }

    public Person build() throws IllegalAccessException{
        PersonBuilder newPers = new PersonBuilder();
        newPers.setName(this.name).setSurname(this.surname).setAge(this.age).setAddress(this.adress);
        return null;
    }
}