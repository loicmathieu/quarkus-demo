package fr.loicmathieu.demo.quarkus.domain.impl;

import fr.loicmathieu.demo.quarkus.domain.Person;
import fr.loicmathieu.demo.quarkus.domain.PersonService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class PersonServiceImpl implements PersonService {
    @Inject
    private PersonRepository personRepository;

    @Override
    @Transactional
    public void set(Person person) {
        System.out.println("toto");
        personRepository.set(person);
    }

    @Override
    public List<Person> list(){
        return personRepository.list();
    }

    @Override
    public Person get(Long id) {
        return personRepository.get(id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        personRepository.delete(id);
    }
}
