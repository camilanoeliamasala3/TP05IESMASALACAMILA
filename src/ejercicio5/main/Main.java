package ejercicio5.main;
import java.time.LocalDate;
import ejercicio5.model.Persona;

public class Main {
    public static void main(String[] args) {
        
        //  Carga y creación de datos 
        Persona persona1 = new Persona();
        //  método 'setters' para asignar valores a los atributos
        persona1.setDni("44348772");
        persona1.setNombre("Camila");
        persona1.setFechaDeNacimiento(LocalDate.of(2002,11,9));
        persona1.setProvincia("Jujuy");
         
        // Creación del segundo objeto 'Personas' con el constructor de 4 parámetros.
        Persona persona2 = new Persona(
             "38963741", 
            "Milagros",
            LocalDate.of(2003,2, 16), 
            "Jujuy"
        );

        // Creación del tercer objeto 'Personas' con el constructor de 3 parámetros.
        Persona persona3 = new Persona(
            "3159454", 
            "Mariana",
            LocalDate.of(2010, 1, 13)
        );

         //  Llama a los métodos para mostrar los datos 

         persona1.mostrarDatos();
         System.out.println("--------------");

         persona2.mostrarDatos();
         System.out.println("--------------");

         persona3.mostrarDatos();
         // Llama al método 'mayorDeEdad Y  muestra el valor booleano resultante.
        System.out.println(persona3.mayorDeEdad());
          }
}