package poo;

import javax.swing.*;

public class UseVehicle {
    public static void main (String[] args) {
        Vehicle Renault = new Vehicle();

        Renault.setColour(JOptionPane.showInputDialog("Introduce color"));
        Renault.setLeatherSeats(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
        Renault.setHeating(JOptionPane.showInputDialog("Tiene calefaccion?"));

        Van Kangoo = new Van(7, 580);

        Kangoo.setColour("Blanca");
        Kangoo.setLeatherSeats("Si");
        Kangoo.setHeating("Si");

        System.out.println(Renault.getProperties() + " " + Renault.getColour());
        System.out.println(Kangoo.getProperties() + " " + Kangoo.getColour() + " " + Kangoo.getDataVan());
    }
}
