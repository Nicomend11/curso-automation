package Nicomend11;

import org.example.ClaseAutomation.Persona;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonaTest {

    @Test
    public void validarNombre() {
        Persona persona = new Persona("Cesar", "Mejia", 30);
        persona.setNombre("Cesar");

        Assert.assertEquals(persona.getNombre(), "Cesar");
    }

    @Test
    public void validarNombreIncorrecto() {
        Persona persona = new Persona("Cesar", "Mejia", 30);

        Assert.assertNotEquals(persona.getNombre(), "Cesar2");
    }

    @Test
    public void validarSaludo() {
        Persona persona = new Persona("Octavio", "Mejia", 30);

        Assert.assertTrue(persona.saludar().equals("Hola, soy Octavio Mejia"));
    }
}