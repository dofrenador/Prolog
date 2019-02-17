// Generated from LabeledExpr.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, MUL=6, DIV=7, ADD=8, SUB=9, MOD=10, 
		POW=11, NOT=12, SIN=13, COS=14, LN=15, EXP=16, SQRT=17, READ=18, ANDAND=19, 
		OROR=20, INCREMENT=21, DECREMENT=22, ASSIGNPLUS=23, ASSIGNMINUS=24, ASSIGNMULTIPLY=25, 
		ASSIGNDIVIDE=26, IF=27, ELSE=28, WHILE=29, TRUE=30, FALSE=31, GREATER=32, 
		LESSER=33, GREATEREQ=34, LESSEREQ=35, COMPARE=36, NOTEQUAL=37, ID=38, 
		INT=39, DOUBLE=40, NEWLINE=41, WS=42, COMMENT=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "MUL", "DIV", "ADD", "SUB", "MOD", 
		"POW", "NOT", "SIN", "COS", "LN", "EXP", "SQRT", "READ", "ANDAND", "OROR", 
		"INCREMENT", "DECREMENT", "ASSIGNPLUS", "ASSIGNMINUS", "ASSIGNMULTIPLY", 
		"ASSIGNDIVIDE", "IF", "ELSE", "WHILE", "TRUE", "FALSE", "GREATER", "LESSER", 
		"GREATEREQ", "LESSEREQ", "COMPARE", "NOTEQUAL", "ID", "INT", "DOUBLE", 
		"NEWLINE", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "'{'", "'}'", "'*'", "'/'", "'+'", "'-'", "'%'", 
		"'^'", "'!'", "'s('", "'c('", "'l('", "'e('", "'sqrt('", "'read()'", "'&&'", 
		"'||'", "'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'if'", "'else'", 
		"'while'", "'true'", "'false'", "'>'", "'<'", "'>='", "'<='", "'=='", 
		"'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "MUL", "DIV", "ADD", "SUB", "MOD", 
		"POW", "NOT", "SIN", "COS", "LN", "EXP", "SQRT", "READ", "ANDAND", "OROR", 
		"INCREMENT", "DECREMENT", "ASSIGNPLUS", "ASSIGNMINUS", "ASSIGNMULTIPLY", 
		"ASSIGNDIVIDE", "IF", "ELSE", "WHILE", "TRUE", "FALSE", "GREATER", "LESSER", 
		"GREATEREQ", "LESSEREQ", "COMPARE", "NOTEQUAL", "ID", "INT", "DOUBLE", 
		"NEWLINE", "WS", "COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LabeledExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u00ff\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3"+
		"$\3$\3%\3%\3%\3&\3&\3&\3\'\6\'\u00cd\n\'\r\'\16\'\u00ce\3(\6(\u00d2\n"+
		"(\r(\16(\u00d3\3)\5)\u00d7\n)\3)\6)\u00da\n)\r)\16)\u00db\3)\3)\6)\u00e0"+
		"\n)\r)\16)\u00e1\5)\u00e4\n)\3*\5*\u00e7\n*\3*\3*\3+\6+\u00ec\n+\r+\16"+
		"+\u00ed\3+\3+\3,\3,\3,\3,\7,\u00f6\n,\f,\16,\u00f9\13,\3,\3,\3,\3,\3,"+
		"\3\u00f7\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\5\4\2C\\c|\3\2\62;\4\2\13"+
		"\13\"\"\u0107\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\t_\3"+
		"\2\2\2\13a\3\2\2\2\rc\3\2\2\2\17e\3\2\2\2\21g\3\2\2\2\23i\3\2\2\2\25k"+
		"\3\2\2\2\27m\3\2\2\2\31o\3\2\2\2\33q\3\2\2\2\35t\3\2\2\2\37w\3\2\2\2!"+
		"z\3\2\2\2#}\3\2\2\2%\u0083\3\2\2\2\'\u008a\3\2\2\2)\u008d\3\2\2\2+\u0090"+
		"\3\2\2\2-\u0093\3\2\2\2/\u0096\3\2\2\2\61\u0099\3\2\2\2\63\u009c\3\2\2"+
		"\2\65\u009f\3\2\2\2\67\u00a2\3\2\2\29\u00a5\3\2\2\2;\u00aa\3\2\2\2=\u00b0"+
		"\3\2\2\2?\u00b5\3\2\2\2A\u00bb\3\2\2\2C\u00bd\3\2\2\2E\u00bf\3\2\2\2G"+
		"\u00c2\3\2\2\2I\u00c5\3\2\2\2K\u00c8\3\2\2\2M\u00cc\3\2\2\2O\u00d1\3\2"+
		"\2\2Q\u00d6\3\2\2\2S\u00e6\3\2\2\2U\u00eb\3\2\2\2W\u00f1\3\2\2\2YZ\7?"+
		"\2\2Z\4\3\2\2\2[\\\7*\2\2\\\6\3\2\2\2]^\7+\2\2^\b\3\2\2\2_`\7}\2\2`\n"+
		"\3\2\2\2ab\7\177\2\2b\f\3\2\2\2cd\7,\2\2d\16\3\2\2\2ef\7\61\2\2f\20\3"+
		"\2\2\2gh\7-\2\2h\22\3\2\2\2ij\7/\2\2j\24\3\2\2\2kl\7\'\2\2l\26\3\2\2\2"+
		"mn\7`\2\2n\30\3\2\2\2op\7#\2\2p\32\3\2\2\2qr\7u\2\2rs\7*\2\2s\34\3\2\2"+
		"\2tu\7e\2\2uv\7*\2\2v\36\3\2\2\2wx\7n\2\2xy\7*\2\2y \3\2\2\2z{\7g\2\2"+
		"{|\7*\2\2|\"\3\2\2\2}~\7u\2\2~\177\7s\2\2\177\u0080\7t\2\2\u0080\u0081"+
		"\7v\2\2\u0081\u0082\7*\2\2\u0082$\3\2\2\2\u0083\u0084\7t\2\2\u0084\u0085"+
		"\7g\2\2\u0085\u0086\7c\2\2\u0086\u0087\7f\2\2\u0087\u0088\7*\2\2\u0088"+
		"\u0089\7+\2\2\u0089&\3\2\2\2\u008a\u008b\7(\2\2\u008b\u008c\7(\2\2\u008c"+
		"(\3\2\2\2\u008d\u008e\7~\2\2\u008e\u008f\7~\2\2\u008f*\3\2\2\2\u0090\u0091"+
		"\7-\2\2\u0091\u0092\7-\2\2\u0092,\3\2\2\2\u0093\u0094\7/\2\2\u0094\u0095"+
		"\7/\2\2\u0095.\3\2\2\2\u0096\u0097\7-\2\2\u0097\u0098\7?\2\2\u0098\60"+
		"\3\2\2\2\u0099\u009a\7/\2\2\u009a\u009b\7?\2\2\u009b\62\3\2\2\2\u009c"+
		"\u009d\7,\2\2\u009d\u009e\7?\2\2\u009e\64\3\2\2\2\u009f\u00a0\7\61\2\2"+
		"\u00a0\u00a1\7?\2\2\u00a1\66\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7"+
		"h\2\2\u00a48\3\2\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8"+
		"\7u\2\2\u00a8\u00a9\7g\2\2\u00a9:\3\2\2\2\u00aa\u00ab\7y\2\2\u00ab\u00ac"+
		"\7j\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7g\2\2\u00af"+
		"<\3\2\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7w\2\2\u00b3"+
		"\u00b4\7g\2\2\u00b4>\3\2\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7c\2\2\u00b7"+
		"\u00b8\7n\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7g\2\2\u00ba@\3\2\2\2\u00bb"+
		"\u00bc\7@\2\2\u00bcB\3\2\2\2\u00bd\u00be\7>\2\2\u00beD\3\2\2\2\u00bf\u00c0"+
		"\7@\2\2\u00c0\u00c1\7?\2\2\u00c1F\3\2\2\2\u00c2\u00c3\7>\2\2\u00c3\u00c4"+
		"\7?\2\2\u00c4H\3\2\2\2\u00c5\u00c6\7?\2\2\u00c6\u00c7\7?\2\2\u00c7J\3"+
		"\2\2\2\u00c8\u00c9\7#\2\2\u00c9\u00ca\7?\2\2\u00caL\3\2\2\2\u00cb\u00cd"+
		"\t\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cfN\3\2\2\2\u00d0\u00d2\t\3\2\2\u00d1\u00d0\3\2\2\2"+
		"\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4P\3"+
		"\2\2\2\u00d5\u00d7\7/\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00da\t\3\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e3\3\2\2\2\u00dd"+
		"\u00df\7\60\2\2\u00de\u00e0\t\3\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3"+
		"\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3"+
		"\u00dd\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4R\3\2\2\2\u00e5\u00e7\7\17\2\2"+
		"\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9"+
		"\7\f\2\2\u00e9T\3\2\2\2\u00ea\u00ec\t\4\2\2\u00eb\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f0\b+\2\2\u00f0V\3\2\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00f3"+
		"\7,\2\2\u00f3\u00f7\3\2\2\2\u00f4\u00f6\13\2\2\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7,\2\2\u00fb\u00fc\7\61\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fe\b,\2\2\u00feX\3\2\2\2\f\2\u00ce\u00d3\u00d6"+
		"\u00db\u00e1\u00e3\u00e6\u00ed\u00f7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}