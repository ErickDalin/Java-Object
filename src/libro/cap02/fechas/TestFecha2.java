
package libro.cap02.fechas;

import java.util.Scanner;
public class TestFecha2 {
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dia mes y anio");
        int dia =sc.nextInt();
        int mes = sc.nextInt();
        int anio = sc.nextInt();
        
        //Creamos el objeto
        Fecha f = new Fecha(dia,mes,anio);
        System.out.println("Ingrese el dia mes y anio");
        int dia1 =sc.nextInt();
        int mes1 = sc.nextInt();
        int anio1 = sc.nextInt();
        
        Fecha f2 = new Fecha(dia1, mes1, anio1);
        
        if(f.equals(f2)){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("Son diferentes");
        }
    }
    
}
