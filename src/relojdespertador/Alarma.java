/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojdespertador;

/**
 *
 * @author jdominguezmartinan
 */
public class Alarma
{
   private static boolean encendida=false; // indicador de si la alarma esta activada (true), o desactivada(false)
    private static int horaAlarma; // hora a la que tiene que sonar la alarma
    private static int minutoAlarma; // minuto al que tiene que sonar la alarma 
    
    /**
     * incrementa la hora de la alarma en una hora, si la hora es 23, la siguiente sera la 0
     */
    public static void subirHoraAlarma(){
        if(horaAlarma<23)
        horaAlarma=horaAlarma+1;
        else horaAlarma=0;
    }
    /**
     * incrementa el minuto de la alarma en un minuto, si el minuto es 59, el proximo sera el cero
     */
    public static void subirMinutoAlarma(){
        if(minutoAlarma<59)
        minutoAlarma=minutoAlarma+1;
        else minutoAlarma=0;
                        
    }
    /**
     * si la hora y minuto de la alarma coinciden con la hora y minuto actual , y ademas la alarma esta encendida, la alarma sonará
     */
    public static void sonarAlarma(){
        if(horaAlarma==Reloj.devolverHoraActual() && minutoAlarma==Reloj.devolverMinutoActual() && encendida==true)
            System.out.print("beep");
            System.out.print("beep");
            System.out.print("beep");
            System.out.print("beep");
    }
    /**
     * marcador de alarma encendida o apagada pasa a true si es false, y a false si es true 
     */
    public static void encender(){
        if(encendida==false)
        encendida=true;
        if(encendida==true)
        encendida=false;
    }
    public static void incrementarReloj(){
        long tiempoInicio;
       tiempoInicio = System.currentTimeMillis();
    }
}
