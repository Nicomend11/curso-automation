# language: es

Característica: Register

  @critical
  Escenario: Usuario ya registrado
    Dado que el usuario accede al registro en la pagina opencart
    Cuando el usuario completa sus datos personales obligatorios
    Entonces  el usuario ya se encuentra registrado en la pagina

  Escenario: Nuevo Registro de Usuario
    Dado que el usuario accede al registro en la pagina opencart
    Cuando el usuario completa sus datos personales obligatorios
    Entonces  el usuario se encuentra registrado en la pagina
