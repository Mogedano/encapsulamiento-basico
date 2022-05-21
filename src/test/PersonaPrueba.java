package test;

//Para crear un objeto de tipo persona debemos primero importar nuestra clase
import dominio.Persona;

public class PersonaPrueba {
    
    public static void main(String[] args) {
        
        //Creamos un nuevo objeto
        Persona persona1 = new Persona("Juan", 5000.00, false);
        
        //Para acceder a la información de este objeto o modificarla tenemos que usar get o set
        persona1.setNombre("Juan Carlos");
        
        System.out.println("persona1 nombre: " + persona1.getNombre());
        System.out.println("persona1 sueldo: " + persona1.getSueldo());
        System.out.println("persona1 eliminado: " + persona1.isEliminado());
        
        //Creamos un nuevo objeto
        Persona persona2 = new Persona("Antonio", 2000.58, true);
        
        //Imprimimos valores
        System.out.println("persona2 nombre: " + persona2.getNombre());
        System.out.println("persona2 sueldo: " + persona2.getSueldo());
        System.out.println("persona2 eliminado: " + persona2.isEliminado());
        
        //Las impresiones anteriores se pueden sustituir por el método toString()
        System.out.println("persona2: " + persona2.toString() );
        
        //El método print o println llama de forma automática al método toString(), por lo que, si tenemos definido
        //el método toString(), la línea anterior equivale a esto (solo es necesario poner el objeto persona)
        System.out.println("persona2: " + persona2);
        
        
        //Modificamos los valores
        persona2.setNombre("Antonia");
        persona2.setSueldo(3000.50);
        persona2.setEliminado(false);       
        
        //Imprimimos los nuevos valores
        System.out.println("persona2 nombre modificado: " + persona2.getNombre());
        System.out.println("persona2 sueldo modificado: " + persona2.getSueldo());
        System.out.println("persona2 eliminado modificado: " + persona2.isEliminado());

        //Las impresiones anteriores se pueden sustituir por el método toString()
        System.out.println("persona2: " + persona2.toString() );   
        
        //El método print o println llama de forma automática al método toString(), por lo que, si tenemos definido
        //el método toString(), la línea anterior equivale a esto (solo es necesario poner el objeto persona)
        System.out.println("persona2: " + persona2);
    }  
}
