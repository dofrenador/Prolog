// Generated from c:\Users\seali\cop4020p2deneme2\LabeledExpr.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MUL=4, DIV=5, ADD=6, SUB=7, MOD=8, POW=9, NOT=10, 
		SIN=11, COS=12, LN=13, EXP=14, SQRT=15, READ=16, ANDAND=17, OROR=18, INCREMENT=19, 
		DECREMENT=20, ASSIGNPLUS=21, ASSIGNMINUS=22, ASSIGNMULTIPLY=23, ASSIGNDIVIDE=24, 
		IF=25, ELSE=26, WHILE=27, TRUE=28, FALSE=29, ID=30, INT=31, DOUBLE=32, 
		NEWLINE=33, WS=34, COMMENT=35;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2;
	public static final String[] ruleNames = {
		"prog", "stat", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "')'", "'('", "'*'", "'/'", "'+'", "'-'", "'%'", "'^'", "'!'", 
		"'s('", "'c('", "'l('", "'e('", "'sqrt('", "'read()'", "'&&'", "'||'", 
		"'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'if'", "'else'", "'while'", 
		"'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "MUL", "DIV", "ADD", "SUB", "MOD", "POW", "NOT", 
		"SIN", "COS", "LN", "EXP", "SQRT", "READ", "ANDAND", "OROR", "INCREMENT", 
		"DECREMENT", "ASSIGNPLUS", "ASSIGNMINUS", "ASSIGNMULTIPLY", "ASSIGNDIVIDE", 
		"IF", "ELSE", "WHILE", "TRUE", "FALSE", "ID", "INT", "DOUBLE", "NEWLINE", 
		"WS", "COMMENT"
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

	@Override
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LabeledExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				stat();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SUB) | (1L << NOT) | (1L << SIN) | (1L << COS) | (1L << LN) | (1L << EXP) | (1L << SQRT) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << ID) | (1L << INT) | (1L << DOUBLE) | (1L << NEWLINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlankContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class AssignPlusContext extends StatContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public AssignPlusContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class AssignContext extends StatContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class AssignMinusContext extends StatContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public AssignMinusContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class PrintExprContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public PrintExprContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class AssignDivideContext extends StatContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public AssignDivideContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class AssignMultiplyContext extends StatContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public AssignMultiplyContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				expr(0);
				setState(12);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(14);
				match(ID);
				setState(15);
				match(T__0);
				setState(16);
				expr(0);
				setState(17);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new AssignPlusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(19);
				match(ID);
				setState(20);
				match(ASSIGNPLUS);
				setState(21);
				expr(0);
				setState(22);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new AssignMinusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(24);
				match(ID);
				setState(25);
				match(ASSIGNMINUS);
				setState(26);
				expr(0);
				setState(27);
				match(NEWLINE);
				}
				break;
			case 5:
				_localctx = new AssignMultiplyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(29);
				match(ID);
				setState(30);
				match(ASSIGNMULTIPLY);
				setState(31);
				expr(0);
				setState(32);
				match(NEWLINE);
				}
				break;
			case 6:
				_localctx = new AssignDivideContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(34);
				match(ID);
				setState(35);
				match(ASSIGNDIVIDE);
				setState(36);
				expr(0);
				setState(37);
				match(NEWLINE);
				}
				break;
			case 7:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(39);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecrementLeftContext extends ExprContext {
		public Token op;
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public DecrementLeftContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AddContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LnContext extends ExprContext {
		public TerminalNode LN() { return getToken(LabeledExprParser.LN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LnContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class OrOrContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrOrContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DecrementRightContext extends ExprContext {
		public Token op;
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public DecrementRightContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MulContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CosContext extends ExprContext {
		public TerminalNode COS() { return getToken(LabeledExprParser.COS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CosContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ModuloContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ModuloContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SqrtContext extends ExprContext {
		public TerminalNode SQRT() { return getToken(LabeledExprParser.SQRT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SqrtContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AndAndContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndAndContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DoubleContext extends ExprContext {
		public TerminalNode DOUBLE() { return getToken(LabeledExprParser.DOUBLE, 0); }
		public DoubleContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IncrementRightContext extends ExprContext {
		public Token op;
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public IncrementRightContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ReadContext extends ExprContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode READ() { return getToken(LabeledExprParser.READ, 0); }
		public ReadContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NotContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SinContext extends ExprContext {
		public TerminalNode SIN() { return getToken(LabeledExprParser.SIN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SinContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PowContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NegateContext extends ExprContext {
		public Token op;
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public NegateContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExpContext extends ExprContext {
		public TerminalNode EXP() { return getToken(LabeledExprParser.EXP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IncrementLeftContext extends ExprContext {
		public Token op;
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public IncrementLeftContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(43);
				((NegateContext)_localctx).op = match(SUB);
				setState(44);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new IncrementLeftContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				((IncrementLeftContext)_localctx).op = match(INCREMENT);
				setState(46);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new DecrementLeftContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				((DecrementLeftContext)_localctx).op = match(DECREMENT);
				setState(48);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new IncrementRightContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				match(ID);
				setState(50);
				((IncrementRightContext)_localctx).op = match(INCREMENT);
				}
				break;
			case 5:
				{
				_localctx = new DecrementRightContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(ID);
				setState(52);
				((DecrementRightContext)_localctx).op = match(DECREMENT);
				}
				break;
			case 6:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				((NotContext)_localctx).op = match(NOT);
				setState(54);
				expr(13);
				}
				break;
			case 7:
				{
				_localctx = new SinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(SIN);
				setState(56);
				expr(0);
				setState(57);
				match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new CosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(COS);
				setState(60);
				expr(0);
				setState(61);
				match(T__1);
				}
				break;
			case 9:
				{
				_localctx = new LnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				match(LN);
				setState(64);
				expr(0);
				setState(65);
				match(T__1);
				}
				break;
			case 10:
				{
				_localctx = new ExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(EXP);
				setState(68);
				expr(0);
				setState(69);
				match(T__1);
				}
				break;
			case 11:
				{
				_localctx = new SqrtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(SQRT);
				setState(72);
				expr(0);
				setState(73);
				match(T__1);
				}
				break;
			case 12:
				{
				_localctx = new ReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(ID);
				setState(76);
				match(T__0);
				setState(77);
				match(READ);
				}
				break;
			case 13:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(INT);
				}
				break;
			case 14:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(DOUBLE);
				}
				break;
			case 15:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				match(ID);
				}
				break;
			case 16:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(T__2);
				setState(82);
				expr(0);
				setState(83);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(87);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(88);
						((PowContext)_localctx).op = match(POW);
						setState(89);
						expr(25);
						}
						break;
					case 2:
						{
						_localctx = new MulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(90);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(91);
						((MulContext)_localctx).op = match(MUL);
						setState(92);
						expr(24);
						}
						break;
					case 3:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(94);
						((DivContext)_localctx).op = match(DIV);
						setState(95);
						expr(23);
						}
						break;
					case 4:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(97);
						((SubContext)_localctx).op = match(SUB);
						setState(98);
						expr(22);
						}
						break;
					case 5:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(100);
						((AddContext)_localctx).op = match(ADD);
						setState(101);
						expr(21);
						}
						break;
					case 6:
						{
						_localctx = new ModuloContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(103);
						((ModuloContext)_localctx).op = match(MOD);
						setState(104);
						expr(20);
						}
						break;
					case 7:
						{
						_localctx = new AndAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(106);
						((AndAndContext)_localctx).op = match(ANDAND);
						setState(107);
						expr(13);
						}
						break;
					case 8:
						{
						_localctx = new OrOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(109);
						((OrOrContext)_localctx).op = match(OROR);
						setState(110);
						expr(12);
						}
						break;
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 24);
		case 1:
			return precpred(_ctx, 23);
		case 2:
			return precpred(_ctx, 22);
		case 3:
			return precpred(_ctx, 21);
		case 4:
			return precpred(_ctx, 20);
		case 5:
			return precpred(_ctx, 19);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%w\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4X\n\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\7\4r\n\4\f\4\16\4u\13\4\3\4\2\3\6\5\2\4\6\2\2\2\u0091"+
		"\2\t\3\2\2\2\4*\3\2\2\2\6W\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\13\3\2\2"+
		"\2\13\t\3\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\16\5\6\4\2\16\17\7#\2\2\17"+
		"+\3\2\2\2\20\21\7 \2\2\21\22\7\3\2\2\22\23\5\6\4\2\23\24\7#\2\2\24+\3"+
		"\2\2\2\25\26\7 \2\2\26\27\7\27\2\2\27\30\5\6\4\2\30\31\7#\2\2\31+\3\2"+
		"\2\2\32\33\7 \2\2\33\34\7\30\2\2\34\35\5\6\4\2\35\36\7#\2\2\36+\3\2\2"+
		"\2\37 \7 \2\2 !\7\31\2\2!\"\5\6\4\2\"#\7#\2\2#+\3\2\2\2$%\7 \2\2%&\7\32"+
		"\2\2&\'\5\6\4\2\'(\7#\2\2(+\3\2\2\2)+\7#\2\2*\r\3\2\2\2*\20\3\2\2\2*\25"+
		"\3\2\2\2*\32\3\2\2\2*\37\3\2\2\2*$\3\2\2\2*)\3\2\2\2+\5\3\2\2\2,-\b\4"+
		"\1\2-.\7\t\2\2.X\7 \2\2/\60\7\25\2\2\60X\7 \2\2\61\62\7\26\2\2\62X\7 "+
		"\2\2\63\64\7 \2\2\64X\7\25\2\2\65\66\7 \2\2\66X\7\26\2\2\678\7\f\2\28"+
		"X\5\6\4\179:\7\r\2\2:;\5\6\4\2;<\7\4\2\2<X\3\2\2\2=>\7\16\2\2>?\5\6\4"+
		"\2?@\7\4\2\2@X\3\2\2\2AB\7\17\2\2BC\5\6\4\2CD\7\4\2\2DX\3\2\2\2EF\7\20"+
		"\2\2FG\5\6\4\2GH\7\4\2\2HX\3\2\2\2IJ\7\21\2\2JK\5\6\4\2KL\7\4\2\2LX\3"+
		"\2\2\2MN\7 \2\2NO\7\3\2\2OX\7\22\2\2PX\7!\2\2QX\7\"\2\2RX\7 \2\2ST\7\5"+
		"\2\2TU\5\6\4\2UV\7\4\2\2VX\3\2\2\2W,\3\2\2\2W/\3\2\2\2W\61\3\2\2\2W\63"+
		"\3\2\2\2W\65\3\2\2\2W\67\3\2\2\2W9\3\2\2\2W=\3\2\2\2WA\3\2\2\2WE\3\2\2"+
		"\2WI\3\2\2\2WM\3\2\2\2WP\3\2\2\2WQ\3\2\2\2WR\3\2\2\2WS\3\2\2\2Xs\3\2\2"+
		"\2YZ\f\32\2\2Z[\7\13\2\2[r\5\6\4\33\\]\f\31\2\2]^\7\6\2\2^r\5\6\4\32_"+
		"`\f\30\2\2`a\7\7\2\2ar\5\6\4\31bc\f\27\2\2cd\7\t\2\2dr\5\6\4\30ef\f\26"+
		"\2\2fg\7\b\2\2gr\5\6\4\27hi\f\25\2\2ij\7\n\2\2jr\5\6\4\26kl\f\16\2\2l"+
		"m\7\23\2\2mr\5\6\4\17no\f\r\2\2op\7\24\2\2pr\5\6\4\16qY\3\2\2\2q\\\3\2"+
		"\2\2q_\3\2\2\2qb\3\2\2\2qe\3\2\2\2qh\3\2\2\2qk\3\2\2\2qn\3\2\2\2ru\3\2"+
		"\2\2sq\3\2\2\2st\3\2\2\2t\7\3\2\2\2us\3\2\2\2\7\13*Wqs";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}