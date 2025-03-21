package Actividad2;

public class Color {

    public static String queColorSoy(String nombre){
        char f = nombre.charAt(0);
        if (f >= 'A' && f <= 'F'){
            return "rojo";
        } else if (f >= 'G' && f <='M') {
            return "verde";
        } else if (f >= 'N' && f <= 'S') {
            return "azul";
        } else if (f >= 'T' && f <= 'Z') {
            return "amarillo";
        } else if (!Character.isLetter(f)) {
            return "blanco";
        }
        return "";
    }
}
