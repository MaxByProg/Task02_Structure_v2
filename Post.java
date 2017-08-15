package Task02_Structure_v2;

/**
 * Created by mbikov on 09.08.2017.
 */
public class Post{
    private String post;
    private boolean boss;
    private Person person;
    private Department department;

    public Post(String p, boolean b) {
        post = p;
        boss = b;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
