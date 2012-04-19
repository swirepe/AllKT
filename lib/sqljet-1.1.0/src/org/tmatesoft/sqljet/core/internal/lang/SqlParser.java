// $ANTLR 3.4 /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g 2012-03-28 18:28:06

  package org.tmatesoft.sqljet.core.internal.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ABORT", "ADD", "AFTER", "ALIAS", "ALL", "ALTER", "AMPERSAND", "ANALYZE", "AND", "APOSTROPHE", "AS", "ASC", "ASTERISK", "AT", "ATTACH", "AUTOINCREMENT", "B", "BACKSLASH", "BEFORE", "BEGIN", "BETWEEN", "BIND", "BIND_NAME", "BLOB", "BLOB_LITERAL", "BY", "C", "CASCADE", "CASE", "CAST", "CHECK", "COLLATE", "COLON", "COLUMN", "COLUMNS", "COLUMN_CONSTRAINT", "COLUMN_EXPRESSION", "COMMA", "COMMENT", "COMMIT", "CONFLICT", "CONSTRAINT", "CONSTRAINTS", "CREATE", "CREATE_INDEX", "CREATE_TABLE", "CREATE_TRIGGER", "CREATE_VIEW", "CROSS", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "D", "DATABASE", "DEFAULT", "DEFERRABLE", "DEFERRED", "DELETE", "DESC", "DETACH", "DISTINCT", "DOLLAR", "DOT", "DOUBLE_PIPE", "DROP", "DROP_INDEX", "DROP_TABLE", "E", "EACH", "ELSE", "END", "EQUALS", "EQUALS2", "ESCAPE", "EXCEPT", "EXCLUSIVE", "EXISTS", "EXPLAIN", "F", "FAIL", "FLOAT", "FLOAT_EXP", "FLOAT_LITERAL", "FOR", "FOREIGN", "FROM", "FUNCTION_EXPRESSION", "FUNCTION_LITERAL", "G", "GLOB", "GREATER", "GREATER_OR_EQ", "GROUP", "H", "HAVING", "I", "ID", "ID_CORE", "ID_LITERAL", "ID_PLAIN", "ID_QUOTED", "ID_QUOTED_APOSTROPHE", "ID_QUOTED_CORE", "ID_QUOTED_CORE_APOSTROPHE", "ID_QUOTED_CORE_SQUARE", "ID_QUOTED_SQUARE", "ID_START", "IF", "IGNORE", "IMMEDIATE", "IN", "INDEX", "INDEXED", "INITIALLY", "INNER", "INSERT", "INSTEAD", "INTEGER", "INTEGER_LITERAL", "INTERSECT", "INTO", "IN_TABLE", "IN_VALUES", "IS", "ISNULL", "IS_NOT", "IS_NULL", "J", "JOIN", "K", "KEY", "L", "LEFT", "LESS", "LESS_OR_EQ", "LIKE", "LIMIT", "LINE_COMMENT", "LPAREN", "LPAREN_SQUARE", "M", "MATCH", "MINUS", "N", "NATURAL", "NOT", "NOTNULL", "NOT_EQUALS", "NOT_EQUALS2", "NOT_NULL", "NULL", "O", "OF", "OFFSET", "ON", "OPTIONS", "OR", "ORDER", "ORDERING", "OUTER", "P", "PERCENT", "PIPE", "PLAN", "PLUS", "PRAGMA", "PRIMARY", "Q", "QUERY", "QUESTION", "QUOTE_DOUBLE", "QUOTE_SINGLE", "R", "RAISE", "REFERENCES", "REGEXP", "REINDEX", "RELEASE", "RENAME", "REPLACE", "RESTRICT", "ROLLBACK", "ROW", "RPAREN", "RPAREN_SQUARE", "S", "SAVEPOINT", "SELECT", "SELECT_CORE", "SEMI", "SET", "SHIFT_LEFT", "SHIFT_RIGHT", "SLASH", "STATEMENT", "STRING", "STRING_CORE", "STRING_CORE_DOUBLE", "STRING_CORE_SINGLE", "STRING_DOUBLE", "STRING_ESCAPE_DOUBLE", "STRING_ESCAPE_SINGLE", "STRING_LITERAL", "STRING_SINGLE", "T", "TABLE", "TABLE_CONSTRAINT", "TEMPORARY", "THEN", "TILDA", "TO", "TRANSACTION", "TRIGGER", "TYPE", "TYPE_PARAMS", "U", "UNDERSCORE", "UNION", "UNIQUE", "UPDATE", "USING", "V", "VACUUM", "VALUES", "VIEW", "VIRTUAL", "W", "WHEN", "WHERE", "WS", "X", "Y", "Z"
    };

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

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SqlParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SqlParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SqlParser.tokenNames; }
    public String getGrammarFileName() { return "/home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g"; }



    // Disable error recovery.
    protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
        throw new MismatchedTokenException(ttype, input);
    }

    // Delegate error reporting to caller.
    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
        final StringBuilder buffer = new StringBuilder();
        buffer.append("[").append(getErrorHeader(e)).append("] ");
        buffer.append(getErrorMessage(e, tokenNames));
        if(e.token!=null) {
          final CharStream stream = e.token.getInputStream();
          if(stream!=null) {
            int size = stream.size();
            if(size>0) {
              buffer.append("\n").append(stream.substring(0, size-1));
            }
          }
        }
        throw new SqlJetParserException(buffer.toString(), e);
    }

    // unquotes identifier
    private String unquoteId(String id) {
      if(id==null) {
        return null;
      }
      int len = id.length();
      if(len==0) {
        return "";
      }
      char first = id.charAt(0);
      char last = id.charAt(len-1);
      switch(first) {
        case '[' :
          first = ']';
        case '\'' :
        case '"' :
        case '`' :
          if(first==last) {
            return id.substring(1,len-1);
          }
        default:
          return id;
      }
    }



    public static class sql_stmt_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sql_stmt_list"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:1: sql_stmt_list : sql_stmt ( SEMI ! ( sql_stmt SEMI !)* )? EOF !;
    public final SqlParser.sql_stmt_list_return sql_stmt_list() throws RecognitionException {
        SqlParser.sql_stmt_list_return retval = new SqlParser.sql_stmt_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMI2=null;
        Token SEMI4=null;
        Token EOF5=null;
        SqlParser.sql_stmt_return sql_stmt1 =null;

        SqlParser.sql_stmt_return sql_stmt3 =null;


        Object SEMI2_tree=null;
        Object SEMI4_tree=null;
        Object EOF5_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:14: ( sql_stmt ( SEMI ! ( sql_stmt SEMI !)* )? EOF !)
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:16: sql_stmt ( SEMI ! ( sql_stmt SEMI !)* )? EOF !
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_sql_stmt_in_sql_stmt_list223);
            sql_stmt1=sql_stmt();

            state._fsp--;

            adaptor.addChild(root_0, sql_stmt1.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:25: ( SEMI ! ( sql_stmt SEMI !)* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==SEMI) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:26: SEMI ! ( sql_stmt SEMI !)*
                    {
                    SEMI2=(Token)match(input,SEMI,FOLLOW_SEMI_in_sql_stmt_list226); 

                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:32: ( sql_stmt SEMI !)*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==ALTER||LA1_0==ANALYZE||LA1_0==ATTACH||LA1_0==BEGIN||LA1_0==COMMIT||LA1_0==CREATE||LA1_0==DELETE||LA1_0==DETACH||LA1_0==DROP||LA1_0==END||LA1_0==EXPLAIN||LA1_0==INSERT||LA1_0==PRAGMA||(LA1_0 >= REINDEX && LA1_0 <= RELEASE)||LA1_0==REPLACE||LA1_0==ROLLBACK||(LA1_0 >= SAVEPOINT && LA1_0 <= SELECT)||LA1_0==UPDATE||LA1_0==VACUUM) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:142:33: sql_stmt SEMI !
                    	    {
                    	    pushFollow(FOLLOW_sql_stmt_in_sql_stmt_list230);
                    	    sql_stmt3=sql_stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, sql_stmt3.getTree());

                    	    SEMI4=(Token)match(input,SEMI,FOLLOW_SEMI_in_sql_stmt_list232); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_sql_stmt_list240); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sql_stmt_list"


    public static class sql_stmt_itself_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sql_stmt_itself"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:144:1: sql_stmt_itself : sql_stmt ( SEMI !)? EOF !;
    public final SqlParser.sql_stmt_itself_return sql_stmt_itself() throws RecognitionException {
        SqlParser.sql_stmt_itself_return retval = new SqlParser.sql_stmt_itself_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMI7=null;
        Token EOF8=null;
        SqlParser.sql_stmt_return sql_stmt6 =null;


        Object SEMI7_tree=null;
        Object EOF8_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:144:16: ( sql_stmt ( SEMI !)? EOF !)
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:144:18: sql_stmt ( SEMI !)? EOF !
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_sql_stmt_in_sql_stmt_itself248);
            sql_stmt6=sql_stmt();

            state._fsp--;

            adaptor.addChild(root_0, sql_stmt6.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:144:27: ( SEMI !)?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==SEMI) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:144:28: SEMI !
                    {
                    SEMI7=(Token)match(input,SEMI,FOLLOW_SEMI_in_sql_stmt_itself251); 

                    }
                    break;

            }


            EOF8=(Token)match(input,EOF,FOLLOW_EOF_in_sql_stmt_itself256); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sql_stmt_itself"


    public static class sql_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sql_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:1: sql_stmt : ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core ;
    public final SqlParser.sql_stmt_return sql_stmt() throws RecognitionException {
        SqlParser.sql_stmt_return retval = new SqlParser.sql_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXPLAIN9=null;
        Token QUERY10=null;
        Token PLAN11=null;
        SqlParser.sql_stmt_core_return sql_stmt_core12 =null;


        Object EXPLAIN9_tree=null;
        Object QUERY10_tree=null;
        Object PLAN11_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:9: ( ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:11: ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core
            {
            root_0 = (Object)adaptor.nil();


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:11: ( EXPLAIN ( QUERY PLAN )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EXPLAIN) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:12: EXPLAIN ( QUERY PLAN )?
                    {
                    EXPLAIN9=(Token)match(input,EXPLAIN,FOLLOW_EXPLAIN_in_sql_stmt265); 
                    EXPLAIN9_tree = 
                    (Object)adaptor.create(EXPLAIN9)
                    ;
                    adaptor.addChild(root_0, EXPLAIN9_tree);


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:20: ( QUERY PLAN )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==QUERY) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:146:21: QUERY PLAN
                            {
                            QUERY10=(Token)match(input,QUERY,FOLLOW_QUERY_in_sql_stmt268); 
                            QUERY10_tree = 
                            (Object)adaptor.create(QUERY10)
                            ;
                            adaptor.addChild(root_0, QUERY10_tree);


                            PLAN11=(Token)match(input,PLAN,FOLLOW_PLAN_in_sql_stmt270); 
                            PLAN11_tree = 
                            (Object)adaptor.create(PLAN11)
                            ;
                            adaptor.addChild(root_0, PLAN11_tree);


                            }
                            break;

                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_sql_stmt_core_in_sql_stmt276);
            sql_stmt_core12=sql_stmt_core();

            state._fsp--;

            adaptor.addChild(root_0, sql_stmt_core12.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sql_stmt"


    public static class sql_stmt_core_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sql_stmt_core"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:148:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );
    public final SqlParser.sql_stmt_core_return sql_stmt_core() throws RecognitionException {
        SqlParser.sql_stmt_core_return retval = new SqlParser.sql_stmt_core_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlParser.pragma_stmt_return pragma_stmt13 =null;

        SqlParser.attach_stmt_return attach_stmt14 =null;

        SqlParser.detach_stmt_return detach_stmt15 =null;

        SqlParser.analyze_stmt_return analyze_stmt16 =null;

        SqlParser.reindex_stmt_return reindex_stmt17 =null;

        SqlParser.vacuum_stmt_return vacuum_stmt18 =null;

        SqlParser.select_stmt_return select_stmt19 =null;

        SqlParser.insert_stmt_return insert_stmt20 =null;

        SqlParser.update_stmt_return update_stmt21 =null;

        SqlParser.delete_stmt_return delete_stmt22 =null;

        SqlParser.begin_stmt_return begin_stmt23 =null;

        SqlParser.commit_stmt_return commit_stmt24 =null;

        SqlParser.rollback_stmt_return rollback_stmt25 =null;

        SqlParser.savepoint_stmt_return savepoint_stmt26 =null;

        SqlParser.release_stmt_return release_stmt27 =null;

        SqlParser.create_virtual_table_stmt_return create_virtual_table_stmt28 =null;

        SqlParser.create_table_stmt_return create_table_stmt29 =null;

        SqlParser.drop_table_stmt_return drop_table_stmt30 =null;

        SqlParser.alter_table_stmt_return alter_table_stmt31 =null;

        SqlParser.create_view_stmt_return create_view_stmt32 =null;

        SqlParser.drop_view_stmt_return drop_view_stmt33 =null;

        SqlParser.create_index_stmt_return create_index_stmt34 =null;

        SqlParser.drop_index_stmt_return drop_index_stmt35 =null;

        SqlParser.create_trigger_stmt_return create_trigger_stmt36 =null;

        SqlParser.drop_trigger_stmt_return drop_trigger_stmt37 =null;



        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:149:3: ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt )
            int alt6=25;
            switch ( input.LA(1) ) {
            case PRAGMA:
                {
                alt6=1;
                }
                break;
            case ATTACH:
                {
                alt6=2;
                }
                break;
            case DETACH:
                {
                alt6=3;
                }
                break;
            case ANALYZE:
                {
                alt6=4;
                }
                break;
            case REINDEX:
                {
                alt6=5;
                }
                break;
            case VACUUM:
                {
                alt6=6;
                }
                break;
            case SELECT:
                {
                alt6=7;
                }
                break;
            case INSERT:
            case REPLACE:
                {
                alt6=8;
                }
                break;
            case UPDATE:
                {
                alt6=9;
                }
                break;
            case DELETE:
                {
                alt6=10;
                }
                break;
            case BEGIN:
                {
                alt6=11;
                }
                break;
            case COMMIT:
            case END:
                {
                alt6=12;
                }
                break;
            case ROLLBACK:
                {
                alt6=13;
                }
                break;
            case SAVEPOINT:
                {
                alt6=14;
                }
                break;
            case RELEASE:
                {
                alt6=15;
                }
                break;
            case CREATE:
                {
                switch ( input.LA(2) ) {
                case VIRTUAL:
                    {
                    alt6=16;
                    }
                    break;
                case TEMPORARY:
                    {
                    switch ( input.LA(3) ) {
                    case TABLE:
                        {
                        alt6=17;
                        }
                        break;
                    case VIEW:
                        {
                        alt6=20;
                        }
                        break;
                    case TRIGGER:
                        {
                        alt6=24;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 21, input);

                        throw nvae;

                    }

                    }
                    break;
                case TABLE:
                    {
                    alt6=17;
                    }
                    break;
                case VIEW:
                    {
                    alt6=20;
                    }
                    break;
                case INDEX:
                case UNIQUE:
                    {
                    alt6=22;
                    }
                    break;
                case TRIGGER:
                    {
                    alt6=24;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 17, input);

                    throw nvae;

                }

                }
                break;
            case DROP:
                {
                switch ( input.LA(2) ) {
                case TABLE:
                    {
                    alt6=18;
                    }
                    break;
                case VIEW:
                    {
                    alt6=21;
                    }
                    break;
                case INDEX:
                    {
                    alt6=23;
                    }
                    break;
                case TRIGGER:
                    {
                    alt6=25;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 18, input);

                    throw nvae;

                }

                }
                break;
            case ALTER:
                {
                alt6=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:149:5: pragma_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pragma_stmt_in_sql_stmt_core286);
                    pragma_stmt13=pragma_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_stmt13.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:150:5: attach_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_attach_stmt_in_sql_stmt_core292);
                    attach_stmt14=attach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, attach_stmt14.getTree());

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:151:5: detach_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_detach_stmt_in_sql_stmt_core298);
                    detach_stmt15=detach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, detach_stmt15.getTree());

                    }
                    break;
                case 4 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:152:5: analyze_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_analyze_stmt_in_sql_stmt_core304);
                    analyze_stmt16=analyze_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, analyze_stmt16.getTree());

                    }
                    break;
                case 5 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:153:5: reindex_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_reindex_stmt_in_sql_stmt_core310);
                    reindex_stmt17=reindex_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, reindex_stmt17.getTree());

                    }
                    break;
                case 6 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:154:5: vacuum_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_vacuum_stmt_in_sql_stmt_core316);
                    vacuum_stmt18=vacuum_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, vacuum_stmt18.getTree());

                    }
                    break;
                case 7 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:156:5: select_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_select_stmt_in_sql_stmt_core323);
                    select_stmt19=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt19.getTree());

                    }
                    break;
                case 8 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:157:5: insert_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_insert_stmt_in_sql_stmt_core329);
                    insert_stmt20=insert_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_stmt20.getTree());

                    }
                    break;
                case 9 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:158:5: update_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_update_stmt_in_sql_stmt_core335);
                    update_stmt21=update_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, update_stmt21.getTree());

                    }
                    break;
                case 10 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:159:5: delete_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_delete_stmt_in_sql_stmt_core341);
                    delete_stmt22=delete_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_stmt22.getTree());

                    }
                    break;
                case 11 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:160:5: begin_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_begin_stmt_in_sql_stmt_core347);
                    begin_stmt23=begin_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, begin_stmt23.getTree());

                    }
                    break;
                case 12 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:161:5: commit_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_commit_stmt_in_sql_stmt_core353);
                    commit_stmt24=commit_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_stmt24.getTree());

                    }
                    break;
                case 13 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:162:5: rollback_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_rollback_stmt_in_sql_stmt_core359);
                    rollback_stmt25=rollback_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_stmt25.getTree());

                    }
                    break;
                case 14 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:163:5: savepoint_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_savepoint_stmt_in_sql_stmt_core365);
                    savepoint_stmt26=savepoint_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_stmt26.getTree());

                    }
                    break;
                case 15 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:164:5: release_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_release_stmt_in_sql_stmt_core371);
                    release_stmt27=release_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, release_stmt27.getTree());

                    }
                    break;
                case 16 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:166:5: create_virtual_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_create_virtual_table_stmt_in_sql_stmt_core378);
                    create_virtual_table_stmt28=create_virtual_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_virtual_table_stmt28.getTree());

                    }
                    break;
                case 17 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:167:5: create_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_create_table_stmt_in_sql_stmt_core384);
                    create_table_stmt29=create_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_table_stmt29.getTree());

                    }
                    break;
                case 18 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:168:5: drop_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_drop_table_stmt_in_sql_stmt_core390);
                    drop_table_stmt30=drop_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_table_stmt30.getTree());

                    }
                    break;
                case 19 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:169:5: alter_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_alter_table_stmt_in_sql_stmt_core396);
                    alter_table_stmt31=alter_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, alter_table_stmt31.getTree());

                    }
                    break;
                case 20 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:170:5: create_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_create_view_stmt_in_sql_stmt_core402);
                    create_view_stmt32=create_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_view_stmt32.getTree());

                    }
                    break;
                case 21 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:171:5: drop_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_drop_view_stmt_in_sql_stmt_core408);
                    drop_view_stmt33=drop_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_view_stmt33.getTree());

                    }
                    break;
                case 22 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:172:5: create_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_create_index_stmt_in_sql_stmt_core414);
                    create_index_stmt34=create_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_index_stmt34.getTree());

                    }
                    break;
                case 23 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:173:5: drop_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_drop_index_stmt_in_sql_stmt_core420);
                    drop_index_stmt35=drop_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_index_stmt35.getTree());

                    }
                    break;
                case 24 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:174:5: create_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_create_trigger_stmt_in_sql_stmt_core426);
                    create_trigger_stmt36=create_trigger_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_trigger_stmt36.getTree());

                    }
                    break;
                case 25 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:175:5: drop_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_drop_trigger_stmt_in_sql_stmt_core432);
                    drop_trigger_stmt37=drop_trigger_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_trigger_stmt37.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sql_stmt_core"


    public static class schema_create_table_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "schema_create_table_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:178:1: schema_create_table_stmt : ( create_virtual_table_stmt | create_table_stmt );
    public final SqlParser.schema_create_table_stmt_return schema_create_table_stmt() throws RecognitionException {
        SqlParser.schema_create_table_stmt_return retval = new SqlParser.schema_create_table_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlParser.create_virtual_table_stmt_return create_virtual_table_stmt38 =null;

        SqlParser.create_table_stmt_return create_table_stmt39 =null;



        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:178:25: ( create_virtual_table_stmt | create_table_stmt )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==CREATE) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==VIRTUAL) ) {
                    alt7=1;
                }
                else if ( (LA7_1==TABLE||LA7_1==TEMPORARY) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:178:27: create_virtual_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_create_virtual_table_stmt_in_schema_create_table_stmt442);
                    create_virtual_table_stmt38=create_virtual_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_virtual_table_stmt38.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:178:55: create_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_create_table_stmt_in_schema_create_table_stmt446);
                    create_table_stmt39=create_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_table_stmt39.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "schema_create_table_stmt"


    public static class qualified_table_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "qualified_table_name"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:1: qualified_table_name : (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? ;
    public final SqlParser.qualified_table_name_return qualified_table_name() throws RecognitionException {
        SqlParser.qualified_table_name_return retval = new SqlParser.qualified_table_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT40=null;
        Token INDEXED41=null;
        Token BY42=null;
        Token NOT43=null;
        Token INDEXED44=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return table_name =null;

        SqlParser.id_return index_name =null;


        Object DOT40_tree=null;
        Object INDEXED41_tree=null;
        Object BY42_tree=null;
        Object NOT43_tree=null;
        Object INDEXED44_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:21: ( (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:23: (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )?
            {
            root_0 = (Object)adaptor.nil();


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:23: (database_name= id DOT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID||LA8_0==STRING) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==DOT) ) {
                    alt8=1;
                }
            }
            else if ( ((LA8_0 >= ABORT && LA8_0 <= AFTER)||(LA8_0 >= ALL && LA8_0 <= ALTER)||(LA8_0 >= ANALYZE && LA8_0 <= AND)||(LA8_0 >= AS && LA8_0 <= ASC)||(LA8_0 >= ATTACH && LA8_0 <= AUTOINCREMENT)||(LA8_0 >= BEFORE && LA8_0 <= BETWEEN)||LA8_0==BY||(LA8_0 >= CASCADE && LA8_0 <= COLLATE)||LA8_0==COLUMN||(LA8_0 >= COMMIT && LA8_0 <= CONSTRAINT)||LA8_0==CREATE||(LA8_0 >= CROSS && LA8_0 <= CURRENT_TIMESTAMP)||(LA8_0 >= DATABASE && LA8_0 <= DISTINCT)||LA8_0==DROP||(LA8_0 >= EACH && LA8_0 <= END)||(LA8_0 >= ESCAPE && LA8_0 <= EXPLAIN)||LA8_0==FAIL||(LA8_0 >= FOR && LA8_0 <= FROM)||LA8_0==GROUP||LA8_0==HAVING||(LA8_0 >= IF && LA8_0 <= IMMEDIATE)||(LA8_0 >= INDEX && LA8_0 <= INSTEAD)||(LA8_0 >= INTERSECT && LA8_0 <= INTO)||LA8_0==IS||LA8_0==JOIN||LA8_0==KEY||LA8_0==LEFT||LA8_0==LIMIT||LA8_0==NATURAL||LA8_0==NULL||(LA8_0 >= OF && LA8_0 <= ON)||(LA8_0 >= OR && LA8_0 <= ORDER)||LA8_0==OUTER||LA8_0==PLAN||(LA8_0 >= PRAGMA && LA8_0 <= PRIMARY)||LA8_0==QUERY||(LA8_0 >= RAISE && LA8_0 <= REFERENCES)||(LA8_0 >= REINDEX && LA8_0 <= ROW)||(LA8_0 >= SAVEPOINT && LA8_0 <= SELECT)||LA8_0==SET||LA8_0==TABLE||(LA8_0 >= TEMPORARY && LA8_0 <= THEN)||(LA8_0 >= TO && LA8_0 <= TRIGGER)||(LA8_0 >= UNION && LA8_0 <= USING)||(LA8_0 >= VACUUM && LA8_0 <= VIRTUAL)||(LA8_0 >= WHEN && LA8_0 <= WHERE)) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==DOT) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_qualified_table_name456);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());

                    DOT40=(Token)match(input,DOT,FOLLOW_DOT_in_qualified_table_name458); 
                    DOT40_tree = 
                    (Object)adaptor.create(DOT40)
                    ;
                    adaptor.addChild(root_0, DOT40_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_qualified_table_name464);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:61: ( INDEXED BY index_name= id | NOT INDEXED )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==INDEXED) ) {
                alt9=1;
            }
            else if ( (LA9_0==NOT) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:62: INDEXED BY index_name= id
                    {
                    INDEXED41=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name467); 
                    INDEXED41_tree = 
                    (Object)adaptor.create(INDEXED41)
                    ;
                    adaptor.addChild(root_0, INDEXED41_tree);


                    BY42=(Token)match(input,BY,FOLLOW_BY_in_qualified_table_name469); 
                    BY42_tree = 
                    (Object)adaptor.create(BY42)
                    ;
                    adaptor.addChild(root_0, BY42_tree);


                    pushFollow(FOLLOW_id_in_qualified_table_name473);
                    index_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, index_name.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:180:89: NOT INDEXED
                    {
                    NOT43=(Token)match(input,NOT,FOLLOW_NOT_in_qualified_table_name477); 
                    NOT43_tree = 
                    (Object)adaptor.create(NOT43)
                    ;
                    adaptor.addChild(root_0, NOT43_tree);


                    INDEXED44=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name479); 
                    INDEXED44_tree = 
                    (Object)adaptor.create(INDEXED44)
                    ;
                    adaptor.addChild(root_0, INDEXED44_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "qualified_table_name"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:182:1: expr : or_subexpr ( OR ^ or_subexpr )* ;
    public final SqlParser.expr_return expr() throws RecognitionException {
        SqlParser.expr_return retval = new SqlParser.expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OR46=null;
        SqlParser.or_subexpr_return or_subexpr45 =null;

        SqlParser.or_subexpr_return or_subexpr47 =null;


        Object OR46_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:182:5: ( or_subexpr ( OR ^ or_subexpr )* )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:182:7: or_subexpr ( OR ^ or_subexpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_or_subexpr_in_expr488);
            or_subexpr45=or_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, or_subexpr45.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:182:18: ( OR ^ or_subexpr )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:182:19: OR ^ or_subexpr
            	    {
            	    OR46=(Token)match(input,OR,FOLLOW_OR_in_expr491); 
            	    OR46_tree = 
            	    (Object)adaptor.create(OR46)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(OR46_tree, root_0);


            	    pushFollow(FOLLOW_or_subexpr_in_expr494);
            	    or_subexpr47=or_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, or_subexpr47.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class or_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "or_subexpr"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:184:1: or_subexpr : and_subexpr ( AND ^ and_subexpr )* ;
    public final SqlParser.or_subexpr_return or_subexpr() throws RecognitionException {
        SqlParser.or_subexpr_return retval = new SqlParser.or_subexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND49=null;
        SqlParser.and_subexpr_return and_subexpr48 =null;

        SqlParser.and_subexpr_return and_subexpr50 =null;


        Object AND49_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:184:11: ( and_subexpr ( AND ^ and_subexpr )* )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:184:13: and_subexpr ( AND ^ and_subexpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_and_subexpr_in_or_subexpr503);
            and_subexpr48=and_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, and_subexpr48.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:184:25: ( AND ^ and_subexpr )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:184:26: AND ^ and_subexpr
            	    {
            	    AND49=(Token)match(input,AND,FOLLOW_AND_in_or_subexpr506); 
            	    AND49_tree = 
            	    (Object)adaptor.create(AND49)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AND49_tree, root_0);


            	    pushFollow(FOLLOW_and_subexpr_in_or_subexpr509);
            	    and_subexpr50=and_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_subexpr50.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "or_subexpr"


    public static class and_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and_subexpr"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:186:1: and_subexpr : eq_subexpr ( cond_expr ^)? ;
    public final SqlParser.and_subexpr_return and_subexpr() throws RecognitionException {
        SqlParser.and_subexpr_return retval = new SqlParser.and_subexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlParser.eq_subexpr_return eq_subexpr51 =null;

        SqlParser.cond_expr_return cond_expr52 =null;



        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:186:12: ( eq_subexpr ( cond_expr ^)? )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:186:14: eq_subexpr ( cond_expr ^)?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_eq_subexpr_in_and_subexpr518);
            eq_subexpr51=eq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, eq_subexpr51.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:186:34: ( cond_expr ^)?
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:186:34: cond_expr ^
                    {
                    pushFollow(FOLLOW_cond_expr_in_and_subexpr520);
                    cond_expr52=cond_expr();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(cond_expr52.getTree(), root_0);

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "and_subexpr"


    public static class cond_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cond_expr"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:188:1: cond_expr : ( ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )? -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? ) | ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) ) | ( NOT )? IN (database_name= id DOT )? table_name= id -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) ) | ( NOT )? IN ^ LPAREN ! ( select_stmt )? RPAREN !| ( NOT )? EQUALS ^ LPAREN ! ( select_stmt )? RPAREN !| ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL ) | IS NOT ^ eq_subexpr | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) ) | ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) ^ eq_subexpr )+ );
    public final SqlParser.cond_expr_return cond_expr() throws RecognitionException {
        SqlParser.cond_expr_return retval = new SqlParser.cond_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NOT53=null;
        Token ESCAPE55=null;
        Token NOT56=null;
        Token IN57=null;
        Token LPAREN58=null;
        Token COMMA60=null;
        Token RPAREN62=null;
        Token NOT63=null;
        Token IN64=null;
        Token DOT65=null;
        Token NOT66=null;
        Token IN67=null;
        Token LPAREN68=null;
        Token RPAREN70=null;
        Token NOT71=null;
        Token EQUALS72=null;
        Token LPAREN73=null;
        Token RPAREN75=null;
        Token ISNULL76=null;
        Token NOTNULL77=null;
        Token IS78=null;
        Token NULL79=null;
        Token NOT80=null;
        Token NULL81=null;
        Token IS82=null;
        Token NOT83=null;
        Token NULL84=null;
        Token IS85=null;
        Token NOT86=null;
        Token NOT88=null;
        Token BETWEEN89=null;
        Token AND90=null;
        Token set91=null;
        SqlParser.eq_subexpr_return match_expr =null;

        SqlParser.eq_subexpr_return escape_expr =null;

        SqlParser.id_return database_name =null;

        SqlParser.id_return table_name =null;

        SqlParser.eq_subexpr_return e1 =null;

        SqlParser.eq_subexpr_return e2 =null;

        SqlParser.match_op_return match_op54 =null;

        SqlParser.expr_return expr59 =null;

        SqlParser.expr_return expr61 =null;

        SqlParser.select_stmt_return select_stmt69 =null;

        SqlParser.select_stmt_return select_stmt74 =null;

        SqlParser.eq_subexpr_return eq_subexpr87 =null;

        SqlParser.eq_subexpr_return eq_subexpr92 =null;


        Object NOT53_tree=null;
        Object ESCAPE55_tree=null;
        Object NOT56_tree=null;
        Object IN57_tree=null;
        Object LPAREN58_tree=null;
        Object COMMA60_tree=null;
        Object RPAREN62_tree=null;
        Object NOT63_tree=null;
        Object IN64_tree=null;
        Object DOT65_tree=null;
        Object NOT66_tree=null;
        Object IN67_tree=null;
        Object LPAREN68_tree=null;
        Object RPAREN70_tree=null;
        Object NOT71_tree=null;
        Object EQUALS72_tree=null;
        Object LPAREN73_tree=null;
        Object RPAREN75_tree=null;
        Object ISNULL76_tree=null;
        Object NOTNULL77_tree=null;
        Object IS78_tree=null;
        Object NULL79_tree=null;
        Object NOT80_tree=null;
        Object NULL81_tree=null;
        Object IS82_tree=null;
        Object NOT83_tree=null;
        Object NULL84_tree=null;
        Object IS85_tree=null;
        Object NOT86_tree=null;
        Object NOT88_tree=null;
        Object BETWEEN89_tree=null;
        Object AND90_tree=null;
        Object set91_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_ESCAPE=new RewriteRuleTokenStream(adaptor,"token ESCAPE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleTokenStream stream_ISNULL=new RewriteRuleTokenStream(adaptor,"token ISNULL");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_NOTNULL=new RewriteRuleTokenStream(adaptor,"token NOTNULL");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_BETWEEN=new RewriteRuleTokenStream(adaptor,"token BETWEEN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_match_op=new RewriteRuleSubtreeStream(adaptor,"rule match_op");
        RewriteRuleSubtreeStream stream_eq_subexpr=new RewriteRuleSubtreeStream(adaptor,"rule eq_subexpr");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:3: ( ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )? -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? ) | ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) ) | ( NOT )? IN (database_name= id DOT )? table_name= id -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) ) | ( NOT )? IN ^ LPAREN ! ( select_stmt )? RPAREN !| ( NOT )? EQUALS ^ LPAREN ! ( select_stmt )? RPAREN !| ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL ) | IS NOT ^ eq_subexpr | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) ) | ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) ^ eq_subexpr )+ )
            int alt26=9;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:5: ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )?
                    {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:5: ( NOT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==NOT) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:5: NOT
                            {
                            NOT53=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr532);  
                            stream_NOT.add(NOT53);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_match_op_in_cond_expr535);
                    match_op54=match_op();

                    state._fsp--;

                    stream_match_op.add(match_op54.getTree());

                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr539);
                    match_expr=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(match_expr.getTree());

                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:41: ( ESCAPE escape_expr= eq_subexpr )?
                    int alt14=2;
                    alt14 = dfa14.predict(input);
                    switch (alt14) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:42: ESCAPE escape_expr= eq_subexpr
                            {
                            ESCAPE55=(Token)match(input,ESCAPE,FOLLOW_ESCAPE_in_cond_expr542);  
                            stream_ESCAPE.add(ESCAPE55);


                            pushFollow(FOLLOW_eq_subexpr_in_cond_expr546);
                            escape_expr=eq_subexpr();

                            state._fsp--;

                            stream_eq_subexpr.add(escape_expr.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ESCAPE, match_expr, NOT, match_op, escape_expr
                    // token labels: 
                    // rule labels: retval, match_expr, escape_expr
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_match_expr=new RewriteRuleSubtreeStream(adaptor,"rule match_expr",match_expr!=null?match_expr.tree:null);
                    RewriteRuleSubtreeStream stream_escape_expr=new RewriteRuleSubtreeStream(adaptor,"rule escape_expr",escape_expr!=null?escape_expr.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 189:74: -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:77: ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_match_op.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_match_expr.nextTree());

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:100: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NOT.nextNode()
                            );

                        }
                        stream_NOT.reset();

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:105: ( ^( ESCAPE $escape_expr) )?
                        if ( stream_ESCAPE.hasNext()||stream_escape_expr.hasNext() ) {
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:189:105: ^( ESCAPE $escape_expr)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(
                            stream_ESCAPE.nextNode()
                            , root_2);

                            adaptor.addChild(root_2, stream_escape_expr.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_ESCAPE.reset();
                        stream_escape_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:5: ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN
                    {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:5: ( NOT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==NOT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:5: NOT
                            {
                            NOT56=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr574);  
                            stream_NOT.add(NOT56);


                            }
                            break;

                    }


                    IN57=(Token)match(input,IN,FOLLOW_IN_in_cond_expr577);  
                    stream_IN.add(IN57);


                    LPAREN58=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cond_expr579);  
                    stream_LPAREN.add(LPAREN58);


                    pushFollow(FOLLOW_expr_in_cond_expr581);
                    expr59=expr();

                    state._fsp--;

                    stream_expr.add(expr59.getTree());

                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:25: ( COMMA expr )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:26: COMMA expr
                    	    {
                    	    COMMA60=(Token)match(input,COMMA,FOLLOW_COMMA_in_cond_expr584);  
                    	    stream_COMMA.add(COMMA60);


                    	    pushFollow(FOLLOW_expr_in_cond_expr586);
                    	    expr61=expr();

                    	    state._fsp--;

                    	    stream_expr.add(expr61.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    RPAREN62=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cond_expr590);  
                    stream_RPAREN.add(RPAREN62);


                    // AST REWRITE
                    // elements: expr, NOT, IN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 190:46: -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:49: ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IN_VALUES, "IN_VALUES")
                        , root_1);

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:61: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NOT.nextNode()
                            );

                        }
                        stream_NOT.reset();

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:190:66: ^( IN ( expr )+ )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_IN.nextNode()
                        , root_2);

                        if ( !(stream_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_2, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:5: ( NOT )? IN (database_name= id DOT )? table_name= id
                    {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:5: ( NOT )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==NOT) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:5: NOT
                            {
                            NOT63=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr612);  
                            stream_NOT.add(NOT63);


                            }
                            break;

                    }


                    IN64=(Token)match(input,IN,FOLLOW_IN_in_cond_expr615);  
                    stream_IN.add(IN64);


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:13: (database_name= id DOT )?
                    int alt18=2;
                    alt18 = dfa18.predict(input);
                    switch (alt18) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:14: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_cond_expr620);
                            database_name=id();

                            state._fsp--;

                            stream_id.add(database_name.getTree());

                            DOT65=(Token)match(input,DOT,FOLLOW_DOT_in_cond_expr622);  
                            stream_DOT.add(DOT65);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_id_in_cond_expr628);
                    table_name=id();

                    state._fsp--;

                    stream_id.add(table_name.getTree());

                    // AST REWRITE
                    // elements: IN, table_name, NOT, database_name
                    // token labels: 
                    // rule labels: database_name, retval, table_name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 191:51: -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:54: ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IN_TABLE, "IN_TABLE")
                        , root_1);

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:65: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NOT.nextNode()
                            );

                        }
                        stream_NOT.reset();

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:70: ^( IN ^( $table_name ( $database_name)? ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_IN.nextNode()
                        , root_2);

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:75: ^( $table_name ( $database_name)? )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_3);

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:191:90: ( $database_name)?
                        if ( stream_database_name.hasNext() ) {
                            adaptor.addChild(root_3, stream_database_name.nextTree());

                        }
                        stream_database_name.reset();

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:192:5: ( NOT )? IN ^ LPAREN ! ( select_stmt )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:192:5: ( NOT )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==NOT) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:192:5: NOT
                            {
                            NOT66=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr656); 
                            NOT66_tree = 
                            (Object)adaptor.create(NOT66)
                            ;
                            adaptor.addChild(root_0, NOT66_tree);


                            }
                            break;

                    }


                    IN67=(Token)match(input,IN,FOLLOW_IN_in_cond_expr659); 
                    IN67_tree = 
                    (Object)adaptor.create(IN67)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IN67_tree, root_0);


                    LPAREN68=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cond_expr662); 

                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:192:22: ( select_stmt )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==SELECT) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:192:22: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_cond_expr665);
                            select_stmt69=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt69.getTree());

                            }
                            break;

                    }


                    RPAREN70=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cond_expr668); 

                    }
                    break;
                case 5 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:193:5: ( NOT )? EQUALS ^ LPAREN ! ( select_stmt )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:193:5: ( NOT )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==NOT) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:193:5: NOT
                            {
                            NOT71=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr675); 
                            NOT71_tree = 
                            (Object)adaptor.create(NOT71)
                            ;
                            adaptor.addChild(root_0, NOT71_tree);


                            }
                            break;

                    }


                    EQUALS72=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_cond_expr678); 
                    EQUALS72_tree = 
                    (Object)adaptor.create(EQUALS72)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(EQUALS72_tree, root_0);


                    LPAREN73=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cond_expr681); 

                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:193:26: ( select_stmt )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==SELECT) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:193:26: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_cond_expr684);
                            select_stmt74=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt74.getTree());

                            }
                            break;

                    }


                    RPAREN75=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cond_expr687); 

                    }
                    break;
                case 6 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:5: ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL )
                    {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:5: ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL )
                    int alt23=5;
                    switch ( input.LA(1) ) {
                    case ISNULL:
                        {
                        alt23=1;
                        }
                        break;
                    case NOTNULL:
                        {
                        alt23=2;
                        }
                        break;
                    case IS:
                        {
                        int LA23_3 = input.LA(2);

                        if ( (LA23_3==NULL) ) {
                            alt23=3;
                        }
                        else if ( (LA23_3==NOT) ) {
                            alt23=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    case NOT:
                        {
                        alt23=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;

                    }

                    switch (alt23) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:6: ISNULL
                            {
                            ISNULL76=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_cond_expr695);  
                            stream_ISNULL.add(ISNULL76);


                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 194:13: -> IS_NULL
                            {
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(IS_NULL, "IS_NULL")
                                );

                            }


                            retval.tree = root_0;

                            }
                            break;
                        case 2 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:26: NOTNULL
                            {
                            NOTNULL77=(Token)match(input,NOTNULL,FOLLOW_NOTNULL_in_cond_expr703);  
                            stream_NOTNULL.add(NOTNULL77);


                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 194:34: -> NOT_NULL
                            {
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(NOT_NULL, "NOT_NULL")
                                );

                            }


                            retval.tree = root_0;

                            }
                            break;
                        case 3 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:48: IS NULL
                            {
                            IS78=(Token)match(input,IS,FOLLOW_IS_in_cond_expr711);  
                            stream_IS.add(IS78);


                            NULL79=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr713);  
                            stream_NULL.add(NULL79);


                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 194:56: -> IS_NULL
                            {
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(IS_NULL, "IS_NULL")
                                );

                            }


                            retval.tree = root_0;

                            }
                            break;
                        case 4 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:69: NOT NULL
                            {
                            NOT80=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr721);  
                            stream_NOT.add(NOT80);


                            NULL81=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr723);  
                            stream_NULL.add(NULL81);


                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 194:78: -> NOT_NULL
                            {
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(NOT_NULL, "NOT_NULL")
                                );

                            }


                            retval.tree = root_0;

                            }
                            break;
                        case 5 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:194:92: IS NOT NULL
                            {
                            IS82=(Token)match(input,IS,FOLLOW_IS_in_cond_expr731);  
                            stream_IS.add(IS82);


                            NOT83=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr733);  
                            stream_NOT.add(NOT83);


                            NULL84=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr735);  
                            stream_NULL.add(NULL84);


                            // AST REWRITE
                            // elements: 
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 194:104: -> NOT_NULL
                            {
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(NOT_NULL, "NOT_NULL")
                                );

                            }


                            retval.tree = root_0;

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:195:5: IS NOT ^ eq_subexpr
                    {
                    root_0 = (Object)adaptor.nil();


                    IS85=(Token)match(input,IS,FOLLOW_IS_in_cond_expr746); 
                    IS85_tree = 
                    (Object)adaptor.create(IS85)
                    ;
                    adaptor.addChild(root_0, IS85_tree);


                    NOT86=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr748); 
                    NOT86_tree = 
                    (Object)adaptor.create(NOT86)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NOT86_tree, root_0);


                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr751);
                    eq_subexpr87=eq_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, eq_subexpr87.getTree());

                    }
                    break;
                case 8 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:196:5: ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr
                    {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:196:5: ( NOT )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==NOT) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:196:5: NOT
                            {
                            NOT88=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr757);  
                            stream_NOT.add(NOT88);


                            }
                            break;

                    }


                    BETWEEN89=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_cond_expr760);  
                    stream_BETWEEN.add(BETWEEN89);


                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr764);
                    e1=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(e1.getTree());

                    AND90=(Token)match(input,AND,FOLLOW_AND_in_cond_expr766);  
                    stream_AND.add(AND90);


                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr770);
                    e2=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(e2.getTree());

                    // AST REWRITE
                    // elements: NOT, BETWEEN, e1, AND, e2
                    // token labels: 
                    // rule labels: retval, e1, e2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
                    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 196:50: -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:196:53: ^( BETWEEN ( NOT )? ^( AND $e1 $e2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_BETWEEN.nextNode()
                        , root_1);

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:196:63: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NOT.nextNode()
                            );

                        }
                        stream_NOT.reset();

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:196:68: ^( AND $e1 $e2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_AND.nextNode()
                        , root_2);

                        adaptor.addChild(root_2, stream_e1.nextTree());

                        adaptor.addChild(root_2, stream_e2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 9 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:197:5: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) ^ eq_subexpr )+
                    {
                    root_0 = (Object)adaptor.nil();


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:197:5: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) ^ eq_subexpr )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0 >= EQUALS && LA25_0 <= EQUALS2)||(LA25_0 >= NOT_EQUALS && LA25_0 <= NOT_EQUALS2)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:197:6: ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) ^ eq_subexpr
                    	    {
                    	    set91=(Token)input.LT(1);

                    	    set91=(Token)input.LT(1);

                    	    if ( (input.LA(1) >= EQUALS && input.LA(1) <= EQUALS2)||(input.LA(1) >= NOT_EQUALS && input.LA(1) <= NOT_EQUALS2) ) {
                    	        input.consume();
                    	        root_0 = (Object)adaptor.becomeRoot(
                    	        (Object)adaptor.create(set91)
                    	        , root_0);
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    pushFollow(FOLLOW_eq_subexpr_in_cond_expr813);
                    	    eq_subexpr92=eq_subexpr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, eq_subexpr92.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cond_expr"


    public static class match_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "match_op"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:200:1: match_op : ( LIKE | GLOB | REGEXP | MATCH );
    public final SqlParser.match_op_return match_op() throws RecognitionException {
        SqlParser.match_op_return retval = new SqlParser.match_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set93=null;

        Object set93_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:200:9: ( LIKE | GLOB | REGEXP | MATCH )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            root_0 = (Object)adaptor.nil();


            set93=(Token)input.LT(1);

            if ( input.LA(1)==GLOB||input.LA(1)==LIKE||input.LA(1)==MATCH||input.LA(1)==REGEXP ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set93)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "match_op"


    public static class eq_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eq_subexpr"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:202:1: eq_subexpr : neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) ^ neq_subexpr )* ;
    public final SqlParser.eq_subexpr_return eq_subexpr() throws RecognitionException {
        SqlParser.eq_subexpr_return retval = new SqlParser.eq_subexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set95=null;
        SqlParser.neq_subexpr_return neq_subexpr94 =null;

        SqlParser.neq_subexpr_return neq_subexpr96 =null;


        Object set95_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:202:11: ( neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) ^ neq_subexpr )* )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:202:13: neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) ^ neq_subexpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr846);
            neq_subexpr94=neq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, neq_subexpr94.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:202:25: ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) ^ neq_subexpr )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0 >= GREATER && LA27_0 <= GREATER_OR_EQ)||(LA27_0 >= LESS && LA27_0 <= LESS_OR_EQ)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:202:26: ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) ^ neq_subexpr
            	    {
            	    set95=(Token)input.LT(1);

            	    set95=(Token)input.LT(1);

            	    if ( (input.LA(1) >= GREATER && input.LA(1) <= GREATER_OR_EQ)||(input.LA(1) >= LESS && input.LA(1) <= LESS_OR_EQ) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set95)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr866);
            	    neq_subexpr96=neq_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, neq_subexpr96.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "eq_subexpr"


    public static class neq_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "neq_subexpr"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:204:1: neq_subexpr : bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) ^ bit_subexpr )* ;
    public final SqlParser.neq_subexpr_return neq_subexpr() throws RecognitionException {
        SqlParser.neq_subexpr_return retval = new SqlParser.neq_subexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set98=null;
        SqlParser.bit_subexpr_return bit_subexpr97 =null;

        SqlParser.bit_subexpr_return bit_subexpr99 =null;


        Object set98_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:204:12: ( bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) ^ bit_subexpr )* )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:204:14: bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) ^ bit_subexpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr875);
            bit_subexpr97=bit_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, bit_subexpr97.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:204:26: ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) ^ bit_subexpr )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==AMPERSAND||LA28_0==PIPE||(LA28_0 >= SHIFT_LEFT && LA28_0 <= SHIFT_RIGHT)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:204:27: ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) ^ bit_subexpr
            	    {
            	    set98=(Token)input.LT(1);

            	    set98=(Token)input.LT(1);

            	    if ( input.LA(1)==AMPERSAND||input.LA(1)==PIPE||(input.LA(1) >= SHIFT_LEFT && input.LA(1) <= SHIFT_RIGHT) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set98)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr895);
            	    bit_subexpr99=bit_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bit_subexpr99.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "neq_subexpr"


    public static class bit_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bit_subexpr"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:206:1: bit_subexpr : add_subexpr ( ( PLUS | MINUS ) ^ add_subexpr )* ;
    public final SqlParser.bit_subexpr_return bit_subexpr() throws RecognitionException {
        SqlParser.bit_subexpr_return retval = new SqlParser.bit_subexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set101=null;
        SqlParser.add_subexpr_return add_subexpr100 =null;

        SqlParser.add_subexpr_return add_subexpr102 =null;


        Object set101_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:206:12: ( add_subexpr ( ( PLUS | MINUS ) ^ add_subexpr )* )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:206:14: add_subexpr ( ( PLUS | MINUS ) ^ add_subexpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_add_subexpr_in_bit_subexpr904);
            add_subexpr100=add_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, add_subexpr100.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:206:26: ( ( PLUS | MINUS ) ^ add_subexpr )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==MINUS||LA29_0==PLUS) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:206:27: ( PLUS | MINUS ) ^ add_subexpr
            	    {
            	    set101=(Token)input.LT(1);

            	    set101=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set101)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_add_subexpr_in_bit_subexpr916);
            	    add_subexpr102=add_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add_subexpr102.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bit_subexpr"


    public static class add_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add_subexpr"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:208:1: add_subexpr : mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) ^ mul_subexpr )* ;
    public final SqlParser.add_subexpr_return add_subexpr() throws RecognitionException {
        SqlParser.add_subexpr_return retval = new SqlParser.add_subexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set104=null;
        SqlParser.mul_subexpr_return mul_subexpr103 =null;

        SqlParser.mul_subexpr_return mul_subexpr105 =null;


        Object set104_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:208:12: ( mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) ^ mul_subexpr )* )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:208:14: mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) ^ mul_subexpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_mul_subexpr_in_add_subexpr925);
            mul_subexpr103=mul_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, mul_subexpr103.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:208:26: ( ( ASTERISK | SLASH | PERCENT ) ^ mul_subexpr )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==ASTERISK||LA30_0==PERCENT||LA30_0==SLASH) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:208:27: ( ASTERISK | SLASH | PERCENT ) ^ mul_subexpr
            	    {
            	    set104=(Token)input.LT(1);

            	    set104=(Token)input.LT(1);

            	    if ( input.LA(1)==ASTERISK||input.LA(1)==PERCENT||input.LA(1)==SLASH ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set104)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mul_subexpr_in_add_subexpr941);
            	    mul_subexpr105=mul_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mul_subexpr105.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "add_subexpr"


    public static class mul_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mul_subexpr"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:210:1: mul_subexpr : con_subexpr ( DOUBLE_PIPE ^ con_subexpr )* ;
    public final SqlParser.mul_subexpr_return mul_subexpr() throws RecognitionException {
        SqlParser.mul_subexpr_return retval = new SqlParser.mul_subexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOUBLE_PIPE107=null;
        SqlParser.con_subexpr_return con_subexpr106 =null;

        SqlParser.con_subexpr_return con_subexpr108 =null;


        Object DOUBLE_PIPE107_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:210:12: ( con_subexpr ( DOUBLE_PIPE ^ con_subexpr )* )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:210:14: con_subexpr ( DOUBLE_PIPE ^ con_subexpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_con_subexpr_in_mul_subexpr950);
            con_subexpr106=con_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, con_subexpr106.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:210:26: ( DOUBLE_PIPE ^ con_subexpr )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==DOUBLE_PIPE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:210:27: DOUBLE_PIPE ^ con_subexpr
            	    {
            	    DOUBLE_PIPE107=(Token)match(input,DOUBLE_PIPE,FOLLOW_DOUBLE_PIPE_in_mul_subexpr953); 
            	    DOUBLE_PIPE107_tree = 
            	    (Object)adaptor.create(DOUBLE_PIPE107)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(DOUBLE_PIPE107_tree, root_0);


            	    pushFollow(FOLLOW_con_subexpr_in_mul_subexpr956);
            	    con_subexpr108=con_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, con_subexpr108.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mul_subexpr"


    public static class con_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "con_subexpr"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:212:1: con_subexpr : ( unary_subexpr | unary_op unary_subexpr -> ^( unary_op unary_subexpr ) );
    public final SqlParser.con_subexpr_return con_subexpr() throws RecognitionException {
        SqlParser.con_subexpr_return retval = new SqlParser.con_subexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlParser.unary_subexpr_return unary_subexpr109 =null;

        SqlParser.unary_op_return unary_op110 =null;

        SqlParser.unary_subexpr_return unary_subexpr111 =null;


        RewriteRuleSubtreeStream stream_unary_subexpr=new RewriteRuleSubtreeStream(adaptor,"rule unary_subexpr");
        RewriteRuleSubtreeStream stream_unary_op=new RewriteRuleSubtreeStream(adaptor,"rule unary_op");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:212:12: ( unary_subexpr | unary_op unary_subexpr -> ^( unary_op unary_subexpr ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0 >= ABORT && LA32_0 <= AFTER)||(LA32_0 >= ALL && LA32_0 <= ALTER)||(LA32_0 >= ANALYZE && LA32_0 <= AND)||(LA32_0 >= AS && LA32_0 <= ASC)||(LA32_0 >= AT && LA32_0 <= AUTOINCREMENT)||(LA32_0 >= BEFORE && LA32_0 <= BETWEEN)||LA32_0==BLOB||LA32_0==BY||(LA32_0 >= CASCADE && LA32_0 <= COLUMN)||(LA32_0 >= COMMIT && LA32_0 <= CONSTRAINT)||LA32_0==CREATE||(LA32_0 >= CROSS && LA32_0 <= CURRENT_TIMESTAMP)||(LA32_0 >= DATABASE && LA32_0 <= DISTINCT)||LA32_0==DROP||(LA32_0 >= EACH && LA32_0 <= END)||(LA32_0 >= ESCAPE && LA32_0 <= EXPLAIN)||(LA32_0 >= FAIL && LA32_0 <= FLOAT)||(LA32_0 >= FOR && LA32_0 <= FROM)||LA32_0==GROUP||LA32_0==HAVING||LA32_0==ID||(LA32_0 >= IF && LA32_0 <= IMMEDIATE)||(LA32_0 >= INDEX && LA32_0 <= INTEGER)||(LA32_0 >= INTERSECT && LA32_0 <= INTO)||LA32_0==IS||LA32_0==JOIN||LA32_0==KEY||LA32_0==LEFT||LA32_0==LIMIT||LA32_0==LPAREN||LA32_0==NATURAL||LA32_0==NULL||(LA32_0 >= OF && LA32_0 <= ON)||(LA32_0 >= OR && LA32_0 <= ORDER)||LA32_0==OUTER||LA32_0==PLAN||(LA32_0 >= PRAGMA && LA32_0 <= PRIMARY)||(LA32_0 >= QUERY && LA32_0 <= QUESTION)||(LA32_0 >= RAISE && LA32_0 <= REFERENCES)||(LA32_0 >= REINDEX && LA32_0 <= ROW)||(LA32_0 >= SAVEPOINT && LA32_0 <= SELECT)||LA32_0==SET||LA32_0==STRING||LA32_0==TABLE||(LA32_0 >= TEMPORARY && LA32_0 <= THEN)||(LA32_0 >= TO && LA32_0 <= TRIGGER)||(LA32_0 >= UNION && LA32_0 <= USING)||(LA32_0 >= VACUUM && LA32_0 <= VIRTUAL)||(LA32_0 >= WHEN && LA32_0 <= WHERE)) ) {
                alt32=1;
            }
            else if ( (LA32_0==MINUS||LA32_0==NOT||LA32_0==PLUS||LA32_0==TILDA) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:212:14: unary_subexpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_unary_subexpr_in_con_subexpr965);
                    unary_subexpr109=unary_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, unary_subexpr109.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:212:30: unary_op unary_subexpr
                    {
                    pushFollow(FOLLOW_unary_op_in_con_subexpr969);
                    unary_op110=unary_op();

                    state._fsp--;

                    stream_unary_op.add(unary_op110.getTree());

                    pushFollow(FOLLOW_unary_subexpr_in_con_subexpr971);
                    unary_subexpr111=unary_subexpr();

                    state._fsp--;

                    stream_unary_subexpr.add(unary_subexpr111.getTree());

                    // AST REWRITE
                    // elements: unary_subexpr, unary_op
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 212:53: -> ^( unary_op unary_subexpr )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:212:56: ^( unary_op unary_subexpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_unary_op.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_unary_subexpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "con_subexpr"


    public static class unary_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_op"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:214:1: unary_op : ( PLUS | MINUS | TILDA | NOT );
    public final SqlParser.unary_op_return unary_op() throws RecognitionException {
        SqlParser.unary_op_return retval = new SqlParser.unary_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set112=null;

        Object set112_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:214:9: ( PLUS | MINUS | TILDA | NOT )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            root_0 = (Object)adaptor.nil();


            set112=(Token)input.LT(1);

            if ( input.LA(1)==MINUS||input.LA(1)==NOT||input.LA(1)==PLUS||input.LA(1)==TILDA ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set112)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary_op"


    public static class unary_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_subexpr"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:216:1: unary_subexpr : atom_expr ( COLLATE ^collation_name= ID )? ;
    public final SqlParser.unary_subexpr_return unary_subexpr() throws RecognitionException {
        SqlParser.unary_subexpr_return retval = new SqlParser.unary_subexpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token collation_name=null;
        Token COLLATE114=null;
        SqlParser.atom_expr_return atom_expr113 =null;


        Object collation_name_tree=null;
        Object COLLATE114_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:216:14: ( atom_expr ( COLLATE ^collation_name= ID )? )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:216:16: atom_expr ( COLLATE ^collation_name= ID )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_atom_expr_in_unary_subexpr1005);
            atom_expr113=atom_expr();

            state._fsp--;

            adaptor.addChild(root_0, atom_expr113.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:216:26: ( COLLATE ^collation_name= ID )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:216:27: COLLATE ^collation_name= ID
                    {
                    COLLATE114=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_unary_subexpr1008); 
                    COLLATE114_tree = 
                    (Object)adaptor.create(COLLATE114)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(COLLATE114_tree, root_0);


                    collation_name=(Token)match(input,ID,FOLLOW_ID_in_unary_subexpr1013); 
                    collation_name_tree = 
                    (Object)adaptor.create(collation_name)
                    ;
                    adaptor.addChild(root_0, collation_name_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary_subexpr"


    public static class atom_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom_expr"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:218:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) |name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? ) | LPAREN ! expr RPAREN !| CAST ^ LPAREN ! expr AS ! type_name RPAREN !| CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? ) | raise_function );
    public final SqlParser.atom_expr_return atom_expr() throws RecognitionException {
        SqlParser.atom_expr_return retval = new SqlParser.atom_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token column_name=null;
        Token name=null;
        Token DOT117=null;
        Token DOT118=null;
        Token LPAREN119=null;
        Token DISTINCT120=null;
        Token COMMA121=null;
        Token ASTERISK122=null;
        Token RPAREN123=null;
        Token LPAREN124=null;
        Token RPAREN126=null;
        Token CAST127=null;
        Token LPAREN128=null;
        Token AS130=null;
        Token RPAREN132=null;
        Token CASE133=null;
        Token ELSE135=null;
        Token END136=null;
        List list_args=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return table_name =null;

        SqlParser.expr_return case_expr =null;

        SqlParser.expr_return else_expr =null;

        SqlParser.literal_value_return literal_value115 =null;

        SqlParser.bind_parameter_return bind_parameter116 =null;

        SqlParser.expr_return expr125 =null;

        SqlParser.expr_return expr129 =null;

        SqlParser.type_name_return type_name131 =null;

        SqlParser.when_expr_return when_expr134 =null;

        SqlParser.raise_function_return raise_function137 =null;

        RuleReturnScope args = null;
        Object column_name_tree=null;
        Object name_tree=null;
        Object DOT117_tree=null;
        Object DOT118_tree=null;
        Object LPAREN119_tree=null;
        Object DISTINCT120_tree=null;
        Object COMMA121_tree=null;
        Object ASTERISK122_tree=null;
        Object RPAREN123_tree=null;
        Object LPAREN124_tree=null;
        Object RPAREN126_tree=null;
        Object CAST127_tree=null;
        Object LPAREN128_tree=null;
        Object AS130_tree=null;
        Object RPAREN132_tree=null;
        Object CASE133_tree=null;
        Object ELSE135_tree=null;
        Object END136_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_when_expr=new RewriteRuleSubtreeStream(adaptor,"rule when_expr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:219:3: ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) |name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? ) | LPAREN ! expr RPAREN !| CAST ^ LPAREN ! expr AS ! type_name RPAREN !| CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? ) | raise_function )
            int alt42=8;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:219:5: literal_value
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_literal_value_in_atom_expr1025);
                    literal_value115=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value115.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:220:5: bind_parameter
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bind_parameter_in_atom_expr1031);
                    bind_parameter116=bind_parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, bind_parameter116.getTree());

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:5: ( (database_name= id DOT )? table_name= id DOT )? column_name= ID
                    {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:5: ( (database_name= id DOT )? table_name= id DOT )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ID) ) {
                        int LA35_1 = input.LA(2);

                        if ( (LA35_1==DOT) ) {
                            alt35=1;
                        }
                    }
                    else if ( ((LA35_0 >= ABORT && LA35_0 <= AFTER)||(LA35_0 >= ALL && LA35_0 <= ALTER)||(LA35_0 >= ANALYZE && LA35_0 <= AND)||(LA35_0 >= AS && LA35_0 <= ASC)||(LA35_0 >= ATTACH && LA35_0 <= AUTOINCREMENT)||(LA35_0 >= BEFORE && LA35_0 <= BETWEEN)||LA35_0==BY||(LA35_0 >= CASCADE && LA35_0 <= COLLATE)||LA35_0==COLUMN||(LA35_0 >= COMMIT && LA35_0 <= CONSTRAINT)||LA35_0==CREATE||(LA35_0 >= CROSS && LA35_0 <= CURRENT_TIMESTAMP)||(LA35_0 >= DATABASE && LA35_0 <= DISTINCT)||LA35_0==DROP||(LA35_0 >= EACH && LA35_0 <= END)||(LA35_0 >= ESCAPE && LA35_0 <= EXPLAIN)||LA35_0==FAIL||(LA35_0 >= FOR && LA35_0 <= FROM)||LA35_0==GROUP||LA35_0==HAVING||(LA35_0 >= IF && LA35_0 <= IMMEDIATE)||(LA35_0 >= INDEX && LA35_0 <= INSTEAD)||(LA35_0 >= INTERSECT && LA35_0 <= INTO)||LA35_0==IS||LA35_0==JOIN||LA35_0==KEY||LA35_0==LEFT||LA35_0==LIMIT||LA35_0==NATURAL||LA35_0==NULL||(LA35_0 >= OF && LA35_0 <= ON)||(LA35_0 >= OR && LA35_0 <= ORDER)||LA35_0==OUTER||LA35_0==PLAN||(LA35_0 >= PRAGMA && LA35_0 <= PRIMARY)||LA35_0==QUERY||(LA35_0 >= RAISE && LA35_0 <= REFERENCES)||(LA35_0 >= REINDEX && LA35_0 <= ROW)||(LA35_0 >= SAVEPOINT && LA35_0 <= SELECT)||LA35_0==SET||LA35_0==STRING||LA35_0==TABLE||(LA35_0 >= TEMPORARY && LA35_0 <= THEN)||(LA35_0 >= TO && LA35_0 <= TRIGGER)||(LA35_0 >= UNION && LA35_0 <= USING)||(LA35_0 >= VACUUM && LA35_0 <= VIRTUAL)||(LA35_0 >= WHEN && LA35_0 <= WHERE)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:6: (database_name= id DOT )? table_name= id DOT
                            {
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:6: (database_name= id DOT )?
                            int alt34=2;
                            alt34 = dfa34.predict(input);
                            switch (alt34) {
                                case 1 :
                                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:7: database_name= id DOT
                                    {
                                    pushFollow(FOLLOW_id_in_atom_expr1041);
                                    database_name=id();

                                    state._fsp--;

                                    stream_id.add(database_name.getTree());

                                    DOT117=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr1043);  
                                    stream_DOT.add(DOT117);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_id_in_atom_expr1049);
                            table_name=id();

                            state._fsp--;

                            stream_id.add(table_name.getTree());

                            DOT118=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr1051);  
                            stream_DOT.add(DOT118);


                            }
                            break;

                    }


                    column_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr1057);  
                    stream_ID.add(column_name);


                    // AST REWRITE
                    // elements: database_name, table_name, column_name
                    // token labels: column_name
                    // rule labels: database_name, retval, table_name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_column_name=new RewriteRuleTokenStream(adaptor,"token column_name",column_name);
                    RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 221:65: -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:68: ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(COLUMN_EXPRESSION, "COLUMN_EXPRESSION")
                        , root_1);

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:88: ^( $column_name ( ^( $table_name ( $database_name)? ) )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_2);

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:103: ( ^( $table_name ( $database_name)? ) )?
                        if ( stream_database_name.hasNext()||stream_table_name.hasNext() ) {
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:103: ^( $table_name ( $database_name)? )
                            {
                            Object root_3 = (Object)adaptor.nil();
                            root_3 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_3);

                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:221:118: ( $database_name)?
                            if ( stream_database_name.hasNext() ) {
                                adaptor.addChild(root_3, stream_database_name.nextTree());

                            }
                            stream_database_name.reset();

                            adaptor.addChild(root_2, root_3);
                            }

                        }
                        stream_database_name.reset();
                        stream_table_name.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:5: name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN
                    {
                    name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr1086);  
                    stream_ID.add(name);


                    LPAREN119=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1088);  
                    stream_LPAREN.add(LPAREN119);


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:20: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?
                    int alt38=3;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0 >= ABORT && LA38_0 <= AFTER)||(LA38_0 >= ALL && LA38_0 <= ALTER)||(LA38_0 >= ANALYZE && LA38_0 <= AND)||(LA38_0 >= AS && LA38_0 <= ASC)||(LA38_0 >= AT && LA38_0 <= AUTOINCREMENT)||(LA38_0 >= BEFORE && LA38_0 <= BETWEEN)||LA38_0==BLOB||LA38_0==BY||(LA38_0 >= CASCADE && LA38_0 <= COLUMN)||(LA38_0 >= COMMIT && LA38_0 <= CONSTRAINT)||LA38_0==CREATE||(LA38_0 >= CROSS && LA38_0 <= CURRENT_TIMESTAMP)||(LA38_0 >= DATABASE && LA38_0 <= DISTINCT)||LA38_0==DROP||(LA38_0 >= EACH && LA38_0 <= END)||(LA38_0 >= ESCAPE && LA38_0 <= EXPLAIN)||(LA38_0 >= FAIL && LA38_0 <= FLOAT)||(LA38_0 >= FOR && LA38_0 <= FROM)||LA38_0==GROUP||LA38_0==HAVING||LA38_0==ID||(LA38_0 >= IF && LA38_0 <= IMMEDIATE)||(LA38_0 >= INDEX && LA38_0 <= INTEGER)||(LA38_0 >= INTERSECT && LA38_0 <= INTO)||LA38_0==IS||LA38_0==JOIN||LA38_0==KEY||LA38_0==LEFT||LA38_0==LIMIT||LA38_0==LPAREN||LA38_0==MINUS||(LA38_0 >= NATURAL && LA38_0 <= NOT)||LA38_0==NULL||(LA38_0 >= OF && LA38_0 <= ON)||(LA38_0 >= OR && LA38_0 <= ORDER)||LA38_0==OUTER||(LA38_0 >= PLAN && LA38_0 <= PRIMARY)||(LA38_0 >= QUERY && LA38_0 <= QUESTION)||(LA38_0 >= RAISE && LA38_0 <= REFERENCES)||(LA38_0 >= REINDEX && LA38_0 <= ROW)||(LA38_0 >= SAVEPOINT && LA38_0 <= SELECT)||LA38_0==SET||LA38_0==STRING||LA38_0==TABLE||(LA38_0 >= TEMPORARY && LA38_0 <= TRIGGER)||(LA38_0 >= UNION && LA38_0 <= USING)||(LA38_0 >= VACUUM && LA38_0 <= VIRTUAL)||(LA38_0 >= WHEN && LA38_0 <= WHERE)) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==ASTERISK) ) {
                        alt38=2;
                    }
                    switch (alt38) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:21: ( DISTINCT )? args+= expr ( COMMA args+= expr )*
                            {
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:21: ( DISTINCT )?
                            int alt36=2;
                            int LA36_0 = input.LA(1);

                            if ( (LA36_0==DISTINCT) ) {
                                int LA36_1 = input.LA(2);

                                if ( ((LA36_1 >= ABORT && LA36_1 <= AFTER)||(LA36_1 >= ALL && LA36_1 <= ALTER)||(LA36_1 >= ANALYZE && LA36_1 <= AND)||(LA36_1 >= AS && LA36_1 <= ASC)||(LA36_1 >= AT && LA36_1 <= AUTOINCREMENT)||(LA36_1 >= BEFORE && LA36_1 <= BETWEEN)||LA36_1==BLOB||LA36_1==BY||(LA36_1 >= CASCADE && LA36_1 <= COLUMN)||(LA36_1 >= COMMIT && LA36_1 <= CONSTRAINT)||LA36_1==CREATE||(LA36_1 >= CROSS && LA36_1 <= CURRENT_TIMESTAMP)||(LA36_1 >= DATABASE && LA36_1 <= DISTINCT)||LA36_1==DROP||(LA36_1 >= EACH && LA36_1 <= END)||(LA36_1 >= ESCAPE && LA36_1 <= EXPLAIN)||(LA36_1 >= FAIL && LA36_1 <= FLOAT)||(LA36_1 >= FOR && LA36_1 <= FROM)||LA36_1==GROUP||LA36_1==HAVING||LA36_1==ID||(LA36_1 >= IF && LA36_1 <= IMMEDIATE)||(LA36_1 >= INDEX && LA36_1 <= INTEGER)||(LA36_1 >= INTERSECT && LA36_1 <= INTO)||LA36_1==IS||LA36_1==JOIN||LA36_1==KEY||LA36_1==LEFT||LA36_1==LIMIT||LA36_1==LPAREN||LA36_1==MINUS||(LA36_1 >= NATURAL && LA36_1 <= NOT)||LA36_1==NULL||(LA36_1 >= OF && LA36_1 <= ON)||(LA36_1 >= OR && LA36_1 <= ORDER)||LA36_1==OUTER||(LA36_1 >= PLAN && LA36_1 <= PRIMARY)||(LA36_1 >= QUERY && LA36_1 <= QUESTION)||(LA36_1 >= RAISE && LA36_1 <= REFERENCES)||(LA36_1 >= REINDEX && LA36_1 <= ROW)||(LA36_1 >= SAVEPOINT && LA36_1 <= SELECT)||LA36_1==SET||LA36_1==STRING||LA36_1==TABLE||(LA36_1 >= TEMPORARY && LA36_1 <= TRIGGER)||(LA36_1 >= UNION && LA36_1 <= USING)||(LA36_1 >= VACUUM && LA36_1 <= VIRTUAL)||(LA36_1 >= WHEN && LA36_1 <= WHERE)) ) {
                                    alt36=1;
                                }
                            }
                            switch (alt36) {
                                case 1 :
                                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:21: DISTINCT
                                    {
                                    DISTINCT120=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_atom_expr1091);  
                                    stream_DISTINCT.add(DISTINCT120);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_expr_in_atom_expr1096);
                            args=expr();

                            state._fsp--;

                            stream_expr.add(args.getTree());
                            if (list_args==null) list_args=new ArrayList();
                            list_args.add(args.getTree());


                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:42: ( COMMA args+= expr )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==COMMA) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:43: COMMA args+= expr
                            	    {
                            	    COMMA121=(Token)match(input,COMMA,FOLLOW_COMMA_in_atom_expr1099);  
                            	    stream_COMMA.add(COMMA121);


                            	    pushFollow(FOLLOW_expr_in_atom_expr1103);
                            	    args=expr();

                            	    state._fsp--;

                            	    stream_expr.add(args.getTree());
                            	    if (list_args==null) list_args=new ArrayList();
                            	    list_args.add(args.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop37;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:64: ASTERISK
                            {
                            ASTERISK122=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_atom_expr1109);  
                            stream_ASTERISK.add(ASTERISK122);


                            }
                            break;

                    }


                    RPAREN123=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1113);  
                    stream_RPAREN.add(RPAREN123);


                    // AST REWRITE
                    // elements: name, args, ASTERISK, DISTINCT
                    // token labels: name
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: args
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"token args",list_args);
                    root_0 = (Object)adaptor.nil();
                    // 222:82: -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:85: ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FUNCTION_EXPRESSION, "FUNCTION_EXPRESSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_name.nextNode());

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:113: ( DISTINCT )?
                        if ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_DISTINCT.nextNode()
                            );

                        }
                        stream_DISTINCT.reset();

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:124: ( $args)*
                        while ( stream_args.hasNext() ) {
                            adaptor.addChild(root_1, stream_args.nextTree());

                        }
                        stream_args.reset();

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:222:130: ( ASTERISK )?
                        if ( stream_ASTERISK.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_ASTERISK.nextNode()
                            );

                        }
                        stream_ASTERISK.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:223:5: LPAREN ! expr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    LPAREN124=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1138); 

                    pushFollow(FOLLOW_expr_in_atom_expr1141);
                    expr125=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr125.getTree());

                    RPAREN126=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1143); 

                    }
                    break;
                case 6 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:224:5: CAST ^ LPAREN ! expr AS ! type_name RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    CAST127=(Token)match(input,CAST,FOLLOW_CAST_in_atom_expr1150); 
                    CAST127_tree = 
                    (Object)adaptor.create(CAST127)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CAST127_tree, root_0);


                    LPAREN128=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1153); 

                    pushFollow(FOLLOW_expr_in_atom_expr1156);
                    expr129=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr129.getTree());

                    AS130=(Token)match(input,AS,FOLLOW_AS_in_atom_expr1158); 

                    pushFollow(FOLLOW_type_name_in_atom_expr1161);
                    type_name131=type_name();

                    state._fsp--;

                    adaptor.addChild(root_0, type_name131.getTree());

                    RPAREN132=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1163); 

                    }
                    break;
                case 7 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:5: CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END
                    {
                    CASE133=(Token)match(input,CASE,FOLLOW_CASE_in_atom_expr1172);  
                    stream_CASE.add(CASE133);


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:10: (case_expr= expr )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0 >= ABORT && LA39_0 <= AFTER)||(LA39_0 >= ALL && LA39_0 <= ALTER)||(LA39_0 >= ANALYZE && LA39_0 <= AND)||(LA39_0 >= AS && LA39_0 <= ASC)||(LA39_0 >= AT && LA39_0 <= AUTOINCREMENT)||(LA39_0 >= BEFORE && LA39_0 <= BETWEEN)||LA39_0==BLOB||LA39_0==BY||(LA39_0 >= CASCADE && LA39_0 <= COLUMN)||(LA39_0 >= COMMIT && LA39_0 <= CONSTRAINT)||LA39_0==CREATE||(LA39_0 >= CROSS && LA39_0 <= CURRENT_TIMESTAMP)||(LA39_0 >= DATABASE && LA39_0 <= DISTINCT)||LA39_0==DROP||(LA39_0 >= EACH && LA39_0 <= END)||(LA39_0 >= ESCAPE && LA39_0 <= EXPLAIN)||(LA39_0 >= FAIL && LA39_0 <= FLOAT)||(LA39_0 >= FOR && LA39_0 <= FROM)||LA39_0==GROUP||LA39_0==HAVING||LA39_0==ID||(LA39_0 >= IF && LA39_0 <= IMMEDIATE)||(LA39_0 >= INDEX && LA39_0 <= INTEGER)||(LA39_0 >= INTERSECT && LA39_0 <= INTO)||LA39_0==IS||LA39_0==JOIN||LA39_0==KEY||LA39_0==LEFT||LA39_0==LIMIT||LA39_0==LPAREN||LA39_0==MINUS||(LA39_0 >= NATURAL && LA39_0 <= NOT)||LA39_0==NULL||(LA39_0 >= OF && LA39_0 <= ON)||(LA39_0 >= OR && LA39_0 <= ORDER)||LA39_0==OUTER||(LA39_0 >= PLAN && LA39_0 <= PRIMARY)||(LA39_0 >= QUERY && LA39_0 <= QUESTION)||(LA39_0 >= RAISE && LA39_0 <= REFERENCES)||(LA39_0 >= REINDEX && LA39_0 <= ROW)||(LA39_0 >= SAVEPOINT && LA39_0 <= SELECT)||LA39_0==SET||LA39_0==STRING||LA39_0==TABLE||(LA39_0 >= TEMPORARY && LA39_0 <= TRIGGER)||(LA39_0 >= UNION && LA39_0 <= USING)||(LA39_0 >= VACUUM && LA39_0 <= VIRTUAL)||LA39_0==WHERE) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==WHEN) ) {
                        int LA39_17 = input.LA(2);

                        if ( (LA39_17==DOT) ) {
                            alt39=1;
                        }
                    }
                    switch (alt39) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:11: case_expr= expr
                            {
                            pushFollow(FOLLOW_expr_in_atom_expr1177);
                            case_expr=expr();

                            state._fsp--;

                            stream_expr.add(case_expr.getTree());

                            }
                            break;

                    }


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:28: ( when_expr )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==WHEN) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:28: when_expr
                    	    {
                    	    pushFollow(FOLLOW_when_expr_in_atom_expr1181);
                    	    when_expr134=when_expr();

                    	    state._fsp--;

                    	    stream_when_expr.add(when_expr134.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt40 >= 1 ) break loop40;
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
                    } while (true);


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:39: ( ELSE else_expr= expr )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==ELSE) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:40: ELSE else_expr= expr
                            {
                            ELSE135=(Token)match(input,ELSE,FOLLOW_ELSE_in_atom_expr1185);  
                            stream_ELSE.add(ELSE135);


                            pushFollow(FOLLOW_expr_in_atom_expr1189);
                            else_expr=expr();

                            state._fsp--;

                            stream_expr.add(else_expr.getTree());

                            }
                            break;

                    }


                    END136=(Token)match(input,END,FOLLOW_END_in_atom_expr1193);  
                    stream_END.add(END136);


                    // AST REWRITE
                    // elements: else_expr, case_expr, when_expr, CASE
                    // token labels: 
                    // rule labels: retval, case_expr, else_expr
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_expr",case_expr!=null?case_expr.tree:null);
                    RewriteRuleSubtreeStream stream_else_expr=new RewriteRuleSubtreeStream(adaptor,"rule else_expr",else_expr!=null?else_expr.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 227:66: -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:69: ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CASE.nextNode()
                        , root_1);

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:77: ( $case_expr)?
                        if ( stream_case_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_case_expr.nextTree());

                        }
                        stream_case_expr.reset();

                        if ( !(stream_when_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_when_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_when_expr.nextTree());

                        }
                        stream_when_expr.reset();

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:227:100: ( $else_expr)?
                        if ( stream_else_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_else_expr.nextTree());

                        }
                        stream_else_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:228:5: raise_function
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_raise_function_in_atom_expr1216);
                    raise_function137=raise_function();

                    state._fsp--;

                    adaptor.addChild(root_0, raise_function137.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom_expr"


    public static class when_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "when_expr"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:231:1: when_expr : WHEN e1= expr THEN e2= expr -> ^( WHEN $e1 $e2) ;
    public final SqlParser.when_expr_return when_expr() throws RecognitionException {
        SqlParser.when_expr_return retval = new SqlParser.when_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHEN138=null;
        Token THEN139=null;
        SqlParser.expr_return e1 =null;

        SqlParser.expr_return e2 =null;


        Object WHEN138_tree=null;
        Object THEN139_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:231:10: ( WHEN e1= expr THEN e2= expr -> ^( WHEN $e1 $e2) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:231:12: WHEN e1= expr THEN e2= expr
            {
            WHEN138=(Token)match(input,WHEN,FOLLOW_WHEN_in_when_expr1226);  
            stream_WHEN.add(WHEN138);


            pushFollow(FOLLOW_expr_in_when_expr1230);
            e1=expr();

            state._fsp--;

            stream_expr.add(e1.getTree());

            THEN139=(Token)match(input,THEN,FOLLOW_THEN_in_when_expr1232);  
            stream_THEN.add(THEN139);


            pushFollow(FOLLOW_expr_in_when_expr1236);
            e2=expr();

            state._fsp--;

            stream_expr.add(e2.getTree());

            // AST REWRITE
            // elements: e1, WHEN, e2
            // token labels: 
            // rule labels: retval, e1, e2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
            RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 231:38: -> ^( WHEN $e1 $e2)
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:231:41: ^( WHEN $e1 $e2)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_WHEN.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_e1.nextTree());

                adaptor.addChild(root_1, stream_e2.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "when_expr"


    public static class literal_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal_value"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:233:1: literal_value : ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) | STRING -> ^( STRING_LITERAL STRING ) | BLOB -> ^( BLOB_LITERAL BLOB ) | NULL | CURRENT_TIME -> ^( FUNCTION_LITERAL CURRENT_TIME ) | CURRENT_DATE -> ^( FUNCTION_LITERAL CURRENT_DATE ) | CURRENT_TIMESTAMP -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP ) );
    public final SqlParser.literal_value_return literal_value() throws RecognitionException {
        SqlParser.literal_value_return retval = new SqlParser.literal_value_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTEGER140=null;
        Token FLOAT141=null;
        Token STRING142=null;
        Token BLOB143=null;
        Token NULL144=null;
        Token CURRENT_TIME145=null;
        Token CURRENT_DATE146=null;
        Token CURRENT_TIMESTAMP147=null;

        Object INTEGER140_tree=null;
        Object FLOAT141_tree=null;
        Object STRING142_tree=null;
        Object BLOB143_tree=null;
        Object NULL144_tree=null;
        Object CURRENT_TIME145_tree=null;
        Object CURRENT_DATE146_tree=null;
        Object CURRENT_TIMESTAMP147_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_BLOB=new RewriteRuleTokenStream(adaptor,"token BLOB");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_CURRENT_TIMESTAMP=new RewriteRuleTokenStream(adaptor,"token CURRENT_TIMESTAMP");
        RewriteRuleTokenStream stream_CURRENT_DATE=new RewriteRuleTokenStream(adaptor,"token CURRENT_DATE");
        RewriteRuleTokenStream stream_CURRENT_TIME=new RewriteRuleTokenStream(adaptor,"token CURRENT_TIME");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:234:3: ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) | STRING -> ^( STRING_LITERAL STRING ) | BLOB -> ^( BLOB_LITERAL BLOB ) | NULL | CURRENT_TIME -> ^( FUNCTION_LITERAL CURRENT_TIME ) | CURRENT_DATE -> ^( FUNCTION_LITERAL CURRENT_DATE ) | CURRENT_TIMESTAMP -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP ) )
            int alt43=8;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt43=1;
                }
                break;
            case FLOAT:
                {
                alt43=2;
                }
                break;
            case STRING:
                {
                alt43=3;
                }
                break;
            case BLOB:
                {
                alt43=4;
                }
                break;
            case NULL:
                {
                alt43=5;
                }
                break;
            case CURRENT_TIME:
                {
                alt43=6;
                }
                break;
            case CURRENT_DATE:
                {
                alt43=7;
                }
                break;
            case CURRENT_TIMESTAMP:
                {
                alt43=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }

            switch (alt43) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:234:5: INTEGER
                    {
                    INTEGER140=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_literal_value1258);  
                    stream_INTEGER.add(INTEGER140);


                    // AST REWRITE
                    // elements: INTEGER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 234:13: -> ^( INTEGER_LITERAL INTEGER )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:234:16: ^( INTEGER_LITERAL INTEGER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(INTEGER_LITERAL, "INTEGER_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INTEGER.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:235:5: FLOAT
                    {
                    FLOAT141=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_literal_value1272);  
                    stream_FLOAT.add(FLOAT141);


                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 235:11: -> ^( FLOAT_LITERAL FLOAT )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:235:14: ^( FLOAT_LITERAL FLOAT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FLOAT_LITERAL, "FLOAT_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_FLOAT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:236:5: STRING
                    {
                    STRING142=(Token)match(input,STRING,FOLLOW_STRING_in_literal_value1286);  
                    stream_STRING.add(STRING142);


                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 236:12: -> ^( STRING_LITERAL STRING )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:236:15: ^( STRING_LITERAL STRING )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STRING_LITERAL, "STRING_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_STRING.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:237:5: BLOB
                    {
                    BLOB143=(Token)match(input,BLOB,FOLLOW_BLOB_in_literal_value1300);  
                    stream_BLOB.add(BLOB143);


                    // AST REWRITE
                    // elements: BLOB
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:10: -> ^( BLOB_LITERAL BLOB )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:237:13: ^( BLOB_LITERAL BLOB )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BLOB_LITERAL, "BLOB_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_BLOB.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:238:5: NULL
                    {
                    root_0 = (Object)adaptor.nil();


                    NULL144=(Token)match(input,NULL,FOLLOW_NULL_in_literal_value1314); 
                    NULL144_tree = 
                    (Object)adaptor.create(NULL144)
                    ;
                    adaptor.addChild(root_0, NULL144_tree);


                    }
                    break;
                case 6 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:239:5: CURRENT_TIME
                    {
                    CURRENT_TIME145=(Token)match(input,CURRENT_TIME,FOLLOW_CURRENT_TIME_in_literal_value1320);  
                    stream_CURRENT_TIME.add(CURRENT_TIME145);


                    // AST REWRITE
                    // elements: CURRENT_TIME
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 239:18: -> ^( FUNCTION_LITERAL CURRENT_TIME )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:239:21: ^( FUNCTION_LITERAL CURRENT_TIME )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FUNCTION_LITERAL, "FUNCTION_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CURRENT_TIME.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:240:5: CURRENT_DATE
                    {
                    CURRENT_DATE146=(Token)match(input,CURRENT_DATE,FOLLOW_CURRENT_DATE_in_literal_value1334);  
                    stream_CURRENT_DATE.add(CURRENT_DATE146);


                    // AST REWRITE
                    // elements: CURRENT_DATE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 240:18: -> ^( FUNCTION_LITERAL CURRENT_DATE )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:240:21: ^( FUNCTION_LITERAL CURRENT_DATE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FUNCTION_LITERAL, "FUNCTION_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CURRENT_DATE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:241:5: CURRENT_TIMESTAMP
                    {
                    CURRENT_TIMESTAMP147=(Token)match(input,CURRENT_TIMESTAMP,FOLLOW_CURRENT_TIMESTAMP_in_literal_value1348);  
                    stream_CURRENT_TIMESTAMP.add(CURRENT_TIMESTAMP147);


                    // AST REWRITE
                    // elements: CURRENT_TIMESTAMP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 241:23: -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:241:26: ^( FUNCTION_LITERAL CURRENT_TIMESTAMP )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FUNCTION_LITERAL, "FUNCTION_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CURRENT_TIMESTAMP.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "literal_value"


    public static class bind_parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bind_parameter"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:244:1: bind_parameter : ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) );
    public final SqlParser.bind_parameter_return bind_parameter() throws RecognitionException {
        SqlParser.bind_parameter_return retval = new SqlParser.bind_parameter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token position=null;
        Token QUESTION148=null;
        Token QUESTION149=null;
        Token COLON150=null;
        Token AT151=null;
        SqlParser.id_return name =null;


        Object position_tree=null;
        Object QUESTION148_tree=null;
        Object QUESTION149_tree=null;
        Object COLON150_tree=null;
        Object AT151_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:245:3: ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) )
            int alt44=4;
            switch ( input.LA(1) ) {
            case QUESTION:
                {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==INTEGER) ) {
                    alt44=2;
                }
                else if ( (LA44_1==EOF||(LA44_1 >= ABORT && LA44_1 <= AFTER)||(LA44_1 >= ALL && LA44_1 <= AND)||(LA44_1 >= AS && LA44_1 <= ASTERISK)||(LA44_1 >= ATTACH && LA44_1 <= AUTOINCREMENT)||(LA44_1 >= BEFORE && LA44_1 <= BETWEEN)||LA44_1==BY||(LA44_1 >= CASCADE && LA44_1 <= COLLATE)||LA44_1==COLUMN||LA44_1==COMMA||(LA44_1 >= COMMIT && LA44_1 <= CONSTRAINT)||LA44_1==CREATE||(LA44_1 >= CROSS && LA44_1 <= CURRENT_TIMESTAMP)||(LA44_1 >= DATABASE && LA44_1 <= DISTINCT)||(LA44_1 >= DOUBLE_PIPE && LA44_1 <= DROP)||(LA44_1 >= EACH && LA44_1 <= EXPLAIN)||LA44_1==FAIL||(LA44_1 >= FOR && LA44_1 <= FROM)||(LA44_1 >= GLOB && LA44_1 <= GROUP)||LA44_1==HAVING||LA44_1==ID||(LA44_1 >= IF && LA44_1 <= INSTEAD)||(LA44_1 >= INTERSECT && LA44_1 <= INTO)||(LA44_1 >= IS && LA44_1 <= ISNULL)||LA44_1==JOIN||LA44_1==KEY||(LA44_1 >= LEFT && LA44_1 <= LIMIT)||(LA44_1 >= MATCH && LA44_1 <= MINUS)||(LA44_1 >= NATURAL && LA44_1 <= NOT_EQUALS2)||LA44_1==NULL||(LA44_1 >= OF && LA44_1 <= ON)||(LA44_1 >= OR && LA44_1 <= ORDER)||LA44_1==OUTER||(LA44_1 >= PERCENT && LA44_1 <= PRIMARY)||LA44_1==QUERY||(LA44_1 >= RAISE && LA44_1 <= RPAREN)||(LA44_1 >= SAVEPOINT && LA44_1 <= SELECT)||(LA44_1 >= SEMI && LA44_1 <= SLASH)||LA44_1==STRING||LA44_1==TABLE||(LA44_1 >= TEMPORARY && LA44_1 <= THEN)||(LA44_1 >= TO && LA44_1 <= TRIGGER)||(LA44_1 >= UNION && LA44_1 <= USING)||(LA44_1 >= VACUUM && LA44_1 <= VIRTUAL)||(LA44_1 >= WHEN && LA44_1 <= WHERE)) ) {
                    alt44=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;

                }
                }
                break;
            case COLON:
                {
                alt44=3;
                }
                break;
            case AT:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }

            switch (alt44) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:245:5: QUESTION
                    {
                    QUESTION148=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter1369);  
                    stream_QUESTION.add(QUESTION148);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 245:14: -> BIND
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(BIND, "BIND")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:246:5: QUESTION position= INTEGER
                    {
                    QUESTION149=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter1379);  
                    stream_QUESTION.add(QUESTION149);


                    position=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_bind_parameter1383);  
                    stream_INTEGER.add(position);


                    // AST REWRITE
                    // elements: position
                    // token labels: position
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_position=new RewriteRuleTokenStream(adaptor,"token position",position);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 246:31: -> ^( BIND $position)
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:246:34: ^( BIND $position)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BIND, "BIND")
                        , root_1);

                        adaptor.addChild(root_1, stream_position.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:247:5: COLON name= id
                    {
                    COLON150=(Token)match(input,COLON,FOLLOW_COLON_in_bind_parameter1398);  
                    stream_COLON.add(COLON150);


                    pushFollow(FOLLOW_id_in_bind_parameter1402);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    // AST REWRITE
                    // elements: name
                    // token labels: 
                    // rule labels: retval, name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 247:19: -> ^( BIND_NAME $name)
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:247:22: ^( BIND_NAME $name)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BIND_NAME, "BIND_NAME")
                        , root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:248:5: AT name= id
                    {
                    AT151=(Token)match(input,AT,FOLLOW_AT_in_bind_parameter1417);  
                    stream_AT.add(AT151);


                    pushFollow(FOLLOW_id_in_bind_parameter1421);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    // AST REWRITE
                    // elements: name
                    // token labels: 
                    // rule labels: retval, name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 248:16: -> ^( BIND_NAME $name)
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:248:19: ^( BIND_NAME $name)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(BIND_NAME, "BIND_NAME")
                        , root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bind_parameter"


    public static class raise_function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "raise_function"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:253:1: raise_function : RAISE ^ LPAREN ! ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA !error_message= STRING ) RPAREN !;
    public final SqlParser.raise_function_return raise_function() throws RecognitionException {
        SqlParser.raise_function_return retval = new SqlParser.raise_function_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token error_message=null;
        Token RAISE152=null;
        Token LPAREN153=null;
        Token IGNORE154=null;
        Token set155=null;
        Token COMMA156=null;
        Token RPAREN157=null;

        Object error_message_tree=null;
        Object RAISE152_tree=null;
        Object LPAREN153_tree=null;
        Object IGNORE154_tree=null;
        Object set155_tree=null;
        Object COMMA156_tree=null;
        Object RPAREN157_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:253:15: ( RAISE ^ LPAREN ! ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA !error_message= STRING ) RPAREN !)
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:253:17: RAISE ^ LPAREN ! ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA !error_message= STRING ) RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            RAISE152=(Token)match(input,RAISE,FOLLOW_RAISE_in_raise_function1442); 
            RAISE152_tree = 
            (Object)adaptor.create(RAISE152)
            ;
            root_0 = (Object)adaptor.becomeRoot(RAISE152_tree, root_0);


            LPAREN153=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_raise_function1445); 

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:253:32: ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA !error_message= STRING )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==IGNORE) ) {
                alt45=1;
            }
            else if ( (LA45_0==ABORT||LA45_0==FAIL||LA45_0==ROLLBACK) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }
            switch (alt45) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:253:33: IGNORE
                    {
                    IGNORE154=(Token)match(input,IGNORE,FOLLOW_IGNORE_in_raise_function1449); 
                    IGNORE154_tree = 
                    (Object)adaptor.create(IGNORE154)
                    ;
                    adaptor.addChild(root_0, IGNORE154_tree);


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:253:42: ( ROLLBACK | ABORT | FAIL ) COMMA !error_message= STRING
                    {
                    set155=(Token)input.LT(1);

                    if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==ROLLBACK ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set155)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    COMMA156=(Token)match(input,COMMA,FOLLOW_COMMA_in_raise_function1465); 

                    error_message=(Token)match(input,STRING,FOLLOW_STRING_in_raise_function1470); 
                    error_message_tree = 
                    (Object)adaptor.create(error_message)
                    ;
                    adaptor.addChild(root_0, error_message_tree);


                    }
                    break;

            }


            RPAREN157=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_raise_function1473); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "raise_function"


    public static class type_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_name"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:1: type_name : (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) ;
    public final SqlParser.type_name_return type_name() throws RecognitionException {
        SqlParser.type_name_return retval = new SqlParser.type_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN158=null;
        Token COMMA159=null;
        Token RPAREN160=null;
        Token names=null;
        List list_names=null;
        SqlParser.signed_number_return size1 =null;

        SqlParser.signed_number_return size2 =null;


        Object LPAREN158_tree=null;
        Object COMMA159_tree=null;
        Object RPAREN160_tree=null;
        Object names_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_signed_number=new RewriteRuleSubtreeStream(adaptor,"rule signed_number");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:10: ( (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:12: (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:17: (names+= ID )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:17: names+= ID
            	    {
            	    names=(Token)match(input,ID,FOLLOW_ID_in_type_name1483);  
            	    stream_ID.add(names);

            	    if (list_names==null) list_names=new ArrayList();
            	    list_names.add(names);


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:23: ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==LPAREN) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:24: LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN
                    {
                    LPAREN158=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type_name1487);  
                    stream_LPAREN.add(LPAREN158);


                    pushFollow(FOLLOW_signed_number_in_type_name1491);
                    size1=signed_number();

                    state._fsp--;

                    stream_signed_number.add(size1.getTree());

                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:51: ( COMMA size2= signed_number )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==COMMA) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:255:52: COMMA size2= signed_number
                            {
                            COMMA159=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_name1494);  
                            stream_COMMA.add(COMMA159);


                            pushFollow(FOLLOW_signed_number_in_type_name1498);
                            size2=signed_number();

                            state._fsp--;

                            stream_signed_number.add(size2.getTree());

                            }
                            break;

                    }


                    RPAREN160=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_name1502);  
                    stream_RPAREN.add(RPAREN160);


                    }
                    break;

            }


            // AST REWRITE
            // elements: size1, names, size2
            // token labels: 
            // rule labels: retval, size2, size1
            // token list labels: names
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_names=new RewriteRuleTokenStream(adaptor,"token names", list_names);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_size2=new RewriteRuleSubtreeStream(adaptor,"rule size2",size2!=null?size2.tree:null);
            RewriteRuleSubtreeStream stream_size1=new RewriteRuleSubtreeStream(adaptor,"rule size1",size1!=null?size1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 256:50: -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:256:4: ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPE, "TYPE")
                , root_1);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:256:11: ^( TYPE_PARAMS ( $size1)? ( $size2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPE_PARAMS, "TYPE_PARAMS")
                , root_2);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:256:26: ( $size1)?
                if ( stream_size1.hasNext() ) {
                    adaptor.addChild(root_2, stream_size1.nextTree());

                }
                stream_size1.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:256:34: ( $size2)?
                if ( stream_size2.hasNext() ) {
                    adaptor.addChild(root_2, stream_size2.nextTree());

                }
                stream_size2.reset();

                adaptor.addChild(root_1, root_2);
                }

                if ( !(stream_names.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_names.hasNext() ) {
                    adaptor.addChild(root_1, stream_names.nextNode());

                }
                stream_names.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_name"


    public static class signed_number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "signed_number"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:258:1: signed_number : ( PLUS | MINUS )? ( INTEGER | FLOAT ) ;
    public final SqlParser.signed_number_return signed_number() throws RecognitionException {
        SqlParser.signed_number_return retval = new SqlParser.signed_number_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set161=null;
        Token set162=null;

        Object set161_tree=null;
        Object set162_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:258:14: ( ( PLUS | MINUS )? ( INTEGER | FLOAT ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:258:16: ( PLUS | MINUS )? ( INTEGER | FLOAT )
            {
            root_0 = (Object)adaptor.nil();


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:258:16: ( PLUS | MINUS )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==MINUS||LA49_0==PLUS) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
                    {
                    set161=(Token)input.LT(1);

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set161)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            set162=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==INTEGER ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set162)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "signed_number"


    public static class pragma_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pragma_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:261:1: pragma_stmt : PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? -> ^( PRAGMA ^( $pragma_name ( $database_name)? ) ( pragma_value )? ) ;
    public final SqlParser.pragma_stmt_return pragma_stmt() throws RecognitionException {
        SqlParser.pragma_stmt_return retval = new SqlParser.pragma_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRAGMA163=null;
        Token DOT164=null;
        Token EQUALS165=null;
        Token LPAREN167=null;
        Token RPAREN169=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return pragma_name =null;

        SqlParser.pragma_value_return pragma_value166 =null;

        SqlParser.pragma_value_return pragma_value168 =null;


        Object PRAGMA163_tree=null;
        Object DOT164_tree=null;
        Object EQUALS165_tree=null;
        Object LPAREN167_tree=null;
        Object RPAREN169_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_PRAGMA=new RewriteRuleTokenStream(adaptor,"token PRAGMA");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_pragma_value=new RewriteRuleSubtreeStream(adaptor,"rule pragma_value");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:261:12: ( PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? -> ^( PRAGMA ^( $pragma_name ( $database_name)? ) ( pragma_value )? ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:261:14: PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            {
            PRAGMA163=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma_stmt1556);  
            stream_PRAGMA.add(PRAGMA163);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:261:21: (database_name= id DOT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ID||LA50_0==STRING) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==DOT) ) {
                    alt50=1;
                }
            }
            else if ( ((LA50_0 >= ABORT && LA50_0 <= AFTER)||(LA50_0 >= ALL && LA50_0 <= ALTER)||(LA50_0 >= ANALYZE && LA50_0 <= AND)||(LA50_0 >= AS && LA50_0 <= ASC)||(LA50_0 >= ATTACH && LA50_0 <= AUTOINCREMENT)||(LA50_0 >= BEFORE && LA50_0 <= BETWEEN)||LA50_0==BY||(LA50_0 >= CASCADE && LA50_0 <= COLLATE)||LA50_0==COLUMN||(LA50_0 >= COMMIT && LA50_0 <= CONSTRAINT)||LA50_0==CREATE||(LA50_0 >= CROSS && LA50_0 <= CURRENT_TIMESTAMP)||(LA50_0 >= DATABASE && LA50_0 <= DISTINCT)||LA50_0==DROP||(LA50_0 >= EACH && LA50_0 <= END)||(LA50_0 >= ESCAPE && LA50_0 <= EXPLAIN)||LA50_0==FAIL||(LA50_0 >= FOR && LA50_0 <= FROM)||LA50_0==GROUP||LA50_0==HAVING||(LA50_0 >= IF && LA50_0 <= IMMEDIATE)||(LA50_0 >= INDEX && LA50_0 <= INSTEAD)||(LA50_0 >= INTERSECT && LA50_0 <= INTO)||LA50_0==IS||LA50_0==JOIN||LA50_0==KEY||LA50_0==LEFT||LA50_0==LIMIT||LA50_0==NATURAL||LA50_0==NULL||(LA50_0 >= OF && LA50_0 <= ON)||(LA50_0 >= OR && LA50_0 <= ORDER)||LA50_0==OUTER||LA50_0==PLAN||(LA50_0 >= PRAGMA && LA50_0 <= PRIMARY)||LA50_0==QUERY||(LA50_0 >= RAISE && LA50_0 <= REFERENCES)||(LA50_0 >= REINDEX && LA50_0 <= ROW)||(LA50_0 >= SAVEPOINT && LA50_0 <= SELECT)||LA50_0==SET||LA50_0==TABLE||(LA50_0 >= TEMPORARY && LA50_0 <= THEN)||(LA50_0 >= TO && LA50_0 <= TRIGGER)||(LA50_0 >= UNION && LA50_0 <= USING)||(LA50_0 >= VACUUM && LA50_0 <= VIRTUAL)||(LA50_0 >= WHEN && LA50_0 <= WHERE)) ) {
                int LA50_2 = input.LA(2);

                if ( (LA50_2==DOT) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:261:22: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_pragma_stmt1561);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());

                    DOT164=(Token)match(input,DOT,FOLLOW_DOT_in_pragma_stmt1563);  
                    stream_DOT.add(DOT164);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_pragma_stmt1569);
            pragma_name=id();

            state._fsp--;

            stream_id.add(pragma_name.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:261:60: ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            int alt51=3;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==EQUALS) ) {
                alt51=1;
            }
            else if ( (LA51_0==LPAREN) ) {
                alt51=2;
            }
            switch (alt51) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:261:61: EQUALS pragma_value
                    {
                    EQUALS165=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_pragma_stmt1572);  
                    stream_EQUALS.add(EQUALS165);


                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1574);
                    pragma_value166=pragma_value();

                    state._fsp--;

                    stream_pragma_value.add(pragma_value166.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:261:83: LPAREN pragma_value RPAREN
                    {
                    LPAREN167=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_pragma_stmt1578);  
                    stream_LPAREN.add(LPAREN167);


                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1580);
                    pragma_value168=pragma_value();

                    state._fsp--;

                    stream_pragma_value.add(pragma_value168.getTree());

                    RPAREN169=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_pragma_stmt1582);  
                    stream_RPAREN.add(RPAREN169);


                    }
                    break;

            }


            // AST REWRITE
            // elements: pragma_value, pragma_name, database_name, PRAGMA
            // token labels: 
            // rule labels: database_name, retval, pragma_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_pragma_name=new RewriteRuleSubtreeStream(adaptor,"rule pragma_name",pragma_name!=null?pragma_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 262:59: -> ^( PRAGMA ^( $pragma_name ( $database_name)? ) ( pragma_value )? )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:262:4: ^( PRAGMA ^( $pragma_name ( $database_name)? ) ( pragma_value )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_PRAGMA.nextNode()
                , root_1);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:262:13: ^( $pragma_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_pragma_name.nextNode(), root_2);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:262:29: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:262:45: ( pragma_value )?
                if ( stream_pragma_value.hasNext() ) {
                    adaptor.addChild(root_1, stream_pragma_value.nextTree());

                }
                stream_pragma_value.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pragma_stmt"


    public static class pragma_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pragma_value"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:264:1: pragma_value : ( signed_number -> ^( FLOAT_LITERAL signed_number ) | ID -> ^( ID_LITERAL ID ) | STRING -> ^( STRING_LITERAL STRING ) );
    public final SqlParser.pragma_value_return pragma_value() throws RecognitionException {
        SqlParser.pragma_value_return retval = new SqlParser.pragma_value_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID171=null;
        Token STRING172=null;
        SqlParser.signed_number_return signed_number170 =null;


        Object ID171_tree=null;
        Object STRING172_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_signed_number=new RewriteRuleSubtreeStream(adaptor,"rule signed_number");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:265:2: ( signed_number -> ^( FLOAT_LITERAL signed_number ) | ID -> ^( ID_LITERAL ID ) | STRING -> ^( STRING_LITERAL STRING ) )
            int alt52=3;
            switch ( input.LA(1) ) {
            case FLOAT:
            case INTEGER:
            case MINUS:
            case PLUS:
                {
                alt52=1;
                }
                break;
            case ID:
                {
                alt52=2;
                }
                break;
            case STRING:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }

            switch (alt52) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:265:4: signed_number
                    {
                    pushFollow(FOLLOW_signed_number_in_pragma_value1611);
                    signed_number170=signed_number();

                    state._fsp--;

                    stream_signed_number.add(signed_number170.getTree());

                    // AST REWRITE
                    // elements: signed_number
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 265:18: -> ^( FLOAT_LITERAL signed_number )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:265:21: ^( FLOAT_LITERAL signed_number )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FLOAT_LITERAL, "FLOAT_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, stream_signed_number.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:266:4: ID
                    {
                    ID171=(Token)match(input,ID,FOLLOW_ID_in_pragma_value1624);  
                    stream_ID.add(ID171);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 266:7: -> ^( ID_LITERAL ID )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:266:10: ^( ID_LITERAL ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ID_LITERAL, "ID_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:267:4: STRING
                    {
                    STRING172=(Token)match(input,STRING,FOLLOW_STRING_in_pragma_value1637);  
                    stream_STRING.add(STRING172);


                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 267:11: -> ^( STRING_LITERAL STRING )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:267:14: ^( STRING_LITERAL STRING )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STRING_LITERAL, "STRING_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_STRING.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pragma_value"


    public static class attach_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attach_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:271:1: attach_stmt : ATTACH ( DATABASE )? filename= id AS database_name= id ;
    public final SqlParser.attach_stmt_return attach_stmt() throws RecognitionException {
        SqlParser.attach_stmt_return retval = new SqlParser.attach_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ATTACH173=null;
        Token DATABASE174=null;
        Token AS175=null;
        SqlParser.id_return filename =null;

        SqlParser.id_return database_name =null;


        Object ATTACH173_tree=null;
        Object DATABASE174_tree=null;
        Object AS175_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:271:12: ( ATTACH ( DATABASE )? filename= id AS database_name= id )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:271:14: ATTACH ( DATABASE )? filename= id AS database_name= id
            {
            root_0 = (Object)adaptor.nil();


            ATTACH173=(Token)match(input,ATTACH,FOLLOW_ATTACH_in_attach_stmt1655); 
            ATTACH173_tree = 
            (Object)adaptor.create(ATTACH173)
            ;
            adaptor.addChild(root_0, ATTACH173_tree);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:271:21: ( DATABASE )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==DATABASE) ) {
                int LA53_1 = input.LA(2);

                if ( ((LA53_1 >= ABORT && LA53_1 <= AFTER)||(LA53_1 >= ALL && LA53_1 <= ALTER)||(LA53_1 >= ANALYZE && LA53_1 <= AND)||LA53_1==ASC||(LA53_1 >= ATTACH && LA53_1 <= AUTOINCREMENT)||(LA53_1 >= BEFORE && LA53_1 <= BETWEEN)||LA53_1==BY||(LA53_1 >= CASCADE && LA53_1 <= COLLATE)||LA53_1==COLUMN||(LA53_1 >= COMMIT && LA53_1 <= CONSTRAINT)||LA53_1==CREATE||(LA53_1 >= CROSS && LA53_1 <= CURRENT_TIMESTAMP)||(LA53_1 >= DATABASE && LA53_1 <= DISTINCT)||LA53_1==DROP||(LA53_1 >= EACH && LA53_1 <= END)||(LA53_1 >= ESCAPE && LA53_1 <= EXPLAIN)||LA53_1==FAIL||(LA53_1 >= FOR && LA53_1 <= FROM)||LA53_1==GROUP||LA53_1==HAVING||LA53_1==ID||(LA53_1 >= IF && LA53_1 <= IMMEDIATE)||(LA53_1 >= INDEX && LA53_1 <= INSTEAD)||(LA53_1 >= INTERSECT && LA53_1 <= INTO)||LA53_1==IS||LA53_1==JOIN||LA53_1==KEY||LA53_1==LEFT||LA53_1==LIMIT||LA53_1==NATURAL||LA53_1==NULL||(LA53_1 >= OF && LA53_1 <= ON)||(LA53_1 >= OR && LA53_1 <= ORDER)||LA53_1==OUTER||LA53_1==PLAN||(LA53_1 >= PRAGMA && LA53_1 <= PRIMARY)||LA53_1==QUERY||(LA53_1 >= RAISE && LA53_1 <= REFERENCES)||(LA53_1 >= REINDEX && LA53_1 <= ROW)||(LA53_1 >= SAVEPOINT && LA53_1 <= SELECT)||LA53_1==SET||LA53_1==STRING||LA53_1==TABLE||(LA53_1 >= TEMPORARY && LA53_1 <= THEN)||(LA53_1 >= TO && LA53_1 <= TRIGGER)||(LA53_1 >= UNION && LA53_1 <= USING)||(LA53_1 >= VACUUM && LA53_1 <= VIRTUAL)||(LA53_1 >= WHEN && LA53_1 <= WHERE)) ) {
                    alt53=1;
                }
                else if ( (LA53_1==AS) ) {
                    int LA53_5 = input.LA(3);

                    if ( (LA53_5==AS) ) {
                        int LA53_7 = input.LA(4);

                        if ( ((LA53_7 >= ABORT && LA53_7 <= AFTER)||(LA53_7 >= ALL && LA53_7 <= ALTER)||(LA53_7 >= ANALYZE && LA53_7 <= AND)||(LA53_7 >= AS && LA53_7 <= ASC)||(LA53_7 >= ATTACH && LA53_7 <= AUTOINCREMENT)||(LA53_7 >= BEFORE && LA53_7 <= BETWEEN)||LA53_7==BY||(LA53_7 >= CASCADE && LA53_7 <= COLLATE)||LA53_7==COLUMN||(LA53_7 >= COMMIT && LA53_7 <= CONSTRAINT)||LA53_7==CREATE||(LA53_7 >= CROSS && LA53_7 <= CURRENT_TIMESTAMP)||(LA53_7 >= DATABASE && LA53_7 <= DISTINCT)||LA53_7==DROP||(LA53_7 >= EACH && LA53_7 <= END)||(LA53_7 >= ESCAPE && LA53_7 <= EXPLAIN)||LA53_7==FAIL||(LA53_7 >= FOR && LA53_7 <= FROM)||LA53_7==GROUP||LA53_7==HAVING||LA53_7==ID||(LA53_7 >= IF && LA53_7 <= IMMEDIATE)||(LA53_7 >= INDEX && LA53_7 <= INSTEAD)||(LA53_7 >= INTERSECT && LA53_7 <= INTO)||LA53_7==IS||LA53_7==JOIN||LA53_7==KEY||LA53_7==LEFT||LA53_7==LIMIT||LA53_7==NATURAL||LA53_7==NULL||(LA53_7 >= OF && LA53_7 <= ON)||(LA53_7 >= OR && LA53_7 <= ORDER)||LA53_7==OUTER||LA53_7==PLAN||(LA53_7 >= PRAGMA && LA53_7 <= PRIMARY)||LA53_7==QUERY||(LA53_7 >= RAISE && LA53_7 <= REFERENCES)||(LA53_7 >= REINDEX && LA53_7 <= ROW)||(LA53_7 >= SAVEPOINT && LA53_7 <= SELECT)||LA53_7==SET||LA53_7==STRING||LA53_7==TABLE||(LA53_7 >= TEMPORARY && LA53_7 <= THEN)||(LA53_7 >= TO && LA53_7 <= TRIGGER)||(LA53_7 >= UNION && LA53_7 <= USING)||(LA53_7 >= VACUUM && LA53_7 <= VIRTUAL)||(LA53_7 >= WHEN && LA53_7 <= WHERE)) ) {
                            alt53=1;
                        }
                    }
                }
            }
            switch (alt53) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:271:22: DATABASE
                    {
                    DATABASE174=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_attach_stmt1658); 
                    DATABASE174_tree = 
                    (Object)adaptor.create(DATABASE174)
                    ;
                    adaptor.addChild(root_0, DATABASE174_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_attach_stmt1664);
            filename=id();

            state._fsp--;

            adaptor.addChild(root_0, filename.getTree());

            AS175=(Token)match(input,AS,FOLLOW_AS_in_attach_stmt1666); 
            AS175_tree = 
            (Object)adaptor.create(AS175)
            ;
            adaptor.addChild(root_0, AS175_tree);


            pushFollow(FOLLOW_id_in_attach_stmt1670);
            database_name=id();

            state._fsp--;

            adaptor.addChild(root_0, database_name.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attach_stmt"


    public static class detach_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "detach_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:274:1: detach_stmt : DETACH ( DATABASE )? database_name= id ;
    public final SqlParser.detach_stmt_return detach_stmt() throws RecognitionException {
        SqlParser.detach_stmt_return retval = new SqlParser.detach_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DETACH176=null;
        Token DATABASE177=null;
        SqlParser.id_return database_name =null;


        Object DETACH176_tree=null;
        Object DATABASE177_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:274:12: ( DETACH ( DATABASE )? database_name= id )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:274:14: DETACH ( DATABASE )? database_name= id
            {
            root_0 = (Object)adaptor.nil();


            DETACH176=(Token)match(input,DETACH,FOLLOW_DETACH_in_detach_stmt1678); 
            DETACH176_tree = 
            (Object)adaptor.create(DETACH176)
            ;
            adaptor.addChild(root_0, DETACH176_tree);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:274:21: ( DATABASE )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==DATABASE) ) {
                int LA54_1 = input.LA(2);

                if ( ((LA54_1 >= ABORT && LA54_1 <= AFTER)||(LA54_1 >= ALL && LA54_1 <= ALTER)||(LA54_1 >= ANALYZE && LA54_1 <= AND)||(LA54_1 >= AS && LA54_1 <= ASC)||(LA54_1 >= ATTACH && LA54_1 <= AUTOINCREMENT)||(LA54_1 >= BEFORE && LA54_1 <= BETWEEN)||LA54_1==BY||(LA54_1 >= CASCADE && LA54_1 <= COLLATE)||LA54_1==COLUMN||(LA54_1 >= COMMIT && LA54_1 <= CONSTRAINT)||LA54_1==CREATE||(LA54_1 >= CROSS && LA54_1 <= CURRENT_TIMESTAMP)||(LA54_1 >= DATABASE && LA54_1 <= DISTINCT)||LA54_1==DROP||(LA54_1 >= EACH && LA54_1 <= END)||(LA54_1 >= ESCAPE && LA54_1 <= EXPLAIN)||LA54_1==FAIL||(LA54_1 >= FOR && LA54_1 <= FROM)||LA54_1==GROUP||LA54_1==HAVING||LA54_1==ID||(LA54_1 >= IF && LA54_1 <= IMMEDIATE)||(LA54_1 >= INDEX && LA54_1 <= INSTEAD)||(LA54_1 >= INTERSECT && LA54_1 <= INTO)||LA54_1==IS||LA54_1==JOIN||LA54_1==KEY||LA54_1==LEFT||LA54_1==LIMIT||LA54_1==NATURAL||LA54_1==NULL||(LA54_1 >= OF && LA54_1 <= ON)||(LA54_1 >= OR && LA54_1 <= ORDER)||LA54_1==OUTER||LA54_1==PLAN||(LA54_1 >= PRAGMA && LA54_1 <= PRIMARY)||LA54_1==QUERY||(LA54_1 >= RAISE && LA54_1 <= REFERENCES)||(LA54_1 >= REINDEX && LA54_1 <= ROW)||(LA54_1 >= SAVEPOINT && LA54_1 <= SELECT)||LA54_1==SET||LA54_1==STRING||LA54_1==TABLE||(LA54_1 >= TEMPORARY && LA54_1 <= THEN)||(LA54_1 >= TO && LA54_1 <= TRIGGER)||(LA54_1 >= UNION && LA54_1 <= USING)||(LA54_1 >= VACUUM && LA54_1 <= VIRTUAL)||(LA54_1 >= WHEN && LA54_1 <= WHERE)) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:274:22: DATABASE
                    {
                    DATABASE177=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_detach_stmt1681); 
                    DATABASE177_tree = 
                    (Object)adaptor.create(DATABASE177)
                    ;
                    adaptor.addChild(root_0, DATABASE177_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_detach_stmt1687);
            database_name=id();

            state._fsp--;

            adaptor.addChild(root_0, database_name.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "detach_stmt"


    public static class analyze_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "analyze_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:277:1: analyze_stmt : ANALYZE (database_or_table_name= id |database_name= id DOT table_name= id )? ;
    public final SqlParser.analyze_stmt_return analyze_stmt() throws RecognitionException {
        SqlParser.analyze_stmt_return retval = new SqlParser.analyze_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ANALYZE178=null;
        Token DOT179=null;
        SqlParser.id_return database_or_table_name =null;

        SqlParser.id_return database_name =null;

        SqlParser.id_return table_name =null;


        Object ANALYZE178_tree=null;
        Object DOT179_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:277:13: ( ANALYZE (database_or_table_name= id |database_name= id DOT table_name= id )? )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:277:15: ANALYZE (database_or_table_name= id |database_name= id DOT table_name= id )?
            {
            root_0 = (Object)adaptor.nil();


            ANALYZE178=(Token)match(input,ANALYZE,FOLLOW_ANALYZE_in_analyze_stmt1695); 
            ANALYZE178_tree = 
            (Object)adaptor.create(ANALYZE178)
            ;
            adaptor.addChild(root_0, ANALYZE178_tree);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:277:23: (database_or_table_name= id |database_name= id DOT table_name= id )?
            int alt55=3;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ID||LA55_0==STRING) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==EOF||LA55_1==SEMI) ) {
                    alt55=1;
                }
                else if ( (LA55_1==DOT) ) {
                    alt55=2;
                }
            }
            else if ( ((LA55_0 >= ABORT && LA55_0 <= AFTER)||(LA55_0 >= ALL && LA55_0 <= ALTER)||(LA55_0 >= ANALYZE && LA55_0 <= AND)||(LA55_0 >= AS && LA55_0 <= ASC)||(LA55_0 >= ATTACH && LA55_0 <= AUTOINCREMENT)||(LA55_0 >= BEFORE && LA55_0 <= BETWEEN)||LA55_0==BY||(LA55_0 >= CASCADE && LA55_0 <= COLLATE)||LA55_0==COLUMN||(LA55_0 >= COMMIT && LA55_0 <= CONSTRAINT)||LA55_0==CREATE||(LA55_0 >= CROSS && LA55_0 <= CURRENT_TIMESTAMP)||(LA55_0 >= DATABASE && LA55_0 <= DISTINCT)||LA55_0==DROP||(LA55_0 >= EACH && LA55_0 <= END)||(LA55_0 >= ESCAPE && LA55_0 <= EXPLAIN)||LA55_0==FAIL||(LA55_0 >= FOR && LA55_0 <= FROM)||LA55_0==GROUP||LA55_0==HAVING||(LA55_0 >= IF && LA55_0 <= IMMEDIATE)||(LA55_0 >= INDEX && LA55_0 <= INSTEAD)||(LA55_0 >= INTERSECT && LA55_0 <= INTO)||LA55_0==IS||LA55_0==JOIN||LA55_0==KEY||LA55_0==LEFT||LA55_0==LIMIT||LA55_0==NATURAL||LA55_0==NULL||(LA55_0 >= OF && LA55_0 <= ON)||(LA55_0 >= OR && LA55_0 <= ORDER)||LA55_0==OUTER||LA55_0==PLAN||(LA55_0 >= PRAGMA && LA55_0 <= PRIMARY)||LA55_0==QUERY||(LA55_0 >= RAISE && LA55_0 <= REFERENCES)||(LA55_0 >= REINDEX && LA55_0 <= ROW)||(LA55_0 >= SAVEPOINT && LA55_0 <= SELECT)||LA55_0==SET||LA55_0==TABLE||(LA55_0 >= TEMPORARY && LA55_0 <= THEN)||(LA55_0 >= TO && LA55_0 <= TRIGGER)||(LA55_0 >= UNION && LA55_0 <= USING)||(LA55_0 >= VACUUM && LA55_0 <= VIRTUAL)||(LA55_0 >= WHEN && LA55_0 <= WHERE)) ) {
                int LA55_2 = input.LA(2);

                if ( (LA55_2==EOF||LA55_2==SEMI) ) {
                    alt55=1;
                }
                else if ( (LA55_2==DOT) ) {
                    alt55=2;
                }
            }
            switch (alt55) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:277:24: database_or_table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1700);
                    database_or_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_or_table_name.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:277:52: database_name= id DOT table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1706);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());

                    DOT179=(Token)match(input,DOT,FOLLOW_DOT_in_analyze_stmt1708); 
                    DOT179_tree = 
                    (Object)adaptor.create(DOT179)
                    ;
                    adaptor.addChild(root_0, DOT179_tree);


                    pushFollow(FOLLOW_id_in_analyze_stmt1712);
                    table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, table_name.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "analyze_stmt"


    public static class reindex_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "reindex_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:280:1: reindex_stmt : REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id ;
    public final SqlParser.reindex_stmt_return reindex_stmt() throws RecognitionException {
        SqlParser.reindex_stmt_return retval = new SqlParser.reindex_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token REINDEX180=null;
        Token DOT181=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return collation_or_table_or_index_name =null;


        Object REINDEX180_tree=null;
        Object DOT181_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:280:13: ( REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:280:15: REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id
            {
            root_0 = (Object)adaptor.nil();


            REINDEX180=(Token)match(input,REINDEX,FOLLOW_REINDEX_in_reindex_stmt1722); 
            REINDEX180_tree = 
            (Object)adaptor.create(REINDEX180)
            ;
            adaptor.addChild(root_0, REINDEX180_tree);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:280:23: (database_name= id DOT )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==ID||LA56_0==STRING) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==DOT) ) {
                    alt56=1;
                }
            }
            else if ( ((LA56_0 >= ABORT && LA56_0 <= AFTER)||(LA56_0 >= ALL && LA56_0 <= ALTER)||(LA56_0 >= ANALYZE && LA56_0 <= AND)||(LA56_0 >= AS && LA56_0 <= ASC)||(LA56_0 >= ATTACH && LA56_0 <= AUTOINCREMENT)||(LA56_0 >= BEFORE && LA56_0 <= BETWEEN)||LA56_0==BY||(LA56_0 >= CASCADE && LA56_0 <= COLLATE)||LA56_0==COLUMN||(LA56_0 >= COMMIT && LA56_0 <= CONSTRAINT)||LA56_0==CREATE||(LA56_0 >= CROSS && LA56_0 <= CURRENT_TIMESTAMP)||(LA56_0 >= DATABASE && LA56_0 <= DISTINCT)||LA56_0==DROP||(LA56_0 >= EACH && LA56_0 <= END)||(LA56_0 >= ESCAPE && LA56_0 <= EXPLAIN)||LA56_0==FAIL||(LA56_0 >= FOR && LA56_0 <= FROM)||LA56_0==GROUP||LA56_0==HAVING||(LA56_0 >= IF && LA56_0 <= IMMEDIATE)||(LA56_0 >= INDEX && LA56_0 <= INSTEAD)||(LA56_0 >= INTERSECT && LA56_0 <= INTO)||LA56_0==IS||LA56_0==JOIN||LA56_0==KEY||LA56_0==LEFT||LA56_0==LIMIT||LA56_0==NATURAL||LA56_0==NULL||(LA56_0 >= OF && LA56_0 <= ON)||(LA56_0 >= OR && LA56_0 <= ORDER)||LA56_0==OUTER||LA56_0==PLAN||(LA56_0 >= PRAGMA && LA56_0 <= PRIMARY)||LA56_0==QUERY||(LA56_0 >= RAISE && LA56_0 <= REFERENCES)||(LA56_0 >= REINDEX && LA56_0 <= ROW)||(LA56_0 >= SAVEPOINT && LA56_0 <= SELECT)||LA56_0==SET||LA56_0==TABLE||(LA56_0 >= TEMPORARY && LA56_0 <= THEN)||(LA56_0 >= TO && LA56_0 <= TRIGGER)||(LA56_0 >= UNION && LA56_0 <= USING)||(LA56_0 >= VACUUM && LA56_0 <= VIRTUAL)||(LA56_0 >= WHEN && LA56_0 <= WHERE)) ) {
                int LA56_2 = input.LA(2);

                if ( (LA56_2==DOT) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:280:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_reindex_stmt1727);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());

                    DOT181=(Token)match(input,DOT,FOLLOW_DOT_in_reindex_stmt1729); 
                    DOT181_tree = 
                    (Object)adaptor.create(DOT181)
                    ;
                    adaptor.addChild(root_0, DOT181_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_reindex_stmt1735);
            collation_or_table_or_index_name=id();

            state._fsp--;

            adaptor.addChild(root_0, collation_or_table_or_index_name.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "reindex_stmt"


    public static class vacuum_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vacuum_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:283:1: vacuum_stmt : VACUUM ;
    public final SqlParser.vacuum_stmt_return vacuum_stmt() throws RecognitionException {
        SqlParser.vacuum_stmt_return retval = new SqlParser.vacuum_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VACUUM182=null;

        Object VACUUM182_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:283:12: ( VACUUM )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:283:14: VACUUM
            {
            root_0 = (Object)adaptor.nil();


            VACUUM182=(Token)match(input,VACUUM,FOLLOW_VACUUM_in_vacuum_stmt1743); 
            VACUUM182_tree = 
            (Object)adaptor.create(VACUUM182)
            ;
            adaptor.addChild(root_0, VACUUM182_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "vacuum_stmt"


    public static class operation_conflict_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operation_conflict_clause"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:289:1: operation_conflict_clause : OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.operation_conflict_clause_return operation_conflict_clause() throws RecognitionException {
        SqlParser.operation_conflict_clause_return retval = new SqlParser.operation_conflict_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OR183=null;
        Token set184=null;

        Object OR183_tree=null;
        Object set184_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:289:26: ( OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:289:28: OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();


            OR183=(Token)match(input,OR,FOLLOW_OR_in_operation_conflict_clause1754); 
            OR183_tree = 
            (Object)adaptor.create(OR183)
            ;
            adaptor.addChild(root_0, OR183_tree);


            set184=(Token)input.LT(1);

            if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==IGNORE||input.LA(1)==REPLACE||input.LA(1)==ROLLBACK ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set184)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operation_conflict_clause"


    public static class ordering_term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ordering_term"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:291:1: ordering_term : expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) ;
    public final SqlParser.ordering_term_return ordering_term() throws RecognitionException {
        SqlParser.ordering_term_return retval = new SqlParser.ordering_term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASC186=null;
        Token DESC187=null;
        SqlParser.expr_return expr185 =null;


        Object ASC186_tree=null;
        Object DESC187_tree=null;
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:291:14: ( expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:291:16: expr ( ASC | DESC )?
            {
            pushFollow(FOLLOW_expr_in_ordering_term1781);
            expr185=expr();

            state._fsp--;

            stream_expr.add(expr185.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:291:82: ( ASC | DESC )?
            int alt57=3;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==ASC) ) {
                alt57=1;
            }
            else if ( (LA57_0==DESC) ) {
                alt57=2;
            }
            switch (alt57) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:291:83: ASC
                    {
                    ASC186=(Token)match(input,ASC,FOLLOW_ASC_in_ordering_term1786);  
                    stream_ASC.add(ASC186);


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:291:89: DESC
                    {
                    DESC187=(Token)match(input,DESC,FOLLOW_DESC_in_ordering_term1790);  
                    stream_DESC.add(DESC187);


                    }
                    break;

            }


            // AST REWRITE
            // elements: DESC, expr, ASC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 292:35: -> ^( ORDERING expr ( ASC )? ( DESC )? )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:292:4: ^( ORDERING expr ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ORDERING, "ORDERING")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:292:20: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ASC.nextNode()
                    );

                }
                stream_ASC.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:292:27: ( DESC )?
                if ( stream_DESC.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DESC.nextNode()
                    );

                }
                stream_DESC.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ordering_term"


    public static class operation_limited_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operation_limited_clause"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:294:1: operation_limited_clause : ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? ;
    public final SqlParser.operation_limited_clause_return operation_limited_clause() throws RecognitionException {
        SqlParser.operation_limited_clause_return retval = new SqlParser.operation_limited_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER188=null;
        Token BY189=null;
        Token COMMA191=null;
        Token LIMIT193=null;
        Token set194=null;
        SqlParser.ordering_term_return ordering_term190 =null;

        SqlParser.ordering_term_return ordering_term192 =null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER188_tree=null;
        Object BY189_tree=null;
        Object COMMA191_tree=null;
        Object LIMIT193_tree=null;
        Object set194_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:294:25: ( ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:295:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
            {
            root_0 = (Object)adaptor.nil();


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:295:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==ORDER) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:295:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER188=(Token)match(input,ORDER,FOLLOW_ORDER_in_operation_limited_clause1820); 
                    ORDER188_tree = 
                    (Object)adaptor.create(ORDER188)
                    ;
                    adaptor.addChild(root_0, ORDER188_tree);


                    BY189=(Token)match(input,BY,FOLLOW_BY_in_operation_limited_clause1822); 
                    BY189_tree = 
                    (Object)adaptor.create(BY189)
                    ;
                    adaptor.addChild(root_0, BY189_tree);


                    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1824);
                    ordering_term190=ordering_term();

                    state._fsp--;

                    adaptor.addChild(root_0, ordering_term190.getTree());

                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:295:27: ( COMMA ordering_term )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==COMMA) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:295:28: COMMA ordering_term
                    	    {
                    	    COMMA191=(Token)match(input,COMMA,FOLLOW_COMMA_in_operation_limited_clause1827); 
                    	    COMMA191_tree = 
                    	    (Object)adaptor.create(COMMA191)
                    	    ;
                    	    adaptor.addChild(root_0, COMMA191_tree);


                    	    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1829);
                    	    ordering_term192=ordering_term();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, ordering_term192.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;

            }


            LIMIT193=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_operation_limited_clause1837); 
            LIMIT193_tree = 
            (Object)adaptor.create(LIMIT193)
            ;
            adaptor.addChild(root_0, LIMIT193_tree);


            limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1841); 
            limit_tree = 
            (Object)adaptor.create(limit)
            ;
            adaptor.addChild(root_0, limit_tree);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:296:23: ( ( OFFSET | COMMA ) offset= INTEGER )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==COMMA||LA60_0==OFFSET) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:296:24: ( OFFSET | COMMA ) offset= INTEGER
                    {
                    set194=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==OFFSET ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set194)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1854); 
                    offset_tree = 
                    (Object)adaptor.create(offset)
                    ;
                    adaptor.addChild(root_0, offset_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operation_limited_clause"


    public static class select_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:299:1: select_stmt : select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) ;
    public final SqlParser.select_stmt_return select_stmt() throws RecognitionException {
        SqlParser.select_stmt_return retval = new SqlParser.select_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER196=null;
        Token BY197=null;
        Token COMMA199=null;
        Token LIMIT201=null;
        Token OFFSET202=null;
        Token COMMA203=null;
        SqlParser.select_list_return select_list195 =null;

        SqlParser.ordering_term_return ordering_term198 =null;

        SqlParser.ordering_term_return ordering_term200 =null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER196_tree=null;
        Object BY197_tree=null;
        Object COMMA199_tree=null;
        Object LIMIT201_tree=null;
        Object OFFSET202_tree=null;
        Object COMMA203_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleTokenStream stream_OFFSET=new RewriteRuleTokenStream(adaptor,"token OFFSET");
        RewriteRuleSubtreeStream stream_select_list=new RewriteRuleSubtreeStream(adaptor,"rule select_list");
        RewriteRuleSubtreeStream stream_ordering_term=new RewriteRuleSubtreeStream(adaptor,"rule ordering_term");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:299:12: ( select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:299:14: select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            {
            pushFollow(FOLLOW_select_list_in_select_stmt1864);
            select_list195=select_list();

            state._fsp--;

            stream_select_list.add(select_list195.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:300:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==ORDER) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:300:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER196=(Token)match(input,ORDER,FOLLOW_ORDER_in_select_stmt1869);  
                    stream_ORDER.add(ORDER196);


                    BY197=(Token)match(input,BY,FOLLOW_BY_in_select_stmt1871);  
                    stream_BY.add(BY197);


                    pushFollow(FOLLOW_ordering_term_in_select_stmt1873);
                    ordering_term198=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term198.getTree());

                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:300:27: ( COMMA ordering_term )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==COMMA) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:300:28: COMMA ordering_term
                    	    {
                    	    COMMA199=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1876);  
                    	    stream_COMMA.add(COMMA199);


                    	    pushFollow(FOLLOW_ordering_term_in_select_stmt1878);
                    	    ordering_term200=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term200.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:301:3: ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LIMIT) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:301:4: LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
                    {
                    LIMIT201=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_select_stmt1887);  
                    stream_LIMIT.add(LIMIT201);


                    limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1891);  
                    stream_INTEGER.add(limit);


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:301:24: ( ( OFFSET | COMMA ) offset= INTEGER )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==COMMA||LA64_0==OFFSET) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:301:25: ( OFFSET | COMMA ) offset= INTEGER
                            {
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:301:25: ( OFFSET | COMMA )
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==OFFSET) ) {
                                alt63=1;
                            }
                            else if ( (LA63_0==COMMA) ) {
                                alt63=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 63, 0, input);

                                throw nvae;

                            }
                            switch (alt63) {
                                case 1 :
                                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:301:26: OFFSET
                                    {
                                    OFFSET202=(Token)match(input,OFFSET,FOLLOW_OFFSET_in_select_stmt1895);  
                                    stream_OFFSET.add(OFFSET202);


                                    }
                                    break;
                                case 2 :
                                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:301:35: COMMA
                                    {
                                    COMMA203=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1899);  
                                    stream_COMMA.add(COMMA203);


                                    }
                                    break;

                            }


                            offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1904);  
                            stream_INTEGER.add(offset);


                            }
                            break;

                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: select_list, limit, LIMIT, ordering_term, ORDER, offset
            // token labels: limit, offset
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_limit=new RewriteRuleTokenStream(adaptor,"token limit",limit);
            RewriteRuleTokenStream stream_offset=new RewriteRuleTokenStream(adaptor,"token offset",offset);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 302:2: -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:302:4: ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SELECT, "SELECT")
                , root_1);

                adaptor.addChild(root_1, stream_select_list.nextTree());

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:303:22: ( ^( ORDER ( ordering_term )+ ) )?
                if ( stream_ordering_term.hasNext()||stream_ORDER.hasNext() ) {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:303:22: ^( ORDER ( ordering_term )+ )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    stream_ORDER.nextNode()
                    , root_2);

                    if ( !(stream_ordering_term.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_ordering_term.hasNext() ) {
                        adaptor.addChild(root_2, stream_ordering_term.nextTree());

                    }
                    stream_ordering_term.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_ordering_term.reset();
                stream_ORDER.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:303:47: ( ^( LIMIT $limit ( $offset)? ) )?
                if ( stream_limit.hasNext()||stream_LIMIT.hasNext()||stream_offset.hasNext() ) {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:303:47: ^( LIMIT $limit ( $offset)? )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    stream_LIMIT.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, stream_limit.nextNode());

                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:303:63: ( $offset)?
                    if ( stream_offset.hasNext() ) {
                        adaptor.addChild(root_2, stream_offset.nextNode());

                    }
                    stream_offset.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_limit.reset();
                stream_LIMIT.reset();
                stream_offset.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_stmt"


    public static class select_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_list"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:306:1: select_list : select_core ( select_op ^ select_core )* ;
    public final SqlParser.select_list_return select_list() throws RecognitionException {
        SqlParser.select_list_return retval = new SqlParser.select_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlParser.select_core_return select_core204 =null;

        SqlParser.select_op_return select_op205 =null;

        SqlParser.select_core_return select_core206 =null;



        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:306:12: ( select_core ( select_op ^ select_core )* )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:307:3: select_core ( select_op ^ select_core )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_select_core_in_select_list1949);
            select_core204=select_core();

            state._fsp--;

            adaptor.addChild(root_0, select_core204.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:307:15: ( select_op ^ select_core )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==EXCEPT||LA66_0==INTERSECT||LA66_0==UNION) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:307:16: select_op ^ select_core
            	    {
            	    pushFollow(FOLLOW_select_op_in_select_list1952);
            	    select_op205=select_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(select_op205.getTree(), root_0);

            	    pushFollow(FOLLOW_select_core_in_select_list1955);
            	    select_core206=select_core();

            	    state._fsp--;

            	    adaptor.addChild(root_0, select_core206.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_list"


    public static class select_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_op"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:309:1: select_op : ( UNION ^ ( ALL )? | INTERSECT | EXCEPT );
    public final SqlParser.select_op_return select_op() throws RecognitionException {
        SqlParser.select_op_return retval = new SqlParser.select_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token UNION207=null;
        Token ALL208=null;
        Token INTERSECT209=null;
        Token EXCEPT210=null;

        Object UNION207_tree=null;
        Object ALL208_tree=null;
        Object INTERSECT209_tree=null;
        Object EXCEPT210_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:309:10: ( UNION ^ ( ALL )? | INTERSECT | EXCEPT )
            int alt68=3;
            switch ( input.LA(1) ) {
            case UNION:
                {
                alt68=1;
                }
                break;
            case INTERSECT:
                {
                alt68=2;
                }
                break;
            case EXCEPT:
                {
                alt68=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;

            }

            switch (alt68) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:309:12: UNION ^ ( ALL )?
                    {
                    root_0 = (Object)adaptor.nil();


                    UNION207=(Token)match(input,UNION,FOLLOW_UNION_in_select_op1964); 
                    UNION207_tree = 
                    (Object)adaptor.create(UNION207)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(UNION207_tree, root_0);


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:309:19: ( ALL )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==ALL) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:309:20: ALL
                            {
                            ALL208=(Token)match(input,ALL,FOLLOW_ALL_in_select_op1968); 
                            ALL208_tree = 
                            (Object)adaptor.create(ALL208)
                            ;
                            adaptor.addChild(root_0, ALL208_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:309:28: INTERSECT
                    {
                    root_0 = (Object)adaptor.nil();


                    INTERSECT209=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_select_op1974); 
                    INTERSECT209_tree = 
                    (Object)adaptor.create(INTERSECT209)
                    ;
                    adaptor.addChild(root_0, INTERSECT209_tree);


                    }
                    break;
                case 3 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:309:40: EXCEPT
                    {
                    root_0 = (Object)adaptor.nil();


                    EXCEPT210=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_select_op1978); 
                    EXCEPT210_tree = 
                    (Object)adaptor.create(EXCEPT210)
                    ;
                    adaptor.addChild(root_0, EXCEPT210_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_op"


    public static class select_core_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_core"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:311:1: select_core : SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) ;
    public final SqlParser.select_core_return select_core() throws RecognitionException {
        SqlParser.select_core_return retval = new SqlParser.select_core_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SELECT211=null;
        Token ALL212=null;
        Token DISTINCT213=null;
        Token COMMA215=null;
        Token FROM217=null;
        Token WHERE219=null;
        Token GROUP220=null;
        Token BY221=null;
        Token COMMA223=null;
        Token HAVING225=null;
        SqlParser.expr_return where_expr =null;

        SqlParser.expr_return having_expr =null;

        SqlParser.result_column_return result_column214 =null;

        SqlParser.result_column_return result_column216 =null;

        SqlParser.join_source_return join_source218 =null;

        SqlParser.ordering_term_return ordering_term222 =null;

        SqlParser.ordering_term_return ordering_term224 =null;


        Object SELECT211_tree=null;
        Object ALL212_tree=null;
        Object DISTINCT213_tree=null;
        Object COMMA215_tree=null;
        Object FROM217_tree=null;
        Object WHERE219_tree=null;
        Object GROUP220_tree=null;
        Object BY221_tree=null;
        Object COMMA223_tree=null;
        Object HAVING225_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleTokenStream stream_GROUP=new RewriteRuleTokenStream(adaptor,"token GROUP");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_HAVING=new RewriteRuleTokenStream(adaptor,"token HAVING");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
        RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
        RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");
        RewriteRuleSubtreeStream stream_ordering_term=new RewriteRuleSubtreeStream(adaptor,"rule ordering_term");
        RewriteRuleSubtreeStream stream_result_column=new RewriteRuleSubtreeStream(adaptor,"rule result_column");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_join_source=new RewriteRuleSubtreeStream(adaptor,"rule join_source");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:311:12: ( SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:3: SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            {
            SELECT211=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_core1987);  
            stream_SELECT.add(SELECT211);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:10: ( ALL | DISTINCT )?
            int alt69=3;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:11: ALL
                    {
                    ALL212=(Token)match(input,ALL,FOLLOW_ALL_in_select_core1990);  
                    stream_ALL.add(ALL212);


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:17: DISTINCT
                    {
                    DISTINCT213=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_select_core1994);  
                    stream_DISTINCT.add(DISTINCT213);


                    }
                    break;

            }


            pushFollow(FOLLOW_result_column_in_select_core1998);
            result_column214=result_column();

            state._fsp--;

            stream_result_column.add(result_column214.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:42: ( COMMA result_column )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==COMMA) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:43: COMMA result_column
            	    {
            	    COMMA215=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core2001);  
            	    stream_COMMA.add(COMMA215);


            	    pushFollow(FOLLOW_result_column_in_select_core2003);
            	    result_column216=result_column();

            	    state._fsp--;

            	    stream_result_column.add(result_column216.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:65: ( FROM join_source )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==FROM) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:66: FROM join_source
                    {
                    FROM217=(Token)match(input,FROM,FOLLOW_FROM_in_select_core2008);  
                    stream_FROM.add(FROM217);


                    pushFollow(FOLLOW_join_source_in_select_core2010);
                    join_source218=join_source();

                    state._fsp--;

                    stream_join_source.add(join_source218.getTree());

                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:85: ( WHERE where_expr= expr )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==WHERE) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:312:86: WHERE where_expr= expr
                    {
                    WHERE219=(Token)match(input,WHERE,FOLLOW_WHERE_in_select_core2015);  
                    stream_WHERE.add(WHERE219);


                    pushFollow(FOLLOW_expr_in_select_core2019);
                    where_expr=expr();

                    state._fsp--;

                    stream_expr.add(where_expr.getTree());

                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:313:3: ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==GROUP) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:313:5: GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )?
                    {
                    GROUP220=(Token)match(input,GROUP,FOLLOW_GROUP_in_select_core2027);  
                    stream_GROUP.add(GROUP220);


                    BY221=(Token)match(input,BY,FOLLOW_BY_in_select_core2029);  
                    stream_BY.add(BY221);


                    pushFollow(FOLLOW_ordering_term_in_select_core2031);
                    ordering_term222=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term222.getTree());

                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:313:28: ( COMMA ordering_term )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==COMMA) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:313:29: COMMA ordering_term
                    	    {
                    	    COMMA223=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core2034);  
                    	    stream_COMMA.add(COMMA223);


                    	    pushFollow(FOLLOW_ordering_term_in_select_core2036);
                    	    ordering_term224=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term224.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:313:51: ( HAVING having_expr= expr )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==HAVING) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:313:52: HAVING having_expr= expr
                            {
                            HAVING225=(Token)match(input,HAVING,FOLLOW_HAVING_in_select_core2041);  
                            stream_HAVING.add(HAVING225);


                            pushFollow(FOLLOW_expr_in_select_core2045);
                            having_expr=expr();

                            state._fsp--;

                            stream_expr.add(having_expr.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: where_expr, result_column, HAVING, WHERE, join_source, FROM, DISTINCT, ordering_term, GROUP, having_expr
            // token labels: 
            // rule labels: retval, having_expr, where_expr
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_having_expr=new RewriteRuleSubtreeStream(adaptor,"rule having_expr",having_expr!=null?having_expr.tree:null);
            RewriteRuleSubtreeStream stream_where_expr=new RewriteRuleSubtreeStream(adaptor,"rule where_expr",where_expr!=null?where_expr.tree:null);

            root_0 = (Object)adaptor.nil();
            // 314:2: -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:314:4: ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SELECT_CORE, "SELECT_CORE")
                , root_1);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:315:15: ( DISTINCT )?
                if ( stream_DISTINCT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DISTINCT.nextNode()
                    );

                }
                stream_DISTINCT.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:315:27: ^( COLUMNS ( result_column )+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLUMNS, "COLUMNS")
                , root_2);

                if ( !(stream_result_column.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_result_column.hasNext() ) {
                    adaptor.addChild(root_2, stream_result_column.nextTree());

                }
                stream_result_column.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:315:53: ( ^( FROM join_source ) )?
                if ( stream_join_source.hasNext()||stream_FROM.hasNext() ) {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:315:53: ^( FROM join_source )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    stream_FROM.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, stream_join_source.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_join_source.reset();
                stream_FROM.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:315:74: ( ^( WHERE $where_expr) )?
                if ( stream_where_expr.hasNext()||stream_WHERE.hasNext() ) {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:315:74: ^( WHERE $where_expr)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    stream_WHERE.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, stream_where_expr.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_where_expr.reset();
                stream_WHERE.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:316:3: ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )?
                if ( stream_HAVING.hasNext()||stream_ordering_term.hasNext()||stream_GROUP.hasNext()||stream_having_expr.hasNext() ) {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:316:3: ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    stream_GROUP.nextNode()
                    , root_2);

                    if ( !(stream_ordering_term.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_ordering_term.hasNext() ) {
                        adaptor.addChild(root_2, stream_ordering_term.nextTree());

                    }
                    stream_ordering_term.reset();

                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:316:26: ( ^( HAVING $having_expr) )?
                    if ( stream_HAVING.hasNext()||stream_having_expr.hasNext() ) {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:316:26: ^( HAVING $having_expr)
                        {
                        Object root_3 = (Object)adaptor.nil();
                        root_3 = (Object)adaptor.becomeRoot(
                        stream_HAVING.nextNode()
                        , root_3);

                        adaptor.addChild(root_3, stream_having_expr.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                    }
                    stream_HAVING.reset();
                    stream_having_expr.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_HAVING.reset();
                stream_ordering_term.reset();
                stream_GROUP.reset();
                stream_having_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_core"


    public static class result_column_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "result_column"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:319:1: result_column : ( ASTERISK |table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );
    public final SqlParser.result_column_return result_column() throws RecognitionException {
        SqlParser.result_column_return retval = new SqlParser.result_column_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASTERISK226=null;
        Token DOT227=null;
        Token ASTERISK228=null;
        Token AS230=null;
        SqlParser.id_return table_name =null;

        SqlParser.id_return column_alias =null;

        SqlParser.expr_return expr229 =null;


        Object ASTERISK226_tree=null;
        Object DOT227_tree=null;
        Object ASTERISK228_tree=null;
        Object AS230_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:320:3: ( ASTERISK |table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) )
            int alt78=3;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:320:5: ASTERISK
                    {
                    root_0 = (Object)adaptor.nil();


                    ASTERISK226=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column2115); 
                    ASTERISK226_tree = 
                    (Object)adaptor.create(ASTERISK226)
                    ;
                    adaptor.addChild(root_0, ASTERISK226_tree);


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:321:5: table_name= id DOT ASTERISK
                    {
                    pushFollow(FOLLOW_id_in_result_column2123);
                    table_name=id();

                    state._fsp--;

                    stream_id.add(table_name.getTree());

                    DOT227=(Token)match(input,DOT,FOLLOW_DOT_in_result_column2125);  
                    stream_DOT.add(DOT227);


                    ASTERISK228=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column2127);  
                    stream_ASTERISK.add(ASTERISK228);


                    // AST REWRITE
                    // elements: ASTERISK, table_name
                    // token labels: 
                    // rule labels: retval, table_name
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 321:32: -> ^( ASTERISK $table_name)
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:321:35: ^( ASTERISK $table_name)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ASTERISK.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_table_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:322:5: expr ( ( AS )? column_alias= id )?
                    {
                    pushFollow(FOLLOW_expr_in_result_column2142);
                    expr229=expr();

                    state._fsp--;

                    stream_expr.add(expr229.getTree());

                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:322:10: ( ( AS )? column_alias= id )?
                    int alt77=2;
                    alt77 = dfa77.predict(input);
                    switch (alt77) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:322:11: ( AS )? column_alias= id
                            {
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:322:11: ( AS )?
                            int alt76=2;
                            alt76 = dfa76.predict(input);
                            switch (alt76) {
                                case 1 :
                                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:322:12: AS
                                    {
                                    AS230=(Token)match(input,AS,FOLLOW_AS_in_result_column2146);  
                                    stream_AS.add(AS230);


                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_id_in_result_column2152);
                            column_alias=id();

                            state._fsp--;

                            stream_id.add(column_alias.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: expr, column_alias
                    // token labels: 
                    // rule labels: retval, column_alias
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_column_alias=new RewriteRuleSubtreeStream(adaptor,"rule column_alias",column_alias!=null?column_alias.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 322:35: -> ^( ALIAS expr ( $column_alias)? )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:322:38: ^( ALIAS expr ( $column_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ALIAS, "ALIAS")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:322:52: ( $column_alias)?
                        if ( stream_column_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_column_alias.nextTree());

                        }
                        stream_column_alias.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "result_column"


    public static class join_source_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "join_source"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:324:1: join_source : single_source ( join_op ^ single_source ( join_constraint )? )* ;
    public final SqlParser.join_source_return join_source() throws RecognitionException {
        SqlParser.join_source_return retval = new SqlParser.join_source_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlParser.single_source_return single_source231 =null;

        SqlParser.join_op_return join_op232 =null;

        SqlParser.single_source_return single_source233 =null;

        SqlParser.join_constraint_return join_constraint234 =null;



        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:324:12: ( single_source ( join_op ^ single_source ( join_constraint )? )* )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:324:14: single_source ( join_op ^ single_source ( join_constraint )? )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_single_source_in_join_source2173);
            single_source231=single_source();

            state._fsp--;

            adaptor.addChild(root_0, single_source231.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:324:28: ( join_op ^ single_source ( join_constraint )? )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==COMMA||LA80_0==CROSS||LA80_0==INNER||LA80_0==JOIN||LA80_0==LEFT||LA80_0==NATURAL||LA80_0==OUTER) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:324:29: join_op ^ single_source ( join_constraint )?
            	    {
            	    pushFollow(FOLLOW_join_op_in_join_source2176);
            	    join_op232=join_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(join_op232.getTree(), root_0);

            	    pushFollow(FOLLOW_single_source_in_join_source2179);
            	    single_source233=single_source();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_source233.getTree());

            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:324:52: ( join_constraint )?
            	    int alt79=2;
            	    int LA79_0 = input.LA(1);

            	    if ( (LA79_0==ON||LA79_0==USING) ) {
            	        alt79=1;
            	    }
            	    switch (alt79) {
            	        case 1 :
            	            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:324:53: join_constraint
            	            {
            	            pushFollow(FOLLOW_join_constraint_in_join_source2182);
            	            join_constraint234=join_constraint();

            	            state._fsp--;

            	            adaptor.addChild(root_0, join_constraint234.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "join_source"


    public static class single_source_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "single_source"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:326:1: single_source : ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN ! join_source RPAREN !);
    public final SqlParser.single_source_return single_source() throws RecognitionException {
        SqlParser.single_source_return retval = new SqlParser.single_source_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token table_name=null;
        Token table_alias=null;
        Token DOT235=null;
        Token AS236=null;
        Token INDEXED237=null;
        Token BY238=null;
        Token NOT239=null;
        Token INDEXED240=null;
        Token LPAREN241=null;
        Token RPAREN243=null;
        Token AS244=null;
        Token LPAREN245=null;
        Token RPAREN247=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return index_name =null;

        SqlParser.select_stmt_return select_stmt242 =null;

        SqlParser.join_source_return join_source246 =null;


        Object table_name_tree=null;
        Object table_alias_tree=null;
        Object DOT235_tree=null;
        Object AS236_tree=null;
        Object INDEXED237_tree=null;
        Object BY238_tree=null;
        Object NOT239_tree=null;
        Object INDEXED240_tree=null;
        Object LPAREN241_tree=null;
        Object RPAREN243_tree=null;
        Object AS244_tree=null;
        Object LPAREN245_tree=null;
        Object RPAREN247_tree=null;
        RewriteRuleTokenStream stream_INDEXED=new RewriteRuleTokenStream(adaptor,"token INDEXED");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_select_stmt=new RewriteRuleSubtreeStream(adaptor,"rule select_stmt");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:3: ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN ! join_source RPAREN !)
            int alt87=3;
            int LA87_0 = input.LA(1);

            if ( ((LA87_0 >= ABORT && LA87_0 <= AFTER)||(LA87_0 >= ALL && LA87_0 <= ALTER)||(LA87_0 >= ANALYZE && LA87_0 <= AND)||(LA87_0 >= AS && LA87_0 <= ASC)||(LA87_0 >= ATTACH && LA87_0 <= AUTOINCREMENT)||(LA87_0 >= BEFORE && LA87_0 <= BETWEEN)||LA87_0==BY||(LA87_0 >= CASCADE && LA87_0 <= COLLATE)||LA87_0==COLUMN||(LA87_0 >= COMMIT && LA87_0 <= CONSTRAINT)||LA87_0==CREATE||(LA87_0 >= CROSS && LA87_0 <= CURRENT_TIMESTAMP)||(LA87_0 >= DATABASE && LA87_0 <= DISTINCT)||LA87_0==DROP||(LA87_0 >= EACH && LA87_0 <= END)||(LA87_0 >= ESCAPE && LA87_0 <= EXPLAIN)||LA87_0==FAIL||(LA87_0 >= FOR && LA87_0 <= FROM)||LA87_0==GROUP||LA87_0==HAVING||LA87_0==ID||(LA87_0 >= IF && LA87_0 <= IMMEDIATE)||(LA87_0 >= INDEX && LA87_0 <= INSTEAD)||(LA87_0 >= INTERSECT && LA87_0 <= INTO)||LA87_0==IS||LA87_0==JOIN||LA87_0==KEY||LA87_0==LEFT||LA87_0==LIMIT||LA87_0==NATURAL||LA87_0==NULL||(LA87_0 >= OF && LA87_0 <= ON)||(LA87_0 >= OR && LA87_0 <= ORDER)||LA87_0==OUTER||LA87_0==PLAN||(LA87_0 >= PRAGMA && LA87_0 <= PRIMARY)||LA87_0==QUERY||(LA87_0 >= RAISE && LA87_0 <= REFERENCES)||(LA87_0 >= REINDEX && LA87_0 <= ROW)||(LA87_0 >= SAVEPOINT && LA87_0 <= SELECT)||LA87_0==SET||LA87_0==STRING||LA87_0==TABLE||(LA87_0 >= TEMPORARY && LA87_0 <= THEN)||(LA87_0 >= TO && LA87_0 <= TRIGGER)||(LA87_0 >= UNION && LA87_0 <= USING)||(LA87_0 >= VACUUM && LA87_0 <= VIRTUAL)||(LA87_0 >= WHEN && LA87_0 <= WHERE)) ) {
                alt87=1;
            }
            else if ( (LA87_0==LPAREN) ) {
                int LA87_4 = input.LA(2);

                if ( (LA87_4==SELECT) ) {
                    int LA87_5 = input.LA(3);

                    if ( ((LA87_5 >= ABORT && LA87_5 <= AFTER)||(LA87_5 >= ALL && LA87_5 <= ALTER)||(LA87_5 >= ANALYZE && LA87_5 <= AND)||(LA87_5 >= AS && LA87_5 <= AUTOINCREMENT)||(LA87_5 >= BEFORE && LA87_5 <= BETWEEN)||LA87_5==BLOB||LA87_5==BY||(LA87_5 >= CASCADE && LA87_5 <= COLUMN)||(LA87_5 >= COMMIT && LA87_5 <= CONSTRAINT)||LA87_5==CREATE||(LA87_5 >= CROSS && LA87_5 <= CURRENT_TIMESTAMP)||(LA87_5 >= DATABASE && LA87_5 <= DISTINCT)||LA87_5==DROP||(LA87_5 >= EACH && LA87_5 <= END)||(LA87_5 >= ESCAPE && LA87_5 <= EXPLAIN)||(LA87_5 >= FAIL && LA87_5 <= FLOAT)||(LA87_5 >= FOR && LA87_5 <= FROM)||LA87_5==GROUP||LA87_5==HAVING||LA87_5==ID||(LA87_5 >= IF && LA87_5 <= IMMEDIATE)||(LA87_5 >= INDEX && LA87_5 <= INTEGER)||(LA87_5 >= INTERSECT && LA87_5 <= INTO)||LA87_5==IS||LA87_5==JOIN||LA87_5==KEY||LA87_5==LEFT||LA87_5==LIMIT||LA87_5==LPAREN||LA87_5==MINUS||(LA87_5 >= NATURAL && LA87_5 <= NOT)||LA87_5==NULL||(LA87_5 >= OF && LA87_5 <= ON)||(LA87_5 >= OR && LA87_5 <= ORDER)||LA87_5==OUTER||(LA87_5 >= PLAN && LA87_5 <= PRIMARY)||(LA87_5 >= QUERY && LA87_5 <= QUESTION)||(LA87_5 >= RAISE && LA87_5 <= REFERENCES)||(LA87_5 >= REINDEX && LA87_5 <= ROW)||(LA87_5 >= SAVEPOINT && LA87_5 <= SELECT)||LA87_5==SET||LA87_5==STRING||LA87_5==TABLE||(LA87_5 >= TEMPORARY && LA87_5 <= TRIGGER)||(LA87_5 >= UNION && LA87_5 <= USING)||(LA87_5 >= VACUUM && LA87_5 <= VIRTUAL)||(LA87_5 >= WHEN && LA87_5 <= WHERE)) ) {
                        alt87=2;
                    }
                    else if ( (LA87_5==DOT) ) {
                        alt87=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 5, input);

                        throw nvae;

                    }
                }
                else if ( ((LA87_4 >= ABORT && LA87_4 <= AFTER)||(LA87_4 >= ALL && LA87_4 <= ALTER)||(LA87_4 >= ANALYZE && LA87_4 <= AND)||(LA87_4 >= AS && LA87_4 <= ASC)||(LA87_4 >= ATTACH && LA87_4 <= AUTOINCREMENT)||(LA87_4 >= BEFORE && LA87_4 <= BETWEEN)||LA87_4==BY||(LA87_4 >= CASCADE && LA87_4 <= COLLATE)||LA87_4==COLUMN||(LA87_4 >= COMMIT && LA87_4 <= CONSTRAINT)||LA87_4==CREATE||(LA87_4 >= CROSS && LA87_4 <= CURRENT_TIMESTAMP)||(LA87_4 >= DATABASE && LA87_4 <= DISTINCT)||LA87_4==DROP||(LA87_4 >= EACH && LA87_4 <= END)||(LA87_4 >= ESCAPE && LA87_4 <= EXPLAIN)||LA87_4==FAIL||(LA87_4 >= FOR && LA87_4 <= FROM)||LA87_4==GROUP||LA87_4==HAVING||LA87_4==ID||(LA87_4 >= IF && LA87_4 <= IMMEDIATE)||(LA87_4 >= INDEX && LA87_4 <= INSTEAD)||(LA87_4 >= INTERSECT && LA87_4 <= INTO)||LA87_4==IS||LA87_4==JOIN||LA87_4==KEY||LA87_4==LEFT||LA87_4==LIMIT||LA87_4==LPAREN||LA87_4==NATURAL||LA87_4==NULL||(LA87_4 >= OF && LA87_4 <= ON)||(LA87_4 >= OR && LA87_4 <= ORDER)||LA87_4==OUTER||LA87_4==PLAN||(LA87_4 >= PRAGMA && LA87_4 <= PRIMARY)||LA87_4==QUERY||(LA87_4 >= RAISE && LA87_4 <= REFERENCES)||(LA87_4 >= REINDEX && LA87_4 <= ROW)||LA87_4==SAVEPOINT||LA87_4==SET||LA87_4==STRING||LA87_4==TABLE||(LA87_4 >= TEMPORARY && LA87_4 <= THEN)||(LA87_4 >= TO && LA87_4 <= TRIGGER)||(LA87_4 >= UNION && LA87_4 <= USING)||(LA87_4 >= VACUUM && LA87_4 <= VIRTUAL)||(LA87_4 >= WHEN && LA87_4 <= WHERE)) ) {
                    alt87=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 4, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;

            }
            switch (alt87) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:5: (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )?
                    {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:5: (database_name= id DOT )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==ID) ) {
                        int LA81_1 = input.LA(2);

                        if ( (LA81_1==DOT) ) {
                            alt81=1;
                        }
                    }
                    else if ( ((LA81_0 >= ABORT && LA81_0 <= AFTER)||(LA81_0 >= ALL && LA81_0 <= ALTER)||(LA81_0 >= ANALYZE && LA81_0 <= AND)||(LA81_0 >= AS && LA81_0 <= ASC)||(LA81_0 >= ATTACH && LA81_0 <= AUTOINCREMENT)||(LA81_0 >= BEFORE && LA81_0 <= BETWEEN)||LA81_0==BY||(LA81_0 >= CASCADE && LA81_0 <= COLLATE)||LA81_0==COLUMN||(LA81_0 >= COMMIT && LA81_0 <= CONSTRAINT)||LA81_0==CREATE||(LA81_0 >= CROSS && LA81_0 <= CURRENT_TIMESTAMP)||(LA81_0 >= DATABASE && LA81_0 <= DISTINCT)||LA81_0==DROP||(LA81_0 >= EACH && LA81_0 <= END)||(LA81_0 >= ESCAPE && LA81_0 <= EXPLAIN)||LA81_0==FAIL||(LA81_0 >= FOR && LA81_0 <= FROM)||LA81_0==GROUP||LA81_0==HAVING||(LA81_0 >= IF && LA81_0 <= IMMEDIATE)||(LA81_0 >= INDEX && LA81_0 <= INSTEAD)||(LA81_0 >= INTERSECT && LA81_0 <= INTO)||LA81_0==IS||LA81_0==JOIN||LA81_0==KEY||LA81_0==LEFT||LA81_0==LIMIT||LA81_0==NATURAL||LA81_0==NULL||(LA81_0 >= OF && LA81_0 <= ON)||(LA81_0 >= OR && LA81_0 <= ORDER)||LA81_0==OUTER||LA81_0==PLAN||(LA81_0 >= PRAGMA && LA81_0 <= PRIMARY)||LA81_0==QUERY||(LA81_0 >= RAISE && LA81_0 <= REFERENCES)||(LA81_0 >= REINDEX && LA81_0 <= ROW)||(LA81_0 >= SAVEPOINT && LA81_0 <= SELECT)||LA81_0==SET||LA81_0==STRING||LA81_0==TABLE||(LA81_0 >= TEMPORARY && LA81_0 <= THEN)||(LA81_0 >= TO && LA81_0 <= TRIGGER)||(LA81_0 >= UNION && LA81_0 <= USING)||(LA81_0 >= VACUUM && LA81_0 <= VIRTUAL)||(LA81_0 >= WHEN && LA81_0 <= WHERE)) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:6: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_single_source2199);
                            database_name=id();

                            state._fsp--;

                            stream_id.add(database_name.getTree());

                            DOT235=(Token)match(input,DOT,FOLLOW_DOT_in_single_source2201);  
                            stream_DOT.add(DOT235);


                            }
                            break;

                    }


                    table_name=(Token)match(input,ID,FOLLOW_ID_in_single_source2207);  
                    stream_ID.add(table_name);


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:43: ( ( AS )? table_alias= ID )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==AS||LA83_0==ID) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:44: ( AS )? table_alias= ID
                            {
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:44: ( AS )?
                            int alt82=2;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==AS) ) {
                                alt82=1;
                            }
                            switch (alt82) {
                                case 1 :
                                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:45: AS
                                    {
                                    AS236=(Token)match(input,AS,FOLLOW_AS_in_single_source2211);  
                                    stream_AS.add(AS236);


                                    }
                                    break;

                            }


                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source2217);  
                            stream_ID.add(table_alias);


                            }
                            break;

                    }


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:67: ( INDEXED BY index_name= id | NOT INDEXED )?
                    int alt84=3;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==INDEXED) ) {
                        alt84=1;
                    }
                    else if ( (LA84_0==NOT) ) {
                        alt84=2;
                    }
                    switch (alt84) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:68: INDEXED BY index_name= id
                            {
                            INDEXED237=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source2222);  
                            stream_INDEXED.add(INDEXED237);


                            BY238=(Token)match(input,BY,FOLLOW_BY_in_single_source2224);  
                            stream_BY.add(BY238);


                            pushFollow(FOLLOW_id_in_single_source2228);
                            index_name=id();

                            state._fsp--;

                            stream_id.add(index_name.getTree());

                            }
                            break;
                        case 2 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:327:95: NOT INDEXED
                            {
                            NOT239=(Token)match(input,NOT,FOLLOW_NOT_in_single_source2232);  
                            stream_NOT.add(NOT239);


                            INDEXED240=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source2234);  
                            stream_INDEXED.add(INDEXED240);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: NOT, database_name, index_name, table_name, INDEXED, table_alias
                    // token labels: table_name, table_alias
                    // rule labels: index_name, database_name, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_table_name=new RewriteRuleTokenStream(adaptor,"token table_name",table_name);
                    RewriteRuleTokenStream stream_table_alias=new RewriteRuleTokenStream(adaptor,"token table_alias",table_alias);
                    RewriteRuleSubtreeStream stream_index_name=new RewriteRuleSubtreeStream(adaptor,"rule index_name",index_name!=null?index_name.tree:null);
                    RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 328:3: -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:6: ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ALIAS, "ALIAS")
                        , root_1);

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:14: ^( $table_name ( $database_name)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:29: ( $database_name)?
                        if ( stream_database_name.hasNext() ) {
                            adaptor.addChild(root_2, stream_database_name.nextTree());

                        }
                        stream_database_name.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:46: ( $table_alias)?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextNode());

                        }
                        stream_table_alias.reset();

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:59: ( ^( INDEXED ( NOT )? ( $index_name)? ) )?
                        if ( stream_NOT.hasNext()||stream_index_name.hasNext()||stream_INDEXED.hasNext() ) {
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:59: ^( INDEXED ( NOT )? ( $index_name)? )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(
                            stream_INDEXED.nextNode()
                            , root_2);

                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:69: ( NOT )?
                            if ( stream_NOT.hasNext() ) {
                                adaptor.addChild(root_2, 
                                stream_NOT.nextNode()
                                );

                            }
                            stream_NOT.reset();

                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:328:75: ( $index_name)?
                            if ( stream_index_name.hasNext() ) {
                                adaptor.addChild(root_2, stream_index_name.nextTree());

                            }
                            stream_index_name.reset();

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_NOT.reset();
                        stream_index_name.reset();
                        stream_INDEXED.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:329:5: LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )?
                    {
                    LPAREN241=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source2275);  
                    stream_LPAREN.add(LPAREN241);


                    pushFollow(FOLLOW_select_stmt_in_single_source2277);
                    select_stmt242=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt242.getTree());

                    RPAREN243=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source2279);  
                    stream_RPAREN.add(RPAREN243);


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:329:31: ( ( AS )? table_alias= ID )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==AS||LA86_0==ID) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:329:32: ( AS )? table_alias= ID
                            {
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:329:32: ( AS )?
                            int alt85=2;
                            int LA85_0 = input.LA(1);

                            if ( (LA85_0==AS) ) {
                                alt85=1;
                            }
                            switch (alt85) {
                                case 1 :
                                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:329:33: AS
                                    {
                                    AS244=(Token)match(input,AS,FOLLOW_AS_in_single_source2283);  
                                    stream_AS.add(AS244);


                                    }
                                    break;

                            }


                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source2289);  
                            stream_ID.add(table_alias);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: table_alias, select_stmt
                    // token labels: table_alias
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_table_alias=new RewriteRuleTokenStream(adaptor,"token table_alias",table_alias);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 330:3: -> ^( ALIAS select_stmt ( $table_alias)? )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:330:6: ^( ALIAS select_stmt ( $table_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ALIAS, "ALIAS")
                        , root_1);

                        adaptor.addChild(root_1, stream_select_stmt.nextTree());

                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:330:27: ( $table_alias)?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextNode());

                        }
                        stream_table_alias.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:331:5: LPAREN ! join_source RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    LPAREN245=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source2311); 

                    pushFollow(FOLLOW_join_source_in_single_source2314);
                    join_source246=join_source();

                    state._fsp--;

                    adaptor.addChild(root_0, join_source246.getTree());

                    RPAREN247=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source2316); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "single_source"


    public static class join_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "join_op"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:333:1: join_op : ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN ^);
    public final SqlParser.join_op_return join_op() throws RecognitionException {
        SqlParser.join_op_return retval = new SqlParser.join_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA248=null;
        Token NATURAL249=null;
        Token LEFT250=null;
        Token OUTER251=null;
        Token INNER252=null;
        Token CROSS253=null;
        Token JOIN254=null;

        Object COMMA248_tree=null;
        Object NATURAL249_tree=null;
        Object LEFT250_tree=null;
        Object OUTER251_tree=null;
        Object INNER252_tree=null;
        Object CROSS253_tree=null;
        Object JOIN254_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:334:3: ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN ^)
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==COMMA) ) {
                alt92=1;
            }
            else if ( (LA92_0==CROSS||LA92_0==INNER||LA92_0==JOIN||LA92_0==LEFT||LA92_0==NATURAL||LA92_0==OUTER) ) {
                alt92=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;

            }
            switch (alt92) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:334:5: COMMA
                    {
                    root_0 = (Object)adaptor.nil();


                    COMMA248=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_op2327); 
                    COMMA248_tree = 
                    (Object)adaptor.create(COMMA248)
                    ;
                    adaptor.addChild(root_0, COMMA248_tree);


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:5: ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN ^
                    {
                    root_0 = (Object)adaptor.nil();


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:5: ( NATURAL )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==NATURAL) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:6: NATURAL
                            {
                            NATURAL249=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_join_op2334); 
                            NATURAL249_tree = 
                            (Object)adaptor.create(NATURAL249)
                            ;
                            adaptor.addChild(root_0, NATURAL249_tree);


                            }
                            break;

                    }


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:16: ( ( LEFT )? ( OUTER )? | INNER | CROSS )
                    int alt91=3;
                    switch ( input.LA(1) ) {
                    case JOIN:
                    case LEFT:
                    case OUTER:
                        {
                        alt91=1;
                        }
                        break;
                    case INNER:
                        {
                        alt91=2;
                        }
                        break;
                    case CROSS:
                        {
                        alt91=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 91, 0, input);

                        throw nvae;

                    }

                    switch (alt91) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:17: ( LEFT )? ( OUTER )?
                            {
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:17: ( LEFT )?
                            int alt89=2;
                            int LA89_0 = input.LA(1);

                            if ( (LA89_0==LEFT) ) {
                                alt89=1;
                            }
                            switch (alt89) {
                                case 1 :
                                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:18: LEFT
                                    {
                                    LEFT250=(Token)match(input,LEFT,FOLLOW_LEFT_in_join_op2340); 
                                    LEFT250_tree = 
                                    (Object)adaptor.create(LEFT250)
                                    ;
                                    adaptor.addChild(root_0, LEFT250_tree);


                                    }
                                    break;

                            }


                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:25: ( OUTER )?
                            int alt90=2;
                            int LA90_0 = input.LA(1);

                            if ( (LA90_0==OUTER) ) {
                                alt90=1;
                            }
                            switch (alt90) {
                                case 1 :
                                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:26: OUTER
                                    {
                                    OUTER251=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_op2345); 
                                    OUTER251_tree = 
                                    (Object)adaptor.create(OUTER251)
                                    ;
                                    adaptor.addChild(root_0, OUTER251_tree);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:36: INNER
                            {
                            INNER252=(Token)match(input,INNER,FOLLOW_INNER_in_join_op2351); 
                            INNER252_tree = 
                            (Object)adaptor.create(INNER252)
                            ;
                            adaptor.addChild(root_0, INNER252_tree);


                            }
                            break;
                        case 3 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:335:44: CROSS
                            {
                            CROSS253=(Token)match(input,CROSS,FOLLOW_CROSS_in_join_op2355); 
                            CROSS253_tree = 
                            (Object)adaptor.create(CROSS253)
                            ;
                            adaptor.addChild(root_0, CROSS253_tree);


                            }
                            break;

                    }


                    JOIN254=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_op2358); 
                    JOIN254_tree = 
                    (Object)adaptor.create(JOIN254)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(JOIN254_tree, root_0);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "join_op"


    public static class join_constraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "join_constraint"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:337:1: join_constraint : ( ON ^ expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) );
    public final SqlParser.join_constraint_return join_constraint() throws RecognitionException {
        SqlParser.join_constraint_return retval = new SqlParser.join_constraint_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ON255=null;
        Token USING257=null;
        Token LPAREN258=null;
        Token COMMA259=null;
        Token RPAREN260=null;
        List list_column_names=null;
        SqlParser.expr_return expr256 =null;

        RuleReturnScope column_names = null;
        Object ON255_tree=null;
        Object USING257_tree=null;
        Object LPAREN258_tree=null;
        Object COMMA259_tree=null;
        Object RPAREN260_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:338:3: ( ON ^ expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==ON) ) {
                alt94=1;
            }
            else if ( (LA94_0==USING) ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;

            }
            switch (alt94) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:338:5: ON ^ expr
                    {
                    root_0 = (Object)adaptor.nil();


                    ON255=(Token)match(input,ON,FOLLOW_ON_in_join_constraint2369); 
                    ON255_tree = 
                    (Object)adaptor.create(ON255)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ON255_tree, root_0);


                    pushFollow(FOLLOW_expr_in_join_constraint2372);
                    expr256=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr256.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:339:5: USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    USING257=(Token)match(input,USING,FOLLOW_USING_in_join_constraint2378);  
                    stream_USING.add(USING257);


                    LPAREN258=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_join_constraint2380);  
                    stream_LPAREN.add(LPAREN258);


                    pushFollow(FOLLOW_id_in_join_constraint2384);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:339:35: ( COMMA column_names+= id )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==COMMA) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:339:36: COMMA column_names+= id
                    	    {
                    	    COMMA259=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_constraint2387);  
                    	    stream_COMMA.add(COMMA259);


                    	    pushFollow(FOLLOW_id_in_join_constraint2391);
                    	    column_names=id();

                    	    state._fsp--;

                    	    stream_id.add(column_names.getTree());
                    	    if (list_column_names==null) list_column_names=new ArrayList();
                    	    list_column_names.add(column_names.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);


                    RPAREN260=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_join_constraint2395);  
                    stream_RPAREN.add(RPAREN260);


                    // AST REWRITE
                    // elements: column_names, USING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: column_names
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_column_names=new RewriteRuleSubtreeStream(adaptor,"token column_names",list_column_names);
                    root_0 = (Object)adaptor.nil();
                    // 339:68: -> ^( USING ( $column_names)+ )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:339:71: ^( USING ( $column_names)+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_USING.nextNode()
                        , root_1);

                        if ( !(stream_column_names.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_column_names.hasNext() ) {
                            adaptor.addChild(root_1, stream_column_names.nextTree());

                        }
                        stream_column_names.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "join_constraint"


    public static class insert_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "insert_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:1: insert_stmt : ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) ;
    public final SqlParser.insert_stmt_return insert_stmt() throws RecognitionException {
        SqlParser.insert_stmt_return retval = new SqlParser.insert_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INSERT261=null;
        Token REPLACE263=null;
        Token INTO264=null;
        Token DOT265=null;
        Token LPAREN266=null;
        Token COMMA267=null;
        Token RPAREN268=null;
        Token VALUES269=null;
        Token LPAREN270=null;
        Token COMMA271=null;
        Token RPAREN272=null;
        Token DEFAULT274=null;
        Token VALUES275=null;
        List list_column_names=null;
        List list_values=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return table_name =null;

        SqlParser.operation_conflict_clause_return operation_conflict_clause262 =null;

        SqlParser.select_stmt_return select_stmt273 =null;

        RuleReturnScope column_names = null;
        RuleReturnScope values = null;
        Object INSERT261_tree=null;
        Object REPLACE263_tree=null;
        Object INTO264_tree=null;
        Object DOT265_tree=null;
        Object LPAREN266_tree=null;
        Object COMMA267_tree=null;
        Object RPAREN268_tree=null;
        Object VALUES269_tree=null;
        Object LPAREN270_tree=null;
        Object COMMA271_tree=null;
        Object RPAREN272_tree=null;
        Object DEFAULT274_tree=null;
        Object VALUES275_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:12: ( ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:14: ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            {
            root_0 = (Object)adaptor.nil();


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:14: ( INSERT ( operation_conflict_clause )? | REPLACE )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==INSERT) ) {
                alt96=1;
            }
            else if ( (LA96_0==REPLACE) ) {
                alt96=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;

            }
            switch (alt96) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:15: INSERT ( operation_conflict_clause )?
                    {
                    INSERT261=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_stmt2414); 
                    INSERT261_tree = 
                    (Object)adaptor.create(INSERT261)
                    ;
                    adaptor.addChild(root_0, INSERT261_tree);


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:22: ( operation_conflict_clause )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==OR) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:23: operation_conflict_clause
                            {
                            pushFollow(FOLLOW_operation_conflict_clause_in_insert_stmt2417);
                            operation_conflict_clause262=operation_conflict_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, operation_conflict_clause262.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:53: REPLACE
                    {
                    REPLACE263=(Token)match(input,REPLACE,FOLLOW_REPLACE_in_insert_stmt2423); 
                    REPLACE263_tree = 
                    (Object)adaptor.create(REPLACE263)
                    ;
                    adaptor.addChild(root_0, REPLACE263_tree);


                    }
                    break;

            }


            INTO264=(Token)match(input,INTO,FOLLOW_INTO_in_insert_stmt2426); 
            INTO264_tree = 
            (Object)adaptor.create(INTO264)
            ;
            adaptor.addChild(root_0, INTO264_tree);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:67: (database_name= id DOT )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==ID||LA97_0==STRING) ) {
                int LA97_1 = input.LA(2);

                if ( (LA97_1==DOT) ) {
                    alt97=1;
                }
            }
            else if ( ((LA97_0 >= ABORT && LA97_0 <= AFTER)||(LA97_0 >= ALL && LA97_0 <= ALTER)||(LA97_0 >= ANALYZE && LA97_0 <= AND)||(LA97_0 >= AS && LA97_0 <= ASC)||(LA97_0 >= ATTACH && LA97_0 <= AUTOINCREMENT)||(LA97_0 >= BEFORE && LA97_0 <= BETWEEN)||LA97_0==BY||(LA97_0 >= CASCADE && LA97_0 <= COLLATE)||LA97_0==COLUMN||(LA97_0 >= COMMIT && LA97_0 <= CONSTRAINT)||LA97_0==CREATE||(LA97_0 >= CROSS && LA97_0 <= CURRENT_TIMESTAMP)||(LA97_0 >= DATABASE && LA97_0 <= DISTINCT)||LA97_0==DROP||(LA97_0 >= EACH && LA97_0 <= END)||(LA97_0 >= ESCAPE && LA97_0 <= EXPLAIN)||LA97_0==FAIL||(LA97_0 >= FOR && LA97_0 <= FROM)||LA97_0==GROUP||LA97_0==HAVING||(LA97_0 >= IF && LA97_0 <= IMMEDIATE)||(LA97_0 >= INDEX && LA97_0 <= INSTEAD)||(LA97_0 >= INTERSECT && LA97_0 <= INTO)||LA97_0==IS||LA97_0==JOIN||LA97_0==KEY||LA97_0==LEFT||LA97_0==LIMIT||LA97_0==NATURAL||LA97_0==NULL||(LA97_0 >= OF && LA97_0 <= ON)||(LA97_0 >= OR && LA97_0 <= ORDER)||LA97_0==OUTER||LA97_0==PLAN||(LA97_0 >= PRAGMA && LA97_0 <= PRIMARY)||LA97_0==QUERY||(LA97_0 >= RAISE && LA97_0 <= REFERENCES)||(LA97_0 >= REINDEX && LA97_0 <= ROW)||(LA97_0 >= SAVEPOINT && LA97_0 <= SELECT)||LA97_0==SET||LA97_0==TABLE||(LA97_0 >= TEMPORARY && LA97_0 <= THEN)||(LA97_0 >= TO && LA97_0 <= TRIGGER)||(LA97_0 >= UNION && LA97_0 <= USING)||(LA97_0 >= VACUUM && LA97_0 <= VIRTUAL)||(LA97_0 >= WHEN && LA97_0 <= WHERE)) ) {
                int LA97_2 = input.LA(2);

                if ( (LA97_2==DOT) ) {
                    alt97=1;
                }
            }
            switch (alt97) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:342:68: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_insert_stmt2431);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());

                    DOT265=(Token)match(input,DOT,FOLLOW_DOT_in_insert_stmt2433); 
                    DOT265_tree = 
                    (Object)adaptor.create(DOT265)
                    ;
                    adaptor.addChild(root_0, DOT265_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_insert_stmt2439);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:343:3: ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==LPAREN||LA102_0==SELECT||LA102_0==VALUES) ) {
                alt102=1;
            }
            else if ( (LA102_0==DEFAULT) ) {
                alt102=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;

            }
            switch (alt102) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:343:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:343:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==LPAREN) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:343:6: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                            {
                            LPAREN266=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt2446); 
                            LPAREN266_tree = 
                            (Object)adaptor.create(LPAREN266)
                            ;
                            adaptor.addChild(root_0, LPAREN266_tree);


                            pushFollow(FOLLOW_id_in_insert_stmt2450);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());


                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:343:30: ( COMMA column_names+= id )*
                            loop98:
                            do {
                                int alt98=2;
                                int LA98_0 = input.LA(1);

                                if ( (LA98_0==COMMA) ) {
                                    alt98=1;
                                }


                                switch (alt98) {
                            	case 1 :
                            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:343:31: COMMA column_names+= id
                            	    {
                            	    COMMA267=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt2453); 
                            	    COMMA267_tree = 
                            	    (Object)adaptor.create(COMMA267)
                            	    ;
                            	    adaptor.addChild(root_0, COMMA267_tree);


                            	    pushFollow(FOLLOW_id_in_insert_stmt2457);
                            	    column_names=id();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, column_names.getTree());
                            	    if (list_column_names==null) list_column_names=new ArrayList();
                            	    list_column_names.add(column_names.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop98;
                                }
                            } while (true);


                            RPAREN268=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt2461); 
                            RPAREN268_tree = 
                            (Object)adaptor.create(RPAREN268)
                            ;
                            adaptor.addChild(root_0, RPAREN268_tree);


                            }
                            break;

                    }


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:344:5: ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==VALUES) ) {
                        alt101=1;
                    }
                    else if ( (LA101_0==SELECT) ) {
                        alt101=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 101, 0, input);

                        throw nvae;

                    }
                    switch (alt101) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:344:6: VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN
                            {
                            VALUES269=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt2470); 
                            VALUES269_tree = 
                            (Object)adaptor.create(VALUES269)
                            ;
                            adaptor.addChild(root_0, VALUES269_tree);


                            LPAREN270=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt2472); 
                            LPAREN270_tree = 
                            (Object)adaptor.create(LPAREN270)
                            ;
                            adaptor.addChild(root_0, LPAREN270_tree);


                            pushFollow(FOLLOW_expr_in_insert_stmt2476);
                            values=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, values.getTree());
                            if (list_values==null) list_values=new ArrayList();
                            list_values.add(values.getTree());


                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:344:33: ( COMMA values+= expr )*
                            loop100:
                            do {
                                int alt100=2;
                                int LA100_0 = input.LA(1);

                                if ( (LA100_0==COMMA) ) {
                                    alt100=1;
                                }


                                switch (alt100) {
                            	case 1 :
                            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:344:34: COMMA values+= expr
                            	    {
                            	    COMMA271=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt2479); 
                            	    COMMA271_tree = 
                            	    (Object)adaptor.create(COMMA271)
                            	    ;
                            	    adaptor.addChild(root_0, COMMA271_tree);


                            	    pushFollow(FOLLOW_expr_in_insert_stmt2483);
                            	    values=expr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, values.getTree());
                            	    if (list_values==null) list_values=new ArrayList();
                            	    list_values.add(values.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop100;
                                }
                            } while (true);


                            RPAREN272=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt2487); 
                            RPAREN272_tree = 
                            (Object)adaptor.create(RPAREN272)
                            ;
                            adaptor.addChild(root_0, RPAREN272_tree);


                            }
                            break;
                        case 2 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:344:64: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_insert_stmt2491);
                            select_stmt273=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt273.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:345:5: DEFAULT VALUES
                    {
                    DEFAULT274=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_insert_stmt2498); 
                    DEFAULT274_tree = 
                    (Object)adaptor.create(DEFAULT274)
                    ;
                    adaptor.addChild(root_0, DEFAULT274_tree);


                    VALUES275=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt2500); 
                    VALUES275_tree = 
                    (Object)adaptor.create(VALUES275)
                    ;
                    adaptor.addChild(root_0, VALUES275_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "insert_stmt"


    public static class update_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "update_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:348:1: update_stmt : UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? ;
    public final SqlParser.update_stmt_return update_stmt() throws RecognitionException {
        SqlParser.update_stmt_return retval = new SqlParser.update_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token UPDATE276=null;
        Token SET279=null;
        Token COMMA280=null;
        Token WHERE281=null;
        List list_values=null;
        SqlParser.operation_conflict_clause_return operation_conflict_clause277 =null;

        SqlParser.qualified_table_name_return qualified_table_name278 =null;

        SqlParser.expr_return expr282 =null;

        SqlParser.operation_limited_clause_return operation_limited_clause283 =null;

        RuleReturnScope values = null;
        Object UPDATE276_tree=null;
        Object SET279_tree=null;
        Object COMMA280_tree=null;
        Object WHERE281_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:348:12: ( UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:348:14: UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();


            UPDATE276=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_stmt2510); 
            UPDATE276_tree = 
            (Object)adaptor.create(UPDATE276)
            ;
            adaptor.addChild(root_0, UPDATE276_tree);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:348:21: ( operation_conflict_clause )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==OR) ) {
                int LA103_1 = input.LA(2);

                if ( (LA103_1==ABORT||LA103_1==FAIL||LA103_1==IGNORE||LA103_1==REPLACE||LA103_1==ROLLBACK) ) {
                    alt103=1;
                }
            }
            switch (alt103) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:348:22: operation_conflict_clause
                    {
                    pushFollow(FOLLOW_operation_conflict_clause_in_update_stmt2513);
                    operation_conflict_clause277=operation_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_conflict_clause277.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_qualified_table_name_in_update_stmt2517);
            qualified_table_name278=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name278.getTree());

            SET279=(Token)match(input,SET,FOLLOW_SET_in_update_stmt2521); 
            SET279_tree = 
            (Object)adaptor.create(SET279)
            ;
            adaptor.addChild(root_0, SET279_tree);


            pushFollow(FOLLOW_update_set_in_update_stmt2525);
            values=update_set();

            state._fsp--;

            adaptor.addChild(root_0, values.getTree());
            if (list_values==null) list_values=new ArrayList();
            list_values.add(values.getTree());


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:349:26: ( COMMA values+= update_set )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==COMMA) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:349:27: COMMA values+= update_set
            	    {
            	    COMMA280=(Token)match(input,COMMA,FOLLOW_COMMA_in_update_stmt2528); 
            	    COMMA280_tree = 
            	    (Object)adaptor.create(COMMA280)
            	    ;
            	    adaptor.addChild(root_0, COMMA280_tree);


            	    pushFollow(FOLLOW_update_set_in_update_stmt2532);
            	    values=update_set();

            	    state._fsp--;

            	    adaptor.addChild(root_0, values.getTree());
            	    if (list_values==null) list_values=new ArrayList();
            	    list_values.add(values.getTree());


            	    }
            	    break;

            	default :
            	    break loop104;
                }
            } while (true);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:349:54: ( WHERE expr )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==WHERE) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:349:55: WHERE expr
                    {
                    WHERE281=(Token)match(input,WHERE,FOLLOW_WHERE_in_update_stmt2537); 
                    WHERE281_tree = 
                    (Object)adaptor.create(WHERE281)
                    ;
                    adaptor.addChild(root_0, WHERE281_tree);


                    pushFollow(FOLLOW_expr_in_update_stmt2539);
                    expr282=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr282.getTree());

                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:349:68: ( operation_limited_clause )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==LIMIT||LA106_0==ORDER) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:349:69: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_update_stmt2544);
                    operation_limited_clause283=operation_limited_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_limited_clause283.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "update_stmt"


    public static class update_set_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "update_set"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:351:1: update_set : column_name= id EQUALS expr ;
    public final SqlParser.update_set_return update_set() throws RecognitionException {
        SqlParser.update_set_return retval = new SqlParser.update_set_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUALS284=null;
        SqlParser.id_return column_name =null;

        SqlParser.expr_return expr285 =null;


        Object EQUALS284_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:351:11: (column_name= id EQUALS expr )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:351:13: column_name= id EQUALS expr
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_id_in_update_set2555);
            column_name=id();

            state._fsp--;

            adaptor.addChild(root_0, column_name.getTree());

            EQUALS284=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_update_set2557); 
            EQUALS284_tree = 
            (Object)adaptor.create(EQUALS284)
            ;
            adaptor.addChild(root_0, EQUALS284_tree);


            pushFollow(FOLLOW_expr_in_update_set2559);
            expr285=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr285.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "update_set"


    public static class delete_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "delete_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:354:1: delete_stmt : DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? ;
    public final SqlParser.delete_stmt_return delete_stmt() throws RecognitionException {
        SqlParser.delete_stmt_return retval = new SqlParser.delete_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DELETE286=null;
        Token FROM287=null;
        Token WHERE289=null;
        SqlParser.qualified_table_name_return qualified_table_name288 =null;

        SqlParser.expr_return expr290 =null;

        SqlParser.operation_limited_clause_return operation_limited_clause291 =null;


        Object DELETE286_tree=null;
        Object FROM287_tree=null;
        Object WHERE289_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:354:12: ( DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:354:14: DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();


            DELETE286=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_stmt2567); 
            DELETE286_tree = 
            (Object)adaptor.create(DELETE286)
            ;
            adaptor.addChild(root_0, DELETE286_tree);


            FROM287=(Token)match(input,FROM,FOLLOW_FROM_in_delete_stmt2569); 
            FROM287_tree = 
            (Object)adaptor.create(FROM287)
            ;
            adaptor.addChild(root_0, FROM287_tree);


            pushFollow(FOLLOW_qualified_table_name_in_delete_stmt2571);
            qualified_table_name288=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name288.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:354:47: ( WHERE expr )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==WHERE) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:354:48: WHERE expr
                    {
                    WHERE289=(Token)match(input,WHERE,FOLLOW_WHERE_in_delete_stmt2574); 
                    WHERE289_tree = 
                    (Object)adaptor.create(WHERE289)
                    ;
                    adaptor.addChild(root_0, WHERE289_tree);


                    pushFollow(FOLLOW_expr_in_delete_stmt2576);
                    expr290=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr290.getTree());

                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:354:61: ( operation_limited_clause )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==LIMIT||LA108_0==ORDER) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:354:62: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_delete_stmt2581);
                    operation_limited_clause291=operation_limited_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_limited_clause291.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "delete_stmt"


    public static class begin_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "begin_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:357:1: begin_stmt : BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? ;
    public final SqlParser.begin_stmt_return begin_stmt() throws RecognitionException {
        SqlParser.begin_stmt_return retval = new SqlParser.begin_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BEGIN292=null;
        Token set293=null;
        Token TRANSACTION294=null;

        Object BEGIN292_tree=null;
        Object set293_tree=null;
        Object TRANSACTION294_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:357:11: ( BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:357:13: BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();


            BEGIN292=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_begin_stmt2591); 
            BEGIN292_tree = 
            (Object)adaptor.create(BEGIN292)
            ;
            adaptor.addChild(root_0, BEGIN292_tree);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:357:19: ( DEFERRED | IMMEDIATE | EXCLUSIVE )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==DEFERRED||LA109_0==EXCLUSIVE||LA109_0==IMMEDIATE) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
                    {
                    set293=(Token)input.LT(1);

                    if ( input.LA(1)==DEFERRED||input.LA(1)==EXCLUSIVE||input.LA(1)==IMMEDIATE ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set293)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:357:55: ( TRANSACTION )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==TRANSACTION) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:357:56: TRANSACTION
                    {
                    TRANSACTION294=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_begin_stmt2607); 
                    TRANSACTION294_tree = 
                    (Object)adaptor.create(TRANSACTION294)
                    ;
                    adaptor.addChild(root_0, TRANSACTION294_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "begin_stmt"


    public static class commit_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "commit_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:360:1: commit_stmt : ( COMMIT | END ) ( TRANSACTION )? ;
    public final SqlParser.commit_stmt_return commit_stmt() throws RecognitionException {
        SqlParser.commit_stmt_return retval = new SqlParser.commit_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set295=null;
        Token TRANSACTION296=null;

        Object set295_tree=null;
        Object TRANSACTION296_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:360:12: ( ( COMMIT | END ) ( TRANSACTION )? )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:360:14: ( COMMIT | END ) ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();


            set295=(Token)input.LT(1);

            if ( input.LA(1)==COMMIT||input.LA(1)==END ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set295)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:360:29: ( TRANSACTION )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==TRANSACTION) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:360:30: TRANSACTION
                    {
                    TRANSACTION296=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_commit_stmt2626); 
                    TRANSACTION296_tree = 
                    (Object)adaptor.create(TRANSACTION296)
                    ;
                    adaptor.addChild(root_0, TRANSACTION296_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "commit_stmt"


    public static class rollback_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rollback_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:363:1: rollback_stmt : ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? ;
    public final SqlParser.rollback_stmt_return rollback_stmt() throws RecognitionException {
        SqlParser.rollback_stmt_return retval = new SqlParser.rollback_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ROLLBACK297=null;
        Token TRANSACTION298=null;
        Token TO299=null;
        Token SAVEPOINT300=null;
        SqlParser.id_return savepoint_name =null;


        Object ROLLBACK297_tree=null;
        Object TRANSACTION298_tree=null;
        Object TO299_tree=null;
        Object SAVEPOINT300_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:363:14: ( ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:363:16: ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )?
            {
            root_0 = (Object)adaptor.nil();


            ROLLBACK297=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_stmt2636); 
            ROLLBACK297_tree = 
            (Object)adaptor.create(ROLLBACK297)
            ;
            adaptor.addChild(root_0, ROLLBACK297_tree);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:363:25: ( TRANSACTION )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==TRANSACTION) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:363:26: TRANSACTION
                    {
                    TRANSACTION298=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_rollback_stmt2639); 
                    TRANSACTION298_tree = 
                    (Object)adaptor.create(TRANSACTION298)
                    ;
                    adaptor.addChild(root_0, TRANSACTION298_tree);


                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:363:40: ( TO ( SAVEPOINT )? savepoint_name= id )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==TO) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:363:41: TO ( SAVEPOINT )? savepoint_name= id
                    {
                    TO299=(Token)match(input,TO,FOLLOW_TO_in_rollback_stmt2644); 
                    TO299_tree = 
                    (Object)adaptor.create(TO299)
                    ;
                    adaptor.addChild(root_0, TO299_tree);


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:363:44: ( SAVEPOINT )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==SAVEPOINT) ) {
                        int LA113_1 = input.LA(2);

                        if ( ((LA113_1 >= ABORT && LA113_1 <= AFTER)||(LA113_1 >= ALL && LA113_1 <= ALTER)||(LA113_1 >= ANALYZE && LA113_1 <= AND)||(LA113_1 >= AS && LA113_1 <= ASC)||(LA113_1 >= ATTACH && LA113_1 <= AUTOINCREMENT)||(LA113_1 >= BEFORE && LA113_1 <= BETWEEN)||LA113_1==BY||(LA113_1 >= CASCADE && LA113_1 <= COLLATE)||LA113_1==COLUMN||(LA113_1 >= COMMIT && LA113_1 <= CONSTRAINT)||LA113_1==CREATE||(LA113_1 >= CROSS && LA113_1 <= CURRENT_TIMESTAMP)||(LA113_1 >= DATABASE && LA113_1 <= DISTINCT)||LA113_1==DROP||(LA113_1 >= EACH && LA113_1 <= END)||(LA113_1 >= ESCAPE && LA113_1 <= EXPLAIN)||LA113_1==FAIL||(LA113_1 >= FOR && LA113_1 <= FROM)||LA113_1==GROUP||LA113_1==HAVING||LA113_1==ID||(LA113_1 >= IF && LA113_1 <= IMMEDIATE)||(LA113_1 >= INDEX && LA113_1 <= INSTEAD)||(LA113_1 >= INTERSECT && LA113_1 <= INTO)||LA113_1==IS||LA113_1==JOIN||LA113_1==KEY||LA113_1==LEFT||LA113_1==LIMIT||LA113_1==NATURAL||LA113_1==NULL||(LA113_1 >= OF && LA113_1 <= ON)||(LA113_1 >= OR && LA113_1 <= ORDER)||LA113_1==OUTER||LA113_1==PLAN||(LA113_1 >= PRAGMA && LA113_1 <= PRIMARY)||LA113_1==QUERY||(LA113_1 >= RAISE && LA113_1 <= REFERENCES)||(LA113_1 >= REINDEX && LA113_1 <= ROW)||(LA113_1 >= SAVEPOINT && LA113_1 <= SELECT)||LA113_1==SET||LA113_1==STRING||LA113_1==TABLE||(LA113_1 >= TEMPORARY && LA113_1 <= THEN)||(LA113_1 >= TO && LA113_1 <= TRIGGER)||(LA113_1 >= UNION && LA113_1 <= USING)||(LA113_1 >= VACUUM && LA113_1 <= VIRTUAL)||(LA113_1 >= WHEN && LA113_1 <= WHERE)) ) {
                            alt113=1;
                        }
                    }
                    switch (alt113) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:363:45: SAVEPOINT
                            {
                            SAVEPOINT300=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_rollback_stmt2647); 
                            SAVEPOINT300_tree = 
                            (Object)adaptor.create(SAVEPOINT300)
                            ;
                            adaptor.addChild(root_0, SAVEPOINT300_tree);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_id_in_rollback_stmt2653);
                    savepoint_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_name.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rollback_stmt"


    public static class savepoint_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "savepoint_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:366:1: savepoint_stmt : SAVEPOINT savepoint_name= id ;
    public final SqlParser.savepoint_stmt_return savepoint_stmt() throws RecognitionException {
        SqlParser.savepoint_stmt_return retval = new SqlParser.savepoint_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SAVEPOINT301=null;
        SqlParser.id_return savepoint_name =null;


        Object SAVEPOINT301_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:366:15: ( SAVEPOINT savepoint_name= id )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:366:17: SAVEPOINT savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();


            SAVEPOINT301=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_savepoint_stmt2663); 
            SAVEPOINT301_tree = 
            (Object)adaptor.create(SAVEPOINT301)
            ;
            adaptor.addChild(root_0, SAVEPOINT301_tree);


            pushFollow(FOLLOW_id_in_savepoint_stmt2667);
            savepoint_name=id();

            state._fsp--;

            adaptor.addChild(root_0, savepoint_name.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "savepoint_stmt"


    public static class release_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "release_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:369:1: release_stmt : RELEASE ( SAVEPOINT )? savepoint_name= id ;
    public final SqlParser.release_stmt_return release_stmt() throws RecognitionException {
        SqlParser.release_stmt_return retval = new SqlParser.release_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RELEASE302=null;
        Token SAVEPOINT303=null;
        SqlParser.id_return savepoint_name =null;


        Object RELEASE302_tree=null;
        Object SAVEPOINT303_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:369:13: ( RELEASE ( SAVEPOINT )? savepoint_name= id )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:369:15: RELEASE ( SAVEPOINT )? savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();


            RELEASE302=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_stmt2675); 
            RELEASE302_tree = 
            (Object)adaptor.create(RELEASE302)
            ;
            adaptor.addChild(root_0, RELEASE302_tree);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:369:23: ( SAVEPOINT )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==SAVEPOINT) ) {
                int LA115_1 = input.LA(2);

                if ( ((LA115_1 >= ABORT && LA115_1 <= AFTER)||(LA115_1 >= ALL && LA115_1 <= ALTER)||(LA115_1 >= ANALYZE && LA115_1 <= AND)||(LA115_1 >= AS && LA115_1 <= ASC)||(LA115_1 >= ATTACH && LA115_1 <= AUTOINCREMENT)||(LA115_1 >= BEFORE && LA115_1 <= BETWEEN)||LA115_1==BY||(LA115_1 >= CASCADE && LA115_1 <= COLLATE)||LA115_1==COLUMN||(LA115_1 >= COMMIT && LA115_1 <= CONSTRAINT)||LA115_1==CREATE||(LA115_1 >= CROSS && LA115_1 <= CURRENT_TIMESTAMP)||(LA115_1 >= DATABASE && LA115_1 <= DISTINCT)||LA115_1==DROP||(LA115_1 >= EACH && LA115_1 <= END)||(LA115_1 >= ESCAPE && LA115_1 <= EXPLAIN)||LA115_1==FAIL||(LA115_1 >= FOR && LA115_1 <= FROM)||LA115_1==GROUP||LA115_1==HAVING||LA115_1==ID||(LA115_1 >= IF && LA115_1 <= IMMEDIATE)||(LA115_1 >= INDEX && LA115_1 <= INSTEAD)||(LA115_1 >= INTERSECT && LA115_1 <= INTO)||LA115_1==IS||LA115_1==JOIN||LA115_1==KEY||LA115_1==LEFT||LA115_1==LIMIT||LA115_1==NATURAL||LA115_1==NULL||(LA115_1 >= OF && LA115_1 <= ON)||(LA115_1 >= OR && LA115_1 <= ORDER)||LA115_1==OUTER||LA115_1==PLAN||(LA115_1 >= PRAGMA && LA115_1 <= PRIMARY)||LA115_1==QUERY||(LA115_1 >= RAISE && LA115_1 <= REFERENCES)||(LA115_1 >= REINDEX && LA115_1 <= ROW)||(LA115_1 >= SAVEPOINT && LA115_1 <= SELECT)||LA115_1==SET||LA115_1==STRING||LA115_1==TABLE||(LA115_1 >= TEMPORARY && LA115_1 <= THEN)||(LA115_1 >= TO && LA115_1 <= TRIGGER)||(LA115_1 >= UNION && LA115_1 <= USING)||(LA115_1 >= VACUUM && LA115_1 <= VIRTUAL)||(LA115_1 >= WHEN && LA115_1 <= WHERE)) ) {
                    alt115=1;
                }
            }
            switch (alt115) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:369:24: SAVEPOINT
                    {
                    SAVEPOINT303=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_release_stmt2678); 
                    SAVEPOINT303_tree = 
                    (Object)adaptor.create(SAVEPOINT303)
                    ;
                    adaptor.addChild(root_0, SAVEPOINT303_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_release_stmt2684);
            savepoint_name=id();

            state._fsp--;

            adaptor.addChild(root_0, savepoint_name.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "release_stmt"


    public static class table_conflict_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_conflict_clause"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:376:1: table_conflict_clause : ON ! CONFLICT ^ ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.table_conflict_clause_return table_conflict_clause() throws RecognitionException {
        SqlParser.table_conflict_clause_return retval = new SqlParser.table_conflict_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ON304=null;
        Token CONFLICT305=null;
        Token set306=null;

        Object ON304_tree=null;
        Object CONFLICT305_tree=null;
        Object set306_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:376:22: ( ON ! CONFLICT ^ ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:376:24: ON ! CONFLICT ^ ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();


            ON304=(Token)match(input,ON,FOLLOW_ON_in_table_conflict_clause2696); 

            CONFLICT305=(Token)match(input,CONFLICT,FOLLOW_CONFLICT_in_table_conflict_clause2699); 
            CONFLICT305_tree = 
            (Object)adaptor.create(CONFLICT305)
            ;
            root_0 = (Object)adaptor.becomeRoot(CONFLICT305_tree, root_0);


            set306=(Token)input.LT(1);

            if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==IGNORE||input.LA(1)==REPLACE||input.LA(1)==ROLLBACK ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set306)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_conflict_clause"


    public static class create_virtual_table_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create_virtual_table_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:380:1: create_virtual_table_stmt : CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? -> ^( CREATE_TABLE ^( OPTIONS VIRTUAL ) ^( $table_name ( $database_name)? ) ^( $module_name) ( ^( COLUMNS ( column_def )+ ) )? ) ;
    public final SqlParser.create_virtual_table_stmt_return create_virtual_table_stmt() throws RecognitionException {
        SqlParser.create_virtual_table_stmt_return retval = new SqlParser.create_virtual_table_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CREATE307=null;
        Token VIRTUAL308=null;
        Token TABLE309=null;
        Token DOT310=null;
        Token USING311=null;
        Token LPAREN312=null;
        Token COMMA314=null;
        Token RPAREN316=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return table_name =null;

        SqlParser.id_return module_name =null;

        SqlParser.column_def_return column_def313 =null;

        SqlParser.column_def_return column_def315 =null;


        Object CREATE307_tree=null;
        Object VIRTUAL308_tree=null;
        Object TABLE309_tree=null;
        Object DOT310_tree=null;
        Object USING311_tree=null;
        Object LPAREN312_tree=null;
        Object COMMA314_tree=null;
        Object RPAREN316_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_VIRTUAL=new RewriteRuleTokenStream(adaptor,"token VIRTUAL");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_column_def=new RewriteRuleSubtreeStream(adaptor,"rule column_def");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:380:26: ( CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? -> ^( CREATE_TABLE ^( OPTIONS VIRTUAL ) ^( $table_name ( $database_name)? ) ^( $module_name) ( ^( COLUMNS ( column_def )+ ) )? ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:380:28: CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            {
            CREATE307=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_virtual_table_stmt2729);  
            stream_CREATE.add(CREATE307);


            VIRTUAL308=(Token)match(input,VIRTUAL,FOLLOW_VIRTUAL_in_create_virtual_table_stmt2731);  
            stream_VIRTUAL.add(VIRTUAL308);


            TABLE309=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_virtual_table_stmt2733);  
            stream_TABLE.add(TABLE309);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:380:49: (database_name= id DOT )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==ID||LA116_0==STRING) ) {
                int LA116_1 = input.LA(2);

                if ( (LA116_1==DOT) ) {
                    alt116=1;
                }
            }
            else if ( ((LA116_0 >= ABORT && LA116_0 <= AFTER)||(LA116_0 >= ALL && LA116_0 <= ALTER)||(LA116_0 >= ANALYZE && LA116_0 <= AND)||(LA116_0 >= AS && LA116_0 <= ASC)||(LA116_0 >= ATTACH && LA116_0 <= AUTOINCREMENT)||(LA116_0 >= BEFORE && LA116_0 <= BETWEEN)||LA116_0==BY||(LA116_0 >= CASCADE && LA116_0 <= COLLATE)||LA116_0==COLUMN||(LA116_0 >= COMMIT && LA116_0 <= CONSTRAINT)||LA116_0==CREATE||(LA116_0 >= CROSS && LA116_0 <= CURRENT_TIMESTAMP)||(LA116_0 >= DATABASE && LA116_0 <= DISTINCT)||LA116_0==DROP||(LA116_0 >= EACH && LA116_0 <= END)||(LA116_0 >= ESCAPE && LA116_0 <= EXPLAIN)||LA116_0==FAIL||(LA116_0 >= FOR && LA116_0 <= FROM)||LA116_0==GROUP||LA116_0==HAVING||(LA116_0 >= IF && LA116_0 <= IMMEDIATE)||(LA116_0 >= INDEX && LA116_0 <= INSTEAD)||(LA116_0 >= INTERSECT && LA116_0 <= INTO)||LA116_0==IS||LA116_0==JOIN||LA116_0==KEY||LA116_0==LEFT||LA116_0==LIMIT||LA116_0==NATURAL||LA116_0==NULL||(LA116_0 >= OF && LA116_0 <= ON)||(LA116_0 >= OR && LA116_0 <= ORDER)||LA116_0==OUTER||LA116_0==PLAN||(LA116_0 >= PRAGMA && LA116_0 <= PRIMARY)||LA116_0==QUERY||(LA116_0 >= RAISE && LA116_0 <= REFERENCES)||(LA116_0 >= REINDEX && LA116_0 <= ROW)||(LA116_0 >= SAVEPOINT && LA116_0 <= SELECT)||LA116_0==SET||LA116_0==TABLE||(LA116_0 >= TEMPORARY && LA116_0 <= THEN)||(LA116_0 >= TO && LA116_0 <= TRIGGER)||(LA116_0 >= UNION && LA116_0 <= USING)||(LA116_0 >= VACUUM && LA116_0 <= VIRTUAL)||(LA116_0 >= WHEN && LA116_0 <= WHERE)) ) {
                int LA116_2 = input.LA(2);

                if ( (LA116_2==DOT) ) {
                    alt116=1;
                }
            }
            switch (alt116) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:380:50: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_virtual_table_stmt2738);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());

                    DOT310=(Token)match(input,DOT,FOLLOW_DOT_in_create_virtual_table_stmt2740);  
                    stream_DOT.add(DOT310);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2746);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());

            USING311=(Token)match(input,USING,FOLLOW_USING_in_create_virtual_table_stmt2750);  
            stream_USING.add(USING311);


            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2754);
            module_name=id();

            state._fsp--;

            stream_id.add(module_name.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:381:24: ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==LPAREN) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:381:25: LPAREN column_def ( COMMA column_def )* RPAREN
                    {
                    LPAREN312=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_virtual_table_stmt2757);  
                    stream_LPAREN.add(LPAREN312);


                    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2759);
                    column_def313=column_def();

                    state._fsp--;

                    stream_column_def.add(column_def313.getTree());

                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:381:43: ( COMMA column_def )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==COMMA) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:381:44: COMMA column_def
                    	    {
                    	    COMMA314=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_virtual_table_stmt2762);  
                    	    stream_COMMA.add(COMMA314);


                    	    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2764);
                    	    column_def315=column_def();

                    	    state._fsp--;

                    	    stream_column_def.add(column_def315.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);


                    RPAREN316=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_virtual_table_stmt2768);  
                    stream_RPAREN.add(RPAREN316);


                    }
                    break;

            }


            // AST REWRITE
            // elements: table_name, database_name, VIRTUAL, column_def, module_name
            // token labels: 
            // rule labels: database_name, retval, table_name, module_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);
            RewriteRuleSubtreeStream stream_module_name=new RewriteRuleSubtreeStream(adaptor,"rule module_name",module_name!=null?module_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 382:3: -> ^( CREATE_TABLE ^( OPTIONS VIRTUAL ) ^( $table_name ( $database_name)? ) ^( $module_name) ( ^( COLUMNS ( column_def )+ ) )? )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:382:6: ^( CREATE_TABLE ^( OPTIONS VIRTUAL ) ^( $table_name ( $database_name)? ) ^( $module_name) ( ^( COLUMNS ( column_def )+ ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CREATE_TABLE, "CREATE_TABLE")
                , root_1);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:382:21: ^( OPTIONS VIRTUAL )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OPTIONS, "OPTIONS")
                , root_2);

                adaptor.addChild(root_2, 
                stream_VIRTUAL.nextNode()
                );

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:382:40: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:382:55: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:382:71: ^( $module_name)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_module_name.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:382:87: ( ^( COLUMNS ( column_def )+ ) )?
                if ( stream_column_def.hasNext() ) {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:382:87: ^( COLUMNS ( column_def )+ )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(COLUMNS, "COLUMNS")
                    , root_2);

                    if ( !(stream_column_def.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_column_def.hasNext() ) {
                        adaptor.addChild(root_2, stream_column_def.nextTree());

                    }
                    stream_column_def.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_column_def.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create_virtual_table_stmt"


    public static class create_table_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create_table_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:1: create_table_stmt : CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( ( COMMA )? table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) ;
    public final SqlParser.create_table_stmt_return create_table_stmt() throws RecognitionException {
        SqlParser.create_table_stmt_return retval = new SqlParser.create_table_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CREATE317=null;
        Token TEMPORARY318=null;
        Token TABLE319=null;
        Token IF320=null;
        Token NOT321=null;
        Token EXISTS322=null;
        Token DOT323=null;
        Token LPAREN324=null;
        Token COMMA326=null;
        Token COMMA328=null;
        Token RPAREN330=null;
        Token AS331=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return table_name =null;

        SqlParser.column_def_return column_def325 =null;

        SqlParser.column_def_return column_def327 =null;

        SqlParser.table_constraint_return table_constraint329 =null;

        SqlParser.select_stmt_return select_stmt332 =null;


        Object CREATE317_tree=null;
        Object TEMPORARY318_tree=null;
        Object TABLE319_tree=null;
        Object IF320_tree=null;
        Object NOT321_tree=null;
        Object EXISTS322_tree=null;
        Object DOT323_tree=null;
        Object LPAREN324_tree=null;
        Object COMMA326_tree=null;
        Object COMMA328_tree=null;
        Object RPAREN330_tree=null;
        Object AS331_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_TEMPORARY=new RewriteRuleTokenStream(adaptor,"token TEMPORARY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_select_stmt=new RewriteRuleSubtreeStream(adaptor,"rule select_stmt");
        RewriteRuleSubtreeStream stream_column_def=new RewriteRuleSubtreeStream(adaptor,"rule column_def");
        RewriteRuleSubtreeStream stream_table_constraint=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:18: ( CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( ( COMMA )? table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:20: CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( ( COMMA )? table_constraint )* RPAREN | AS select_stmt )
            {
            CREATE317=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_table_stmt2814);  
            stream_CREATE.add(CREATE317);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:27: ( TEMPORARY )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==TEMPORARY) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:27: TEMPORARY
                    {
                    TEMPORARY318=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_table_stmt2816);  
                    stream_TEMPORARY.add(TEMPORARY318);


                    }
                    break;

            }


            TABLE319=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_table_stmt2819);  
            stream_TABLE.add(TABLE319);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:44: ( IF NOT EXISTS )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==IF) ) {
                int LA120_1 = input.LA(2);

                if ( (LA120_1==NOT) ) {
                    alt120=1;
                }
            }
            switch (alt120) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:45: IF NOT EXISTS
                    {
                    IF320=(Token)match(input,IF,FOLLOW_IF_in_create_table_stmt2822);  
                    stream_IF.add(IF320);


                    NOT321=(Token)match(input,NOT,FOLLOW_NOT_in_create_table_stmt2824);  
                    stream_NOT.add(NOT321);


                    EXISTS322=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_table_stmt2826);  
                    stream_EXISTS.add(EXISTS322);


                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:61: (database_name= id DOT )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==ID||LA121_0==STRING) ) {
                int LA121_1 = input.LA(2);

                if ( (LA121_1==DOT) ) {
                    alt121=1;
                }
            }
            else if ( ((LA121_0 >= ABORT && LA121_0 <= AFTER)||(LA121_0 >= ALL && LA121_0 <= ALTER)||(LA121_0 >= ANALYZE && LA121_0 <= AND)||(LA121_0 >= AS && LA121_0 <= ASC)||(LA121_0 >= ATTACH && LA121_0 <= AUTOINCREMENT)||(LA121_0 >= BEFORE && LA121_0 <= BETWEEN)||LA121_0==BY||(LA121_0 >= CASCADE && LA121_0 <= COLLATE)||LA121_0==COLUMN||(LA121_0 >= COMMIT && LA121_0 <= CONSTRAINT)||LA121_0==CREATE||(LA121_0 >= CROSS && LA121_0 <= CURRENT_TIMESTAMP)||(LA121_0 >= DATABASE && LA121_0 <= DISTINCT)||LA121_0==DROP||(LA121_0 >= EACH && LA121_0 <= END)||(LA121_0 >= ESCAPE && LA121_0 <= EXPLAIN)||LA121_0==FAIL||(LA121_0 >= FOR && LA121_0 <= FROM)||LA121_0==GROUP||LA121_0==HAVING||(LA121_0 >= IF && LA121_0 <= IMMEDIATE)||(LA121_0 >= INDEX && LA121_0 <= INSTEAD)||(LA121_0 >= INTERSECT && LA121_0 <= INTO)||LA121_0==IS||LA121_0==JOIN||LA121_0==KEY||LA121_0==LEFT||LA121_0==LIMIT||LA121_0==NATURAL||LA121_0==NULL||(LA121_0 >= OF && LA121_0 <= ON)||(LA121_0 >= OR && LA121_0 <= ORDER)||LA121_0==OUTER||LA121_0==PLAN||(LA121_0 >= PRAGMA && LA121_0 <= PRIMARY)||LA121_0==QUERY||(LA121_0 >= RAISE && LA121_0 <= REFERENCES)||(LA121_0 >= REINDEX && LA121_0 <= ROW)||(LA121_0 >= SAVEPOINT && LA121_0 <= SELECT)||LA121_0==SET||LA121_0==TABLE||(LA121_0 >= TEMPORARY && LA121_0 <= THEN)||(LA121_0 >= TO && LA121_0 <= TRIGGER)||(LA121_0 >= UNION && LA121_0 <= USING)||(LA121_0 >= VACUUM && LA121_0 <= VIRTUAL)||(LA121_0 >= WHEN && LA121_0 <= WHERE)) ) {
                int LA121_2 = input.LA(2);

                if ( (LA121_2==DOT) ) {
                    alt121=1;
                }
            }
            switch (alt121) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:385:62: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_table_stmt2833);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());

                    DOT323=(Token)match(input,DOT,FOLLOW_DOT_in_create_table_stmt2835);  
                    stream_DOT.add(DOT323);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_create_table_stmt2841);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:386:3: ( LPAREN column_def ( COMMA column_def )* ( ( COMMA )? table_constraint )* RPAREN | AS select_stmt )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==LPAREN) ) {
                alt125=1;
            }
            else if ( (LA125_0==AS) ) {
                alt125=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;

            }
            switch (alt125) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:386:5: LPAREN column_def ( COMMA column_def )* ( ( COMMA )? table_constraint )* RPAREN
                    {
                    LPAREN324=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_table_stmt2847);  
                    stream_LPAREN.add(LPAREN324);


                    pushFollow(FOLLOW_column_def_in_create_table_stmt2849);
                    column_def325=column_def();

                    state._fsp--;

                    stream_column_def.add(column_def325.getTree());

                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:386:23: ( COMMA column_def )*
                    loop122:
                    do {
                        int alt122=2;
                        alt122 = dfa122.predict(input);
                        switch (alt122) {
                    	case 1 :
                    	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:386:24: COMMA column_def
                    	    {
                    	    COMMA326=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2852);  
                    	    stream_COMMA.add(COMMA326);


                    	    pushFollow(FOLLOW_column_def_in_create_table_stmt2854);
                    	    column_def327=column_def();

                    	    state._fsp--;

                    	    stream_column_def.add(column_def327.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop122;
                        }
                    } while (true);


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:386:43: ( ( COMMA )? table_constraint )*
                    loop124:
                    do {
                        int alt124=2;
                        int LA124_0 = input.LA(1);

                        if ( (LA124_0==CHECK||LA124_0==COMMA||LA124_0==CONSTRAINT||LA124_0==FOREIGN||LA124_0==PRIMARY||LA124_0==UNIQUE) ) {
                            alt124=1;
                        }


                        switch (alt124) {
                    	case 1 :
                    	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:386:44: ( COMMA )? table_constraint
                    	    {
                    	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:386:44: ( COMMA )?
                    	    int alt123=2;
                    	    int LA123_0 = input.LA(1);

                    	    if ( (LA123_0==COMMA) ) {
                    	        alt123=1;
                    	    }
                    	    switch (alt123) {
                    	        case 1 :
                    	            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:386:44: COMMA
                    	            {
                    	            COMMA328=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2859);  
                    	            stream_COMMA.add(COMMA328);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_table_constraint_in_create_table_stmt2862);
                    	    table_constraint329=table_constraint();

                    	    state._fsp--;

                    	    stream_table_constraint.add(table_constraint329.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop124;
                        }
                    } while (true);


                    RPAREN330=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_table_stmt2866);  
                    stream_RPAREN.add(RPAREN330);


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:387:5: AS select_stmt
                    {
                    AS331=(Token)match(input,AS,FOLLOW_AS_in_create_table_stmt2872);  
                    stream_AS.add(AS331);


                    pushFollow(FOLLOW_select_stmt_in_create_table_stmt2874);
                    select_stmt332=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt332.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: table_constraint, table_name, select_stmt, column_def, TEMPORARY, database_name, EXISTS
            // token labels: 
            // rule labels: database_name, retval, table_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 388:74: -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:388:4: ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CREATE_TABLE, "CREATE_TABLE")
                , root_1);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:388:19: ^( OPTIONS ( TEMPORARY )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OPTIONS, "OPTIONS")
                , root_2);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:388:29: ( TEMPORARY )?
                if ( stream_TEMPORARY.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_TEMPORARY.nextNode()
                    );

                }
                stream_TEMPORARY.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:388:40: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_EXISTS.nextNode()
                    );

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:388:49: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:388:64: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:389:3: ( ^( COLUMNS ( column_def )+ ) )?
                if ( stream_column_def.hasNext() ) {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:389:3: ^( COLUMNS ( column_def )+ )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(COLUMNS, "COLUMNS")
                    , root_2);

                    if ( !(stream_column_def.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_column_def.hasNext() ) {
                        adaptor.addChild(root_2, stream_column_def.nextTree());

                    }
                    stream_column_def.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_column_def.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:389:27: ( ^( CONSTRAINTS ( table_constraint )* ) )?
                if ( stream_table_constraint.hasNext() ) {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:389:27: ^( CONSTRAINTS ( table_constraint )* )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS")
                    , root_2);

                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:389:41: ( table_constraint )*
                    while ( stream_table_constraint.hasNext() ) {
                        adaptor.addChild(root_2, stream_table_constraint.nextTree());

                    }
                    stream_table_constraint.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_table_constraint.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:389:61: ( select_stmt )?
                if ( stream_select_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_select_stmt.nextTree());

                }
                stream_select_stmt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create_table_stmt"


    public static class column_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_def"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:391:1: column_def : name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) ;
    public final SqlParser.column_def_return column_def() throws RecognitionException {
        SqlParser.column_def_return retval = new SqlParser.column_def_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlParser.id_column_def_return name =null;

        SqlParser.type_name_return type_name333 =null;

        SqlParser.column_constraint_return column_constraint334 =null;


        RewriteRuleSubtreeStream stream_column_constraint=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint");
        RewriteRuleSubtreeStream stream_id_column_def=new RewriteRuleSubtreeStream(adaptor,"rule id_column_def");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:391:11: (name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:391:13: name= id_column_def ( type_name )? ( column_constraint )*
            {
            pushFollow(FOLLOW_id_column_def_in_column_def2930);
            name=id_column_def();

            state._fsp--;

            stream_id_column_def.add(name.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:391:32: ( type_name )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==ID) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:391:32: type_name
                    {
                    pushFollow(FOLLOW_type_name_in_column_def2932);
                    type_name333=type_name();

                    state._fsp--;

                    stream_type_name.add(type_name333.getTree());

                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:391:43: ( column_constraint )*
            loop127:
            do {
                int alt127=2;
                alt127 = dfa127.predict(input);
                switch (alt127) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:391:43: column_constraint
            	    {
            	    pushFollow(FOLLOW_column_constraint_in_column_def2935);
            	    column_constraint334=column_constraint();

            	    state._fsp--;

            	    stream_column_constraint.add(column_constraint334.getTree());

            	    }
            	    break;

            	default :
            	    break loop127;
                }
            } while (true);


            // AST REWRITE
            // elements: column_constraint, type_name, name
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 392:57: -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:392:4: ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_name.nextNode(), root_1);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:392:12: ^( CONSTRAINTS ( column_constraint )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS")
                , root_2);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:392:26: ( column_constraint )*
                while ( stream_column_constraint.hasNext() ) {
                    adaptor.addChild(root_2, stream_column_constraint.nextTree());

                }
                stream_column_constraint.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:392:46: ( type_name )?
                if ( stream_type_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_type_name.nextTree());

                }
                stream_type_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_def"


    public static class column_constraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_constraint"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:394:1: column_constraint : ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) ;
    public final SqlParser.column_constraint_return column_constraint() throws RecognitionException {
        SqlParser.column_constraint_return retval = new SqlParser.column_constraint_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONSTRAINT335=null;
        SqlParser.id_return name =null;

        SqlParser.column_constraint_pk_return column_constraint_pk336 =null;

        SqlParser.column_constraint_not_null_return column_constraint_not_null337 =null;

        SqlParser.column_constraint_null_return column_constraint_null338 =null;

        SqlParser.column_constraint_unique_return column_constraint_unique339 =null;

        SqlParser.column_constraint_check_return column_constraint_check340 =null;

        SqlParser.column_constraint_default_return column_constraint_default341 =null;

        SqlParser.column_constraint_collate_return column_constraint_collate342 =null;

        SqlParser.fk_clause_return fk_clause343 =null;


        Object CONSTRAINT335_tree=null;
        RewriteRuleTokenStream stream_CONSTRAINT=new RewriteRuleTokenStream(adaptor,"token CONSTRAINT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_column_constraint_default=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_default");
        RewriteRuleSubtreeStream stream_column_constraint_check=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_check");
        RewriteRuleSubtreeStream stream_column_constraint_pk=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_pk");
        RewriteRuleSubtreeStream stream_column_constraint_null=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_null");
        RewriteRuleSubtreeStream stream_column_constraint_collate=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_collate");
        RewriteRuleSubtreeStream stream_column_constraint_unique=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_unique");
        RewriteRuleSubtreeStream stream_fk_clause=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause");
        RewriteRuleSubtreeStream stream_column_constraint_not_null=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint_not_null");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:394:18: ( ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:394:20: ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:394:20: ( CONSTRAINT name= id )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==CONSTRAINT) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:394:21: CONSTRAINT name= id
                    {
                    CONSTRAINT335=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_column_constraint2961);  
                    stream_CONSTRAINT.add(CONSTRAINT335);


                    pushFollow(FOLLOW_id_in_column_constraint2965);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:395:3: ( column_constraint_pk | column_constraint_not_null | column_constraint_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            int alt129=8;
            switch ( input.LA(1) ) {
            case PRIMARY:
                {
                alt129=1;
                }
                break;
            case NOT:
                {
                alt129=2;
                }
                break;
            case NULL:
                {
                alt129=3;
                }
                break;
            case UNIQUE:
                {
                alt129=4;
                }
                break;
            case CHECK:
                {
                alt129=5;
                }
                break;
            case DEFAULT:
                {
                alt129=6;
                }
                break;
            case COLLATE:
                {
                alt129=7;
                }
                break;
            case REFERENCES:
                {
                alt129=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;

            }

            switch (alt129) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:395:5: column_constraint_pk
                    {
                    pushFollow(FOLLOW_column_constraint_pk_in_column_constraint2973);
                    column_constraint_pk336=column_constraint_pk();

                    state._fsp--;

                    stream_column_constraint_pk.add(column_constraint_pk336.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:396:5: column_constraint_not_null
                    {
                    pushFollow(FOLLOW_column_constraint_not_null_in_column_constraint2979);
                    column_constraint_not_null337=column_constraint_not_null();

                    state._fsp--;

                    stream_column_constraint_not_null.add(column_constraint_not_null337.getTree());

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:397:5: column_constraint_null
                    {
                    pushFollow(FOLLOW_column_constraint_null_in_column_constraint2985);
                    column_constraint_null338=column_constraint_null();

                    state._fsp--;

                    stream_column_constraint_null.add(column_constraint_null338.getTree());

                    }
                    break;
                case 4 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:398:5: column_constraint_unique
                    {
                    pushFollow(FOLLOW_column_constraint_unique_in_column_constraint2991);
                    column_constraint_unique339=column_constraint_unique();

                    state._fsp--;

                    stream_column_constraint_unique.add(column_constraint_unique339.getTree());

                    }
                    break;
                case 5 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:399:5: column_constraint_check
                    {
                    pushFollow(FOLLOW_column_constraint_check_in_column_constraint2997);
                    column_constraint_check340=column_constraint_check();

                    state._fsp--;

                    stream_column_constraint_check.add(column_constraint_check340.getTree());

                    }
                    break;
                case 6 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:400:5: column_constraint_default
                    {
                    pushFollow(FOLLOW_column_constraint_default_in_column_constraint3003);
                    column_constraint_default341=column_constraint_default();

                    state._fsp--;

                    stream_column_constraint_default.add(column_constraint_default341.getTree());

                    }
                    break;
                case 7 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:401:5: column_constraint_collate
                    {
                    pushFollow(FOLLOW_column_constraint_collate_in_column_constraint3009);
                    column_constraint_collate342=column_constraint_collate();

                    state._fsp--;

                    stream_column_constraint_collate.add(column_constraint_collate342.getTree());

                    }
                    break;
                case 8 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:402:5: fk_clause
                    {
                    pushFollow(FOLLOW_fk_clause_in_column_constraint3015);
                    fk_clause343=fk_clause();

                    state._fsp--;

                    stream_fk_clause.add(fk_clause343.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: fk_clause, column_constraint_not_null, name, column_constraint_unique, column_constraint_default, column_constraint_null, column_constraint_check, column_constraint_collate, column_constraint_pk
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 403:10: -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:403:4: ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLUMN_CONSTRAINT, "COLUMN_CONSTRAINT")
                , root_1);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:404:3: ( column_constraint_pk )?
                if ( stream_column_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_pk.nextTree());

                }
                stream_column_constraint_pk.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:405:3: ( column_constraint_not_null )?
                if ( stream_column_constraint_not_null.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_not_null.nextTree());

                }
                stream_column_constraint_not_null.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:406:3: ( column_constraint_null )?
                if ( stream_column_constraint_null.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_null.nextTree());

                }
                stream_column_constraint_null.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:407:3: ( column_constraint_unique )?
                if ( stream_column_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_unique.nextTree());

                }
                stream_column_constraint_unique.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:408:3: ( column_constraint_check )?
                if ( stream_column_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_check.nextTree());

                }
                stream_column_constraint_check.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:409:3: ( column_constraint_default )?
                if ( stream_column_constraint_default.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_default.nextTree());

                }
                stream_column_constraint_default.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:410:3: ( column_constraint_collate )?
                if ( stream_column_constraint_collate.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_collate.nextTree());

                }
                stream_column_constraint_collate.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:411:3: ( fk_clause )?
                if ( stream_fk_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause.nextTree());

                }
                stream_fk_clause.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:412:4: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextTree());

                }
                stream_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_constraint"


    public static class column_constraint_pk_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_constraint_pk"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:414:1: column_constraint_pk : PRIMARY ^ KEY ! ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? ;
    public final SqlParser.column_constraint_pk_return column_constraint_pk() throws RecognitionException {
        SqlParser.column_constraint_pk_return retval = new SqlParser.column_constraint_pk_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRIMARY344=null;
        Token KEY345=null;
        Token set346=null;
        Token AUTOINCREMENT348=null;
        SqlParser.table_conflict_clause_return table_conflict_clause347 =null;


        Object PRIMARY344_tree=null;
        Object KEY345_tree=null;
        Object set346_tree=null;
        Object AUTOINCREMENT348_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:414:21: ( PRIMARY ^ KEY ! ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:414:23: PRIMARY ^ KEY ! ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )?
            {
            root_0 = (Object)adaptor.nil();


            PRIMARY344=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_column_constraint_pk3075); 
            PRIMARY344_tree = 
            (Object)adaptor.create(PRIMARY344)
            ;
            root_0 = (Object)adaptor.becomeRoot(PRIMARY344_tree, root_0);


            KEY345=(Token)match(input,KEY,FOLLOW_KEY_in_column_constraint_pk3078); 

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:414:37: ( ASC | DESC )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==ASC||LA130_0==DESC) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
                    {
                    set346=(Token)input.LT(1);

                    if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set346)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:414:51: ( table_conflict_clause )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==ON) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:414:51: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_pk3090);
                    table_conflict_clause347=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause347.getTree());

                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:414:74: ( AUTOINCREMENT )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==AUTOINCREMENT) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:414:75: AUTOINCREMENT
                    {
                    AUTOINCREMENT348=(Token)match(input,AUTOINCREMENT,FOLLOW_AUTOINCREMENT_in_column_constraint_pk3094); 
                    AUTOINCREMENT348_tree = 
                    (Object)adaptor.create(AUTOINCREMENT348)
                    ;
                    adaptor.addChild(root_0, AUTOINCREMENT348_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_constraint_pk"


    public static class column_constraint_not_null_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_constraint_not_null"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:416:1: column_constraint_not_null : NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) ;
    public final SqlParser.column_constraint_not_null_return column_constraint_not_null() throws RecognitionException {
        SqlParser.column_constraint_not_null_return retval = new SqlParser.column_constraint_not_null_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NOT349=null;
        Token NULL350=null;
        SqlParser.table_conflict_clause_return table_conflict_clause351 =null;


        Object NOT349_tree=null;
        Object NULL350_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:416:27: ( NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:416:29: NOT NULL ( table_conflict_clause )?
            {
            NOT349=(Token)match(input,NOT,FOLLOW_NOT_in_column_constraint_not_null3103);  
            stream_NOT.add(NOT349);


            NULL350=(Token)match(input,NULL,FOLLOW_NULL_in_column_constraint_not_null3105);  
            stream_NULL.add(NULL350);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:416:38: ( table_conflict_clause )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==ON) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:416:38: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_not_null3107);
                    table_conflict_clause351=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause351.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: table_conflict_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 416:61: -> ^( NOT_NULL ( table_conflict_clause )? )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:416:64: ^( NOT_NULL ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NOT_NULL, "NOT_NULL")
                , root_1);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:416:75: ( table_conflict_clause )?
                if ( stream_table_conflict_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_conflict_clause.nextTree());

                }
                stream_table_conflict_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_constraint_not_null"


    public static class column_constraint_null_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_constraint_null"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:418:1: column_constraint_null : NULL ( table_conflict_clause )? -> ^( IS_NULL ( table_conflict_clause )? ) ;
    public final SqlParser.column_constraint_null_return column_constraint_null() throws RecognitionException {
        SqlParser.column_constraint_null_return retval = new SqlParser.column_constraint_null_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NULL352=null;
        SqlParser.table_conflict_clause_return table_conflict_clause353 =null;


        Object NULL352_tree=null;
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:418:23: ( NULL ( table_conflict_clause )? -> ^( IS_NULL ( table_conflict_clause )? ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:418:25: NULL ( table_conflict_clause )?
            {
            NULL352=(Token)match(input,NULL,FOLLOW_NULL_in_column_constraint_null3124);  
            stream_NULL.add(NULL352);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:418:30: ( table_conflict_clause )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==ON) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:418:30: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_null3126);
                    table_conflict_clause353=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause353.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: table_conflict_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 418:53: -> ^( IS_NULL ( table_conflict_clause )? )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:418:56: ^( IS_NULL ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IS_NULL, "IS_NULL")
                , root_1);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:418:66: ( table_conflict_clause )?
                if ( stream_table_conflict_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_conflict_clause.nextTree());

                }
                stream_table_conflict_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_constraint_null"


    public static class column_constraint_unique_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_constraint_unique"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:420:1: column_constraint_unique : UNIQUE ^ ( table_conflict_clause )? ;
    public final SqlParser.column_constraint_unique_return column_constraint_unique() throws RecognitionException {
        SqlParser.column_constraint_unique_return retval = new SqlParser.column_constraint_unique_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token UNIQUE354=null;
        SqlParser.table_conflict_clause_return table_conflict_clause355 =null;


        Object UNIQUE354_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:420:25: ( UNIQUE ^ ( table_conflict_clause )? )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:420:27: UNIQUE ^ ( table_conflict_clause )?
            {
            root_0 = (Object)adaptor.nil();


            UNIQUE354=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_column_constraint_unique3143); 
            UNIQUE354_tree = 
            (Object)adaptor.create(UNIQUE354)
            ;
            root_0 = (Object)adaptor.becomeRoot(UNIQUE354_tree, root_0);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:420:35: ( table_conflict_clause )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==ON) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:420:35: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_unique3146);
                    table_conflict_clause355=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause355.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_constraint_unique"


    public static class column_constraint_check_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_constraint_check"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:422:1: column_constraint_check : CHECK ^ LPAREN ! expr RPAREN !;
    public final SqlParser.column_constraint_check_return column_constraint_check() throws RecognitionException {
        SqlParser.column_constraint_check_return retval = new SqlParser.column_constraint_check_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHECK356=null;
        Token LPAREN357=null;
        Token RPAREN359=null;
        SqlParser.expr_return expr358 =null;


        Object CHECK356_tree=null;
        Object LPAREN357_tree=null;
        Object RPAREN359_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:422:24: ( CHECK ^ LPAREN ! expr RPAREN !)
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:422:26: CHECK ^ LPAREN ! expr RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            CHECK356=(Token)match(input,CHECK,FOLLOW_CHECK_in_column_constraint_check3154); 
            CHECK356_tree = 
            (Object)adaptor.create(CHECK356)
            ;
            root_0 = (Object)adaptor.becomeRoot(CHECK356_tree, root_0);


            LPAREN357=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_check3157); 

            pushFollow(FOLLOW_expr_in_column_constraint_check3160);
            expr358=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr358.getTree());

            RPAREN359=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_check3162); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_constraint_check"


    public static class numeric_literal_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numeric_literal_value"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:424:1: numeric_literal_value : ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) );
    public final SqlParser.numeric_literal_value_return numeric_literal_value() throws RecognitionException {
        SqlParser.numeric_literal_value_return retval = new SqlParser.numeric_literal_value_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTEGER360=null;
        Token FLOAT361=null;

        Object INTEGER360_tree=null;
        Object FLOAT361_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:425:3: ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) )
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==INTEGER) ) {
                alt136=1;
            }
            else if ( (LA136_0==FLOAT) ) {
                alt136=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;

            }
            switch (alt136) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:425:5: INTEGER
                    {
                    INTEGER360=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_numeric_literal_value3173);  
                    stream_INTEGER.add(INTEGER360);


                    // AST REWRITE
                    // elements: INTEGER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 425:13: -> ^( INTEGER_LITERAL INTEGER )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:425:16: ^( INTEGER_LITERAL INTEGER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(INTEGER_LITERAL, "INTEGER_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INTEGER.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:426:5: FLOAT
                    {
                    FLOAT361=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_numeric_literal_value3187);  
                    stream_FLOAT.add(FLOAT361);


                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 426:11: -> ^( FLOAT_LITERAL FLOAT )
                    {
                        // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:426:14: ^( FLOAT_LITERAL FLOAT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FLOAT_LITERAL, "FLOAT_LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_FLOAT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "numeric_literal_value"


    public static class signed_default_number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "signed_default_number"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:429:1: signed_default_number : ( PLUS | MINUS ) ^ numeric_literal_value ;
    public final SqlParser.signed_default_number_return signed_default_number() throws RecognitionException {
        SqlParser.signed_default_number_return retval = new SqlParser.signed_default_number_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set362=null;
        SqlParser.numeric_literal_value_return numeric_literal_value363 =null;


        Object set362_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:429:22: ( ( PLUS | MINUS ) ^ numeric_literal_value )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:429:24: ( PLUS | MINUS ) ^ numeric_literal_value
            {
            root_0 = (Object)adaptor.nil();


            set362=(Token)input.LT(1);

            set362=(Token)input.LT(1);

            if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                input.consume();
                root_0 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(set362)
                , root_0);
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            pushFollow(FOLLOW_numeric_literal_value_in_signed_default_number3214);
            numeric_literal_value363=numeric_literal_value();

            state._fsp--;

            adaptor.addChild(root_0, numeric_literal_value363.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "signed_default_number"


    public static class column_constraint_default_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_constraint_default"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:432:1: column_constraint_default : DEFAULT ^ ( signed_default_number | literal_value | LPAREN ! expr RPAREN !) ;
    public final SqlParser.column_constraint_default_return column_constraint_default() throws RecognitionException {
        SqlParser.column_constraint_default_return retval = new SqlParser.column_constraint_default_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DEFAULT364=null;
        Token LPAREN367=null;
        Token RPAREN369=null;
        SqlParser.signed_default_number_return signed_default_number365 =null;

        SqlParser.literal_value_return literal_value366 =null;

        SqlParser.expr_return expr368 =null;


        Object DEFAULT364_tree=null;
        Object LPAREN367_tree=null;
        Object RPAREN369_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:432:26: ( DEFAULT ^ ( signed_default_number | literal_value | LPAREN ! expr RPAREN !) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:432:28: DEFAULT ^ ( signed_default_number | literal_value | LPAREN ! expr RPAREN !)
            {
            root_0 = (Object)adaptor.nil();


            DEFAULT364=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_column_constraint_default3222); 
            DEFAULT364_tree = 
            (Object)adaptor.create(DEFAULT364)
            ;
            root_0 = (Object)adaptor.becomeRoot(DEFAULT364_tree, root_0);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:432:37: ( signed_default_number | literal_value | LPAREN ! expr RPAREN !)
            int alt137=3;
            switch ( input.LA(1) ) {
            case MINUS:
            case PLUS:
                {
                alt137=1;
                }
                break;
            case BLOB:
            case CURRENT_DATE:
            case CURRENT_TIME:
            case CURRENT_TIMESTAMP:
            case FLOAT:
            case INTEGER:
            case NULL:
            case STRING:
                {
                alt137=2;
                }
                break;
            case LPAREN:
                {
                alt137=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;

            }

            switch (alt137) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:432:38: signed_default_number
                    {
                    pushFollow(FOLLOW_signed_default_number_in_column_constraint_default3226);
                    signed_default_number365=signed_default_number();

                    state._fsp--;

                    adaptor.addChild(root_0, signed_default_number365.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:432:62: literal_value
                    {
                    pushFollow(FOLLOW_literal_value_in_column_constraint_default3230);
                    literal_value366=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value366.getTree());

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:432:78: LPAREN ! expr RPAREN !
                    {
                    LPAREN367=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_default3234); 

                    pushFollow(FOLLOW_expr_in_column_constraint_default3237);
                    expr368=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr368.getTree());

                    RPAREN369=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_default3239); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_constraint_default"


    public static class column_constraint_collate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_constraint_collate"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:434:1: column_constraint_collate : COLLATE ^collation_name= id ;
    public final SqlParser.column_constraint_collate_return column_constraint_collate() throws RecognitionException {
        SqlParser.column_constraint_collate_return retval = new SqlParser.column_constraint_collate_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLLATE370=null;
        SqlParser.id_return collation_name =null;


        Object COLLATE370_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:434:26: ( COLLATE ^collation_name= id )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:434:28: COLLATE ^collation_name= id
            {
            root_0 = (Object)adaptor.nil();


            COLLATE370=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_column_constraint_collate3248); 
            COLLATE370_tree = 
            (Object)adaptor.create(COLLATE370)
            ;
            root_0 = (Object)adaptor.becomeRoot(COLLATE370_tree, root_0);


            pushFollow(FOLLOW_id_in_column_constraint_collate3253);
            collation_name=id();

            state._fsp--;

            adaptor.addChild(root_0, collation_name.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_constraint_collate"


    public static class table_constraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_constraint"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:436:1: table_constraint : ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) ;
    public final SqlParser.table_constraint_return table_constraint() throws RecognitionException {
        SqlParser.table_constraint_return retval = new SqlParser.table_constraint_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONSTRAINT371=null;
        SqlParser.id_return name =null;

        SqlParser.table_constraint_pk_return table_constraint_pk372 =null;

        SqlParser.table_constraint_unique_return table_constraint_unique373 =null;

        SqlParser.table_constraint_check_return table_constraint_check374 =null;

        SqlParser.table_constraint_fk_return table_constraint_fk375 =null;


        Object CONSTRAINT371_tree=null;
        RewriteRuleTokenStream stream_CONSTRAINT=new RewriteRuleTokenStream(adaptor,"token CONSTRAINT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_constraint_pk=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_pk");
        RewriteRuleSubtreeStream stream_table_constraint_fk=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_fk");
        RewriteRuleSubtreeStream stream_table_constraint_unique=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_unique");
        RewriteRuleSubtreeStream stream_table_constraint_check=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_check");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:436:17: ( ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:436:19: ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
            {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:436:19: ( CONSTRAINT name= id )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==CONSTRAINT) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:436:20: CONSTRAINT name= id
                    {
                    CONSTRAINT371=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_table_constraint3262);  
                    stream_CONSTRAINT.add(CONSTRAINT371);


                    pushFollow(FOLLOW_id_in_table_constraint3266);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:437:3: ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
            int alt139=4;
            switch ( input.LA(1) ) {
            case PRIMARY:
                {
                alt139=1;
                }
                break;
            case UNIQUE:
                {
                alt139=2;
                }
                break;
            case CHECK:
                {
                alt139=3;
                }
                break;
            case FOREIGN:
                {
                alt139=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;

            }

            switch (alt139) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:437:5: table_constraint_pk
                    {
                    pushFollow(FOLLOW_table_constraint_pk_in_table_constraint3274);
                    table_constraint_pk372=table_constraint_pk();

                    state._fsp--;

                    stream_table_constraint_pk.add(table_constraint_pk372.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:438:5: table_constraint_unique
                    {
                    pushFollow(FOLLOW_table_constraint_unique_in_table_constraint3280);
                    table_constraint_unique373=table_constraint_unique();

                    state._fsp--;

                    stream_table_constraint_unique.add(table_constraint_unique373.getTree());

                    }
                    break;
                case 3 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:439:5: table_constraint_check
                    {
                    pushFollow(FOLLOW_table_constraint_check_in_table_constraint3286);
                    table_constraint_check374=table_constraint_check();

                    state._fsp--;

                    stream_table_constraint_check.add(table_constraint_check374.getTree());

                    }
                    break;
                case 4 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:440:5: table_constraint_fk
                    {
                    pushFollow(FOLLOW_table_constraint_fk_in_table_constraint3292);
                    table_constraint_fk375=table_constraint_fk();

                    state._fsp--;

                    stream_table_constraint_fk.add(table_constraint_fk375.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: table_constraint_pk, table_constraint_check, table_constraint_unique, table_constraint_fk, name
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 441:10: -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:441:4: ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TABLE_CONSTRAINT, "TABLE_CONSTRAINT")
                , root_1);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:442:3: ( table_constraint_pk )?
                if ( stream_table_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_pk.nextTree());

                }
                stream_table_constraint_pk.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:443:3: ( table_constraint_unique )?
                if ( stream_table_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_unique.nextTree());

                }
                stream_table_constraint_unique.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:444:3: ( table_constraint_check )?
                if ( stream_table_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_check.nextTree());

                }
                stream_table_constraint_check.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:445:3: ( table_constraint_fk )?
                if ( stream_table_constraint_fk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_fk.nextTree());

                }
                stream_table_constraint_fk.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:446:4: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextTree());

                }
                stream_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_constraint"


    public static class table_constraint_pk_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_constraint_pk"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:448:1: table_constraint_pk : PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
    public final SqlParser.table_constraint_pk_return table_constraint_pk() throws RecognitionException {
        SqlParser.table_constraint_pk_return retval = new SqlParser.table_constraint_pk_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRIMARY376=null;
        Token KEY377=null;
        Token LPAREN378=null;
        Token COMMA379=null;
        Token RPAREN380=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause381 =null;

        RuleReturnScope indexed_columns = null;
        Object PRIMARY376_tree=null;
        Object KEY377_tree=null;
        Object LPAREN378_tree=null;
        Object COMMA379_tree=null;
        Object RPAREN380_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_PRIMARY=new RewriteRuleTokenStream(adaptor,"token PRIMARY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:448:20: ( PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:448:22: PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            PRIMARY376=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_table_constraint_pk3332);  
            stream_PRIMARY.add(PRIMARY376);


            KEY377=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_pk3334);  
            stream_KEY.add(KEY377);


            LPAREN378=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_pk3338);  
            stream_LPAREN.add(LPAREN378);


            pushFollow(FOLLOW_id_in_table_constraint_pk3342);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:449:30: ( COMMA indexed_columns+= id )*
            loop140:
            do {
                int alt140=2;
                int LA140_0 = input.LA(1);

                if ( (LA140_0==COMMA) ) {
                    alt140=1;
                }


                switch (alt140) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:449:31: COMMA indexed_columns+= id
            	    {
            	    COMMA379=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_pk3345);  
            	    stream_COMMA.add(COMMA379);


            	    pushFollow(FOLLOW_id_in_table_constraint_pk3349);
            	    indexed_columns=id();

            	    state._fsp--;

            	    stream_id.add(indexed_columns.getTree());
            	    if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            	    list_indexed_columns.add(indexed_columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop140;
                }
            } while (true);


            RPAREN380=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_pk3353);  
            stream_RPAREN.add(RPAREN380);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:449:66: ( table_conflict_clause )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==ON) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:449:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_pk3355);
                    table_conflict_clause381=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause381.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: PRIMARY, indexed_columns, table_conflict_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: indexed_columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_indexed_columns=new RewriteRuleSubtreeStream(adaptor,"token indexed_columns",list_indexed_columns);
            root_0 = (Object)adaptor.nil();
            // 450:66: -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:450:4: ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_PRIMARY.nextNode()
                , root_1);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:450:14: ^( COLUMNS ( $indexed_columns)+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLUMNS, "COLUMNS")
                , root_2);

                if ( !(stream_indexed_columns.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_indexed_columns.hasNext() ) {
                    adaptor.addChild(root_2, stream_indexed_columns.nextTree());

                }
                stream_indexed_columns.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:450:43: ( table_conflict_clause )?
                if ( stream_table_conflict_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_conflict_clause.nextTree());

                }
                stream_table_conflict_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_constraint_pk"


    public static class table_constraint_unique_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_constraint_unique"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:452:1: table_constraint_unique : UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
    public final SqlParser.table_constraint_unique_return table_constraint_unique() throws RecognitionException {
        SqlParser.table_constraint_unique_return retval = new SqlParser.table_constraint_unique_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token UNIQUE382=null;
        Token LPAREN383=null;
        Token COMMA384=null;
        Token RPAREN385=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause386 =null;

        RuleReturnScope indexed_columns = null;
        Object UNIQUE382_tree=null;
        Object LPAREN383_tree=null;
        Object COMMA384_tree=null;
        Object RPAREN385_tree=null;
        RewriteRuleTokenStream stream_UNIQUE=new RewriteRuleTokenStream(adaptor,"token UNIQUE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:452:24: ( UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:452:26: UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            UNIQUE382=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_table_constraint_unique3380);  
            stream_UNIQUE.add(UNIQUE382);


            LPAREN383=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_unique3384);  
            stream_LPAREN.add(LPAREN383);


            pushFollow(FOLLOW_id_in_table_constraint_unique3388);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:453:30: ( COMMA indexed_columns+= id )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==COMMA) ) {
                    alt142=1;
                }


                switch (alt142) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:453:31: COMMA indexed_columns+= id
            	    {
            	    COMMA384=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_unique3391);  
            	    stream_COMMA.add(COMMA384);


            	    pushFollow(FOLLOW_id_in_table_constraint_unique3395);
            	    indexed_columns=id();

            	    state._fsp--;

            	    stream_id.add(indexed_columns.getTree());
            	    if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            	    list_indexed_columns.add(indexed_columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop142;
                }
            } while (true);


            RPAREN385=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_unique3399);  
            stream_RPAREN.add(RPAREN385);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:453:66: ( table_conflict_clause )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==ON) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:453:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_unique3401);
                    table_conflict_clause386=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause386.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: table_conflict_clause, indexed_columns, UNIQUE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: indexed_columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_indexed_columns=new RewriteRuleSubtreeStream(adaptor,"token indexed_columns",list_indexed_columns);
            root_0 = (Object)adaptor.nil();
            // 454:65: -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:454:4: ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_UNIQUE.nextNode()
                , root_1);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:454:13: ^( COLUMNS ( $indexed_columns)+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLUMNS, "COLUMNS")
                , root_2);

                if ( !(stream_indexed_columns.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_indexed_columns.hasNext() ) {
                    adaptor.addChild(root_2, stream_indexed_columns.nextTree());

                }
                stream_indexed_columns.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:454:42: ( table_conflict_clause )?
                if ( stream_table_conflict_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_conflict_clause.nextTree());

                }
                stream_table_conflict_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_constraint_unique"


    public static class table_constraint_check_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_constraint_check"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:456:1: table_constraint_check : CHECK ^ LPAREN ! expr RPAREN !;
    public final SqlParser.table_constraint_check_return table_constraint_check() throws RecognitionException {
        SqlParser.table_constraint_check_return retval = new SqlParser.table_constraint_check_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CHECK387=null;
        Token LPAREN388=null;
        Token RPAREN390=null;
        SqlParser.expr_return expr389 =null;


        Object CHECK387_tree=null;
        Object LPAREN388_tree=null;
        Object RPAREN390_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:456:23: ( CHECK ^ LPAREN ! expr RPAREN !)
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:456:25: CHECK ^ LPAREN ! expr RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            CHECK387=(Token)match(input,CHECK,FOLLOW_CHECK_in_table_constraint_check3426); 
            CHECK387_tree = 
            (Object)adaptor.create(CHECK387)
            ;
            root_0 = (Object)adaptor.becomeRoot(CHECK387_tree, root_0);


            LPAREN388=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_check3429); 

            pushFollow(FOLLOW_expr_in_table_constraint_check3432);
            expr389=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr389.getTree());

            RPAREN390=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_check3434); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_constraint_check"


    public static class table_constraint_fk_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_constraint_fk"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:458:1: table_constraint_fk : FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) ;
    public final SqlParser.table_constraint_fk_return table_constraint_fk() throws RecognitionException {
        SqlParser.table_constraint_fk_return retval = new SqlParser.table_constraint_fk_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FOREIGN391=null;
        Token KEY392=null;
        Token LPAREN393=null;
        Token COMMA394=null;
        Token RPAREN395=null;
        List list_column_names=null;
        SqlParser.fk_clause_return fk_clause396 =null;

        RuleReturnScope column_names = null;
        Object FOREIGN391_tree=null;
        Object KEY392_tree=null;
        Object LPAREN393_tree=null;
        Object COMMA394_tree=null;
        Object RPAREN395_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_FOREIGN=new RewriteRuleTokenStream(adaptor,"token FOREIGN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_fk_clause=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:458:20: ( FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:458:22: FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause
            {
            FOREIGN391=(Token)match(input,FOREIGN,FOLLOW_FOREIGN_in_table_constraint_fk3442);  
            stream_FOREIGN.add(FOREIGN391);


            KEY392=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_fk3444);  
            stream_KEY.add(KEY392);


            LPAREN393=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_fk3446);  
            stream_LPAREN.add(LPAREN393);


            pushFollow(FOLLOW_id_in_table_constraint_fk3450);
            column_names=id();

            state._fsp--;

            stream_id.add(column_names.getTree());
            if (list_column_names==null) list_column_names=new ArrayList();
            list_column_names.add(column_names.getTree());


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:458:58: ( COMMA column_names+= id )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==COMMA) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:458:59: COMMA column_names+= id
            	    {
            	    COMMA394=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_fk3453);  
            	    stream_COMMA.add(COMMA394);


            	    pushFollow(FOLLOW_id_in_table_constraint_fk3457);
            	    column_names=id();

            	    state._fsp--;

            	    stream_id.add(column_names.getTree());
            	    if (list_column_names==null) list_column_names=new ArrayList();
            	    list_column_names.add(column_names.getTree());


            	    }
            	    break;

            	default :
            	    break loop144;
                }
            } while (true);


            RPAREN395=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_fk3461);  
            stream_RPAREN.add(RPAREN395);


            pushFollow(FOLLOW_fk_clause_in_table_constraint_fk3463);
            fk_clause396=fk_clause();

            state._fsp--;

            stream_fk_clause.add(fk_clause396.getTree());

            // AST REWRITE
            // elements: FOREIGN, fk_clause, column_names
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: column_names
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_column_names=new RewriteRuleSubtreeStream(adaptor,"token column_names",list_column_names);
            root_0 = (Object)adaptor.nil();
            // 459:50: -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:459:4: ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_FOREIGN.nextNode()
                , root_1);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:459:14: ^( COLUMNS ( $column_names)+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLUMNS, "COLUMNS")
                , root_2);

                if ( !(stream_column_names.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_column_names.hasNext() ) {
                    adaptor.addChild(root_2, stream_column_names.nextTree());

                }
                stream_column_names.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_fk_clause.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_constraint_fk"


    public static class fk_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fk_clause"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:461:1: fk_clause : REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )* ( fk_clause_deferrable )? -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )* ( fk_clause_deferrable )? ) ;
    public final SqlParser.fk_clause_return fk_clause() throws RecognitionException {
        SqlParser.fk_clause_return retval = new SqlParser.fk_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token REFERENCES397=null;
        Token LPAREN398=null;
        Token COMMA399=null;
        Token RPAREN400=null;
        List list_column_names=null;
        SqlParser.id_return foreign_table =null;

        SqlParser.fk_clause_action_return fk_clause_action401 =null;

        SqlParser.fk_clause_deferrable_return fk_clause_deferrable402 =null;

        RuleReturnScope column_names = null;
        Object REFERENCES397_tree=null;
        Object LPAREN398_tree=null;
        Object COMMA399_tree=null;
        Object RPAREN400_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_REFERENCES=new RewriteRuleTokenStream(adaptor,"token REFERENCES");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_fk_clause_action=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause_action");
        RewriteRuleSubtreeStream stream_fk_clause_deferrable=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause_deferrable");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:461:10: ( REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )* ( fk_clause_deferrable )? -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )* ( fk_clause_deferrable )? ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:461:12: REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )* ( fk_clause_deferrable )?
            {
            REFERENCES397=(Token)match(input,REFERENCES,FOLLOW_REFERENCES_in_fk_clause3486);  
            stream_REFERENCES.add(REFERENCES397);


            pushFollow(FOLLOW_id_in_fk_clause3490);
            foreign_table=id();

            state._fsp--;

            stream_id.add(foreign_table.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:461:40: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==LPAREN) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:461:41: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    LPAREN398=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_fk_clause3493);  
                    stream_LPAREN.add(LPAREN398);


                    pushFollow(FOLLOW_id_in_fk_clause3497);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:461:65: ( COMMA column_names+= id )*
                    loop145:
                    do {
                        int alt145=2;
                        int LA145_0 = input.LA(1);

                        if ( (LA145_0==COMMA) ) {
                            alt145=1;
                        }


                        switch (alt145) {
                    	case 1 :
                    	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:461:66: COMMA column_names+= id
                    	    {
                    	    COMMA399=(Token)match(input,COMMA,FOLLOW_COMMA_in_fk_clause3500);  
                    	    stream_COMMA.add(COMMA399);


                    	    pushFollow(FOLLOW_id_in_fk_clause3504);
                    	    column_names=id();

                    	    state._fsp--;

                    	    stream_id.add(column_names.getTree());
                    	    if (list_column_names==null) list_column_names=new ArrayList();
                    	    list_column_names.add(column_names.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop145;
                        }
                    } while (true);


                    RPAREN400=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_fk_clause3508);  
                    stream_RPAREN.add(RPAREN400);


                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:462:3: ( fk_clause_action )*
            loop147:
            do {
                int alt147=2;
                int LA147_0 = input.LA(1);

                if ( (LA147_0==MATCH||LA147_0==ON) ) {
                    alt147=1;
                }


                switch (alt147) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:462:3: fk_clause_action
            	    {
            	    pushFollow(FOLLOW_fk_clause_action_in_fk_clause3514);
            	    fk_clause_action401=fk_clause_action();

            	    state._fsp--;

            	    stream_fk_clause_action.add(fk_clause_action401.getTree());

            	    }
            	    break;

            	default :
            	    break loop147;
                }
            } while (true);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:462:21: ( fk_clause_deferrable )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==NOT) ) {
                int LA148_1 = input.LA(2);

                if ( (LA148_1==DEFERRABLE) ) {
                    alt148=1;
                }
            }
            else if ( (LA148_0==DEFERRABLE) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:462:21: fk_clause_deferrable
                    {
                    pushFollow(FOLLOW_fk_clause_deferrable_in_fk_clause3517);
                    fk_clause_deferrable402=fk_clause_deferrable();

                    state._fsp--;

                    stream_fk_clause_deferrable.add(fk_clause_deferrable402.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: column_names, fk_clause_action, REFERENCES, foreign_table, fk_clause_deferrable
            // token labels: 
            // rule labels: retval, foreign_table
            // token list labels: 
            // rule list labels: column_names
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_foreign_table=new RewriteRuleSubtreeStream(adaptor,"rule foreign_table",foreign_table!=null?foreign_table.tree:null);
            RewriteRuleSubtreeStream stream_column_names=new RewriteRuleSubtreeStream(adaptor,"token column_names",list_column_names);
            root_0 = (Object)adaptor.nil();
            // 463:98: -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )* ( fk_clause_deferrable )? )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:463:4: ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )* ( fk_clause_deferrable )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_REFERENCES.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_foreign_table.nextTree());

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:463:32: ^( COLUMNS ( $column_names)+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLUMNS, "COLUMNS")
                , root_2);

                if ( !(stream_column_names.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_column_names.hasNext() ) {
                    adaptor.addChild(root_2, stream_column_names.nextTree());

                }
                stream_column_names.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:463:58: ( fk_clause_action )*
                while ( stream_fk_clause_action.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause_action.nextTree());

                }
                stream_fk_clause_action.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:463:76: ( fk_clause_deferrable )?
                if ( stream_fk_clause_deferrable.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause_deferrable.nextTree());

                }
                stream_fk_clause_deferrable.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fk_clause"


    public static class fk_clause_action_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fk_clause_action"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:465:1: fk_clause_action : ( ON ^ ( DELETE | UPDATE | INSERT ) ( SET ! NULL | SET ! DEFAULT | CASCADE | RESTRICT ) | MATCH ^ id );
    public final SqlParser.fk_clause_action_return fk_clause_action() throws RecognitionException {
        SqlParser.fk_clause_action_return retval = new SqlParser.fk_clause_action_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ON403=null;
        Token set404=null;
        Token SET405=null;
        Token NULL406=null;
        Token SET407=null;
        Token DEFAULT408=null;
        Token CASCADE409=null;
        Token RESTRICT410=null;
        Token MATCH411=null;
        SqlParser.id_return id412 =null;


        Object ON403_tree=null;
        Object set404_tree=null;
        Object SET405_tree=null;
        Object NULL406_tree=null;
        Object SET407_tree=null;
        Object DEFAULT408_tree=null;
        Object CASCADE409_tree=null;
        Object RESTRICT410_tree=null;
        Object MATCH411_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:466:3: ( ON ^ ( DELETE | UPDATE | INSERT ) ( SET ! NULL | SET ! DEFAULT | CASCADE | RESTRICT ) | MATCH ^ id )
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==ON) ) {
                alt150=1;
            }
            else if ( (LA150_0==MATCH) ) {
                alt150=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 150, 0, input);

                throw nvae;

            }
            switch (alt150) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:466:5: ON ^ ( DELETE | UPDATE | INSERT ) ( SET ! NULL | SET ! DEFAULT | CASCADE | RESTRICT )
                    {
                    root_0 = (Object)adaptor.nil();


                    ON403=(Token)match(input,ON,FOLLOW_ON_in_fk_clause_action3551); 
                    ON403_tree = 
                    (Object)adaptor.create(ON403)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ON403_tree, root_0);


                    set404=(Token)input.LT(1);

                    if ( input.LA(1)==DELETE||input.LA(1)==INSERT||input.LA(1)==UPDATE ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set404)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:466:36: ( SET ! NULL | SET ! DEFAULT | CASCADE | RESTRICT )
                    int alt149=4;
                    switch ( input.LA(1) ) {
                    case SET:
                        {
                        int LA149_1 = input.LA(2);

                        if ( (LA149_1==NULL) ) {
                            alt149=1;
                        }
                        else if ( (LA149_1==DEFAULT) ) {
                            alt149=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 149, 1, input);

                            throw nvae;

                        }
                        }
                        break;
                    case CASCADE:
                        {
                        alt149=3;
                        }
                        break;
                    case RESTRICT:
                        {
                        alt149=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 149, 0, input);

                        throw nvae;

                    }

                    switch (alt149) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:466:37: SET ! NULL
                            {
                            SET405=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action3567); 

                            NULL406=(Token)match(input,NULL,FOLLOW_NULL_in_fk_clause_action3570); 
                            NULL406_tree = 
                            (Object)adaptor.create(NULL406)
                            ;
                            adaptor.addChild(root_0, NULL406_tree);


                            }
                            break;
                        case 2 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:466:49: SET ! DEFAULT
                            {
                            SET407=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action3574); 

                            DEFAULT408=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_fk_clause_action3577); 
                            DEFAULT408_tree = 
                            (Object)adaptor.create(DEFAULT408)
                            ;
                            adaptor.addChild(root_0, DEFAULT408_tree);


                            }
                            break;
                        case 3 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:466:64: CASCADE
                            {
                            CASCADE409=(Token)match(input,CASCADE,FOLLOW_CASCADE_in_fk_clause_action3581); 
                            CASCADE409_tree = 
                            (Object)adaptor.create(CASCADE409)
                            ;
                            adaptor.addChild(root_0, CASCADE409_tree);


                            }
                            break;
                        case 4 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:466:74: RESTRICT
                            {
                            RESTRICT410=(Token)match(input,RESTRICT,FOLLOW_RESTRICT_in_fk_clause_action3585); 
                            RESTRICT410_tree = 
                            (Object)adaptor.create(RESTRICT410)
                            ;
                            adaptor.addChild(root_0, RESTRICT410_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:467:5: MATCH ^ id
                    {
                    root_0 = (Object)adaptor.nil();


                    MATCH411=(Token)match(input,MATCH,FOLLOW_MATCH_in_fk_clause_action3592); 
                    MATCH411_tree = 
                    (Object)adaptor.create(MATCH411)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(MATCH411_tree, root_0);


                    pushFollow(FOLLOW_id_in_fk_clause_action3595);
                    id412=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id412.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fk_clause_action"


    public static class fk_clause_deferrable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fk_clause_deferrable"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:469:1: fk_clause_deferrable : ( NOT )? DEFERRABLE ^ ( INITIALLY ! DEFERRED | INITIALLY ! IMMEDIATE )? ;
    public final SqlParser.fk_clause_deferrable_return fk_clause_deferrable() throws RecognitionException {
        SqlParser.fk_clause_deferrable_return retval = new SqlParser.fk_clause_deferrable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NOT413=null;
        Token DEFERRABLE414=null;
        Token INITIALLY415=null;
        Token DEFERRED416=null;
        Token INITIALLY417=null;
        Token IMMEDIATE418=null;

        Object NOT413_tree=null;
        Object DEFERRABLE414_tree=null;
        Object INITIALLY415_tree=null;
        Object DEFERRED416_tree=null;
        Object INITIALLY417_tree=null;
        Object IMMEDIATE418_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:469:21: ( ( NOT )? DEFERRABLE ^ ( INITIALLY ! DEFERRED | INITIALLY ! IMMEDIATE )? )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:469:23: ( NOT )? DEFERRABLE ^ ( INITIALLY ! DEFERRED | INITIALLY ! IMMEDIATE )?
            {
            root_0 = (Object)adaptor.nil();


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:469:23: ( NOT )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==NOT) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:469:24: NOT
                    {
                    NOT413=(Token)match(input,NOT,FOLLOW_NOT_in_fk_clause_deferrable3603); 
                    NOT413_tree = 
                    (Object)adaptor.create(NOT413)
                    ;
                    adaptor.addChild(root_0, NOT413_tree);


                    }
                    break;

            }


            DEFERRABLE414=(Token)match(input,DEFERRABLE,FOLLOW_DEFERRABLE_in_fk_clause_deferrable3607); 
            DEFERRABLE414_tree = 
            (Object)adaptor.create(DEFERRABLE414)
            ;
            root_0 = (Object)adaptor.becomeRoot(DEFERRABLE414_tree, root_0);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:469:42: ( INITIALLY ! DEFERRED | INITIALLY ! IMMEDIATE )?
            int alt152=3;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==INITIALLY) ) {
                int LA152_1 = input.LA(2);

                if ( (LA152_1==DEFERRED) ) {
                    alt152=1;
                }
                else if ( (LA152_1==IMMEDIATE) ) {
                    alt152=2;
                }
            }
            switch (alt152) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:469:43: INITIALLY ! DEFERRED
                    {
                    INITIALLY415=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable3611); 

                    DEFERRED416=(Token)match(input,DEFERRED,FOLLOW_DEFERRED_in_fk_clause_deferrable3614); 
                    DEFERRED416_tree = 
                    (Object)adaptor.create(DEFERRED416)
                    ;
                    adaptor.addChild(root_0, DEFERRED416_tree);


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:469:65: INITIALLY ! IMMEDIATE
                    {
                    INITIALLY417=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable3618); 

                    IMMEDIATE418=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_fk_clause_deferrable3621); 
                    IMMEDIATE418_tree = 
                    (Object)adaptor.create(IMMEDIATE418)
                    ;
                    adaptor.addChild(root_0, IMMEDIATE418_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fk_clause_deferrable"


    public static class drop_table_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drop_table_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:472:1: drop_table_stmt : DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) ;
    public final SqlParser.drop_table_stmt_return drop_table_stmt() throws RecognitionException {
        SqlParser.drop_table_stmt_return retval = new SqlParser.drop_table_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DROP419=null;
        Token TABLE420=null;
        Token IF421=null;
        Token EXISTS422=null;
        Token DOT423=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return table_name =null;


        Object DROP419_tree=null;
        Object TABLE420_tree=null;
        Object IF421_tree=null;
        Object EXISTS422_tree=null;
        Object DOT423_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:472:16: ( DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:472:18: DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id
            {
            DROP419=(Token)match(input,DROP,FOLLOW_DROP_in_drop_table_stmt3631);  
            stream_DROP.add(DROP419);


            TABLE420=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_table_stmt3633);  
            stream_TABLE.add(TABLE420);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:472:29: ( IF EXISTS )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==IF) ) {
                int LA153_1 = input.LA(2);

                if ( (LA153_1==EXISTS) ) {
                    alt153=1;
                }
            }
            switch (alt153) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:472:30: IF EXISTS
                    {
                    IF421=(Token)match(input,IF,FOLLOW_IF_in_drop_table_stmt3636);  
                    stream_IF.add(IF421);


                    EXISTS422=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_table_stmt3638);  
                    stream_EXISTS.add(EXISTS422);


                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:472:42: (database_name= id DOT )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==ID||LA154_0==STRING) ) {
                int LA154_1 = input.LA(2);

                if ( (LA154_1==DOT) ) {
                    alt154=1;
                }
            }
            else if ( ((LA154_0 >= ABORT && LA154_0 <= AFTER)||(LA154_0 >= ALL && LA154_0 <= ALTER)||(LA154_0 >= ANALYZE && LA154_0 <= AND)||(LA154_0 >= AS && LA154_0 <= ASC)||(LA154_0 >= ATTACH && LA154_0 <= AUTOINCREMENT)||(LA154_0 >= BEFORE && LA154_0 <= BETWEEN)||LA154_0==BY||(LA154_0 >= CASCADE && LA154_0 <= COLLATE)||LA154_0==COLUMN||(LA154_0 >= COMMIT && LA154_0 <= CONSTRAINT)||LA154_0==CREATE||(LA154_0 >= CROSS && LA154_0 <= CURRENT_TIMESTAMP)||(LA154_0 >= DATABASE && LA154_0 <= DISTINCT)||LA154_0==DROP||(LA154_0 >= EACH && LA154_0 <= END)||(LA154_0 >= ESCAPE && LA154_0 <= EXPLAIN)||LA154_0==FAIL||(LA154_0 >= FOR && LA154_0 <= FROM)||LA154_0==GROUP||LA154_0==HAVING||(LA154_0 >= IF && LA154_0 <= IMMEDIATE)||(LA154_0 >= INDEX && LA154_0 <= INSTEAD)||(LA154_0 >= INTERSECT && LA154_0 <= INTO)||LA154_0==IS||LA154_0==JOIN||LA154_0==KEY||LA154_0==LEFT||LA154_0==LIMIT||LA154_0==NATURAL||LA154_0==NULL||(LA154_0 >= OF && LA154_0 <= ON)||(LA154_0 >= OR && LA154_0 <= ORDER)||LA154_0==OUTER||LA154_0==PLAN||(LA154_0 >= PRAGMA && LA154_0 <= PRIMARY)||LA154_0==QUERY||(LA154_0 >= RAISE && LA154_0 <= REFERENCES)||(LA154_0 >= REINDEX && LA154_0 <= ROW)||(LA154_0 >= SAVEPOINT && LA154_0 <= SELECT)||LA154_0==SET||LA154_0==TABLE||(LA154_0 >= TEMPORARY && LA154_0 <= THEN)||(LA154_0 >= TO && LA154_0 <= TRIGGER)||(LA154_0 >= UNION && LA154_0 <= USING)||(LA154_0 >= VACUUM && LA154_0 <= VIRTUAL)||(LA154_0 >= WHEN && LA154_0 <= WHERE)) ) {
                int LA154_2 = input.LA(2);

                if ( (LA154_2==DOT) ) {
                    alt154=1;
                }
            }
            switch (alt154) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:472:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_table_stmt3645);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());

                    DOT423=(Token)match(input,DOT,FOLLOW_DOT_in_drop_table_stmt3647);  
                    stream_DOT.add(DOT423);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_drop_table_stmt3653);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());

            // AST REWRITE
            // elements: EXISTS, database_name, table_name
            // token labels: 
            // rule labels: database_name, retval, table_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 473:67: -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:473:4: ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DROP_TABLE, "DROP_TABLE")
                , root_1);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:473:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OPTIONS, "OPTIONS")
                , root_2);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:473:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_EXISTS.nextNode()
                    );

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:473:36: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:473:51: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drop_table_stmt"


    public static class alter_table_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alter_table_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:476:1: alter_table_stmt : ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) ;
    public final SqlParser.alter_table_stmt_return alter_table_stmt() throws RecognitionException {
        SqlParser.alter_table_stmt_return retval = new SqlParser.alter_table_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ALTER424=null;
        Token TABLE425=null;
        Token DOT426=null;
        Token RENAME427=null;
        Token TO428=null;
        Token ADD429=null;
        Token COLUMN430=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return table_name =null;

        SqlParser.id_return new_table_name =null;

        SqlParser.column_def_return column_def431 =null;


        Object ALTER424_tree=null;
        Object TABLE425_tree=null;
        Object DOT426_tree=null;
        Object RENAME427_tree=null;
        Object TO428_tree=null;
        Object ADD429_tree=null;
        Object COLUMN430_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:476:17: ( ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:476:19: ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
            {
            root_0 = (Object)adaptor.nil();


            ALTER424=(Token)match(input,ALTER,FOLLOW_ALTER_in_alter_table_stmt3683); 
            ALTER424_tree = 
            (Object)adaptor.create(ALTER424)
            ;
            adaptor.addChild(root_0, ALTER424_tree);


            TABLE425=(Token)match(input,TABLE,FOLLOW_TABLE_in_alter_table_stmt3685); 
            TABLE425_tree = 
            (Object)adaptor.create(TABLE425)
            ;
            adaptor.addChild(root_0, TABLE425_tree);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:476:31: (database_name= id DOT )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==ID||LA155_0==STRING) ) {
                int LA155_1 = input.LA(2);

                if ( (LA155_1==DOT) ) {
                    alt155=1;
                }
            }
            else if ( ((LA155_0 >= ABORT && LA155_0 <= AFTER)||(LA155_0 >= ALL && LA155_0 <= ALTER)||(LA155_0 >= ANALYZE && LA155_0 <= AND)||(LA155_0 >= AS && LA155_0 <= ASC)||(LA155_0 >= ATTACH && LA155_0 <= AUTOINCREMENT)||(LA155_0 >= BEFORE && LA155_0 <= BETWEEN)||LA155_0==BY||(LA155_0 >= CASCADE && LA155_0 <= COLLATE)||LA155_0==COLUMN||(LA155_0 >= COMMIT && LA155_0 <= CONSTRAINT)||LA155_0==CREATE||(LA155_0 >= CROSS && LA155_0 <= CURRENT_TIMESTAMP)||(LA155_0 >= DATABASE && LA155_0 <= DISTINCT)||LA155_0==DROP||(LA155_0 >= EACH && LA155_0 <= END)||(LA155_0 >= ESCAPE && LA155_0 <= EXPLAIN)||LA155_0==FAIL||(LA155_0 >= FOR && LA155_0 <= FROM)||LA155_0==GROUP||LA155_0==HAVING||(LA155_0 >= IF && LA155_0 <= IMMEDIATE)||(LA155_0 >= INDEX && LA155_0 <= INSTEAD)||(LA155_0 >= INTERSECT && LA155_0 <= INTO)||LA155_0==IS||LA155_0==JOIN||LA155_0==KEY||LA155_0==LEFT||LA155_0==LIMIT||LA155_0==NATURAL||LA155_0==NULL||(LA155_0 >= OF && LA155_0 <= ON)||(LA155_0 >= OR && LA155_0 <= ORDER)||LA155_0==OUTER||LA155_0==PLAN||(LA155_0 >= PRAGMA && LA155_0 <= PRIMARY)||LA155_0==QUERY||(LA155_0 >= RAISE && LA155_0 <= REFERENCES)||(LA155_0 >= REINDEX && LA155_0 <= ROW)||(LA155_0 >= SAVEPOINT && LA155_0 <= SELECT)||LA155_0==SET||LA155_0==TABLE||(LA155_0 >= TEMPORARY && LA155_0 <= THEN)||(LA155_0 >= TO && LA155_0 <= TRIGGER)||(LA155_0 >= UNION && LA155_0 <= USING)||(LA155_0 >= VACUUM && LA155_0 <= VIRTUAL)||(LA155_0 >= WHEN && LA155_0 <= WHERE)) ) {
                int LA155_2 = input.LA(2);

                if ( (LA155_2==DOT) ) {
                    alt155=1;
                }
            }
            switch (alt155) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:476:32: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_alter_table_stmt3690);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());

                    DOT426=(Token)match(input,DOT,FOLLOW_DOT_in_alter_table_stmt3692); 
                    DOT426_tree = 
                    (Object)adaptor.create(DOT426)
                    ;
                    adaptor.addChild(root_0, DOT426_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_alter_table_stmt3698);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:476:69: ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==RENAME) ) {
                alt157=1;
            }
            else if ( (LA157_0==ADD) ) {
                alt157=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 157, 0, input);

                throw nvae;

            }
            switch (alt157) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:476:70: RENAME TO new_table_name= id
                    {
                    RENAME427=(Token)match(input,RENAME,FOLLOW_RENAME_in_alter_table_stmt3701); 
                    RENAME427_tree = 
                    (Object)adaptor.create(RENAME427)
                    ;
                    adaptor.addChild(root_0, RENAME427_tree);


                    TO428=(Token)match(input,TO,FOLLOW_TO_in_alter_table_stmt3703); 
                    TO428_tree = 
                    (Object)adaptor.create(TO428)
                    ;
                    adaptor.addChild(root_0, TO428_tree);


                    pushFollow(FOLLOW_id_in_alter_table_stmt3707);
                    new_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, new_table_name.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:476:100: ADD ( COLUMN )? column_def
                    {
                    ADD429=(Token)match(input,ADD,FOLLOW_ADD_in_alter_table_stmt3711); 
                    ADD429_tree = 
                    (Object)adaptor.create(ADD429)
                    ;
                    adaptor.addChild(root_0, ADD429_tree);


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:476:104: ( COLUMN )?
                    int alt156=2;
                    int LA156_0 = input.LA(1);

                    if ( (LA156_0==COLUMN) ) {
                        alt156=1;
                    }
                    switch (alt156) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:476:105: COLUMN
                            {
                            COLUMN430=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_alter_table_stmt3714); 
                            COLUMN430_tree = 
                            (Object)adaptor.create(COLUMN430)
                            ;
                            adaptor.addChild(root_0, COLUMN430_tree);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_column_def_in_alter_table_stmt3718);
                    column_def431=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def431.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "alter_table_stmt"


    public static class create_view_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create_view_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:1: create_view_stmt : CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS t= select_stmt -> ^( CREATE_VIEW ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $view_name ( $database_name)? ) ^( STATEMENT $t) ) ;
    public final SqlParser.create_view_stmt_return create_view_stmt() throws RecognitionException {
        SqlParser.create_view_stmt_return retval = new SqlParser.create_view_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CREATE432=null;
        Token TEMPORARY433=null;
        Token VIEW434=null;
        Token IF435=null;
        Token NOT436=null;
        Token EXISTS437=null;
        Token DOT438=null;
        Token AS439=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return view_name =null;

        SqlParser.select_stmt_return t =null;


        Object CREATE432_tree=null;
        Object TEMPORARY433_tree=null;
        Object VIEW434_tree=null;
        Object IF435_tree=null;
        Object NOT436_tree=null;
        Object EXISTS437_tree=null;
        Object DOT438_tree=null;
        Object AS439_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_VIEW=new RewriteRuleTokenStream(adaptor,"token VIEW");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_TEMPORARY=new RewriteRuleTokenStream(adaptor,"token TEMPORARY");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_select_stmt=new RewriteRuleSubtreeStream(adaptor,"rule select_stmt");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:17: ( CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS t= select_stmt -> ^( CREATE_VIEW ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $view_name ( $database_name)? ) ^( STATEMENT $t) ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:19: CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS t= select_stmt
            {
            CREATE432=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_view_stmt3727);  
            stream_CREATE.add(CREATE432);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:26: ( TEMPORARY )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==TEMPORARY) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:26: TEMPORARY
                    {
                    TEMPORARY433=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_view_stmt3729);  
                    stream_TEMPORARY.add(TEMPORARY433);


                    }
                    break;

            }


            VIEW434=(Token)match(input,VIEW,FOLLOW_VIEW_in_create_view_stmt3732);  
            stream_VIEW.add(VIEW434);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:42: ( IF NOT EXISTS )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==IF) ) {
                int LA159_1 = input.LA(2);

                if ( (LA159_1==NOT) ) {
                    alt159=1;
                }
            }
            switch (alt159) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:43: IF NOT EXISTS
                    {
                    IF435=(Token)match(input,IF,FOLLOW_IF_in_create_view_stmt3735);  
                    stream_IF.add(IF435);


                    NOT436=(Token)match(input,NOT,FOLLOW_NOT_in_create_view_stmt3737);  
                    stream_NOT.add(NOT436);


                    EXISTS437=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_view_stmt3739);  
                    stream_EXISTS.add(EXISTS437);


                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:59: (database_name= id DOT )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==ID||LA160_0==STRING) ) {
                int LA160_1 = input.LA(2);

                if ( (LA160_1==DOT) ) {
                    alt160=1;
                }
            }
            else if ( ((LA160_0 >= ABORT && LA160_0 <= AFTER)||(LA160_0 >= ALL && LA160_0 <= ALTER)||(LA160_0 >= ANALYZE && LA160_0 <= AND)||(LA160_0 >= AS && LA160_0 <= ASC)||(LA160_0 >= ATTACH && LA160_0 <= AUTOINCREMENT)||(LA160_0 >= BEFORE && LA160_0 <= BETWEEN)||LA160_0==BY||(LA160_0 >= CASCADE && LA160_0 <= COLLATE)||LA160_0==COLUMN||(LA160_0 >= COMMIT && LA160_0 <= CONSTRAINT)||LA160_0==CREATE||(LA160_0 >= CROSS && LA160_0 <= CURRENT_TIMESTAMP)||(LA160_0 >= DATABASE && LA160_0 <= DISTINCT)||LA160_0==DROP||(LA160_0 >= EACH && LA160_0 <= END)||(LA160_0 >= ESCAPE && LA160_0 <= EXPLAIN)||LA160_0==FAIL||(LA160_0 >= FOR && LA160_0 <= FROM)||LA160_0==GROUP||LA160_0==HAVING||(LA160_0 >= IF && LA160_0 <= IMMEDIATE)||(LA160_0 >= INDEX && LA160_0 <= INSTEAD)||(LA160_0 >= INTERSECT && LA160_0 <= INTO)||LA160_0==IS||LA160_0==JOIN||LA160_0==KEY||LA160_0==LEFT||LA160_0==LIMIT||LA160_0==NATURAL||LA160_0==NULL||(LA160_0 >= OF && LA160_0 <= ON)||(LA160_0 >= OR && LA160_0 <= ORDER)||LA160_0==OUTER||LA160_0==PLAN||(LA160_0 >= PRAGMA && LA160_0 <= PRIMARY)||LA160_0==QUERY||(LA160_0 >= RAISE && LA160_0 <= REFERENCES)||(LA160_0 >= REINDEX && LA160_0 <= ROW)||(LA160_0 >= SAVEPOINT && LA160_0 <= SELECT)||LA160_0==SET||LA160_0==TABLE||(LA160_0 >= TEMPORARY && LA160_0 <= THEN)||(LA160_0 >= TO && LA160_0 <= TRIGGER)||(LA160_0 >= UNION && LA160_0 <= USING)||(LA160_0 >= VACUUM && LA160_0 <= VIRTUAL)||(LA160_0 >= WHEN && LA160_0 <= WHERE)) ) {
                int LA160_2 = input.LA(2);

                if ( (LA160_2==DOT) ) {
                    alt160=1;
                }
            }
            switch (alt160) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:479:60: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_view_stmt3746);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());

                    DOT438=(Token)match(input,DOT,FOLLOW_DOT_in_create_view_stmt3748);  
                    stream_DOT.add(DOT438);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_create_view_stmt3754);
            view_name=id();

            state._fsp--;

            stream_id.add(view_name.getTree());

            AS439=(Token)match(input,AS,FOLLOW_AS_in_create_view_stmt3756);  
            stream_AS.add(AS439);


            pushFollow(FOLLOW_select_stmt_in_create_view_stmt3760);
            t=select_stmt();

            state._fsp--;

            stream_select_stmt.add(t.getTree());

            // AST REWRITE
            // elements: t, database_name, view_name, TEMPORARY, EXISTS
            // token labels: 
            // rule labels: view_name, database_name, retval, t
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_view_name=new RewriteRuleSubtreeStream(adaptor,"rule view_name",view_name!=null?view_name.tree:null);
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.tree:null);

            root_0 = (Object)adaptor.nil();
            // 480:94: -> ^( CREATE_VIEW ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $view_name ( $database_name)? ) ^( STATEMENT $t) )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:480:4: ^( CREATE_VIEW ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $view_name ( $database_name)? ) ^( STATEMENT $t) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CREATE_VIEW, "CREATE_VIEW")
                , root_1);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:480:18: ^( OPTIONS ( TEMPORARY )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OPTIONS, "OPTIONS")
                , root_2);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:480:28: ( TEMPORARY )?
                if ( stream_TEMPORARY.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_TEMPORARY.nextNode()
                    );

                }
                stream_TEMPORARY.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:480:39: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_EXISTS.nextNode()
                    );

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:480:48: ^( $view_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_view_name.nextNode(), root_2);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:480:62: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:480:78: ^( STATEMENT $t)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENT, "STATEMENT")
                , root_2);

                adaptor.addChild(root_2, stream_t.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create_view_stmt"


    public static class drop_view_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drop_view_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:484:1: drop_view_stmt : DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id ;
    public final SqlParser.drop_view_stmt_return drop_view_stmt() throws RecognitionException {
        SqlParser.drop_view_stmt_return retval = new SqlParser.drop_view_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DROP440=null;
        Token VIEW441=null;
        Token IF442=null;
        Token EXISTS443=null;
        Token DOT444=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return view_name =null;


        Object DROP440_tree=null;
        Object VIEW441_tree=null;
        Object IF442_tree=null;
        Object EXISTS443_tree=null;
        Object DOT444_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:484:15: ( DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:484:17: DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id
            {
            root_0 = (Object)adaptor.nil();


            DROP440=(Token)match(input,DROP,FOLLOW_DROP_in_drop_view_stmt3801); 
            DROP440_tree = 
            (Object)adaptor.create(DROP440)
            ;
            adaptor.addChild(root_0, DROP440_tree);


            VIEW441=(Token)match(input,VIEW,FOLLOW_VIEW_in_drop_view_stmt3803); 
            VIEW441_tree = 
            (Object)adaptor.create(VIEW441)
            ;
            adaptor.addChild(root_0, VIEW441_tree);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:484:27: ( IF EXISTS )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==IF) ) {
                int LA161_1 = input.LA(2);

                if ( (LA161_1==EXISTS) ) {
                    alt161=1;
                }
            }
            switch (alt161) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:484:28: IF EXISTS
                    {
                    IF442=(Token)match(input,IF,FOLLOW_IF_in_drop_view_stmt3806); 
                    IF442_tree = 
                    (Object)adaptor.create(IF442)
                    ;
                    adaptor.addChild(root_0, IF442_tree);


                    EXISTS443=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_view_stmt3808); 
                    EXISTS443_tree = 
                    (Object)adaptor.create(EXISTS443)
                    ;
                    adaptor.addChild(root_0, EXISTS443_tree);


                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:484:40: (database_name= id DOT )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==ID||LA162_0==STRING) ) {
                int LA162_1 = input.LA(2);

                if ( (LA162_1==DOT) ) {
                    alt162=1;
                }
            }
            else if ( ((LA162_0 >= ABORT && LA162_0 <= AFTER)||(LA162_0 >= ALL && LA162_0 <= ALTER)||(LA162_0 >= ANALYZE && LA162_0 <= AND)||(LA162_0 >= AS && LA162_0 <= ASC)||(LA162_0 >= ATTACH && LA162_0 <= AUTOINCREMENT)||(LA162_0 >= BEFORE && LA162_0 <= BETWEEN)||LA162_0==BY||(LA162_0 >= CASCADE && LA162_0 <= COLLATE)||LA162_0==COLUMN||(LA162_0 >= COMMIT && LA162_0 <= CONSTRAINT)||LA162_0==CREATE||(LA162_0 >= CROSS && LA162_0 <= CURRENT_TIMESTAMP)||(LA162_0 >= DATABASE && LA162_0 <= DISTINCT)||LA162_0==DROP||(LA162_0 >= EACH && LA162_0 <= END)||(LA162_0 >= ESCAPE && LA162_0 <= EXPLAIN)||LA162_0==FAIL||(LA162_0 >= FOR && LA162_0 <= FROM)||LA162_0==GROUP||LA162_0==HAVING||(LA162_0 >= IF && LA162_0 <= IMMEDIATE)||(LA162_0 >= INDEX && LA162_0 <= INSTEAD)||(LA162_0 >= INTERSECT && LA162_0 <= INTO)||LA162_0==IS||LA162_0==JOIN||LA162_0==KEY||LA162_0==LEFT||LA162_0==LIMIT||LA162_0==NATURAL||LA162_0==NULL||(LA162_0 >= OF && LA162_0 <= ON)||(LA162_0 >= OR && LA162_0 <= ORDER)||LA162_0==OUTER||LA162_0==PLAN||(LA162_0 >= PRAGMA && LA162_0 <= PRIMARY)||LA162_0==QUERY||(LA162_0 >= RAISE && LA162_0 <= REFERENCES)||(LA162_0 >= REINDEX && LA162_0 <= ROW)||(LA162_0 >= SAVEPOINT && LA162_0 <= SELECT)||LA162_0==SET||LA162_0==TABLE||(LA162_0 >= TEMPORARY && LA162_0 <= THEN)||(LA162_0 >= TO && LA162_0 <= TRIGGER)||(LA162_0 >= UNION && LA162_0 <= USING)||(LA162_0 >= VACUUM && LA162_0 <= VIRTUAL)||(LA162_0 >= WHEN && LA162_0 <= WHERE)) ) {
                int LA162_2 = input.LA(2);

                if ( (LA162_2==DOT) ) {
                    alt162=1;
                }
            }
            switch (alt162) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:484:41: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_view_stmt3815);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());

                    DOT444=(Token)match(input,DOT,FOLLOW_DOT_in_drop_view_stmt3817); 
                    DOT444_tree = 
                    (Object)adaptor.create(DOT444)
                    ;
                    adaptor.addChild(root_0, DOT444_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_drop_view_stmt3823);
            view_name=id();

            state._fsp--;

            adaptor.addChild(root_0, view_name.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drop_view_stmt"


    public static class create_index_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create_index_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:487:1: create_index_stmt : CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) ;
    public final SqlParser.create_index_stmt_return create_index_stmt() throws RecognitionException {
        SqlParser.create_index_stmt_return retval = new SqlParser.create_index_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CREATE445=null;
        Token UNIQUE446=null;
        Token INDEX447=null;
        Token IF448=null;
        Token NOT449=null;
        Token EXISTS450=null;
        Token DOT451=null;
        Token ON452=null;
        Token LPAREN453=null;
        Token COMMA454=null;
        Token RPAREN455=null;
        List list_columns=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return index_name =null;

        SqlParser.id_return table_name =null;

        RuleReturnScope columns = null;
        Object CREATE445_tree=null;
        Object UNIQUE446_tree=null;
        Object INDEX447_tree=null;
        Object IF448_tree=null;
        Object NOT449_tree=null;
        Object EXISTS450_tree=null;
        Object DOT451_tree=null;
        Object ON452_tree=null;
        Object LPAREN453_tree=null;
        Object COMMA454_tree=null;
        Object RPAREN455_tree=null;
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_UNIQUE=new RewriteRuleTokenStream(adaptor,"token UNIQUE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_indexed_column=new RewriteRuleSubtreeStream(adaptor,"rule indexed_column");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:487:18: ( CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:487:20: CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN
            {
            CREATE445=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_index_stmt3831);  
            stream_CREATE.add(CREATE445);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:487:27: ( UNIQUE )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==UNIQUE) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:487:28: UNIQUE
                    {
                    UNIQUE446=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_create_index_stmt3834);  
                    stream_UNIQUE.add(UNIQUE446);


                    }
                    break;

            }


            INDEX447=(Token)match(input,INDEX,FOLLOW_INDEX_in_create_index_stmt3838);  
            stream_INDEX.add(INDEX447);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:487:43: ( IF NOT EXISTS )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==IF) ) {
                int LA164_1 = input.LA(2);

                if ( (LA164_1==NOT) ) {
                    alt164=1;
                }
            }
            switch (alt164) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:487:44: IF NOT EXISTS
                    {
                    IF448=(Token)match(input,IF,FOLLOW_IF_in_create_index_stmt3841);  
                    stream_IF.add(IF448);


                    NOT449=(Token)match(input,NOT,FOLLOW_NOT_in_create_index_stmt3843);  
                    stream_NOT.add(NOT449);


                    EXISTS450=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_index_stmt3845);  
                    stream_EXISTS.add(EXISTS450);


                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:487:60: (database_name= id DOT )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==ID||LA165_0==STRING) ) {
                int LA165_1 = input.LA(2);

                if ( (LA165_1==DOT) ) {
                    alt165=1;
                }
            }
            else if ( ((LA165_0 >= ABORT && LA165_0 <= AFTER)||(LA165_0 >= ALL && LA165_0 <= ALTER)||(LA165_0 >= ANALYZE && LA165_0 <= AND)||(LA165_0 >= AS && LA165_0 <= ASC)||(LA165_0 >= ATTACH && LA165_0 <= AUTOINCREMENT)||(LA165_0 >= BEFORE && LA165_0 <= BETWEEN)||LA165_0==BY||(LA165_0 >= CASCADE && LA165_0 <= COLLATE)||LA165_0==COLUMN||(LA165_0 >= COMMIT && LA165_0 <= CONSTRAINT)||LA165_0==CREATE||(LA165_0 >= CROSS && LA165_0 <= CURRENT_TIMESTAMP)||(LA165_0 >= DATABASE && LA165_0 <= DISTINCT)||LA165_0==DROP||(LA165_0 >= EACH && LA165_0 <= END)||(LA165_0 >= ESCAPE && LA165_0 <= EXPLAIN)||LA165_0==FAIL||(LA165_0 >= FOR && LA165_0 <= FROM)||LA165_0==GROUP||LA165_0==HAVING||(LA165_0 >= IF && LA165_0 <= IMMEDIATE)||(LA165_0 >= INDEX && LA165_0 <= INSTEAD)||(LA165_0 >= INTERSECT && LA165_0 <= INTO)||LA165_0==IS||LA165_0==JOIN||LA165_0==KEY||LA165_0==LEFT||LA165_0==LIMIT||LA165_0==NATURAL||LA165_0==NULL||(LA165_0 >= OF && LA165_0 <= ON)||(LA165_0 >= OR && LA165_0 <= ORDER)||LA165_0==OUTER||LA165_0==PLAN||(LA165_0 >= PRAGMA && LA165_0 <= PRIMARY)||LA165_0==QUERY||(LA165_0 >= RAISE && LA165_0 <= REFERENCES)||(LA165_0 >= REINDEX && LA165_0 <= ROW)||(LA165_0 >= SAVEPOINT && LA165_0 <= SELECT)||LA165_0==SET||LA165_0==TABLE||(LA165_0 >= TEMPORARY && LA165_0 <= THEN)||(LA165_0 >= TO && LA165_0 <= TRIGGER)||(LA165_0 >= UNION && LA165_0 <= USING)||(LA165_0 >= VACUUM && LA165_0 <= VIRTUAL)||(LA165_0 >= WHEN && LA165_0 <= WHERE)) ) {
                int LA165_2 = input.LA(2);

                if ( (LA165_2==DOT) ) {
                    alt165=1;
                }
            }
            switch (alt165) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:487:61: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_index_stmt3852);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());

                    DOT451=(Token)match(input,DOT,FOLLOW_DOT_in_create_index_stmt3854);  
                    stream_DOT.add(DOT451);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_create_index_stmt3860);
            index_name=id();

            state._fsp--;

            stream_id.add(index_name.getTree());

            ON452=(Token)match(input,ON,FOLLOW_ON_in_create_index_stmt3864);  
            stream_ON.add(ON452);


            pushFollow(FOLLOW_id_in_create_index_stmt3868);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());

            LPAREN453=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_index_stmt3870);  
            stream_LPAREN.add(LPAREN453);


            pushFollow(FOLLOW_indexed_column_in_create_index_stmt3874);
            columns=indexed_column();

            state._fsp--;

            stream_indexed_column.add(columns.getTree());
            if (list_columns==null) list_columns=new ArrayList();
            list_columns.add(columns.getTree());


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:488:51: ( COMMA columns+= indexed_column )*
            loop166:
            do {
                int alt166=2;
                int LA166_0 = input.LA(1);

                if ( (LA166_0==COMMA) ) {
                    alt166=1;
                }


                switch (alt166) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:488:52: COMMA columns+= indexed_column
            	    {
            	    COMMA454=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_index_stmt3877);  
            	    stream_COMMA.add(COMMA454);


            	    pushFollow(FOLLOW_indexed_column_in_create_index_stmt3881);
            	    columns=indexed_column();

            	    state._fsp--;

            	    stream_indexed_column.add(columns.getTree());
            	    if (list_columns==null) list_columns=new ArrayList();
            	    list_columns.add(columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop166;
                }
            } while (true);


            RPAREN455=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_index_stmt3885);  
            stream_RPAREN.add(RPAREN455);


            // AST REWRITE
            // elements: EXISTS, database_name, columns, table_name, index_name, UNIQUE
            // token labels: 
            // rule labels: index_name, database_name, retval, table_name
            // token list labels: 
            // rule list labels: columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_index_name=new RewriteRuleSubtreeStream(adaptor,"rule index_name",index_name!=null?index_name.tree:null);
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);
            RewriteRuleSubtreeStream stream_columns=new RewriteRuleSubtreeStream(adaptor,"token columns",list_columns);
            root_0 = (Object)adaptor.nil();
            // 489:111: -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:489:4: ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CREATE_INDEX, "CREATE_INDEX")
                , root_1);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:489:19: ^( OPTIONS ( UNIQUE )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OPTIONS, "OPTIONS")
                , root_2);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:489:29: ( UNIQUE )?
                if ( stream_UNIQUE.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_UNIQUE.nextNode()
                    );

                }
                stream_UNIQUE.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:489:37: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_EXISTS.nextNode()
                    );

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:489:46: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:489:61: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_table_name.nextTree());

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:489:89: ( ^( COLUMNS ( $columns)+ ) )?
                if ( stream_columns.hasNext() ) {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:489:89: ^( COLUMNS ( $columns)+ )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(COLUMNS, "COLUMNS")
                    , root_2);

                    if ( !(stream_columns.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_columns.hasNext() ) {
                        adaptor.addChild(root_2, stream_columns.nextTree());

                    }
                    stream_columns.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_columns.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create_index_stmt"


    public static class indexed_column_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "indexed_column"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:1: indexed_column : column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) ;
    public final SqlParser.indexed_column_return indexed_column() throws RecognitionException {
        SqlParser.indexed_column_return retval = new SqlParser.indexed_column_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLLATE456=null;
        Token ASC457=null;
        Token DESC458=null;
        SqlParser.id_return column_name =null;

        SqlParser.id_return collation_name =null;


        Object COLLATE456_tree=null;
        Object ASC457_tree=null;
        Object DESC458_tree=null;
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleTokenStream stream_COLLATE=new RewriteRuleTokenStream(adaptor,"token COLLATE");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:15: (column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:17: column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )?
            {
            pushFollow(FOLLOW_id_in_indexed_column3931);
            column_name=id();

            state._fsp--;

            stream_id.add(column_name.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:32: ( COLLATE collation_name= id )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==COLLATE) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:33: COLLATE collation_name= id
                    {
                    COLLATE456=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_indexed_column3934);  
                    stream_COLLATE.add(COLLATE456);


                    pushFollow(FOLLOW_id_in_indexed_column3938);
                    collation_name=id();

                    state._fsp--;

                    stream_id.add(collation_name.getTree());

                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:61: ( ASC | DESC )?
            int alt168=3;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==ASC) ) {
                alt168=1;
            }
            else if ( (LA168_0==DESC) ) {
                alt168=2;
            }
            switch (alt168) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:62: ASC
                    {
                    ASC457=(Token)match(input,ASC,FOLLOW_ASC_in_indexed_column3943);  
                    stream_ASC.add(ASC457);


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:491:68: DESC
                    {
                    DESC458=(Token)match(input,DESC,FOLLOW_DESC_in_indexed_column3947);  
                    stream_DESC.add(DESC458);


                    }
                    break;

            }


            // AST REWRITE
            // elements: COLLATE, collation_name, DESC, column_name, ASC
            // token labels: 
            // rule labels: retval, collation_name, column_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_collation_name=new RewriteRuleSubtreeStream(adaptor,"rule collation_name",collation_name!=null?collation_name.tree:null);
            RewriteRuleSubtreeStream stream_column_name=new RewriteRuleSubtreeStream(adaptor,"rule column_name",column_name!=null?column_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 492:58: -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:492:4: ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_1);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:492:19: ( ^( COLLATE $collation_name) )?
                if ( stream_COLLATE.hasNext()||stream_collation_name.hasNext() ) {
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:492:19: ^( COLLATE $collation_name)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    stream_COLLATE.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, stream_collation_name.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_COLLATE.reset();
                stream_collation_name.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:492:47: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ASC.nextNode()
                    );

                }
                stream_ASC.reset();

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:492:52: ( DESC )?
                if ( stream_DESC.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DESC.nextNode()
                    );

                }
                stream_DESC.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "indexed_column"


    public static class drop_index_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drop_index_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:495:1: drop_index_stmt : DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) ;
    public final SqlParser.drop_index_stmt_return drop_index_stmt() throws RecognitionException {
        SqlParser.drop_index_stmt_return retval = new SqlParser.drop_index_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DROP459=null;
        Token INDEX460=null;
        Token IF461=null;
        Token EXISTS462=null;
        Token DOT463=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return index_name =null;


        Object DROP459_tree=null;
        Object INDEX460_tree=null;
        Object IF461_tree=null;
        Object EXISTS462_tree=null;
        Object DOT463_tree=null;
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:495:16: ( DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:495:18: DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id
            {
            DROP459=(Token)match(input,DROP,FOLLOW_DROP_in_drop_index_stmt3978);  
            stream_DROP.add(DROP459);


            INDEX460=(Token)match(input,INDEX,FOLLOW_INDEX_in_drop_index_stmt3980);  
            stream_INDEX.add(INDEX460);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:495:29: ( IF EXISTS )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==IF) ) {
                int LA169_1 = input.LA(2);

                if ( (LA169_1==EXISTS) ) {
                    alt169=1;
                }
            }
            switch (alt169) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:495:30: IF EXISTS
                    {
                    IF461=(Token)match(input,IF,FOLLOW_IF_in_drop_index_stmt3983);  
                    stream_IF.add(IF461);


                    EXISTS462=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_index_stmt3985);  
                    stream_EXISTS.add(EXISTS462);


                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:495:42: (database_name= id DOT )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==ID||LA170_0==STRING) ) {
                int LA170_1 = input.LA(2);

                if ( (LA170_1==DOT) ) {
                    alt170=1;
                }
            }
            else if ( ((LA170_0 >= ABORT && LA170_0 <= AFTER)||(LA170_0 >= ALL && LA170_0 <= ALTER)||(LA170_0 >= ANALYZE && LA170_0 <= AND)||(LA170_0 >= AS && LA170_0 <= ASC)||(LA170_0 >= ATTACH && LA170_0 <= AUTOINCREMENT)||(LA170_0 >= BEFORE && LA170_0 <= BETWEEN)||LA170_0==BY||(LA170_0 >= CASCADE && LA170_0 <= COLLATE)||LA170_0==COLUMN||(LA170_0 >= COMMIT && LA170_0 <= CONSTRAINT)||LA170_0==CREATE||(LA170_0 >= CROSS && LA170_0 <= CURRENT_TIMESTAMP)||(LA170_0 >= DATABASE && LA170_0 <= DISTINCT)||LA170_0==DROP||(LA170_0 >= EACH && LA170_0 <= END)||(LA170_0 >= ESCAPE && LA170_0 <= EXPLAIN)||LA170_0==FAIL||(LA170_0 >= FOR && LA170_0 <= FROM)||LA170_0==GROUP||LA170_0==HAVING||(LA170_0 >= IF && LA170_0 <= IMMEDIATE)||(LA170_0 >= INDEX && LA170_0 <= INSTEAD)||(LA170_0 >= INTERSECT && LA170_0 <= INTO)||LA170_0==IS||LA170_0==JOIN||LA170_0==KEY||LA170_0==LEFT||LA170_0==LIMIT||LA170_0==NATURAL||LA170_0==NULL||(LA170_0 >= OF && LA170_0 <= ON)||(LA170_0 >= OR && LA170_0 <= ORDER)||LA170_0==OUTER||LA170_0==PLAN||(LA170_0 >= PRAGMA && LA170_0 <= PRIMARY)||LA170_0==QUERY||(LA170_0 >= RAISE && LA170_0 <= REFERENCES)||(LA170_0 >= REINDEX && LA170_0 <= ROW)||(LA170_0 >= SAVEPOINT && LA170_0 <= SELECT)||LA170_0==SET||LA170_0==TABLE||(LA170_0 >= TEMPORARY && LA170_0 <= THEN)||(LA170_0 >= TO && LA170_0 <= TRIGGER)||(LA170_0 >= UNION && LA170_0 <= USING)||(LA170_0 >= VACUUM && LA170_0 <= VIRTUAL)||(LA170_0 >= WHEN && LA170_0 <= WHERE)) ) {
                int LA170_2 = input.LA(2);

                if ( (LA170_2==DOT) ) {
                    alt170=1;
                }
            }
            switch (alt170) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:495:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_index_stmt3992);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());

                    DOT463=(Token)match(input,DOT,FOLLOW_DOT_in_drop_index_stmt3994);  
                    stream_DOT.add(DOT463);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_drop_index_stmt4000);
            index_name=id();

            state._fsp--;

            stream_id.add(index_name.getTree());

            // AST REWRITE
            // elements: database_name, index_name, EXISTS
            // token labels: 
            // rule labels: index_name, database_name, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_index_name=new RewriteRuleSubtreeStream(adaptor,"rule index_name",index_name!=null?index_name.tree:null);
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 496:67: -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:496:4: ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DROP_INDEX, "DROP_INDEX")
                , root_1);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:496:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OPTIONS, "OPTIONS")
                , root_2);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:496:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_EXISTS.nextNode()
                    );

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:496:36: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:496:51: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drop_index_stmt"


    public static class create_trigger_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create_trigger_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:1: create_trigger_stmt : CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END -> ^( CREATE_TRIGGER ^( OPTIONS ( TEMPORARY )? ) ^( $trigger_name $table_name ( $database_name)? ) ) ;
    public final SqlParser.create_trigger_stmt_return create_trigger_stmt() throws RecognitionException {
        SqlParser.create_trigger_stmt_return retval = new SqlParser.create_trigger_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CREATE464=null;
        Token TEMPORARY465=null;
        Token TRIGGER466=null;
        Token IF467=null;
        Token NOT468=null;
        Token EXISTS469=null;
        Token DOT470=null;
        Token BEFORE471=null;
        Token AFTER472=null;
        Token INSTEAD473=null;
        Token OF474=null;
        Token DELETE475=null;
        Token INSERT476=null;
        Token UPDATE477=null;
        Token OF478=null;
        Token COMMA479=null;
        Token ON480=null;
        Token FOR481=null;
        Token EACH482=null;
        Token ROW483=null;
        Token WHEN484=null;
        Token BEGIN486=null;
        Token SEMI491=null;
        Token END492=null;
        List list_column_names=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return trigger_name =null;

        SqlParser.id_return table_name =null;

        SqlParser.expr_return expr485 =null;

        SqlParser.update_stmt_return update_stmt487 =null;

        SqlParser.insert_stmt_return insert_stmt488 =null;

        SqlParser.delete_stmt_return delete_stmt489 =null;

        SqlParser.select_stmt_return select_stmt490 =null;

        RuleReturnScope column_names = null;
        Object CREATE464_tree=null;
        Object TEMPORARY465_tree=null;
        Object TRIGGER466_tree=null;
        Object IF467_tree=null;
        Object NOT468_tree=null;
        Object EXISTS469_tree=null;
        Object DOT470_tree=null;
        Object BEFORE471_tree=null;
        Object AFTER472_tree=null;
        Object INSTEAD473_tree=null;
        Object OF474_tree=null;
        Object DELETE475_tree=null;
        Object INSERT476_tree=null;
        Object UPDATE477_tree=null;
        Object OF478_tree=null;
        Object COMMA479_tree=null;
        Object ON480_tree=null;
        Object FOR481_tree=null;
        Object EACH482_tree=null;
        Object ROW483_tree=null;
        Object WHEN484_tree=null;
        Object BEGIN486_tree=null;
        Object SEMI491_tree=null;
        Object END492_tree=null;
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_INSERT=new RewriteRuleTokenStream(adaptor,"token INSERT");
        RewriteRuleTokenStream stream_ROW=new RewriteRuleTokenStream(adaptor,"token ROW");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleTokenStream stream_TRIGGER=new RewriteRuleTokenStream(adaptor,"token TRIGGER");
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_UPDATE=new RewriteRuleTokenStream(adaptor,"token UPDATE");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_BEFORE=new RewriteRuleTokenStream(adaptor,"token BEFORE");
        RewriteRuleTokenStream stream_DELETE=new RewriteRuleTokenStream(adaptor,"token DELETE");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_EACH=new RewriteRuleTokenStream(adaptor,"token EACH");
        RewriteRuleTokenStream stream_AFTER=new RewriteRuleTokenStream(adaptor,"token AFTER");
        RewriteRuleTokenStream stream_INSTEAD=new RewriteRuleTokenStream(adaptor,"token INSTEAD");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_TEMPORARY=new RewriteRuleTokenStream(adaptor,"token TEMPORARY");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_insert_stmt=new RewriteRuleSubtreeStream(adaptor,"rule insert_stmt");
        RewriteRuleSubtreeStream stream_select_stmt=new RewriteRuleSubtreeStream(adaptor,"rule select_stmt");
        RewriteRuleSubtreeStream stream_delete_stmt=new RewriteRuleSubtreeStream(adaptor,"rule delete_stmt");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_update_stmt=new RewriteRuleSubtreeStream(adaptor,"rule update_stmt");
        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:20: ( CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END -> ^( CREATE_TRIGGER ^( OPTIONS ( TEMPORARY )? ) ^( $trigger_name $table_name ( $database_name)? ) ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:22: CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END
            {
            CREATE464=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_trigger_stmt4030);  
            stream_CREATE.add(CREATE464);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:29: ( TEMPORARY )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==TEMPORARY) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:29: TEMPORARY
                    {
                    TEMPORARY465=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_trigger_stmt4032);  
                    stream_TEMPORARY.add(TEMPORARY465);


                    }
                    break;

            }


            TRIGGER466=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_create_trigger_stmt4035);  
            stream_TRIGGER.add(TRIGGER466);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:48: ( IF NOT EXISTS )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==IF) ) {
                int LA172_1 = input.LA(2);

                if ( (LA172_1==NOT) ) {
                    alt172=1;
                }
            }
            switch (alt172) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:49: IF NOT EXISTS
                    {
                    IF467=(Token)match(input,IF,FOLLOW_IF_in_create_trigger_stmt4038);  
                    stream_IF.add(IF467);


                    NOT468=(Token)match(input,NOT,FOLLOW_NOT_in_create_trigger_stmt4040);  
                    stream_NOT.add(NOT468);


                    EXISTS469=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_trigger_stmt4042);  
                    stream_EXISTS.add(EXISTS469);


                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:65: (database_name= id DOT )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==ID||LA173_0==STRING) ) {
                int LA173_1 = input.LA(2);

                if ( (LA173_1==DOT) ) {
                    alt173=1;
                }
            }
            else if ( ((LA173_0 >= ABORT && LA173_0 <= AFTER)||(LA173_0 >= ALL && LA173_0 <= ALTER)||(LA173_0 >= ANALYZE && LA173_0 <= AND)||(LA173_0 >= AS && LA173_0 <= ASC)||(LA173_0 >= ATTACH && LA173_0 <= AUTOINCREMENT)||(LA173_0 >= BEFORE && LA173_0 <= BETWEEN)||LA173_0==BY||(LA173_0 >= CASCADE && LA173_0 <= COLLATE)||LA173_0==COLUMN||(LA173_0 >= COMMIT && LA173_0 <= CONSTRAINT)||LA173_0==CREATE||(LA173_0 >= CROSS && LA173_0 <= CURRENT_TIMESTAMP)||(LA173_0 >= DATABASE && LA173_0 <= DISTINCT)||LA173_0==DROP||(LA173_0 >= EACH && LA173_0 <= END)||(LA173_0 >= ESCAPE && LA173_0 <= EXPLAIN)||LA173_0==FAIL||(LA173_0 >= FOR && LA173_0 <= FROM)||LA173_0==GROUP||LA173_0==HAVING||(LA173_0 >= IF && LA173_0 <= IMMEDIATE)||(LA173_0 >= INDEX && LA173_0 <= INSTEAD)||(LA173_0 >= INTERSECT && LA173_0 <= INTO)||LA173_0==IS||LA173_0==JOIN||LA173_0==KEY||LA173_0==LEFT||LA173_0==LIMIT||LA173_0==NATURAL||LA173_0==NULL||(LA173_0 >= OF && LA173_0 <= ON)||(LA173_0 >= OR && LA173_0 <= ORDER)||LA173_0==OUTER||LA173_0==PLAN||(LA173_0 >= PRAGMA && LA173_0 <= PRIMARY)||LA173_0==QUERY||(LA173_0 >= RAISE && LA173_0 <= REFERENCES)||(LA173_0 >= REINDEX && LA173_0 <= ROW)||(LA173_0 >= SAVEPOINT && LA173_0 <= SELECT)||LA173_0==SET||LA173_0==TABLE||(LA173_0 >= TEMPORARY && LA173_0 <= THEN)||(LA173_0 >= TO && LA173_0 <= TRIGGER)||(LA173_0 >= UNION && LA173_0 <= USING)||(LA173_0 >= VACUUM && LA173_0 <= VIRTUAL)||(LA173_0 >= WHEN && LA173_0 <= WHERE)) ) {
                int LA173_2 = input.LA(2);

                if ( (LA173_2==DOT) ) {
                    alt173=1;
                }
            }
            switch (alt173) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:499:66: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_trigger_stmt4049);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());

                    DOT470=(Token)match(input,DOT,FOLLOW_DOT_in_create_trigger_stmt4051);  
                    stream_DOT.add(DOT470);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_create_trigger_stmt4057);
            trigger_name=id();

            state._fsp--;

            stream_id.add(trigger_name.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:3: ( BEFORE | AFTER | INSTEAD OF )?
            int alt174=4;
            switch ( input.LA(1) ) {
                case BEFORE:
                    {
                    alt174=1;
                    }
                    break;
                case AFTER:
                    {
                    alt174=2;
                    }
                    break;
                case INSTEAD:
                    {
                    alt174=3;
                    }
                    break;
            }

            switch (alt174) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:4: BEFORE
                    {
                    BEFORE471=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_create_trigger_stmt4062);  
                    stream_BEFORE.add(BEFORE471);


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:13: AFTER
                    {
                    AFTER472=(Token)match(input,AFTER,FOLLOW_AFTER_in_create_trigger_stmt4066);  
                    stream_AFTER.add(AFTER472);


                    }
                    break;
                case 3 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:21: INSTEAD OF
                    {
                    INSTEAD473=(Token)match(input,INSTEAD,FOLLOW_INSTEAD_in_create_trigger_stmt4070);  
                    stream_INSTEAD.add(INSTEAD473);


                    OF474=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt4072);  
                    stream_OF.add(OF474);


                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:34: ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? )
            int alt177=3;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt177=1;
                }
                break;
            case INSERT:
                {
                alt177=2;
                }
                break;
            case UPDATE:
                {
                alt177=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 177, 0, input);

                throw nvae;

            }

            switch (alt177) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:35: DELETE
                    {
                    DELETE475=(Token)match(input,DELETE,FOLLOW_DELETE_in_create_trigger_stmt4077);  
                    stream_DELETE.add(DELETE475);


                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:44: INSERT
                    {
                    INSERT476=(Token)match(input,INSERT,FOLLOW_INSERT_in_create_trigger_stmt4081);  
                    stream_INSERT.add(INSERT476);


                    }
                    break;
                case 3 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:53: UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )?
                    {
                    UPDATE477=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_create_trigger_stmt4085);  
                    stream_UPDATE.add(UPDATE477);


                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:60: ( OF column_names+= id ( COMMA column_names+= id )* )?
                    int alt176=2;
                    int LA176_0 = input.LA(1);

                    if ( (LA176_0==OF) ) {
                        alt176=1;
                    }
                    switch (alt176) {
                        case 1 :
                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:61: OF column_names+= id ( COMMA column_names+= id )*
                            {
                            OF478=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt4088);  
                            stream_OF.add(OF478);


                            pushFollow(FOLLOW_id_in_create_trigger_stmt4092);
                            column_names=id();

                            state._fsp--;

                            stream_id.add(column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());


                            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:81: ( COMMA column_names+= id )*
                            loop175:
                            do {
                                int alt175=2;
                                int LA175_0 = input.LA(1);

                                if ( (LA175_0==COMMA) ) {
                                    alt175=1;
                                }


                                switch (alt175) {
                            	case 1 :
                            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:500:82: COMMA column_names+= id
                            	    {
                            	    COMMA479=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_trigger_stmt4095);  
                            	    stream_COMMA.add(COMMA479);


                            	    pushFollow(FOLLOW_id_in_create_trigger_stmt4099);
                            	    column_names=id();

                            	    state._fsp--;

                            	    stream_id.add(column_names.getTree());
                            	    if (list_column_names==null) list_column_names=new ArrayList();
                            	    list_column_names.add(column_names.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop175;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }


            ON480=(Token)match(input,ON,FOLLOW_ON_in_create_trigger_stmt4108);  
            stream_ON.add(ON480);


            pushFollow(FOLLOW_id_in_create_trigger_stmt4112);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());

            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:501:20: ( FOR EACH ROW )?
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==FOR) ) {
                alt178=1;
            }
            switch (alt178) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:501:21: FOR EACH ROW
                    {
                    FOR481=(Token)match(input,FOR,FOLLOW_FOR_in_create_trigger_stmt4115);  
                    stream_FOR.add(FOR481);


                    EACH482=(Token)match(input,EACH,FOLLOW_EACH_in_create_trigger_stmt4117);  
                    stream_EACH.add(EACH482);


                    ROW483=(Token)match(input,ROW,FOLLOW_ROW_in_create_trigger_stmt4119);  
                    stream_ROW.add(ROW483);


                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:501:36: ( WHEN expr )?
            int alt179=2;
            int LA179_0 = input.LA(1);

            if ( (LA179_0==WHEN) ) {
                alt179=1;
            }
            switch (alt179) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:501:37: WHEN expr
                    {
                    WHEN484=(Token)match(input,WHEN,FOLLOW_WHEN_in_create_trigger_stmt4124);  
                    stream_WHEN.add(WHEN484);


                    pushFollow(FOLLOW_expr_in_create_trigger_stmt4126);
                    expr485=expr();

                    state._fsp--;

                    stream_expr.add(expr485.getTree());

                    }
                    break;

            }


            BEGIN486=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_create_trigger_stmt4132);  
            stream_BEGIN.add(BEGIN486);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:502:9: ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+
            int cnt181=0;
            loop181:
            do {
                int alt181=2;
                int LA181_0 = input.LA(1);

                if ( (LA181_0==DELETE||LA181_0==INSERT||LA181_0==REPLACE||LA181_0==SELECT||LA181_0==UPDATE) ) {
                    alt181=1;
                }


                switch (alt181) {
            	case 1 :
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:502:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI
            	    {
            	    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:502:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt )
            	    int alt180=4;
            	    switch ( input.LA(1) ) {
            	    case UPDATE:
            	        {
            	        alt180=1;
            	        }
            	        break;
            	    case INSERT:
            	    case REPLACE:
            	        {
            	        alt180=2;
            	        }
            	        break;
            	    case DELETE:
            	        {
            	        alt180=3;
            	        }
            	        break;
            	    case SELECT:
            	        {
            	        alt180=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 180, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt180) {
            	        case 1 :
            	            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:502:11: update_stmt
            	            {
            	            pushFollow(FOLLOW_update_stmt_in_create_trigger_stmt4136);
            	            update_stmt487=update_stmt();

            	            state._fsp--;

            	            stream_update_stmt.add(update_stmt487.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:502:25: insert_stmt
            	            {
            	            pushFollow(FOLLOW_insert_stmt_in_create_trigger_stmt4140);
            	            insert_stmt488=insert_stmt();

            	            state._fsp--;

            	            stream_insert_stmt.add(insert_stmt488.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:502:39: delete_stmt
            	            {
            	            pushFollow(FOLLOW_delete_stmt_in_create_trigger_stmt4144);
            	            delete_stmt489=delete_stmt();

            	            state._fsp--;

            	            stream_delete_stmt.add(delete_stmt489.getTree());

            	            }
            	            break;
            	        case 4 :
            	            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:502:53: select_stmt
            	            {
            	            pushFollow(FOLLOW_select_stmt_in_create_trigger_stmt4148);
            	            select_stmt490=select_stmt();

            	            state._fsp--;

            	            stream_select_stmt.add(select_stmt490.getTree());

            	            }
            	            break;

            	    }


            	    SEMI491=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_trigger_stmt4151);  
            	    stream_SEMI.add(SEMI491);


            	    }
            	    break;

            	default :
            	    if ( cnt181 >= 1 ) break loop181;
                        EarlyExitException eee =
                            new EarlyExitException(181, input);
                        throw eee;
                }
                cnt181++;
            } while (true);


            END492=(Token)match(input,END,FOLLOW_END_in_create_trigger_stmt4155);  
            stream_END.add(END492);


            // AST REWRITE
            // elements: database_name, table_name, trigger_name, TEMPORARY
            // token labels: 
            // rule labels: database_name, retval, table_name, trigger_name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_database_name=new RewriteRuleSubtreeStream(adaptor,"rule database_name",database_name!=null?database_name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name",table_name!=null?table_name.tree:null);
            RewriteRuleSubtreeStream stream_trigger_name=new RewriteRuleSubtreeStream(adaptor,"rule trigger_name",trigger_name!=null?trigger_name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 503:88: -> ^( CREATE_TRIGGER ^( OPTIONS ( TEMPORARY )? ) ^( $trigger_name $table_name ( $database_name)? ) )
            {
                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:503:4: ^( CREATE_TRIGGER ^( OPTIONS ( TEMPORARY )? ) ^( $trigger_name $table_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CREATE_TRIGGER, "CREATE_TRIGGER")
                , root_1);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:503:21: ^( OPTIONS ( TEMPORARY )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(OPTIONS, "OPTIONS")
                , root_2);

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:503:31: ( TEMPORARY )?
                if ( stream_TEMPORARY.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_TEMPORARY.nextNode()
                    );

                }
                stream_TEMPORARY.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:503:43: ^( $trigger_name $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_trigger_name.nextNode(), root_2);

                adaptor.addChild(root_2, stream_table_name.nextTree());

                // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:503:72: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create_trigger_stmt"


    public static class drop_trigger_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drop_trigger_stmt"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:506:1: drop_trigger_stmt : DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id ;
    public final SqlParser.drop_trigger_stmt_return drop_trigger_stmt() throws RecognitionException {
        SqlParser.drop_trigger_stmt_return retval = new SqlParser.drop_trigger_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DROP493=null;
        Token TRIGGER494=null;
        Token IF495=null;
        Token EXISTS496=null;
        Token DOT497=null;
        SqlParser.id_return database_name =null;

        SqlParser.id_return trigger_name =null;


        Object DROP493_tree=null;
        Object TRIGGER494_tree=null;
        Object IF495_tree=null;
        Object EXISTS496_tree=null;
        Object DOT497_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:506:18: ( DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:506:20: DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id
            {
            root_0 = (Object)adaptor.nil();


            DROP493=(Token)match(input,DROP,FOLLOW_DROP_in_drop_trigger_stmt4188); 
            DROP493_tree = 
            (Object)adaptor.create(DROP493)
            ;
            adaptor.addChild(root_0, DROP493_tree);


            TRIGGER494=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_drop_trigger_stmt4190); 
            TRIGGER494_tree = 
            (Object)adaptor.create(TRIGGER494)
            ;
            adaptor.addChild(root_0, TRIGGER494_tree);


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:506:33: ( IF EXISTS )?
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==IF) ) {
                int LA182_1 = input.LA(2);

                if ( (LA182_1==EXISTS) ) {
                    alt182=1;
                }
            }
            switch (alt182) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:506:34: IF EXISTS
                    {
                    IF495=(Token)match(input,IF,FOLLOW_IF_in_drop_trigger_stmt4193); 
                    IF495_tree = 
                    (Object)adaptor.create(IF495)
                    ;
                    adaptor.addChild(root_0, IF495_tree);


                    EXISTS496=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_trigger_stmt4195); 
                    EXISTS496_tree = 
                    (Object)adaptor.create(EXISTS496)
                    ;
                    adaptor.addChild(root_0, EXISTS496_tree);


                    }
                    break;

            }


            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:506:46: (database_name= id DOT )?
            int alt183=2;
            int LA183_0 = input.LA(1);

            if ( (LA183_0==ID||LA183_0==STRING) ) {
                int LA183_1 = input.LA(2);

                if ( (LA183_1==DOT) ) {
                    alt183=1;
                }
            }
            else if ( ((LA183_0 >= ABORT && LA183_0 <= AFTER)||(LA183_0 >= ALL && LA183_0 <= ALTER)||(LA183_0 >= ANALYZE && LA183_0 <= AND)||(LA183_0 >= AS && LA183_0 <= ASC)||(LA183_0 >= ATTACH && LA183_0 <= AUTOINCREMENT)||(LA183_0 >= BEFORE && LA183_0 <= BETWEEN)||LA183_0==BY||(LA183_0 >= CASCADE && LA183_0 <= COLLATE)||LA183_0==COLUMN||(LA183_0 >= COMMIT && LA183_0 <= CONSTRAINT)||LA183_0==CREATE||(LA183_0 >= CROSS && LA183_0 <= CURRENT_TIMESTAMP)||(LA183_0 >= DATABASE && LA183_0 <= DISTINCT)||LA183_0==DROP||(LA183_0 >= EACH && LA183_0 <= END)||(LA183_0 >= ESCAPE && LA183_0 <= EXPLAIN)||LA183_0==FAIL||(LA183_0 >= FOR && LA183_0 <= FROM)||LA183_0==GROUP||LA183_0==HAVING||(LA183_0 >= IF && LA183_0 <= IMMEDIATE)||(LA183_0 >= INDEX && LA183_0 <= INSTEAD)||(LA183_0 >= INTERSECT && LA183_0 <= INTO)||LA183_0==IS||LA183_0==JOIN||LA183_0==KEY||LA183_0==LEFT||LA183_0==LIMIT||LA183_0==NATURAL||LA183_0==NULL||(LA183_0 >= OF && LA183_0 <= ON)||(LA183_0 >= OR && LA183_0 <= ORDER)||LA183_0==OUTER||LA183_0==PLAN||(LA183_0 >= PRAGMA && LA183_0 <= PRIMARY)||LA183_0==QUERY||(LA183_0 >= RAISE && LA183_0 <= REFERENCES)||(LA183_0 >= REINDEX && LA183_0 <= ROW)||(LA183_0 >= SAVEPOINT && LA183_0 <= SELECT)||LA183_0==SET||LA183_0==TABLE||(LA183_0 >= TEMPORARY && LA183_0 <= THEN)||(LA183_0 >= TO && LA183_0 <= TRIGGER)||(LA183_0 >= UNION && LA183_0 <= USING)||(LA183_0 >= VACUUM && LA183_0 <= VIRTUAL)||(LA183_0 >= WHEN && LA183_0 <= WHERE)) ) {
                int LA183_2 = input.LA(2);

                if ( (LA183_2==DOT) ) {
                    alt183=1;
                }
            }
            switch (alt183) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:506:47: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_trigger_stmt4202);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());

                    DOT497=(Token)match(input,DOT,FOLLOW_DOT_in_drop_trigger_stmt4204); 
                    DOT497_tree = 
                    (Object)adaptor.create(DOT497)
                    ;
                    adaptor.addChild(root_0, DOT497_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_id_in_drop_trigger_stmt4210);
            trigger_name=id();

            state._fsp--;

            adaptor.addChild(root_0, trigger_name.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drop_trigger_stmt"


    public static class id_core_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id_core"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:509:1: id_core : str= ( ID | STRING ) ;
    public final SqlParser.id_core_return id_core() throws RecognitionException {
        SqlParser.id_core_return retval = new SqlParser.id_core_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token str=null;

        Object str_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:509:8: (str= ( ID | STRING ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:509:10: str= ( ID | STRING )
            {
            root_0 = (Object)adaptor.nil();


            str=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(str)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


             str.setText(unquoteId((str!=null?str.getText():null)));

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "id_core"


    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:513:1: id : ( id_core | keyword );
    public final SqlParser.id_return id() throws RecognitionException {
        SqlParser.id_return retval = new SqlParser.id_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlParser.id_core_return id_core498 =null;

        SqlParser.keyword_return keyword499 =null;



        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:513:3: ( id_core | keyword )
            int alt184=2;
            int LA184_0 = input.LA(1);

            if ( (LA184_0==ID||LA184_0==STRING) ) {
                alt184=1;
            }
            else if ( ((LA184_0 >= ABORT && LA184_0 <= AFTER)||(LA184_0 >= ALL && LA184_0 <= ALTER)||(LA184_0 >= ANALYZE && LA184_0 <= AND)||(LA184_0 >= AS && LA184_0 <= ASC)||(LA184_0 >= ATTACH && LA184_0 <= AUTOINCREMENT)||(LA184_0 >= BEFORE && LA184_0 <= BETWEEN)||LA184_0==BY||(LA184_0 >= CASCADE && LA184_0 <= COLLATE)||LA184_0==COLUMN||(LA184_0 >= COMMIT && LA184_0 <= CONSTRAINT)||LA184_0==CREATE||(LA184_0 >= CROSS && LA184_0 <= CURRENT_TIMESTAMP)||(LA184_0 >= DATABASE && LA184_0 <= DISTINCT)||LA184_0==DROP||(LA184_0 >= EACH && LA184_0 <= END)||(LA184_0 >= ESCAPE && LA184_0 <= EXPLAIN)||LA184_0==FAIL||(LA184_0 >= FOR && LA184_0 <= FROM)||LA184_0==GROUP||LA184_0==HAVING||(LA184_0 >= IF && LA184_0 <= IMMEDIATE)||(LA184_0 >= INDEX && LA184_0 <= INSTEAD)||(LA184_0 >= INTERSECT && LA184_0 <= INTO)||LA184_0==IS||LA184_0==JOIN||LA184_0==KEY||LA184_0==LEFT||LA184_0==LIMIT||LA184_0==NATURAL||LA184_0==NULL||(LA184_0 >= OF && LA184_0 <= ON)||(LA184_0 >= OR && LA184_0 <= ORDER)||LA184_0==OUTER||LA184_0==PLAN||(LA184_0 >= PRAGMA && LA184_0 <= PRIMARY)||LA184_0==QUERY||(LA184_0 >= RAISE && LA184_0 <= REFERENCES)||(LA184_0 >= REINDEX && LA184_0 <= ROW)||(LA184_0 >= SAVEPOINT && LA184_0 <= SELECT)||LA184_0==SET||LA184_0==TABLE||(LA184_0 >= TEMPORARY && LA184_0 <= THEN)||(LA184_0 >= TO && LA184_0 <= TRIGGER)||(LA184_0 >= UNION && LA184_0 <= USING)||(LA184_0 >= VACUUM && LA184_0 <= VIRTUAL)||(LA184_0 >= WHEN && LA184_0 <= WHERE)) ) {
                alt184=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 184, 0, input);

                throw nvae;

            }
            switch (alt184) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:513:5: id_core
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_id_core_in_id4239);
                    id_core498=id_core();

                    state._fsp--;

                    adaptor.addChild(root_0, id_core498.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:513:15: keyword
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_keyword_in_id4243);
                    keyword499=keyword();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword499.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "id"


    public static class keyword_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "keyword"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:515:1: keyword : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_return keyword() throws RecognitionException {
        SqlParser.keyword_return retval = new SqlParser.keyword_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set500=null;

        Object set500_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:515:8: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            root_0 = (Object)adaptor.nil();


            set500=(Token)input.LT(1);

            if ( (input.LA(1) >= ABORT && input.LA(1) <= AFTER)||(input.LA(1) >= ALL && input.LA(1) <= ALTER)||(input.LA(1) >= ANALYZE && input.LA(1) <= AND)||(input.LA(1) >= AS && input.LA(1) <= ASC)||(input.LA(1) >= ATTACH && input.LA(1) <= AUTOINCREMENT)||(input.LA(1) >= BEFORE && input.LA(1) <= BETWEEN)||input.LA(1)==BY||(input.LA(1) >= CASCADE && input.LA(1) <= COLLATE)||input.LA(1)==COLUMN||(input.LA(1) >= COMMIT && input.LA(1) <= CONSTRAINT)||input.LA(1)==CREATE||(input.LA(1) >= CROSS && input.LA(1) <= CURRENT_TIMESTAMP)||(input.LA(1) >= DATABASE && input.LA(1) <= DISTINCT)||input.LA(1)==DROP||(input.LA(1) >= EACH && input.LA(1) <= END)||(input.LA(1) >= ESCAPE && input.LA(1) <= EXPLAIN)||input.LA(1)==FAIL||(input.LA(1) >= FOR && input.LA(1) <= FROM)||input.LA(1)==GROUP||input.LA(1)==HAVING||(input.LA(1) >= IF && input.LA(1) <= IMMEDIATE)||(input.LA(1) >= INDEX && input.LA(1) <= INSTEAD)||(input.LA(1) >= INTERSECT && input.LA(1) <= INTO)||input.LA(1)==IS||input.LA(1)==JOIN||input.LA(1)==KEY||input.LA(1)==LEFT||input.LA(1)==LIMIT||input.LA(1)==NATURAL||input.LA(1)==NULL||(input.LA(1) >= OF && input.LA(1) <= ON)||(input.LA(1) >= OR && input.LA(1) <= ORDER)||input.LA(1)==OUTER||input.LA(1)==PLAN||(input.LA(1) >= PRAGMA && input.LA(1) <= PRIMARY)||input.LA(1)==QUERY||(input.LA(1) >= RAISE && input.LA(1) <= REFERENCES)||(input.LA(1) >= REINDEX && input.LA(1) <= ROW)||(input.LA(1) >= SAVEPOINT && input.LA(1) <= SELECT)||input.LA(1)==SET||input.LA(1)==TABLE||(input.LA(1) >= TEMPORARY && input.LA(1) <= THEN)||(input.LA(1) >= TO && input.LA(1) <= TRIGGER)||(input.LA(1) >= UNION && input.LA(1) <= USING)||(input.LA(1) >= VACUUM && input.LA(1) <= VIRTUAL)||(input.LA(1) >= WHEN && input.LA(1) <= WHERE) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set500)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "keyword"


    public static class id_column_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id_column_def"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:634:1: id_column_def : ( id_core | keyword_column_def );
    public final SqlParser.id_column_def_return id_column_def() throws RecognitionException {
        SqlParser.id_column_def_return retval = new SqlParser.id_column_def_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SqlParser.id_core_return id_core501 =null;

        SqlParser.keyword_column_def_return keyword_column_def502 =null;



        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:634:14: ( id_core | keyword_column_def )
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==ID||LA185_0==STRING) ) {
                alt185=1;
            }
            else if ( ((LA185_0 >= ABORT && LA185_0 <= AFTER)||(LA185_0 >= ALL && LA185_0 <= ALTER)||(LA185_0 >= ANALYZE && LA185_0 <= AND)||(LA185_0 >= AS && LA185_0 <= ASC)||(LA185_0 >= ATTACH && LA185_0 <= AUTOINCREMENT)||(LA185_0 >= BEFORE && LA185_0 <= BETWEEN)||LA185_0==BY||(LA185_0 >= CASCADE && LA185_0 <= COLLATE)||(LA185_0 >= COMMIT && LA185_0 <= CONFLICT)||LA185_0==CREATE||(LA185_0 >= CROSS && LA185_0 <= CURRENT_TIMESTAMP)||(LA185_0 >= DATABASE && LA185_0 <= DISTINCT)||LA185_0==DROP||(LA185_0 >= EACH && LA185_0 <= END)||(LA185_0 >= ESCAPE && LA185_0 <= EXPLAIN)||LA185_0==FAIL||(LA185_0 >= FOR && LA185_0 <= FROM)||LA185_0==GLOB||LA185_0==GROUP||LA185_0==HAVING||(LA185_0 >= IF && LA185_0 <= INSTEAD)||(LA185_0 >= INTERSECT && LA185_0 <= INTO)||(LA185_0 >= IS && LA185_0 <= ISNULL)||LA185_0==JOIN||LA185_0==KEY||LA185_0==LEFT||(LA185_0 >= LIKE && LA185_0 <= LIMIT)||LA185_0==MATCH||(LA185_0 >= NATURAL && LA185_0 <= NOTNULL)||LA185_0==NULL||(LA185_0 >= OF && LA185_0 <= ON)||(LA185_0 >= OR && LA185_0 <= ORDER)||LA185_0==OUTER||LA185_0==PLAN||(LA185_0 >= PRAGMA && LA185_0 <= PRIMARY)||LA185_0==QUERY||(LA185_0 >= RAISE && LA185_0 <= ROW)||(LA185_0 >= SAVEPOINT && LA185_0 <= SELECT)||LA185_0==SET||LA185_0==TABLE||(LA185_0 >= TEMPORARY && LA185_0 <= THEN)||(LA185_0 >= TO && LA185_0 <= TRIGGER)||(LA185_0 >= UNION && LA185_0 <= USING)||(LA185_0 >= VACUUM && LA185_0 <= VIRTUAL)||(LA185_0 >= WHEN && LA185_0 <= WHERE)) ) {
                alt185=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 185, 0, input);

                throw nvae;

            }
            switch (alt185) {
                case 1 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:634:16: id_core
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_id_core_in_id_column_def4917);
                    id_core501=id_core();

                    state._fsp--;

                    adaptor.addChild(root_0, id_core501.getTree());

                    }
                    break;
                case 2 :
                    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:634:26: keyword_column_def
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_keyword_column_def_in_id_column_def4921);
                    keyword_column_def502=keyword_column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword_column_def502.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "id_column_def"


    public static class keyword_column_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "keyword_column_def"
    // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:636:1: keyword_column_def : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_column_def_return keyword_column_def() throws RecognitionException {
        SqlParser.keyword_column_def_return retval = new SqlParser.keyword_column_def_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set503=null;

        Object set503_tree=null;

        try {
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:636:19: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // /home/alex/sqljet-110/sqljet/src/main/antlr/org/tmatesoft/sqljet/core/internal/lang/Sql.g:
            {
            root_0 = (Object)adaptor.nil();


            set503=(Token)input.LT(1);

            if ( (input.LA(1) >= ABORT && input.LA(1) <= AFTER)||(input.LA(1) >= ALL && input.LA(1) <= ALTER)||(input.LA(1) >= ANALYZE && input.LA(1) <= AND)||(input.LA(1) >= AS && input.LA(1) <= ASC)||(input.LA(1) >= ATTACH && input.LA(1) <= AUTOINCREMENT)||(input.LA(1) >= BEFORE && input.LA(1) <= BETWEEN)||input.LA(1)==BY||(input.LA(1) >= CASCADE && input.LA(1) <= COLLATE)||(input.LA(1) >= COMMIT && input.LA(1) <= CONFLICT)||input.LA(1)==CREATE||(input.LA(1) >= CROSS && input.LA(1) <= CURRENT_TIMESTAMP)||(input.LA(1) >= DATABASE && input.LA(1) <= DISTINCT)||input.LA(1)==DROP||(input.LA(1) >= EACH && input.LA(1) <= END)||(input.LA(1) >= ESCAPE && input.LA(1) <= EXPLAIN)||input.LA(1)==FAIL||(input.LA(1) >= FOR && input.LA(1) <= FROM)||input.LA(1)==GLOB||input.LA(1)==GROUP||input.LA(1)==HAVING||(input.LA(1) >= IF && input.LA(1) <= INSTEAD)||(input.LA(1) >= INTERSECT && input.LA(1) <= INTO)||(input.LA(1) >= IS && input.LA(1) <= ISNULL)||input.LA(1)==JOIN||input.LA(1)==KEY||input.LA(1)==LEFT||(input.LA(1) >= LIKE && input.LA(1) <= LIMIT)||input.LA(1)==MATCH||(input.LA(1) >= NATURAL && input.LA(1) <= NOTNULL)||input.LA(1)==NULL||(input.LA(1) >= OF && input.LA(1) <= ON)||(input.LA(1) >= OR && input.LA(1) <= ORDER)||input.LA(1)==OUTER||input.LA(1)==PLAN||(input.LA(1) >= PRAGMA && input.LA(1) <= PRIMARY)||input.LA(1)==QUERY||(input.LA(1) >= RAISE && input.LA(1) <= ROW)||(input.LA(1) >= SAVEPOINT && input.LA(1) <= SELECT)||input.LA(1)==SET||input.LA(1)==TABLE||(input.LA(1) >= TEMPORARY && input.LA(1) <= THEN)||(input.LA(1) >= TO && input.LA(1) <= TRIGGER)||(input.LA(1) >= UNION && input.LA(1) <= USING)||(input.LA(1) >= VACUUM && input.LA(1) <= VIRTUAL)||(input.LA(1) >= WHEN && input.LA(1) <= WHERE) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set503)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "keyword_column_def"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA122 dfa122 = new DFA122(this);
    protected DFA127 dfa127 = new DFA127(this);
    static final String DFA10_eotS =
        "\142\uffff";
    static final String DFA10_eofS =
        "\1\1\34\uffff\1\1\104\uffff";
    static final String DFA10_minS =
        "\1\5\34\uffff\1\5\2\uffff\2\5\1\36\1\11\2\103\1\36\1\103\72\uffff";
    static final String DFA10_maxS =
        "\1\u00e9\34\uffff\1\u00e9\2\uffff\2\u00e9\1\103\3\u00c0\1\103\1"+
        "\172\72\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\2\51\uffff\1\1\66\uffff";
    static final String DFA10_specialS =
        "\142\uffff}>";
    static final String[] DFA10_transitionS = {
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\2\uffff\2\1\2\uffff"+
            "\3\1\4\uffff\1\1\1\uffff\5\1\1\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\3\1\1\uffff\1\1\4\uffff\4\1\1\uffff\10\1\3\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\5\1\1\uffff\1\1\3\uffff\3\1\6\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\6\1\2\uffff\2\1\2\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\7\uffff"+
            "\1\1\5\uffff\1\1\1\uffff\3\1\1\uffff\1\35\1\1\1\uffff\1\1\3"+
            "\uffff\1\1\1\uffff\2\1\1\uffff\1\1\4\uffff\2\1\1\uffff\10\1"+
            "\2\uffff\2\1\1\uffff\2\1\4\uffff\1\1\11\uffff\1\1\1\uffff\2"+
            "\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
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
            "",
            "",
            "",
            "",
            "",
            "\3\53\1\uffff\2\53\1\uffff\2\53\1\uffff\2\53\1\uffff\3\53\2"+
            "\uffff\3\53\2\uffff\1\53\1\uffff\1\53\1\uffff\7\53\3\uffff\1"+
            "\1\1\uffff\3\53\1\uffff\1\53\4\uffff\4\53\1\uffff\10\53\3\uffff"+
            "\1\53\3\uffff\3\53\2\uffff\1\53\1\45\3\53\1\uffff\2\53\2\uffff"+
            "\2\53\1\40\6\uffff\1\42\1\uffff\1\53\1\uffff\1\53\12\uffff\3"+
            "\53\1\uffff\7\53\1\uffff\1\44\1\53\2\uffff\1\53\4\uffff\1\53"+
            "\1\uffff\1\53\1\uffff\1\53\3\uffff\1\47\1\uffff\1\53\3\uffff"+
            "\1\53\1\uffff\2\53\4\uffff\1\53\1\uffff\3\53\1\uffff\1\53\1"+
            "\46\1\uffff\1\53\3\uffff\4\53\1\uffff\2\53\3\uffff\2\53\1\uffff"+
            "\7\53\1\1\2\uffff\2\53\1\uffff\1\1\1\53\4\uffff\1\53\11\uffff"+
            "\1\53\1\uffff\6\53\4\uffff\1\43\3\53\1\uffff\4\53\1\uffff\1"+
            "\53\1\41",
            "",
            "",
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\2\uffff\2\1\2\uffff"+
            "\3\1\4\uffff\1\1\1\uffff\5\1\1\uffff\1\1\5\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\53\1\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\5\1\1\uffff\1\1\3\uffff\3\1\6\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\6\1\2\uffff\2\1\2\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\1\5\uffff\1\1\5\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\2\1\1\uffff\1\1\4\uffff\2\1\1\uffff"+
            "\7\1\3\uffff\2\1\2\uffff\1\1\4\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff\3\1\2\uffff"+
            "\3\1\2\uffff\1\1\1\uffff\1\1\1\uffff\7\1\5\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\53\1\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\5\1\1\uffff\2\1\2\uffff\3\1\6\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\7\1\1\uffff\2\1\2\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\2\1\4\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\2\1\1\uffff\1\1\3\uffff\4\1\1\uffff\2\1\3\uffff\2\1\1\uffff"+
            "\7\1\3\uffff\2\1\2\uffff\1\1\4\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\6\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\1\1\44\uffff\1\53",
            "\1\1\71\uffff\1\53\174\uffff\1\1",
            "\1\53\174\uffff\1\1",
            "\1\53\174\uffff\1\1",
            "\1\1\44\uffff\1\53",
            "\1\53\66\uffff\1\1",
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
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "()* loopback of 182:18: ( OR ^ or_subexpr )*";
        }
    }
    static final String DFA11_eotS =
        "\143\uffff";
    static final String DFA11_eofS =
        "\1\1\35\uffff\1\1\104\uffff";
    static final String DFA11_minS =
        "\1\5\35\uffff\1\5\2\uffff\2\5\1\36\1\11\2\103\1\36\1\103\72\uffff";
    static final String DFA11_maxS =
        "\1\u00e9\35\uffff\1\u00e9\2\uffff\2\u00e9\1\103\3\u00c0\1\103\1"+
        "\172\72\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\2\52\uffff\1\1\66\uffff";
    static final String DFA11_specialS =
        "\143\uffff}>";
    static final String[] DFA11_transitionS = {
            "\3\1\1\uffff\2\1\1\uffff\1\1\1\36\1\uffff\2\1\2\uffff\2\1\2"+
            "\uffff\3\1\4\uffff\1\1\1\uffff\5\1\1\uffff\1\1\3\uffff\1\1\1"+
            "\uffff\3\1\1\uffff\1\1\4\uffff\4\1\1\uffff\10\1\3\uffff\1\1"+
            "\3\uffff\3\1\2\uffff\5\1\1\uffff\1\1\3\uffff\3\1\6\uffff\1\1"+
            "\1\uffff\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\6\1\2\uffff\2"+
            "\1\2\uffff\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1"+
            "\1\7\uffff\1\1\5\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1\uffff\1"+
            "\1\3\uffff\1\1\1\uffff\2\1\1\uffff\1\1\4\uffff\2\1\1\uffff\10"+
            "\1\2\uffff\2\1\1\uffff\2\1\4\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\54\1\uffff\2\54\1\uffff\2\54\1\uffff\2\54\1\uffff\3\54\2"+
            "\uffff\3\54\2\uffff\1\54\1\uffff\1\54\1\uffff\7\54\3\uffff\1"+
            "\1\1\uffff\3\54\1\uffff\1\54\4\uffff\4\54\1\uffff\10\54\3\uffff"+
            "\1\54\3\uffff\3\54\2\uffff\1\54\1\46\3\54\1\uffff\2\54\2\uffff"+
            "\2\54\1\41\6\uffff\1\43\1\uffff\1\54\1\uffff\1\54\12\uffff\3"+
            "\54\1\uffff\7\54\1\uffff\1\45\1\54\2\uffff\1\54\4\uffff\1\54"+
            "\1\uffff\1\54\1\uffff\1\54\3\uffff\1\50\1\uffff\1\54\3\uffff"+
            "\1\54\1\uffff\2\54\4\uffff\1\54\1\uffff\3\54\1\uffff\1\54\1"+
            "\47\1\uffff\1\54\3\uffff\4\54\1\uffff\2\54\3\uffff\2\54\1\uffff"+
            "\7\54\1\1\2\uffff\2\54\1\uffff\1\1\1\54\4\uffff\1\54\11\uffff"+
            "\1\54\1\uffff\6\54\4\uffff\1\44\3\54\1\uffff\4\54\1\uffff\1"+
            "\54\1\42",
            "",
            "",
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\2\uffff\2\1\2\uffff"+
            "\3\1\4\uffff\1\1\1\uffff\5\1\1\uffff\1\1\5\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\54\1\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\5\1\1\uffff\1\1\3\uffff\3\1\6\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\6\1\2\uffff\2\1\2\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\1\5\uffff\1\1\5\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\2\1\1\uffff\1\1\4\uffff\2\1\1\uffff"+
            "\7\1\3\uffff\2\1\2\uffff\1\1\4\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff\3\1\2\uffff"+
            "\3\1\2\uffff\1\1\1\uffff\1\1\1\uffff\7\1\5\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\54\1\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\5\1\1\uffff\2\1\2\uffff\3\1\6\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\7\1\1\uffff\2\1\2\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\2\1\4\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\2\1\1\uffff\1\1\3\uffff\4\1\1\uffff\2\1\3\uffff\2\1\1\uffff"+
            "\7\1\3\uffff\2\1\2\uffff\1\1\4\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\6\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\1\1\44\uffff\1\54",
            "\1\1\71\uffff\1\54\174\uffff\1\1",
            "\1\54\174\uffff\1\1",
            "\1\54\174\uffff\1\1",
            "\1\1\44\uffff\1\54",
            "\1\54\66\uffff\1\1",
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
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()* loopback of 184:25: ( AND ^ and_subexpr )*";
        }
    }
    static final String DFA12_eotS =
        "\172\uffff";
    static final String DFA12_eofS =
        "\1\12\6\uffff\2\12\161\uffff";
    static final String DFA12_minS =
        "\1\5\6\uffff\1\52\1\5\76\uffff\1\5\2\uffff\1\5\1\36\1\11\2\103\1"+
        "\36\1\103\51\uffff";
    static final String DFA12_maxS =
        "\1\u00e9\6\uffff\2\u00e9\76\uffff\1\u00e9\2\uffff\1\u00e9\1\103"+
        "\3\u00c0\1\103\1\172\51\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\10\uffff\1\2\157\uffff";
    static final String DFA12_specialS =
        "\172\uffff}>";
    static final String[] DFA12_transitionS = {
            "\3\12\1\uffff\2\12\1\uffff\2\12\1\uffff\2\12\2\uffff\2\12\2"+
            "\uffff\2\12\1\10\4\uffff\1\12\1\uffff\5\12\1\uffff\1\12\3\uffff"+
            "\1\12\1\uffff\3\12\1\uffff\1\12\4\uffff\4\12\1\uffff\10\12\3"+
            "\uffff\1\12\3\uffff\3\12\2\1\5\12\1\uffff\1\12\3\uffff\3\12"+
            "\3\uffff\1\1\2\uffff\1\12\1\uffff\1\12\1\uffff\1\12\12\uffff"+
            "\3\12\1\1\6\12\2\uffff\2\12\2\uffff\1\7\1\1\3\uffff\1\12\1\uffff"+
            "\1\12\1\uffff\1\12\2\uffff\1\1\1\12\4\uffff\1\1\2\uffff\1\12"+
            "\4\1\1\uffff\1\12\1\uffff\3\12\1\uffff\2\12\1\uffff\1\12\3\uffff"+
            "\1\12\1\uffff\2\12\1\uffff\1\12\4\uffff\2\12\1\1\10\12\2\uffff"+
            "\2\12\1\uffff\2\12\4\uffff\1\12\11\uffff\1\12\1\uffff\2\12\1"+
            "\uffff\3\12\4\uffff\4\12\1\uffff\4\12\1\uffff\2\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\44\uffff\1\12\12\uffff\1\12\6\uffff\1\12\32\uffff\1\12"+
            "\20\uffff\1\12\10\uffff\1\1\4\uffff\1\1\6\uffff\1\12\31\uffff"+
            "\1\12\5\uffff\1\12\33\uffff\1\12\12\uffff\1\12",
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff\3\1\2\uffff"+
            "\3\1\2\uffff\1\1\1\uffff\1\1\1\uffff\7\1\3\uffff\1\12\1\uffff"+
            "\3\1\1\uffff\1\1\4\uffff\4\1\1\uffff\10\1\3\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\1\1\1\116\3\1\1\uffff\2\1\2\uffff\2\1\1\107\6\uffff"+
            "\1\113\1\uffff\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\7\1\1\uffff"+
            "\1\115\1\1\2\uffff\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3"+
            "\uffff\1\120\1\uffff\1\1\3\uffff\1\1\1\uffff\2\1\4\uffff\1\1"+
            "\1\uffff\3\1\1\uffff\1\1\1\117\1\uffff\1\1\3\uffff\4\1\1\uffff"+
            "\2\1\3\uffff\2\1\1\uffff\7\1\1\12\2\uffff\2\1\1\uffff\1\12\1"+
            "\1\4\uffff\1\1\11\uffff\1\1\1\uffff\6\1\4\uffff\1\114\3\1\1"+
            "\uffff\4\1\1\uffff\1\1\1\112",
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
            "\3\12\1\uffff\2\12\1\uffff\2\12\1\uffff\2\12\2\uffff\2\12\2"+
            "\uffff\3\12\4\uffff\1\12\1\uffff\5\12\1\uffff\1\12\5\uffff\3"+
            "\12\1\uffff\1\12\4\uffff\4\12\1\uffff\10\12\1\uffff\1\1\1\uffff"+
            "\1\12\3\uffff\3\12\2\uffff\5\12\1\uffff\1\12\3\uffff\3\12\6"+
            "\uffff\1\12\1\uffff\1\12\1\uffff\1\12\12\uffff\3\12\1\uffff"+
            "\6\12\2\uffff\2\12\2\uffff\1\12\4\uffff\1\12\1\uffff\1\12\1"+
            "\uffff\1\12\3\uffff\1\12\1\uffff\1\12\5\uffff\1\12\5\uffff\1"+
            "\12\1\uffff\3\12\1\uffff\2\12\1\uffff\1\12\3\uffff\1\12\1\uffff"+
            "\2\12\1\uffff\1\12\4\uffff\2\12\1\uffff\7\12\3\uffff\2\12\2"+
            "\uffff\1\12\4\uffff\1\12\11\uffff\1\12\1\uffff\2\12\1\uffff"+
            "\3\12\4\uffff\4\12\1\uffff\4\12\1\uffff\2\12",
            "",
            "",
            "\3\12\1\uffff\2\12\1\uffff\2\12\1\uffff\2\12\1\uffff\3\12\2"+
            "\uffff\3\12\2\uffff\1\12\1\uffff\1\12\1\uffff\7\12\5\uffff\3"+
            "\12\1\uffff\1\12\4\uffff\4\12\1\uffff\10\12\1\uffff\1\1\1\uffff"+
            "\1\12\3\uffff\3\12\2\uffff\5\12\1\uffff\2\12\2\uffff\3\12\6"+
            "\uffff\1\12\1\uffff\1\12\1\uffff\1\12\12\uffff\3\12\1\uffff"+
            "\7\12\1\uffff\2\12\2\uffff\1\12\4\uffff\1\12\1\uffff\1\12\1"+
            "\uffff\1\12\3\uffff\1\12\1\uffff\1\12\3\uffff\1\12\1\uffff\2"+
            "\12\4\uffff\1\12\1\uffff\3\12\1\uffff\2\12\1\uffff\1\12\3\uffff"+
            "\4\12\1\uffff\2\12\3\uffff\2\12\1\uffff\7\12\3\uffff\2\12\2"+
            "\uffff\1\12\4\uffff\1\12\11\uffff\1\12\1\uffff\6\12\4\uffff"+
            "\4\12\1\uffff\4\12\1\uffff\2\12",
            "\1\12\44\uffff\1\1",
            "\1\12\71\uffff\1\1\174\uffff\1\12",
            "\1\1\174\uffff\1\12",
            "\1\1\174\uffff\1\12",
            "\1\12\44\uffff\1\1",
            "\1\1\66\uffff\1\12",
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
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "186:34: ( cond_expr ^)?";
        }
    }
    static final String DFA26_eotS =
        "\u00a3\uffff";
    static final String DFA26_eofS =
        "\u00a3\uffff";
    static final String DFA26_minS =
        "\2\31\1\uffff\2\5\2\uffff\1\u0096\4\uffff\1\5\2\uffff\1\5\2\uffff"+
        "\1\5\22\uffff\2\5\22\uffff\1\5\3\uffff\1\5\145\uffff";
    static final String DFA26_maxS =
        "\2\u00b4\1\uffff\2\u00e9\2\uffff\1\u009b\4\uffff\1\u00e9\2\uffff"+
        "\1\u00e9\2\uffff\1\u00e9\22\uffff\2\u00e9\22\uffff\1\u00e9\3\uffff"+
        "\1\u00e9\145\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\1\2\uffff\1\6\2\uffff\1\10\1\11\3\uffff\1\5\2\uffff\1"+
        "\3\30\uffff\1\2\22\uffff\1\4\24\uffff\1\6\1\7\40\uffff\1\2\57\uffff";
    static final String DFA26_specialS =
        "\u00a3\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\10\62\uffff\1\4\1\11\20\uffff\1\2\24\uffff\1\3\14\uffff\1"+
            "\7\1\5\12\uffff\1\2\5\uffff\1\2\3\uffff\1\1\1\5\2\11\32\uffff"+
            "\1\2",
            "\1\10\62\uffff\1\15\21\uffff\1\2\24\uffff\1\14\30\uffff\1\2"+
            "\5\uffff\1\2\10\uffff\1\5\30\uffff\1\2",
            "",
            "\3\20\1\uffff\2\20\1\uffff\2\20\1\uffff\2\20\2\uffff\2\20\2"+
            "\uffff\3\20\4\uffff\1\20\1\uffff\5\20\1\uffff\1\20\5\uffff\3"+
            "\20\1\uffff\1\20\4\uffff\4\20\1\uffff\10\20\3\uffff\1\20\3\uffff"+
            "\3\20\2\uffff\5\20\1\uffff\1\20\3\uffff\3\20\6\uffff\1\20\1"+
            "\uffff\1\20\1\uffff\1\20\12\uffff\3\20\1\uffff\6\20\2\uffff"+
            "\2\20\2\uffff\1\20\4\uffff\1\20\1\uffff\1\20\1\uffff\1\20\3"+
            "\uffff\1\20\1\uffff\1\17\5\uffff\1\20\5\uffff\1\20\1\uffff\3"+
            "\20\1\uffff\2\20\1\uffff\1\20\3\uffff\1\20\1\uffff\2\20\1\uffff"+
            "\1\20\4\uffff\2\20\1\uffff\7\20\3\uffff\2\20\2\uffff\1\20\4"+
            "\uffff\1\20\11\uffff\1\20\1\uffff\2\20\1\uffff\3\20\4\uffff"+
            "\4\20\1\uffff\4\20\1\uffff\2\20",
            "\3\11\1\uffff\2\11\1\uffff\2\11\1\uffff\2\11\1\uffff\3\11\2"+
            "\uffff\3\11\2\uffff\1\11\1\uffff\1\11\1\uffff\7\11\5\uffff\3"+
            "\11\1\uffff\1\11\4\uffff\4\11\1\uffff\10\11\3\uffff\1\11\3\uffff"+
            "\3\11\2\uffff\5\11\1\uffff\2\11\2\uffff\3\11\6\uffff\1\11\1"+
            "\uffff\1\11\1\uffff\1\11\12\uffff\3\11\1\uffff\7\11\1\uffff"+
            "\2\11\2\uffff\1\11\4\uffff\1\11\1\uffff\1\11\1\uffff\1\11\3"+
            "\uffff\1\11\1\uffff\1\22\3\uffff\1\11\1\uffff\2\11\4\uffff\1"+
            "\11\1\uffff\3\11\1\uffff\2\11\1\uffff\1\11\3\uffff\4\11\1\uffff"+
            "\2\11\3\uffff\2\11\1\uffff\7\11\3\uffff\2\11\2\uffff\1\11\4"+
            "\uffff\1\11\11\uffff\1\11\1\uffff\6\11\4\uffff\4\11\1\uffff"+
            "\4\11\1\uffff\2\11",
            "",
            "",
            "\1\45\4\uffff\1\5",
            "",
            "",
            "",
            "",
            "\3\20\1\uffff\2\20\1\uffff\2\20\1\uffff\2\20\2\uffff\2\20\2"+
            "\uffff\3\20\4\uffff\1\20\1\uffff\5\20\1\uffff\1\20\5\uffff\3"+
            "\20\1\uffff\1\20\4\uffff\4\20\1\uffff\10\20\3\uffff\1\20\3\uffff"+
            "\3\20\2\uffff\5\20\1\uffff\1\20\3\uffff\3\20\6\uffff\1\20\1"+
            "\uffff\1\20\1\uffff\1\20\12\uffff\3\20\1\uffff\6\20\2\uffff"+
            "\2\20\2\uffff\1\20\4\uffff\1\20\1\uffff\1\20\1\uffff\1\20\3"+
            "\uffff\1\20\1\uffff\1\46\5\uffff\1\20\5\uffff\1\20\1\uffff\3"+
            "\20\1\uffff\2\20\1\uffff\1\20\3\uffff\1\20\1\uffff\2\20\1\uffff"+
            "\1\20\4\uffff\2\20\1\uffff\7\20\3\uffff\2\20\2\uffff\1\20\4"+
            "\uffff\1\20\11\uffff\1\20\1\uffff\2\20\1\uffff\3\20\4\uffff"+
            "\4\20\1\uffff\4\20\1\uffff\2\20",
            "",
            "",
            "\3\51\1\uffff\2\51\1\uffff\2\51\1\uffff\2\51\1\uffff\3\51\2"+
            "\uffff\3\51\2\uffff\1\51\1\uffff\1\51\1\uffff\7\51\5\uffff\3"+
            "\51\1\uffff\1\51\4\uffff\4\51\1\uffff\10\51\3\uffff\1\51\3\uffff"+
            "\3\51\2\uffff\5\51\1\uffff\2\51\2\uffff\3\51\6\uffff\1\51\1"+
            "\uffff\1\51\1\uffff\1\51\12\uffff\3\51\1\uffff\7\51\1\uffff"+
            "\2\51\2\uffff\1\51\4\uffff\1\51\1\uffff\1\51\1\uffff\1\51\3"+
            "\uffff\1\51\1\uffff\1\51\3\uffff\1\51\1\uffff\2\51\4\uffff\1"+
            "\51\1\uffff\3\51\1\uffff\2\51\1\uffff\1\51\3\uffff\4\51\1\uffff"+
            "\2\51\3\uffff\2\51\1\uffff\7\51\1\74\2\uffff\1\51\1\71\2\uffff"+
            "\1\51\4\uffff\1\51\11\uffff\1\51\1\uffff\6\51\4\uffff\4\51\1"+
            "\uffff\4\51\1\uffff\2\51",
            "",
            "",
            "\3\11\1\uffff\2\11\1\uffff\2\11\1\uffff\2\11\1\uffff\3\11\2"+
            "\uffff\3\11\2\uffff\1\11\1\uffff\1\11\1\uffff\7\11\5\uffff\3"+
            "\11\1\uffff\1\11\4\uffff\4\11\1\uffff\10\11\3\uffff\1\11\3\uffff"+
            "\3\11\2\uffff\5\11\1\uffff\2\11\2\uffff\3\11\6\uffff\1\11\1"+
            "\uffff\1\11\1\uffff\1\11\12\uffff\3\11\1\uffff\7\11\1\uffff"+
            "\2\11\2\uffff\1\11\4\uffff\1\11\1\uffff\1\11\1\uffff\1\11\3"+
            "\uffff\1\11\1\uffff\1\11\3\uffff\1\11\1\uffff\2\11\4\uffff\1"+
            "\11\1\uffff\3\11\1\uffff\2\11\1\uffff\1\11\3\uffff\4\11\1\uffff"+
            "\2\11\3\uffff\2\11\1\uffff\7\11\1\15\2\uffff\1\11\1\75\2\uffff"+
            "\1\11\4\uffff\1\11\11\uffff\1\11\1\uffff\6\11\4\uffff\4\11\1"+
            "\uffff\4\11\1\uffff\2\11",
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
            "\3\122\1\uffff\2\122\1\uffff\2\122\1\uffff\2\122\1\uffff\3"+
            "\122\2\uffff\3\122\2\uffff\1\122\1\uffff\1\122\1\uffff\7\122"+
            "\5\uffff\3\122\1\uffff\1\122\4\uffff\4\122\1\uffff\10\122\3"+
            "\uffff\1\122\3\uffff\3\122\2\uffff\5\122\1\uffff\2\122\2\uffff"+
            "\3\122\6\uffff\1\122\1\uffff\1\122\1\uffff\1\122\12\uffff\3"+
            "\122\1\uffff\7\122\1\uffff\2\122\2\uffff\1\122\4\uffff\1\122"+
            "\1\uffff\1\122\1\uffff\1\122\3\uffff\1\122\1\uffff\1\122\3\uffff"+
            "\1\122\1\uffff\2\122\4\uffff\1\121\1\uffff\3\122\1\uffff\2\122"+
            "\1\uffff\1\122\3\uffff\4\122\1\uffff\2\122\3\uffff\2\122\1\uffff"+
            "\7\122\3\uffff\2\122\2\uffff\1\122\4\uffff\1\122\11\uffff\1"+
            "\122\1\uffff\6\122\4\uffff\4\122\1\uffff\4\122\1\uffff\2\122",
            "\3\51\1\uffff\2\51\1\uffff\2\51\1\uffff\2\51\1\uffff\3\51\2"+
            "\uffff\3\51\2\uffff\1\51\1\uffff\1\51\1\uffff\7\51\5\uffff\3"+
            "\51\1\uffff\1\51\4\uffff\4\51\1\uffff\10\51\3\uffff\1\51\3\uffff"+
            "\3\51\2\uffff\5\51\1\uffff\2\51\2\uffff\3\51\6\uffff\1\51\1"+
            "\uffff\1\51\1\uffff\1\51\12\uffff\3\51\1\uffff\7\51\1\uffff"+
            "\2\51\2\uffff\1\51\4\uffff\1\51\1\uffff\1\51\1\uffff\1\51\3"+
            "\uffff\1\51\1\uffff\1\51\3\uffff\1\51\1\uffff\2\51\4\uffff\1"+
            "\51\1\uffff\3\51\1\uffff\2\51\1\uffff\1\51\3\uffff\4\51\1\uffff"+
            "\2\51\3\uffff\2\51\1\uffff\7\51\1\74\2\uffff\1\51\1\163\2\uffff"+
            "\1\51\4\uffff\1\51\11\uffff\1\51\1\uffff\6\51\4\uffff\4\51\1"+
            "\uffff\4\51\1\uffff\2\51",
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
            "\3\74\1\uffff\2\74\1\uffff\2\74\1\uffff\6\74\2\uffff\3\74\2"+
            "\uffff\1\74\1\uffff\1\74\1\uffff\7\74\5\uffff\3\74\1\uffff\1"+
            "\74\4\uffff\4\74\1\uffff\10\74\1\uffff\1\51\1\uffff\1\74\3\uffff"+
            "\3\74\2\uffff\5\74\1\uffff\2\74\2\uffff\3\74\6\uffff\1\74\1"+
            "\uffff\1\74\1\uffff\1\74\12\uffff\3\74\1\uffff\7\74\1\uffff"+
            "\2\74\2\uffff\1\74\4\uffff\1\74\1\uffff\1\74\1\uffff\1\74\3"+
            "\uffff\1\74\1\uffff\1\74\3\uffff\1\74\1\uffff\2\74\4\uffff\1"+
            "\74\1\uffff\3\74\1\uffff\2\74\1\uffff\1\74\3\uffff\4\74\1\uffff"+
            "\2\74\3\uffff\2\74\1\uffff\7\74\3\uffff\2\74\2\uffff\1\74\4"+
            "\uffff\1\74\11\uffff\1\74\1\uffff\6\74\4\uffff\4\74\1\uffff"+
            "\4\74\1\uffff\2\74",
            "",
            "",
            "",
            "\3\15\1\uffff\2\15\1\uffff\2\15\1\uffff\6\15\2\uffff\3\15\2"+
            "\uffff\1\15\1\uffff\1\15\1\uffff\7\15\5\uffff\3\15\1\uffff\1"+
            "\15\4\uffff\4\15\1\uffff\10\15\1\uffff\1\11\1\uffff\1\15\3\uffff"+
            "\3\15\2\uffff\5\15\1\uffff\2\15\2\uffff\3\15\6\uffff\1\15\1"+
            "\uffff\1\15\1\uffff\1\15\12\uffff\3\15\1\uffff\7\15\1\uffff"+
            "\2\15\2\uffff\1\15\4\uffff\1\15\1\uffff\1\15\1\uffff\1\15\3"+
            "\uffff\1\15\1\uffff\1\15\3\uffff\1\15\1\uffff\2\15\4\uffff\1"+
            "\15\1\uffff\3\15\1\uffff\2\15\1\uffff\1\15\3\uffff\4\15\1\uffff"+
            "\2\15\3\uffff\2\15\1\uffff\7\15\3\uffff\2\15\2\uffff\1\15\4"+
            "\uffff\1\15\11\uffff\1\15\1\uffff\6\15\4\uffff\4\15\1\uffff"+
            "\4\15\1\uffff\2\15",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "188:1: cond_expr : ( ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )? -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? ) | ( NOT )? IN LPAREN expr ( COMMA expr )* RPAREN -> ^( IN_VALUES ( NOT )? ^( IN ( expr )+ ) ) | ( NOT )? IN (database_name= id DOT )? table_name= id -> ^( IN_TABLE ( NOT )? ^( IN ^( $table_name ( $database_name)? ) ) ) | ( NOT )? IN ^ LPAREN ! ( select_stmt )? RPAREN !| ( NOT )? EQUALS ^ LPAREN ! ( select_stmt )? RPAREN !| ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL ) | IS NOT ^ eq_subexpr | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN ( NOT )? ^( AND $e1 $e2) ) | ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) ^ eq_subexpr )+ );";
        }
    }
    static final String DFA14_eotS =
        "\144\uffff";
    static final String DFA14_eofS =
        "\2\2\142\uffff";
    static final String DFA14_minS =
        "\2\5\57\uffff\1\5\2\uffff\1\5\1\36\1\11\2\103\1\36\1\103\51\uffff";
    static final String DFA14_maxS =
        "\2\u00e9\57\uffff\1\u00e9\2\uffff\1\u00e9\1\103\3\u00c0\1\103\1"+
        "\172\51\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\36\uffff\1\1\102\uffff";
    static final String DFA14_specialS =
        "\144\uffff}>";
    static final String[] DFA14_transitionS = {
            "\3\2\1\uffff\2\2\1\uffff\2\2\1\uffff\2\2\2\uffff\2\2\2\uffff"+
            "\3\2\4\uffff\1\2\1\uffff\5\2\1\uffff\1\2\3\uffff\1\2\1\uffff"+
            "\3\2\1\uffff\1\2\4\uffff\4\2\1\uffff\10\2\3\uffff\1\2\3\uffff"+
            "\3\2\2\uffff\1\1\4\2\1\uffff\1\2\3\uffff\3\2\6\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\12\uffff\3\2\1\uffff\6\2\2\uffff\2\2\2\uffff"+
            "\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff\1\2\7\uffff"+
            "\1\2\5\uffff\1\2\1\uffff\3\2\1\uffff\2\2\1\uffff\1\2\3\uffff"+
            "\1\2\1\uffff\2\2\1\uffff\1\2\4\uffff\2\2\1\uffff\10\2\2\uffff"+
            "\2\2\1\uffff\2\2\4\uffff\1\2\11\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\3\2\4\uffff\4\2\1\uffff\4\2\1\uffff\2\2",
            "\3\41\1\uffff\2\41\1\uffff\2\41\1\uffff\2\41\1\uffff\3\41\2"+
            "\uffff\3\41\2\uffff\1\41\1\uffff\1\41\1\uffff\7\41\3\uffff\1"+
            "\2\1\uffff\3\41\1\uffff\1\41\4\uffff\4\41\1\uffff\10\41\3\uffff"+
            "\1\41\3\uffff\3\41\2\uffff\1\41\1\70\3\41\1\uffff\2\41\2\uffff"+
            "\2\41\1\61\6\uffff\1\65\1\uffff\1\41\1\uffff\1\41\12\uffff\3"+
            "\41\1\uffff\7\41\1\uffff\1\67\1\41\2\uffff\1\41\4\uffff\1\41"+
            "\1\uffff\1\41\1\uffff\1\41\3\uffff\1\72\1\uffff\1\41\3\uffff"+
            "\1\41\1\uffff\2\41\4\uffff\1\41\1\uffff\3\41\1\uffff\1\41\1"+
            "\71\1\uffff\1\41\3\uffff\4\41\1\uffff\2\41\3\uffff\2\41\1\uffff"+
            "\7\41\1\2\2\uffff\2\41\1\uffff\1\2\1\41\4\uffff\1\41\11\uffff"+
            "\1\41\1\uffff\6\41\4\uffff\1\66\3\41\1\uffff\4\41\1\uffff\1"+
            "\41\1\64",
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
            "",
            "\3\2\1\uffff\2\2\1\uffff\2\2\1\uffff\2\2\2\uffff\2\2\2\uffff"+
            "\3\2\4\uffff\1\2\1\uffff\5\2\1\uffff\1\2\5\uffff\3\2\1\uffff"+
            "\1\2\4\uffff\4\2\1\uffff\10\2\1\uffff\1\41\1\uffff\1\2\3\uffff"+
            "\3\2\2\uffff\5\2\1\uffff\1\2\3\uffff\3\2\6\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\12\uffff\3\2\1\uffff\6\2\2\uffff\2\2\2\uffff"+
            "\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff\1\2\1\uffff"+
            "\1\2\5\uffff\1\2\5\uffff\1\2\1\uffff\3\2\1\uffff\2\2\1\uffff"+
            "\1\2\3\uffff\1\2\1\uffff\2\2\1\uffff\1\2\4\uffff\2\2\1\uffff"+
            "\7\2\3\uffff\2\2\2\uffff\1\2\4\uffff\1\2\11\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\3\2\4\uffff\4\2\1\uffff\4\2\1\uffff\2\2",
            "",
            "",
            "\3\2\1\uffff\2\2\1\uffff\2\2\1\uffff\2\2\1\uffff\3\2\2\uffff"+
            "\3\2\2\uffff\1\2\1\uffff\1\2\1\uffff\7\2\5\uffff\3\2\1\uffff"+
            "\1\2\4\uffff\4\2\1\uffff\10\2\1\uffff\1\41\1\uffff\1\2\3\uffff"+
            "\3\2\2\uffff\5\2\1\uffff\2\2\2\uffff\3\2\6\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\12\uffff\3\2\1\uffff\7\2\1\uffff\2\2\2\uffff"+
            "\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff\1\2\1\uffff"+
            "\1\2\3\uffff\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff\3\2\1\uffff"+
            "\2\2\1\uffff\1\2\3\uffff\4\2\1\uffff\2\2\3\uffff\2\2\1\uffff"+
            "\7\2\3\uffff\2\2\2\uffff\1\2\4\uffff\1\2\11\uffff\1\2\1\uffff"+
            "\6\2\4\uffff\4\2\1\uffff\4\2\1\uffff\2\2",
            "\1\2\44\uffff\1\41",
            "\1\2\71\uffff\1\41\174\uffff\1\2",
            "\1\41\174\uffff\1\2",
            "\1\41\174\uffff\1\2",
            "\1\2\44\uffff\1\41",
            "\1\41\66\uffff\1\2",
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
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "189:41: ( ESCAPE escape_expr= eq_subexpr )?";
        }
    }
    static final String DFA18_eotS =
        "\103\uffff";
    static final String DFA18_eofS =
        "\1\uffff\2\4\100\uffff";
    static final String DFA18_minS =
        "\3\5\100\uffff";
    static final String DFA18_maxS =
        "\3\u00e9\100\uffff";
    static final String DFA18_acceptS =
        "\3\uffff\1\1\1\2\76\uffff";
    static final String DFA18_specialS =
        "\103\uffff}>";
    static final String[] DFA18_transitionS = {
            "\3\2\1\uffff\2\2\1\uffff\2\2\1\uffff\2\2\2\uffff\2\2\2\uffff"+
            "\3\2\4\uffff\1\2\1\uffff\5\2\1\uffff\1\2\5\uffff\3\2\1\uffff"+
            "\1\2\4\uffff\4\2\1\uffff\10\2\3\uffff\1\2\3\uffff\3\2\2\uffff"+
            "\5\2\1\uffff\1\2\3\uffff\3\2\6\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\1\1\12\uffff\3\2\1\uffff\6\2\2\uffff\2\2\2\uffff\1\2\4\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff\1\2\7\uffff\1\2\5\uffff"+
            "\1\2\1\uffff\3\2\1\uffff\2\2\1\uffff\1\2\3\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\1\2\4\uffff\2\2\1\uffff\7\2\3\uffff\2\2\2\uffff"+
            "\1\2\4\uffff\1\1\11\uffff\1\2\1\uffff\2\2\1\uffff\3\2\4\uffff"+
            "\4\2\1\uffff\4\2\1\uffff\2\2",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\2\uffff\2\4\2\uffff"+
            "\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\3\uffff\1\4\1\uffff"+
            "\3\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\3\1\uffff"+
            "\1\4\3\uffff\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff"+
            "\1\4\7\uffff\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff"+
            "\1\4\3\uffff\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff"+
            "\10\4\2\uffff\2\4\1\uffff\2\4\4\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\2\uffff\2\4\2\uffff"+
            "\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\3\uffff\1\4\1\uffff"+
            "\3\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\3\1\uffff"+
            "\1\4\3\uffff\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff"+
            "\1\4\7\uffff\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff"+
            "\1\4\3\uffff\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff"+
            "\10\4\2\uffff\2\4\1\uffff\2\4\4\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
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
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "191:13: (database_name= id DOT )?";
        }
    }
    static final String DFA33_eotS =
        "\75\uffff";
    static final String DFA33_eofS =
        "\2\2\73\uffff";
    static final String DFA33_minS =
        "\1\5\1\52\73\uffff";
    static final String DFA33_maxS =
        "\2\u00e9\73\uffff";
    static final String DFA33_acceptS =
        "\2\uffff\1\2\55\uffff\1\1\14\uffff";
    static final String DFA33_specialS =
        "\75\uffff}>";
    static final String[] DFA33_transitionS = {
            "\3\2\1\uffff\5\2\1\uffff\3\2\1\uffff\2\2\2\uffff\3\2\4\uffff"+
            "\1\2\1\uffff\4\2\1\1\1\uffff\1\2\3\uffff\1\2\1\uffff\3\2\1\uffff"+
            "\1\2\4\uffff\4\2\1\uffff\10\2\2\uffff\2\2\3\uffff\12\2\1\uffff"+
            "\1\2\3\uffff\3\2\3\uffff\4\2\1\uffff\1\2\1\uffff\1\2\12\uffff"+
            "\12\2\2\uffff\2\2\2\uffff\2\2\3\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\5\2\4\uffff\2\2\1\uffff\5\2\1\uffff\1\2\1\uffff\3\2\1\uffff"+
            "\2\2\1\uffff\1\2\1\uffff\6\2\1\uffff\1\2\4\uffff\13\2\2\uffff"+
            "\2\2\1\uffff\5\2\1\uffff\1\2\11\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\3\2\4\uffff\4\2\1\uffff\4\2\1\uffff\2\2",
            "\1\2\44\uffff\1\2\12\uffff\1\2\6\uffff\1\2\3\uffff\1\60\26"+
            "\uffff\1\2\20\uffff\1\2\24\uffff\1\2\31\uffff\1\2\5\uffff\1"+
            "\2\33\uffff\1\2\12\uffff\1\2",
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
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "216:26: ( COLLATE ^collation_name= ID )?";
        }
    }
    static final String DFA42_eotS =
        "\u014b\uffff";
    static final String DFA42_eofS =
        "\3\uffff\1\1\1\uffff\4\1\3\uffff\1\21\u013e\uffff";
    static final String DFA42_minS =
        "\1\5\2\uffff\1\5\1\uffff\4\5\3\uffff\1\5\1\103\1\uffff\1\5\1\103"+
        "\u013a\uffff";
    static final String DFA42_maxS =
        "\1\u00e9\2\uffff\1\u00e9\1\uffff\4\u00e9\3\uffff\1\u00e9\1\u008f"+
        "\1\uffff\1\u00e9\1\u008f\u013a\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\1\7\uffff\1\2\4\uffff\1\5\2\uffff\1\3\u00f0\uffff\1\4"+
        "\60\uffff\1\6\2\uffff\1\7\22\uffff\1\10\1\uffff";
    static final String DFA42_specialS =
        "\u014b\uffff}>";
    static final String[] DFA42_transitionS = {
            "\3\21\1\uffff\2\21\1\uffff\2\21\1\uffff\2\21\1\uffff\1\11\2"+
            "\21\2\uffff\3\21\2\uffff\1\1\1\uffff\1\21\1\uffff\1\21\1\17"+
            "\1\15\2\21\1\11\1\21\5\uffff\3\21\1\uffff\1\21\4\uffff\1\21"+
            "\1\7\1\6\1\10\1\uffff\10\21\3\uffff\1\21\3\uffff\3\21\2\uffff"+
            "\5\21\1\uffff\1\21\1\1\2\uffff\3\21\6\uffff\1\21\1\uffff\1\21"+
            "\1\uffff\1\14\12\uffff\3\21\1\uffff\6\21\1\1\1\uffff\2\21\2"+
            "\uffff\1\21\4\uffff\1\21\1\uffff\1\21\1\uffff\1\21\3\uffff\1"+
            "\21\1\uffff\1\16\5\uffff\1\21\5\uffff\1\5\1\uffff\3\21\1\uffff"+
            "\2\21\1\uffff\1\21\3\uffff\1\21\1\uffff\2\21\1\uffff\1\21\1"+
            "\11\3\uffff\1\20\1\21\1\uffff\7\21\3\uffff\2\21\2\uffff\1\21"+
            "\4\uffff\1\3\11\uffff\1\21\1\uffff\2\21\1\uffff\3\21\4\uffff"+
            "\4\21\1\uffff\4\21\1\uffff\2\21",
            "",
            "",
            "\3\1\1\uffff\5\1\1\uffff\3\1\1\uffff\2\1\2\uffff\3\1\4\uffff"+
            "\1\1\1\uffff\5\1\1\uffff\1\1\3\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\21\2\1\3\uffff\12\1"+
            "\1\uffff\1\1\3\uffff\3\1\3\uffff\4\1\1\uffff\1\1\1\uffff\1\1"+
            "\12\uffff\12\1\2\uffff\2\1\2\uffff\2\1\3\uffff\1\1\1\uffff\1"+
            "\1\1\uffff\5\1\4\uffff\2\1\1\uffff\5\1\1\uffff\1\1\1\uffff\3"+
            "\1\1\uffff\2\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\4\uffff\13"+
            "\1\2\uffff\2\1\1\uffff\5\1\1\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "",
            "\3\1\1\uffff\5\1\1\uffff\3\1\1\uffff\2\1\2\uffff\3\1\4\uffff"+
            "\1\1\1\uffff\5\1\1\uffff\1\1\3\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\21\2\1\3\uffff\12\1"+
            "\1\uffff\1\1\3\uffff\3\1\3\uffff\4\1\1\uffff\1\1\1\uffff\1\1"+
            "\12\uffff\12\1\2\uffff\2\1\2\uffff\2\1\3\uffff\1\1\1\uffff\1"+
            "\1\1\uffff\5\1\4\uffff\2\1\1\uffff\5\1\1\uffff\1\1\1\uffff\3"+
            "\1\1\uffff\2\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\4\uffff\13"+
            "\1\2\uffff\2\1\1\uffff\5\1\1\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\3\1\1\uffff\5\1\1\uffff\3\1\1\uffff\2\1\2\uffff\3\1\4\uffff"+
            "\1\1\1\uffff\5\1\1\uffff\1\1\3\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\21\2\1\3\uffff\12\1"+
            "\1\uffff\1\1\3\uffff\3\1\3\uffff\4\1\1\uffff\1\1\1\uffff\1\1"+
            "\12\uffff\12\1\2\uffff\2\1\2\uffff\2\1\3\uffff\1\1\1\uffff\1"+
            "\1\1\uffff\5\1\4\uffff\2\1\1\uffff\5\1\1\uffff\1\1\1\uffff\3"+
            "\1\1\uffff\2\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\4\uffff\13"+
            "\1\2\uffff\2\1\1\uffff\5\1\1\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\3\1\1\uffff\5\1\1\uffff\3\1\1\uffff\2\1\2\uffff\3\1\4\uffff"+
            "\1\1\1\uffff\5\1\1\uffff\1\1\3\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\21\2\1\3\uffff\12\1"+
            "\1\uffff\1\1\3\uffff\3\1\3\uffff\4\1\1\uffff\1\1\1\uffff\1\1"+
            "\12\uffff\12\1\2\uffff\2\1\2\uffff\2\1\3\uffff\1\1\1\uffff\1"+
            "\1\1\uffff\5\1\4\uffff\2\1\1\uffff\5\1\1\uffff\1\1\1\uffff\3"+
            "\1\1\uffff\2\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\4\uffff\13"+
            "\1\2\uffff\2\1\1\uffff\5\1\1\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\3\1\1\uffff\5\1\1\uffff\3\1\1\uffff\2\1\2\uffff\3\1\4\uffff"+
            "\1\1\1\uffff\5\1\1\uffff\1\1\3\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\21\2\1\3\uffff\12\1"+
            "\1\uffff\1\1\3\uffff\3\1\3\uffff\4\1\1\uffff\1\1\1\uffff\1\1"+
            "\12\uffff\12\1\2\uffff\2\1\2\uffff\2\1\3\uffff\1\1\1\uffff\1"+
            "\1\1\uffff\5\1\4\uffff\2\1\1\uffff\5\1\1\uffff\1\1\1\uffff\3"+
            "\1\1\uffff\2\1\1\uffff\1\1\1\uffff\6\1\1\uffff\1\1\4\uffff\13"+
            "\1\2\uffff\2\1\1\uffff\5\1\1\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "",
            "",
            "",
            "\3\21\1\uffff\5\21\1\uffff\3\21\1\uffff\2\21\2\uffff\3\21\4"+
            "\uffff\1\21\1\uffff\5\21\1\uffff\1\21\3\uffff\1\21\1\uffff\3"+
            "\21\1\uffff\1\21\4\uffff\4\21\1\uffff\10\21\1\uffff\3\21\3\uffff"+
            "\12\21\1\uffff\1\21\3\uffff\3\21\3\uffff\4\21\1\uffff\1\21\1"+
            "\uffff\1\21\12\uffff\12\21\2\uffff\2\21\2\uffff\2\21\3\uffff"+
            "\1\21\1\uffff\1\21\1\uffff\5\21\1\uffff\1\u0102\2\uffff\2\21"+
            "\1\uffff\5\21\1\uffff\1\21\1\uffff\3\21\1\uffff\2\21\1\uffff"+
            "\1\21\1\uffff\6\21\1\uffff\1\21\4\uffff\13\21\2\uffff\2\21\1"+
            "\uffff\5\21\1\uffff\1\21\11\uffff\1\21\1\uffff\2\21\1\uffff"+
            "\3\21\4\uffff\4\21\1\uffff\4\21\1\uffff\2\21",
            "\1\21\113\uffff\1\u0133",
            "",
            "\3\u0136\1\uffff\2\u0136\1\uffff\2\u0136\1\uffff\2\u0136\1"+
            "\uffff\3\u0136\2\uffff\3\u0136\2\uffff\1\u0136\1\uffff\1\u0136"+
            "\1\uffff\7\u0136\5\uffff\3\u0136\1\uffff\1\u0136\4\uffff\4\u0136"+
            "\1\uffff\10\u0136\1\uffff\1\21\1\uffff\1\u0136\3\uffff\3\u0136"+
            "\2\uffff\5\u0136\1\uffff\2\u0136\2\uffff\3\u0136\6\uffff\1\u0136"+
            "\1\uffff\1\u0136\1\uffff\1\u0136\12\uffff\3\u0136\1\uffff\7"+
            "\u0136\1\uffff\2\u0136\2\uffff\1\u0136\4\uffff\1\u0136\1\uffff"+
            "\1\u0136\1\uffff\1\u0136\3\uffff\1\u0136\1\uffff\1\u0136\3\uffff"+
            "\1\u0136\1\uffff\2\u0136\4\uffff\1\u0136\1\uffff\3\u0136\1\uffff"+
            "\2\u0136\1\uffff\1\u0136\3\uffff\4\u0136\1\uffff\2\u0136\3\uffff"+
            "\2\u0136\1\uffff\7\u0136\3\uffff\2\u0136\2\uffff\1\u0136\4\uffff"+
            "\1\u0136\11\uffff\1\u0136\1\uffff\6\u0136\4\uffff\4\u0136\1"+
            "\uffff\4\u0136\1\uffff\2\u0136",
            "\1\21\113\uffff\1\u0149",
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
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "218:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) |name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN -> ^( FUNCTION_EXPRESSION $name ( DISTINCT )? ( $args)* ( ASTERISK )? ) | LPAREN ! expr RPAREN !| CAST ^ LPAREN ! expr AS ! type_name RPAREN !| CASE (case_expr= expr )? ( when_expr )+ ( ELSE else_expr= expr )? END -> ^( CASE ( $case_expr)? ( when_expr )+ ( $else_expr)? ) | raise_function );";
        }
    }
    static final String DFA34_eotS =
        "\153\uffff";
    static final String DFA34_eofS =
        "\5\uffff\1\14\2\uffff\1\14\142\uffff";
    static final String DFA34_minS =
        "\1\5\2\103\3\5\2\uffff\1\5\142\uffff";
    static final String DFA34_maxS =
        "\1\u00e9\2\103\3\u00e9\2\uffff\1\u00e9\142\uffff";
    static final String DFA34_acceptS =
        "\6\uffff\1\1\5\uffff\1\2\136\uffff";
    static final String DFA34_specialS =
        "\153\uffff}>";
    static final String[] DFA34_transitionS = {
            "\3\2\1\uffff\2\2\1\uffff\2\2\1\uffff\2\2\2\uffff\2\2\2\uffff"+
            "\3\2\4\uffff\1\2\1\uffff\5\2\1\uffff\1\2\5\uffff\3\2\1\uffff"+
            "\1\2\4\uffff\4\2\1\uffff\10\2\3\uffff\1\2\3\uffff\3\2\2\uffff"+
            "\5\2\1\uffff\1\2\3\uffff\3\2\6\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\1\1\12\uffff\3\2\1\uffff\6\2\2\uffff\2\2\2\uffff\1\2\4\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff\1\2\7\uffff\1\2\5\uffff"+
            "\1\2\1\uffff\3\2\1\uffff\2\2\1\uffff\1\2\3\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\1\2\4\uffff\2\2\1\uffff\7\2\3\uffff\2\2\2\uffff"+
            "\1\2\4\uffff\1\1\11\uffff\1\2\1\uffff\2\2\1\uffff\3\2\4\uffff"+
            "\4\2\1\uffff\4\2\1\uffff\2\2",
            "\1\3",
            "\1\4",
            "\3\6\1\uffff\2\6\1\uffff\2\6\1\uffff\2\6\2\uffff\2\6\2\uffff"+
            "\3\6\4\uffff\1\6\1\uffff\5\6\1\uffff\1\6\5\uffff\3\6\1\uffff"+
            "\1\6\4\uffff\4\6\1\uffff\10\6\3\uffff\1\6\3\uffff\3\6\2\uffff"+
            "\5\6\1\uffff\1\6\3\uffff\3\6\6\uffff\1\6\1\uffff\1\6\1\uffff"+
            "\1\5\12\uffff\3\6\1\uffff\6\6\2\uffff\2\6\2\uffff\1\6\4\uffff"+
            "\1\6\1\uffff\1\6\1\uffff\1\6\3\uffff\1\6\7\uffff\1\6\5\uffff"+
            "\1\6\1\uffff\3\6\1\uffff\2\6\1\uffff\1\6\3\uffff\1\6\1\uffff"+
            "\2\6\1\uffff\1\6\4\uffff\2\6\1\uffff\7\6\3\uffff\2\6\2\uffff"+
            "\1\6\4\uffff\1\6\11\uffff\1\6\1\uffff\2\6\1\uffff\3\6\4\uffff"+
            "\4\6\1\uffff\4\6\1\uffff\2\6",
            "\3\6\1\uffff\2\6\1\uffff\2\6\1\uffff\2\6\2\uffff\2\6\2\uffff"+
            "\3\6\4\uffff\1\6\1\uffff\5\6\1\uffff\1\6\5\uffff\3\6\1\uffff"+
            "\1\6\4\uffff\4\6\1\uffff\10\6\3\uffff\1\6\3\uffff\3\6\2\uffff"+
            "\5\6\1\uffff\1\6\3\uffff\3\6\6\uffff\1\6\1\uffff\1\6\1\uffff"+
            "\1\10\12\uffff\3\6\1\uffff\6\6\2\uffff\2\6\2\uffff\1\6\4\uffff"+
            "\1\6\1\uffff\1\6\1\uffff\1\6\3\uffff\1\6\7\uffff\1\6\5\uffff"+
            "\1\6\1\uffff\3\6\1\uffff\2\6\1\uffff\1\6\3\uffff\1\6\1\uffff"+
            "\2\6\1\uffff\1\6\4\uffff\2\6\1\uffff\7\6\3\uffff\2\6\2\uffff"+
            "\1\6\4\uffff\1\6\11\uffff\1\6\1\uffff\2\6\1\uffff\3\6\4\uffff"+
            "\4\6\1\uffff\4\6\1\uffff\2\6",
            "\3\14\1\uffff\5\14\1\uffff\3\14\1\uffff\2\14\2\uffff\3\14\4"+
            "\uffff\1\14\1\uffff\5\14\1\uffff\1\14\3\uffff\1\14\1\uffff\3"+
            "\14\1\uffff\1\14\4\uffff\4\14\1\uffff\10\14\1\uffff\1\6\2\14"+
            "\3\uffff\12\14\1\uffff\1\14\3\uffff\3\14\3\uffff\4\14\1\uffff"+
            "\1\14\1\uffff\1\14\12\uffff\12\14\2\uffff\2\14\2\uffff\2\14"+
            "\3\uffff\1\14\1\uffff\1\14\1\uffff\5\14\4\uffff\2\14\1\uffff"+
            "\5\14\1\uffff\1\14\1\uffff\3\14\1\uffff\2\14\1\uffff\1\14\1"+
            "\uffff\6\14\1\uffff\1\14\4\uffff\13\14\2\uffff\2\14\1\uffff"+
            "\5\14\1\uffff\1\14\11\uffff\1\14\1\uffff\2\14\1\uffff\3\14\4"+
            "\uffff\4\14\1\uffff\4\14\1\uffff\2\14",
            "",
            "",
            "\3\14\1\uffff\5\14\1\uffff\3\14\1\uffff\2\14\2\uffff\3\14\4"+
            "\uffff\1\14\1\uffff\5\14\1\uffff\1\14\3\uffff\1\14\1\uffff\3"+
            "\14\1\uffff\1\14\4\uffff\4\14\1\uffff\10\14\1\uffff\1\6\2\14"+
            "\3\uffff\12\14\1\uffff\1\14\3\uffff\3\14\3\uffff\4\14\1\uffff"+
            "\1\14\1\uffff\1\14\12\uffff\12\14\2\uffff\2\14\2\uffff\2\14"+
            "\3\uffff\1\14\1\uffff\1\14\1\uffff\5\14\4\uffff\2\14\1\uffff"+
            "\5\14\1\uffff\1\14\1\uffff\3\14\1\uffff\2\14\1\uffff\1\14\1"+
            "\uffff\6\14\1\uffff\1\14\4\uffff\13\14\2\uffff\2\14\1\uffff"+
            "\5\14\1\uffff\1\14\11\uffff\1\14\1\uffff\2\14\1\uffff\3\14\4"+
            "\uffff\4\14\1\uffff\4\14\1\uffff\2\14",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "221:6: (database_name= id DOT )?";
        }
    }
    static final String DFA69_eotS =
        "\76\uffff";
    static final String DFA69_eofS =
        "\76\uffff";
    static final String DFA69_minS =
        "\3\5\73\uffff";
    static final String DFA69_maxS =
        "\3\u00e9\73\uffff";
    static final String DFA69_acceptS =
        "\3\uffff\1\3\22\uffff\1\1\23\uffff\1\2\23\uffff";
    static final String DFA69_specialS =
        "\76\uffff}>";
    static final String[] DFA69_transitionS = {
            "\3\3\1\uffff\1\1\1\3\1\uffff\2\3\1\uffff\6\3\2\uffff\3\3\2\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\7\3\5\uffff\3\3\1\uffff\1\3\4\uffff"+
            "\4\3\1\uffff\7\3\1\2\3\uffff\1\3\3\uffff\3\3\2\uffff\5\3\1\uffff"+
            "\2\3\2\uffff\3\3\6\uffff\1\3\1\uffff\1\3\1\uffff\1\3\12\uffff"+
            "\3\3\1\uffff\7\3\1\uffff\2\3\2\uffff\1\3\4\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\1\3\3\uffff\1\3\1\uffff\1\3\3\uffff\1\3\1\uffff"+
            "\2\3\4\uffff\1\3\1\uffff\3\3\1\uffff\2\3\1\uffff\1\3\3\uffff"+
            "\4\3\1\uffff\2\3\3\uffff\2\3\1\uffff\7\3\3\uffff\2\3\2\uffff"+
            "\1\3\4\uffff\1\3\11\uffff\1\3\1\uffff\6\3\4\uffff\4\3\1\uffff"+
            "\4\3\1\uffff\2\3",
            "\3\26\1\uffff\2\26\1\uffff\2\26\1\uffff\6\26\2\uffff\3\26\2"+
            "\uffff\1\26\1\uffff\1\26\1\uffff\7\26\5\uffff\3\26\1\uffff\1"+
            "\26\4\uffff\4\26\1\uffff\10\26\1\uffff\1\3\1\uffff\1\26\3\uffff"+
            "\3\26\2\uffff\5\26\1\uffff\2\26\2\uffff\3\26\6\uffff\1\26\1"+
            "\uffff\1\26\1\uffff\1\26\12\uffff\3\26\1\uffff\7\26\1\uffff"+
            "\2\26\2\uffff\1\26\4\uffff\1\26\1\uffff\1\26\1\uffff\1\26\3"+
            "\uffff\1\26\1\uffff\1\26\3\uffff\1\26\1\uffff\2\26\4\uffff\1"+
            "\26\1\uffff\3\26\1\uffff\2\26\1\uffff\1\26\3\uffff\4\26\1\uffff"+
            "\2\26\3\uffff\2\26\1\uffff\7\26\3\uffff\2\26\2\uffff\1\26\4"+
            "\uffff\1\26\11\uffff\1\26\1\uffff\6\26\4\uffff\4\26\1\uffff"+
            "\4\26\1\uffff\2\26",
            "\3\52\1\uffff\2\52\1\uffff\2\52\1\uffff\6\52\2\uffff\3\52\2"+
            "\uffff\1\52\1\uffff\1\52\1\uffff\7\52\5\uffff\3\52\1\uffff\1"+
            "\52\4\uffff\4\52\1\uffff\10\52\1\uffff\1\3\1\uffff\1\52\3\uffff"+
            "\3\52\2\uffff\5\52\1\uffff\2\52\2\uffff\3\52\6\uffff\1\52\1"+
            "\uffff\1\52\1\uffff\1\52\12\uffff\3\52\1\uffff\7\52\1\uffff"+
            "\2\52\2\uffff\1\52\4\uffff\1\52\1\uffff\1\52\1\uffff\1\52\3"+
            "\uffff\1\52\1\uffff\1\52\3\uffff\1\52\1\uffff\2\52\4\uffff\1"+
            "\52\1\uffff\3\52\1\uffff\2\52\1\uffff\1\52\3\uffff\4\52\1\uffff"+
            "\2\52\3\uffff\2\52\1\uffff\7\52\3\uffff\2\52\2\uffff\1\52\4"+
            "\uffff\1\52\11\uffff\1\52\1\uffff\6\52\4\uffff\4\52\1\uffff"+
            "\4\52\1\uffff\2\52",
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
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "312:10: ( ALL | DISTINCT )?";
        }
    }
    static final String DFA78_eotS =
        "\u011c\uffff";
    static final String DFA78_eofS =
        "\2\uffff\2\4\2\uffff\1\4\1\uffff\3\4\u0111\uffff";
    static final String DFA78_minS =
        "\1\5\1\uffff\2\5\2\uffff\1\5\1\uffff\3\5\1\103\4\uffff\1\5\2\103"+
        "\1\uffff\1\5\40\uffff\1\5\41\uffff\1\5\40\uffff\1\5\40\uffff\1\5"+
        "\40\uffff\1\5\41\uffff\2\5\24\uffff\2\5\50\uffff";
    static final String DFA78_maxS =
        "\1\u00e9\1\uffff\2\u00e9\2\uffff\1\u00e9\1\uffff\3\u00e9\1\u008f"+
        "\4\uffff\1\u00e9\1\u008f\1\103\1\uffff\1\u00e9\40\uffff\1\u00e9"+
        "\41\uffff\1\u00e9\40\uffff\1\u00e9\40\uffff\1\u00e9\40\uffff\1\u00e9"+
        "\41\uffff\2\u00e9\24\uffff\2\u00e9\50\uffff";
    static final String DFA78_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\u00ef\uffff\1\2\47\uffff";
    static final String DFA78_specialS =
        "\u011c\uffff}>";
    static final String[] DFA78_transitionS = {
            "\3\22\1\uffff\2\22\1\uffff\2\22\1\uffff\2\22\1\1\1\4\2\22\2"+
            "\uffff\3\22\2\uffff\1\4\1\uffff\1\22\1\uffff\1\22\1\20\1\13"+
            "\2\22\1\4\1\22\5\uffff\3\22\1\uffff\1\22\4\uffff\1\22\1\11\1"+
            "\10\1\12\1\uffff\10\22\3\uffff\1\22\3\uffff\3\22\2\uffff\5\22"+
            "\1\uffff\1\22\1\4\2\uffff\3\22\6\uffff\1\22\1\uffff\1\22\1\uffff"+
            "\1\6\12\uffff\3\22\1\uffff\6\22\1\4\1\uffff\2\22\2\uffff\1\22"+
            "\4\uffff\1\22\1\uffff\1\22\1\uffff\1\22\3\uffff\1\22\1\uffff"+
            "\1\4\3\uffff\1\4\1\uffff\1\22\1\4\4\uffff\1\3\1\uffff\3\22\1"+
            "\uffff\2\22\1\uffff\1\22\3\uffff\1\22\1\4\2\22\1\uffff\1\22"+
            "\1\4\3\uffff\1\21\1\22\1\uffff\7\22\3\uffff\2\22\2\uffff\1\22"+
            "\4\uffff\1\2\11\uffff\1\22\1\uffff\2\22\1\4\3\22\4\uffff\4\22"+
            "\1\uffff\4\22\1\uffff\2\22",
            "",
            "\3\4\1\uffff\5\4\1\uffff\3\4\1\uffff\2\4\2\uffff\3\4\4\uffff"+
            "\1\4\1\uffff\5\4\1\uffff\1\4\3\uffff\1\4\1\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\24\2\4\3\uffff\12\4"+
            "\1\uffff\1\4\3\uffff\3\4\3\uffff\4\4\1\uffff\1\4\1\uffff\1\4"+
            "\12\uffff\12\4\2\uffff\2\4\2\uffff\2\4\3\uffff\1\4\1\uffff\1"+
            "\4\1\uffff\5\4\4\uffff\2\4\1\uffff\5\4\1\uffff\1\4\1\uffff\3"+
            "\4\1\uffff\2\4\1\uffff\1\4\1\uffff\6\4\1\uffff\1\4\4\uffff\13"+
            "\4\2\uffff\2\4\1\uffff\5\4\1\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\3\4\1\uffff\5\4\1\uffff\3\4\1\uffff\2\4\2\uffff\3\4\4\uffff"+
            "\1\4\1\uffff\5\4\1\uffff\1\4\3\uffff\1\4\1\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\65\2\4\3\uffff\12\4"+
            "\1\uffff\1\4\3\uffff\3\4\3\uffff\4\4\1\uffff\1\4\1\uffff\1\4"+
            "\12\uffff\12\4\2\uffff\2\4\2\uffff\2\4\3\uffff\1\4\1\uffff\1"+
            "\4\1\uffff\5\4\4\uffff\2\4\1\uffff\5\4\1\uffff\1\4\1\uffff\3"+
            "\4\1\uffff\2\4\1\uffff\1\4\1\uffff\6\4\1\uffff\1\4\4\uffff\13"+
            "\4\2\uffff\2\4\1\uffff\5\4\1\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "",
            "",
            "\3\4\1\uffff\5\4\1\uffff\3\4\1\uffff\2\4\2\uffff\3\4\4\uffff"+
            "\1\4\1\uffff\5\4\1\uffff\1\4\3\uffff\1\4\1\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\127\2\4\3\uffff\12\4"+
            "\1\uffff\1\4\3\uffff\3\4\3\uffff\4\4\1\uffff\1\4\1\uffff\1\4"+
            "\12\uffff\12\4\2\uffff\2\4\2\uffff\2\4\3\uffff\1\4\1\uffff\1"+
            "\4\1\uffff\5\4\1\uffff\1\4\2\uffff\2\4\1\uffff\5\4\1\uffff\1"+
            "\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\1\uffff\6\4\1\uffff\1"+
            "\4\4\uffff\13\4\2\uffff\2\4\1\uffff\5\4\1\uffff\1\4\11\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff"+
            "\2\4",
            "",
            "\3\4\1\uffff\5\4\1\uffff\3\4\1\uffff\2\4\2\uffff\3\4\4\uffff"+
            "\1\4\1\uffff\5\4\1\uffff\1\4\3\uffff\1\4\1\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\170\2\4\3\uffff\12\4"+
            "\1\uffff\1\4\3\uffff\3\4\3\uffff\4\4\1\uffff\1\4\1\uffff\1\4"+
            "\12\uffff\12\4\2\uffff\2\4\2\uffff\2\4\3\uffff\1\4\1\uffff\1"+
            "\4\1\uffff\5\4\4\uffff\2\4\1\uffff\5\4\1\uffff\1\4\1\uffff\3"+
            "\4\1\uffff\2\4\1\uffff\1\4\1\uffff\6\4\1\uffff\1\4\4\uffff\13"+
            "\4\2\uffff\2\4\1\uffff\5\4\1\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\3\4\1\uffff\5\4\1\uffff\3\4\1\uffff\2\4\2\uffff\3\4\4\uffff"+
            "\1\4\1\uffff\5\4\1\uffff\1\4\3\uffff\1\4\1\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\u0099\2\4\3\uffff\12"+
            "\4\1\uffff\1\4\3\uffff\3\4\3\uffff\4\4\1\uffff\1\4\1\uffff\1"+
            "\4\12\uffff\12\4\2\uffff\2\4\2\uffff\2\4\3\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\5\4\4\uffff\2\4\1\uffff\5\4\1\uffff\1\4\1\uffff"+
            "\3\4\1\uffff\2\4\1\uffff\1\4\1\uffff\6\4\1\uffff\1\4\4\uffff"+
            "\13\4\2\uffff\2\4\1\uffff\5\4\1\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\3\4\1\uffff\5\4\1\uffff\3\4\1\uffff\2\4\2\uffff\3\4\4\uffff"+
            "\1\4\1\uffff\5\4\1\uffff\1\4\3\uffff\1\4\1\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\u00ba\2\4\3\uffff\12"+
            "\4\1\uffff\1\4\3\uffff\3\4\3\uffff\4\4\1\uffff\1\4\1\uffff\1"+
            "\4\12\uffff\12\4\2\uffff\2\4\2\uffff\2\4\3\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\5\4\4\uffff\2\4\1\uffff\5\4\1\uffff\1\4\1\uffff"+
            "\3\4\1\uffff\2\4\1\uffff\1\4\1\uffff\6\4\1\uffff\1\4\4\uffff"+
            "\13\4\2\uffff\2\4\1\uffff\5\4\1\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\1\u00dc\113\uffff\1\4",
            "",
            "",
            "",
            "",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\uffff\3\4\2\uffff"+
            "\3\4\2\uffff\1\4\1\uffff\1\4\1\uffff\7\4\5\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\u00dd\1\uffff\1\4\3"+
            "\uffff\3\4\2\uffff\5\4\1\uffff\2\4\2\uffff\3\4\6\uffff\1\4\1"+
            "\uffff\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\7\4\1\uffff\2\4"+
            "\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4"+
            "\1\uffff\1\4\3\uffff\1\4\1\uffff\2\4\4\uffff\1\4\1\uffff\3\4"+
            "\1\uffff\2\4\1\uffff\1\4\3\uffff\4\4\1\uffff\2\4\3\uffff\2\4"+
            "\1\uffff\7\4\3\uffff\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1"+
            "\4\1\uffff\6\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\1\u00f2\113\uffff\1\4",
            "\1\u00f3",
            "",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00f4\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00f4\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
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
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00f4\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00f4\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00f4\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00f4\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
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
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00f4\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00f4\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
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
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00f4\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\u00f4\1\uffff\2"+
            "\4\2\uffff\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3"+
            "\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\7\uffff"+
            "\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff\1\4\3\uffff"+
            "\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff\7\4\3\uffff"+
            "\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
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
            ""
    };

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "319:1: result_column : ( ASTERISK |table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );";
        }
    }
    static final String DFA77_eotS =
        "\u00d7\uffff";
    static final String DFA77_eofS =
        "\1\4\2\uffff\1\1\1\uffff\7\1\u00cb\uffff";
    static final String DFA77_minS =
        "\1\5\2\uffff\1\5\1\uffff\1\5\1\36\1\11\2\52\1\36\1\52\5\uffff\2"+
        "\5\1\36\1\11\2\103\1\36\1\103\10\uffff\2\5\1\36\1\11\2\103\1\36"+
        "\1\103\u00ae\uffff";
    static final String DFA77_maxS =
        "\1\u00e9\2\uffff\1\u00e9\1\uffff\7\u00e9\5\uffff\2\u00e9\1\103\3"+
        "\u00c0\1\103\1\172\10\uffff\2\u00e9\1\103\3\u00c0\1\103\1\172\u00ae"+
        "\uffff";
    static final String DFA77_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\u00d2\uffff";
    static final String DFA77_specialS =
        "\u00d7\uffff}>";
    static final String[] DFA77_transitionS = {
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\2\uffff\2\1\2\uffff"+
            "\3\1\4\uffff\1\1\1\uffff\5\1\1\uffff\1\1\3\uffff\1\4\1\uffff"+
            "\3\1\1\uffff\1\1\4\uffff\4\1\1\uffff\10\1\3\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\1\1\1\11\3\1\1\uffff\1\1\3\uffff\2\1\1\3\6\uffff"+
            "\1\6\1\uffff\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\6\1\2\uffff"+
            "\1\10\1\1\2\uffff\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3"+
            "\uffff\1\13\7\uffff\1\1\5\uffff\1\1\1\uffff\3\1\1\uffff\1\1"+
            "\1\12\1\uffff\1\1\3\uffff\1\1\1\uffff\2\1\1\uffff\1\1\4\uffff"+
            "\2\1\1\uffff\7\1\1\4\2\uffff\2\1\1\uffff\1\4\1\1\4\uffff\1\1"+
            "\11\uffff\1\1\1\uffff\2\1\1\uffff\3\1\4\uffff\1\7\3\1\1\uffff"+
            "\4\1\1\uffff\1\1\1\5",
            "",
            "",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\2\uffff\2\4\2\uffff"+
            "\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\3\uffff\1\1\1\uffff"+
            "\3\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\1\4\1\26\3\4\1\uffff\1\4\3\uffff\2\4\1\21\6\uffff"+
            "\1\23\1\uffff\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff"+
            "\1\25\1\4\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3"+
            "\uffff\1\30\1\uffff\1\4\5\uffff\1\4\5\uffff\1\4\1\uffff\3\4"+
            "\1\uffff\1\4\1\27\1\uffff\1\4\3\uffff\1\4\1\uffff\2\4\1\uffff"+
            "\1\4\4\uffff\2\4\1\uffff\7\4\1\1\2\uffff\2\4\1\uffff\1\1\1\4"+
            "\4\uffff\1\4\11\uffff\1\4\1\uffff\2\4\1\uffff\3\4\4\uffff\1"+
            "\24\3\4\1\uffff\4\4\1\uffff\1\4\1\22",
            "",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\uffff\3\4\2\uffff"+
            "\3\4\2\uffff\1\4\1\uffff\1\4\1\uffff\7\4\3\uffff\1\1\1\uffff"+
            "\3\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\1\4\1\46\3\4\1\uffff\2\4\2\uffff\2\4\1\41\6\uffff"+
            "\1\43\1\uffff\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\7\4\1\uffff"+
            "\1\45\1\4\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3"+
            "\uffff\1\50\1\uffff\1\4\3\uffff\1\4\1\uffff\2\4\4\uffff\1\4"+
            "\1\uffff\3\4\1\uffff\1\4\1\47\1\uffff\1\4\3\uffff\4\4\1\uffff"+
            "\2\4\3\uffff\2\4\1\uffff\7\4\1\1\2\uffff\2\4\1\uffff\1\1\1\4"+
            "\4\uffff\1\4\11\uffff\1\4\1\uffff\6\4\4\uffff\1\44\3\4\1\uffff"+
            "\4\4\1\uffff\1\4\1\42",
            "\1\4\13\uffff\1\1\44\uffff\1\1\12\uffff\1\1\6\uffff\1\1\32"+
            "\uffff\1\1\20\uffff\1\1\24\uffff\1\1\31\uffff\1\1\5\uffff\1"+
            "\1\33\uffff\1\1\12\uffff\1\1",
            "\1\4\40\uffff\1\1\44\uffff\1\1\12\uffff\1\1\6\uffff\1\1\32"+
            "\uffff\1\1\20\uffff\1\1\24\uffff\1\1\31\uffff\1\1\3\uffff\1"+
            "\4\1\uffff\1\1\33\uffff\1\1\12\uffff\1\1",
            "\1\1\44\uffff\1\1\12\uffff\1\1\6\uffff\1\1\32\uffff\1\1\20"+
            "\uffff\1\1\24\uffff\1\1\31\uffff\1\1\3\uffff\1\4\1\uffff\1\1"+
            "\33\uffff\1\1\12\uffff\1\1",
            "\1\1\44\uffff\1\1\12\uffff\1\1\6\uffff\1\1\32\uffff\1\1\20"+
            "\uffff\1\1\24\uffff\1\1\31\uffff\1\1\3\uffff\1\4\1\uffff\1\1"+
            "\33\uffff\1\1\12\uffff\1\1",
            "\1\4\13\uffff\1\1\44\uffff\1\1\12\uffff\1\1\6\uffff\1\1\32"+
            "\uffff\1\1\20\uffff\1\1\24\uffff\1\1\31\uffff\1\1\5\uffff\1"+
            "\1\33\uffff\1\1\12\uffff\1\1",
            "\1\1\44\uffff\1\1\12\uffff\1\1\6\uffff\1\1\30\uffff\1\4\1\uffff"+
            "\1\1\20\uffff\1\1\24\uffff\1\1\31\uffff\1\1\5\uffff\1\1\33\uffff"+
            "\1\1\12\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\2\uffff\2\1\2\uffff"+
            "\3\1\4\uffff\1\1\1\uffff\5\1\1\uffff\1\1\5\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\4\1\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\5\1\1\uffff\1\1\3\uffff\3\1\6\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\6\1\2\uffff\2\1\2\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\1\5\uffff\1\1\5\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\2\1\1\uffff\1\1\4\uffff\2\1\1\uffff"+
            "\7\1\3\uffff\2\1\2\uffff\1\1\4\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff\3\1\2\uffff"+
            "\3\1\2\uffff\1\1\1\uffff\1\1\1\uffff\7\1\5\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\4\1\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\5\1\1\uffff\2\1\2\uffff\3\1\6\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\7\1\1\uffff\2\1\2\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\2\1\4\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\2\1\1\uffff\1\1\3\uffff\4\1\1\uffff\2\1\3\uffff\2\1\1\uffff"+
            "\7\1\3\uffff\2\1\2\uffff\1\1\4\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\6\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\1\1\44\uffff\1\4",
            "\1\1\71\uffff\1\4\174\uffff\1\1",
            "\1\4\174\uffff\1\1",
            "\1\4\174\uffff\1\1",
            "\1\1\44\uffff\1\4",
            "\1\4\66\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\2\uffff\2\1\2\uffff"+
            "\3\1\4\uffff\1\1\1\uffff\5\1\1\uffff\1\1\5\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\4\1\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\5\1\1\uffff\1\1\3\uffff\3\1\6\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\6\1\2\uffff\2\1\2\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\1\5\uffff\1\1\5\uffff\1\1\1\uffff\3\1\1\uffff\2\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\2\1\1\uffff\1\1\4\uffff\2\1\1\uffff"+
            "\7\1\3\uffff\2\1\2\uffff\1\1\4\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\3\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff\3\1\2\uffff"+
            "\3\1\2\uffff\1\1\1\uffff\1\1\1\uffff\7\1\5\uffff\3\1\1\uffff"+
            "\1\1\4\uffff\4\1\1\uffff\10\1\1\uffff\1\4\1\uffff\1\1\3\uffff"+
            "\3\1\2\uffff\5\1\1\uffff\2\1\2\uffff\3\1\6\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\12\uffff\3\1\1\uffff\7\1\1\uffff\2\1\2\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff"+
            "\1\1\3\uffff\1\1\1\uffff\2\1\4\uffff\1\1\1\uffff\3\1\1\uffff"+
            "\2\1\1\uffff\1\1\3\uffff\4\1\1\uffff\2\1\3\uffff\2\1\1\uffff"+
            "\7\1\3\uffff\2\1\2\uffff\1\1\4\uffff\1\1\11\uffff\1\1\1\uffff"+
            "\6\1\4\uffff\4\1\1\uffff\4\1\1\uffff\2\1",
            "\1\1\44\uffff\1\4",
            "\1\1\71\uffff\1\4\174\uffff\1\1",
            "\1\4\174\uffff\1\1",
            "\1\4\174\uffff\1\1",
            "\1\1\44\uffff\1\4",
            "\1\4\66\uffff\1\1",
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
            ""
    };

    static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
    static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
    static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
    static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
    static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
    static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
    static final short[][] DFA77_transition;

    static {
        int numStates = DFA77_transitionS.length;
        DFA77_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = DFA77_eot;
            this.eof = DFA77_eof;
            this.min = DFA77_min;
            this.max = DFA77_max;
            this.accept = DFA77_accept;
            this.special = DFA77_special;
            this.transition = DFA77_transition;
        }
        public String getDescription() {
            return "322:10: ( ( AS )? column_alias= id )?";
        }
    }
    static final String DFA76_eotS =
        "\u00d9\uffff";
    static final String DFA76_eofS =
        "\1\uffff\1\2\3\uffff\1\4\1\uffff\7\4\u00cb\uffff";
    static final String DFA76_minS =
        "\2\5\3\uffff\1\5\1\uffff\1\5\1\36\1\11\2\52\1\36\1\52\5\uffff\2"+
        "\5\1\36\1\11\2\103\1\36\1\103\10\uffff\2\5\1\36\1\11\2\103\1\36"+
        "\1\103\u00ae\uffff";
    static final String DFA76_maxS =
        "\2\u00e9\3\uffff\1\u00e9\1\uffff\7\u00e9\5\uffff\2\u00e9\1\103\3"+
        "\u00c0\1\103\1\172\10\uffff\2\u00e9\1\103\3\u00c0\1\103\1\172\u00ae"+
        "\uffff";
    static final String DFA76_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\u00d4\uffff";
    static final String DFA76_specialS =
        "\u00d9\uffff}>";
    static final String[] DFA76_transitionS = {
            "\3\2\1\uffff\2\2\1\uffff\2\2\1\uffff\1\1\1\2\2\uffff\2\2\2\uffff"+
            "\3\2\4\uffff\1\2\1\uffff\5\2\1\uffff\1\2\5\uffff\3\2\1\uffff"+
            "\1\2\4\uffff\4\2\1\uffff\10\2\3\uffff\1\2\3\uffff\3\2\2\uffff"+
            "\5\2\1\uffff\1\2\3\uffff\3\2\6\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\1\2\12\uffff\3\2\1\uffff\6\2\2\uffff\2\2\2\uffff\1\2\4\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff\1\2\7\uffff\1\2\5\uffff"+
            "\1\2\1\uffff\3\2\1\uffff\2\2\1\uffff\1\2\3\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\1\2\4\uffff\2\2\1\uffff\7\2\3\uffff\2\2\2\uffff"+
            "\1\2\4\uffff\1\2\11\uffff\1\2\1\uffff\2\2\1\uffff\3\2\4\uffff"+
            "\4\2\1\uffff\4\2\1\uffff\2\2",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\2\uffff\2\4\2\uffff"+
            "\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\3\uffff\1\2\1\uffff"+
            "\3\4\1\uffff\1\4\4\uffff\4\4\1\uffff\10\4\3\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\1\4\1\13\3\4\1\uffff\1\4\3\uffff\2\4\1\5\6\uffff"+
            "\1\10\1\uffff\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff"+
            "\1\12\1\4\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3"+
            "\uffff\1\15\7\uffff\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\1\4"+
            "\1\14\1\uffff\1\4\3\uffff\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff"+
            "\2\4\1\uffff\7\4\1\2\2\uffff\2\4\1\uffff\1\2\1\4\4\uffff\1\4"+
            "\11\uffff\1\4\1\uffff\2\4\1\uffff\3\4\4\uffff\1\11\3\4\1\uffff"+
            "\4\4\1\uffff\1\4\1\7",
            "",
            "",
            "",
            "\3\2\1\uffff\2\2\1\uffff\2\2\1\uffff\2\2\2\uffff\2\2\2\uffff"+
            "\3\2\4\uffff\1\2\1\uffff\5\2\1\uffff\1\2\3\uffff\1\4\1\uffff"+
            "\3\2\1\uffff\1\2\4\uffff\4\2\1\uffff\10\2\3\uffff\1\2\3\uffff"+
            "\3\2\2\uffff\1\2\1\30\3\2\1\uffff\1\2\3\uffff\2\2\1\23\6\uffff"+
            "\1\25\1\uffff\1\2\1\uffff\1\2\12\uffff\3\2\1\uffff\6\2\2\uffff"+
            "\1\27\1\2\2\uffff\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff\1\2\3"+
            "\uffff\1\32\1\uffff\1\2\5\uffff\1\2\5\uffff\1\2\1\uffff\3\2"+
            "\1\uffff\1\2\1\31\1\uffff\1\2\3\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\1\2\4\uffff\2\2\1\uffff\7\2\1\4\2\uffff\2\2\1\uffff\1\4\1\2"+
            "\4\uffff\1\2\11\uffff\1\2\1\uffff\2\2\1\uffff\3\2\4\uffff\1"+
            "\26\3\2\1\uffff\4\2\1\uffff\1\2\1\24",
            "",
            "\3\2\1\uffff\2\2\1\uffff\2\2\1\uffff\2\2\1\uffff\3\2\2\uffff"+
            "\3\2\2\uffff\1\2\1\uffff\1\2\1\uffff\7\2\3\uffff\1\4\1\uffff"+
            "\3\2\1\uffff\1\2\4\uffff\4\2\1\uffff\10\2\3\uffff\1\2\3\uffff"+
            "\3\2\2\uffff\1\2\1\50\3\2\1\uffff\2\2\2\uffff\2\2\1\43\6\uffff"+
            "\1\45\1\uffff\1\2\1\uffff\1\2\12\uffff\3\2\1\uffff\7\2\1\uffff"+
            "\1\47\1\2\2\uffff\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff\1\2\3"+
            "\uffff\1\52\1\uffff\1\2\3\uffff\1\2\1\uffff\2\2\4\uffff\1\2"+
            "\1\uffff\3\2\1\uffff\1\2\1\51\1\uffff\1\2\3\uffff\4\2\1\uffff"+
            "\2\2\3\uffff\2\2\1\uffff\7\2\1\4\2\uffff\2\2\1\uffff\1\4\1\2"+
            "\4\uffff\1\2\11\uffff\1\2\1\uffff\6\2\4\uffff\1\46\3\2\1\uffff"+
            "\4\2\1\uffff\1\2\1\44",
            "\1\2\13\uffff\1\4\44\uffff\1\4\12\uffff\1\4\6\uffff\1\4\32"+
            "\uffff\1\4\20\uffff\1\4\24\uffff\1\4\31\uffff\1\4\5\uffff\1"+
            "\4\33\uffff\1\4\12\uffff\1\4",
            "\1\2\40\uffff\1\4\44\uffff\1\4\12\uffff\1\4\6\uffff\1\4\32"+
            "\uffff\1\4\20\uffff\1\4\24\uffff\1\4\31\uffff\1\4\3\uffff\1"+
            "\2\1\uffff\1\4\33\uffff\1\4\12\uffff\1\4",
            "\1\4\44\uffff\1\4\12\uffff\1\4\6\uffff\1\4\32\uffff\1\4\20"+
            "\uffff\1\4\24\uffff\1\4\31\uffff\1\4\3\uffff\1\2\1\uffff\1\4"+
            "\33\uffff\1\4\12\uffff\1\4",
            "\1\4\44\uffff\1\4\12\uffff\1\4\6\uffff\1\4\32\uffff\1\4\20"+
            "\uffff\1\4\24\uffff\1\4\31\uffff\1\4\3\uffff\1\2\1\uffff\1\4"+
            "\33\uffff\1\4\12\uffff\1\4",
            "\1\2\13\uffff\1\4\44\uffff\1\4\12\uffff\1\4\6\uffff\1\4\32"+
            "\uffff\1\4\20\uffff\1\4\24\uffff\1\4\31\uffff\1\4\5\uffff\1"+
            "\4\33\uffff\1\4\12\uffff\1\4",
            "\1\4\44\uffff\1\4\12\uffff\1\4\6\uffff\1\4\30\uffff\1\2\1\uffff"+
            "\1\4\20\uffff\1\4\24\uffff\1\4\31\uffff\1\4\5\uffff\1\4\33\uffff"+
            "\1\4\12\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\2\uffff\2\4\2\uffff"+
            "\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\2\1\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff"+
            "\1\4\5\uffff\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff"+
            "\1\4\3\uffff\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff"+
            "\7\4\3\uffff\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\uffff\3\4\2\uffff"+
            "\3\4\2\uffff\1\4\1\uffff\1\4\1\uffff\7\4\5\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\2\1\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\2\4\2\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\7\4\1\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff"+
            "\1\4\3\uffff\1\4\1\uffff\2\4\4\uffff\1\4\1\uffff\3\4\1\uffff"+
            "\2\4\1\uffff\1\4\3\uffff\4\4\1\uffff\2\4\3\uffff\2\4\1\uffff"+
            "\7\4\3\uffff\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\6\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\1\4\44\uffff\1\2",
            "\1\4\71\uffff\1\2\174\uffff\1\4",
            "\1\2\174\uffff\1\4",
            "\1\2\174\uffff\1\4",
            "\1\4\44\uffff\1\2",
            "\1\2\66\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\2\uffff\2\4\2\uffff"+
            "\3\4\4\uffff\1\4\1\uffff\5\4\1\uffff\1\4\5\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\2\1\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\1\4\3\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\6\4\2\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff"+
            "\1\4\5\uffff\1\4\5\uffff\1\4\1\uffff\3\4\1\uffff\2\4\1\uffff"+
            "\1\4\3\uffff\1\4\1\uffff\2\4\1\uffff\1\4\4\uffff\2\4\1\uffff"+
            "\7\4\3\uffff\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\3\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\3\4\1\uffff\2\4\1\uffff\2\4\1\uffff\2\4\1\uffff\3\4\2\uffff"+
            "\3\4\2\uffff\1\4\1\uffff\1\4\1\uffff\7\4\5\uffff\3\4\1\uffff"+
            "\1\4\4\uffff\4\4\1\uffff\10\4\1\uffff\1\2\1\uffff\1\4\3\uffff"+
            "\3\4\2\uffff\5\4\1\uffff\2\4\2\uffff\3\4\6\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\12\uffff\3\4\1\uffff\7\4\1\uffff\2\4\2\uffff"+
            "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff\1\4\1\uffff"+
            "\1\4\3\uffff\1\4\1\uffff\2\4\4\uffff\1\4\1\uffff\3\4\1\uffff"+
            "\2\4\1\uffff\1\4\3\uffff\4\4\1\uffff\2\4\3\uffff\2\4\1\uffff"+
            "\7\4\3\uffff\2\4\2\uffff\1\4\4\uffff\1\4\11\uffff\1\4\1\uffff"+
            "\6\4\4\uffff\4\4\1\uffff\4\4\1\uffff\2\4",
            "\1\4\44\uffff\1\2",
            "\1\4\71\uffff\1\2\174\uffff\1\4",
            "\1\2\174\uffff\1\4",
            "\1\2\174\uffff\1\4",
            "\1\4\44\uffff\1\2",
            "\1\2\66\uffff\1\4",
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
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "322:11: ( AS )?";
        }
    }
    static final String DFA122_eotS =
        "\107\uffff";
    static final String DFA122_eofS =
        "\107\uffff";
    static final String DFA122_minS =
        "\1\43\1\5\7\uffff\4\43\72\uffff";
    static final String DFA122_maxS =
        "\1\u00df\1\u00e9\7\uffff\4\u00df\72\uffff";
    static final String DFA122_acceptS =
        "\2\uffff\1\2\12\uffff\1\1\71\uffff";
    static final String DFA122_specialS =
        "\107\uffff}>";
    static final String[] DFA122_transitionS = {
            "\1\2\6\uffff\1\1\3\uffff\1\2\52\uffff\1\2\121\uffff\1\2\20\uffff"+
            "\1\2\42\uffff\1\2",
            "\3\15\1\uffff\2\15\1\uffff\2\15\1\uffff\2\15\2\uffff\2\15\2"+
            "\uffff\3\15\4\uffff\1\15\1\uffff\3\15\1\13\1\15\7\uffff\2\15"+
            "\1\2\1\uffff\1\15\4\uffff\4\15\1\uffff\10\15\3\uffff\1\15\3"+
            "\uffff\3\15\2\uffff\5\15\1\uffff\1\15\3\uffff\1\15\1\14\1\15"+
            "\3\uffff\1\15\2\uffff\1\15\1\uffff\1\15\1\uffff\1\15\12\uffff"+
            "\12\15\2\uffff\2\15\2\uffff\2\15\3\uffff\1\15\1\uffff\1\15\1"+
            "\uffff\1\15\2\uffff\2\15\4\uffff\1\15\2\uffff\3\15\3\uffff\1"+
            "\15\1\uffff\3\15\1\uffff\2\15\1\uffff\1\15\3\uffff\1\15\1\uffff"+
            "\1\15\1\11\1\uffff\1\15\4\uffff\12\15\3\uffff\2\15\2\uffff\1"+
            "\15\4\uffff\1\15\11\uffff\1\15\1\uffff\2\15\1\uffff\3\15\4\uffff"+
            "\1\15\1\12\2\15\1\uffff\4\15\1\uffff\2\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\15\5\uffff\1\15\3\uffff\1\15\14\uffff\1\15\35\uffff\1\15"+
            "\13\uffff\1\15\41\uffff\1\2\16\uffff\1\15\4\uffff\1\15\17\uffff"+
            "\1\15\7\uffff\1\15\10\uffff\1\15\42\uffff\1\15",
            "\2\15\5\uffff\1\15\3\uffff\1\15\14\uffff\1\15\35\uffff\1\15"+
            "\13\uffff\1\15\51\uffff\1\2\6\uffff\1\15\4\uffff\1\15\17\uffff"+
            "\1\15\7\uffff\1\15\10\uffff\1\15\42\uffff\1\15",
            "\2\15\5\uffff\1\15\3\uffff\1\15\14\uffff\1\15\35\uffff\1\15"+
            "\13\uffff\1\15\51\uffff\1\2\6\uffff\1\15\4\uffff\1\15\17\uffff"+
            "\1\15\7\uffff\1\15\10\uffff\1\15\42\uffff\1\15",
            "\2\15\5\uffff\1\15\3\uffff\1\15\14\uffff\1\15\35\uffff\1\15"+
            "\13\uffff\1\15\41\uffff\1\2\16\uffff\1\15\4\uffff\1\15\17\uffff"+
            "\1\15\7\uffff\1\15\10\uffff\1\15\42\uffff\1\15",
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
            ""
    };

    static final short[] DFA122_eot = DFA.unpackEncodedString(DFA122_eotS);
    static final short[] DFA122_eof = DFA.unpackEncodedString(DFA122_eofS);
    static final char[] DFA122_min = DFA.unpackEncodedStringToUnsignedChars(DFA122_minS);
    static final char[] DFA122_max = DFA.unpackEncodedStringToUnsignedChars(DFA122_maxS);
    static final short[] DFA122_accept = DFA.unpackEncodedString(DFA122_acceptS);
    static final short[] DFA122_special = DFA.unpackEncodedString(DFA122_specialS);
    static final short[][] DFA122_transition;

    static {
        int numStates = DFA122_transitionS.length;
        DFA122_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA122_transition[i] = DFA.unpackEncodedString(DFA122_transitionS[i]);
        }
    }

    class DFA122 extends DFA {

        public DFA122(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 122;
            this.eot = DFA122_eot;
            this.eof = DFA122_eof;
            this.min = DFA122_min;
            this.max = DFA122_max;
            this.accept = DFA122_accept;
            this.special = DFA122_special;
            this.transition = DFA122_transition;
        }
        public String getDescription() {
            return "()* loopback of 386:23: ( COMMA column_def )*";
        }
    }
    static final String DFA127_eotS =
        "\u0179\uffff";
    static final String DFA127_eofS =
        "\1\1\4\uffff\1\12\13\uffff\1\12\22\uffff\1\12\10\uffff\1\12\u014b"+
        "\uffff";
    static final String DFA127_minS =
        "\1\43\2\uffff\1\5\1\u0087\1\43\1\u008f\10\uffff\2\43\1\20\20\uffff"+
        "\1\5\1\u0087\1\43\1\u008f\6\uffff\1\u0087\1\43\1\u008f\30\uffff"+
        "\11\13\2\5\1\13\1\103\2\5\2\103\1\5\u0120\uffff";
    static final String DFA127_maxS =
        "\1\u00df\2\uffff\1\u00e9\1\u0087\1\u00df\1\u008f\10\uffff\3\u00df"+
        "\20\uffff\1\u00e9\1\u0087\1\u00df\1\u008f\6\uffff\1\u0087\1\u00df"+
        "\1\u008f\30\uffff\11\u00c6\2\u00e9\1\u00c6\1\u008f\2\u00e9\1\u008f"+
        "\1\103\1\u00e9\u0120\uffff";
    static final String DFA127_acceptS =
        "\1\uffff\1\2\10\uffff\1\1\116\uffff\1\1\20\uffff\2\1\20\uffff\u00fd"+
        "\1";
    static final String DFA127_specialS =
        "\u0179\uffff}>";
    static final String[] DFA127_transitionS = {
            "\1\6\1\12\5\uffff\1\1\3\uffff\1\3\14\uffff\1\12\35\uffff\1\1"+
            "\74\uffff\1\12\4\uffff\1\12\17\uffff\1\4\7\uffff\1\12\10\uffff"+
            "\1\1\5\uffff\1\1\34\uffff\1\5",
            "",
            "",
            "\3\20\1\uffff\2\20\1\uffff\2\20\1\uffff\2\20\2\uffff\2\20\2"+
            "\uffff\3\20\4\uffff\1\20\1\uffff\5\20\1\uffff\1\20\5\uffff\3"+
            "\20\1\uffff\1\20\4\uffff\4\20\1\uffff\10\20\3\uffff\1\20\3\uffff"+
            "\3\20\2\uffff\5\20\1\uffff\1\20\3\uffff\3\20\6\uffff\1\20\1"+
            "\uffff\1\20\1\uffff\1\17\12\uffff\3\20\1\uffff\6\20\2\uffff"+
            "\2\20\2\uffff\1\20\4\uffff\1\20\1\uffff\1\20\1\uffff\1\20\3"+
            "\uffff\1\20\7\uffff\1\20\5\uffff\1\20\1\uffff\3\20\1\uffff\2"+
            "\20\1\uffff\1\20\3\uffff\1\20\1\uffff\2\20\1\uffff\1\20\4\uffff"+
            "\2\20\1\uffff\7\20\3\uffff\2\20\2\uffff\1\20\4\uffff\1\17\11"+
            "\uffff\1\20\1\uffff\2\20\1\uffff\3\20\4\uffff\4\20\1\uffff\4"+
            "\20\1\uffff\2\20",
            "\1\21",
            "\2\12\5\uffff\1\12\3\uffff\1\12\14\uffff\1\12\35\uffff\1\12"+
            "\65\uffff\1\1\6\uffff\1\12\4\uffff\1\12\3\uffff\1\12\13\uffff"+
            "\1\12\7\uffff\1\12\10\uffff\1\12\5\uffff\1\12\34\uffff\1\12",
            "\1\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45\1\12\26\uffff\1\12\35\uffff\1\1\74\uffff\1\12\4\uffff"+
            "\1\12\17\uffff\1\43\7\uffff\1\12\53\uffff\1\44",
            "\1\56\1\12\26\uffff\1\12\35\uffff\1\1\74\uffff\1\12\4\uffff"+
            "\1\12\17\uffff\1\54\7\uffff\1\12\53\uffff\1\55",
            "\1\12\3\uffff\1\12\16\uffff\2\12\5\uffff\1\12\3\uffff\1\12"+
            "\14\uffff\1\12\3\uffff\1\12\31\uffff\1\12\65\uffff\1\1\6\uffff"+
            "\1\12\4\uffff\1\12\3\uffff\1\12\13\uffff\1\12\7\uffff\1\12\10"+
            "\uffff\1\12\5\uffff\1\12\34\uffff\1\12",
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
            "\3\127\1\uffff\2\127\1\uffff\2\127\1\uffff\2\127\1\uffff\1"+
            "\121\2\127\2\uffff\3\127\2\uffff\1\112\1\uffff\1\127\1\uffff"+
            "\1\127\1\125\1\123\2\127\1\120\1\127\5\uffff\3\127\1\uffff\1"+
            "\127\4\uffff\1\127\1\115\1\114\1\116\1\uffff\10\127\3\uffff"+
            "\1\127\3\uffff\3\127\2\uffff\5\127\1\uffff\1\127\1\110\2\uffff"+
            "\3\127\6\uffff\1\127\1\uffff\1\127\1\uffff\1\122\12\uffff\3"+
            "\127\1\uffff\6\127\1\107\1\uffff\2\127\2\uffff\1\127\4\uffff"+
            "\1\127\1\uffff\1\127\1\uffff\1\127\3\uffff\1\127\1\uffff\1\124"+
            "\3\uffff\1\130\1\uffff\1\127\1\130\4\uffff\1\113\1\uffff\3\127"+
            "\1\uffff\2\127\1\uffff\1\127\3\uffff\1\127\1\130\2\127\1\uffff"+
            "\1\127\1\117\3\uffff\1\126\1\127\1\uffff\7\127\3\uffff\2\127"+
            "\2\uffff\1\127\4\uffff\1\111\11\uffff\1\127\1\uffff\2\127\1"+
            "\130\3\127\4\uffff\4\127\1\uffff\4\127\1\uffff\2\127",
            "\1\131",
            "\2\12\5\uffff\1\12\3\uffff\1\12\14\uffff\1\12\35\uffff\1\12"+
            "\65\uffff\1\1\6\uffff\1\12\4\uffff\1\12\3\uffff\1\12\13\uffff"+
            "\1\12\7\uffff\1\12\10\uffff\1\12\5\uffff\1\12\34\uffff\1\12",
            "\1\152",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\153",
            "\2\12\5\uffff\1\12\3\uffff\1\12\14\uffff\1\12\35\uffff\1\12"+
            "\65\uffff\1\1\6\uffff\1\12\4\uffff\1\12\3\uffff\1\12\13\uffff"+
            "\1\12\7\uffff\1\12\10\uffff\1\12\5\uffff\1\12\34\uffff\1\12",
            "\1\174",
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
            "",
            "\1\u0081\1\uffff\1\u008c\3\uffff\1\177\7\uffff\1\u008a\12\uffff"+
            "\1\175\37\uffff\1\176\7\uffff\1\u0086\1\u008b\20\uffff\1\u0084"+
            "\2\u0082\22\uffff\1\u0085\14\uffff\1\u0089\1\u0087\10\uffff"+
            "\2\u0082\1\u0084\5\uffff\1\u0084\1\u0080\2\uffff\1\u0083\1\u0088"+
            "\2\u008b\7\uffff\1\u008d\4\uffff\1\177\1\u0081\1\uffff\1\u0080"+
            "\12\uffff\1\u0084\7\uffff\1\u008e\7\uffff\2\u0081\1\177",
            "\1\u0093\1\uffff\1\u009e\3\uffff\1\u0091\7\uffff\1\u009c\12"+
            "\uffff\1\u008f\37\uffff\1\u0090\7\uffff\1\u0098\1\u009d\20\uffff"+
            "\1\u0096\2\u0094\22\uffff\1\u0097\14\uffff\1\u009b\1\u0099\10"+
            "\uffff\2\u0094\1\u0096\5\uffff\1\u0096\1\u0092\2\uffff\1\u0095"+
            "\1\u009a\2\u009d\7\uffff\1\u009f\4\uffff\1\u0091\1\u0093\1\uffff"+
            "\1\u0092\12\uffff\1\u0096\7\uffff\1\u00a0\7\uffff\2\u0093\1"+
            "\u0091",
            "\1\u00a5\1\uffff\1\u00b0\3\uffff\1\u00a3\7\uffff\1\u00ae\12"+
            "\uffff\1\u00a1\36\uffff\1\u00b3\1\u00a2\7\uffff\1\u00aa\1\u00af"+
            "\20\uffff\1\u00a8\2\u00a6\22\uffff\1\u00a9\14\uffff\1\u00ad"+
            "\1\u00ab\10\uffff\2\u00a6\1\u00a8\5\uffff\1\u00a8\1\u00a4\2"+
            "\uffff\1\u00a7\1\u00ac\2\u00af\7\uffff\1\u00b1\4\uffff\1\u00a3"+
            "\1\u00a5\1\uffff\1\u00a4\12\uffff\1\u00a8\7\uffff\1\u00b2\7"+
            "\uffff\2\u00a5\1\u00a3",
            "\1\u00b8\1\uffff\1\u00c3\3\uffff\1\u00b6\7\uffff\1\u00c1\12"+
            "\uffff\1\u00b4\37\uffff\1\u00b5\7\uffff\1\u00bd\1\u00c2\20\uffff"+
            "\1\u00bb\2\u00b9\22\uffff\1\u00bc\14\uffff\1\u00c0\1\u00be\10"+
            "\uffff\2\u00b9\1\u00bb\5\uffff\1\u00bb\1\u00b7\2\uffff\1\u00ba"+
            "\1\u00bf\2\u00c2\7\uffff\1\u00c4\4\uffff\1\u00b6\1\u00b8\1\uffff"+
            "\1\u00b7\12\uffff\1\u00bb\7\uffff\1\u00c5\7\uffff\2\u00b8\1"+
            "\u00b6",
            "\1\u00ca\1\uffff\1\u00d5\3\uffff\1\u00c8\7\uffff\1\u00d3\12"+
            "\uffff\1\u00c6\36\uffff\1\u00d8\1\u00c7\7\uffff\1\u00cf\1\u00d4"+
            "\20\uffff\1\u00cd\2\u00cb\22\uffff\1\u00ce\14\uffff\1\u00d2"+
            "\1\u00d0\10\uffff\2\u00cb\1\u00cd\5\uffff\1\u00cd\1\u00c9\2"+
            "\uffff\1\u00cc\1\u00d1\2\u00d4\7\uffff\1\u00d6\4\uffff\1\u00c8"+
            "\1\u00ca\1\uffff\1\u00c9\12\uffff\1\u00cd\7\uffff\1\u00d7\7"+
            "\uffff\2\u00ca\1\u00c8",
            "\1\u00dd\1\uffff\1\u00e8\3\uffff\1\u00db\7\uffff\1\u00e6\12"+
            "\uffff\1\u00d9\36\uffff\1\u00eb\1\u00da\7\uffff\1\u00e2\1\u00e7"+
            "\20\uffff\1\u00e0\2\u00de\22\uffff\1\u00e1\14\uffff\1\u00e5"+
            "\1\u00e3\10\uffff\2\u00de\1\u00e0\5\uffff\1\u00e0\1\u00dc\2"+
            "\uffff\1\u00df\1\u00e4\2\u00e7\7\uffff\1\u00e9\4\uffff\1\u00db"+
            "\1\u00dd\1\uffff\1\u00dc\12\uffff\1\u00e0\7\uffff\1\u00ea\7"+
            "\uffff\2\u00dd\1\u00db",
            "\1\u00f0\1\uffff\1\u00fb\3\uffff\1\u00ee\7\uffff\1\u00f9\12"+
            "\uffff\1\u00ec\36\uffff\1\u00fe\1\u00ed\7\uffff\1\u00f5\1\u00fa"+
            "\20\uffff\1\u00f3\2\u00f1\22\uffff\1\u00f4\14\uffff\1\u00f8"+
            "\1\u00f6\10\uffff\2\u00f1\1\u00f3\5\uffff\1\u00f3\1\u00ef\2"+
            "\uffff\1\u00f2\1\u00f7\2\u00fa\7\uffff\1\u00fc\4\uffff\1\u00ee"+
            "\1\u00f0\1\uffff\1\u00ef\12\uffff\1\u00f3\7\uffff\1\u00fd\7"+
            "\uffff\2\u00f0\1\u00ee",
            "\1\u0103\1\uffff\1\u010e\3\uffff\1\u0101\7\uffff\1\u010c\12"+
            "\uffff\1\u00ff\36\uffff\1\u0111\1\u0100\7\uffff\1\u0108\1\u010d"+
            "\20\uffff\1\u0106\2\u0104\22\uffff\1\u0107\14\uffff\1\u010b"+
            "\1\u0109\10\uffff\2\u0104\1\u0106\5\uffff\1\u0106\1\u0102\2"+
            "\uffff\1\u0105\1\u010a\2\u010d\7\uffff\1\u010f\4\uffff\1\u0101"+
            "\1\u0103\1\uffff\1\u0102\12\uffff\1\u0106\7\uffff\1\u0110\7"+
            "\uffff\2\u0103\1\u0101",
            "\1\u0117\1\uffff\1\u0122\3\uffff\1\u0115\7\uffff\1\u0120\12"+
            "\uffff\1\u0113\37\uffff\1\u0114\7\uffff\1\u011c\1\u0121\20\uffff"+
            "\1\u011a\2\u0118\22\uffff\1\u011b\6\uffff\1\u0112\5\uffff\1"+
            "\u011f\1\u011d\10\uffff\2\u0118\1\u011a\5\uffff\1\u011a\1\u0116"+
            "\2\uffff\1\u0119\1\u011e\2\u0121\7\uffff\1\u0123\4\uffff\1\u0115"+
            "\1\u0117\1\uffff\1\u0116\12\uffff\1\u011a\7\uffff\1\u0124\7"+
            "\uffff\2\u0117\1\u0115",
            "\3\u0126\1\uffff\2\u0126\1\uffff\2\u0126\1\uffff\2\u0126\2"+
            "\uffff\2\u0126\2\uffff\3\u0126\4\uffff\1\u0126\1\uffff\5\u0126"+
            "\1\uffff\1\u0126\5\uffff\3\u0126\1\uffff\1\u0126\4\uffff\4\u0126"+
            "\1\uffff\10\u0126\3\uffff\1\u0126\3\uffff\3\u0126\2\uffff\5"+
            "\u0126\1\uffff\1\u0126\3\uffff\3\u0126\6\uffff\1\u0126\1\uffff"+
            "\1\u0126\1\uffff\1\u0125\12\uffff\3\u0126\1\uffff\6\u0126\2"+
            "\uffff\2\u0126\2\uffff\1\u0126\4\uffff\1\u0126\1\uffff\1\u0126"+
            "\1\uffff\1\u0126\3\uffff\1\u0126\7\uffff\1\u0126\5\uffff\1\u0126"+
            "\1\uffff\3\u0126\1\uffff\2\u0126\1\uffff\1\u0126\3\uffff\1\u0126"+
            "\1\uffff\2\u0126\1\uffff\1\u0126\4\uffff\2\u0126\1\uffff\7\u0126"+
            "\3\uffff\2\u0126\2\uffff\1\u0126\4\uffff\1\u0125\11\uffff\1"+
            "\u0126\1\uffff\2\u0126\1\uffff\3\u0126\4\uffff\4\u0126\1\uffff"+
            "\4\u0126\1\uffff\2\u0126",
            "\3\u0128\1\uffff\2\u0128\1\uffff\2\u0128\1\uffff\2\u0128\2"+
            "\uffff\2\u0128\2\uffff\3\u0128\4\uffff\1\u0128\1\uffff\5\u0128"+
            "\1\uffff\1\u0128\5\uffff\3\u0128\1\uffff\1\u0128\4\uffff\4\u0128"+
            "\1\uffff\10\u0128\3\uffff\1\u0128\3\uffff\3\u0128\2\uffff\5"+
            "\u0128\1\uffff\1\u0128\3\uffff\3\u0128\6\uffff\1\u0128\1\uffff"+
            "\1\u0128\1\uffff\1\u0127\12\uffff\3\u0128\1\uffff\6\u0128\2"+
            "\uffff\2\u0128\2\uffff\1\u0128\4\uffff\1\u0128\1\uffff\1\u0128"+
            "\1\uffff\1\u0128\3\uffff\1\u0128\7\uffff\1\u0128\5\uffff\1\u0128"+
            "\1\uffff\3\u0128\1\uffff\2\u0128\1\uffff\1\u0128\3\uffff\1\u0128"+
            "\1\uffff\2\u0128\1\uffff\1\u0128\4\uffff\2\u0128\1\uffff\7\u0128"+
            "\3\uffff\2\u0128\2\uffff\1\u0128\4\uffff\1\u0127\11\uffff\1"+
            "\u0128\1\uffff\2\u0128\1\uffff\3\u0128\4\uffff\4\u0128\1\uffff"+
            "\4\u0128\1\uffff\2\u0128",
            "\1\u012f\1\uffff\1\u013a\3\uffff\1\u012d\7\uffff\1\u0138\12"+
            "\uffff\1\u012b\36\uffff\1\u012a\1\u012c\7\uffff\1\u0134\1\u0139"+
            "\20\uffff\1\u0132\2\u0130\22\uffff\1\u0133\14\uffff\1\u0137"+
            "\1\u0135\10\uffff\2\u0130\1\u0132\2\uffff\1\u0129\2\uffff\1"+
            "\u0132\1\u012e\2\uffff\1\u0131\1\u0136\2\u0139\7\uffff\1\u013b"+
            "\4\uffff\1\u012d\1\u012f\1\uffff\1\u012e\12\uffff\1\u0132\7"+
            "\uffff\1\u013c\7\uffff\2\u012f\1\u012d",
            "\1\u013e\113\uffff\1\u013d",
            "\3\u014f\1\uffff\2\u014f\1\uffff\2\u014f\1\uffff\2\u014f\1"+
            "\uffff\1\u0149\2\u014f\2\uffff\3\u014f\2\uffff\1\u0142\1\uffff"+
            "\1\u014f\1\uffff\1\u014f\1\u014d\1\u014b\2\u014f\1\u0148\1\u014f"+
            "\5\uffff\3\u014f\1\uffff\1\u014f\4\uffff\1\u014f\1\u0145\1\u0144"+
            "\1\u0146\1\uffff\10\u014f\3\uffff\1\u014f\3\uffff\3\u014f\2"+
            "\uffff\5\u014f\1\uffff\1\u014f\1\u0140\2\uffff\3\u014f\6\uffff"+
            "\1\u014f\1\uffff\1\u014f\1\uffff\1\u014a\12\uffff\3\u014f\1"+
            "\uffff\6\u014f\1\u013f\1\uffff\2\u014f\2\uffff\1\u014f\4\uffff"+
            "\1\u014f\1\uffff\1\u014f\1\uffff\1\u014f\3\uffff\1\u014f\1\uffff"+
            "\1\u014c\3\uffff\1\u0150\1\uffff\1\u014f\1\u0150\4\uffff\1\u0143"+
            "\1\uffff\3\u014f\1\uffff\2\u014f\1\uffff\1\u014f\3\uffff\1\u014f"+
            "\1\u0150\2\u014f\1\uffff\1\u014f\1\u0147\3\uffff\1\u014e\1\u014f"+
            "\1\uffff\7\u014f\3\uffff\2\u014f\2\uffff\1\u014f\4\uffff\1\u0141"+
            "\11\uffff\1\u014f\1\uffff\2\u014f\1\u0150\3\u014f\4\uffff\4"+
            "\u014f\1\uffff\4\u014f\1\uffff\2\u014f",
            "\3\u0164\1\uffff\2\u0164\1\uffff\2\u0164\1\uffff\2\u0164\1"+
            "\uffff\1\u015c\2\u0164\2\uffff\3\u0164\2\uffff\1\u0155\1\uffff"+
            "\1\u0164\1\uffff\1\u0164\1\u0160\1\u015e\2\u0164\1\u015b\1\u0164"+
            "\5\uffff\3\u0164\1\uffff\1\u0164\4\uffff\1\u0164\1\u0158\1\u0157"+
            "\1\u0159\1\uffff\10\u0164\1\uffff\1\u0151\1\uffff\1\u0164\3"+
            "\uffff\3\u0164\2\uffff\5\u0164\1\uffff\1\u0164\1\u0153\2\uffff"+
            "\3\u0164\6\uffff\1\u0164\1\uffff\1\u0164\1\uffff\1\u015d\12"+
            "\uffff\3\u0164\1\uffff\6\u0164\1\u0152\1\uffff\2\u0164\2\uffff"+
            "\1\u0164\4\uffff\1\u0164\1\uffff\1\u0164\1\uffff\1\u0164\3\uffff"+
            "\1\u0164\1\uffff\1\u015f\3\uffff\1\u0163\1\uffff\1\u0164\1\u0163"+
            "\4\uffff\1\u0156\1\uffff\3\u0164\1\uffff\2\u0164\1\uffff\1\u0164"+
            "\3\uffff\1\u0164\1\u0163\2\u0164\1\uffff\1\u0164\1\u015a\3\uffff"+
            "\1\u0161\1\u0164\1\uffff\7\u0164\3\uffff\2\u0164\2\uffff\1\u0164"+
            "\4\uffff\1\u0154\11\uffff\1\u0164\1\uffff\2\u0164\1\u0163\3"+
            "\u0164\4\uffff\4\u0164\1\uffff\4\u0164\1\uffff\1\u0162\1\u0164",
            "\1\u0166\113\uffff\1\u0165",
            "\1\u0167",
            "\3\u0178\1\uffff\2\u0178\1\uffff\2\u0178\1\uffff\2\u0178\1"+
            "\uffff\1\u0172\2\u0178\2\uffff\3\u0178\2\uffff\1\u016b\1\uffff"+
            "\1\u0178\1\uffff\1\u0178\1\u0176\1\u0174\2\u0178\1\u0171\1\u0178"+
            "\5\uffff\3\u0178\1\uffff\1\u0178\4\uffff\1\u0178\1\u016e\1\u016d"+
            "\1\u016f\1\uffff\10\u0178\3\uffff\1\u0178\3\uffff\3\u0178\2"+
            "\uffff\5\u0178\1\uffff\1\u0178\1\u0169\2\uffff\3\u0178\6\uffff"+
            "\1\u0178\1\uffff\1\u0178\1\uffff\1\u0173\12\uffff\3\u0178\1"+
            "\uffff\6\u0178\1\u0168\1\uffff\2\u0178\2\uffff\1\u0178\4\uffff"+
            "\1\u0178\1\uffff\1\u0178\1\uffff\1\u0178\3\uffff\1\u0178\1\uffff"+
            "\1\u0175\5\uffff\1\u0178\5\uffff\1\u016c\1\uffff\3\u0178\1\uffff"+
            "\2\u0178\1\uffff\1\u0178\3\uffff\1\u0178\1\uffff\2\u0178\1\uffff"+
            "\1\u0178\1\u0170\3\uffff\1\u0177\1\u0178\1\uffff\7\u0178\3\uffff"+
            "\2\u0178\2\uffff\1\u0178\4\uffff\1\u016a\11\uffff\1\u0178\1"+
            "\uffff\2\u0178\1\uffff\3\u0178\4\uffff\4\u0178\1\uffff\4\u0178"+
            "\1\uffff\2\u0178",
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
            ""
    };

    static final short[] DFA127_eot = DFA.unpackEncodedString(DFA127_eotS);
    static final short[] DFA127_eof = DFA.unpackEncodedString(DFA127_eofS);
    static final char[] DFA127_min = DFA.unpackEncodedStringToUnsignedChars(DFA127_minS);
    static final char[] DFA127_max = DFA.unpackEncodedStringToUnsignedChars(DFA127_maxS);
    static final short[] DFA127_accept = DFA.unpackEncodedString(DFA127_acceptS);
    static final short[] DFA127_special = DFA.unpackEncodedString(DFA127_specialS);
    static final short[][] DFA127_transition;

    static {
        int numStates = DFA127_transitionS.length;
        DFA127_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA127_transition[i] = DFA.unpackEncodedString(DFA127_transitionS[i]);
        }
    }

    class DFA127 extends DFA {

        public DFA127(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 127;
            this.eot = DFA127_eot;
            this.eof = DFA127_eof;
            this.min = DFA127_min;
            this.max = DFA127_max;
            this.accept = DFA127_accept;
            this.special = DFA127_special;
            this.transition = DFA127_transition;
        }
        public String getDescription() {
            return "()* loopback of 391:43: ( column_constraint )*";
        }
    }
 

    public static final BitSet FOLLOW_sql_stmt_in_sql_stmt_list223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_sql_stmt_list226 = new BitSet(new long[]{0x4001100001081400L,0x0100000000040821L,0x8560040000000000L,0x0000000900000001L});
    public static final BitSet FOLLOW_sql_stmt_in_sql_stmt_list230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_sql_stmt_list232 = new BitSet(new long[]{0x4001100001081400L,0x0100000000040821L,0x8560040000000000L,0x0000000900000001L});
    public static final BitSet FOLLOW_EOF_in_sql_stmt_list240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_stmt_in_sql_stmt_itself248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_sql_stmt_itself251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_sql_stmt_itself256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPLAIN_in_sql_stmt265 = new BitSet(new long[]{0x4001100001081400L,0x0100000000000821L,0x8560240000000000L,0x0000000900000001L});
    public static final BitSet FOLLOW_QUERY_in_sql_stmt268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_PLAN_in_sql_stmt270 = new BitSet(new long[]{0x4001100001081400L,0x0100000000000821L,0x8560040000000000L,0x0000000900000001L});
    public static final BitSet FOLLOW_sql_stmt_core_in_sql_stmt276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_stmt_in_sql_stmt_core286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attach_stmt_in_sql_stmt_core292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_detach_stmt_in_sql_stmt_core298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_analyze_stmt_in_sql_stmt_core304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reindex_stmt_in_sql_stmt_core310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vacuum_stmt_in_sql_stmt_core316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_sql_stmt_core323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_stmt_in_sql_stmt_core329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_stmt_in_sql_stmt_core335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_stmt_in_sql_stmt_core341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_stmt_in_sql_stmt_core347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commit_stmt_in_sql_stmt_core353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_stmt_in_sql_stmt_core359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_savepoint_stmt_in_sql_stmt_core365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_release_stmt_in_sql_stmt_core371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_virtual_table_stmt_in_sql_stmt_core378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_stmt_in_sql_stmt_core384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_table_stmt_in_sql_stmt_core390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_table_stmt_in_sql_stmt_core396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_view_stmt_in_sql_stmt_core402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_view_stmt_in_sql_stmt_core408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_index_stmt_in_sql_stmt_core414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_index_stmt_in_sql_stmt_core420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_trigger_stmt_in_sql_stmt_core426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_trigger_stmt_in_sql_stmt_core432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_virtual_table_stmt_in_schema_create_table_stmt442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_stmt_in_schema_create_table_stmt446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_qualified_table_name456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_qualified_table_name458 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_qualified_table_name464 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name467 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_BY_in_qualified_table_name469 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_qualified_table_name473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_qualified_table_name477 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_subexpr_in_expr488 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_OR_in_expr491 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_or_subexpr_in_expr494 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr503 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_AND_in_or_subexpr506 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr509 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr518 = new BitSet(new long[]{0x0000000002000002L,0x0008000040003000L,0x0010000003C41003L});
    public static final BitSet FOLLOW_cond_expr_in_and_subexpr520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr532 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x0010000000041000L});
    public static final BitSet FOLLOW_match_op_in_cond_expr535 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr539 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_ESCAPE_in_cond_expr542 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr574 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_IN_in_cond_expr577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_cond_expr579 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_cond_expr581 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_cond_expr584 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_cond_expr586 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_cond_expr590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr612 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_IN_in_cond_expr615 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_cond_expr620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_cond_expr622 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_cond_expr628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr656 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_IN_in_cond_expr659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_cond_expr662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_select_stmt_in_cond_expr665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_cond_expr668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_EQUALS_in_cond_expr678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_cond_expr681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_select_stmt_in_cond_expr684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_cond_expr687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISNULL_in_cond_expr695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTNULL_in_cond_expr703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_cond_expr711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_NULL_in_cond_expr713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_NULL_in_cond_expr723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_cond_expr731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_NOT_in_cond_expr733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_NULL_in_cond_expr735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_cond_expr746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_NOT_in_cond_expr748 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr757 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_BETWEEN_in_cond_expr760 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr764 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_AND_in_cond_expr766 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_cond_expr796 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr813 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L,0x0000000003000000L});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr846 = new BitSet(new long[]{0x0000000000000002L,0x0000000180000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_set_in_eq_subexpr849 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr866 = new BitSet(new long[]{0x0000000000000002L,0x0000000180000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr875 = new BitSet(new long[]{0x0000000000000802L,0x0000000000000000L,0x0000008000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_neq_subexpr878 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr895 = new BitSet(new long[]{0x0000000000000802L,0x0000000000000000L,0x0000008000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr904 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000020000080000L});
    public static final BitSet FOLLOW_set_in_bit_subexpr907 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr916 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000020000080000L});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr925 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000000L,0x0000004000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_add_subexpr928 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr941 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000000L,0x0000004000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr950 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_DOUBLE_PIPE_in_mul_subexpr953 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr956 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_unary_subexpr_in_con_subexpr965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_op_in_con_subexpr969 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6D16E820A2A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_unary_subexpr_in_con_subexpr971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expr_in_unary_subexpr1005 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_COLLATE_in_unary_subexpr1008 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_ID_in_unary_subexpr1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_atom_expr1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_parameter_in_atom_expr1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_atom_expr1041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_atom_expr1043 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_atom_expr1049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_atom_expr1051 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_ID_in_atom_expr1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom_expr1086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1088 = new BitSet(new long[]{0xFDE1707F539FB6E0L,0x37F7002A0737CE23L,0x9FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_DISTINCT_in_atom_expr1091 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_atom_expr1096 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_atom_expr1099 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_atom_expr1103 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_ASTERISK_in_atom_expr1109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1138 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_atom_expr1141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_atom_expr1150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1153 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_atom_expr1156 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_AS_in_atom_expr1158 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_type_name_in_atom_expr1161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_atom_expr1172 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_atom_expr1177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_when_expr_in_atom_expr1181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ELSE_in_atom_expr1185 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_atom_expr1189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_END_in_atom_expr1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_function_in_atom_expr1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHEN_in_when_expr1226 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_when_expr1230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_THEN_in_when_expr1232 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_when_expr1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_literal_value1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal_value1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal_value1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOB_in_literal_value1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal_value1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIME_in_literal_value1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_DATE_in_literal_value1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIMESTAMP_in_literal_value1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter1379 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_bind_parameter1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_bind_parameter1398 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_bind_parameter1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_bind_parameter1417 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_bind_parameter1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raise_function1442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_raise_function1445 = new BitSet(new long[]{0x0000000000000020L,0x0002000000100000L,0x0400000000000000L});
    public static final BitSet FOLLOW_IGNORE_in_raise_function1449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_set_in_raise_function1453 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_COMMA_in_raise_function1465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_STRING_in_raise_function1470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_raise_function1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_name1483 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_type_name1487 = new BitSet(new long[]{0x0000000000000000L,0x0400000000200000L,0x0000020000080000L});
    public static final BitSet FOLLOW_signed_number_in_type_name1491 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_type_name1494 = new BitSet(new long[]{0x0000000000000000L,0x0400000000200000L,0x0000020000080000L});
    public static final BitSet FOLLOW_signed_number_in_type_name1498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_name1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_number1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma_stmt1556 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_pragma_stmt1561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_pragma_stmt1563 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_pragma_stmt1569 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L,0x0000000000008000L});
    public static final BitSet FOLLOW_EQUALS_in_pragma_stmt1572 = new BitSet(new long[]{0x0000000000000000L,0x0400002000200000L,0x0000020000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pragma_stmt1578 = new BitSet(new long[]{0x0000000000000000L,0x0400002000200000L,0x0000020000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_pragma_stmt1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_number_in_pragma_value1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pragma_value1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_pragma_value1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTACH_in_attach_stmt1655 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_DATABASE_in_attach_stmt1658 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_attach_stmt1664 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_AS_in_attach_stmt1666 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_attach_stmt1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETACH_in_detach_stmt1678 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_DATABASE_in_detach_stmt1681 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_detach_stmt1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANALYZE_in_analyze_stmt1695 = new BitSet(new long[]{0xFDE1705F4399B6E2L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_analyze_stmt1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_analyze_stmt1706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_analyze_stmt1708 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_analyze_stmt1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REINDEX_in_reindex_stmt1722 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_reindex_stmt1727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_reindex_stmt1729 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_reindex_stmt1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VACUUM_in_vacuum_stmt1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_operation_conflict_clause1754 = new BitSet(new long[]{0x0000000000000020L,0x0002000000100000L,0x0500000000000000L});
    public static final BitSet FOLLOW_set_in_operation_conflict_clause1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_ordering_term1781 = new BitSet(new long[]{0x8000000000010002L});
    public static final BitSet FOLLOW_ASC_in_ordering_term1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_ordering_term1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_operation_limited_clause1820 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_BY_in_operation_limited_clause1822 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1824 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_operation_limited_clause1827 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1829 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_LIMIT_in_operation_limited_clause1837 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1841 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_set_in_operation_limited_clause1844 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_list_in_select_stmt1864 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400002000L});
    public static final BitSet FOLLOW_ORDER_in_select_stmt1869 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_BY_in_select_stmt1871 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1873 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1876 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1878 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_LIMIT_in_select_stmt1887 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1891 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_OFFSET_in_select_stmt1895 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1899 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_core_in_select_list1949 = new BitSet(new long[]{0x0000000000000002L,0x1000000000008000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_select_op_in_select_list1952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_select_core_in_select_list1955 = new BitSet(new long[]{0x0000000000000002L,0x1000000000008000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_UNION_in_select_op1964 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ALL_in_select_op1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERSECT_in_select_op1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_select_op1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_core1987 = new BitSet(new long[]{0xFDE1707F539FB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_ALL_in_select_core1990 = new BitSet(new long[]{0xFDE1707F539FB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_DISTINCT_in_select_core1994 = new BitSet(new long[]{0xFDE1707F539FB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_result_column_in_select_core1998 = new BitSet(new long[]{0x0000040000000002L,0x0000000204000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core2001 = new BitSet(new long[]{0xFDE1707F539FB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_result_column_in_select_core2003 = new BitSet(new long[]{0x0000040000000002L,0x0000000204000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_FROM_in_select_core2008 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E820A2A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_join_source_in_select_core2010 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_WHERE_in_select_core2015 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_select_core2019 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_GROUP_in_select_core2027 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_BY_in_select_core2029 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_ordering_term_in_select_core2031 = new BitSet(new long[]{0x0000040000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core2034 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_ordering_term_in_select_core2036 = new BitSet(new long[]{0x0000040000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_HAVING_in_select_core2041 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_select_core2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_result_column2123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_result_column2125 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_result_column2142 = new BitSet(new long[]{0xFDE1705F4399B6E2L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_AS_in_result_column2146 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_result_column2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_source_in_join_source2173 = new BitSet(new long[]{0x0020040000000002L,0x0080000000000000L,0x0000001000200220L});
    public static final BitSet FOLLOW_join_op_in_join_source2176 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E820A2A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_single_source_in_join_source2179 = new BitSet(new long[]{0x0020040000000002L,0x0080000000000000L,0x0000001080200220L,0x0000000200000000L});
    public static final BitSet FOLLOW_join_constraint_in_join_source2182 = new BitSet(new long[]{0x0020040000000002L,0x0080000000000000L,0x0000001000200220L});
    public static final BitSet FOLLOW_id_in_single_source2199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_single_source2201 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_ID_in_single_source2207 = new BitSet(new long[]{0x0000000000008002L,0x0020002000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_AS_in_single_source2211 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_ID_in_single_source2217 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_INDEXED_in_single_source2222 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_BY_in_single_source2224 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_single_source2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_single_source2232 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_INDEXED_in_single_source2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source2275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_select_stmt_in_single_source2277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source2279 = new BitSet(new long[]{0x0000000000008002L,0x0000002000000000L});
    public static final BitSet FOLLOW_AS_in_single_source2283 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_ID_in_single_source2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source2311 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E820A2A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_join_source_in_single_source2314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_join_op2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATURAL_in_join_op2334 = new BitSet(new long[]{0x0020000000000000L,0x0080000000000000L,0x0000001000000220L});
    public static final BitSet FOLLOW_LEFT_in_join_op2340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000020L});
    public static final BitSet FOLLOW_OUTER_in_join_op2345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_INNER_in_join_op2351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_CROSS_in_join_op2355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_JOIN_in_join_op2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_join_constraint2369 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_join_constraint2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_join_constraint2378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_join_constraint2380 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_join_constraint2384 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_join_constraint2387 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_join_constraint2391 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_join_constraint2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_stmt2414 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_operation_conflict_clause_in_insert_stmt2417 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_REPLACE_in_insert_stmt2423 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_INTO_in_insert_stmt2426 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_insert_stmt2431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_insert_stmt2433 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_insert_stmt2439 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000008000L,0x0000001000000001L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt2446 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_insert_stmt2450 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt2453 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_insert_stmt2457 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt2461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000001L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt2470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt2472 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_insert_stmt2476 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt2479 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_insert_stmt2483 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_insert_stmt2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_insert_stmt2498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_stmt2510 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_operation_conflict_clause_in_update_stmt2513 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_qualified_table_name_in_update_stmt2517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_update_stmt2521 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_update_set_in_update_stmt2525 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0000000400002000L,0x0000020000000000L});
    public static final BitSet FOLLOW_COMMA_in_update_stmt2528 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_update_set_in_update_stmt2532 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0000000400002000L,0x0000020000000000L});
    public static final BitSet FOLLOW_WHERE_in_update_stmt2537 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_update_stmt2539 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400002000L});
    public static final BitSet FOLLOW_operation_limited_clause_in_update_stmt2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_update_set2555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_EQUALS_in_update_set2557 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_update_set2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_stmt2567 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_FROM_in_delete_stmt2569 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_qualified_table_name_in_delete_stmt2571 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400002000L,0x0000020000000000L});
    public static final BitSet FOLLOW_WHERE_in_delete_stmt2574 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_delete_stmt2576 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400002000L});
    public static final BitSet FOLLOW_operation_limited_clause_in_delete_stmt2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_begin_stmt2591 = new BitSet(new long[]{0x2000000000000002L,0x0004000000010000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_begin_stmt2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_commit_stmt2617 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_commit_stmt2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_stmt2636 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_TRANSACTION_in_rollback_stmt2639 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_TO_in_rollback_stmt2644 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_SAVEPOINT_in_rollback_stmt2647 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_rollback_stmt2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVEPOINT_in_savepoint_stmt2663 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_savepoint_stmt2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASE_in_release_stmt2675 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_SAVEPOINT_in_release_stmt2678 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_release_stmt2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_table_conflict_clause2696 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_CONFLICT_in_table_conflict_clause2699 = new BitSet(new long[]{0x0000000000000020L,0x0002000000100000L,0x0500000000000000L});
    public static final BitSet FOLLOW_set_in_table_conflict_clause2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_virtual_table_stmt2729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_VIRTUAL_in_create_virtual_table_stmt2731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_TABLE_in_create_virtual_table_stmt2733 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_create_virtual_table_stmt2740 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_USING_in_create_virtual_table_stmt2750 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2754 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_create_virtual_table_stmt2757 = new BitSet(new long[]{0xFDE1301F4399B6E0L,0x33FF002A4717CE23L,0x8FFC2D16E8E432A3L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2759 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_create_virtual_table_stmt2762 = new BitSet(new long[]{0xFDE1301F4399B6E0L,0x33FF002A4717CE23L,0x8FFC2D16E8E432A3L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2764 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_virtual_table_stmt2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_table_stmt2814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000140000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_table_stmt2816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_TABLE_in_create_table_stmt2819 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_IF_in_create_table_stmt2822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_NOT_in_create_table_stmt2824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_EXISTS_in_create_table_stmt2826 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_table_stmt2833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_create_table_stmt2835 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_table_stmt2841 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_create_table_stmt2847 = new BitSet(new long[]{0xFDE1301F4399B6E0L,0x33FF002A4717CE23L,0x8FFC2D16E8E432A3L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2849 = new BitSet(new long[]{0x0000440800000000L,0x0000000002000000L,0x1000080000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2852 = new BitSet(new long[]{0xFDE1301F4399B6E0L,0x33FF002A4717CE23L,0x8FFC2D16E8E432A3L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2854 = new BitSet(new long[]{0x0000440800000000L,0x0000000002000000L,0x1000080000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2859 = new BitSet(new long[]{0x0000400800000000L,0x0000000002000000L,0x0000080000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_table_constraint_in_create_table_stmt2862 = new BitSet(new long[]{0x0000440800000000L,0x0000000002000000L,0x1000080000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_table_stmt2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_table_stmt2872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_select_stmt_in_create_table_stmt2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_column_def_in_column_def2930 = new BitSet(new long[]{0x0800401800000002L,0x0000002000000000L,0x0008080008400000L,0x0000000080000000L});
    public static final BitSet FOLLOW_type_name_in_column_def2932 = new BitSet(new long[]{0x0800401800000002L,0x0000000000000000L,0x0008080008400000L,0x0000000080000000L});
    public static final BitSet FOLLOW_column_constraint_in_column_def2935 = new BitSet(new long[]{0x0800401800000002L,0x0000000000000000L,0x0008080008400000L,0x0000000080000000L});
    public static final BitSet FOLLOW_CONSTRAINT_in_column_constraint2961 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_column_constraint2965 = new BitSet(new long[]{0x0800001800000000L,0x0000000000000000L,0x0008080008400000L,0x0000000080000000L});
    public static final BitSet FOLLOW_column_constraint_pk_in_column_constraint2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_not_null_in_column_constraint2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_null_in_column_constraint2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_unique_in_column_constraint2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_check_in_column_constraint2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_default_in_column_constraint3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_collate_in_column_constraint3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fk_clause_in_column_constraint3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_column_constraint_pk3075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEY_in_column_constraint_pk3078 = new BitSet(new long[]{0x8000000000110002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_pk3090 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_AUTOINCREMENT_in_column_constraint_pk3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_column_constraint_not_null3103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_NULL_in_column_constraint_not_null3105 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_not_null3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_column_constraint_null3124 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_null3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_column_constraint_unique3143 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_unique3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_column_constraint_check3154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_check3157 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_column_constraint_check3160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_check3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_numeric_literal_value3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_numeric_literal_value3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_default_number3205 = new BitSet(new long[]{0x0000000000000000L,0x0400000000200000L});
    public static final BitSet FOLLOW_numeric_literal_value_in_signed_default_number3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_column_constraint_default3222 = new BitSet(new long[]{0x01C0000010000000L,0x0400000000200000L,0x0000020008088000L,0x0000000000000100L});
    public static final BitSet FOLLOW_signed_default_number_in_column_constraint_default3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_column_constraint_default3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_default3234 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_column_constraint_default3237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_default3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLATE_in_column_constraint_collate3248 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_column_constraint_collate3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_table_constraint3262 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_table_constraint3266 = new BitSet(new long[]{0x0000000800000000L,0x0000000002000000L,0x0000080000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_table_constraint_pk_in_table_constraint3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_unique_in_table_constraint3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_check_in_table_constraint3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_fk_in_table_constraint3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_table_constraint_pk3332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_pk3334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_pk3338 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_table_constraint_pk3342 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_pk3345 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_table_constraint_pk3349 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_pk3353 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_pk3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_table_constraint_unique3380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_unique3384 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_table_constraint_unique3388 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_unique3391 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_table_constraint_unique3395 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_unique3399 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_unique3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_table_constraint_check3426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_check3429 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_table_constraint_check3432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_check3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_table_constraint_fk3442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_fk3444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_fk3446 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_table_constraint_fk3450 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_fk3453 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_table_constraint_fk3457 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_fk3461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_fk_clause_in_table_constraint_fk3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_fk_clause3486 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_fk_clause3490 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000000L,0x0000000080448000L});
    public static final BitSet FOLLOW_LPAREN_in_fk_clause3493 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_fk_clause3497 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_fk_clause3500 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_fk_clause3504 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_fk_clause3508 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000000L,0x0000000080440000L});
    public static final BitSet FOLLOW_fk_clause_action_in_fk_clause3514 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000000L,0x0000000080440000L});
    public static final BitSet FOLLOW_fk_clause_deferrable_in_fk_clause3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_fk_clause_action3551 = new BitSet(new long[]{0x4000000000000000L,0x0100000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_set_in_fk_clause_action3554 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0200000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action3567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_NULL_in_fk_clause_action3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action3574 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_fk_clause_action3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASCADE_in_fk_clause_action3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_fk_clause_action3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_fk_clause_action3592 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_fk_clause_action3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_fk_clause_deferrable3603 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_DEFERRABLE_in_fk_clause_deferrable3607 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable3611 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_DEFERRED_in_fk_clause_deferrable3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable3618 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_IMMEDIATE_in_fk_clause_deferrable3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_table_stmt3631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_TABLE_in_drop_table_stmt3633 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_IF_in_drop_table_stmt3636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_table_stmt3638 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_drop_table_stmt3645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_drop_table_stmt3647 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_drop_table_stmt3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_table_stmt3683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_TABLE_in_alter_table_stmt3685 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_alter_table_stmt3692 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3698 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_RENAME_in_alter_table_stmt3701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_TO_in_alter_table_stmt3703 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_alter_table_stmt3711 = new BitSet(new long[]{0xFDE1305F4399B6E0L,0x33FF002A4717CE23L,0x8FFC2D16E8E432A3L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_COLUMN_in_alter_table_stmt3714 = new BitSet(new long[]{0xFDE1301F4399B6E0L,0x33FF002A4717CE23L,0x8FFC2D16E8E432A3L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_column_def_in_alter_table_stmt3718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_view_stmt3727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000100000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_view_stmt3729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_VIEW_in_create_view_stmt3732 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_IF_in_create_view_stmt3735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_NOT_in_create_view_stmt3737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_EXISTS_in_create_view_stmt3739 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_view_stmt3746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_create_view_stmt3748 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_view_stmt3754 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_AS_in_create_view_stmt3756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_select_stmt_in_create_view_stmt3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_view_stmt3801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_VIEW_in_drop_view_stmt3803 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_IF_in_drop_view_stmt3806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_view_stmt3808 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_drop_view_stmt3817 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_index_stmt3831 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_UNIQUE_in_create_index_stmt3834 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_INDEX_in_create_index_stmt3838 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_IF_in_create_index_stmt3841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_NOT_in_create_index_stmt3843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_EXISTS_in_create_index_stmt3845 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_index_stmt3852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_create_index_stmt3854 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_index_stmt3860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ON_in_create_index_stmt3864 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_index_stmt3868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LPAREN_in_create_index_stmt3870 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3874 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_create_index_stmt3877 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3881 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_index_stmt3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_indexed_column3931 = new BitSet(new long[]{0x8000001000010002L});
    public static final BitSet FOLLOW_COLLATE_in_indexed_column3934 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_indexed_column3938 = new BitSet(new long[]{0x8000000000010002L});
    public static final BitSet FOLLOW_ASC_in_indexed_column3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_indexed_column3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_index_stmt3978 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_INDEX_in_drop_index_stmt3980 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_IF_in_drop_index_stmt3983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_index_stmt3985 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_drop_index_stmt3992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_drop_index_stmt3994 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_drop_index_stmt4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_trigger_stmt4030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_trigger_stmt4032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_TRIGGER_in_create_trigger_stmt4035 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_IF_in_create_trigger_stmt4038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_NOT_in_create_trigger_stmt4040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_EXISTS_in_create_trigger_stmt4042 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt4049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_create_trigger_stmt4051 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt4057 = new BitSet(new long[]{0x4000000000800080L,0x0300000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_BEFORE_in_create_trigger_stmt4062 = new BitSet(new long[]{0x4000000000000000L,0x0100000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_AFTER_in_create_trigger_stmt4066 = new BitSet(new long[]{0x4000000000000000L,0x0100000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_INSTEAD_in_create_trigger_stmt4070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt4072 = new BitSet(new long[]{0x4000000000000000L,0x0100000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_DELETE_in_create_trigger_stmt4077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_INSERT_in_create_trigger_stmt4081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_UPDATE_in_create_trigger_stmt4085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000A0000000L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt4088 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt4092 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_create_trigger_stmt4095 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt4099 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ON_in_create_trigger_stmt4108 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt4112 = new BitSet(new long[]{0x0000000001000000L,0x0000000001000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_FOR_in_create_trigger_stmt4115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_EACH_in_create_trigger_stmt4117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_ROW_in_create_trigger_stmt4119 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_WHEN_in_create_trigger_stmt4124 = new BitSet(new long[]{0xFDE1707F539DB6E0L,0x37F7002A0737CE23L,0x8FEC6F16E868A2A1L,0x0000037BC3F40109L});
    public static final BitSet FOLLOW_expr_in_create_trigger_stmt4126 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_BEGIN_in_create_trigger_stmt4132 = new BitSet(new long[]{0x4000000000000000L,0x0100000000000000L,0x0100000000000000L,0x0000000100000001L});
    public static final BitSet FOLLOW_update_stmt_in_create_trigger_stmt4136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_insert_stmt_in_create_trigger_stmt4140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_delete_stmt_in_create_trigger_stmt4144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_select_stmt_in_create_trigger_stmt4148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_in_create_trigger_stmt4151 = new BitSet(new long[]{0x4000000000000000L,0x0100000000000800L,0x0100000000000000L,0x0000000100000001L});
    public static final BitSet FOLLOW_END_in_create_trigger_stmt4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_trigger_stmt4188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_TRIGGER_in_drop_trigger_stmt4190 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_IF_in_drop_trigger_stmt4193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_trigger_stmt4195 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt4202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_in_drop_trigger_stmt4204 = new BitSet(new long[]{0xFDE1705F4399B6E0L,0x33F7002A0717CE23L,0x8FEC2D16E82022A1L,0x0000037BC3B40109L});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_id_core4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_core_in_id4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_id4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_core_in_id_column_def4917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_column_def_in_id_column_def4921 = new BitSet(new long[]{0x0000000000000002L});

}