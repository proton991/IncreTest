package service;

import model.Person;
import repository.PersonRepo;

public class PersonServiceImpl implements PersonService {
    PersonRepo repo;
    @Override
    public void addPerson(Person person) {
        repo.savePerson(person);
    }
}
