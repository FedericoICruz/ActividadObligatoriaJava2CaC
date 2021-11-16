package actividadobligatoriajava2cac;
import java.util.Scanner;


/**
 *
 * @author Federico
 */
public class ActividadObligatoriaJava2CaC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String nombre;
       String apellido;
       String edad;
       String hobbie;
       String editor;
       String so;
       
       
        System.out.println("Por favor, ingrese su nombre:");
        nombre = scan.nextLine();
       
        System.out.println("Por favor, ingrese su apellido:");
        apellido = scan.nextLine();
        
        System.out.println("Por favor, ingrese su edad:");
        edad = scan.nextLine();
        
        System.out.println("Por favor, ingrese su hobbie:");
        hobbie = scan.nextLine();
        
        System.out.println("Por favor, ingrese su editor de código preferido:");
        editor = scan.nextLine();
        
        System.out.println("Por favor, ingrese el sistema operativo que usa:");
        so = scan.nextLine();
        
        System.out.println("Nombre: "+nombre+"."+"\nApellido: "+apellido+"."+"\nEdad: "+edad+"."+"\nHobbie: "+hobbie+"."+"\nEditor de código favorito: "+editor+"."+"\nSistema Operativo: "+so+".");
       
       
    }
    
}
