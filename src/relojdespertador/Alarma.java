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
     * incrementa la hora de la alarma en una hora
     */
    public static void subirHoraAlarma(){
        horaAlarma=horaAlarma+1;
    }
    /**
     * incrementa el minuto de la alarma en un minuto
     */
    public static void subirMinutoAlarma(){
        minutoAlarma=minutoAlarma+1;
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
}