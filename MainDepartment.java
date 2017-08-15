package Task02_Structure_v2;

import java.util.ArrayList;

/**
 * Created by mbikov on 15.08.2017.
 */
public class MainDepartment {
    String name;
    ArrayList<Department> department;

    public MainDepartment(String name) {
        this.name = name;
        department = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Department> getDepartment() {
        return department;
    }

    public void addDepartment(Department d) {
        this.department.add(d);
    }
}
