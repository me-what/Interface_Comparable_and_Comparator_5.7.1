import java.util.Comparator;

class PersonNameComparator implements Comparator<Person> {
    public int compare(Person a, Person b){
        return a.getName().compareTo(b.getName());
    }
}
