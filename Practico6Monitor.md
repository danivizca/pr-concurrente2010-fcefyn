# Práctico 6 #

Este práctico consiste en 2 pequeños prácticos.

## Práctico de Monitor ##

### Detalles ###

Para el Vehículo Sin Control (del Práctico 3), implementar dos monitores que aseguren que el acceso ocurre:
1) de a un pasajero;
2) de a dos pasajeros.

**Ya está en el repositorio el proyecto guía.**

Aquí se presenta a modo **recordatorio** el diagrama de clases del Práctico 3.

![http://pr-concurrente2010-fcefyn.googlecode.com/files/Vehiculo3.jpg](http://pr-concurrente2010-fcefyn.googlecode.com/files/Vehiculo3.jpg)

Presentar diagrama de clases correspondiente.

Responder a la pregunta:

  * ¿Qué ventaja tiene el uso de monitores para este caso?

  * ¿En qué circunstancias el uso de monitores es la única alternativa para la solución de problemas de concurrencia?

## Práctico de Celziuz ##

### Detalles ###

Se tiene un comercio con espacio para 20 clientes. Cada cliente posee su edad generada aleatoriamente entre 0 y 100 años (inclusive). Existen disponibles 5 sillas, en las cuales se sentarán las personas con mayor edad. La atención es por orden de llegada, y en nada influye la edad.

Existen sólo 3 vendedores, los cuales poseen un único puesto de cobranza. Cada vez que un vendedor necesita realizar el cobro, debe esperar a que dicho puesto esté disponible. Si esto no ocurre, debe esperar junto al cliente su turno.

La puerta de salida sólo permite el egreso de a 1 cliente por vez. Un cliente puede abandonar el local sólo luego del cobro.


# Entrega #

La entrega se realizará de manera similar al práctico anterior. Se creará en el repositorio de SVN un nuevo proyecto con una clase Main que inicializará el conjunto de clases de cada alumno. El práctico es individual. Hasta el momento de vencimiento de plazo sólo se deberá subir al repositorio el .class de cada clase, ubicados en un paquete correspondiente dentro del proyecto.

## Plazo ##

Martes 23 de Junio de 2010, hasta las 23:59 hs.

**Prórroga: Martes 30 de Junio, hasta las 23:59 hs.**