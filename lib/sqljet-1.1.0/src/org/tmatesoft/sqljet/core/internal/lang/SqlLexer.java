// $ANTLR 3.4 /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g 2012-03-28 18:28:09

  package org.tmatesoft.sqljet.core.internal.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SqlLexer extends Lexer {
    public static final int EOF=-1;
    public static final int A=4;
    public static final int ABORT=5;
    public static final int ADD=6;
    public static final int AFTER=7;
    public static final int ALIAS=8;
    public static final int ALL=9;
    public static final int ALTER=10;
    public static final int AMPERSAND=11;
    public static final int ANALYZE=12;
    public static final int AND=13;
    public static final int APOSTROPHE=14;
    public static final int AS=15;
    public static final int ASC=16;
    public static final int ASTERISK=17;
    public static final int AT=18;
    public static final int ATTACH=19;
    public static final int AUTOINCREMENT=20;
    public static final int B=21;
    public static final int BACKSLASH=22;
    public static final int BEFORE=23;
    public static final int BEGIN=24;
    public static final int BETWEEN=25;
    public static final int BIND=26;
    public static final int BIND_NAME=27;
    public static final int BLOB=28;
    public static final int BLOB_LITERAL=29;
    public static final int BY=30;
    public static final int C=31;
    public static final int CASCADE=32;
    public static final int CASE=33;
    public static final int CAST=34;
    public static final int CHECK=35;
    public static final int COLLATE=36;
    public static final int COLON=37;
    public static final int COLUMN=38;
    public static final int COLUMNS=39;
    public static final int COLUMN_CONSTRAINT=40;
    public static final int COLUMN_EXPRESSION=41;
    public static final int COMMA=42;
    public static final int COMMENT=43;
    public static final int COMMIT=44;
    public static final int CONFLICT=45;
    public static final int CONSTRAINT=46;
    public static final int CONSTRAINTS=47;
    public static final int CREATE=48;
    public static final int CREATE_INDEX=49;
    public static final int CREATE_TABLE=50;
    public static final int CREATE_TRIGGER=51;
    public static final int CREATE_VIEW=52;
    public static final int CROSS=53;
    public static final int CURRENT_DATE=54;
    public static final int CURRENT_TIME=55;
    public static final int CURRENT_TIMESTAMP=56;
    public static final int D=57;
    public static final int DATABASE=58;
    public static final int DEFAULT=59;
    public static final int DEFERRABLE=60;
    public static final int DEFERRED=61;
    public static final int DELETE=62;
    public static final int DESC=63;
    public static final int DETACH=64;
    public static final int DISTINCT=65;
    public static final int DOLLAR=66;
    public static final int DOT=67;
    public static final int DOUBLE_PIPE=68;
    public static final int DROP=69;
    public static final int DROP_INDEX=70;
    public static final int DROP_TABLE=71;
    public static final int E=72;
    public static final int EACH=73;
    public static final int ELSE=74;
    public static final int END=75;
    public static final int EQUALS=76;
    public static final int EQUALS2=77;
    public static final int ESCAPE=78;
    public static final int EXCEPT=79;
    public static final int EXCLUSIVE=80;
    public static final int EXISTS=81;
    public static final int EXPLAIN=82;
    public static final int F=83;
    public static final int FAIL=84;
    public static final int FLOAT=85;
    public static final int FLOAT_EXP=86;
    public static final int FLOAT_LITERAL=87;
    public static final int FOR=88;
    public static final int FOREIGN=89;
    public static final int FROM=90;
    public static final int FUNCTION_EXPRESSION=91;
    public static final int FUNCTION_LITERAL=92;
    public static final int G=93;
    public static final int GLOB=94;
    public static final int GREATER=95;
    public static final int GREATER_OR_EQ=96;
    public static final int GROUP=97;
    public static final int H=98;
    public static final int HAVING=99;
    public static final int I=100;
    public static final int ID=101;
    public static final int ID_CORE=102;
    public static final int ID_LITERAL=103;
    public static final int ID_PLAIN=104;
    public static final int ID_QUOTED=105;
    public static final int ID_QUOTED_APOSTROPHE=106;
    public static final int ID_QUOTED_CORE=107;
    public static final int ID_QUOTED_CORE_APOSTROPHE=108;
    public static final int ID_QUOTED_CORE_SQUARE=109;
    public static final int ID_QUOTED_SQUARE=110;
    public static final int ID_START=111;
    public static final int IF=112;
    public static final int IGNORE=113;
    public static final int IMMEDIATE=114;
    public static final int IN=115;
    public static final int INDEX=116;
    public static final int INDEXED=117;
    public static final int INITIALLY=118;
    public static final int INNER=119;
    public static final int INSERT=120;
    public static final int INSTEAD=121;
    public static final int INTEGER=122;
    public static final int INTEGER_LITERAL=123;
    public static final int INTERSECT=124;
    public static final int INTO=125;
    public static final int IN_TABLE=126;
    public static final int IN_VALUES=127;
    public static final int IS=128;
    public static final int ISNULL=129;
    public static final int IS_NOT=130;
    public static final int IS_NULL=131;
    public static final int J=132;
    public static final int JOIN=133;
    public static final int K=134;
    public static final int KEY=135;
    public static final int L=136;
    public static final int LEFT=137;
    public static final int LESS=138;
    public static final int LESS_OR_EQ=139;
    public static final int LIKE=140;
    public static final int LIMIT=141;
    public static final int LINE_COMMENT=142;
    public static final int LPAREN=143;
    public static final int LPAREN_SQUARE=144;
    public static final int M=145;
    public static final int MATCH=146;
    public static final int MINUS=147;
    public static final int N=148;
    public static final int NATURAL=149;
    public static final int NOT=150;
    public static final int NOTNULL=151;
    public static final int NOT_EQUALS=152;
    public static final int NOT_EQUALS2=153;
    public static final int NOT_NULL=154;
    public static final int NULL=155;
    public static final int O=156;
    public static final int OF=157;
    public static final int OFFSET=158;
    public static final int ON=159;
    public static final int OPTIONS=160;
    public static final int OR=161;
    public static final int ORDER=162;
    public static final int ORDERING=163;
    public static final int OUTER=164;
    public static final int P=165;
    public static final int PERCENT=166;
    public static final int PIPE=167;
    public static final int PLAN=168;
    public static final int PLUS=169;
    public static final int PRAGMA=170;
    public static final int PRIMARY=171;
    public static final int Q=172;
    public static final int QUERY=173;
    public static final int QUESTION=174;
    public static final int QUOTE_DOUBLE=175;
    public static final int QUOTE_SINGLE=176;
    public static final int R=177;
    public static final int RAISE=178;
    public static final int REFERENCES=179;
    public static final int REGEXP=180;
    public static final int REINDEX=181;
    public static final int RELEASE=182;
    public static final int RENAME=183;
    public static final int REPLACE=184;
    public static final int RESTRICT=185;
    public static final int ROLLBACK=186;
    public static final int ROW=187;
    public static final int RPAREN=188;
    public static final int RPAREN_SQUARE=189;
    public static final int S=190;
    public static final int SAVEPOINT=191;
    public static final int SELECT=192;
    public static final int SELECT_CORE=193;
    public static final int SEMI=194;
    public static final int SET=195;
    public static final int SHIFT_LEFT=196;
    public static final int SHIFT_RIGHT=197;
    public static final int SLASH=198;
    public static final int STATEMENT=199;
    public static final int STRING=200;
    public static final int STRING_CORE=201;
    public static final int STRING_CORE_DOUBLE=202;
    public static final int STRING_CORE_SINGLE=203;
    public static final int STRING_DOUBLE=204;
    public static final int STRING_ESCAPE_DOUBLE=205;
    public static final int STRING_ESCAPE_SINGLE=206;
    public static final int STRING_LITERAL=207;
    public static final int STRING_SINGLE=208;
    public static final int T=209;
    public static final int TABLE=210;
    public static final int TABLE_CONSTRAINT=211;
    public static final int TEMPORARY=212;
    public static final int THEN=213;
    public static final int TILDA=214;
    public static final int TO=215;
    public static final int TRANSACTION=216;
    public static final int TRIGGER=217;
    public static final int TYPE=218;
    public static final int TYPE_PARAMS=219;
    public static final int U=220;
    public static final int UNDERSCORE=221;
    public static final int UNION=222;
    public static final int UNIQUE=223;
    public static final int UPDATE=224;
    public static final int USING=225;
    public static final int V=226;
    public static final int VACUUM=227;
    public static final int VALUES=228;
    public static final int VIEW=229;
    public static final int VIRTUAL=230;
    public static final int W=231;
    public static final int WHEN=232;
    public static final int WHERE=233;
    public static final int WS=234;
    public static final int X=235;
    public static final int Y=236;
    public static final int Z=237;


    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
         final StringBuilder buffer = new StringBuilder();
         buffer.append("[").append(getErrorHeader(e)).append("] ");
         buffer.append(getErrorMessage(e, tokenNames));
         if(e.input!=null && e.input instanceof CharStream) {
            final CharStream stream = (CharStream) e.input;
              int size = stream.size();
              if(size>0) {
                 buffer.append("\n").append(stream.substring(0, size-1));
              }
           }
         throw new SqlJetParserException(buffer.toString(), e);
    }



    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SqlLexer() {} 
    public SqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g"; }

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:759:7: ( '=' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:759:16: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "EQUALS2"
    public final void mEQUALS2() throws RecognitionException {
        try {
            int _type = EQUALS2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:760:8: ( '==' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:760:16: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUALS2"

    // $ANTLR start "NOT_EQUALS"
    public final void mNOT_EQUALS() throws RecognitionException {
        try {
            int _type = NOT_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:761:11: ( '!=' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:761:16: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUALS"

    // $ANTLR start "NOT_EQUALS2"
    public final void mNOT_EQUALS2() throws RecognitionException {
        try {
            int _type = NOT_EQUALS2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:762:12: ( '<>' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:762:16: '<>'
            {
            match("<>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUALS2"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:763:5: ( '<' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:763:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "LESS_OR_EQ"
    public final void mLESS_OR_EQ() throws RecognitionException {
        try {
            int _type = LESS_OR_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:764:11: ( '<=' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:764:16: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS_OR_EQ"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:765:8: ( '>' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:765:16: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "GREATER_OR_EQ"
    public final void mGREATER_OR_EQ() throws RecognitionException {
        try {
            int _type = GREATER_OR_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:766:14: ( '>=' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:766:16: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER_OR_EQ"

    // $ANTLR start "SHIFT_LEFT"
    public final void mSHIFT_LEFT() throws RecognitionException {
        try {
            int _type = SHIFT_LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:767:11: ( '<<' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:767:16: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHIFT_LEFT"

    // $ANTLR start "SHIFT_RIGHT"
    public final void mSHIFT_RIGHT() throws RecognitionException {
        try {
            int _type = SHIFT_RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:768:12: ( '>>' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:768:16: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHIFT_RIGHT"

    // $ANTLR start "AMPERSAND"
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:769:10: ( '&' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:769:16: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AMPERSAND"

    // $ANTLR start "PIPE"
    public final void mPIPE() throws RecognitionException {
        try {
            int _type = PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:770:5: ( '|' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:770:16: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PIPE"

    // $ANTLR start "DOUBLE_PIPE"
    public final void mDOUBLE_PIPE() throws RecognitionException {
        try {
            int _type = DOUBLE_PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:771:12: ( '||' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:771:16: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE_PIPE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:772:5: ( '+' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:772:16: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:773:6: ( '-' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:773:16: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "TILDA"
    public final void mTILDA() throws RecognitionException {
        try {
            int _type = TILDA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:774:6: ( '~' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:774:16: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TILDA"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:775:9: ( '*' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:775:16: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:776:6: ( '/' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:776:16: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "BACKSLASH"
    public final void mBACKSLASH() throws RecognitionException {
        try {
            int _type = BACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:777:10: ( '\\\\' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:777:16: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BACKSLASH"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:778:8: ( '%' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:778:16: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:779:5: ( ';' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:779:16: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:780:4: ( '.' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:780:16: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:781:6: ( ',' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:781:16: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:782:7: ( '(' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:782:16: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:783:7: ( ')' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:783:16: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:784:9: ( '?' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:784:16: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:785:6: ( ':' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:785:16: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:786:3: ( '@' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:786:16: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "DOLLAR"
    public final void mDOLLAR() throws RecognitionException {
        try {
            int _type = DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:787:7: ( '$' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:787:16: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOLLAR"

    // $ANTLR start "QUOTE_DOUBLE"
    public final void mQUOTE_DOUBLE() throws RecognitionException {
        try {
            int _type = QUOTE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:788:13: ( '\"' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:788:16: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTE_DOUBLE"

    // $ANTLR start "QUOTE_SINGLE"
    public final void mQUOTE_SINGLE() throws RecognitionException {
        try {
            int _type = QUOTE_SINGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:789:13: ( '\\'' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:789:16: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTE_SINGLE"

    // $ANTLR start "APOSTROPHE"
    public final void mAPOSTROPHE() throws RecognitionException {
        try {
            int _type = APOSTROPHE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:790:11: ( '`' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:790:16: '`'
            {
            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "APOSTROPHE"

    // $ANTLR start "LPAREN_SQUARE"
    public final void mLPAREN_SQUARE() throws RecognitionException {
        try {
            int _type = LPAREN_SQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:791:14: ( '[' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:791:16: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN_SQUARE"

    // $ANTLR start "RPAREN_SQUARE"
    public final void mRPAREN_SQUARE() throws RecognitionException {
        try {
            int _type = RPAREN_SQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:792:14: ( ']' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:792:16: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN_SQUARE"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            int _type = UNDERSCORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:793:11: ( '_' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:793:16: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:796:11: ( ( 'a' | 'A' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:797:11: ( ( 'b' | 'B' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:798:11: ( ( 'c' | 'C' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:799:11: ( ( 'd' | 'D' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:800:11: ( ( 'e' | 'E' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:801:11: ( ( 'f' | 'F' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:802:11: ( ( 'g' | 'G' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:803:11: ( ( 'h' | 'H' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:804:11: ( ( 'i' | 'I' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:805:11: ( ( 'j' | 'J' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:806:11: ( ( 'k' | 'K' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:807:11: ( ( 'l' | 'L' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:808:11: ( ( 'm' | 'M' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:809:11: ( ( 'n' | 'N' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:810:11: ( ( 'o' | 'O' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:811:11: ( ( 'p' | 'P' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:812:11: ( ( 'q' | 'Q' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:813:11: ( ( 'r' | 'R' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:814:11: ( ( 's' | 'S' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:815:11: ( ( 't' | 'T' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:816:11: ( ( 'u' | 'U' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:817:11: ( ( 'v' | 'V' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:818:11: ( ( 'w' | 'W' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:819:11: ( ( 'x' | 'X' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:820:11: ( ( 'y' | 'Y' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:821:11: ( ( 'z' | 'Z' ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Z"

    // $ANTLR start "ABORT"
    public final void mABORT() throws RecognitionException {
        try {
            int _type = ABORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:823:6: ( A B O R T )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:823:8: A B O R T
            {
            mA(); 


            mB(); 


            mO(); 


            mR(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ABORT"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:824:4: ( A D D )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:824:6: A D D
            {
            mA(); 


            mD(); 


            mD(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "AFTER"
    public final void mAFTER() throws RecognitionException {
        try {
            int _type = AFTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:825:6: ( A F T E R )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:825:8: A F T E R
            {
            mA(); 


            mF(); 


            mT(); 


            mE(); 


            mR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AFTER"

    // $ANTLR start "ALL"
    public final void mALL() throws RecognitionException {
        try {
            int _type = ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:826:4: ( A L L )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:826:6: A L L
            {
            mA(); 


            mL(); 


            mL(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALL"

    // $ANTLR start "ALTER"
    public final void mALTER() throws RecognitionException {
        try {
            int _type = ALTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:827:6: ( A L T E R )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:827:8: A L T E R
            {
            mA(); 


            mL(); 


            mT(); 


            mE(); 


            mR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALTER"

    // $ANTLR start "ANALYZE"
    public final void mANALYZE() throws RecognitionException {
        try {
            int _type = ANALYZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:828:8: ( A N A L Y Z E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:828:10: A N A L Y Z E
            {
            mA(); 


            mN(); 


            mA(); 


            mL(); 


            mY(); 


            mZ(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ANALYZE"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:829:4: ( A N D )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:829:6: A N D
            {
            mA(); 


            mN(); 


            mD(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:830:3: ( A S )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:830:5: A S
            {
            mA(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:831:4: ( A S C )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:831:6: A S C
            {
            mA(); 


            mS(); 


            mC(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASC"

    // $ANTLR start "ATTACH"
    public final void mATTACH() throws RecognitionException {
        try {
            int _type = ATTACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:832:7: ( A T T A C H )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:832:9: A T T A C H
            {
            mA(); 


            mT(); 


            mT(); 


            mA(); 


            mC(); 


            mH(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ATTACH"

    // $ANTLR start "AUTOINCREMENT"
    public final void mAUTOINCREMENT() throws RecognitionException {
        try {
            int _type = AUTOINCREMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:833:14: ( A U T O I N C R E M E N T )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:833:16: A U T O I N C R E M E N T
            {
            mA(); 


            mU(); 


            mT(); 


            mO(); 


            mI(); 


            mN(); 


            mC(); 


            mR(); 


            mE(); 


            mM(); 


            mE(); 


            mN(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AUTOINCREMENT"

    // $ANTLR start "BEFORE"
    public final void mBEFORE() throws RecognitionException {
        try {
            int _type = BEFORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:834:7: ( B E F O R E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:834:9: B E F O R E
            {
            mB(); 


            mE(); 


            mF(); 


            mO(); 


            mR(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEFORE"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:835:6: ( B E G I N )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:835:8: B E G I N
            {
            mB(); 


            mE(); 


            mG(); 


            mI(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "BETWEEN"
    public final void mBETWEEN() throws RecognitionException {
        try {
            int _type = BETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:836:8: ( B E T W E E N )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:836:10: B E T W E E N
            {
            mB(); 


            mE(); 


            mT(); 


            mW(); 


            mE(); 


            mE(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BETWEEN"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:837:3: ( B Y )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:837:5: B Y
            {
            mB(); 


            mY(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "CASCADE"
    public final void mCASCADE() throws RecognitionException {
        try {
            int _type = CASCADE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:838:8: ( C A S C A D E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:838:10: C A S C A D E
            {
            mC(); 


            mA(); 


            mS(); 


            mC(); 


            mA(); 


            mD(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CASCADE"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:839:5: ( C A S E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:839:7: C A S E
            {
            mC(); 


            mA(); 


            mS(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "CAST"
    public final void mCAST() throws RecognitionException {
        try {
            int _type = CAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:840:5: ( C A S T )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:840:7: C A S T
            {
            mC(); 


            mA(); 


            mS(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CAST"

    // $ANTLR start "CHECK"
    public final void mCHECK() throws RecognitionException {
        try {
            int _type = CHECK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:841:6: ( C H E C K )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:841:8: C H E C K
            {
            mC(); 


            mH(); 


            mE(); 


            mC(); 


            mK(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHECK"

    // $ANTLR start "COLLATE"
    public final void mCOLLATE() throws RecognitionException {
        try {
            int _type = COLLATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:842:8: ( C O L L A T E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:842:10: C O L L A T E
            {
            mC(); 


            mO(); 


            mL(); 


            mL(); 


            mA(); 


            mT(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLLATE"

    // $ANTLR start "COLUMN"
    public final void mCOLUMN() throws RecognitionException {
        try {
            int _type = COLUMN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:843:7: ( C O L U M N )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:843:9: C O L U M N
            {
            mC(); 


            mO(); 


            mL(); 


            mU(); 


            mM(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLUMN"

    // $ANTLR start "COMMIT"
    public final void mCOMMIT() throws RecognitionException {
        try {
            int _type = COMMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:844:7: ( C O M M I T )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:844:9: C O M M I T
            {
            mC(); 


            mO(); 


            mM(); 


            mM(); 


            mI(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMIT"

    // $ANTLR start "CONFLICT"
    public final void mCONFLICT() throws RecognitionException {
        try {
            int _type = CONFLICT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:845:9: ( C O N F L I C T )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:845:11: C O N F L I C T
            {
            mC(); 


            mO(); 


            mN(); 


            mF(); 


            mL(); 


            mI(); 


            mC(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONFLICT"

    // $ANTLR start "CONSTRAINT"
    public final void mCONSTRAINT() throws RecognitionException {
        try {
            int _type = CONSTRAINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:846:11: ( C O N S T R A I N T )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:846:13: C O N S T R A I N T
            {
            mC(); 


            mO(); 


            mN(); 


            mS(); 


            mT(); 


            mR(); 


            mA(); 


            mI(); 


            mN(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONSTRAINT"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:847:7: ( C R E A T E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:847:9: C R E A T E
            {
            mC(); 


            mR(); 


            mE(); 


            mA(); 


            mT(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "CROSS"
    public final void mCROSS() throws RecognitionException {
        try {
            int _type = CROSS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:848:6: ( C R O S S )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:848:8: C R O S S
            {
            mC(); 


            mR(); 


            mO(); 


            mS(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CROSS"

    // $ANTLR start "CURRENT_TIME"
    public final void mCURRENT_TIME() throws RecognitionException {
        try {
            int _type = CURRENT_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:849:13: ( C U R R E N T '_' T I M E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:849:15: C U R R E N T '_' T I M E
            {
            mC(); 


            mU(); 


            mR(); 


            mR(); 


            mE(); 


            mN(); 


            mT(); 


            match('_'); 

            mT(); 


            mI(); 


            mM(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CURRENT_TIME"

    // $ANTLR start "CURRENT_DATE"
    public final void mCURRENT_DATE() throws RecognitionException {
        try {
            int _type = CURRENT_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:850:13: ( C U R R E N T '_' D A T E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:850:15: C U R R E N T '_' D A T E
            {
            mC(); 


            mU(); 


            mR(); 


            mR(); 


            mE(); 


            mN(); 


            mT(); 


            match('_'); 

            mD(); 


            mA(); 


            mT(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CURRENT_DATE"

    // $ANTLR start "CURRENT_TIMESTAMP"
    public final void mCURRENT_TIMESTAMP() throws RecognitionException {
        try {
            int _type = CURRENT_TIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:851:18: ( C U R R E N T '_' T I M E S T A M P )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:851:20: C U R R E N T '_' T I M E S T A M P
            {
            mC(); 


            mU(); 


            mR(); 


            mR(); 


            mE(); 


            mN(); 


            mT(); 


            match('_'); 

            mT(); 


            mI(); 


            mM(); 


            mE(); 


            mS(); 


            mT(); 


            mA(); 


            mM(); 


            mP(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CURRENT_TIMESTAMP"

    // $ANTLR start "DATABASE"
    public final void mDATABASE() throws RecognitionException {
        try {
            int _type = DATABASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:852:9: ( D A T A B A S E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:852:11: D A T A B A S E
            {
            mD(); 


            mA(); 


            mT(); 


            mA(); 


            mB(); 


            mA(); 


            mS(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DATABASE"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:853:8: ( D E F A U L T )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:853:10: D E F A U L T
            {
            mD(); 


            mE(); 


            mF(); 


            mA(); 


            mU(); 


            mL(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "DEFERRABLE"
    public final void mDEFERRABLE() throws RecognitionException {
        try {
            int _type = DEFERRABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:854:11: ( D E F E R R A B L E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:854:13: D E F E R R A B L E
            {
            mD(); 


            mE(); 


            mF(); 


            mE(); 


            mR(); 


            mR(); 


            mA(); 


            mB(); 


            mL(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFERRABLE"

    // $ANTLR start "DEFERRED"
    public final void mDEFERRED() throws RecognitionException {
        try {
            int _type = DEFERRED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:855:9: ( D E F E R R E D )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:855:11: D E F E R R E D
            {
            mD(); 


            mE(); 


            mF(); 


            mE(); 


            mR(); 


            mR(); 


            mE(); 


            mD(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFERRED"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:856:7: ( D E L E T E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:856:9: D E L E T E
            {
            mD(); 


            mE(); 


            mL(); 


            mE(); 


            mT(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:857:5: ( D E S C )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:857:7: D E S C
            {
            mD(); 


            mE(); 


            mS(); 


            mC(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DESC"

    // $ANTLR start "DETACH"
    public final void mDETACH() throws RecognitionException {
        try {
            int _type = DETACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:858:7: ( D E T A C H )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:858:9: D E T A C H
            {
            mD(); 


            mE(); 


            mT(); 


            mA(); 


            mC(); 


            mH(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DETACH"

    // $ANTLR start "DISTINCT"
    public final void mDISTINCT() throws RecognitionException {
        try {
            int _type = DISTINCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:859:9: ( D I S T I N C T )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:859:11: D I S T I N C T
            {
            mD(); 


            mI(); 


            mS(); 


            mT(); 


            mI(); 


            mN(); 


            mC(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DISTINCT"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:860:5: ( D R O P )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:860:7: D R O P
            {
            mD(); 


            mR(); 


            mO(); 


            mP(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DROP"

    // $ANTLR start "EACH"
    public final void mEACH() throws RecognitionException {
        try {
            int _type = EACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:861:5: ( E A C H )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:861:7: E A C H
            {
            mE(); 


            mA(); 


            mC(); 


            mH(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EACH"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:862:5: ( E L S E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:862:7: E L S E
            {
            mE(); 


            mL(); 


            mS(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:863:4: ( E N D )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:863:6: E N D
            {
            mE(); 


            mN(); 


            mD(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "ESCAPE"
    public final void mESCAPE() throws RecognitionException {
        try {
            int _type = ESCAPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:864:7: ( E S C A P E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:864:9: E S C A P E
            {
            mE(); 


            mS(); 


            mC(); 


            mA(); 


            mP(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESCAPE"

    // $ANTLR start "EXCEPT"
    public final void mEXCEPT() throws RecognitionException {
        try {
            int _type = EXCEPT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:865:7: ( E X C E P T )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:865:9: E X C E P T
            {
            mE(); 


            mX(); 


            mC(); 


            mE(); 


            mP(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXCEPT"

    // $ANTLR start "EXCLUSIVE"
    public final void mEXCLUSIVE() throws RecognitionException {
        try {
            int _type = EXCLUSIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:866:10: ( E X C L U S I V E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:866:12: E X C L U S I V E
            {
            mE(); 


            mX(); 


            mC(); 


            mL(); 


            mU(); 


            mS(); 


            mI(); 


            mV(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXCLUSIVE"

    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:867:7: ( E X I S T S )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:867:9: E X I S T S
            {
            mE(); 


            mX(); 


            mI(); 


            mS(); 


            mT(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXISTS"

    // $ANTLR start "EXPLAIN"
    public final void mEXPLAIN() throws RecognitionException {
        try {
            int _type = EXPLAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:868:8: ( E X P L A I N )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:868:10: E X P L A I N
            {
            mE(); 


            mX(); 


            mP(); 


            mL(); 


            mA(); 


            mI(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPLAIN"

    // $ANTLR start "FAIL"
    public final void mFAIL() throws RecognitionException {
        try {
            int _type = FAIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:869:5: ( F A I L )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:869:7: F A I L
            {
            mF(); 


            mA(); 


            mI(); 


            mL(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FAIL"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:870:4: ( F O R )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:870:6: F O R
            {
            mF(); 


            mO(); 


            mR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "FOREIGN"
    public final void mFOREIGN() throws RecognitionException {
        try {
            int _type = FOREIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:871:8: ( F O R E I G N )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:871:10: F O R E I G N
            {
            mF(); 


            mO(); 


            mR(); 


            mE(); 


            mI(); 


            mG(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOREIGN"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:872:5: ( F R O M )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:872:7: F R O M
            {
            mF(); 


            mR(); 


            mO(); 


            mM(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "GLOB"
    public final void mGLOB() throws RecognitionException {
        try {
            int _type = GLOB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:873:5: ( G L O B )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:873:7: G L O B
            {
            mG(); 


            mL(); 


            mO(); 


            mB(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GLOB"

    // $ANTLR start "GROUP"
    public final void mGROUP() throws RecognitionException {
        try {
            int _type = GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:874:6: ( G R O U P )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:874:8: G R O U P
            {
            mG(); 


            mR(); 


            mO(); 


            mU(); 


            mP(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GROUP"

    // $ANTLR start "HAVING"
    public final void mHAVING() throws RecognitionException {
        try {
            int _type = HAVING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:875:7: ( H A V I N G )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:875:9: H A V I N G
            {
            mH(); 


            mA(); 


            mV(); 


            mI(); 


            mN(); 


            mG(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HAVING"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:876:3: ( I F )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:876:5: I F
            {
            mI(); 


            mF(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IGNORE"
    public final void mIGNORE() throws RecognitionException {
        try {
            int _type = IGNORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:877:7: ( I G N O R E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:877:9: I G N O R E
            {
            mI(); 


            mG(); 


            mN(); 


            mO(); 


            mR(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IGNORE"

    // $ANTLR start "IMMEDIATE"
    public final void mIMMEDIATE() throws RecognitionException {
        try {
            int _type = IMMEDIATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:878:10: ( I M M E D I A T E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:878:12: I M M E D I A T E
            {
            mI(); 


            mM(); 


            mM(); 


            mE(); 


            mD(); 


            mI(); 


            mA(); 


            mT(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IMMEDIATE"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:879:3: ( I N )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:879:5: I N
            {
            mI(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "INDEX"
    public final void mINDEX() throws RecognitionException {
        try {
            int _type = INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:880:6: ( I N D E X )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:880:8: I N D E X
            {
            mI(); 


            mN(); 


            mD(); 


            mE(); 


            mX(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INDEX"

    // $ANTLR start "INDEXED"
    public final void mINDEXED() throws RecognitionException {
        try {
            int _type = INDEXED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:881:8: ( I N D E X E D )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:881:10: I N D E X E D
            {
            mI(); 


            mN(); 


            mD(); 


            mE(); 


            mX(); 


            mE(); 


            mD(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INDEXED"

    // $ANTLR start "INITIALLY"
    public final void mINITIALLY() throws RecognitionException {
        try {
            int _type = INITIALLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:882:10: ( I N I T I A L L Y )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:882:12: I N I T I A L L Y
            {
            mI(); 


            mN(); 


            mI(); 


            mT(); 


            mI(); 


            mA(); 


            mL(); 


            mL(); 


            mY(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INITIALLY"

    // $ANTLR start "INNER"
    public final void mINNER() throws RecognitionException {
        try {
            int _type = INNER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:883:6: ( I N N E R )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:883:8: I N N E R
            {
            mI(); 


            mN(); 


            mN(); 


            mE(); 


            mR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INNER"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:884:7: ( I N S E R T )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:884:9: I N S E R T
            {
            mI(); 


            mN(); 


            mS(); 


            mE(); 


            mR(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "INSTEAD"
    public final void mINSTEAD() throws RecognitionException {
        try {
            int _type = INSTEAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:885:8: ( I N S T E A D )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:885:10: I N S T E A D
            {
            mI(); 


            mN(); 


            mS(); 


            mT(); 


            mE(); 


            mA(); 


            mD(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INSTEAD"

    // $ANTLR start "INTERSECT"
    public final void mINTERSECT() throws RecognitionException {
        try {
            int _type = INTERSECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:886:10: ( I N T E R S E C T )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:886:12: I N T E R S E C T
            {
            mI(); 


            mN(); 


            mT(); 


            mE(); 


            mR(); 


            mS(); 


            mE(); 


            mC(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTERSECT"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:887:5: ( I N T O )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:887:7: I N T O
            {
            mI(); 


            mN(); 


            mT(); 


            mO(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:888:3: ( I S )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:888:5: I S
            {
            mI(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "ISNULL"
    public final void mISNULL() throws RecognitionException {
        try {
            int _type = ISNULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:889:7: ( I S N U L L )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:889:9: I S N U L L
            {
            mI(); 


            mS(); 


            mN(); 


            mU(); 


            mL(); 


            mL(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ISNULL"

    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:890:5: ( J O I N )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:890:7: J O I N
            {
            mJ(); 


            mO(); 


            mI(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "JOIN"

    // $ANTLR start "KEY"
    public final void mKEY() throws RecognitionException {
        try {
            int _type = KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:891:4: ( K E Y )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:891:6: K E Y
            {
            mK(); 


            mE(); 


            mY(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEY"

    // $ANTLR start "LEFT"
    public final void mLEFT() throws RecognitionException {
        try {
            int _type = LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:892:5: ( L E F T )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:892:7: L E F T
            {
            mL(); 


            mE(); 


            mF(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFT"

    // $ANTLR start "LIKE"
    public final void mLIKE() throws RecognitionException {
        try {
            int _type = LIKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:893:5: ( L I K E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:893:7: L I K E
            {
            mL(); 


            mI(); 


            mK(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LIKE"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:894:6: ( L I M I T )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:894:8: L I M I T
            {
            mL(); 


            mI(); 


            mM(); 


            mI(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "MATCH"
    public final void mMATCH() throws RecognitionException {
        try {
            int _type = MATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:895:6: ( M A T C H )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:895:8: M A T C H
            {
            mM(); 


            mA(); 


            mT(); 


            mC(); 


            mH(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MATCH"

    // $ANTLR start "NATURAL"
    public final void mNATURAL() throws RecognitionException {
        try {
            int _type = NATURAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:896:8: ( N A T U R A L )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:896:10: N A T U R A L
            {
            mN(); 


            mA(); 


            mT(); 


            mU(); 


            mR(); 


            mA(); 


            mL(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NATURAL"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:897:4: ( N O T )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:897:6: N O T
            {
            mN(); 


            mO(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "NOTNULL"
    public final void mNOTNULL() throws RecognitionException {
        try {
            int _type = NOTNULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:898:8: ( N O T N U L L )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:898:10: N O T N U L L
            {
            mN(); 


            mO(); 


            mT(); 


            mN(); 


            mU(); 


            mL(); 


            mL(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTNULL"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:899:5: ( N U L L )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:899:7: N U L L
            {
            mN(); 


            mU(); 


            mL(); 


            mL(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "OF"
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:900:3: ( O F )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:900:5: O F
            {
            mO(); 


            mF(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OF"

    // $ANTLR start "OFFSET"
    public final void mOFFSET() throws RecognitionException {
        try {
            int _type = OFFSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:901:7: ( O F F S E T )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:901:9: O F F S E T
            {
            mO(); 


            mF(); 


            mF(); 


            mS(); 


            mE(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OFFSET"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:902:3: ( O N )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:902:5: O N
            {
            mO(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:903:3: ( O R )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:903:5: O R
            {
            mO(); 


            mR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:904:6: ( O R D E R )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:904:8: O R D E R
            {
            mO(); 


            mR(); 


            mD(); 


            mE(); 


            mR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ORDER"

    // $ANTLR start "OUTER"
    public final void mOUTER() throws RecognitionException {
        try {
            int _type = OUTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:905:6: ( O U T E R )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:905:8: O U T E R
            {
            mO(); 


            mU(); 


            mT(); 


            mE(); 


            mR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OUTER"

    // $ANTLR start "PLAN"
    public final void mPLAN() throws RecognitionException {
        try {
            int _type = PLAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:906:5: ( P L A N )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:906:7: P L A N
            {
            mP(); 


            mL(); 


            mA(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLAN"

    // $ANTLR start "PRAGMA"
    public final void mPRAGMA() throws RecognitionException {
        try {
            int _type = PRAGMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:907:7: ( P R A G M A )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:907:9: P R A G M A
            {
            mP(); 


            mR(); 


            mA(); 


            mG(); 


            mM(); 


            mA(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRAGMA"

    // $ANTLR start "PRIMARY"
    public final void mPRIMARY() throws RecognitionException {
        try {
            int _type = PRIMARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:908:8: ( P R I M A R Y )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:908:10: P R I M A R Y
            {
            mP(); 


            mR(); 


            mI(); 


            mM(); 


            mA(); 


            mR(); 


            mY(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRIMARY"

    // $ANTLR start "QUERY"
    public final void mQUERY() throws RecognitionException {
        try {
            int _type = QUERY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:909:6: ( Q U E R Y )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:909:8: Q U E R Y
            {
            mQ(); 


            mU(); 


            mE(); 


            mR(); 


            mY(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUERY"

    // $ANTLR start "RAISE"
    public final void mRAISE() throws RecognitionException {
        try {
            int _type = RAISE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:910:6: ( R A I S E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:910:8: R A I S E
            {
            mR(); 


            mA(); 


            mI(); 


            mS(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RAISE"

    // $ANTLR start "REFERENCES"
    public final void mREFERENCES() throws RecognitionException {
        try {
            int _type = REFERENCES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:911:11: ( R E F E R E N C E S )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:911:13: R E F E R E N C E S
            {
            mR(); 


            mE(); 


            mF(); 


            mE(); 


            mR(); 


            mE(); 


            mN(); 


            mC(); 


            mE(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REFERENCES"

    // $ANTLR start "REGEXP"
    public final void mREGEXP() throws RecognitionException {
        try {
            int _type = REGEXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:912:7: ( R E G E X P )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:912:9: R E G E X P
            {
            mR(); 


            mE(); 


            mG(); 


            mE(); 


            mX(); 


            mP(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REGEXP"

    // $ANTLR start "REINDEX"
    public final void mREINDEX() throws RecognitionException {
        try {
            int _type = REINDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:913:8: ( R E I N D E X )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:913:10: R E I N D E X
            {
            mR(); 


            mE(); 


            mI(); 


            mN(); 


            mD(); 


            mE(); 


            mX(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REINDEX"

    // $ANTLR start "RELEASE"
    public final void mRELEASE() throws RecognitionException {
        try {
            int _type = RELEASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:914:8: ( R E L E A S E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:914:10: R E L E A S E
            {
            mR(); 


            mE(); 


            mL(); 


            mE(); 


            mA(); 


            mS(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RELEASE"

    // $ANTLR start "RENAME"
    public final void mRENAME() throws RecognitionException {
        try {
            int _type = RENAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:915:7: ( R E N A M E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:915:9: R E N A M E
            {
            mR(); 


            mE(); 


            mN(); 


            mA(); 


            mM(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RENAME"

    // $ANTLR start "REPLACE"
    public final void mREPLACE() throws RecognitionException {
        try {
            int _type = REPLACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:916:8: ( R E P L A C E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:916:10: R E P L A C E
            {
            mR(); 


            mE(); 


            mP(); 


            mL(); 


            mA(); 


            mC(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REPLACE"

    // $ANTLR start "RESTRICT"
    public final void mRESTRICT() throws RecognitionException {
        try {
            int _type = RESTRICT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:917:9: ( R E S T R I C T )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:917:11: R E S T R I C T
            {
            mR(); 


            mE(); 


            mS(); 


            mT(); 


            mR(); 


            mI(); 


            mC(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RESTRICT"

    // $ANTLR start "ROLLBACK"
    public final void mROLLBACK() throws RecognitionException {
        try {
            int _type = ROLLBACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:918:9: ( R O L L B A C K )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:918:11: R O L L B A C K
            {
            mR(); 


            mO(); 


            mL(); 


            mL(); 


            mB(); 


            mA(); 


            mC(); 


            mK(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ROLLBACK"

    // $ANTLR start "ROW"
    public final void mROW() throws RecognitionException {
        try {
            int _type = ROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:919:4: ( R O W )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:919:6: R O W
            {
            mR(); 


            mO(); 


            mW(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ROW"

    // $ANTLR start "SAVEPOINT"
    public final void mSAVEPOINT() throws RecognitionException {
        try {
            int _type = SAVEPOINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:920:10: ( S A V E P O I N T )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:920:12: S A V E P O I N T
            {
            mS(); 


            mA(); 


            mV(); 


            mE(); 


            mP(); 


            mO(); 


            mI(); 


            mN(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SAVEPOINT"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:921:7: ( S E L E C T )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:921:9: S E L E C T
            {
            mS(); 


            mE(); 


            mL(); 


            mE(); 


            mC(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:922:4: ( S E T )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:922:6: S E T
            {
            mS(); 


            mE(); 


            mT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "TABLE"
    public final void mTABLE() throws RecognitionException {
        try {
            int _type = TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:923:6: ( T A B L E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:923:8: T A B L E
            {
            mT(); 


            mA(); 


            mB(); 


            mL(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TABLE"

    // $ANTLR start "TEMPORARY"
    public final void mTEMPORARY() throws RecognitionException {
        try {
            int _type = TEMPORARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:924:10: ( T E M P ( O R A R Y )? )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:924:12: T E M P ( O R A R Y )?
            {
            mT(); 


            mE(); 


            mM(); 


            mP(); 


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:924:20: ( O R A R Y )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='O'||LA1_0=='o') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:924:22: O R A R Y
                    {
                    mO(); 


                    mR(); 


                    mA(); 


                    mR(); 


                    mY(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEMPORARY"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:925:5: ( T H E N )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:925:7: T H E N
            {
            mT(); 


            mH(); 


            mE(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:926:3: ( T O )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:926:5: T O
            {
            mT(); 


            mO(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "TRANSACTION"
    public final void mTRANSACTION() throws RecognitionException {
        try {
            int _type = TRANSACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:927:12: ( T R A N S A C T I O N )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:927:14: T R A N S A C T I O N
            {
            mT(); 


            mR(); 


            mA(); 


            mN(); 


            mS(); 


            mA(); 


            mC(); 


            mT(); 


            mI(); 


            mO(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRANSACTION"

    // $ANTLR start "TRIGGER"
    public final void mTRIGGER() throws RecognitionException {
        try {
            int _type = TRIGGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:928:8: ( T R I G G E R )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:928:10: T R I G G E R
            {
            mT(); 


            mR(); 


            mI(); 


            mG(); 


            mG(); 


            mE(); 


            mR(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRIGGER"

    // $ANTLR start "UNION"
    public final void mUNION() throws RecognitionException {
        try {
            int _type = UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:929:6: ( U N I O N )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:929:8: U N I O N
            {
            mU(); 


            mN(); 


            mI(); 


            mO(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNION"

    // $ANTLR start "UNIQUE"
    public final void mUNIQUE() throws RecognitionException {
        try {
            int _type = UNIQUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:930:7: ( U N I Q U E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:930:9: U N I Q U E
            {
            mU(); 


            mN(); 


            mI(); 


            mQ(); 


            mU(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNIQUE"

    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:931:7: ( U P D A T E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:931:9: U P D A T E
            {
            mU(); 


            mP(); 


            mD(); 


            mA(); 


            mT(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UPDATE"

    // $ANTLR start "USING"
    public final void mUSING() throws RecognitionException {
        try {
            int _type = USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:932:6: ( U S I N G )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:932:8: U S I N G
            {
            mU(); 


            mS(); 


            mI(); 


            mN(); 


            mG(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USING"

    // $ANTLR start "VACUUM"
    public final void mVACUUM() throws RecognitionException {
        try {
            int _type = VACUUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:933:7: ( V A C U U M )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:933:9: V A C U U M
            {
            mV(); 


            mA(); 


            mC(); 


            mU(); 


            mU(); 


            mM(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VACUUM"

    // $ANTLR start "VALUES"
    public final void mVALUES() throws RecognitionException {
        try {
            int _type = VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:934:7: ( V A L U E S )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:934:9: V A L U E S
            {
            mV(); 


            mA(); 


            mL(); 


            mU(); 


            mE(); 


            mS(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VALUES"

    // $ANTLR start "VIEW"
    public final void mVIEW() throws RecognitionException {
        try {
            int _type = VIEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:935:5: ( V I E W )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:935:7: V I E W
            {
            mV(); 


            mI(); 


            mE(); 


            mW(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VIEW"

    // $ANTLR start "VIRTUAL"
    public final void mVIRTUAL() throws RecognitionException {
        try {
            int _type = VIRTUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:936:8: ( V I R T U A L )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:936:10: V I R T U A L
            {
            mV(); 


            mI(); 


            mR(); 


            mT(); 


            mU(); 


            mA(); 


            mL(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VIRTUAL"

    // $ANTLR start "WHEN"
    public final void mWHEN() throws RecognitionException {
        try {
            int _type = WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:937:5: ( W H E N )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:937:7: W H E N
            {
            mW(); 


            mH(); 


            mE(); 


            mN(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHEN"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:938:6: ( W H E R E )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:938:8: W H E R E
            {
            mW(); 


            mH(); 


            mE(); 


            mR(); 


            mE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "STRING_ESCAPE_SINGLE"
    public final void mSTRING_ESCAPE_SINGLE() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:940:30: ( ( BACKSLASH QUOTE_SINGLE ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:940:32: ( BACKSLASH QUOTE_SINGLE )
            {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:940:32: ( BACKSLASH QUOTE_SINGLE )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:940:33: BACKSLASH QUOTE_SINGLE
            {
            mBACKSLASH(); 


            mQUOTE_SINGLE(); 


            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_ESCAPE_SINGLE"

    // $ANTLR start "STRING_ESCAPE_DOUBLE"
    public final void mSTRING_ESCAPE_DOUBLE() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:941:30: ( ( BACKSLASH QUOTE_DOUBLE ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:941:32: ( BACKSLASH QUOTE_DOUBLE )
            {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:941:32: ( BACKSLASH QUOTE_DOUBLE )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:941:33: BACKSLASH QUOTE_DOUBLE
            {
            mBACKSLASH(); 


            mQUOTE_DOUBLE(); 


            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_ESCAPE_DOUBLE"

    // $ANTLR start "STRING_CORE"
    public final void mSTRING_CORE() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:942:21: (~ ( QUOTE_SINGLE | QUOTE_DOUBLE ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_CORE"

    // $ANTLR start "STRING_CORE_SINGLE"
    public final void mSTRING_CORE_SINGLE() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:943:28: ( ( STRING_CORE | QUOTE_DOUBLE | STRING_ESCAPE_SINGLE )* )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:943:30: ( STRING_CORE | QUOTE_DOUBLE | STRING_ESCAPE_SINGLE )*
            {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:943:30: ( STRING_CORE | QUOTE_DOUBLE | STRING_ESCAPE_SINGLE )*
            loop2:
            do {
                int alt2=4;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2=='\'') ) {
                        alt2=3;
                    }

                    else {
                        alt2=1;
                    }


                }
                else if ( (LA2_0=='\"') ) {
                    alt2=2;
                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '&')||(LA2_0 >= '(' && LA2_0 <= '[')||(LA2_0 >= ']' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:943:32: STRING_CORE
            	    {
            	    mSTRING_CORE(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:943:46: QUOTE_DOUBLE
            	    {
            	    mQUOTE_DOUBLE(); 


            	    }
            	    break;
            	case 3 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:943:61: STRING_ESCAPE_SINGLE
            	    {
            	    mSTRING_ESCAPE_SINGLE(); 


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_CORE_SINGLE"

    // $ANTLR start "STRING_CORE_DOUBLE"
    public final void mSTRING_CORE_DOUBLE() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:944:28: ( ( STRING_CORE | QUOTE_SINGLE | STRING_ESCAPE_DOUBLE )* )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:944:30: ( STRING_CORE | QUOTE_SINGLE | STRING_ESCAPE_DOUBLE )*
            {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:944:30: ( STRING_CORE | QUOTE_SINGLE | STRING_ESCAPE_DOUBLE )*
            loop3:
            do {
                int alt3=4;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2=='\"') ) {
                        alt3=3;
                    }

                    else {
                        alt3=1;
                    }


                }
                else if ( (LA3_0=='\'') ) {
                    alt3=2;
                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '!')||(LA3_0 >= '#' && LA3_0 <= '&')||(LA3_0 >= '(' && LA3_0 <= '[')||(LA3_0 >= ']' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:944:32: STRING_CORE
            	    {
            	    mSTRING_CORE(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:944:46: QUOTE_SINGLE
            	    {
            	    mQUOTE_SINGLE(); 


            	    }
            	    break;
            	case 3 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:944:61: STRING_ESCAPE_DOUBLE
            	    {
            	    mSTRING_ESCAPE_DOUBLE(); 


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_CORE_DOUBLE"

    // $ANTLR start "STRING_SINGLE"
    public final void mSTRING_SINGLE() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:945:23: ( ( QUOTE_SINGLE STRING_CORE_SINGLE QUOTE_SINGLE ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:945:25: ( QUOTE_SINGLE STRING_CORE_SINGLE QUOTE_SINGLE )
            {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:945:25: ( QUOTE_SINGLE STRING_CORE_SINGLE QUOTE_SINGLE )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:945:26: QUOTE_SINGLE STRING_CORE_SINGLE QUOTE_SINGLE
            {
            mQUOTE_SINGLE(); 


            mSTRING_CORE_SINGLE(); 


            mQUOTE_SINGLE(); 


            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_SINGLE"

    // $ANTLR start "STRING_DOUBLE"
    public final void mSTRING_DOUBLE() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:946:23: ( ( QUOTE_DOUBLE STRING_CORE_DOUBLE QUOTE_DOUBLE ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:946:25: ( QUOTE_DOUBLE STRING_CORE_DOUBLE QUOTE_DOUBLE )
            {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:946:25: ( QUOTE_DOUBLE STRING_CORE_DOUBLE QUOTE_DOUBLE )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:946:26: QUOTE_DOUBLE STRING_CORE_DOUBLE QUOTE_DOUBLE
            {
            mQUOTE_DOUBLE(); 


            mSTRING_CORE_DOUBLE(); 


            mQUOTE_DOUBLE(); 


            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_DOUBLE"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:947:7: ( ( STRING_SINGLE | STRING_DOUBLE ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:947:9: ( STRING_SINGLE | STRING_DOUBLE )
            {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:947:9: ( STRING_SINGLE | STRING_DOUBLE )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\'') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\"') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:947:10: STRING_SINGLE
                    {
                    mSTRING_SINGLE(); 


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:947:26: STRING_DOUBLE
                    {
                    mSTRING_DOUBLE(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ID_START"
    public final void mID_START() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:949:18: ( ( 'a' .. 'z' | 'A' .. 'Z' | UNDERSCORE ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID_START"

    // $ANTLR start "ID_CORE"
    public final void mID_CORE() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:950:17: ( ( ID_START | '0' .. '9' | DOLLAR ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID_CORE"

    // $ANTLR start "ID_PLAIN"
    public final void mID_PLAIN() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:951:18: ( ID_START ( ID_CORE )* )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:951:20: ID_START ( ID_CORE )*
            {
            mID_START(); 


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:951:29: ( ID_CORE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='$'||(LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID_PLAIN"

    // $ANTLR start "ID_QUOTED_CORE"
    public final void mID_QUOTED_CORE() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:953:24: (~ ( APOSTROPHE | LPAREN_SQUARE | RPAREN_SQUARE ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= 'Z')||input.LA(1)=='\\'||(input.LA(1) >= '^' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID_QUOTED_CORE"

    // $ANTLR start "ID_QUOTED_CORE_SQUARE"
    public final void mID_QUOTED_CORE_SQUARE() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:954:31: ( ( ID_QUOTED_CORE | APOSTROPHE )* )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:954:33: ( ID_QUOTED_CORE | APOSTROPHE )*
            {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:954:33: ( ID_QUOTED_CORE | APOSTROPHE )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\u0000' && LA6_0 <= 'Z')||LA6_0=='\\'||(LA6_0 >= '^' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= 'Z')||input.LA(1)=='\\'||(input.LA(1) >= '^' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID_QUOTED_CORE_SQUARE"

    // $ANTLR start "ID_QUOTED_CORE_APOSTROPHE"
    public final void mID_QUOTED_CORE_APOSTROPHE() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:955:35: ( ( ID_QUOTED_CORE | LPAREN_SQUARE | RPAREN_SQUARE )* )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:955:37: ( ID_QUOTED_CORE | LPAREN_SQUARE | RPAREN_SQUARE )*
            {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:955:37: ( ID_QUOTED_CORE | LPAREN_SQUARE | RPAREN_SQUARE )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\u0000' && LA7_0 <= '_')||(LA7_0 >= 'a' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID_QUOTED_CORE_APOSTROPHE"

    // $ANTLR start "ID_QUOTED_SQUARE"
    public final void mID_QUOTED_SQUARE() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:956:26: ( ( LPAREN_SQUARE ID_QUOTED_CORE_SQUARE RPAREN_SQUARE ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:956:28: ( LPAREN_SQUARE ID_QUOTED_CORE_SQUARE RPAREN_SQUARE )
            {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:956:28: ( LPAREN_SQUARE ID_QUOTED_CORE_SQUARE RPAREN_SQUARE )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:956:29: LPAREN_SQUARE ID_QUOTED_CORE_SQUARE RPAREN_SQUARE
            {
            mLPAREN_SQUARE(); 


            mID_QUOTED_CORE_SQUARE(); 


            mRPAREN_SQUARE(); 


            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID_QUOTED_SQUARE"

    // $ANTLR start "ID_QUOTED_APOSTROPHE"
    public final void mID_QUOTED_APOSTROPHE() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:957:30: ( ( APOSTROPHE ID_QUOTED_CORE_APOSTROPHE APOSTROPHE ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:957:32: ( APOSTROPHE ID_QUOTED_CORE_APOSTROPHE APOSTROPHE )
            {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:957:32: ( APOSTROPHE ID_QUOTED_CORE_APOSTROPHE APOSTROPHE )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:957:33: APOSTROPHE ID_QUOTED_CORE_APOSTROPHE APOSTROPHE
            {
            mAPOSTROPHE(); 


            mID_QUOTED_CORE_APOSTROPHE(); 


            mAPOSTROPHE(); 


            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID_QUOTED_APOSTROPHE"

    // $ANTLR start "ID_QUOTED"
    public final void mID_QUOTED() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:958:19: ( ID_QUOTED_SQUARE | ID_QUOTED_APOSTROPHE )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='[') ) {
                alt8=1;
            }
            else if ( (LA8_0=='`') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:958:21: ID_QUOTED_SQUARE
                    {
                    mID_QUOTED_SQUARE(); 


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:958:40: ID_QUOTED_APOSTROPHE
                    {
                    mID_QUOTED_APOSTROPHE(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID_QUOTED"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:960:3: ( ID_PLAIN | ID_QUOTED )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0 >= 'A' && LA9_0 <= 'Z')||LA9_0=='_'||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
                alt9=1;
            }
            else if ( (LA9_0=='['||LA9_0=='`') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:960:5: ID_PLAIN
                    {
                    mID_PLAIN(); 


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:960:16: ID_QUOTED
                    {
                    mID_QUOTED(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:964:8: ( ( '0' .. '9' )+ )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:964:10: ( '0' .. '9' )+
            {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:964:10: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT_EXP"
    public final void mFLOAT_EXP() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:965:20: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:965:22: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:965:32: ( '+' | '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='+'||LA11_0=='-') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:965:43: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT_EXP"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:967:5: ( ( '0' .. '9' )+ DOT ( '0' .. '9' )* ( FLOAT_EXP )? | DOT ( '0' .. '9' )+ ( FLOAT_EXP )? | ( '0' .. '9' )+ FLOAT_EXP )
            int alt19=3;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:967:9: ( '0' .. '9' )+ DOT ( '0' .. '9' )* ( FLOAT_EXP )?
                    {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:967:9: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    mDOT(); 


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:967:25: ( '0' .. '9' )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:967:37: ( FLOAT_EXP )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='E'||LA15_0=='e') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:967:37: FLOAT_EXP
                            {
                            mFLOAT_EXP(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:968:9: DOT ( '0' .. '9' )+ ( FLOAT_EXP )?
                    {
                    mDOT(); 


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:968:13: ( '0' .. '9' )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:968:25: ( FLOAT_EXP )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='E'||LA17_0=='e') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:968:25: FLOAT_EXP
                            {
                            mFLOAT_EXP(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:969:9: ( '0' .. '9' )+ FLOAT_EXP
                    {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:969:9: ( '0' .. '9' )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    mFLOAT_EXP(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "BLOB"
    public final void mBLOB() throws RecognitionException {
        try {
            int _type = BLOB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:971:5: ( ( 'x' | 'X' ) QUOTE_SINGLE ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ QUOTE_SINGLE )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:971:7: ( 'x' | 'X' ) QUOTE_SINGLE ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ QUOTE_SINGLE
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            mQUOTE_SINGLE(); 


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:971:30: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0 >= '0' && LA20_0 <= '9')||(LA20_0 >= 'A' && LA20_0 <= 'F')||(LA20_0 >= 'a' && LA20_0 <= 'f')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            mQUOTE_SINGLE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BLOB"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:973:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:973:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:973:24: ( options {greedy=false; } : . )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='*') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='/') ) {
                        alt21=2;
                    }
                    else if ( ((LA21_1 >= '\u0000' && LA21_1 <= '.')||(LA21_1 >= '0' && LA21_1 <= '\uFFFF')) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0 >= '\u0000' && LA21_0 <= ')')||(LA21_0 >= '+' && LA21_0 <= '\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:973:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            match("*/"); 



            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:974:22: ( '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' | EOF ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:974:24: '--' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' | EOF )
            {
            match("--"); 



            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:974:29: (~ ( '\\n' | '\\r' ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0 >= '\u0000' && LA22_0 <= '\t')||(LA22_0 >= '\u000B' && LA22_0 <= '\f')||(LA22_0 >= '\u000E' && LA22_0 <= '\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:974:43: ( ( '\\r' )? '\\n' | EOF )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\n'||LA24_0=='\r') ) {
                alt24=1;
            }
            else {
                alt24=2;
            }
            switch (alt24) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:974:44: ( '\\r' )? '\\n'
                    {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:974:44: ( '\\r' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\r') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:974:44: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:974:55: EOF
                    {
                    match(EOF); 


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:975:3: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' | COMMENT | LINE_COMMENT ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:975:5: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' | COMMENT | LINE_COMMENT )
            {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:975:5: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' | COMMENT | LINE_COMMENT )
            int alt25=7;
            switch ( input.LA(1) ) {
            case ' ':
                {
                alt25=1;
                }
                break;
            case '\r':
                {
                alt25=2;
                }
                break;
            case '\t':
                {
                alt25=3;
                }
                break;
            case '\f':
                {
                alt25=4;
                }
                break;
            case '\n':
                {
                alt25=5;
                }
                break;
            case '/':
                {
                alt25=6;
                }
                break;
            case '-':
                {
                alt25=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:975:6: ' '
                    {
                    match(' '); 

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:975:10: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:975:15: '\\t'
                    {
                    match('\t'); 

                    }
                    break;
                case 4 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:975:20: '\\u000C'
                    {
                    match('\f'); 

                    }
                    break;
                case 5 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:975:29: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 6 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:975:34: COMMENT
                    {
                    mCOMMENT(); 


                    }
                    break;
                case 7 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:975:42: LINE_COMMENT
                    {
                    mLINE_COMMENT(); 


                    }
                    break;

            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:8: ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 | LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ | SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE | DOUBLE_PIPE | PLUS | MINUS | TILDA | ASTERISK | SLASH | BACKSLASH | PERCENT | SEMI | DOT | COMMA | LPAREN | RPAREN | QUESTION | COLON | AT | DOLLAR | QUOTE_DOUBLE | QUOTE_SINGLE | APOSTROPHE | LPAREN_SQUARE | RPAREN_SQUARE | UNDERSCORE | ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE | STRING | ID | INTEGER | FLOAT | BLOB | WS )
        int alt26=157;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:10: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 2 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:17: EQUALS2
                {
                mEQUALS2(); 


                }
                break;
            case 3 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:25: NOT_EQUALS
                {
                mNOT_EQUALS(); 


                }
                break;
            case 4 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:36: NOT_EQUALS2
                {
                mNOT_EQUALS2(); 


                }
                break;
            case 5 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:48: LESS
                {
                mLESS(); 


                }
                break;
            case 6 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:53: LESS_OR_EQ
                {
                mLESS_OR_EQ(); 


                }
                break;
            case 7 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:64: GREATER
                {
                mGREATER(); 


                }
                break;
            case 8 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:72: GREATER_OR_EQ
                {
                mGREATER_OR_EQ(); 


                }
                break;
            case 9 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:86: SHIFT_LEFT
                {
                mSHIFT_LEFT(); 


                }
                break;
            case 10 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:97: SHIFT_RIGHT
                {
                mSHIFT_RIGHT(); 


                }
                break;
            case 11 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:109: AMPERSAND
                {
                mAMPERSAND(); 


                }
                break;
            case 12 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:119: PIPE
                {
                mPIPE(); 


                }
                break;
            case 13 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:124: DOUBLE_PIPE
                {
                mDOUBLE_PIPE(); 


                }
                break;
            case 14 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:136: PLUS
                {
                mPLUS(); 


                }
                break;
            case 15 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:141: MINUS
                {
                mMINUS(); 


                }
                break;
            case 16 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:147: TILDA
                {
                mTILDA(); 


                }
                break;
            case 17 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:153: ASTERISK
                {
                mASTERISK(); 


                }
                break;
            case 18 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:162: SLASH
                {
                mSLASH(); 


                }
                break;
            case 19 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:168: BACKSLASH
                {
                mBACKSLASH(); 


                }
                break;
            case 20 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:178: PERCENT
                {
                mPERCENT(); 


                }
                break;
            case 21 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:186: SEMI
                {
                mSEMI(); 


                }
                break;
            case 22 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:191: DOT
                {
                mDOT(); 


                }
                break;
            case 23 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:195: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 24 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:201: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 25 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:208: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 26 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:215: QUESTION
                {
                mQUESTION(); 


                }
                break;
            case 27 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:224: COLON
                {
                mCOLON(); 


                }
                break;
            case 28 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:230: AT
                {
                mAT(); 


                }
                break;
            case 29 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:233: DOLLAR
                {
                mDOLLAR(); 


                }
                break;
            case 30 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:240: QUOTE_DOUBLE
                {
                mQUOTE_DOUBLE(); 


                }
                break;
            case 31 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:253: QUOTE_SINGLE
                {
                mQUOTE_SINGLE(); 


                }
                break;
            case 32 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:266: APOSTROPHE
                {
                mAPOSTROPHE(); 


                }
                break;
            case 33 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:277: LPAREN_SQUARE
                {
                mLPAREN_SQUARE(); 


                }
                break;
            case 34 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:291: RPAREN_SQUARE
                {
                mRPAREN_SQUARE(); 


                }
                break;
            case 35 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:305: UNDERSCORE
                {
                mUNDERSCORE(); 


                }
                break;
            case 36 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:316: ABORT
                {
                mABORT(); 


                }
                break;
            case 37 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:322: ADD
                {
                mADD(); 


                }
                break;
            case 38 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:326: AFTER
                {
                mAFTER(); 


                }
                break;
            case 39 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:332: ALL
                {
                mALL(); 


                }
                break;
            case 40 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:336: ALTER
                {
                mALTER(); 


                }
                break;
            case 41 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:342: ANALYZE
                {
                mANALYZE(); 


                }
                break;
            case 42 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:350: AND
                {
                mAND(); 


                }
                break;
            case 43 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:354: AS
                {
                mAS(); 


                }
                break;
            case 44 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:357: ASC
                {
                mASC(); 


                }
                break;
            case 45 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:361: ATTACH
                {
                mATTACH(); 


                }
                break;
            case 46 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:368: AUTOINCREMENT
                {
                mAUTOINCREMENT(); 


                }
                break;
            case 47 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:382: BEFORE
                {
                mBEFORE(); 


                }
                break;
            case 48 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:389: BEGIN
                {
                mBEGIN(); 


                }
                break;
            case 49 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:395: BETWEEN
                {
                mBETWEEN(); 


                }
                break;
            case 50 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:403: BY
                {
                mBY(); 


                }
                break;
            case 51 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:406: CASCADE
                {
                mCASCADE(); 


                }
                break;
            case 52 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:414: CASE
                {
                mCASE(); 


                }
                break;
            case 53 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:419: CAST
                {
                mCAST(); 


                }
                break;
            case 54 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:424: CHECK
                {
                mCHECK(); 


                }
                break;
            case 55 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:430: COLLATE
                {
                mCOLLATE(); 


                }
                break;
            case 56 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:438: COLUMN
                {
                mCOLUMN(); 


                }
                break;
            case 57 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:445: COMMIT
                {
                mCOMMIT(); 


                }
                break;
            case 58 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:452: CONFLICT
                {
                mCONFLICT(); 


                }
                break;
            case 59 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:461: CONSTRAINT
                {
                mCONSTRAINT(); 


                }
                break;
            case 60 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:472: CREATE
                {
                mCREATE(); 


                }
                break;
            case 61 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:479: CROSS
                {
                mCROSS(); 


                }
                break;
            case 62 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:485: CURRENT_TIME
                {
                mCURRENT_TIME(); 


                }
                break;
            case 63 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:498: CURRENT_DATE
                {
                mCURRENT_DATE(); 


                }
                break;
            case 64 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:511: CURRENT_TIMESTAMP
                {
                mCURRENT_TIMESTAMP(); 


                }
                break;
            case 65 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:529: DATABASE
                {
                mDATABASE(); 


                }
                break;
            case 66 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:538: DEFAULT
                {
                mDEFAULT(); 


                }
                break;
            case 67 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:546: DEFERRABLE
                {
                mDEFERRABLE(); 


                }
                break;
            case 68 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:557: DEFERRED
                {
                mDEFERRED(); 


                }
                break;
            case 69 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:566: DELETE
                {
                mDELETE(); 


                }
                break;
            case 70 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:573: DESC
                {
                mDESC(); 


                }
                break;
            case 71 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:578: DETACH
                {
                mDETACH(); 


                }
                break;
            case 72 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:585: DISTINCT
                {
                mDISTINCT(); 


                }
                break;
            case 73 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:594: DROP
                {
                mDROP(); 


                }
                break;
            case 74 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:599: EACH
                {
                mEACH(); 


                }
                break;
            case 75 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:604: ELSE
                {
                mELSE(); 


                }
                break;
            case 76 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:609: END
                {
                mEND(); 


                }
                break;
            case 77 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:613: ESCAPE
                {
                mESCAPE(); 


                }
                break;
            case 78 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:620: EXCEPT
                {
                mEXCEPT(); 


                }
                break;
            case 79 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:627: EXCLUSIVE
                {
                mEXCLUSIVE(); 


                }
                break;
            case 80 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:637: EXISTS
                {
                mEXISTS(); 


                }
                break;
            case 81 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:644: EXPLAIN
                {
                mEXPLAIN(); 


                }
                break;
            case 82 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:652: FAIL
                {
                mFAIL(); 


                }
                break;
            case 83 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:657: FOR
                {
                mFOR(); 


                }
                break;
            case 84 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:661: FOREIGN
                {
                mFOREIGN(); 


                }
                break;
            case 85 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:669: FROM
                {
                mFROM(); 


                }
                break;
            case 86 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:674: GLOB
                {
                mGLOB(); 


                }
                break;
            case 87 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:679: GROUP
                {
                mGROUP(); 


                }
                break;
            case 88 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:685: HAVING
                {
                mHAVING(); 


                }
                break;
            case 89 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:692: IF
                {
                mIF(); 


                }
                break;
            case 90 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:695: IGNORE
                {
                mIGNORE(); 


                }
                break;
            case 91 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:702: IMMEDIATE
                {
                mIMMEDIATE(); 


                }
                break;
            case 92 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:712: IN
                {
                mIN(); 


                }
                break;
            case 93 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:715: INDEX
                {
                mINDEX(); 


                }
                break;
            case 94 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:721: INDEXED
                {
                mINDEXED(); 


                }
                break;
            case 95 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:729: INITIALLY
                {
                mINITIALLY(); 


                }
                break;
            case 96 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:739: INNER
                {
                mINNER(); 


                }
                break;
            case 97 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:745: INSERT
                {
                mINSERT(); 


                }
                break;
            case 98 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:752: INSTEAD
                {
                mINSTEAD(); 


                }
                break;
            case 99 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:760: INTERSECT
                {
                mINTERSECT(); 


                }
                break;
            case 100 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:770: INTO
                {
                mINTO(); 


                }
                break;
            case 101 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:775: IS
                {
                mIS(); 


                }
                break;
            case 102 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:778: ISNULL
                {
                mISNULL(); 


                }
                break;
            case 103 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:785: JOIN
                {
                mJOIN(); 


                }
                break;
            case 104 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:790: KEY
                {
                mKEY(); 


                }
                break;
            case 105 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:794: LEFT
                {
                mLEFT(); 


                }
                break;
            case 106 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:799: LIKE
                {
                mLIKE(); 


                }
                break;
            case 107 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:804: LIMIT
                {
                mLIMIT(); 


                }
                break;
            case 108 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:810: MATCH
                {
                mMATCH(); 


                }
                break;
            case 109 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:816: NATURAL
                {
                mNATURAL(); 


                }
                break;
            case 110 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:824: NOT
                {
                mNOT(); 


                }
                break;
            case 111 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:828: NOTNULL
                {
                mNOTNULL(); 


                }
                break;
            case 112 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:836: NULL
                {
                mNULL(); 


                }
                break;
            case 113 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:841: OF
                {
                mOF(); 


                }
                break;
            case 114 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:844: OFFSET
                {
                mOFFSET(); 


                }
                break;
            case 115 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:851: ON
                {
                mON(); 


                }
                break;
            case 116 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:854: OR
                {
                mOR(); 


                }
                break;
            case 117 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:857: ORDER
                {
                mORDER(); 


                }
                break;
            case 118 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:863: OUTER
                {
                mOUTER(); 


                }
                break;
            case 119 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:869: PLAN
                {
                mPLAN(); 


                }
                break;
            case 120 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:874: PRAGMA
                {
                mPRAGMA(); 


                }
                break;
            case 121 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:881: PRIMARY
                {
                mPRIMARY(); 


                }
                break;
            case 122 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:889: QUERY
                {
                mQUERY(); 


                }
                break;
            case 123 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:895: RAISE
                {
                mRAISE(); 


                }
                break;
            case 124 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:901: REFERENCES
                {
                mREFERENCES(); 


                }
                break;
            case 125 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:912: REGEXP
                {
                mREGEXP(); 


                }
                break;
            case 126 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:919: REINDEX
                {
                mREINDEX(); 


                }
                break;
            case 127 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:927: RELEASE
                {
                mRELEASE(); 


                }
                break;
            case 128 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:935: RENAME
                {
                mRENAME(); 


                }
                break;
            case 129 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:942: REPLACE
                {
                mREPLACE(); 


                }
                break;
            case 130 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:950: RESTRICT
                {
                mRESTRICT(); 


                }
                break;
            case 131 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:959: ROLLBACK
                {
                mROLLBACK(); 


                }
                break;
            case 132 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:968: ROW
                {
                mROW(); 


                }
                break;
            case 133 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:972: SAVEPOINT
                {
                mSAVEPOINT(); 


                }
                break;
            case 134 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:982: SELECT
                {
                mSELECT(); 


                }
                break;
            case 135 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:989: SET
                {
                mSET(); 


                }
                break;
            case 136 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:993: TABLE
                {
                mTABLE(); 


                }
                break;
            case 137 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:999: TEMPORARY
                {
                mTEMPORARY(); 


                }
                break;
            case 138 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:1009: THEN
                {
                mTHEN(); 


                }
                break;
            case 139 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:1014: TO
                {
                mTO(); 


                }
                break;
            case 140 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:1017: TRANSACTION
                {
                mTRANSACTION(); 


                }
                break;
            case 141 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:1029: TRIGGER
                {
                mTRIGGER(); 


                }
                break;
            case 142 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:1037: UNION
                {
                mUNION(); 


                }
                break;
            case 143 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:1043: UNIQUE
                {
                mUNIQUE(); 


                }
                break;
            case 144 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:1050: UPDATE
                {
                mUPDATE(); 


                }
                break;
            case 145 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:1057: USING
                {
                mUSING(); 


                }
                break;
            case 146 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:1063: VACUUM
                {
                mVACUUM(); 


                }
                break;
            case 147 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:1070: VALUES
                {
                mVALUES(); 


                }
                break;
            case 148 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:1077: VIEW
                {
                mVIEW(); 


                }
                break;
            case 149 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:1082: VIRTUAL
                {
                mVIRTUAL(); 


                }
                break;
            case 150 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:1090: WHEN
                {
                mWHEN(); 


                }
                break;
            case 151 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:1095: WHERE
                {
                mWHERE(); 


                }
                break;
            case 152 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:1101: STRING
                {
                mSTRING(); 


                }
                break;
            case 153 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:1108: ID
                {
                mID(); 


                }
                break;
            case 154 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:1111: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 155 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:1119: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 156 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:1125: BLOB
                {
                mBLOB(); 


                }
                break;
            case 157 :
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:1:1130: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA19_eotS =
        "\5\uffff";
    static final String DFA19_eofS =
        "\5\uffff";
    static final String DFA19_minS =
        "\2\56\3\uffff";
    static final String DFA19_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA19_specialS =
        "\5\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "966:1: FLOAT : ( ( '0' .. '9' )+ DOT ( '0' .. '9' )* ( FLOAT_EXP )? | DOT ( '0' .. '9' )+ ( FLOAT_EXP )? | ( '0' .. '9' )+ FLOAT_EXP );";
        }
    }
    static final String DFA26_eotS =
        "\1\uffff\1\71\1\uffff\1\75\1\100\1\uffff\1\102\1\uffff\1\103\2\uffff"+
        "\1\104\3\uffff\1\105\7\uffff\1\107\1\111\1\112\1\113\1\uffff\1\114"+
        "\30\66\1\u0090\27\uffff\5\66\1\u0098\3\66\1\u009f\24\66\1\u00bc"+
        "\2\66\1\u00bf\1\u00c5\10\66\1\u00d0\1\u00d2\1\u00d3\14\66\1\u00ea"+
        "\7\66\2\uffff\1\66\1\u00f6\1\66\1\u00f8\2\66\1\u00fb\1\uffff\1\u00fc"+
        "\5\66\1\uffff\21\66\1\u0118\5\66\1\u011f\4\66\1\uffff\2\66\1\uffff"+
        "\5\66\1\uffff\2\66\1\u0130\5\66\1\u0136\1\66\1\uffff\1\66\2\uffff"+
        "\17\66\1\u0149\2\66\1\u014c\3\66\1\uffff\13\66\1\uffff\1\66\1\uffff"+
        "\2\66\2\uffff\6\66\1\u0166\1\u0167\15\66\1\u0175\2\66\1\u0178\1"+
        "\u0179\1\u017a\1\uffff\5\66\1\u0180\1\uffff\1\66\1\u0182\1\u0183"+
        "\12\66\1\u018e\1\66\1\u0190\1\uffff\1\u0191\1\u0192\3\66\1\uffff"+
        "\1\66\1\u0197\3\66\1\u019b\14\66\1\uffff\2\66\1\uffff\1\66\1\u01ab"+
        "\1\u01ad\10\66\1\u01b6\1\66\1\u01b8\1\66\1\u01ba\1\u01bb\1\u01bc"+
        "\4\66\1\u01c1\2\66\2\uffff\1\u01c4\6\66\1\u01cb\5\66\1\uffff\2\66"+
        "\3\uffff\5\66\1\uffff\1\66\2\uffff\1\u01d9\3\66\1\u01dd\1\66\1\u01e0"+
        "\3\66\1\uffff\1\66\3\uffff\1\u01e5\1\u01e6\2\66\1\uffff\1\66\1\u01ea"+
        "\1\u01eb\1\uffff\2\66\1\u01ee\1\u01ef\12\66\1\u01fa\1\uffff\1\66"+
        "\1\uffff\2\66\1\u01fe\2\66\1\u0201\2\66\1\uffff\1\66\1\uffff\1\u0205"+
        "\3\uffff\1\66\1\u0207\1\66\1\u0209\1\uffff\2\66\1\uffff\1\66\1\u020d"+
        "\1\u020e\2\66\1\u0211\1\uffff\4\66\1\u0217\1\u0218\1\66\1\u021a"+
        "\1\u021b\1\66\1\u021d\2\66\1\uffff\1\u0220\1\u0221\1\66\1\uffff"+
        "\2\66\1\uffff\1\u0225\2\66\1\u0228\2\uffff\2\66\1\u022b\2\uffff"+
        "\1\u022c\1\66\2\uffff\1\66\1\u022f\2\66\1\u0232\4\66\1\u0237\1\uffff"+
        "\3\66\1\uffff\1\u023b\1\u023c\1\uffff\1\u023d\1\u023e\1\66\1\uffff"+
        "\1\u0240\1\uffff\1\66\1\uffff\1\u0242\1\u0243\1\u0244\2\uffff\2"+
        "\66\1\uffff\2\66\1\u0249\2\66\2\uffff\1\66\2\uffff\1\66\1\uffff"+
        "\1\u024e\1\u024f\2\uffff\1\66\1\u0251\1\66\1\uffff\1\u0253\1\66"+
        "\1\uffff\1\u0255\1\u0256\2\uffff\1\u0257\1\66\1\uffff\1\u0259\1"+
        "\u025a\1\uffff\1\u025b\3\66\1\uffff\2\66\1\u0261\4\uffff\1\u0262"+
        "\1\uffff\1\66\3\uffff\1\u0264\2\66\1\u0268\1\uffff\1\66\1\u026a"+
        "\1\u026b\1\66\2\uffff\1\66\1\uffff\1\66\1\uffff\1\66\3\uffff\1\66"+
        "\3\uffff\1\u0271\1\u0272\3\66\2\uffff\1\66\1\uffff\3\66\1\uffff"+
        "\1\66\2\uffff\1\u027b\1\u027c\1\u027d\1\u027e\1\66\2\uffff\1\u0280"+
        "\1\u01ab\2\66\1\u0283\2\66\1\u0286\4\uffff\1\u0287\1\uffff\2\66"+
        "\1\uffff\2\66\2\uffff\1\u028c\1\66\1\u028e\1\u0290\1\uffff\1\u0291"+
        "\1\uffff\1\66\2\uffff\3\66\1\u0296\1\uffff";
    static final String DFA26_eofS =
        "\u0297\uffff";
    static final String DFA26_minS =
        "\1\11\1\75\1\uffff\1\74\1\75\1\uffff\1\174\1\uffff\1\55\2\uffff"+
        "\1\52\3\uffff\1\60\7\uffff\4\0\1\uffff\1\44\1\102\1\105\4\101\1"+
        "\114\1\101\1\106\1\117\2\105\2\101\1\106\1\114\1\125\3\101\1\116"+
        "\1\101\1\110\1\47\1\56\27\uffff\1\117\1\104\1\124\1\114\1\101\1"+
        "\44\2\124\1\106\1\44\1\123\1\105\1\114\1\105\1\122\1\124\1\106\1"+
        "\123\1\117\1\103\1\123\1\104\2\103\1\111\1\122\3\117\1\126\1\44"+
        "\1\116\1\115\2\44\1\111\1\131\1\106\1\113\3\124\1\114\3\44\1\124"+
        "\2\101\1\105\1\111\1\106\1\114\1\126\1\114\1\102\1\115\1\105\1\44"+
        "\1\101\1\111\1\104\1\111\1\103\2\105\2\uffff\1\122\1\44\1\105\1"+
        "\44\1\105\1\114\1\44\1\uffff\1\44\1\101\2\117\1\111\1\127\1\uffff"+
        "\2\103\1\114\1\115\1\106\1\101\1\123\1\122\2\101\1\105\1\103\1\101"+
        "\1\124\1\120\1\110\1\105\1\44\1\101\1\105\1\123\2\114\1\44\1\115"+
        "\1\102\1\125\1\111\1\uffff\1\117\1\105\1\uffff\1\105\1\124\3\105"+
        "\1\uffff\1\125\1\116\1\44\1\124\1\105\1\111\1\103\1\125\1\44\1\114"+
        "\1\uffff\1\123\2\uffff\2\105\1\116\1\107\1\115\1\122\1\123\2\105"+
        "\1\116\1\105\1\101\1\114\1\124\1\114\1\44\2\105\1\44\1\114\1\120"+
        "\1\116\1\uffff\1\116\1\107\1\117\1\101\1\116\2\125\1\127\1\124\1"+
        "\116\1\124\1\uffff\1\122\1\uffff\1\122\1\131\2\uffff\1\103\1\111"+
        "\1\122\1\116\1\105\1\101\2\44\1\113\1\101\1\115\1\111\1\114\2\124"+
        "\1\123\1\105\1\102\1\125\1\122\1\124\1\44\1\103\1\111\3\44\1\uffff"+
        "\2\120\1\125\1\124\1\101\1\44\1\uffff\1\111\2\44\1\120\1\116\1\122"+
        "\1\104\1\130\1\111\2\122\1\105\1\122\1\44\1\114\1\44\1\uffff\2\44"+
        "\1\124\1\110\1\122\1\uffff\1\125\1\44\1\105\2\122\1\44\1\115\1\101"+
        "\1\131\1\105\1\122\1\130\1\104\1\101\1\115\1\101\1\122\1\102\1\uffff"+
        "\1\120\1\103\1\uffff\1\105\2\44\1\123\1\107\1\116\1\125\1\124\1"+
        "\107\1\125\1\105\1\44\1\125\1\44\1\105\3\44\1\132\1\110\1\116\1"+
        "\105\1\44\1\105\1\104\2\uffff\1\44\1\124\1\116\1\124\1\111\1\122"+
        "\1\105\1\44\1\116\1\101\1\114\1\122\1\105\1\uffff\1\110\1\116\3"+
        "\uffff\1\105\1\124\2\123\1\111\1\uffff\1\107\2\uffff\1\44\1\107"+
        "\1\105\1\111\1\44\1\101\1\44\1\124\1\101\1\123\1\uffff\1\114\3\uffff"+
        "\2\44\1\101\1\114\1\uffff\1\124\2\44\1\uffff\1\101\1\122\2\44\1"+
        "\105\1\120\1\105\1\123\1\105\1\103\1\111\1\101\1\117\1\124\1\44"+
        "\1\uffff\1\122\1\uffff\1\101\1\105\1\44\2\105\1\44\1\115\1\123\1"+
        "\uffff\1\101\1\uffff\1\44\3\uffff\1\105\1\44\1\103\1\44\1\uffff"+
        "\1\116\1\105\1\uffff\1\105\2\44\1\103\1\101\1\44\1\uffff\1\124\1"+
        "\123\1\124\1\101\2\44\1\103\2\44\1\111\1\44\2\116\1\uffff\2\44\1"+
        "\101\1\uffff\1\104\1\114\1\uffff\1\44\1\104\1\105\1\44\2\uffff\2"+
        "\114\1\44\2\uffff\1\44\1\131\2\uffff\1\116\1\44\1\130\1\105\1\44"+
        "\1\105\2\103\1\111\1\44\1\uffff\1\101\1\103\1\122\1\uffff\2\44\1"+
        "\uffff\2\44\1\114\1\uffff\1\44\1\uffff\1\122\1\uffff\3\44\2\uffff"+
        "\1\124\1\111\1\uffff\1\137\1\105\1\44\1\102\1\104\2\uffff\1\124"+
        "\2\uffff\1\126\1\uffff\2\44\2\uffff\1\124\1\44\1\114\1\uffff\1\44"+
        "\1\103\1\uffff\2\44\2\uffff\1\44\1\103\1\uffff\2\44\1\uffff\1\44"+
        "\1\124\1\113\1\116\1\uffff\1\122\1\124\1\44\4\uffff\1\44\1\uffff"+
        "\1\105\3\uffff\1\44\1\116\1\104\1\44\1\uffff\1\114\2\44\1\105\2"+
        "\uffff\1\105\1\uffff\1\131\1\uffff\1\124\3\uffff\1\105\3\uffff\2"+
        "\44\1\124\1\131\1\111\2\uffff\1\115\1\uffff\1\124\1\111\1\101\1"+
        "\uffff\1\105\2\uffff\4\44\1\123\2\uffff\2\44\1\117\1\105\1\44\1"+
        "\115\1\124\1\44\4\uffff\1\44\1\uffff\2\116\1\uffff\2\105\2\uffff"+
        "\1\44\1\124\2\44\1\uffff\1\44\1\uffff\1\124\2\uffff\1\101\1\115"+
        "\1\120\1\44\1\uffff";
    static final String DFA26_maxS =
        "\1\176\1\75\1\uffff\2\76\1\uffff\1\174\1\uffff\1\55\2\uffff\1\52"+
        "\3\uffff\1\71\7\uffff\4\uffff\1\uffff\1\172\1\165\1\171\1\165\1"+
        "\162\1\170\2\162\1\141\1\163\1\157\1\145\1\151\1\141\2\165\1\162"+
        "\1\165\1\157\1\145\1\162\1\163\1\151\1\150\1\47\1\145\27\uffff\1"+
        "\157\1\144\2\164\1\144\1\172\3\164\1\172\1\163\1\145\1\156\1\157"+
        "\1\162\2\164\1\163\1\157\1\143\1\163\1\144\1\143\1\160\1\151\1\162"+
        "\3\157\1\166\1\172\1\156\1\155\2\172\1\151\1\171\1\146\1\155\3\164"+
        "\1\154\3\172\1\164\1\141\1\151\1\145\1\151\1\163\1\167\1\166\1\164"+
        "\1\142\1\155\1\145\1\172\2\151\1\144\1\151\1\154\1\162\1\145\2\uffff"+
        "\1\162\1\172\1\145\1\172\1\145\1\154\1\172\1\uffff\1\172\1\141\2"+
        "\157\1\151\1\167\1\uffff\1\164\1\143\1\165\1\155\1\163\1\141\1\163"+
        "\1\162\1\141\2\145\1\143\1\141\1\164\1\160\1\150\1\145\1\172\1\141"+
        "\1\154\1\163\2\154\1\172\1\155\1\142\1\165\1\151\1\uffff\1\157\1"+
        "\145\1\uffff\1\145\1\164\1\145\1\164\1\157\1\uffff\1\165\1\156\1"+
        "\172\1\164\1\145\1\151\1\143\1\165\1\172\1\154\1\uffff\1\163\2\uffff"+
        "\2\145\1\156\1\147\1\155\1\162\1\163\2\145\1\156\1\145\1\141\1\154"+
        "\1\164\1\154\1\172\2\145\1\172\1\154\1\160\1\156\1\uffff\1\156\1"+
        "\147\1\161\1\141\1\156\2\165\1\167\1\164\1\162\1\164\1\uffff\1\162"+
        "\1\uffff\1\162\1\171\2\uffff\1\143\1\151\1\162\1\156\1\145\1\141"+
        "\2\172\1\153\1\141\1\155\1\151\1\154\2\164\1\163\1\145\1\142\1\165"+
        "\1\162\1\164\1\172\1\143\1\151\3\172\1\uffff\2\160\1\165\1\164\1"+
        "\141\1\172\1\uffff\1\151\2\172\1\160\1\156\1\162\1\144\1\170\1\151"+
        "\2\162\1\145\1\162\1\172\1\154\1\172\1\uffff\2\172\1\164\1\150\1"+
        "\162\1\uffff\1\165\1\172\1\145\2\162\1\172\1\155\1\141\1\171\1\145"+
        "\1\162\1\170\1\144\1\141\1\155\1\141\1\162\1\142\1\uffff\1\160\1"+
        "\143\1\uffff\1\145\2\172\1\163\1\147\1\156\1\165\1\164\1\147\1\165"+
        "\1\145\1\172\1\165\1\172\1\145\4\172\1\150\1\156\1\145\1\172\1\145"+
        "\1\144\2\uffff\1\172\1\164\1\156\1\164\1\151\1\162\1\145\1\172\1"+
        "\156\1\141\1\154\1\162\1\145\1\uffff\1\150\1\156\3\uffff\1\145\1"+
        "\164\2\163\1\151\1\uffff\1\147\2\uffff\1\172\1\147\1\145\1\151\1"+
        "\172\1\141\1\172\1\164\1\141\1\163\1\uffff\1\154\3\uffff\2\172\1"+
        "\141\1\154\1\uffff\1\164\2\172\1\uffff\1\141\1\162\2\172\1\145\1"+
        "\160\1\145\1\163\1\145\1\143\1\151\1\141\1\157\1\164\1\172\1\uffff"+
        "\1\162\1\uffff\1\141\1\145\1\172\2\145\1\172\1\155\1\163\1\uffff"+
        "\1\141\1\uffff\1\172\3\uffff\1\145\1\172\1\143\1\172\1\uffff\1\156"+
        "\1\145\1\uffff\1\145\2\172\1\143\1\141\1\172\1\uffff\1\164\1\163"+
        "\1\164\1\145\2\172\1\143\2\172\1\151\1\172\2\156\1\uffff\2\172\1"+
        "\141\1\uffff\1\144\1\154\1\uffff\1\172\1\144\1\145\1\172\2\uffff"+
        "\2\154\1\172\2\uffff\1\172\1\171\2\uffff\1\156\1\172\1\170\1\145"+
        "\1\172\1\145\2\143\1\151\1\172\1\uffff\1\141\1\143\1\162\1\uffff"+
        "\2\172\1\uffff\2\172\1\154\1\uffff\1\172\1\uffff\1\162\1\uffff\3"+
        "\172\2\uffff\1\164\1\151\1\uffff\1\137\1\145\1\172\1\142\1\144\2"+
        "\uffff\1\164\2\uffff\1\166\1\uffff\2\172\2\uffff\1\164\1\172\1\154"+
        "\1\uffff\1\172\1\143\1\uffff\2\172\2\uffff\1\172\1\143\1\uffff\2"+
        "\172\1\uffff\1\172\1\164\1\153\1\156\1\uffff\1\162\1\164\1\172\4"+
        "\uffff\1\172\1\uffff\1\145\3\uffff\1\172\1\156\1\164\1\172\1\uffff"+
        "\1\154\2\172\1\145\2\uffff\1\145\1\uffff\1\171\1\uffff\1\164\3\uffff"+
        "\1\145\3\uffff\2\172\1\164\1\171\1\151\2\uffff\1\155\1\uffff\1\164"+
        "\1\151\1\141\1\uffff\1\145\2\uffff\4\172\1\163\2\uffff\2\172\1\157"+
        "\1\145\1\172\1\155\1\164\1\172\4\uffff\1\172\1\uffff\2\156\1\uffff"+
        "\2\145\2\uffff\1\172\1\164\2\172\1\uffff\1\172\1\uffff\1\164\2\uffff"+
        "\1\141\1\155\1\160\1\172\1\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\3\2\uffff\1\13\1\uffff\1\16\1\uffff\1\20\1\21\1\uffff"+
        "\1\23\1\24\1\25\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\4\uffff"+
        "\1\42\32\uffff\1\u0099\1\u009d\1\2\1\1\1\4\1\6\1\11\1\5\1\10\1\12"+
        "\1\7\1\15\1\14\1\17\1\22\1\26\1\u009b\1\36\1\u0098\1\37\1\40\1\41"+
        "\1\43\102\uffff\1\u009c\1\u009a\7\uffff\1\53\6\uffff\1\62\34\uffff"+
        "\1\131\2\uffff\1\134\5\uffff\1\145\12\uffff\1\161\1\uffff\1\163"+
        "\1\164\26\uffff\1\u008b\13\uffff\1\45\1\uffff\1\47\2\uffff\1\52"+
        "\1\54\33\uffff\1\114\6\uffff\1\123\20\uffff\1\150\5\uffff\1\156"+
        "\22\uffff\1\u0084\2\uffff\1\u0087\31\uffff\1\64\1\65\15\uffff\1"+
        "\106\2\uffff\1\111\1\112\1\113\5\uffff\1\122\1\uffff\1\125\1\126"+
        "\12\uffff\1\144\1\uffff\1\147\1\151\1\152\4\uffff\1\160\3\uffff"+
        "\1\167\17\uffff\1\u0089\1\uffff\1\u008a\10\uffff\1\u0094\1\uffff"+
        "\1\u0096\1\uffff\1\44\1\46\1\50\4\uffff\1\60\2\uffff\1\66\6\uffff"+
        "\1\75\15\uffff\1\127\3\uffff\1\135\2\uffff\1\140\4\uffff\1\153\1"+
        "\154\3\uffff\1\165\1\166\2\uffff\1\172\1\173\12\uffff\1\u0088\3"+
        "\uffff\1\u008e\2\uffff\1\u0091\3\uffff\1\u0097\1\uffff\1\55\1\uffff"+
        "\1\57\3\uffff\1\70\1\71\2\uffff\1\74\5\uffff\1\105\1\107\1\uffff"+
        "\1\115\1\116\1\uffff\1\120\2\uffff\1\130\1\132\3\uffff\1\141\2\uffff"+
        "\1\146\2\uffff\1\162\1\170\2\uffff\1\175\2\uffff\1\u0080\4\uffff"+
        "\1\u0086\3\uffff\1\u008f\1\u0090\1\u0092\1\u0093\1\uffff\1\51\1"+
        "\uffff\1\61\1\63\1\67\4\uffff\1\102\4\uffff\1\121\1\124\1\uffff"+
        "\1\136\1\uffff\1\142\1\uffff\1\155\1\157\1\171\1\uffff\1\176\1\177"+
        "\1\u0081\5\uffff\1\u008d\1\u0095\1\uffff\1\72\3\uffff\1\101\1\uffff"+
        "\1\104\1\110\5\uffff\1\u0082\1\u0083\10\uffff\1\117\1\133\1\137"+
        "\1\143\1\uffff\1\u0085\2\uffff\1\73\2\uffff\1\103\1\174\4\uffff"+
        "\1\u008c\1\uffff\1\76\1\uffff\1\77\1\56\4\uffff\1\100";
    static final String DFA26_specialS =
        "\27\uffff\1\0\1\1\1\2\1\3\u027c\uffff}>";
    static final String[] DFA26_transitionS = {
            "\2\67\1\uffff\2\67\22\uffff\1\67\1\2\1\27\1\uffff\1\26\1\15"+
            "\1\5\1\30\1\21\1\22\1\12\1\7\1\20\1\10\1\17\1\13\12\65\1\24"+
            "\1\16\1\3\1\1\1\4\1\23\1\25\1\35\1\36\1\37\1\40\1\41\1\42\1"+
            "\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1"+
            "\57\1\60\1\61\1\62\1\63\1\64\2\66\1\32\1\14\1\33\1\uffff\1\34"+
            "\1\31\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
            "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63"+
            "\1\64\2\66\1\uffff\1\6\1\uffff\1\11",
            "\1\70",
            "",
            "\1\74\1\73\1\72",
            "\1\76\1\77",
            "",
            "\1\101",
            "",
            "\1\67",
            "",
            "",
            "\1\67",
            "",
            "",
            "",
            "\12\106",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\110",
            "\0\110",
            "\0\66",
            "\133\66\1\uffff\uffa4\66",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\115\1\uffff\1\116\1\uffff\1\117\5\uffff\1\120\1\uffff\1"+
            "\121\4\uffff\1\122\1\123\1\124\14\uffff\1\115\1\uffff\1\116"+
            "\1\uffff\1\117\5\uffff\1\120\1\uffff\1\121\4\uffff\1\122\1\123"+
            "\1\124",
            "\1\125\23\uffff\1\126\13\uffff\1\125\23\uffff\1\126",
            "\1\127\6\uffff\1\130\6\uffff\1\131\2\uffff\1\132\2\uffff\1"+
            "\133\13\uffff\1\127\6\uffff\1\130\6\uffff\1\131\2\uffff\1\132"+
            "\2\uffff\1\133",
            "\1\134\3\uffff\1\135\3\uffff\1\136\10\uffff\1\137\16\uffff"+
            "\1\134\3\uffff\1\135\3\uffff\1\136\10\uffff\1\137",
            "\1\140\12\uffff\1\141\1\uffff\1\142\4\uffff\1\143\4\uffff\1"+
            "\144\10\uffff\1\140\12\uffff\1\141\1\uffff\1\142\4\uffff\1\143"+
            "\4\uffff\1\144",
            "\1\145\15\uffff\1\146\2\uffff\1\147\16\uffff\1\145\15\uffff"+
            "\1\146\2\uffff\1\147",
            "\1\150\5\uffff\1\151\31\uffff\1\150\5\uffff\1\151",
            "\1\152\37\uffff\1\152",
            "\1\153\1\154\5\uffff\1\155\1\156\4\uffff\1\157\22\uffff\1\153"+
            "\1\154\5\uffff\1\155\1\156\4\uffff\1\157",
            "\1\160\37\uffff\1\160",
            "\1\161\37\uffff\1\161",
            "\1\162\3\uffff\1\163\33\uffff\1\162\3\uffff\1\163",
            "\1\164\37\uffff\1\164",
            "\1\165\15\uffff\1\166\5\uffff\1\167\13\uffff\1\165\15\uffff"+
            "\1\166\5\uffff\1\167",
            "\1\170\7\uffff\1\171\3\uffff\1\172\2\uffff\1\173\20\uffff\1"+
            "\170\7\uffff\1\171\3\uffff\1\172\2\uffff\1\173",
            "\1\174\5\uffff\1\175\31\uffff\1\174\5\uffff\1\175",
            "\1\176\37\uffff\1\176",
            "\1\177\3\uffff\1\u0080\11\uffff\1\u0081\21\uffff\1\177\3\uffff"+
            "\1\u0080\11\uffff\1\u0081",
            "\1\u0082\3\uffff\1\u0083\33\uffff\1\u0082\3\uffff\1\u0083",
            "\1\u0084\3\uffff\1\u0085\2\uffff\1\u0086\6\uffff\1\u0087\2"+
            "\uffff\1\u0088\16\uffff\1\u0084\3\uffff\1\u0085\2\uffff\1\u0086"+
            "\6\uffff\1\u0087\2\uffff\1\u0088",
            "\1\u0089\1\uffff\1\u008a\2\uffff\1\u008b\32\uffff\1\u0089\1"+
            "\uffff\1\u008a\2\uffff\1\u008b",
            "\1\u008c\7\uffff\1\u008d\27\uffff\1\u008c\7\uffff\1\u008d",
            "\1\u008e\37\uffff\1\u008e",
            "\1\u008f",
            "\1\106\1\uffff\12\65\13\uffff\1\106\37\uffff\1\106",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0091\37\uffff\1\u0091",
            "\1\u0092\37\uffff\1\u0092",
            "\1\u0093\37\uffff\1\u0093",
            "\1\u0094\7\uffff\1\u0095\27\uffff\1\u0094\7\uffff\1\u0095",
            "\1\u0096\2\uffff\1\u0097\34\uffff\1\u0096\2\uffff\1\u0097",
            "\1\66\13\uffff\12\66\7\uffff\2\66\1\u0099\27\66\4\uffff\1\66"+
            "\1\uffff\2\66\1\u0099\27\66",
            "\1\u009a\37\uffff\1\u009a",
            "\1\u009b\37\uffff\1\u009b",
            "\1\u009c\1\u009d\14\uffff\1\u009e\21\uffff\1\u009c\1\u009d"+
            "\14\uffff\1\u009e",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u00a0\37\uffff\1\u00a0",
            "\1\u00a1\37\uffff\1\u00a1",
            "\1\u00a2\1\u00a3\1\u00a4\35\uffff\1\u00a2\1\u00a3\1\u00a4",
            "\1\u00a5\11\uffff\1\u00a6\25\uffff\1\u00a5\11\uffff\1\u00a6",
            "\1\u00a7\37\uffff\1\u00a7",
            "\1\u00a8\37\uffff\1\u00a8",
            "\1\u00a9\5\uffff\1\u00aa\6\uffff\1\u00ab\1\u00ac\21\uffff\1"+
            "\u00a9\5\uffff\1\u00aa\6\uffff\1\u00ab\1\u00ac",
            "\1\u00ad\37\uffff\1\u00ad",
            "\1\u00ae\37\uffff\1\u00ae",
            "\1\u00af\37\uffff\1\u00af",
            "\1\u00b0\37\uffff\1\u00b0",
            "\1\u00b1\37\uffff\1\u00b1",
            "\1\u00b2\37\uffff\1\u00b2",
            "\1\u00b3\5\uffff\1\u00b4\6\uffff\1\u00b5\22\uffff\1\u00b3\5"+
            "\uffff\1\u00b4\6\uffff\1\u00b5",
            "\1\u00b6\37\uffff\1\u00b6",
            "\1\u00b7\37\uffff\1\u00b7",
            "\1\u00b8\37\uffff\1\u00b8",
            "\1\u00b9\37\uffff\1\u00b9",
            "\1\u00ba\37\uffff\1\u00ba",
            "\1\u00bb\37\uffff\1\u00bb",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u00bd\37\uffff\1\u00bd",
            "\1\u00be\37\uffff\1\u00be",
            "\1\66\13\uffff\12\66\7\uffff\3\66\1\u00c0\4\66\1\u00c1\4\66"+
            "\1\u00c2\4\66\1\u00c3\1\u00c4\6\66\4\uffff\1\66\1\uffff\3\66"+
            "\1\u00c0\4\66\1\u00c1\4\66\1\u00c2\4\66\1\u00c3\1\u00c4\6\66",
            "\1\66\13\uffff\12\66\7\uffff\15\66\1\u00c6\14\66\4\uffff\1"+
            "\66\1\uffff\15\66\1\u00c6\14\66",
            "\1\u00c7\37\uffff\1\u00c7",
            "\1\u00c8\37\uffff\1\u00c8",
            "\1\u00c9\37\uffff\1\u00c9",
            "\1\u00ca\1\uffff\1\u00cb\35\uffff\1\u00ca\1\uffff\1\u00cb",
            "\1\u00cc\37\uffff\1\u00cc",
            "\1\u00cd\37\uffff\1\u00cd",
            "\1\u00ce\37\uffff\1\u00ce",
            "\1\u00cf\37\uffff\1\u00cf",
            "\1\66\13\uffff\12\66\7\uffff\5\66\1\u00d1\24\66\4\uffff\1\66"+
            "\1\uffff\5\66\1\u00d1\24\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\3\66\1\u00d4\26\66\4\uffff\1\66"+
            "\1\uffff\3\66\1\u00d4\26\66",
            "\1\u00d5\37\uffff\1\u00d5",
            "\1\u00d6\37\uffff\1\u00d6",
            "\1\u00d7\7\uffff\1\u00d8\27\uffff\1\u00d7\7\uffff\1\u00d8",
            "\1\u00d9\37\uffff\1\u00d9",
            "\1\u00da\37\uffff\1\u00da",
            "\1\u00db\1\u00dc\1\uffff\1\u00dd\2\uffff\1\u00de\1\uffff\1"+
            "\u00df\1\uffff\1\u00e0\2\uffff\1\u00e1\22\uffff\1\u00db\1\u00dc"+
            "\1\uffff\1\u00dd\2\uffff\1\u00de\1\uffff\1\u00df\1\uffff\1\u00e0"+
            "\2\uffff\1\u00e1",
            "\1\u00e2\12\uffff\1\u00e3\24\uffff\1\u00e2\12\uffff\1\u00e3",
            "\1\u00e4\37\uffff\1\u00e4",
            "\1\u00e5\7\uffff\1\u00e6\27\uffff\1\u00e5\7\uffff\1\u00e6",
            "\1\u00e7\37\uffff\1\u00e7",
            "\1\u00e8\37\uffff\1\u00e8",
            "\1\u00e9\37\uffff\1\u00e9",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u00eb\7\uffff\1\u00ec\27\uffff\1\u00eb\7\uffff\1\u00ec",
            "\1\u00ed\37\uffff\1\u00ed",
            "\1\u00ee\37\uffff\1\u00ee",
            "\1\u00ef\37\uffff\1\u00ef",
            "\1\u00f0\10\uffff\1\u00f1\26\uffff\1\u00f0\10\uffff\1\u00f1",
            "\1\u00f2\14\uffff\1\u00f3\22\uffff\1\u00f2\14\uffff\1\u00f3",
            "\1\u00f4\37\uffff\1\u00f4",
            "",
            "",
            "\1\u00f5\37\uffff\1\u00f5",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u00f7\37\uffff\1\u00f7",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u00f9\37\uffff\1\u00f9",
            "\1\u00fa\37\uffff\1\u00fa",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u00fd\37\uffff\1\u00fd",
            "\1\u00fe\37\uffff\1\u00fe",
            "\1\u00ff\37\uffff\1\u00ff",
            "\1\u0100\37\uffff\1\u0100",
            "\1\u0101\37\uffff\1\u0101",
            "",
            "\1\u0102\1\uffff\1\u0103\16\uffff\1\u0104\16\uffff\1\u0102"+
            "\1\uffff\1\u0103\16\uffff\1\u0104",
            "\1\u0105\37\uffff\1\u0105",
            "\1\u0106\10\uffff\1\u0107\26\uffff\1\u0106\10\uffff\1\u0107",
            "\1\u0108\37\uffff\1\u0108",
            "\1\u0109\14\uffff\1\u010a\22\uffff\1\u0109\14\uffff\1\u010a",
            "\1\u010b\37\uffff\1\u010b",
            "\1\u010c\37\uffff\1\u010c",
            "\1\u010d\37\uffff\1\u010d",
            "\1\u010e\37\uffff\1\u010e",
            "\1\u010f\3\uffff\1\u0110\33\uffff\1\u010f\3\uffff\1\u0110",
            "\1\u0111\37\uffff\1\u0111",
            "\1\u0112\37\uffff\1\u0112",
            "\1\u0113\37\uffff\1\u0113",
            "\1\u0114\37\uffff\1\u0114",
            "\1\u0115\37\uffff\1\u0115",
            "\1\u0116\37\uffff\1\u0116",
            "\1\u0117\37\uffff\1\u0117",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0119\37\uffff\1\u0119",
            "\1\u011a\6\uffff\1\u011b\30\uffff\1\u011a\6\uffff\1\u011b",
            "\1\u011c\37\uffff\1\u011c",
            "\1\u011d\37\uffff\1\u011d",
            "\1\u011e\37\uffff\1\u011e",
            "\1\66\13\uffff\12\66\7\uffff\4\66\1\u0120\25\66\4\uffff\1\66"+
            "\1\uffff\4\66\1\u0120\25\66",
            "\1\u0121\37\uffff\1\u0121",
            "\1\u0122\37\uffff\1\u0122",
            "\1\u0123\37\uffff\1\u0123",
            "\1\u0124\37\uffff\1\u0124",
            "",
            "\1\u0125\37\uffff\1\u0125",
            "\1\u0126\37\uffff\1\u0126",
            "",
            "\1\u0127\37\uffff\1\u0127",
            "\1\u0128\37\uffff\1\u0128",
            "\1\u0129\37\uffff\1\u0129",
            "\1\u012a\16\uffff\1\u012b\20\uffff\1\u012a\16\uffff\1\u012b",
            "\1\u012c\11\uffff\1\u012d\25\uffff\1\u012c\11\uffff\1\u012d",
            "",
            "\1\u012e\37\uffff\1\u012e",
            "\1\u012f\37\uffff\1\u012f",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0131\37\uffff\1\u0131",
            "\1\u0132\37\uffff\1\u0132",
            "\1\u0133\37\uffff\1\u0133",
            "\1\u0134\37\uffff\1\u0134",
            "\1\u0135\37\uffff\1\u0135",
            "\1\66\13\uffff\12\66\7\uffff\15\66\1\u0137\14\66\4\uffff\1"+
            "\66\1\uffff\15\66\1\u0137\14\66",
            "\1\u0138\37\uffff\1\u0138",
            "",
            "\1\u0139\37\uffff\1\u0139",
            "",
            "",
            "\1\u013a\37\uffff\1\u013a",
            "\1\u013b\37\uffff\1\u013b",
            "\1\u013c\37\uffff\1\u013c",
            "\1\u013d\37\uffff\1\u013d",
            "\1\u013e\37\uffff\1\u013e",
            "\1\u013f\37\uffff\1\u013f",
            "\1\u0140\37\uffff\1\u0140",
            "\1\u0141\37\uffff\1\u0141",
            "\1\u0142\37\uffff\1\u0142",
            "\1\u0143\37\uffff\1\u0143",
            "\1\u0144\37\uffff\1\u0144",
            "\1\u0145\37\uffff\1\u0145",
            "\1\u0146\37\uffff\1\u0146",
            "\1\u0147\37\uffff\1\u0147",
            "\1\u0148\37\uffff\1\u0148",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u014a\37\uffff\1\u014a",
            "\1\u014b\37\uffff\1\u014b",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u014d\37\uffff\1\u014d",
            "\1\u014e\37\uffff\1\u014e",
            "\1\u014f\37\uffff\1\u014f",
            "",
            "\1\u0150\37\uffff\1\u0150",
            "\1\u0151\37\uffff\1\u0151",
            "\1\u0152\1\uffff\1\u0153\35\uffff\1\u0152\1\uffff\1\u0153",
            "\1\u0154\37\uffff\1\u0154",
            "\1\u0155\37\uffff\1\u0155",
            "\1\u0156\37\uffff\1\u0156",
            "\1\u0157\37\uffff\1\u0157",
            "\1\u0158\37\uffff\1\u0158",
            "\1\u0159\37\uffff\1\u0159",
            "\1\u015a\3\uffff\1\u015b\33\uffff\1\u015a\3\uffff\1\u015b",
            "\1\u015c\37\uffff\1\u015c",
            "",
            "\1\u015d\37\uffff\1\u015d",
            "",
            "\1\u015e\37\uffff\1\u015e",
            "\1\u015f\37\uffff\1\u015f",
            "",
            "",
            "\1\u0160\37\uffff\1\u0160",
            "\1\u0161\37\uffff\1\u0161",
            "\1\u0162\37\uffff\1\u0162",
            "\1\u0163\37\uffff\1\u0163",
            "\1\u0164\37\uffff\1\u0164",
            "\1\u0165\37\uffff\1\u0165",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0168\37\uffff\1\u0168",
            "\1\u0169\37\uffff\1\u0169",
            "\1\u016a\37\uffff\1\u016a",
            "\1\u016b\37\uffff\1\u016b",
            "\1\u016c\37\uffff\1\u016c",
            "\1\u016d\37\uffff\1\u016d",
            "\1\u016e\37\uffff\1\u016e",
            "\1\u016f\37\uffff\1\u016f",
            "\1\u0170\37\uffff\1\u0170",
            "\1\u0171\37\uffff\1\u0171",
            "\1\u0172\37\uffff\1\u0172",
            "\1\u0173\37\uffff\1\u0173",
            "\1\u0174\37\uffff\1\u0174",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0176\37\uffff\1\u0176",
            "\1\u0177\37\uffff\1\u0177",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\u017b\37\uffff\1\u017b",
            "\1\u017c\37\uffff\1\u017c",
            "\1\u017d\37\uffff\1\u017d",
            "\1\u017e\37\uffff\1\u017e",
            "\1\u017f\37\uffff\1\u017f",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\u0181\37\uffff\1\u0181",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0184\37\uffff\1\u0184",
            "\1\u0185\37\uffff\1\u0185",
            "\1\u0186\37\uffff\1\u0186",
            "\1\u0187\37\uffff\1\u0187",
            "\1\u0188\37\uffff\1\u0188",
            "\1\u0189\37\uffff\1\u0189",
            "\1\u018a\37\uffff\1\u018a",
            "\1\u018b\37\uffff\1\u018b",
            "\1\u018c\37\uffff\1\u018c",
            "\1\u018d\37\uffff\1\u018d",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u018f\37\uffff\1\u018f",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0193\37\uffff\1\u0193",
            "\1\u0194\37\uffff\1\u0194",
            "\1\u0195\37\uffff\1\u0195",
            "",
            "\1\u0196\37\uffff\1\u0196",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0198\37\uffff\1\u0198",
            "\1\u0199\37\uffff\1\u0199",
            "\1\u019a\37\uffff\1\u019a",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u019c\37\uffff\1\u019c",
            "\1\u019d\37\uffff\1\u019d",
            "\1\u019e\37\uffff\1\u019e",
            "\1\u019f\37\uffff\1\u019f",
            "\1\u01a0\37\uffff\1\u01a0",
            "\1\u01a1\37\uffff\1\u01a1",
            "\1\u01a2\37\uffff\1\u01a2",
            "\1\u01a3\37\uffff\1\u01a3",
            "\1\u01a4\37\uffff\1\u01a4",
            "\1\u01a5\37\uffff\1\u01a5",
            "\1\u01a6\37\uffff\1\u01a6",
            "\1\u01a7\37\uffff\1\u01a7",
            "",
            "\1\u01a8\37\uffff\1\u01a8",
            "\1\u01a9\37\uffff\1\u01a9",
            "",
            "\1\u01aa\37\uffff\1\u01aa",
            "\1\66\13\uffff\12\66\7\uffff\16\66\1\u01ac\13\66\4\uffff\1"+
            "\66\1\uffff\16\66\1\u01ac\13\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u01ae\37\uffff\1\u01ae",
            "\1\u01af\37\uffff\1\u01af",
            "\1\u01b0\37\uffff\1\u01b0",
            "\1\u01b1\37\uffff\1\u01b1",
            "\1\u01b2\37\uffff\1\u01b2",
            "\1\u01b3\37\uffff\1\u01b3",
            "\1\u01b4\37\uffff\1\u01b4",
            "\1\u01b5\37\uffff\1\u01b5",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u01b7\37\uffff\1\u01b7",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u01b9\37\uffff\1\u01b9",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u01bd\37\uffff\1\u01bd",
            "\1\u01be\37\uffff\1\u01be",
            "\1\u01bf\37\uffff\1\u01bf",
            "\1\u01c0\37\uffff\1\u01c0",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u01c2\37\uffff\1\u01c2",
            "\1\u01c3\37\uffff\1\u01c3",
            "",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u01c5\37\uffff\1\u01c5",
            "\1\u01c6\37\uffff\1\u01c6",
            "\1\u01c7\37\uffff\1\u01c7",
            "\1\u01c8\37\uffff\1\u01c8",
            "\1\u01c9\37\uffff\1\u01c9",
            "\1\u01ca\37\uffff\1\u01ca",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u01cc\37\uffff\1\u01cc",
            "\1\u01cd\37\uffff\1\u01cd",
            "\1\u01ce\37\uffff\1\u01ce",
            "\1\u01cf\37\uffff\1\u01cf",
            "\1\u01d0\37\uffff\1\u01d0",
            "",
            "\1\u01d1\37\uffff\1\u01d1",
            "\1\u01d2\37\uffff\1\u01d2",
            "",
            "",
            "",
            "\1\u01d3\37\uffff\1\u01d3",
            "\1\u01d4\37\uffff\1\u01d4",
            "\1\u01d5\37\uffff\1\u01d5",
            "\1\u01d6\37\uffff\1\u01d6",
            "\1\u01d7\37\uffff\1\u01d7",
            "",
            "\1\u01d8\37\uffff\1\u01d8",
            "",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u01da\37\uffff\1\u01da",
            "\1\u01db\37\uffff\1\u01db",
            "\1\u01dc\37\uffff\1\u01dc",
            "\1\66\13\uffff\12\66\7\uffff\4\66\1\u01de\25\66\4\uffff\1\66"+
            "\1\uffff\4\66\1\u01de\25\66",
            "\1\u01df\37\uffff\1\u01df",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u01e1\37\uffff\1\u01e1",
            "\1\u01e2\37\uffff\1\u01e2",
            "\1\u01e3\37\uffff\1\u01e3",
            "",
            "\1\u01e4\37\uffff\1\u01e4",
            "",
            "",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u01e7\37\uffff\1\u01e7",
            "\1\u01e8\37\uffff\1\u01e8",
            "",
            "\1\u01e9\37\uffff\1\u01e9",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\u01ec\37\uffff\1\u01ec",
            "\1\u01ed\37\uffff\1\u01ed",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u01f0\37\uffff\1\u01f0",
            "\1\u01f1\37\uffff\1\u01f1",
            "\1\u01f2\37\uffff\1\u01f2",
            "\1\u01f3\37\uffff\1\u01f3",
            "\1\u01f4\37\uffff\1\u01f4",
            "\1\u01f5\37\uffff\1\u01f5",
            "\1\u01f6\37\uffff\1\u01f6",
            "\1\u01f7\37\uffff\1\u01f7",
            "\1\u01f8\37\uffff\1\u01f8",
            "\1\u01f9\37\uffff\1\u01f9",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\u01fb\37\uffff\1\u01fb",
            "",
            "\1\u01fc\37\uffff\1\u01fc",
            "\1\u01fd\37\uffff\1\u01fd",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u01ff\37\uffff\1\u01ff",
            "\1\u0200\37\uffff\1\u0200",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0202\37\uffff\1\u0202",
            "\1\u0203\37\uffff\1\u0203",
            "",
            "\1\u0204\37\uffff\1\u0204",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "",
            "",
            "\1\u0206\37\uffff\1\u0206",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0208\37\uffff\1\u0208",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\u020a\37\uffff\1\u020a",
            "\1\u020b\37\uffff\1\u020b",
            "",
            "\1\u020c\37\uffff\1\u020c",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u020f\37\uffff\1\u020f",
            "\1\u0210\37\uffff\1\u0210",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\u0212\37\uffff\1\u0212",
            "\1\u0213\37\uffff\1\u0213",
            "\1\u0214\37\uffff\1\u0214",
            "\1\u0215\3\uffff\1\u0216\33\uffff\1\u0215\3\uffff\1\u0216",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0219\37\uffff\1\u0219",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u021c\37\uffff\1\u021c",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u021e\37\uffff\1\u021e",
            "\1\u021f\37\uffff\1\u021f",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0222\37\uffff\1\u0222",
            "",
            "\1\u0223\37\uffff\1\u0223",
            "\1\u0224\37\uffff\1\u0224",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0226\37\uffff\1\u0226",
            "\1\u0227\37\uffff\1\u0227",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "",
            "\1\u0229\37\uffff\1\u0229",
            "\1\u022a\37\uffff\1\u022a",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u022d\37\uffff\1\u022d",
            "",
            "",
            "\1\u022e\37\uffff\1\u022e",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0230\37\uffff\1\u0230",
            "\1\u0231\37\uffff\1\u0231",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0233\37\uffff\1\u0233",
            "\1\u0234\37\uffff\1\u0234",
            "\1\u0235\37\uffff\1\u0235",
            "\1\u0236\37\uffff\1\u0236",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\u0238\37\uffff\1\u0238",
            "\1\u0239\37\uffff\1\u0239",
            "\1\u023a\37\uffff\1\u023a",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u023f\37\uffff\1\u023f",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\u0241\37\uffff\1\u0241",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "",
            "\1\u0245\37\uffff\1\u0245",
            "\1\u0246\37\uffff\1\u0246",
            "",
            "\1\u0247",
            "\1\u0248\37\uffff\1\u0248",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u024a\37\uffff\1\u024a",
            "\1\u024b\37\uffff\1\u024b",
            "",
            "",
            "\1\u024c\37\uffff\1\u024c",
            "",
            "",
            "\1\u024d\37\uffff\1\u024d",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "",
            "\1\u0250\37\uffff\1\u0250",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0252\37\uffff\1\u0252",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0254\37\uffff\1\u0254",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0258\37\uffff\1\u0258",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u025c\37\uffff\1\u025c",
            "\1\u025d\37\uffff\1\u025d",
            "\1\u025e\37\uffff\1\u025e",
            "",
            "\1\u025f\37\uffff\1\u025f",
            "\1\u0260\37\uffff\1\u0260",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "",
            "",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\u0263\37\uffff\1\u0263",
            "",
            "",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0265\37\uffff\1\u0265",
            "\1\u0267\17\uffff\1\u0266\17\uffff\1\u0267\17\uffff\1\u0266",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\u0269\37\uffff\1\u0269",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u026c\37\uffff\1\u026c",
            "",
            "",
            "\1\u026d\37\uffff\1\u026d",
            "",
            "\1\u026e\37\uffff\1\u026e",
            "",
            "\1\u026f\37\uffff\1\u026f",
            "",
            "",
            "",
            "\1\u0270\37\uffff\1\u0270",
            "",
            "",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0273\37\uffff\1\u0273",
            "\1\u0274\37\uffff\1\u0274",
            "\1\u0275\37\uffff\1\u0275",
            "",
            "",
            "\1\u0276\37\uffff\1\u0276",
            "",
            "\1\u0277\37\uffff\1\u0277",
            "\1\u0278\37\uffff\1\u0278",
            "\1\u0279\37\uffff\1\u0279",
            "",
            "\1\u027a\37\uffff\1\u027a",
            "",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u027f\37\uffff\1\u027f",
            "",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0281\37\uffff\1\u0281",
            "\1\u0282\37\uffff\1\u0282",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0284\37\uffff\1\u0284",
            "\1\u0285\37\uffff\1\u0285",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "",
            "",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\u0288\37\uffff\1\u0288",
            "\1\u0289\37\uffff\1\u0289",
            "",
            "\1\u028a\37\uffff\1\u028a",
            "\1\u028b\37\uffff\1\u028b",
            "",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u028d\37\uffff\1\u028d",
            "\1\66\13\uffff\12\66\7\uffff\22\66\1\u028f\7\66\4\uffff\1\66"+
            "\1\uffff\22\66\1\u028f\7\66",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "",
            "\1\u0292\37\uffff\1\u0292",
            "",
            "",
            "\1\u0293\37\uffff\1\u0293",
            "\1\u0294\37\uffff\1\u0294",
            "\1\u0295\37\uffff\1\u0295",
            "\1\66\13\uffff\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 | LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ | SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE | DOUBLE_PIPE | PLUS | MINUS | TILDA | ASTERISK | SLASH | BACKSLASH | PERCENT | SEMI | DOT | COMMA | LPAREN | RPAREN | QUESTION | COLON | AT | DOLLAR | QUOTE_DOUBLE | QUOTE_SINGLE | APOSTROPHE | LPAREN_SQUARE | RPAREN_SQUARE | UNDERSCORE | ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE | STRING | ID | INTEGER | FLOAT | BLOB | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_23 = input.LA(1);

                        s = -1;
                        if ( ((LA26_23 >= '\u0000' && LA26_23 <= '\uFFFF')) ) {s = 72;}

                        else s = 71;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_24 = input.LA(1);

                        s = -1;
                        if ( ((LA26_24 >= '\u0000' && LA26_24 <= '\uFFFF')) ) {s = 72;}

                        else s = 73;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_25 = input.LA(1);

                        s = -1;
                        if ( ((LA26_25 >= '\u0000' && LA26_25 <= '\uFFFF')) ) {s = 54;}

                        else s = 74;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_26 = input.LA(1);

                        s = -1;
                        if ( ((LA26_26 >= '\u0000' && LA26_26 <= 'Z')||(LA26_26 >= '\\' && LA26_26 <= '\uFFFF')) ) {s = 54;}

                        else s = 75;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}