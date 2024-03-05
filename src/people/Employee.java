package people;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends People{
    private double payment;
    private Date registration;
    private final int id;
    private static int autoincrementId = 1;

    public Employee(String name, double payment, int year, int month, int day){
        super(name);
        this.payment = payment;
        id = autoincrementId++;

        GregorianCalendar calendar = new GregorianCalendar(year, month - 1,  day);

        this.registration = calendar.getTime();
    }

    public String getDescription(){
        return "Este empleado tiene un Id: " + id + " con un un sueldo igual a: " + payment;
    }

    public double getPayment(){
        return payment;
    }

    public Date getRegistration(){
        return registration;
    }

    public void upgradePayment(double persent){
        double upgrade = payment * persent/100;
        payment+=upgrade;
    }
}
