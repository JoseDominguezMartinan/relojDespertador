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
public class Reloj
{
    private static int horaActual;
    private static int minutoActual;
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
     * incrementa el valor de la hora actual en 1
     */
    
    public static void subirHoraActual(){
        if(horaActual<23)
        horaActual=horaActual+1;
        else horaActual=0;
    }
    /**
     * disminuye el valor de la hora actual en 1
     */
    public static void subirMinutoActual(){
        if(minutoActual<59)
        minutoActual=minutoActual+1;
        else minutoActual=0;
    }
    
}
