package fr.loicmathieu.demo.quarkus.domain;

import java.util.List;

public interface PersonService {
    public void set(Person person);
    public Person get(Long id);
    public List<Person> list();
    public void delete(Long id);
}
