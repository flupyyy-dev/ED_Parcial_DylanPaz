# Examen Parcial – Estructura de Datos  
## Análisis Experimental de Complejidad Algorítmica (Big-O)

### 📌 Descripción del Proyecto y Link de vídeo youtube

En el presente proyecto se implementaron ocho algoritmos en lenguaje Java, desarrollados en versión iterativa y recursiva, con el objetivo de analizar su rendimiento y determinar su complejidad algorítmica (Big-O) a partir de datos experimentales.

Los algoritmos implementados fueron:

- Factorial (Iterativo y Recursivo)
- Fibonacci (Iterativo y Recursivo sin memoización)
- Búsqueda Lineal (Iterativa y Recursiva)
- Ordenamiento Burbuja (Iterativo y Recursivo)

---

### ⚙️ Metodología

Para medir el rendimiento de los algoritmos se utilizó:

- `System.nanoTime()` para medición en nanosegundos.
- Promedio de 5 ejecuciones por cada tamaño de entrada.
- Exclusión de la inicialización de datos dentro del tiempo medido.
- Pruebas con distintos tamaños de entrada.
- Generación de archivo CSV para análisis en Excel.
- Creación de 4 hojas con gráficas de líneas y líneas de tendencia.

---

### 📊 Resultados y Complejidad Big-O

A partir del análisis de las gráficas generadas en Excel, se identificaron las siguientes complejidades:

| Algoritmo | Versión | Complejidad |
|------------|----------|-------------|
| Factorial | Iterativo | O(n) |
| Factorial | Recursivo | O(n) |
| Fibonacci | Iterativo | O(n) |
| Fibonacci | Recursivo | O(2ⁿ) |
| Búsqueda Lineal | Iterativo | O(n) |
| Búsqueda Lineal | Recursivo | O(n) |
| Burbuja | Iterativo | O(n²) |
| Burbuja | Recursivo | O(n²) |

---

### 📈 Observaciones Importantes

- La versión recursiva de Fibonacci presenta crecimiento exponencial debido a la duplicación de llamadas.
- Las versiones recursivas pueden presentar limitaciones prácticas por uso de pila (StackOverflow).
- El algoritmo Burbuja muestra comportamiento cuadrático evidente en escenarios aleatorios e inversos.
- Los resultados experimentales coinciden con el análisis teórico de complejidad.

---

### 📂 Archivos Incluidos

- Código fuente en Java (.java)
- Archivo Excel con gráficas de rendimiento
- PDF con análisis de complejidad
- README con descripción del proyecto

---

### 🎯 Conclusión

El análisis experimental permitió comprobar que el comportamiento práctico de los algoritmos coincide con su complejidad teórica. Este ejercicio facilitó la comprensión del impacto del crecimiento del tamaño de entrada en el rendimiento de los algoritmos y la diferencia entre enfoques iterativos y recursivos.

---

**Autor:** [Dylan Odair Paz Navas]  
**Curso:** Estructura de Datos I  
**Universidad:** Universidad Da Vinci de Guatemala 
