package org.example.ClaseAutomation.stepDenitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class LoginDefinitions {

    @Dado("que el usuario accede al Login de la pagina opencart")
    public void queElUsuarioAccedeAlLoginDeLaPaginaOpencart() {
        System.out.println("Step DADO");
    }

    @Cuando("el usuario ingresa email y contraseña validas")
    public void elUsuarioIngresaEmailYContraseñaValidas() {
        System.out.println("Step CUANDO");
    }

    @Entonces("el usuario se encuentra en la pantalla de su cuenta")
    public void elUsuarioSeEncuentraEnLaPantallaDeSuCuenta() {
        System.out.println("Step ENTONCES");
    }
}
