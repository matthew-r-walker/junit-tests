public class Person {
    private String name;

    public boolean isCool() {
        return isCool;
    }

    public void setCool(boolean cool) {
        isCool = cool;
    }

    private boolean isCool;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, boolean isCool) {
        this.name = name;
        this.isCool = isCool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
