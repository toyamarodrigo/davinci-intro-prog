# Analisis en Sistemas - 1er Cuatrimestre

## Introduccion a la Programación

## Ejercicios

## Secuencia

1) Escribir un programa en el cual se ingresen cuatro números, calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto.

2) Realizar un programa que lea cuatro valores numéricos e informar su suma y promedio.

3) Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente. Mostrar lo que debe abonar el comprador.

4) Dada la matricula y 3 calificaciones de un alumno  a lo largo de un semestre, se pide imprimir la matricula y el promedio de sus calificaciones

5) Se tiene como dato la cant de cajas de discos que tenemos, se pide determinar cuantos discos tenemos en total y cual es el costo. Se conoce que cada caja trae 10 discos y cuesta $ 5.80. Indica cual es el diagrama correcto para resolver este problema:

|          A         |            B           |          C         |
|:------------------:|:----------------------:|:------------------:|
|    Ingresar cant   |      Ingresar cant     |    Ingresar cant   |
|    cd <- cant*10   |     cd <- cant * 10    |   cd <- cant * 10  |
| tot <- cant / 5.80 |   tot <- cant * 5.80   | tot <- cant * 5.80 |
|     mostrar cd     | mostrar cd + "-" + tot |     mostrar cd     |
|     mostrar tot    |            F           |     mostrar tot    |
|          F         |                        |          F         |


6) Dado como datos el costo de un articulo vendido  y la cantidad de dinero entregada por el cliente, calcular e imprimir el cambio que debe entregársele al mismo.

7) Dado como dato el valor del lado de un cuadrado , se pide imprimir el perímetro y área del mismo

8) En una casa de cambio necesitan un programa tal que dado como datos una cantidad expresada en dólares, convierta esa cantidad a pesos

9)  Determinar la salida del siguiente programa:

|               C               |
|:-----------------------------:|
|             M = 1             |
|             S = 5             |
|             H = 10            |
|         H <- M * S + H        |
|           S <- H + M          |
| Mostrar H + "-" + S + "-" + M |
|               F               |

## Condicionales simples

1) Dado como dato la calificación de un alumno en un examen, escribir  “aprobado” si la nota es mayor o igual a 4 y “no aprobado” si la nota es inferior.

2) Dado el sueldo y la categoría de un trabajador ( A o B), calcular su sueldo si se conoce que si es de categoría A, se incrementa un 2%, si su categoría es B se incrementa un  5%

3) Realizar una factura para Metrogas, solo se ingresa como datos la cantidad de m3 consumidos, teniendo en cuenta:

   + a) Hasta 150 m3 abona $15.80.
   + b) Por los siguientes m3 consumidos para 1.50$ por c/u.

4) En una librería si la compra se realiza  al contado ( C )  recibe un 10% de descuento. Se ingresara como dato el total de la venta y el tipo de venta, indicar cuanto debe abonar el cliente

5) Ping- pong de preguntas
Se desea hacer 3 preguntas y de acuerdo a las respuestas, el programa debe indicar al finalizar  cuantas respuestas fueron correctas
    + a) ¿Cuál es la raíz cuadrada de 144?
    + b) ¿Quién fundo Bs As?
    + c) ¿Cuál es la capital de Francia?

6) Realizar un programa que calcule el cociente de 2 valores reales a/b, como la división por 0 no esta definida, en este caso el programa debe emitir la leyenda “imposible dividir por 0”

## Condicionales anidados

   1) Dados como datos la categoría y el sueldo de un trabajador, calcular el aumento correspondiente teniendo en cuenta la siguiente tabla:

| Categoria | Sueldo |
|:---------:|--------|
|     A     | 15%    |
|     B     | 10%    |
|     C     | 5%     |

   2) Dados 3 números, si el primero es mayor que el segundo pero menor que el tercero se debe sumar los tres datos, en cualquier otro caso se multiplicaran.

   3) Dados los datos A, B y C que representan números enteros diferentes. Calcular cual es el mayor.

   4) Dados 3 números enteros ordenarlos en forma descendente.

   5) Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas que se le realizaron y la cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:

|  Nivel Maximo  | Porcentaje >= 90%         |
|:--------------:|---------------------------|
|   Nivel Medio  | Porcentaje >= 75% y < 90% |
|  Nivel Regular | Porcentaje >= 50% y < 75% |
| Fuera de nivel | Porcentaje < 50%          |


## Conectivos lógicos

