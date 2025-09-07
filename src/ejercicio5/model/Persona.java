package ejercicio5.model;
import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private String dni;
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private String provincia;

    public int calcularEdad(){
        return Period.between(fechaDeNacimiento,LocalDate.now()).getYears();
    }

    public boolean mayorDeEdad() {
        return calcularEdad() >= 18;
    } 

    public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaDeNacimiento);
        System.out.println("Provincia: " + provincia);
        System.out.println("Edad: " + calcularEdad() + " años");

        if (mayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }

     // Constructor por defecto o vacío. Permite crear un objeto sin inicializar sus atributos.
     public Persona() {
    }
    
    // Constructor parametrizado. Inicializa todos los atributos al crear el objeto.
   
    public Persona(String dni, String nombre, LocalDate fechaDeNacimiento, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.provincia = provincia;

        }

    // Otro constructor parametrizado. Asigna "Jujuy" como valor por defecto a la provincia.
    public Persona(String dni, String nombre, LocalDate fechaDeNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.provincia = "Jujuy";
    }    

    // --- Métodos Accesores (Getters y Setters) ---
    

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
