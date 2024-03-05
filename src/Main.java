import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nombre_usuario = JOptionPane.showInputDialog("introduce tu nombre, por favor");

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));

        System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad + 1) + " años");
    }
}