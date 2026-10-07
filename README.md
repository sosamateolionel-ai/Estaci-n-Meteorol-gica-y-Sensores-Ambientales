# Estación Meteorológica

## Descripción

Este proyecto simula una estación meteorológica capaz de registrar diferentes sensores y generar un reporte climático con lecturas aleatorias.

La estación utiliza sensores de **temperatura**, **humedad** y **presión atmosférica**. Cada sensor genera una lectura dentro de un rango determinado.

## Funcionamiento

Al iniciar el programa se crea una `EstacionMeteorologica`.

Luego se crean tres sensores:

* Sensor de temperatura.
* Sensor de humedad.
* Sensor de presión.

Los sensores se agregan a la estación meteorológica y finalmente se genera un reporte climático.

Las lecturas son generadas aleatoriamente mediante la clase `Random`.

## Clase `Sensor`

La clase `Sensor` representa un sensor meteorológico.

### Atributos

* `tipo`: indica qué tipo de sensor es.
* `random`: objeto utilizado para generar valores aleatorios.

Los atributos están encapsulados utilizando `private`.

### Constructor

```java
public Sensor(String tipo)
```

Permite crear un sensor indicando su tipo.

### `getTipo()`

Devuelve el tipo de sensor.

### `obtenerLectura(double valor)`

Genera una lectura aleatoria dependiendo del tipo de sensor.

Los rangos utilizados son:

| Sensor      | Rango              |
| ----------- | ------------------ |
| Temperatura | -5 °C a 35 °C      |
| Humedad     | 0 % a 100 %        |
| Presión     | 980 hPa a 1030 hPa |

Si se recibe un tipo de sensor que no está contemplado, el método devuelve `0`.

## Clase `EstacionMeteorologica`

Esta clase representa la estación que administra los sensores.

### Atributo

```java
private List<Sensor> sensores;
```

La estación utiliza una lista para almacenar todos los sensores registrados.

La lista se inicializa mediante un `ArrayList`.

### `agregarSensor(Sensor sensor)`

Agrega un sensor a la lista de sensores de la estación y muestra un mensaje indicando que fue agregado.

### `generarReporteClimatico()`

Genera el reporte climático.

El método:

1. Muestra el título del reporte.
2. Comprueba si existen sensores registrados.
3. Recorre la lista utilizando un `for`.
4. Obtiene una lectura de cada sensor.
5. Muestra el tipo de sensor y su valor.
6. Finaliza el reporte.

Si no existen sensores, se informa:

```text
No hay sensores registrados.
```

## Ejemplo de ejecución

<img width="321" height="272" alt="image" src="https://github.com/user-attachments/assets/f0d4aec4-83a4-405d-8469-f6133cd847c5" />

## Conceptos utilizados

Este ejercicio permite practicar:

* Programación Orientada a Objetos.
* Clases y objetos.
* Constructores.
* Encapsulamiento.
* Atributos privados.
* Getters.
* Métodos.
* Asociación entre clases.
* `ArrayList`.
* Interfaz `List`.
* Bucle `for`.
* Condicionales `if/else`.
* Generación de números aleatorios con `Random`.
* Formateo de datos con `printf`.
* Comunicación entre objetos.

## Tecnologías utilizadas

* Java
* IntelliJ IDEA
* Git
* GitHub

## Ejecución

El programa puede ejecutarse desde **IntelliJ IDEA** utilizando el botón **Run**.

Cada ejecución genera diferentes valores para las mediciones meteorológicas debido al uso de números aleatorios.
