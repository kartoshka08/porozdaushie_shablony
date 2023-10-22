public class PersonBuilder{
    protected String name = "";
    protected String surname;
    protected int age;
    protected String adress;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) {
       this.age = age;
       return this;
    }

    public PersonBuilder setAddress(String address) {
        this.adress = address;
        return this;
    }

    public Person build() throws IllegalAccessException{
        Person newPers = new Person(this.name,this.surname);
        newPers.setAge(this.age)
                .setAddress(this.adress);
        return newPers;
    }
}