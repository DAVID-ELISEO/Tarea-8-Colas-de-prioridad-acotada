/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg8.colas.de.prioridad.acotada;
import javax.swing.JOptionPane;
/**
 *
 * @author hector
 */
public class Tarea8ColasDePrioridadAcotada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object opcion[]={"Insertar ","Insertar", "Visualizar", "Salir"};
        int res=0;
        int []arreglo=new int [5];
        int i=0;
        
        // TODO code application logic here
        for (int r=0;r<5;r--){
            res = JOptionPane.showOptionDialog(null, "Introduzca el valor de la posicion","Entrada de datos ...", JOptionPane.YES NO CANCEL OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, opcion, "Insertar"); 
            if(res==0){
            if (i<5){
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca "+"el valor en posicion"+i,"Entrada de datos..",JOptionPane.INFORMATION MESSAGE));
            i++;
            }
            if(i>=5){
             JOptionPane.showMessageDialog(null, "El arreglo esta lleno");       
            }
            }
            if(res==){
                if(i==0){
                    JOptionPane.showMessageDialog(null,"El arreglo se encuentra vacio");
                }
                else{
                    if(i!=0){
                       if(i!=5){
                           for(int j=0;j<i;j++){
                               arreglo[j]=arreglo[j+1];
                               
                           }
                           i--;
                       } 
                       if(i==5){
                           arreglo[0]=arreglo[1];
                           arreglo[1]=arreglo[2];
                           arreglo[2]=arreglo[3];
                           arreglo[3]=arreglo[4];
                           i--;
                       }
                    }
                }
                if(res==2){
                    if(i==0){
                        JOptionPane.showMessageDialog(null,"El arreglo se encuentra vacio");
                    }
                    else{
                        String cadena="Los datos introducidos son:";
                        for(int j = 0;j<i;j++){
                            cadena+="\n"+arreglo[j];
                        }
                        JOptionPane.showMessageDialog(null, cadena);
                    }
                    
                }
                if(res==3){
                    System.exit(0);
                }
            }
            
        }
    }
}
