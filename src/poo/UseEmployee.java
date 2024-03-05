package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class UseEmployee {
    public static void main(String[] args){
        Boss boss = new Boss("Juan", 245000, 2023, 11, 21);
        boss.setIncentive(600);

        Employee[] employees = new Employee[6];

        employees[0] = new Employee("Ramiro Morales", 245000, 2023, 11, 21);
        employees[1] = new Employee("Carlos Santana", 200000, 2022, 10, 20 );
        employees[2] = new Employee("Rodrigo Perez", 400000, 1998, 5, 20);
        employees[3] = new Employee("Carlos Santana");
        employees[4] = boss; //Polimorfismo en accion. Principio de sustitucion.
        employees[5] = new Boss("Maria", 95000, 1999, 5, 26);

        //esto es casting o refundicion, o como mejor llamado como transformacion de tipo.
        //esto se hace debido a que el objeto es de tipo 'Employee' (debido a que de este tipo es el array) y necesitamos utilizar el metodo setIncentive que es de la clase 'Boss'
        Boss boss_finance = (Boss) employees[5];

        boss_finance.setIncentive(55000);

        for(Employee employee: employees){
            employee.upgradePayment(5);
        }

        Arrays.sort(employees);

        for(Employee employee: employees){
            System.out.println("Nombre: " + employee.getName() + " Sueldo: " + employee.getPayment() + " Fecha de alta: " + employee.getRegistration());
        }

/*        for(int i = 0; i < 3; i++){
            System.out.println("Nombre: " + employees[i].getName() + " Sueldo: " + employees[i].getPayment() + " Fecha de alta: " + employees[i].getRegistration());
        }*/
    }
}

class Employee implements Comparable{
    private String name;
    private double payment;
    private Date registration;
    private final int id;
    private static int autoincrementId = 1;

    public Employee(String name, double payment, int year, int month, int day){
        this.name = name;
        this.payment = payment;
        id = autoincrementId++;

        GregorianCalendar calendar = new GregorianCalendar(year, month - 1,  day);

        this.registration = calendar.getTime();
    }

    public Employee(String name){
        this(name, 30000, 2000,1,1);
    } 

    public String getName(){
        return name + " Id: " + id;
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

    public int compareTo (Object myObject){
        Employee otherEmployee = (Employee) myObject;

        if(this.payment < otherEmployee.payment){
            return -1;
        }

        if(this.payment > otherEmployee.payment){
            return 1;
        }

        return 0;
    }
}

 final class Boss extends Employee{
    private double incentive;

    public Boss(String name, double payment, int year, int month, int day){
        super(name, payment, year, month, day);
    }

    public void setIncentive(int incentive){
        this.incentive = incentive;
    }

    public double getPayment(){
        double payment = super.getPayment();
        return payment + this.incentive;
    }
}
