

**Por favor respeten el formato para presentar los trabajos. Está claramente especificado que nombre deben tener las clases a presentar y donde responder preguntas!**

# Presentación del práctico #

En este práctico los alumnos pondrán en práctica la ejecución de múltiples hilos y su sincronización.

![http://pr-concurrente2010-fcefyn.googlecode.com/files/vehiculo_logo_resized.jpg](http://pr-concurrente2010-fcefyn.googlecode.com/files/vehiculo_logo_resized.jpg)

## Explicación ##

Se tiene un vehículo con 2 puertas, llamadas A y B, una cantidad máxima de ingresos por cada puerta y dos números que representan la cantidad de ingresos ya ocurridos en cada puerta. De acuerdo a la implementación del vehículo, pueden ingresar por cada puerta de a un pasajero, o en cantidad.
Existe/n un/dos inspector/es (o no) dentro del vehículo que verifica/n que se cumpla con la política de ingreso establecida.

### Consigna ###

  1. Crear una clase que implemente Pasajero. El Pasajero intenta entrar al Vehículo por alguna de las dos puertas. La decisión es tomada aleatoriamente, al momento del ingreso, por el individuo.
  1. Crear 3 clases que extiendan de Vehiculo (agregando a la clase creada el numero de matrícula, ejemplo: ColectivoSinControl\_nromatricula).
    1. Vehiculo sin control. Los Pasajeros ingresan por cualquier puerta sin restricción alguna (salvo la restricción dada por el número de ingresos máximo en cada puerta).
    1. Vehículo con un inspector. Los Pasajeros ingresan de a uno por vez (pues el inspector los controla de a uno por vez, sin importar la puerta). Si el inspector está controlando a alguien en la puerta A (o B) los demás deben esperar. El número de ingresos máximo debe ser respetado.
    1. Vehículo con dos inspectores. Los Pasajeros ingresan de a uno por vez **por cada puerta** (uno por puerta A y simultáneamente otro por puerta B). También se respeta el número de ingresos máximo.

### Preguntas ###

Responder las siguientes preguntas:

(como comentario en la parte superior de la implementación del vehículo sin control)

  1. ¿Entran más usuarios de los permitidos en algún caso? ¿Por qué?
  1. ¿Cuál es la ventaja de la implementación del Vehículo con 2 inspectores respecto del que tiene 1 sólo?

## Diagrama de Clases ##

![http://pr-concurrente2010-fcefyn.googlecode.com/files/Vehiculo3.jpg](http://pr-concurrente2010-fcefyn.googlecode.com/files/Vehiculo3.jpg)


**_Plazo: Martes 4, 23:59. EXTENDIDO UNA SEMANA MÁS!!!_**

# Resultados #
(no hay resultados)