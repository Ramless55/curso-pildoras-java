package poo;

public class Van extends Vehicle {
    private int carryingCapacity;
    private int extraPlaces;

    public Van(int extraPlaces, int carryingCapacity) {
        super(); //llamar al constructor de la clase padre

        this.carryingCapacity = carryingCapacity;
        this.extraPlaces = extraPlaces;
    }

    public String getDataVan(){
        return "La capacidad de carga es: " + carryingCapacity + " y las plazas son: " + extraPlaces;
    }
}
