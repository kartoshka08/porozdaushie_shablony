public class PersonBuilder {
    protected String name = "";
    protected String surname;
    protected int age;
    protected String adress;
    protected PersonBuilder person;

    public PersonBuilder setName(String name) {
        person.name = this.name;
        return person;
    }

    public PersonBuilder setSurname(String surname) {
        person.surname = surname;
        return person;
    }
    public PersonBuilder setAge(int age) {
        person.age = age;
        return person;
    }

    public PersonBuilder setAddress(String address) {
        person.adress = address;
        return person;
    }

    public Person build() throws IllegalAccessException{
        PersonBuilder newPers = new PersonBuilder();
        newPers.setName(this.name)
                .setSurname(person.surname)
                .setAge(person.age)
                .setAddress(person.adress);
        Person person1 = (Person) newPers;
        return person1;
    }
}