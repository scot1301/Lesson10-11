import java.util.*;
public class PeopleList {

    
    public static void main(String[] args) {
        ArrayList people = new ArrayList();
        
        Person p = new Person("Bob", 32);
        people.add(p);
        people.add(new Person("John", 91));
        people.add(new Person("Melissa", 15));
        for (int x=0; x<people.size(); x++){
            p = (Person)people.get(x);
            System.out.println(p);
            
        }
        people.remove(1);
    }
    
}
