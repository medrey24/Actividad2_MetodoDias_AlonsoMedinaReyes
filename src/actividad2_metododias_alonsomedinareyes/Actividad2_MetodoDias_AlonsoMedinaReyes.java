/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2_metododias_alonsomedinareyes;
import java.util.Scanner;
/**
 *
 * @author acs
 */
public class Actividad2_MetodoDias_AlonsoMedinaReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner diaSem = new Scanner(System.in);
        
    int num = 0;
    
        
    System.out.println("Ingrese un número del 1 al 7, considerando cada uno como un día de la semana: ");
    num = diaSem.nextInt();
        
     if (num >0 && num <=7 ) {
         
         switch (num){
            case 1:
            System.out.println("Es Lunes, Día hábil");
            break;   
            case 2:
            System.out.println("Es Martes, Día hábil");
            break;
            case 3:
            System.out.println("Es Miércoles, Día hábil");
            break;   
            case 4:
            System.out.println("Es Jueves, Día hábil");
            break;
            case 5:
            System.out.println("Es Viernes, Día hábil");
            break;   
            case 6:
            System.out.println("Es Sábado, Es fin de semana");
            break;
            case 7:
            System.out.println("Es Domingo, Es fin de semana");
            break;
     }     
        
    }else{
        System.out.println("¡Error!");    
        System.out.println("Favor de ingresar un número del 1 al 7");
     }
}
}    
