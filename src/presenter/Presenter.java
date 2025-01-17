package presenter;

import model.familyTree.ConnectionType;
import model.person.Gender;
import model.person.Person;
import model.service.Service;
import view.View;

import java.time.LocalDate;
import java.util.ArrayList;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        this.service = new Service();
    }

    public void addPerson(String name,
                          String surname,
                          String patronymic,
                          Gender gender,
                          LocalDate dateBirth,
                          LocalDate dateDeath) {
        service.addPerson(name, surname, patronymic, gender, dateBirth, dateDeath);
    }

    public void putConnection(Person connectFrom, ConnectionType key, Person connectTo) {
        service.putConnection(connectFrom, key, connectTo);
    }

    public void oneWayConnection(Person connectFrom, ConnectionType key, Person connectTo) {
        service.oneWayConnection(connectFrom, key, connectTo);
    }

    public String showConnections(Person person) {
        return service.showConnections(person);
    }

    public String sortByAge() {
        return service.sortByAge();
    }

    public String sortByName() {
        return service.sortByName();
    }

    public String printTreeConnections() {
        return service.printTreeConnections();
    }

    public String printTree() {
        return service.printTree();
    }

    public ArrayList<Person> enumeratedList() {
        return service.enumeratedList();
    }

    public void write() {
        service.write();
    }

    public void read() {
        service.read();
    }
}
