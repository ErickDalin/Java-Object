
package libro.cap02.fechas;


public class TestFecha {

    
    public static void main(String[] args) {
        
        Fecha f = new Fecha();
        f.setDia(12);
        f.setMes(12);
        f.setAnio(2012);
        
        System.out.println("Dia "+f.getDia());
        System.out.println("Mes "+f.getMes());
        System.out.println("Anio "+f.getAnio());
        
        
        Fecha f1 = new Fecha("12/12/2012");
        
        System.out.println("Fecha "+f);
        System.out.println("Fecha "+f);
        
        System.out.println("Son iguales? "+f.equals(f1));
    }
    
}
