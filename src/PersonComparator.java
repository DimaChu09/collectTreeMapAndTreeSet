import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int maxCountWords;

    public PersonComparator(int maxCountWords) {
        this.maxCountWords = maxCountWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getWordsSurname() < maxCountWords || o2.getWordsSurname() < maxCountWords) {
            if (o1.getWordsSurname() < o2.getWordsSurname()) {
                return 1;
            } else if (o1.getWordsSurname() > o2.getWordsSurname()) {
                return -1;
            }
        }
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}
