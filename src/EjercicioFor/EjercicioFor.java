
package EjercicioFor;

import javax.swing.JOptionPane;


public class EjercicioFor {
    public static void main(String[]args){
    
       
        int n;
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño de la sucesion fibonacci:"));
        int fibonacci[]=new int[n];
        String resultado="";
          
        
       for(int i=0;i<n;i++){
           fibonacci[0]=fibonacci[1]=1;
           
           if(i>=2){
               fibonacci[i]=fibonacci[i-2]+fibonacci[i-1];
           }
           
          resultado= resultado+"["+fibonacci[i]+"] ";
        }  
       
      JOptionPane.showMessageDialog(null,"La sucesion fibonacci es:" +resultado);
    }
    
}
