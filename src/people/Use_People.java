package people;

public class Use_People {
    public static void main(String[] args){
        People[] people = new People[2];
        people[0] = new Employee("Ramiro", 254000, 21, 11, 2021);
        people[1] = new Student("Majo", "Bioquimica");

        for(People data: people){
            System.out.println("| " + data.getName() + " | " + data.getDescription());
        }
    }
}
