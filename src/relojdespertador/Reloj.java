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
 * @author jose
 */
public  class Reloj 
{
/**
 * atributos horaActual para almacenar la hora y minutoActual para almacenar los minutos, son la hora y el minuto real del momento, no de la alarma
 */
    private static int horaActual=0; // hrra que se mostrara en pantalla del reloj
    private static int minutoActual=0;// minuto que se mostrara en la pantalla del reloj
    Timer timer;
    /**
     * constructor reloj donde creo un timer para que haga una accion cada cierto tiempo
     * esta puesto para que haga la accion cada segundo para que se puedan hacer mejor las pruebas, para un funcionamiento real se pondria a cada segundo
     */
    public Reloj(){
        Date horas=new Date(); // creamos variable date para recibir fecha y hora del sistema 
         horaActual=horas.getHours(); // almacenamos en la variable la hora del sistema
         minutoActual=horas.getMinutes(); // almacenamos en la variable los minutos del sistema
        timer=new Timer();
        timer.schedule(new TicTac(),0,60000); // realizaremos el metodo tic tac cada segundo 
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
  /**
   * metodo para obtener la hora completa, formateada HH:MM
   * @return String horaActual:minutoActual 
   */

    public static String devolverHoraString() {
        return horaActual+":"+minutoActual;
    }
    /**
     * metodo para que el reloj avance automaticatemente, cuando pasen 60 minutos la hora se incrementara 
     * @return horaCompleta
     */
    
    public static void IncrementarHora(){
        if(minutoActual<59)
            minutoActual++;
        else{
            minutoActual=0;
            horaActual++;
        
        }
       
    } 
    /**
     * metodo para visualizar en pantalla la hora actual, formateada de forma HH:MM
     */
    public static void VisualizarHoraPantalla(){
       
           if(minutoActual<10 && horaActual<10) {
           Interfaz.pantalla.setText("0"+horaActual+":"+"0"+minutoActual);
           }
           else if(horaActual>=10 && minutoActual<10){
           Interfaz.pantalla.setText(horaActual+":"+"0"+minutoActual);
           }
           else if(horaActual<10&&minutoActual>=10){
            Interfaz.pantalla.setText("0"+horaActual+":"+minutoActual);
           }
           else
           Interfaz.pantalla.setText(horaActual+":"+minutoActual);

    }
    
        
    /**
     * Inner class para la ejecucion en segundo plano
     * ejecuta el metodo incrementar Hora y  muestra el resultado en la interfaz
     */
    
    public class TicTac extends TimerTask{
        
        @Override
        public void run() {
            IncrementarHora(); // se tiene que ejecutar siempre, para poder mostrar la hora en tiempo real 
            if(Alarma.isEnPantalla()==false) // cuando esta marcada la opcion de mostrar hora real
            VisualizarHoraPantalla(); // la visualizamos 
            else Alarma.VisualizarAlarmaPantalla(); // en caso contrario visualizamos la hora de la alarma 
            
          
        }
}
}
