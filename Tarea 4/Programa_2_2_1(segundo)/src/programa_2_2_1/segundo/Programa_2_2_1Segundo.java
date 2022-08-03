
package programa_2_2_1.segundo;

import java.util.ArrayList;
import java.util.Scanner;


public class Programa_2_2_1Segundo {
int puntuacion;
    String nombre;

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void preguntas() {
      Problema_2_2_1Segundo   Q = new Problema_2_2_1Segundo();
        ArrayList<Problema_2_21> que = new ArrayList<>();
        while (true) {
            System.out.println("*******************************");
            System.out.println("|          Bienvenido         |");
            System.out.println("|                             |");
            System.out.println("                              |");
            System.out.println("|                             |");
            System.out.println("|                             |");
            System.out.println("|                             |");
            System.out.println("|                             |");
            System.out.println("*******************************");
            System.out.println("Ingrese un numero: ");
            Scanner a1 = new Scanner(System.in);
            int respuesta = a1.nextInt();
        
    }

    public static void main(String[] args) {
       
    }
    
}
