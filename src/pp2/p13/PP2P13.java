/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p13;
import java.util.*;
/**
 *
 * @author Osvaldo
 */
public class PP2P13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicio con mi codigo
        int[]vector = new int[30];
        int p;
        vector = LlenarArreglo(vector);
        p = calcularPromedio(vector);
        Mostrar(vector,p);
    }
    public static int[] LlenarArreglo(int[]v){
        Scanner entrada = new Scanner(System.in);
        //Estoy declarando las variables que usare en el metodo
        int i=0;
        while(i < v.length){  
                System.out.println("Introduce un numero para la posición [" +i +"]");
                v[i]=entrada.nextInt();
                i++;
        }
        
        return v;
    }
    public static int calcularPromedio(int[] v){
        int m=0,n=0;
        for (int i=1; i<v.length; i++){
         //Mientras que el valor i no sobre pase el valor de la celda se ira sumando el valor de la celda en m
            m = v[i] + m;
            n++;
        }
            m = m / n;
        System.out.println("El promedio de los números es " +m);
        return m;
    }
    public static void Mostrar(int[]v, int p){
        int c1=0, c2=0;
        for(int i=0;i<v.length;i++)
            if(v[i]<p){
                //Si es mayor que el promedio, se hara un contador
                c1++;
            }else{
                //Pero si esta por debajo se hara otro contador
                c2++;
            }
        System.out.println("Hay " +c1 +" calificaciones por encima del promedio");
        System.out.println("Hay " +c1 +" calificaciones por debajo del promedio");
    }
}
