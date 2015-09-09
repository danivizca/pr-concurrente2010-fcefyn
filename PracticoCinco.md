

**Por favor respeten el formato para presentar los trabajos. ¡Está claramente especificado qué nombre deben tener las clases a presentar y dónde responder preguntas!**

# Presentación del práctico #

En este práctico los alumnos pondrán en práctica todo lo aprendido hasta el momento en un caso más aplicado.

![http://pr-concurrente2010-fcefyn.googlecode.com/files/Prac5c.jpg](http://pr-concurrente2010-fcefyn.googlecode.com/files/Prac5c.jpg)

## Explicación ##

Generador de Señales.

Se desea tomar muestras de distintas señales. Dichas muestras deberán ser almacenadas en archivo y utilizadas para representar las señales en pantalla.

Se tiene un _**Generator**_ de n señales que deben ser muestreadas periódicamente. La cantidad de señales debe ser ingresada por el Usuario. También debe existir un mecanismo para que el Usuario inicie el muestreo (por ejemplo mediante un click en un botón Play).

**Para cada señal** se tiene un _**Analyzer**_ de canal. Dicho analizador cuenta con un objeto que lo lee y genera un dato (por lo cual se llama _**Producer**_), un _**Buffer**_ y un _**Consumer**_ (pues consume datos del buffer). El Analyzer en su conjunto debe tomar muestras del canal respetando la periodicidad dada. Para garantizar que no se pierden muestras, las mismas son almacenadas en el Buffer. El Consumidor del canal será el **responsable de extraer muestras de dicho buffer y gestionar** el almacenamiento y presentación en patalla de dichas muestras.

Un _**Logger**_ será responsable de almacenar muestras en un único archivo. Un _**Printer**_ será responsable de representar gráficamente los últimos 10 valores de cada señal.

### Consigna ###

  1. Realizar diagrama de clases.
  1. Implementar el proyecto.
  1. Presentar vía repositorio SVN. Hacer commit únicamente a los archivos .class. Los archivos .java van a ser preservados hasta próximo aviso (cumplido el plazo). Si los .class cambian al ser compilados los .java correspondientes, se considerará que los archivos fuente han sido modificados luego de la fecha límite (y corresponderá un OK- cuando mucho).

CUMPLIR CON EL FORMATO DE ENTREGA.

Cualquier duda, consultar por este medio.

## Plazo de Entrega ##

_**Plazo: Martes 1°, 23:59.** -> **PRÓRROGA HASTA EL MARTES 8 (el práctico lo amerita)**_

# Resultados #