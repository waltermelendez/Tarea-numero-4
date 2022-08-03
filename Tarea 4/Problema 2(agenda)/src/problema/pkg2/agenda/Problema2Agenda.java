package problema.pkg2.agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Problema2Agenda {

    public void Agenda() {
        Problema_2_ orden = new Problema_2_();
        ArrayList<Problema_2_> tabl = new ArrayList<>();
        while (true) {
            System.out.println("*******************************");
            System.out.println("|          Bienvenido         |");
            System.out.println("|        ¿Que desa hacer?     |");
            System.out.println("|1.Agregar un comida.         |");
            System.out.println("|2.Agregar una bebida .       |");
            System.out.println("|3.Modificar la orden.        |");
            System.out.println("|4.Terminar.                  |");
            System.out.println("|5.Salir.                     |");
            System.out.println("*******************************");
            System.out.println("Ingrese un numero: ");
            Scanner a1 = new Scanner(System.in);
            int respuesta = a1.nextInt();
            switch (respuesta) {
                case 1:
                    
                        System.out.println("Ingrese una comida: ");
                        System.out.println("Hamburgesa tejana");
                        System.out.println("Pizza");
                        System.out.println("Una orden de tacos");
                        System.out.println("Hamburguesa simple");
                        Scanner comi = new Scanner(System.in);
                        orden.setComida(comi.toString());

                        if (orden.getComida().equals("Pizza") || (orden.getComida().equals("Una orden de tacos"))) {
                            System.out.println("Lo sentimos, por el momento no los tenemos");
                        }

                    
                    System.out.println("Listo");
                    break;
                case 2:

                    System.out.println("Ingrese una bebida: ");
                    System.out.println("Coca-Cola");
                    System.out.println("Pepsi");
                    System.out.println("Sprite");
                    System.out.println("Grapette");
                    System.out.println("Mirinda");
                    Scanner bebi = new Scanner(System.in);
                    orden.setComida(bebi.toString());
                    if (orden.getComida().equals("Sprite") || (orden.getComida().equals("Mirinda"))) {
                        System.out.println("Lo sentimos, por el momento no los tenemos");
                    }

                    System.out.println("Listo");
                    break;
                case 3:
                    System.out.println("¿Que desea modificar?");
                    Scanner an = new Scanner(System.in);
                    String ans = an.nextLine();
                    if ("Comida".equals(ans)) {

                        System.out.println("Ingrese una comida: ");
                        System.out.println("Hamburgesa tejana");
                        System.out.println("Pizza");
                        System.out.println("Una orden de tacos");
                        System.out.println("Hamburguesa simple");
                        Scanner comi2 = new Scanner(System.in);
                        orden.setComida(comi2.toString());

                        if (orden.getComida().equals("Pizza") || (orden.getComida().equals("Una orden de tacos"))) {
                            System.out.println("Lo sentimos, por el momento no los tenemos");
                        }

                    } else {
                        System.out.println("Listo, su orden ha sido cambiada");
                        System.out.println("¿Desea cambiar su bebida?, Y o N");
                        Scanner so = new Scanner(System.in);
                        String res = so.nextLine();
                        if (res.equals("Y")) {
                            while (orden.getBedida().equals("")) {
                                System.out.println("Ingrese una bebida: ");
                                System.out.println("Coca-Cola");
                                System.out.println("Pepsi");
                                System.out.println("Sprite");
                                System.out.println("Grapette");
                                Scanner bebi2 = new Scanner(System.in);
                                orden.setComida(bebi2.toString());
                                if (orden.getComida().equals("Pizza") || (orden.getComida().equals("Una orden de tacos"))) {
                                    System.out.println("Lo sentimos, por el momento no los tenemos");
                                }
                            }
                            System.out.println("Listo, su bebida ha sido cambiada");
                        } else {
                            System.out.println("Esta bien");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Su orden es: ");
                    for(Problema_2_ a :tabl){
                        System.out.println( a.getComida());
                        System.out.println(a.getBedida());
                    }
                    break;
                case 5:
                    System.exit(respuesta);
            }

        }
    }

    public static void main(String[] args) {
        Problema2Agenda TT = new Problema2Agenda();
        TT.Agenda();
    }

}
