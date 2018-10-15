// Generated from /home/sb2/www/parseo/FlechaParser/src/main/antlr4/Flecha.g4 by ANTLR 4.7
package ar.edu.unq.parser.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FlechaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, IF=2, THEN=3, ELIF=4, ELSE=5, CASE=6, LET=7, IN=8, DEFEQ=9, SEMICOLON=10, 
		LBRACKET=11, RBRACKET=12, BACKSLASH=13, PIPE=14, ARROW=15, SINGLEQUOTE=16, 
		QUOTE=17, AND=18, OR=19, NEGATION=20, EQ=21, NE=22, GE=23, LE=24, GT=25, 
		LT=26, PLUS=27, MINUS=28, TIMES=29, DIV=30, MOD=31, WHITESPACE=32, NEWLINE=33, 
		COMMENT=34, NUMBER=35, ID=36, LOWERID=37, UPPERID=38, LITERAL=39, CHARS=40, 
		CHAR=41, LAMBDA=42, STRING=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DEF", "IF", "THEN", "ELIF", "ELSE", "CASE", "LET", "IN", "DEFEQ", "SEMICOLON", 
		"LBRACKET", "RBRACKET", "BACKSLASH", "PIPE", "ARROW", "SINGLEQUOTE", "QUOTE", 
		"AND", "OR", "NEGATION", "EQ", "NE", "GE", "LE", "GT", "LT", "PLUS", "MINUS", 
		"TIMES", "DIV", "MOD", "WHITESPACE", "NEWLINE", "COMMENT", "NUMBER", "ID", 
		"LOWERID", "UPPERID", "LITERAL", "CHARS", "CHAR", "LAMBDA", "STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'def'", "'if'", "'then'", "'elif'", "'else'", "'case'", "'let'", 
		"'in'", "'='", "';'", "'('", "')'", "'\\'", "'|'", "'->'", "'''", "'\"'", 
		"'&&'", "'||'", "'!'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DEF", "IF", "THEN", "ELIF", "ELSE", "CASE", "LET", "IN", "DEFEQ", 
		"SEMICOLON", "LBRACKET", "RBRACKET", "BACKSLASH", "PIPE", "ARROW", "SINGLEQUOTE", 
		"QUOTE", "AND", "OR", "NEGATION", "EQ", "NE", "GE", "LE", "GT", "LT", 
		"PLUS", "MINUS", "TIMES", "DIV", "MOD", "WHITESPACE", "NEWLINE", "COMMENT", 
		"NUMBER", "ID", "LOWERID", "UPPERID", "LITERAL", "CHARS", "CHAR", "LAMBDA", 
		"STRING"
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


	public FlechaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Flecha.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u010f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\5\"\u00b6"+
		"\n\"\3\"\3\"\6\"\u00ba\n\"\r\"\16\"\u00bb\3\"\3\"\3#\3#\3#\3#\7#\u00c4"+
		"\n#\f#\16#\u00c7\13#\3#\3#\3$\6$\u00cc\n$\r$\16$\u00cd\3%\6%\u00d1\n%"+
		"\r%\16%\u00d2\3&\6&\u00d6\n&\r&\16&\u00d7\3&\7&\u00db\n&\f&\16&\u00de"+
		"\13&\3\'\6\'\u00e1\n\'\r\'\16\'\u00e2\3\'\7\'\u00e6\n\'\f\'\16\'\u00e9"+
		"\13\'\3(\3(\7(\u00ed\n(\f(\16(\u00f0\13(\3(\3(\3)\3)\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0104\n*\3*\3*\3+\3+\3+\3,\6,\u010c\n,\r"+
		",\16,\u010d\3\u010d\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\t\4\2\13\13\17"+
		"\17\4\2\f\f\17\17\3\2\62;\3\2c|\3\2C\\\6\2\62;C\\aac|\b\2\"\"*+\62;??"+
		"C\\c|\2\u0120\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5]\3\2\2\2\7`\3\2\2\2\te\3"+
		"\2\2\2\13j\3\2\2\2\ro\3\2\2\2\17t\3\2\2\2\21x\3\2\2\2\23{\3\2\2\2\25}"+
		"\3\2\2\2\27\177\3\2\2\2\31\u0081\3\2\2\2\33\u0083\3\2\2\2\35\u0085\3\2"+
		"\2\2\37\u0087\3\2\2\2!\u008a\3\2\2\2#\u008c\3\2\2\2%\u008e\3\2\2\2\'\u0091"+
		"\3\2\2\2)\u0094\3\2\2\2+\u0096\3\2\2\2-\u0099\3\2\2\2/\u009c\3\2\2\2\61"+
		"\u009f\3\2\2\2\63\u00a2\3\2\2\2\65\u00a4\3\2\2\2\67\u00a6\3\2\2\29\u00a8"+
		"\3\2\2\2;\u00aa\3\2\2\2=\u00ac\3\2\2\2?\u00ae\3\2\2\2A\u00b0\3\2\2\2C"+
		"\u00b9\3\2\2\2E\u00bf\3\2\2\2G\u00cb\3\2\2\2I\u00d0\3\2\2\2K\u00d5\3\2"+
		"\2\2M\u00e0\3\2\2\2O\u00ea\3\2\2\2Q\u00f3\3\2\2\2S\u00f5\3\2\2\2U\u0107"+
		"\3\2\2\2W\u010b\3\2\2\2YZ\7f\2\2Z[\7g\2\2[\\\7h\2\2\\\4\3\2\2\2]^\7k\2"+
		"\2^_\7h\2\2_\6\3\2\2\2`a\7v\2\2ab\7j\2\2bc\7g\2\2cd\7p\2\2d\b\3\2\2\2"+
		"ef\7g\2\2fg\7n\2\2gh\7k\2\2hi\7h\2\2i\n\3\2\2\2jk\7g\2\2kl\7n\2\2lm\7"+
		"u\2\2mn\7g\2\2n\f\3\2\2\2op\7e\2\2pq\7c\2\2qr\7u\2\2rs\7g\2\2s\16\3\2"+
		"\2\2tu\7n\2\2uv\7g\2\2vw\7v\2\2w\20\3\2\2\2xy\7k\2\2yz\7p\2\2z\22\3\2"+
		"\2\2{|\7?\2\2|\24\3\2\2\2}~\7=\2\2~\26\3\2\2\2\177\u0080\7*\2\2\u0080"+
		"\30\3\2\2\2\u0081\u0082\7+\2\2\u0082\32\3\2\2\2\u0083\u0084\7^\2\2\u0084"+
		"\34\3\2\2\2\u0085\u0086\7~\2\2\u0086\36\3\2\2\2\u0087\u0088\7/\2\2\u0088"+
		"\u0089\7@\2\2\u0089 \3\2\2\2\u008a\u008b\7)\2\2\u008b\"\3\2\2\2\u008c"+
		"\u008d\7$\2\2\u008d$\3\2\2\2\u008e\u008f\7(\2\2\u008f\u0090\7(\2\2\u0090"+
		"&\3\2\2\2\u0091\u0092\7~\2\2\u0092\u0093\7~\2\2\u0093(\3\2\2\2\u0094\u0095"+
		"\7#\2\2\u0095*\3\2\2\2\u0096\u0097\7?\2\2\u0097\u0098\7?\2\2\u0098,\3"+
		"\2\2\2\u0099\u009a\7#\2\2\u009a\u009b\7?\2\2\u009b.\3\2\2\2\u009c\u009d"+
		"\7@\2\2\u009d\u009e\7?\2\2\u009e\60\3\2\2\2\u009f\u00a0\7>\2\2\u00a0\u00a1"+
		"\7?\2\2\u00a1\62\3\2\2\2\u00a2\u00a3\7@\2\2\u00a3\64\3\2\2\2\u00a4\u00a5"+
		"\7>\2\2\u00a5\66\3\2\2\2\u00a6\u00a7\7-\2\2\u00a78\3\2\2\2\u00a8\u00a9"+
		"\7/\2\2\u00a9:\3\2\2\2\u00aa\u00ab\7,\2\2\u00ab<\3\2\2\2\u00ac\u00ad\7"+
		"\61\2\2\u00ad>\3\2\2\2\u00ae\u00af\7\'\2\2\u00af@\3\2\2\2\u00b0\u00b1"+
		"\7\"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\b!\2\2\u00b3B\3\2\2\2\u00b4\u00b6"+
		"\7\17\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2"+
		"\u00b7\u00ba\7\f\2\2\u00b8\u00ba\t\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\b\"\2\2\u00beD\3\2\2\2\u00bf\u00c0\7/\2\2\u00c0"+
		"\u00c1\7/\2\2\u00c1\u00c5\3\2\2\2\u00c2\u00c4\n\3\2\2\u00c3\u00c2\3\2"+
		"\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\b#\2\2\u00c9F\3\2\2\2\u00ca"+
		"\u00cc\t\4\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ceH\3\2\2\2\u00cf\u00d1\t\4\2\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"J\3\2\2\2\u00d4\u00d6\t\5\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2"+
		"\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00dc\3\2\2\2\u00d9\u00db"+
		"\5Q)\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00ddL\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\t\6\2\2"+
		"\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e7\3\2\2\2\u00e4\u00e6\5Q)\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8N\3\2\2\2"+
		"\u00e9\u00e7\3\2\2\2\u00ea\u00ee\5#\22\2\u00eb\u00ed\5Q)\2\u00ec\u00eb"+
		"\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\5#\22\2\u00f2P\3\2\2\2"+
		"\u00f3\u00f4\t\7\2\2\u00f4R\3\2\2\2\u00f5\u0103\5!\21\2\u00f6\u0104\t"+
		"\b\2\2\u00f7\u00f8\7^\2\2\u00f8\u0104\7^\2\2\u00f9\u00fa\7^\2\2\u00fa"+
		"\u0104\7v\2\2\u00fb\u00fc\7^\2\2\u00fc\u0104\7p\2\2\u00fd\u00fe\7^\2\2"+
		"\u00fe\u0104\7t\2\2\u00ff\u0100\7^\2\2\u0100\u0104\5!\21\2\u0101\u0102"+
		"\7^\2\2\u0102\u0104\7$\2\2\u0103\u00f6\3\2\2\2\u0103\u00f7\3\2\2\2\u0103"+
		"\u00f9\3\2\2\2\u0103\u00fb\3\2\2\2\u0103\u00fd\3\2\2\2\u0103\u00ff\3\2"+
		"\2\2\u0103\u0101\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\5!\21\2\u0106"+
		"T\3\2\2\2\u0107\u0108\5K&\2\u0108\u0109\5\33\16\2\u0109V\3\2\2\2\u010a"+
		"\u010c\13\2\2\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3"+
		"\2\2\2\u010d\u010b\3\2\2\2\u010eX\3\2\2\2\20\2\u00b5\u00b9\u00bb\u00c5"+
		"\u00cd\u00d2\u00d7\u00dc\u00e2\u00e7\u00ee\u0103\u010d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}