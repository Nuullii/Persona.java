public class Persona {
    private String dni;
    private String nombre;
    private int edad;

    public Persona(String dni,String nombre,int edad){
        this.dni=dni;
        this.nombre=nombre;
        this.edad=edad;
    }
    public  Persona(){

    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
