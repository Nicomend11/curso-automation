# language: es

Característica: Add product to cart

  @critical
  Escenario: Agregar producto al carrito
    Dado que el usuario se encuentra en la pagina de su cuenta
    Cuando el usuario ingresa ingresa en la seccion Cameras
    Cuando el usuario selecciona el producto, elige una opcion y lo agrega al carrito
    Cuando el usuario ingresa al carrito
    Entonces el usuario posee un producto en el carrito
