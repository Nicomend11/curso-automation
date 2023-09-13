# language: es

  Característica: Login

    @critical
    Escenario: Login correcto
      Dado que el usuario accede al Login de la pagina opencart
      Cuando el usuario ingresa email y contraseña validas
      Entonces  el usuario se encuentra en la pantalla de su cuenta
