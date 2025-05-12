# Analizador Léxico con JFlex

Este proyecto en Java implementa un analizador léxico utilizando **JFlex**. Fue desarrollado en **NetBeans**, y utiliza un archivo `.flex` para generar el analizador de tokens.

## Estructura del proyecto

- `src/codigo/Lexer.flex`: archivo de reglas léxicas de entrada para JFlex.
- `src/codigo/Principal.java`: ejecuta la generación del analizador léxico.
- `src/codigo/frmAnalizador.java` y `Analizador.form`: interfaz gráfica para probar el analizador (Swing).
- `src/codigo/Lexer.java`: **ya generado** desde el archivo `.flex`, listo para usarse.
- `src/codigo/Tokens.java`: archivo con los tipos de tokens definidos en la enumeración.
- `lib/jflex.jar`: biblioteca necesaria para que funcione JFlex (incluida en el proyecto).

## Requisitos

- Java JDK 8 o superior.
- NetBeans (cualquier versión reciente).
- El archivo `jflex.jar` ya está incluido en la carpeta `lib/`.

## Cómo usar

1. Abre el proyecto en NetBeans.
2. Asegúrate de que `lib/jflex.jar` esté agregado al **Classpath**:
3. Ejecuta `Principal.java` para generar el archivo `Lexer.java` a partir de `Lexer.flex`.
4. Usa la clase principal de la interfaz (`frmAnalizador.java`) para probar el analizador gráficamente.

