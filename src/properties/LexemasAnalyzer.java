/* The following code was generated by JFlex 1.4.3 on 6/08/22, 5:07 p. m. */

package properties;
import static util.Constants.Tokens.*;
import static util.Constants.Tokens;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 6/08/22, 5:07 p. m. from the specification file
 * <tt>src/properties/Lexico.flex</tt>
 */
public class LexemasAnalyzer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\5\2\0\1\3\22\0\1\3\1\46\1\6\1\7"+
    "\1\0\1\43\1\44\1\0\1\51\1\52\1\42\1\40\1\62\1\41"+
    "\1\61\1\4\12\2\1\60\1\57\1\50\1\37\1\47\2\0\22\1"+
    "\1\36\7\1\1\53\1\0\1\54\1\0\1\1\1\0\1\22\1\20"+
    "\1\12\1\15\1\16\1\17\1\27\1\31\1\10\1\1\1\23\1\13"+
    "\1\34\1\11\1\24\1\33\1\1\1\21\1\25\1\26\1\14\1\35"+
    "\1\30\1\1\1\32\1\1\1\55\1\45\1\56\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\1\21\2\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\0\1\4"+
    "\1\34\1\0\1\2\1\35\11\2\1\36\22\2\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\0\1\3\1\0"+
    "\1\55\1\2\1\56\14\2\1\57\4\2\1\60\12\2"+
    "\3\0\1\2\1\61\2\2\1\62\1\63\1\64\5\2"+
    "\1\65\3\2\1\66\5\2\1\67\3\2\1\70\1\71"+
    "\1\2\1\3\2\0\1\2\1\72\2\2\1\73\3\2"+
    "\1\74\1\75\1\76\1\2\1\77\2\2\1\100\1\2"+
    "\1\101\2\2\2\0\3\2\1\102\1\2\1\103\1\2"+
    "\1\104\1\105\1\2\1\106\1\107\1\0\3\2\1\110"+
    "\1\2\1\111\1\112\1\2\1\113\1\114\1\115\1\116";

  private static int [] zzUnpackAction() {
    int [] result = new int[210];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\63\0\146\0\231\0\314\0\377\0\63\0\63"+
    "\0\u0132\0\u0165\0\u0198\0\u01cb\0\u01fe\0\u0231\0\u0264\0\u0297"+
    "\0\u02ca\0\u02fd\0\u0330\0\u0363\0\u0396\0\u03c9\0\u03fc\0\u042f"+
    "\0\u0462\0\u0495\0\u04c8\0\u04fb\0\u052e\0\u0561\0\u0594\0\u05c7"+
    "\0\u05fa\0\u062d\0\u0660\0\u0693\0\u06c6\0\63\0\63\0\63"+
    "\0\63\0\63\0\63\0\63\0\63\0\63\0\u06f9\0\u072c"+
    "\0\63\0\u075f\0\u0792\0\146\0\u07c5\0\u07f8\0\u082b\0\u085e"+
    "\0\u0891\0\u08c4\0\u08f7\0\u092a\0\u095d\0\u0990\0\u09c3\0\u09f6"+
    "\0\u0a29\0\u0a5c\0\u0a8f\0\u0ac2\0\u0af5\0\u0b28\0\u0b5b\0\u0b8e"+
    "\0\u0bc1\0\u0bf4\0\u0c27\0\u0c5a\0\u0c8d\0\u0cc0\0\u0cf3\0\u0d26"+
    "\0\63\0\63\0\63\0\63\0\u0d59\0\63\0\63\0\63"+
    "\0\63\0\63\0\63\0\63\0\63\0\63\0\u0d8c\0\u0dbf"+
    "\0\u0df2\0\146\0\u0e25\0\146\0\u0e58\0\u0e8b\0\u0ebe\0\u0ef1"+
    "\0\u0f24\0\u0f57\0\u0f8a\0\u0fbd\0\u0ff0\0\u1023\0\u1056\0\u1089"+
    "\0\146\0\u10bc\0\u10ef\0\u1122\0\u1155\0\146\0\u1188\0\u11bb"+
    "\0\u11ee\0\u1221\0\u1254\0\u1287\0\u12ba\0\u12ed\0\u1320\0\u1353"+
    "\0\u0d59\0\u1386\0\u13b9\0\u13ec\0\146\0\u141f\0\u1452\0\146"+
    "\0\146\0\146\0\u1485\0\u14b8\0\u14eb\0\u151e\0\u1551\0\146"+
    "\0\u1584\0\u15b7\0\u15ea\0\146\0\u161d\0\u1650\0\u1683\0\u16b6"+
    "\0\u16e9\0\146\0\u171c\0\u174f\0\u1782\0\146\0\146\0\u17b5"+
    "\0\63\0\u17e8\0\u181b\0\u184e\0\146\0\u1881\0\u18b4\0\146"+
    "\0\u18e7\0\u191a\0\u194d\0\146\0\146\0\146\0\u1980\0\146"+
    "\0\u19b3\0\u19e6\0\146\0\u1a19\0\146\0\u1a4c\0\u1a7f\0\u1ab2"+
    "\0\u1ae5\0\u1b18\0\u1b4b\0\u1b7e\0\146\0\u1bb1\0\146\0\u1be4"+
    "\0\146\0\146\0\u1c17\0\146\0\146\0\u1c4a\0\u1c7d\0\u1cb0"+
    "\0\u1ce3\0\146\0\u1d16\0\146\0\63\0\u1d49\0\146\0\146"+
    "\0\146\0\146";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[210];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\3\3\1\24\1\25\1\3\1\26\2\3"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
    "\64\0\2\3\5\0\27\3\26\0\1\4\56\0\1\57"+
    "\4\0\1\5\63\0\1\60\32\0\1\61\33\0\1\62"+
    "\53\0\2\3\5\0\1\3\1\63\5\3\1\64\17\3"+
    "\25\0\2\3\5\0\12\3\1\65\14\3\25\0\2\3"+
    "\5\0\1\66\11\3\1\67\1\3\1\70\4\3\1\71"+
    "\5\3\25\0\2\3\5\0\14\3\1\72\12\3\25\0"+
    "\2\3\5\0\1\3\1\73\13\3\1\74\11\3\25\0"+
    "\2\3\5\0\6\3\1\75\5\3\1\76\12\3\25\0"+
    "\2\3\5\0\3\3\1\77\23\3\25\0\2\3\5\0"+
    "\3\3\1\100\6\3\1\101\1\3\1\102\12\3\25\0"+
    "\2\3\5\0\11\3\1\103\10\3\1\104\4\3\25\0"+
    "\2\3\5\0\6\3\1\105\20\3\25\0\2\3\5\0"+
    "\2\3\1\106\13\3\1\107\1\3\1\110\1\111\5\3"+
    "\25\0\2\3\5\0\11\3\1\112\10\3\1\113\4\3"+
    "\25\0\2\3\5\0\21\3\1\114\5\3\25\0\2\3"+
    "\5\0\11\3\1\115\15\3\25\0\2\3\5\0\12\3"+
    "\1\116\14\3\25\0\2\3\5\0\14\3\1\117\12\3"+
    "\25\0\2\3\5\0\16\3\1\120\10\3\63\0\1\121"+
    "\62\0\1\122\1\123\24\0\1\4\34\0\1\124\1\0"+
    "\1\125\60\0\1\126\62\0\1\127\67\0\1\130\63\0"+
    "\1\131\54\0\1\132\62\0\1\133\7\0\1\134\52\0"+
    "\1\135\10\0\1\136\53\0\1\137\23\0\1\140\56\0"+
    "\1\57\1\0\5\60\1\0\55\60\11\0\1\141\52\0"+
    "\2\3\5\0\16\3\1\142\10\3\25\0\2\3\5\0"+
    "\24\3\1\143\2\3\25\0\2\3\5\0\1\3\1\144"+
    "\25\3\25\0\2\3\5\0\15\3\1\145\11\3\25\0"+
    "\2\3\5\0\1\3\1\146\2\3\1\147\22\3\25\0"+
    "\2\3\5\0\12\3\1\150\14\3\25\0\2\3\5\0"+
    "\1\3\1\151\25\3\25\0\2\3\5\0\15\3\1\152"+
    "\11\3\25\0\2\3\5\0\1\153\26\3\25\0\2\3"+
    "\5\0\7\3\1\154\17\3\25\0\2\3\5\0\4\3"+
    "\1\155\22\3\25\0\2\3\5\0\15\3\1\156\11\3"+
    "\25\0\2\3\5\0\14\3\1\157\12\3\25\0\2\3"+
    "\5\0\3\3\1\160\23\3\25\0\2\3\5\0\11\3"+
    "\1\161\15\3\25\0\2\3\5\0\6\3\1\162\20\3"+
    "\25\0\2\3\5\0\16\3\1\163\10\3\25\0\2\3"+
    "\5\0\17\3\1\164\7\3\25\0\2\3\5\0\12\3"+
    "\1\165\14\3\25\0\2\3\5\0\5\3\1\166\3\3"+
    "\1\167\15\3\25\0\2\3\5\0\1\170\26\3\25\0"+
    "\2\3\5\0\14\3\1\171\12\3\25\0\2\3\5\0"+
    "\4\3\1\172\22\3\25\0\2\3\5\0\23\3\1\173"+
    "\3\3\25\0\2\3\5\0\1\174\26\3\25\0\2\3"+
    "\5\0\1\175\26\3\25\0\2\3\5\0\1\176\26\3"+
    "\25\0\2\3\5\0\1\177\26\3\25\0\2\3\5\0"+
    "\11\3\1\200\15\3\26\0\1\4\36\0\1\201\23\0"+
    "\1\202\62\0\1\140\72\0\1\203\51\0\2\3\5\0"+
    "\6\3\1\204\20\3\25\0\2\3\5\0\6\3\1\205"+
    "\20\3\25\0\2\3\5\0\15\3\1\206\1\207\10\3"+
    "\25\0\2\3\5\0\16\3\1\210\10\3\25\0\2\3"+
    "\5\0\11\3\1\211\15\3\25\0\2\3\5\0\17\3"+
    "\1\212\7\3\25\0\2\3\5\0\1\213\26\3\25\0"+
    "\2\3\5\0\1\3\1\214\25\3\25\0\2\3\5\0"+
    "\1\215\11\3\1\216\14\3\25\0\2\3\5\0\10\3"+
    "\1\217\16\3\25\0\2\3\5\0\6\3\1\220\20\3"+
    "\25\0\2\3\5\0\12\3\1\221\14\3\25\0\2\3"+
    "\5\0\15\3\1\222\11\3\25\0\2\3\5\0\12\3"+
    "\1\223\14\3\25\0\2\3\5\0\6\3\1\224\20\3"+
    "\25\0\2\3\5\0\1\225\26\3\25\0\2\3\5\0"+
    "\1\3\1\226\25\3\25\0\2\3\5\0\4\3\1\227"+
    "\22\3\25\0\2\3\5\0\16\3\1\230\10\3\25\0"+
    "\2\3\5\0\11\3\1\231\15\3\25\0\2\3\5\0"+
    "\6\3\1\232\20\3\25\0\2\3\5\0\6\3\1\233"+
    "\20\3\25\0\2\3\5\0\3\3\1\234\23\3\25\0"+
    "\2\3\5\0\1\3\1\235\25\3\25\0\2\3\5\0"+
    "\1\3\1\236\25\3\25\0\2\3\5\0\5\3\1\237"+
    "\21\3\25\0\2\3\5\0\1\240\26\3\26\0\1\202"+
    "\47\0\1\241\6\0\1\242\14\0\1\243\50\0\2\3"+
    "\5\0\15\3\1\244\11\3\25\0\2\3\5\0\16\3"+
    "\1\245\10\3\25\0\2\3\5\0\1\246\26\3\25\0"+
    "\2\3\5\0\17\3\1\247\7\3\25\0\2\3\5\0"+
    "\17\3\1\250\7\3\25\0\2\3\5\0\1\3\1\251"+
    "\25\3\25\0\2\3\5\0\4\3\1\252\22\3\25\0"+
    "\2\3\5\0\3\3\1\253\23\3\25\0\2\3\5\0"+
    "\16\3\1\254\10\3\25\0\2\3\5\0\6\3\1\255"+
    "\20\3\25\0\2\3\5\0\13\3\1\256\13\3\25\0"+
    "\2\3\5\0\15\3\1\257\11\3\25\0\2\3\5\0"+
    "\7\3\1\260\17\3\25\0\2\3\5\0\2\3\1\261"+
    "\24\3\25\0\2\3\5\0\2\3\1\262\24\3\25\0"+
    "\2\3\5\0\16\3\1\263\10\3\25\0\2\3\5\0"+
    "\5\3\1\264\21\3\25\0\2\3\5\0\6\3\1\265"+
    "\20\3\25\0\2\3\5\0\16\3\1\266\10\3\25\0"+
    "\2\3\5\0\1\3\1\267\25\3\26\0\1\270\56\0"+
    "\1\242\15\0\1\271\47\0\2\3\5\0\23\3\1\272"+
    "\3\3\25\0\2\3\5\0\1\3\1\273\25\3\25\0"+
    "\2\3\5\0\1\3\1\274\25\3\25\0\2\3\5\0"+
    "\6\3\1\275\20\3\25\0\2\3\5\0\3\3\1\276"+
    "\23\3\25\0\2\3\5\0\6\3\1\277\20\3\25\0"+
    "\2\3\5\0\16\3\1\300\10\3\25\0\2\3\5\0"+
    "\16\3\1\301\10\3\25\0\2\3\5\0\21\3\1\302"+
    "\5\3\25\0\2\3\5\0\6\3\1\303\20\3\25\0"+
    "\2\3\5\0\7\3\1\304\17\3\25\0\2\3\5\0"+
    "\17\3\1\305\7\3\26\0\1\270\47\0\1\241\25\0"+
    "\1\306\46\0\2\3\5\0\12\3\1\307\14\3\25\0"+
    "\2\3\5\0\4\3\1\310\22\3\25\0\2\3\5\0"+
    "\6\3\1\311\20\3\25\0\2\3\5\0\16\3\1\312"+
    "\10\3\25\0\2\3\5\0\6\3\1\313\20\3\25\0"+
    "\2\3\5\0\7\3\1\314\17\3\42\0\1\315\45\0"+
    "\2\3\5\0\2\3\1\316\24\3\25\0\2\3\5\0"+
    "\6\3\1\317\20\3\25\0\2\3\5\0\5\3\1\320"+
    "\21\3\25\0\2\3\5\0\11\3\1\321\15\3\25\0"+
    "\2\3\5\0\6\3\1\322\20\3\24\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7548];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\2\11\35\1\11\11\1\0\1\1"+
    "\1\11\1\0\36\1\4\11\1\1\11\11\1\0\1\1"+
    "\1\0\37\1\3\0\35\1\1\11\2\0\24\1\2\0"+
    "\14\1\1\0\6\1\1\11\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[210];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexemas;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexemasAnalyzer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public LexemasAnalyzer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 136) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 68: 
          { lexemas=yytext(); return Struct;
          }
        case 79: break;
        case 23: 
          { lexemas=yytext(); return Llave_c;
          }
        case 80: break;
        case 34: 
          { lexemas = yytext(); return MinusEqual;
          }
        case 81: break;
        case 40: 
          { lexemas = yytext(); return NotEqual;
          }
        case 82: break;
        case 35: 
          { lexemas = yytext(); return Decrement;
          }
        case 83: break;
        case 11: 
          { lexemas=yytext(); return Times;
          }
        case 84: break;
        case 47: 
          { lexemas=yytext(); return For;
          }
        case 85: break;
        case 69: 
          { lexemas=yytext(); return Switch;
          }
        case 86: break;
        case 10: 
          { lexemas=yytext(); return Resta;
          }
        case 87: break;
        case 7: 
          { lexemas=yytext(); return Comillas;
          }
        case 88: break;
        case 14: 
          { lexemas=yytext(); return Or;
          }
        case 89: break;
        case 31: 
          { lexemas = yytext(); return Equal;
          }
        case 90: break;
        case 12: 
          { lexemas=yytext(); return Module;
          }
        case 91: break;
        case 61: 
          { lexemas=yytext(); return False;
          }
        case 92: break;
        case 52: 
          { lexemas=yytext(); return Long;
          }
        case 93: break;
        case 37: 
          { lexemas = yytext(); return ModuleEqual;
          }
        case 94: break;
        case 4: 
          { /*Ignore*/
          }
        case 95: break;
        case 38: 
          { lexemas=yytext(); return DoubleAnd;
          }
        case 96: break;
        case 13: 
          { lexemas=yytext(); return And;
          }
        case 97: break;
        case 73: 
          { lexemas=yytext(); return Typedef;
          }
        case 98: break;
        case 32: 
          { lexemas = yytext(); return PlusEqual;
          }
        case 99: break;
        case 5: 
          { lexemas=yytext(); return Divide;
          }
        case 100: break;
        case 29: 
          { lexemas=yytext(); return If;
          }
        case 101: break;
        case 41: 
          { lexemas = yytext(); return GreaterEqualThan;
          }
        case 102: break;
        case 74: 
          { lexemas=yytext(); return Include;
          }
        case 103: break;
        case 60: 
          { lexemas=yytext(); return Float;
          }
        case 104: break;
        case 51: 
          { lexemas=yytext(); return Char;
          }
        case 105: break;
        case 22: 
          { lexemas=yytext(); return Llave_a;
          }
        case 106: break;
        case 66: 
          { lexemas=yytext(); return Define;
          }
        case 107: break;
        case 1: 
          { return ERROR;
          }
        case 108: break;
        case 26: 
          { lexemas=yytext(); return Punto;
          }
        case 109: break;
        case 76: 
          { lexemas=yytext(); return Unsigned;
          }
        case 110: break;
        case 21: 
          { lexemas=yytext(); return Corchete_c;
          }
        case 111: break;
        case 25: 
          { lexemas=yytext(); return Dos_P;
          }
        case 112: break;
        case 70: 
          { lexemas=yytext(); return Printf;
          }
        case 113: break;
        case 77: 
          { lexemas=yytext(); return Register;
          }
        case 114: break;
        case 54: 
          { lexemas=yytext(); return Byte;
          }
        case 115: break;
        case 72: 
          { lexemas=yytext(); return Default;
          }
        case 116: break;
        case 17: 
          { lexemas = yytext(); return LessThan;
          }
        case 117: break;
        case 48: 
          { lexemas=yytext(); return Std;
          }
        case 118: break;
        case 50: 
          { lexemas=yytext(); return Cout;
          }
        case 119: break;
        case 63: 
          { lexemas=yytext(); return Scanf;
          }
        case 120: break;
        case 43: 
          { lexemas = yytext(); return LessEqualThan;
          }
        case 121: break;
        case 9: 
          { lexemas=yytext(); return Add;
          }
        case 122: break;
        case 64: 
          { lexemas=yytext(); return Short;
          }
        case 123: break;
        case 53: 
          { lexemas=yytext(); return Else;
          }
        case 124: break;
        case 8: 
          { lexemas=yytext(); return Asignation;
          }
        case 125: break;
        case 19: 
          { lexemas=yytext(); return Parent_c;
          }
        case 126: break;
        case 56: 
          { lexemas=yytext(); return Main;
          }
        case 127: break;
        case 2: 
          { lexemas=yytext(); return Identificador;
          }
        case 128: break;
        case 42: 
          { lexemas = yytext(); return RightShift;
          }
        case 129: break;
        case 24: 
          { lexemas=yytext(); return P_coma;
          }
        case 130: break;
        case 39: 
          { lexemas=yytext(); return DoubleOr;
          }
        case 131: break;
        case 65: 
          { lexemas=yytext(); return While;
          }
        case 132: break;
        case 49: 
          { lexemas=yytext(); return Case;
          }
        case 133: break;
        case 6: 
          { return Linea;
          }
        case 134: break;
        case 44: 
          { lexemas = yytext(); return LeftShift;
          }
        case 135: break;
        case 20: 
          { lexemas=yytext(); return Corchete_a;
          }
        case 136: break;
        case 28: 
          { lexemas = yytext(); return DivideEqual;
          }
        case 137: break;
        case 58: 
          { lexemas=yytext(); return Const;
          }
        case 138: break;
        case 78: 
          { lexemas=yytext(); return Namespace;
          }
        case 139: break;
        case 16: 
          { lexemas = yytext(); return GreatherThan;
          }
        case 140: break;
        case 46: 
          { lexemas=yytext(); return Cin;
          }
        case 141: break;
        case 36: 
          { lexemas = yytext(); return TimesEqual;
          }
        case 142: break;
        case 55: 
          { lexemas=yytext(); return True;
          }
        case 143: break;
        case 45: 
          { lexemas=yytext(); return Int;
          }
        case 144: break;
        case 62: 
          { lexemas=yytext(); return Break;
          }
        case 145: break;
        case 71: 
          { lexemas=yytext(); return Cadena;
          }
        case 146: break;
        case 27: 
          { lexemas=yytext(); return Coma;
          }
        case 147: break;
        case 59: 
          { lexemas=yytext(); return Using;
          }
        case 148: break;
        case 3: 
          { lexemas=yytext(); return Numero;
          }
        case 149: break;
        case 33: 
          { lexemas = yytext(); return Increment;
          }
        case 150: break;
        case 57: 
          { lexemas=yytext(); return Void;
          }
        case 151: break;
        case 18: 
          { lexemas=yytext(); return Parent_a;
          }
        case 152: break;
        case 15: 
          { lexemas=yytext(); return Not;
          }
        case 153: break;
        case 67: 
          { lexemas=yytext(); return Double;
          }
        case 154: break;
        case 30: 
          { lexemas=yytext(); return Do;
          }
        case 155: break;
        case 75: 
          { lexemas=yytext(); return Continue;
          }
        case 156: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
