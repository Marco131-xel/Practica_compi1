package Analizadores;

// IMPORTACIONES
import java_cup.runtime.Symbol;
import java.util.LinkedList;
import java.util.List;
import excepciones.Errores;

%%

// CODIGO USUARIO
%{
    public LinkedList<Errores> errores = new LinkedList<>();    

    public LinkedList<Errores> getErrores() {
        return errores;
    }
%}

%init{
    yyline = 1;
    yycolumn =1;
    errores = new LinkedList<>();

%init}

// CARACTERISTICAS DE JFLEX
%cup
%class scanner
%public
%line
%char
%column
%full
// %DEBUG
%ignorecase

// GRAFICAR
GRAFICAR="graficar"
// FIGURAS
CIRCULO="circulo"
CUADRADO="cuadrado"
RECTANGULO="rectangulo"
LINEA="linea"
POLIGONO="POLIGONO"
// ANIMACION
TIPOANIMACION="curva"|"line"
ANIMAR="animar"
OBJETO="objeto"
ANTERIOR="anterior"
// COLORES
COLOR="azul"|"rojo"|"amarillo"|"verde"|"celeste"|"rosado"|"gris"|"naranja"|"negro"
// SIMBOLOS DEL SISTEMA
ID=[a-zA-z][a-zA-Z0-9_]*
NUM=[0-9]+
DECIMAL=[0-9]+\.[0-9]+
BLANCOS=[\ \r\t\f\n]+
// SIGNOS
PAR1="("
PAR2=")"
COMA=","
SUMA="+"
RESTA="-"
MULTI="*"
DIVISION="/"

%%
<YYINITIAL> {ANIMAR} {return new Symbol(sym.ANIMAR, yyline, yycolumn, yytext());}
<YYINITIAL> {OBJETO} {return new Symbol(sym.OBJETO, yyline, yycolumn, yytext());}
<YYINITIAL> {ANTERIOR} {return new Symbol(sym.ANTERIOR, yyline, yycolumn, yytext());}
<YYINITIAL> {TIPOANIMACION} {return new Symbol(sym.TIPOANIMACION, yyline, yycolumn, yytext());}


<YYINITIAL> {GRAFICAR} {return new Symbol(sym.GRAFICAR, yyline, yycolumn, yytext());}
<YYINITIAL> {CIRCULO} {return new Symbol(sym.CIRCULO, yyline, yycolumn, yytext());}
<YYINITIAL> {CUADRADO} {return new Symbol(sym.CUADRADO, yyline, yycolumn, yytext());}
<YYINITIAL> {RECTANGULO} {return new Symbol(sym.RECTANGULO, yyline, yycolumn, yytext());}
<YYINITIAL> {LINEA} {return new Symbol(sym.LINEA, yyline, yycolumn, yytext());}
<YYINITIAL> {POLIGONO} {return new Symbol(sym.POLIGONO, yyline, yycolumn, yytext());}

<YYINITIAL> {COLOR} {return new Symbol(sym.COLOR, yyline, yycolumn, yytext());}

<YYINITIAL> {ID} {return new Symbol(sym.ID, yyline, yycolumn,yytext());}
<YYINITIAL> {NUM} {return new Symbol(sym.NUM, yyline, yycolumn, Integer.parseInt(yytext()));}
<YYINITIAL> {DECIMAL}  { return new Symbol(sym.DECIMAL, yyline, yycolumn, Double.parseDouble(yytext())); }

<YYINITIAL> {PAR1} {return new Symbol(sym.PAR1, yyline, yycolumn, yytext());}
<YYINITIAL> {PAR2} {return new Symbol(sym.PAR2, yyline, yycolumn, yytext());}
<YYINITIAL> {COMA} {return new Symbol(sym.COMA, yyline, yycolumn, yytext());}
<YYINITIAL> {SUMA} {return new Symbol(sym.SUMA, yyline, yycolumn, yytext());}
<YYINITIAL> {RESTA} {return new Symbol(sym.RESTA, yyline, yycolumn, yytext());}
<YYINITIAL> {MULTI} {return new Symbol(sym.MULTI, yyline, yycolumn, yytext());}
<YYINITIAL> {DIVISION} {return new Symbol(sym.DIVISION, yyline, yycolumn, yytext());}

<YYINITIAL> {BLANCOS} {}

<YYINITIAL> . {
                System.out.println("Error léxico detectado: " + yytext() + " en línea " + yyline + " columna " + yycolumn);
                errores.add(new Errores(yytext(), yyline, yycolumn, "Lexico","No pertenece al lenguaje"));
}
