
package actividad2pooe7;

//Importamos el java.util.Scanner para registrar los datos escritos
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        
        //Título y datos
        System.out.println("Ejercicio resuelto #7");
        
        //Definimos la variable scanner de tipo Scanner para que registre las entradas
        Scanner scanner = new Scanner(System.in);

        //Pedimos al usuario digitar el valor de A y B
        System.out.print("Ingrese el valor de A: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entradaA = scanner.nextLine();
        double valorA = Double.parseDouble(entradaA);
        
        System.out.print("Ingrese el valor de B: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entradaB = scanner.nextLine();
        double valorB = Double.parseDouble(entradaB);
            
        //Toma de decisiones
        if (valorA > valorB) {
            System.out.println("El valor A: " + valorA + " es mayor que el valor B: " + valorB);
        } else if (valorA == valorB) {
            System.out.println("El valor A: " + valorA + " es igual que el valor B: " + valorB);
        } else {
            System.out.println("El valor A: " + valorA + " es menor que el valor B: " + valorB);
        }
        
        
    }
    
}
