import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonaTest {

    Persona persona = new Persona("17474g", "Dani", 24);

    @Test
    void testGetdni() {
        assertEquals("17474g", persona.getDni());
    }

    @Test
    void testGetedad() {
        assertEquals(24, persona.getEdad());
    }

    @Test
    void testGetnombre() {
        assertEquals("Dani", persona.getNombre());
    }

}