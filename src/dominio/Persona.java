package dominio;

public class Persona {
    //Atributos private para que otras clases, incluso dentro del mismo paquete, no puedan acceder ni modificar directamente los atributos de esta clase persona
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    //Constructor con 3 argumentos. Con esos argumentos inicializamos cada atributo de nuestra clase
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;   
    }  
    
    //Métodos getters y setters
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    //En los tipos boolean no utilizamos get sino is
    public boolean isEliminado(){
        return this.eliminado;
    }
    
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }
    
    //El método toString() nos permite imprimir el estado del objeto en cualquier momento. Nos permite imprimir los valores de cada uno de los atributos que agreguemos al método toString() 
    //Este método convierte a una cadena cada uno de los atributos que tenemos en nuestra clase
    public String toString(){
        return "Persona [nombre: " + this.nombre +
                ", sueldo: " + this.sueldo +
                ", eliminado: " + this.eliminado + "]";
                
    }
    
    
}
