import javax.swing.*;

public class foreach {
    public static void main(String[] args) {
//        String [] countries = {"España", "Argentina", "Mexico", "Colombia", "Ecuador", "Venezuela"};

        String [] countries = new String[8];

        for(int i = 0; i < 8; i++){
            countries[i] = (i+1) + " - " + JOptionPane.showInputDialog("Introduce pais " + (i+1));
        }

        for(String country:countries){
            System.out.println(country);
        }
    }
}
