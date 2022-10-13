public class Person {

    private String name;
    private String surname;
    private int age;

    private int maxLastNameLength = 0;

    public Person (String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setName () {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setSurname () {
        this.surname = surname;
    }

    public String getSurname () {
        return surname;
    }

    public void setAge () {
        this.age = age;
    }

    public int getAge () {
        return age;
    }

    public String toString () {
        return name + " " + surname + ", возраст " + age;
    }
}
