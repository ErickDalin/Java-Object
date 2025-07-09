
package libro.cap02.fechas;

public class Fecha {
    
    private int dia;
    private int mes;
    private int anio;
    
    //contructor nulo o vacio
    public Fecha(){  
    
    }
    
    //constructor que recibe enteros 
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    //constructor que recibe String
    public Fecha(String str){
        // 15/06/1973
        int pos1 = str.indexOf("/");
        int pos2 = str.lastIndexOf("/");
        
        dia = Integer.parseInt(str.substring(0,pos1));
        mes = Integer.parseInt(str.substring(pos1+1, pos2));
        anio = Integer.parseInt(str.substring(pos2+1));
        
    }
    
    //Sobreescribimos el metodo toString
    public String toString(){
        return dia+"/"+mes+"/"+anio;
    }
    
    //sobrescribimos el método equals
    public boolean equals(Object o){
        if(this == o)return true;
        if(o==null || getClass() != o.getClass()) return false;
        
        Fecha otra = (Fecha)o;
        return (dia == otra.dia)&&(mes==otra.mes)&&(anio==otra.anio);
        
    }
    
    //Metodos de acceso setters y getters
    public void setDia(int dia){
        //asiganamos la variable
        this.dia = dia;
    }
    
    public int getDia(){
        //Retornamos el valor de la variablre
        return dia;
    }
    
    public void setMes(int mes){
        //asiganamos la variable
        this.mes = mes;
    }
    
    public int getMes(){
        return mes;
    }
    
    public void setAnio(int anio){
        this.anio = anio;
    }
    
    public int getAnio(){
        return anio;
    }
}
