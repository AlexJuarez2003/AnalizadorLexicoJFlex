#Analizador Léxico con JFlex

Este proyecto en Java implementa un analizador léxico utilizando **JFlex**. Fue desarrollado en **NetBeans**, y utiliza un archivo `.flex` para generar el analizador de tokens.

## Estructura del proyecto

- `src/codigo/Lexer.flex`: archivo de reglas léxicas.
- `src/codigo/Principal.java`: ejecuta la generación y uso del analizador.
- `src/codigo/frmAnalizador.java` y `.form`: interfaz gráfica (Swing).
- `lib/jflex.jar`: biblioteca necesaria para generar el analizador.

## Requisitos

- Java JDK 8 o superior.
- NetBeans (cualquier versión reciente).
- El archivo `jflex.jar` ya está incluido en la carpeta `lib/`.

## Cómo usar

1. Abre el proyecto en NetBeans.
2. Asegúrate de que `lib/jflex.jar` esté agregado al **Classpath**:
3. Ejecuta `Principal.java` para generar el archivo `Lexer.java` a partir de `Lexer.flex`.
4. Usa la clase principal de la interfaz (`frmAnalizador.java`) para probar el analizador gráficamente.

