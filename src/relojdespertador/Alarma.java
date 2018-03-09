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
   private static boolean enPantalla=false; // indicador para marcar si esta en pantalla la hora o la hora de la alarma
   /**
    * constructor al que llamaremos para poder ejecutar la tarea de comprobar alarma en segundo plano
    */
    public Alarma(){
        Timer timer=new Timer(); // objeto timer para poder contar el tiempo en el que queremos que se ejecute la accion
        timer.schedule(new SonarAlarmaSiNo(),0,1000); // SonarAlarmaSiNo será ejecutado cada 1000 milisegundos, 1segundo
    }
/**
 * 
 * @return enPantalla para poder saber si se esta mostrando la alarma o no 
 */
    public static boolean isEnPantalla() {
        return enPantalla;
    }
/**
 * metodo get para insertar valor si esta en pantalla la alarma o no
 * @param enPantalla true cuando esta en pantalla la alarma false cuando esta la hora 
 */
    public static void setEnPantalla(boolean enPantalla) {
        Alarma.enPantalla = enPantalla;
    }
/**
 * metodo para devolver si la alarma esta encendida o no 
 * @return encendida 
 */
    public static boolean isEncendida() {
        return encendida;
    }
/**
 * metodo para cambiar el valor de si la alarma esta encendida o no 
 * @param encendida 
 */
    public static void setEncendida(boolean encendida) {
        Alarma.encendida = encendida;
    }
/**
 * metodo para devolver la hora a la que esta puesta la alarma 
 * @return horaAlarma hora a la que esta puesta la alarma 
 */
    public static int getHoraAlarma() {
        return horaAlarma;
    }
/**
 * metodo para insertar hora a la hora de la alarma 
 * @param horaAlarma hora a la que se quiere que suene la alarma
 */
    public static void setHoraAlarma(int horaAlarma) {
        Alarma.horaAlarma = horaAlarma;
    }
/**
 * metodo para devolver el minuto al que tiene que sonar la alarma en caso de estar encendida
 * @return minutoAlarma minuto al que tiene que sonar la alarma 
 */
    public static int getMinutoAlarma() {
        return minutoAlarma;
    }
/**
 * metodo para insertar el minuto al que tiene que sonar la alarma 
 * @param minutoAlarma minuto al que tiene que sonar la alarma 
 */
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
     * metodo que reproduce un sonido cuando es llamado , sera llamado cuando se cumplan las condiciones para que suene la alarma 
     */
    public static void sonarAlarma(){
       Toolkit.getDefaultToolkit().beep(); // reproduce un beep en el sistema 
        System.out.println("alarma"); // para comprobar de manera grafica en caso de que no tenga altavoces el sistema 
       
    }
    /**
     * marcador de alarma encendida o apagada pasa a true si es false, y a false si es true , aparece en la pantalla el indicador de encendido activado o desactivado en funcion tambien de este valor 
     */
    public static void encender(){
        if(encendida==false){
        encendida=true;
        Interfaz.indicadorAlarma.setText("."); // cuando la alarma este encendida se mostrara un punto grande en pantalla
       
        }
        else{
        encendida=false;
        Interfaz.indicadorAlarma.setText("");
        }
    }
    /**
     * metodo para posponer la alarma, es decir, que suene mas tarde, el tiempo que se pospone es 5 minutos 
     */
    public static void posponerAlarma(){
        if(minutoAlarma<=54) // si los minutos que marca la alarma es menos de 54 solo hace falta incrementar en 5
            minutoAlarma=minutoAlarma+5;
        else if(minutoAlarma==55){ // si el minuto de la alarma es justo 55 se pone los minutos a cero y se sube en uno la hora 
            minutoAlarma=0;
            horaAlarma=horaAlarma+1;
        }
        else{ // en el resto de los casos se ve los minutos que faltan hasta cero para añadiserlos y subimos la hora en uno 
            int minutos=minutoAlarma-55;
            minutoAlarma=minutos;
            horaAlarma=horaAlarma+1;
        }
    }
    /**
     * metodo para poder visualizar en pantalla la hora de la alarma , formatenando el texto como es debido 
     */
           public static void VisualizarAlarmaPantalla(){
       
           if(minutoAlarma<10 && horaAlarma<10) { // como el formato de hora es HH:MM en los csos en el que la hora o el minuto sea menor que 10 hay que poner un cero delante 
           Interfaz.pantalla.setText("0"+horaAlarma+":"+"0"+minutoAlarma);
           enPantalla=true; // cuando visualizamos la hora de la alarma en pantalla hay que marcar su bandera como true 
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
           /**
            * inner class para poder comprobar en segundo plano que las condiciones de que suene la alarma se cumpla, y en caso de que lo haga , que suene 
            */
           public class SonarAlarmaSiNo extends TimerTask{

        @Override
        public void run() {
             if(horaAlarma==Reloj.devolverHoraActual() && minutoAlarma==Reloj.devolverMinutoActual() && encendida==true)
             Alarma.sonarAlarma();
        }
               
           

    
    }
   
        
    
    
}
