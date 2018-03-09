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
public  class Reloj 
{

    private static int horaActual=0;
    private static int minutoActual=0;
    Timer timer;
    
    public Reloj(){
        Date horas=new Date();
         horaActual=horas.getHours();
         minutoActual=horas.getMinutes();
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
     * aumenta el valor del minuto actual en 1, si el minuto es 59, el siguiente sera el 0
     */
    public static void subirMinutoActual(){
        if(minutoActual<59)
        minutoActual=minutoActual+1;
        else minutoActual=0;
    }
  

    public static String devolverHoraString() {
        return horaActual+":"+minutoActual;
    }
    
    public static String IncrementarHora(){
        if(minutoActual<59)
            minutoActual++;
        else{
            minutoActual=0;
        }
        if(horaActual<23){
            horaActual++;
        }
        else{
            horaActual=0;
        }
        String horaCompleta=devolverHoraString();
        return horaCompleta;
    } 
        
    
    public class TicTac extends TimerTask{
        
        @Override
        public void run() {
            String horaCompleta=IncrementarHora();
           Interfaz.pantalla.setText("200");
             
        }
        
    }
    
    
}
