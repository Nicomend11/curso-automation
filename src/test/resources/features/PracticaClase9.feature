# language: es

  Característica: Login

    @critical
    Escenario: Login correcto
      Dado que el usuario accede al login de la pagina opencart
      Cuando el usuario ingresa email y contraseña validas
      Entonces  el usuario se encuentra en la pantalla de su cuenta

    Escenario: Login incorrecto
      Dado que el usuario accede al login de la pagina opencart
      Cuando el usuario ingresa email y contraseña invalidas
      Entonces  el usuario se encuentra con un mensaje de alerta
