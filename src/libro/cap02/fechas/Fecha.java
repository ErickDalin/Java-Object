
package libro.cap02.fechas;

public class Fecha {
    
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha(){
        
    }
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
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
