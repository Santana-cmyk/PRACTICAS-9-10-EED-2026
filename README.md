# PRACTICAS - TEMA 9 y 10

## Descripción general

Este repositorio contiene varias prácticas relacionadas con el uso de herramientas de desarrollo en Java, centradas en pruebas unitarias, análisis de código, cobertura, refactorización y documentación.


---

## Ejercicio 1 – Tests unitarios con JUnit 5

<div align="center">
  <img src="imagen.png" width="400">
</div>

### 1.1 Descripción

En este ejercicio se trabaja con **JUnit 5** en Eclipse para introducir el concepto de pruebas unitarias en Java.

Se utiliza una clase `Rectangulo`, sobre la que se implementan pruebas para validar el correcto funcionamiento de sus métodos.

<div align="center">
  <img src="imagen.png" width="400">
</div>

Se implementa una clase `Rectangulo` con los métodos:

- `area()`
<div align="center">
  <img src="imagen.png" width="400">
</div>
- `perimetro()`
<div align="center">
  <img src="imagen.png" width="400">
</div>
---

### 1.2 Cambios realizados en la clase

Se han añadido validaciones a los métodos:

- Si algún valor es negativo, el método devuelve `-1`.
- Si algún valor es `0`, el método devuelve `0`.

<div align="center">
  <img src="imagen.png" width="400">
</div>

---

### 1.3 Casos de prueba

Se han creado tests para cubrir:

- Valores positivos
- Valores negativos
- Valores iguales a cero

También se incluyen aserciones para comprobar el correcto funcionamiento del sistema de tests.

<div align="center">
  <img src="imagen.png" width="400">
</div>

---

## Ejercicio 2 – Cobertura de tests con EclEmma

<div align="center">
  <img src="imagen.png" width="400">
</div>

### 2.1  Descripción

Se utiliza la herramienta **EclEmma** para analizar la cobertura de los tests unitarios.

El objetivo es comprobar qué partes del código han sido ejecutadas por las pruebas.

---

### 2.2 Resultado

Se busca alcanzar una cobertura lo más cercana posible al 100%, asegurando que todas las ramas del código han sido evaluadas.

<div align="center">
  <img src="imagen.png" width="400">
</div>

---

## Ejercicio 3 – Análisis de código con SonarLint

<div align="center">
  <img src="imagen.png" width="400">
</div>

### 3.1 Descripción

Se utiliza **SonarLint** para analizar el código en tiempo real dentro de Eclipse.

La herramienta detecta posibles problemas de calidad, estilo y buenas prácticas.

---

### 3.2 Documentación SonarLint - SonarQube

<div align="center">
  <img src="imagen.png" width="400">
</div>

---

## Ejercicio 4 – Refactorización en Eclipse

### 4.1 Descripción

Se aplican técnicas de refactorización sobre el proyecto inicial.

---

### 4.2 Cambios realizados

- Extracción de constantes (valor 2 en perímetro)
- Renombrado de métodos:
  - `area` → `surface`
  - `perimetro` → `perimeter`
- Renombrado de clase:
  - `Rectangulo` → `Rectangle`
- Extracción de lógica común para validación de parámetros

<div align="center">
  <img src="imagen.png" width="400">
</div>

---

### 4.3 Validación

Después de cada refactorización se vuelven a ejecutar los tests para comprobar que el comportamiento no se ha modificado.

---

## Ejercicio 5 – Documentación con Javadoc y Markdown

### 5.1 Descripción

Se documenta el proyecto utilizando Javadoc en el código y Markdown en el repositorio.

---

### 5.2 Contenido de la documentación Javadoc

- Autor del proyecto
- Versión
- Descripción de métodos
- Parámetros de entrada
- Valores de retorno

<div align="center">
  <img src="imagen.png" width="400">
</div>

---
