package people;

public abstract class People {
    private String name;

    public People(String name) {
        this.name = name;
    }

    public String getName(){ return this.name; }

    public abstract String getDescription();
}
