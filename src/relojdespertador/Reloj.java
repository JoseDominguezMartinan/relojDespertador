/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojdespertador;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author jdominguezmartinan
 */
public class Reloj
{
    private static int horaActual;
    private static int minutoActual;
    Timer timer;
   
    public Reloj(){
        timer=new Timer();
        timer.schedule(new TicTac(),0,1000);
    }
    /**
     * devuelve el valor de horaActual
     * @return horaActual con la hora que es en este momento
     */
    
    public static int devolverHoraActual(){
        return horaActual;
    }
    /**
     * devuelve el valor del minutoActual
     * @return minutoActual con el minuto que es en este momento
     */
    public static int devolverMinutoActual(){
        return minutoActual;
    }
    /**
     * incrementa el valor de la hora actual en 1, si la hora es 23, la siguiente sera la 0
     */
    
    public static void subirHoraActual(){
        if(horaActual<23)
        horaActual=horaActual+1;
        else horaActual=0;
    }
    /**
     * disminuye el valor de la hora actual en 1, si el minuto es 59, el siguiente sera el 0
     */
    public static void subirMinutoActual(){
        if(minutoActual<59)
        minutoActual=minutoActual+1;
        else minutoActual=0;
    }
    
    public class TicTac extends TimerTask{
        
        @Override
        public void run() {
            System.out.println(new Date());  
             
        }
        
    }
    
    
}
