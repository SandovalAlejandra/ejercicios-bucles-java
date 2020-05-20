
package EjercicioDoWhile;

import javax.swing.JOptionPane;


public class EjercicioDoWhile {
    public static void main(String[]args){
    
        int numero,cont=0;
        double valor;
        valor = Math.floor(Math.random()*(20-1+1)+1);

        do{
           
           numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
           if(valor>numero){
                System.out.println("El numero es mayor");
           }else if(valor<numero){
                System.out.println("El numero es menor");
           }
            cont++;
         }while(valor!=numero && cont<3);

         if(valor==numero){
             System.out.println("Acertaste el numero");
         }
         else if(cont>=3){
             System.out.println("GAME OVER");
         }
    }
}

