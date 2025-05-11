package codigo;
import static codigo.Tokens.*;

%%

%class Lexer
%type Tokens

L = [a-zA-Z_][a-zA-Z0-9_]*
D = [0-9]+
espacio = [ \t\r\n]+

%{
  public String lexema;
%}

%%

"Robot" {
    lexema = yytext();
    return PalabraReservada;
}

"iniciar"|"finalizar" {lexema = yytext(); return Accion;}

"base"|"cuerpo"|"garra"|"velocidad"|"cerrarGarra"|"abrirGarra"|"repetir" {
    lexema = yytext();
    return Metodo;
}

{espacio} { /* ignorar espacios en blanco */ }

"." { lexema = yytext(); return Punto; }

"(" { lexema = yytext(); return ParentesisAbre; }

")" { lexema = yytext(); return ParentesisCierra; }

{L} {
    lexema = yytext();
    return Identificador;
}

{D} {
    lexema = yytext();
    return Valor;
}

. {
    lexema = yytext();
    return Error;
}