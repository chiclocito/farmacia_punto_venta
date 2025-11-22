Punto de Venta - Farmacia

Sistema de punto de venta en **Java** para una farmacia, con manejo de clientes, productos y ventas.  
Incluye validación de **stock insuficiente** y **productos caducados** mediante excepciones personalizadas.

Características
- Registro de clientes y productos.
- Creación de ventas con ticket impreso en consola.
- Persistencia de ventas en archivo (`ventas.txt`).
- Excepciones personalizadas:
  - `StockInsuficienteException`: evita vender más unidades de las disponibles.
  - `ProductoCaducadoException`: evita vender productos vencidos.
- Ejemplo de polimorfismo con clases `Cliente`, `Vendedor` y `Administrador`
