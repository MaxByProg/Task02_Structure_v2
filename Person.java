package Task02_Structure_v2;

/**
 * Created by mbikov on 09.08.2017.
 */
public class Person {
    private String name;
    private Post post;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
