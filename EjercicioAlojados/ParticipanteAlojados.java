import java.io.*;
import java.util.Scanner;

public class ParticipanteAlojados {
    public static void alojados(){
        File f = new File("Jugadores.txt");
        String lineas = "";
        String[] alojados;
        Scanner entrada;

        try {
            FileWriter guarda = new FileWriter("Alojados.txt");
            BufferedWriter buf = new BufferedWriter(guarda);
            entrada = new Scanner(f);

            while (entrada.hasNextLine()) {
                lineas = entrada.nextLine();
                alojados = lineas.split(";");
                String ayuda = alojados[alojados.length-1];
                if (ayuda.contains("H")){
                     buf.write(alojados[0] + " " + alojados[2] + "\n");
                }
            }
            buf.close();
            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    public static void leerGuardados(){
        alojados();
        File f = new File("Alojados.txt");
        String lineas;
        Scanner escan;
        try {
            escan = new Scanner(f);
            while (escan.hasNextLine()){
                lineas = escan.nextLine();
                System.out.println(lineas);
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        leerGuardados();
    }
}