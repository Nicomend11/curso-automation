# language: es

Característica: Register

  @critical

  Escenario: Nuevo Registro de Usuario
    Dado que el usuario accede al registro en la pagina opencart
    Cuando el usuario completa sus datos personales obligatorios
    Entonces  el usuario se encuentra registrado en la pagina

  Escenario: Usuario ya registrado
    Dado que el usuario accede al registro en la pagina opencart
    Cuando el usuario completa sus datos personales obligatorios
    Entonces  el usuario ya se encuentra registrado en la pagina

  Escenario: Usuario no completa datos
    Dado que el usuario accede al registro en la pagina opencart
    Cuando el usuario no completa su email como dato obligatorio
    Entonces  el usuario no se registra en la pagina


