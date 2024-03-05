package poo;

public class Vehicle {
    //propiedades del objeto de clase.
    private int wheels; //agregar el private encapsula esta propiedad
    private int longCm;
    private int broadCm;
    private int engine;
    private int platformWeight;

    // particulares
    private String colour;
    private int finalWeight;
    private boolean leatherSeats; // asientos cuero
    private boolean heating; // calefaccion

    //metodo constructor

    public Vehicle(){
        wheels = 4;
        longCm = 2000;
        broadCm = 300;
        engine = 1600;
        platformWeight = 500;
    }

    public String getProperties(){ // GETTER
        return "La plataforma del vehiculo tiene " + wheels + " ruedas." + " Mide: " + longCm/1000 + " metros con un ancho de: " + broadCm + " cm y un peso de plataforma de: " + platformWeight + " kg." ;
    }

    public void setColour(String carColour){ // SETTER
        colour = carColour;
    }

    public String getColour(){
        return "El color del auto es: " + colour;
    }

    public void setLeatherSeats(String leatherSeats) {
        this.leatherSeats = leatherSeats.equalsIgnoreCase("si");
    }

    public String getLeatherSeats(){
        if(leatherSeats) return "El auto tiene asientos de cuero";

        return "El auto no tiene asientos de cuero";
    }

    public void setHeating (String heating) {
        this.heating = heating.equalsIgnoreCase("si");
    }

    public String getHeating (){ // SETTER + GETTER A LA VEZ (NO ES RECOMENDABLE HACERLO)
        if(heating){
            return "El auto tiene calefaccion";
        }

        return "El auto no tiene calefaccion";
    }

    public String getWeight(){
        int bodyWeight = 500;

        finalWeight = platformWeight + bodyWeight;

        if(leatherSeats){
            finalWeight += 50;
        }

        if(heating){
            finalWeight += 20;
        }
        return "El peso del auto es: " + finalWeight;
    }

    public int getCarPrice(){
        int finalPrice = 10000;

        if (leatherSeats){
            finalPrice += 2000;
        }

        if (heating) {
            finalPrice += 1500;
        }

        return finalPrice;
    }
}
