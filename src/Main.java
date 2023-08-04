import model.familyTree.ConnectionType;
import model.person.Gender;
import model.person.Person;
import model.service.Service;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Service<Person> service = makeTree();
        System.out.println(service.printTree());
        System.out.println(service.sortByAge());
    }

    public static Service<Person> makeTree() {
        Service<Person> service = new Service<>();
        Person egor = new Person("Егор", "Меньшиков", "Леонидович",
                Gender.MALE, LocalDate.of(1986, 3, 13));
        Person petr = new Person("Петр", "Меньшиков", "Леонидович",
                Gender.MALE, LocalDate.of(1988, 8, 11));
        Person marina = new Person("Марина", "Меньшикова", "Рудольфовна",
                Gender.FEMALE, LocalDate.of(1957, 11, 30));
        Person leonid = new Person("Леонид", "Меньшиков", "Иеронимович",
                Gender.MALE, LocalDate.of(1954, 10, 18));
        service.addPerson(egor);
        service.addPerson(petr);
        service.addPerson(leonid);
        service.addPerson(marina);
        service.putConnection(egor, ConnectionType.PARENT, marina);
        service.putConnection(egor, ConnectionType.SIBLING, petr);
        service.putConnection(egor, ConnectionType.PARENT, leonid);
        service.putConnection(marina, ConnectionType.SPOUSE, leonid);
        service.putConnection(marina, ConnectionType.CHILD, petr);
        service.putConnection(leonid, ConnectionType.CHILD, petr);
        return service;
    }

    public static Service<Person> readTree() {
        Service<Person> result = new Service<>();
        result.read();
        return result;
    }
}

