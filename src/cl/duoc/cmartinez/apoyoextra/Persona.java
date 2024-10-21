package cl.duoc.cmartinez.apoyoextra;

// esto un comentario
// esta primera linea define la clase, siempre el nombre de la clase
// comienza con mayuscula y las demas letras con minuscula
public class Persona {
    //Atributos, campos
    String nombre;
    String apellido;
    int edad;

    // Metodos, funciones o comportamientos
    // Constructor
    public Persona() { }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // accesor
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    // mutador
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // custom
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public String getNombreCompleto(String nombramiento) {
        return nombramiento + " " + nombre + " " + apellido;
    }

    public void getInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }
}
