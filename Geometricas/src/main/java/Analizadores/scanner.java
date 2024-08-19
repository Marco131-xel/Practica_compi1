// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: src/main/java/Analizadores/lexico.jflex

package Analizadores;

// IMPORTACIONES
import java_cup.runtime.Symbol;
import java.util.LinkedList;
import excepciones.Errores;


@SuppressWarnings("fallthrough")
public class scanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
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
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1,  2,  1,  1,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     1,  0,  0,  0,  0,  0,  0,  0,  3,  4,  5,  6,  7,  8,  9, 10, 
    11, 11, 11, 11, 11, 11, 11, 11, 11, 11,  0,  0,  0,  0,  0,  0, 
     0, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 19, 22, 23, 24, 25, 
    26, 19, 27, 28, 29, 30, 31, 19, 19, 19, 32, 33, 33, 33, 33, 19, 
    33, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 19, 22, 23, 24, 25, 
    26, 19, 27, 28, 29, 30, 31, 19, 19, 19, 32,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  2,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\13\13\1\0\20\13\1\14\27\13"+
    "\1\15\13\13\1\16\7\13\1\17\1\13\1\20\5\13"+
    "\1\21\5\13\1\22\3\13\1\23\4\13\1\24\1\25"+
    "\1\26\1\27\2\13\1\30";

  private static int [] zzUnpackAction() {
    int [] result = new int[113];
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
    "\0\0\0\42\0\104\0\42\0\42\0\42\0\42\0\42"+
    "\0\42\0\42\0\146\0\210\0\252\0\314\0\356\0\u0110"+
    "\0\u0132\0\u0154\0\u0176\0\u0198\0\u01ba\0\u01dc\0\u01fe\0\u0220"+
    "\0\u0242\0\u0264\0\u0286\0\u02a8\0\u02ca\0\u02ec\0\u030e\0\u0330"+
    "\0\u0352\0\u0374\0\u0396\0\u03b8\0\u03da\0\u03fc\0\u041e\0\u01fe"+
    "\0\u0440\0\u0462\0\u0484\0\u04a6\0\u04c8\0\u04ea\0\u050c\0\u052e"+
    "\0\u0550\0\u0572\0\u0594\0\u05b6\0\u05d8\0\u05fa\0\u061c\0\u063e"+
    "\0\u0660\0\u0682\0\u06a4\0\u06c6\0\u06e8\0\u070a\0\u072c\0\252"+
    "\0\u074e\0\u0770\0\u0792\0\u07b4\0\u07d6\0\u07f8\0\u081a\0\u083c"+
    "\0\u085e\0\u0880\0\u08a2\0\252\0\u08c4\0\u08e6\0\u0908\0\u092a"+
    "\0\u094c\0\u096e\0\u0990\0\252\0\u09b2\0\252\0\u09d4\0\u09f6"+
    "\0\u0a18\0\u0a3a\0\u0a5c\0\252\0\u0a7e\0\u0aa0\0\u0ac2\0\u0ae4"+
    "\0\u0b06\0\252\0\u0b28\0\u0b4a\0\u0b6c\0\252\0\u0b8e\0\u0bb0"+
    "\0\u0bd2\0\u0bf4\0\252\0\252\0\252\0\252\0\u0c16\0\u0c38"+
    "\0\252";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[113];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\2\1\12\1\13\1\14\1\15\1\16\3\15"+
    "\1\17\3\15\1\20\1\15\1\21\1\22\1\23\1\24"+
    "\1\25\2\15\1\26\2\15\43\0\1\3\51\0\1\27"+
    "\1\0\1\13\41\0\14\15\1\30\1\31\7\15\1\32"+
    "\14\0\26\15\14\0\5\15\1\33\3\15\1\34\11\15"+
    "\1\35\2\15\14\0\20\15\1\36\5\15\14\0\11\15"+
    "\1\37\14\15\14\0\1\15\1\40\3\15\1\41\20\15"+
    "\14\0\2\15\1\42\23\15\14\0\16\15\1\43\7\15"+
    "\14\0\5\15\1\44\10\15\1\45\7\15\14\0\11\15"+
    "\1\46\14\15\14\0\5\15\1\47\20\15\14\0\1\50"+
    "\41\0\1\15\1\51\24\15\14\0\11\15\1\52\10\15"+
    "\1\53\3\15\14\0\23\15\1\54\2\15\14\0\13\15"+
    "\1\55\12\15\14\0\20\15\1\56\5\15\14\0\1\15"+
    "\1\57\16\15\1\60\5\15\14\0\1\15\1\61\7\15"+
    "\1\62\14\15\14\0\15\15\1\63\10\15\14\0\20\15"+
    "\1\64\5\15\14\0\7\15\1\65\16\15\14\0\12\15"+
    "\1\66\13\15\14\0\13\15\1\67\12\15\14\0\3\15"+
    "\1\70\22\15\14\0\12\15\1\71\6\15\1\72\4\15"+
    "\14\0\4\15\1\73\21\15\14\0\20\15\1\74\5\15"+
    "\14\0\20\15\1\75\5\15\14\0\14\15\1\76\11\15"+
    "\14\0\5\15\1\77\20\15\14\0\13\15\1\100\12\15"+
    "\14\0\5\15\1\101\20\15\14\0\3\15\1\102\22\15"+
    "\14\0\4\15\1\103\21\15\14\0\24\15\1\104\1\15"+
    "\14\0\6\15\1\105\17\15\14\0\21\15\1\100\4\15"+
    "\14\0\5\15\1\106\20\15\14\0\1\15\1\107\24\15"+
    "\14\0\20\15\1\71\5\15\14\0\5\15\1\110\20\15"+
    "\14\0\11\15\1\111\14\15\14\0\22\15\1\112\3\15"+
    "\14\0\16\15\1\100\7\15\14\0\1\15\1\113\24\15"+
    "\14\0\5\15\1\114\20\15\14\0\4\15\1\115\21\15"+
    "\14\0\11\15\1\116\14\15\14\0\1\15\1\117\24\15"+
    "\14\0\20\15\1\120\5\15\14\0\21\15\1\121\4\15"+
    "\14\0\23\15\1\122\2\15\14\0\20\15\1\123\5\15"+
    "\14\0\1\15\1\124\24\15\14\0\11\15\1\125\14\15"+
    "\14\0\1\15\1\126\24\15\14\0\15\15\1\127\10\15"+
    "\14\0\22\15\1\130\3\15\14\0\7\15\1\131\16\15"+
    "\14\0\1\15\1\132\24\15\14\0\4\15\1\71\21\15"+
    "\14\0\5\15\1\100\20\15\14\0\13\15\1\133\12\15"+
    "\14\0\20\15\1\134\5\15\14\0\11\15\1\135\14\15"+
    "\14\0\22\15\1\115\3\15\14\0\13\15\1\136\12\15"+
    "\14\0\1\15\1\137\24\15\14\0\3\15\1\140\22\15"+
    "\14\0\12\15\1\141\13\15\14\0\16\15\1\142\7\15"+
    "\14\0\16\15\1\143\7\15\14\0\15\15\1\144\10\15"+
    "\14\0\13\15\1\71\12\15\14\0\16\15\1\145\7\15"+
    "\14\0\16\15\1\146\7\15\14\0\4\15\1\147\21\15"+
    "\14\0\1\15\1\150\24\15\14\0\1\15\1\100\24\15"+
    "\14\0\15\15\1\151\10\15\14\0\7\15\1\152\16\15"+
    "\14\0\20\15\1\153\5\15\14\0\16\15\1\154\7\15"+
    "\14\0\20\15\1\155\5\15\14\0\16\15\1\156\7\15"+
    "\14\0\23\15\1\157\2\15\14\0\13\15\1\160\12\15"+
    "\14\0\16\15\1\161\7\15\1\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[3162];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\7\11\14\1\1\0\132\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[113];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    public LinkedList<Errores> listaErrores = new LinkedList<>();    


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public scanner(java.io.Reader in) {
      yyline = 1;
    yycolumn =1;
    listaErrores = new LinkedList<>();

    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    return ZZ_CMAP[input];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { listaErrores.add(new Errores("LEXICO","El caracter "+
                yytext() + " No pertenece al lenguaje ", yyline, yycolumn));
            }
          // fall through
          case 25: break;
          case 2:
            { 
            }
          // fall through
          case 26: break;
          case 3:
            { return new Symbol(sym.PAR1, yyline, yycolumn, yytext());
            }
          // fall through
          case 27: break;
          case 4:
            { return new Symbol(sym.PAR2, yyline, yycolumn, yytext());
            }
          // fall through
          case 28: break;
          case 5:
            { return new Symbol(sym.MULTI, yyline, yycolumn, yytext());
            }
          // fall through
          case 29: break;
          case 6:
            { return new Symbol(sym.SUMA, yyline, yycolumn, yytext());
            }
          // fall through
          case 30: break;
          case 7:
            { return new Symbol(sym.COMA, yyline, yycolumn, yytext());
            }
          // fall through
          case 31: break;
          case 8:
            { return new Symbol(sym.RESTA, yyline, yycolumn, yytext());
            }
          // fall through
          case 32: break;
          case 9:
            { return new Symbol(sym.DIVISION, yyline, yycolumn, yytext());
            }
          // fall through
          case 33: break;
          case 10:
            { return new Symbol(sym.NUM, yyline, yycolumn, Integer.parseInt(yytext()));
            }
          // fall through
          case 34: break;
          case 11:
            { return new Symbol(sym.ID, yyline, yycolumn,yytext());
            }
          // fall through
          case 35: break;
          case 12:
            { return new Symbol(sym.DECIMAL, yyline, yycolumn, Double.parseDouble(yytext()));
            }
          // fall through
          case 36: break;
          case 13:
            { return new Symbol(sym.COLOR, yyline, yycolumn, yytext());
            }
          // fall through
          case 37: break;
          case 14:
            { return new Symbol(sym.SIDE, yyline, yycolumn, yytext());
            }
          // fall through
          case 38: break;
          case 15:
            { return new Symbol(sym.CURVA, yyline, yycolumn, yytext());
            }
          // fall through
          case 39: break;
          case 16:
            { return new Symbol(sym.LINEA, yyline, yycolumn, yytext());
            }
          // fall through
          case 40: break;
          case 17:
            { return new Symbol(sym.ANIMAR, yyline, yycolumn, yytext());
            }
          // fall through
          case 41: break;
          case 18:
            { return new Symbol(sym.OBJETO, yyline, yycolumn, yytext());
            }
          // fall through
          case 42: break;
          case 19:
            { return new Symbol(sym.CIRCULO, yyline, yycolumn, yytext());
            }
          // fall through
          case 43: break;
          case 20:
            { return new Symbol(sym.ANTERIOR, yyline, yycolumn, yytext());
            }
          // fall through
          case 44: break;
          case 21:
            { return new Symbol(sym.CUADRADO, yyline, yycolumn, yytext());
            }
          // fall through
          case 45: break;
          case 22:
            { return new Symbol(sym.GRAFICAR, yyline, yycolumn, yytext());
            }
          // fall through
          case 46: break;
          case 23:
            { return new Symbol(sym.POLIGONO, yyline, yycolumn, yytext());
            }
          // fall through
          case 47: break;
          case 24:
            { return new Symbol(sym.RECTANGULO, yyline, yycolumn, yytext());
            }
          // fall through
          case 48: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
