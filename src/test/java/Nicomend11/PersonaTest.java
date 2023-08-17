package Nicomend11;

import org.example.ClaseAutomation.Persona;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonaTest {

    @Test
    public void validarNombre() {
        Persona persona = new Persona("Nicolás", "Mendoza", 37);

        Assert.assertEquals(persona.getNombre(), "Nicolás");
    }

    @Test
    public void validarNombreIncorrecto() {
        Persona persona = new Persona("Nicolás", "Mendoza", 37);

        Assert.assertNotEquals(persona.getNombre(), "Nicolás5");
    }

    @Test
    public void validarSaludo() {
        Persona persona = new Persona("Julio", "Mendoza", 37);

        Assert.assertTrue(persona.saludar().equals("Hola, soy Julio Mendoza"));
    }
}
