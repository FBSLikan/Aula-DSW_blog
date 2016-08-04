/**
 * Created by sbmmartins on 8/3/16.
 */
public class Author {
    private String name;
    private String id;

    public Author(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void print() {
        System.out.println("-----------------");
        System.out.println("- Author: " + this.name);
        System.out.println("- ID: " + this.id);
        System.out.println("-----------------");
    }
}















