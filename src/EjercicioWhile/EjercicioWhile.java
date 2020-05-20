
package EjercicioWhile;

import javax.swing.JOptionPane;


public class EjercicioWhile {
    public static void main(String[] args) {
      
        int cont=0;
        boolean x=false;
        String name;
        
        while(x==false){
         if(cont>=3){
          x=true;
         }
         name=JOptionPane.showInputDialog("Ingrese su nombre");
         JOptionPane.showMessageDialog(null, name+" su vacuna fue aprobada");
         cont++;
        }
        JOptionPane.showMessageDialog(null,"Se acabaron las vacunas");
    }
    
}
