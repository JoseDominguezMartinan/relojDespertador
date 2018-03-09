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
