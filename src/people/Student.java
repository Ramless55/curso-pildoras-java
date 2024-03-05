package people;

public class Student extends People{
    private String career;

    public Student(String name, String career){
        super(name);
        this.career = career;
    }

    public String getDescription(){
        return "El alumno este estudiando la carrera de: " + career;
    }
}
