public class Main {
    public static void main(String[] args) {

        Persona persona= new Persona("123456A", "Dani", 24);
        Persona persona1 =new Persona();

        int edad = 28;
        String nombre = "Alumno";
        if (persona.getEdad() > edad){
            System.out.println(persona.getNombre() + " es mayor que " + nombre);
        } else if (persona.getEdad() == edad){
            System.out.println(persona.getNombre() + " y " + nombre + " tienen la misma edad");
        } else {
            System.out.println(persona.getNombre() + " es menor que " + nombre);
        }
    }
}
