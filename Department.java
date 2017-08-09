package Task02_Structure_v2;

import java.util.*;

/**
 * Created by mbikov on 09.08.2017.
 */
public class Department {
    private String name;
    private Set workers = new HashSet();

    public Department(String n) {
        name = n;
    }

    public void addPost(Post p) {
        workers.add(p);
        p.setDepartment(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
