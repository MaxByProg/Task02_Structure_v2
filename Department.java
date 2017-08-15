package Task02_Structure_v2;

import java.util.*;

/**
 * Created by mbikov on 09.08.2017.
 */
public class Department {
    private String name;
    private Map<Person, Post> workers;

    public Department(String n) {
        name = n;
    }

    public void addPersonAndPost(Person person, Post post) {
        workers.put(person,post);
        person.setDepartment(this);
        post.setDepartment(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