1) Hacer un programa para calcular el precio de un billete de ida y vuelta en ferrocarril, conociendo la distancia de ida y el tiempo de estancia. Se sabe además que si el número de días de estancia es superior a 7 y la distancia total a recorrer es superior a 800 km, el billete tiene un  descuento del 30%. El precio por km es de $3.70. Indica cuanto debe abonar.
2) En la entrada del cine se debe indicar si es “menor”, “activo” o “jubilado”. Si la categoría es menor o jubilado se le realiza un 25% de descuento.
3) Dados 2 números, se pide calcular la división solo en el caso que el primero sea mayor que el segundo y el segundo distinto de 0.


## Condicionales anidados con conectivos lógicos

1) Dados los datos de categoría y sueldo de un trabajador, calcular el aumento correspondiente teniendo en cuneta la siguiente tabla:


| Categoria | Sueldo |
|:---------:|:------:|
| A y C     |   15%  |
| B y D     |   10%  |
| E         |   5%   |

2) Dados 3 números determinar cual es el mayor.
3) Dados 3 números enteros ordenarlos en forma ascendente.
4) Dados los lados de un triangulo determinar si es equilátero, isósceles o escaleno.
5) Considerar el ejercicio anterior, pero solo se podrá resolver si se cumple que los lados forman un triangulo. Debe cumplir: la suma de los lados menores es mayor que la del lado mayor (considerar todos los casos)


## Selector múltiple

1) Construir un programa que permita realizar operaciones aritméticas elementales con 2 valores, según la clave que se ingresa

| Clave |    Operacion   |
|:-----:|:--------------:|
|   1   |      suma      |
|   2   |      resta     |
|   3   | multiplicacion |
|   4   |    división    |

2)  El costo de las llamadas internacionales depende de la zona geográfica del país destino y de la cantidad de minutos hablados. En la siguiente tabla se representa el costo del  minuto por zona, cada zona tiene un numero clave conocido por el operador y si el costo supera los 15$, se le realiza un 15% de descuento ,solo se ingresa la clave y los minutos El programa debe indicar la zona y el total a pagar

| Clave |        Zona       | Precio |
|:-----:|:-----------------:|--------|
|   12  | America del norte | 0.68   |
|   15  | America central   | 0.55   |
|   18  | America sur       | 0.62   |
|   19  | Europa            | 0.85   |
| 23    | Asia              | 0.89   |
| 25    | Africa            | 0.82   |

3) Calcular el sueldo de un operario teniendo en cuenta la cantidad de horas extras y la cant de horas, de acuerdo a los valores indicados:

| Categoria | Precio Hora | Precio Hora Extra |
|:---------:|:-----------:|-------------------|
|     1     |     $14     |       $20.50      |
|     2     |     $17     |        $24        |
|     3     |     $21     |        $34        |

 Cada trabajador puede tener como máximo 30 horas extras, si tiene mas se le paga un 7%                            menos del valor indicado en la tabla a cada categoría 

4) Se pide determinar si los alumnos pueden acceder a la beca o no de acuerdo a su promedio:

|           Carrera           | Cuatrimestre | Promedio |
|:---------------------------:|:------------:|----------|
| 1-Economia o 4-Contabilidad |     >= 6     |   > 9.0  |
|  2-Informatica o 6-Sistemas |      > 6     |   > 9.2  |
|   3-Agronomía o 5-Quimica   |      > 5     |   > 8.8  |

5) Una empresa utiliza el siguiente tipo de comercialización para sus productos. Se tienen 2 productos A y B, el producto A tiene tres tipos de fragancias diferentes (primavera, marino y otoño) y el producto B tiene tres tipos de presentaciones diferentes (pequeño, mediano y grande)
El costo de cada uno es:

|    Producto A   |   Producto B  |
|:---------------:|:-------------:|
|   Otoño $1.50   |  grande $2.05 |
| Primavera $1.55 | mediano $1.60 |
| Marino $1.60    | pequeño $1.10 |

Indicar el valor final de la compra, si solo se puede comprar un solo tipo de producto y si la cantidad comprada supera los $100, se le debe realizar un descuento del 10%  sobre el total de la compra




## ESTRUCTURAS  DE  REPETICION 

A -  PARA  HASTA

1) Dados como datos los sueldos de 10 trabajadores, obtener el total de sueldos pagados en el mes
2) Generar al azar 20 números en el intervalo (0-100), imprimir la cantidad de ceros que salieron
3) Generar 100 números al azar y verificar la cantidad que salieron entre 0 y 25, la cantidad entre 25 y 50, la cantidad entre 50 y 75 y la cantidad entre 75 y 100
4) Dados n números enteros, calcular el menor de ellos
5) Dado el sueldo de n personas, se pide obtener:
   + la cantidad de desocupados, la cantidad que cobran hasta 500$, la cantidad que cobran entre 500 y 1000, la cantidad entre 1000 y 2000, y los que superan los 2000
   + el sueldo máximo y el nombre de la persona de sueldo máximo
   + total de sueldos pagados
