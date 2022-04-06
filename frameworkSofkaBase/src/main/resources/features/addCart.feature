
# language: es

@FeatureName:SesionCarritoCompras
Característica: Realizar verificacion del carrito de compras
  Como cliente de la pagina YOURLOGO  una nueva experencia
  necesito verificar el carrito de compras
  para verificar funcionamiento del carrito de compras


  @ScenarioName:CarritoDeCompras
  Escenario: Ingresar a la seccion Carrito de compras
    Dado Que el cliente se encuentra en la pagina de inicio
    Cuando El cliente ingresa al carrito de compras
    Entonces como retorno de busqueda se despliega lista del carrito de compras

  @ScenarioName:AgregarProductoAlCarrito
  Escenario: Agregar un producto de la tienda al carrito de compras
    Dado Que el cliente se encuentra en la pagina de inicio
    Cuando El cliente selecciona un articulo de la seccion popular al carrito
    Entonces como resultado el cliente valida el producto agregado a la lista de productos del carrito