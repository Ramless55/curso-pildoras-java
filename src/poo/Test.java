package poo;

public class Test {
    public static void main(String[] args){
        Employees employee1 = new Employees("Ramiro");
        Employees employee2 = new Employees("Nazareno");

        employee1.setSection("Programador");

        System.out.println(employee1.getData() + "\n" + employee2.getData());
        System.out.println(Employees.getAutoincrementId());
    }
}

class Employees{
    private final String name; //esto es una constante encapsulada.
    private String section;
    private final int id;
    private static int autoincrementId = 1; //esta variable puede ser accesible por cualquier instancia de la clase.

    public Employees(String name){
        this.name = name;
        this.section = "Administracion";
        id = autoincrementId++;
    }

    public static String getAutoincrementId(){
        return "El siguiente id es: " + autoincrementId;
    }

    public void setSection(String section){
        this.section = section;
    }

    public String getData(){
        return "El nombre es: " + this.name + " y la seccion es: " + this.section + " y el ID es: " + this.id;
    }
}