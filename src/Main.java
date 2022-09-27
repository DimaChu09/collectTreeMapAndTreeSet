
        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Tom","Polly fon Loper", 34));
        persons.add(new Person("Ron", "Kollins", 33));
        persons.add(new Person("Kelly", "Out my godness fun", 22));
        persons.add(new Person("Set", "Out you godness fun guh", 89));
        persons.add(new Person("Eg", "My godness fun", 21));
        System.out.println(persons);
        Collections.sort(persons, new PersonComparator(2));
        System.out.println(persons);
    }
}
