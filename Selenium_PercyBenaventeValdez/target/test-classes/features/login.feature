#language: es
@testfeature
Característica: Login
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items

  @test
  Escenario: Iniciar sesión
    Dado que me encuentro en la página de login de Platanitos
    Cuando inicio sesión con las credenciales usuario: "percy.benavente14@gmail.com" y contraseña: "*Carmela123"
    Y valido que debería aparecer el título de "Percy Justo Benavente Valdez"
    Entonces ingreso a la opcion "ofertas"
    Y doy click a item
    Y agregar al carrito de compras
    Y valido que debería aparecer el banner "Agregado correctamente."