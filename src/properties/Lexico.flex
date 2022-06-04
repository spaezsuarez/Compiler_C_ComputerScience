package properties;
import static util.Constants.Tokens.*;
import static util.Constants.Tokens;
%%
%class LexemasAnalyzer
%public
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t \r]+
%{
    public String lexemas;
%}
%%
/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexemas=yytext(); return Comillas;}

/* Tipos de datos */
( byte ) {lexemas=yytext(); return Byte;}

( int ) {lexemas=yytext(); return Int;}

( char  ) {lexemas=yytext(); return Char;}

( long  ) {lexemas=yytext(); return Long;}

( float  ) {lexemas=yytext(); return Float;}

( double ) {lexemas=yytext(); return Double;}

/* Tipo de dato String */
( String ) {lexemas=yytext(); return Cadena;}

/* Palabra reservada If */
( if ) {lexemas=yytext(); return If;}

/* Palabra reservada Else */
( else ) {lexemas=yytext(); return Else;}

/* Palabra reservada Do */
( do ) {lexemas=yytext(); return Do;}

/* Palabra reservada While */
( while ) {lexemas=yytext(); return While;}

( for ) {lexemas=yytext(); return For;}

/* Operador Igual */
( "=" ) {lexemas=yytext(); return Asignation;}

/* Operador Suma */
( "+" ) {lexemas=yytext(); return Add;}

/* Operador Resta */
( "-" ) {lexemas=yytext(); return Resta;}

/* Operador Multiplicacion */
( "*" ) {lexemas=yytext(); return Times;}

/* Operador Division */
( "/" ) {lexemas=yytext(); return Divide;}

/* Operador Modulo */
( "%" ) {lexemas=yytext(); return Module;}

/* Operadores logicos */
( true ) {lexemas=yytext(); return True;}

( false ) {lexemas=yytext(); return False;}

( "&&" ) {lexemas=yytext(); return DoubleAnd;}

( "||" ) {lexemas=yytext(); return DoubleOr;}

( "!" ) {lexemas=yytext(); return Not;}

( "&" ) {lexemas=yytext(); return And;}

( "|" ) {lexemas=yytext(); return Or;}

/*Operadores Relacionales */
( ">" ) {lexemas = yytext(); return GreatherThan;}

( "<" ) {lexemas = yytext(); return LessThan;}

( "==" ) {lexemas = yytext(); return Equal;}

( "!=" ) {lexemas = yytext(); return NotEqual;}

( ">=" ) {lexemas = yytext(); return GreatherEqualThan;}

( "<=" ) {lexemas = yytext(); return LessEqualThan;}

( "<<" ) {lexemas = yytext(); return LeftShift;}

( ">>" ) {lexemas = yytext(); return RightShift;}

/* Operadores Atribucion */
( "+=" ) {lexemas = yytext(); return PlusEqual;}

( "++" ) {lexemas = yytext(); return Increment;}

( "--" ) {lexemas = yytext(); return Decrement;}

( "-=" ) {lexemas = yytext(); return MinusEqual;}

( "*=" ) {lexemas = yytext(); return TimesEqual;}

( "/=" ) {lexemas = yytext(); return DivideEqual;}

( "%=" ) {lexemas = yytext(); return ModuleEqual;}

/* Parentesis de apertura */
( "(" ) {lexemas=yytext(); return Parent_a;}

/* Parentesis de cierre */
( ")" ) {lexemas=yytext(); return Parent_c;}

/* Corchete de apertura */
( "[" ) {lexemas=yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {lexemas=yytext(); return Corchete_c;}

/* Llave de apertura */
( "{" ) {lexemas=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexemas=yytext(); return Llave_c;}

/* Marcador de inicio de algoritmo */
( "main" ) {lexemas=yytext(); return Main;}

/* Punto y Coma */
( ";" ) {lexemas=yytext(); return P_coma;}

/* Punto */
( "." ) {lexemas=yytext(); return Punto;}

/* Identificador */
{L}({L}|{D})* {lexemas=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|({D}+"."+{D})|("(-"{D}+"."+{D}+")")|{D}+|("-"+{D}+"."+{D})|("-"+{D}) {lexemas=yytext(); return Numero;}

/* Error de analisis */
 . {return ERROR;}