6) Dados n números enteros calcular el rango. Rango: es la diferencia entre el numero mayor y el menor

B -  MIENTRAS  HACER / REPITE HASTA

1) Se tiene la nota de un grupo de estudiantes. Se pide determinar cuantos aprobaron (nota> 4), de estos cuantos deben presentar tp (nota >= 7) y cuantos rinden escrito (nota <7) y cuantos desaprobaron 
Para finalizar se ingresar una nota negativa

2) Dados pares de números se pide calcular el promedio de ellos, el programa termina cuando el usuario responde “no” a la pregunta desea calcular otro par?

3) Se desea calcular el puntaje de un equipo de fútbol al finalizar el campeonato. Se distinguen con la letra “G” los partidos ganados, con “E” los empatados y con “P” los perdidos. Para indicar el fin se ingresara un “ * “
   + realizar el programa
   + modificar el programa anterior de modo tal que indique el número de partidos ganados, el de perdidos y el de empatados
   
4) Se pide realizar una factura de Edenor. Por cada cliente se ingresar el nombre, tipo de cliente, dirección, registro inicial de medidor y registro final de medidor. Para finalizar se ingresara un  *  en nombre de cliente

| Tipo de Cliente |                      Calor del kv/h                      |
|:---------------:|:--------------------------------------------------------:|
|      A o C      | hasta 140 o menos $3.20; > 140 y < 300 $4, si > 300 $4.5 |
|      B o D      |           hasta 200 o menos $4.5; si > 200 $5.3          |

Al finalizar el día se pide indicar
+ cantidad de facturas realizadas
+  total de monto facturado
+ Total de kv/h consumidos

5) En una universidad se hará un relevamiento entre una cantidad  no determinada de alumnos.
Se desea obtener
   + porcentaje de la población femenina
   + porcentaje población masculina
   + mejor promedio cuatrimestral de la población femenina
   + mejor promedio cuatrimestral de la población  masculina
    Los datos que se ingresan son: sexo, promedio, matricula. Para indicar el fin se ingresa un 0 como matricula


6) En una escuela se debe determinar cuales son los alumnos que tienen aptitudes para formar el nuevo equipo de básquet:

Se pide imprimir: 
+ total de alumnas relevadas
+ cantidad de alumnas que tienen aptitudes para formar el equipo: altura >= 1.73 y peso entre 55 y 83 kg
+ porcentaje que representa la cantidad anterior con respecto al total de alumnas relevadas
+ total de alumnos varones relevadas
+ cantidad de alumnos que tienen aptitudes para formar el equipo: altura >= 1.83 y peso entre 73 y 105  kg
+ porcentaje que representa la cantidad anterior con respecto al total de alumnos varones relevados
+ total de alumnos relevados
Este programa finalizara con la pregunta ¿ingresa otro registro?


Determinar la estructura de repetición y realizar
 
1) En una librería se realizan ventas de dos tipos: contado y tarjeta de crédito Se pide obtener la siguiente información correspondiente a un día de trabajo

+ cantidad de ventas con tarjeta
+ total de efectivo al realizar el arqueo de caja
+ monto total de ventas con tarjeta
+ monto total de ventas del día
+ venta máxima
+ nombre vendedor venta máxima
Indicar cual seria la condición de fin para utilizar un for, do o while y realizar con una de ellas (do o while)

2) Una persona invierte en un banco un cierto capital y quiere saber cuanto obtendrá al cabo de cierto tiempo, si el dinero se colocó a una tasa de interés mensual determinada (el interés es acumulativo).


Arrays

1) Desarrollar un programa que genere al azar 8 elementos, e informe:
   + El valor acumulado de todos los elementos del vector.
   + Cantidad de  elementos del vector que sean iguales a 36.
   + Cantidad de valores mayores a 50.

2) Se tienen las notas del primer parcial de los alumnos de dos cursos, el curso A y el curso B, se guardan en un array por cada curso, cada curso cuenta con 5 alumnos.
Realizar un programa que muestre el curso que obtuvo el mayor promedio general.

3) Realizar un programa que lea los tiempos en los que de 10 corredores han acabado una carrera. El programa debe determinar qué corredores tienen el primer, segundo y último puesto, así como cuál es el tiempo medio en que se ha corrido la carrera.


Matrices

A - Crear y cargar una matriz de 3 filas por 4 columnas. Imprimir la primera fila  e imprimir la primera columna