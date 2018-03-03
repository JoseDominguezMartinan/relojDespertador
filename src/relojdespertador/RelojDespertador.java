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
       System.out.println(Reloj.devolverHoraActual());
       TimerTask timertask=new TimerTask(){
          

           @Override
           public void run() {
               Reloj.subirHoraActual();
                
               Reloj.subirMinutoActual();
               Interfaz.mostrarHora();
               
           }
       };
       Timer timer=new Timer();
       timer.scheduleAtFixedRate(timertask,0,1000);
       
      
        
    }


}
