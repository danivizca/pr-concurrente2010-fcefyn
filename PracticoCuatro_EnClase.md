

# Presentación del práctico #

En este práctico los alumnos pondrán en práctica la ejecución de múltiples hilos y su sincronización.

## Explicación ##

![http://upload.wikimedia.org/wikipedia/it/thumb/b/b5/FIFO-LIFO.svg/470px-FIFO-LIFO.svg.png](http://upload.wikimedia.org/wikipedia/it/thumb/b/b5/FIFO-LIFO.svg/470px-FIFO-LIFO.svg.png)

El modelo del productor consumidor consiste en un hilo Writer que almacena datos en un buffer de capacidad finita. Cuando esa capacidad es rebasada, el Writer debe esperar. Por otro lado, existe un hilo Reader que extrae datos del buffer, y cuando el buffer no posee datos, espera. El buffer es accedido según la política LIFO.

### Consigna ###

  1. Realizar el Diagrama de Clases.
  1. Haciendo uso de las herramientas que provee Java (synchronized, semáforos), solucionar el problema de concurrencia en la lectura y la escritura sobre el buffer.

**NOTA: Modificar el nombre de la clase Buffer por Buffer\_nroMatricula.**

### Preguntas ###

¿Que sentido tienen las interfaces Readable y Writable?
<a href='Hidden comment: ¿Si los datos no fueran consumibles (es decir, no son extraídos, solo reemplazados) alguna operación se podría llevar a cabo en simultáneo por varios hilos? ¿Cual y bajo que condiciones?'></a>

## Plazo de entrega ##

Martes 24, 23:59 hs.

# Celziuz #
El práctico de Celziuz (Barbero encubierto) va a ser considerado optativo. Por supuesto que quien lo envíe tendrá la posibilidad de obtener un OK+. Este práctico no tiene plazo de entrega.


# Resultados #