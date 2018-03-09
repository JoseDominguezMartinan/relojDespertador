/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojdespertador;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;



/**
 *
 * @author jdominguezmartinan
 */
public class Alarma
{
   private static boolean encendida=false; // indicador de si la alarma esta activada (true), o desactivada(false)
    private static int horaAlarma=00; // hora a la que tiene que sonar la alarma
    private static int minutoAlarma=00; // minuto al que tiene que sonar la alarma 
   private static boolean enPantalla=false;
   
    public Alarma(){
        Timer timer=new Timer();
        timer.schedule(new SonarAlarmaSiNo(),0,1000);
    }

    public static boolean isEnPantalla() {
        return enPantalla;
    }

    public static void setEnPantalla(boolean enPantalla) {
        Alarma.enPantalla = enPantalla;
    }

    public static boolean isEncendida() {
        return encendida;
    }

    public static void setEncendida(boolean encendida) {
        Alarma.encendida = encendida;
    }

    public static int getHoraAlarma() {
        return horaAlarma;
    }

    public static void setHoraAlarma(int horaAlarma) {
        Alarma.horaAlarma = horaAlarma;
    }

    public static int getMinutoAlarma() {
        return minutoAlarma;
    }

    public static void setMinutoAlarma(int minutoAlarma) {
        Alarma.minutoAlarma = minutoAlarma;
    }
    
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
       Toolkit.getDefaultToolkit().beep();
        System.out.println("alarma");
       
    }
    /**
     * marcador de alarma encendida o apagada pasa a true si es false, y a false si es true , aparece en la pantalla el indicador de encendido activado o desactivado en funcion tambien de este valor 
     */
    public static void encender(){
        if(encendida==false){
        encendida=true;
        Interfaz.indicadorAlarma.setText(".");
       
        }
        else{
        encendida=false;
        Interfaz.indicadorAlarma.setText("");
        }
    }
    public static void posponerAlarma(){
        if(minutoAlarma<=54)
            minutoAlarma=minutoAlarma+5;
        else if(minutoAlarma==55){
            minutoAlarma=0;
            horaAlarma=horaAlarma+1;
        }
        else{
            int minutos=minutoAlarma-55;
            minutoAlarma=minutos;
            horaAlarma=horaAlarma+1;
        }
    }
    
           public static void VisualizarAlarmaPantalla(){
          /**
            * llamamos al tiempo incrementar Hora para que el tiempo cuente como queremos, en este caso los minutos aumentan a cada segundo para poder hacer pruebas
            * dependiendo de si las horas o los minutos tienen una o dos cifras se formateara la salida de una forma u otra
            */
           if(minutoAlarma<10 && horaAlarma<10) {
           Interfaz.pantalla.setText("0"+horaAlarma+":"+"0"+minutoAlarma);
           enPantalla=true;
           }
           else if(horaAlarma>=10 && minutoAlarma<10){
           Interfaz.pantalla.setText(horaAlarma+":"+"0"+minutoAlarma);
           enPantalla=true;
           }
           else if(horaAlarma<10&&minutoAlarma>=10){
            Interfaz.pantalla.setText("0"+horaAlarma+":"+minutoAlarma);
            enPantalla=true;
           }
           else
           Interfaz.pantalla.setText(horaAlarma+":"+minutoAlarma);
           enPantalla=true;
           }
           public class SonarAlarmaSiNo extends TimerTask{

        @Override
        public void run() {
             if(horaAlarma==Reloj.devolverHoraActual() && minutoAlarma==Reloj.devolverMinutoActual() && encendida==true)
             Alarma.sonarAlarma();
        }
               
           

    
    }
   
        
    
    
}
