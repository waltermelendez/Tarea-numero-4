
package problema.pkg1;

import java.util.Scanner;


public class Problema1 {
   

 public void pro() {
     int cantidad [] [] = new int [4] [5];
for (int k = 0; k < cantidad.length; k++){
 for (int j = 0; j <cantidad[k].length; j++){
 Scanner a1 = new Scanner (System.in);
     System.out.println("ingrese un numero");
     cantidad [k] [j] = a1.nextInt();
 }
 
 for (int i = 0; i < cantidad.length; i++){
for (int l = 0; i< cantidad[i].length; l++){
    System.out.println(cantidad [i] [l] );
}
}
 }


}
   
    public static void main(String[] args) {
        Problema1 tab = new Problema1();
        tab.pro();
    }
    
}
