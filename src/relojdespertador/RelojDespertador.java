/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojdespertador;

import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author jdominguezmartinan
 */
public class RelojDespertador
{

    /**
     * metodo main , se llama a la ventana del reloj y llamamos a los contructores de reloj y alarma para que se ejecuten ya en segundo plano cada uno de los run que tenemos en las inner class que hay en ellas 
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args)
    {
        // TODO code application logic here
        Interfaz ventana=new Interfaz();
        new Reloj();
        new Alarma();
       
        
        
       
    }

}
