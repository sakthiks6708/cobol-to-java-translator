// Generated from CobolFull_fixed.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CobolFull_fixedParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, DIVISION=2, PROGRAM_ID=3, DATA=4, WORKING_STORAGE=5, SECTION=6, 
		PIC=7, PROCEDURE=8, DISPLAY=9, MOVE=10, ADD=11, TO=12, STOP=13, RUN=14, 
		DOT=15, IDENTIFIER=16, NUMBER=17, STRING=18, WS=19;
	public static final int
		RULE_program = 0, RULE_idDivision = 1, RULE_dataDivision = 2, RULE_dataItem = 3, 
		RULE_procedureDivision = 4, RULE_statement = 5, RULE_displayStmt = 6, 
		RULE_moveStmt = 7, RULE_addStmt = 8, RULE_stopStmt = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "idDivision", "dataDivision", "dataItem", "procedureDivision", 
			"statement", "displayStmt", "moveStmt", "addStmt", "stopStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ID'", "'DIVISION'", "'PROGRAM-ID'", "'DATA'", "'WORKING-STORAGE'", 
			"'SECTION'", "'PIC'", "'PROCEDURE'", "'DISPLAY'", "'MOVE'", "'ADD'", 
			"'TO'", "'STOP'", "'RUN'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "DIVISION", "PROGRAM_ID", "DATA", "WORKING_STORAGE", "SECTION", 
			"PIC", "PROCEDURE", "DISPLAY", "MOVE", "ADD", "TO", "STOP", "RUN", "DOT", 
			"IDENTIFIER", "NUMBER", "STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "CobolFull_fixed.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CobolFull_fixedParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public IdDivisionContext idDivision() {
			return getRuleContext(IdDivisionContext.class,0);
		}
		public DataDivisionContext dataDivision() {
			return getRuleContext(DataDivisionContext.class,0);
		}
		public ProcedureDivisionContext procedureDivision() {
			return getRuleContext(ProcedureDivisionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CobolFull_fixedParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolFull_fixedListener ) ((CobolFull_fixedListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolFull_fixedListener ) ((CobolFull_fixedListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolFull_fixedVisitor ) return ((CobolFull_fixedVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			idDivision();
			setState(21);
			dataDivision();
			setState(22);
			procedureDivision();
			setState(23);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdDivisionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CobolFull_fixedParser.ID, 0); }
		public TerminalNode DIVISION() { return getToken(CobolFull_fixedParser.DIVISION, 0); }
		public List<TerminalNode> DOT() { return getTokens(CobolFull_fixedParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CobolFull_fixedParser.DOT, i);
		}
		public TerminalNode PROGRAM_ID() { return getToken(CobolFull_fixedParser.PROGRAM_ID, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CobolFull_fixedParser.IDENTIFIER, 0); }
		public IdDivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idDivision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolFull_fixedListener ) ((CobolFull_fixedListener)listener).enterIdDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolFull_fixedListener ) ((CobolFull_fixedListener)listener).exitIdDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolFull_fixedVisitor ) return ((CobolFull_fixedVisitor<? extends T>)visitor).visitIdDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdDivisionContext idDivision() throws RecognitionException {
		IdDivisionContext _localctx = new IdDivisionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_idDivision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(ID);
			setState(26);
			match(DIVISION);
			setState(27);
			match(DOT);
			setState(28);
			match(PROGRAM_ID);
			setState(29);
			match(DOT);
			setState(30);
			match(IDENTIFIER);
			setState(31);
			match(DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataDivisionContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(CobolFull_fixedParser.DATA, 0); }
		public TerminalNode DIVISION() { return getToken(CobolFull_fixedParser.DIVISION, 0); }
		public List<TerminalNode> DOT() { return getTokens(CobolFull_fixedParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CobolFull_fixedParser.DOT, i);
		}
		public TerminalNode WORKING_STORAGE() { return getToken(CobolFull_fixedParser.WORKING_STORAGE, 0); }
		public TerminalNode SECTION() { return getToken(CobolFull_fixedParser.SECTION, 0); }
		public List<DataItemContext> dataItem() {
			return getRuleContexts(DataItemContext.class);
		}
		public DataItemContext dataItem(int i) {
			return getRuleContext(DataItemContext.class,i);
		}
		public DataDivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDivision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolFull_fixedListener ) ((CobolFull_fixedListener)listener).enterDataDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolFull_fixedListener ) ((CobolFull_fixedListener)listener).exitDataDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolFull_fixedVisitor ) return ((CobolFull_fixedVisitor<? extends T>)visitor).visitDataDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataDivisionContext dataDivision() throws RecognitionException {
		DataDivisionContext _localctx = new DataDivisionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dataDivision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(DATA);
			setState(34);
			match(DIVISION);
			setState(35);
			match(DOT);
			setState(36);
			match(WORKING_STORAGE);
			setState(37);
			match(SECTION);
			setState(38);
			match(DOT);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER) {
				{
				{
				setState(39);
				dataItem();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataItemContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CobolFull_fixedParser.NUMBER, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CobolFull_fixedParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CobolFull_fixedParser.IDENTIFIER, i);
		}
		public TerminalNode PIC() { return getToken(CobolFull_fixedParser.PIC, 0); }
		public TerminalNode DOT() { return getToken(CobolFull_fixedParser.DOT, 0); }
		public DataItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolFull_fixedListener ) ((CobolFull_fixedListener)listener).enterDataItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolFull_fixedListener ) ((CobolFull_fixedListener)listener).exitDataItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolFull_fixedVisitor ) return ((CobolFull_fixedVisitor<? extends T>)visitor).visitDataItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataItemContext dataItem() throws RecognitionException {
		DataItemContext _localctx = new DataItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dataItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(NUMBER);
			setState(46);
			match(IDENTIFIER);
			setState(47);
			match(PIC);
			setState(48);
			match(IDENTIFIER);
			setState(49);
			match(DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureDivisionContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(CobolFull_fixedParser.PROCEDURE, 0); }
		public TerminalNode DIVISION() { return getToken(CobolFull_fixedParser.DIVISION, 0); }
		public TerminalNode DOT() { return getToken(CobolFull_fixedParser.DOT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProcedureDivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDivision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolFull_fixedListener ) ((CobolFull_fixedListener)listener).enterProcedureDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolFull_fixedListener ) ((CobolFull_fixedListener)listener).exitProcedureDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolFull_fixedVisitor ) return ((CobolFull_fixedVisitor<? extends T>)visitor).visitProcedureDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDivisionContext procedureDivision() throws RecognitionException {
		ProcedureDivisionContext _localctx = new ProcedureDivisionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procedureDivision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(PROCEDURE);
			setState(52);
			match(DIVISION);
			setState(53);
			match(DOT);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11776L) != 0)) {
				{
				{
				setState(54);
				statement();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DisplayStmtContext displayStmt() {
			return getRuleContext(DisplayStmtContext.class,0);
		}
		public MoveStmtContext moveStmt() {
			return getRuleContext(MoveStmtContext.class,0);
		}
		public AddStmtContext addStmt() {
			return getRuleContext(AddStmtContext.class,0);
		}
		public StopStmtContext stopStmt() {
			return getRuleContext(StopStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolFull_fixedListener ) ((CobolFull_fixedListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolFull_fixedListener ) ((CobolFull_fixedListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolFull_fixedVisitor ) return ((CobolFull_fixedVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISPLAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				displayStmt();
				}
				break;
			case MOVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				moveStmt();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				addStmt();
				}
				break;
			case STOP:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				stopStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DisplayStmtContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(CobolFull_fixedParser.DISPLAY, 0); }
		public TerminalNode STRING() { return getToken(CobolFull_fixedParser.STRING, 0); }
		public TerminalNode DOT() { return getToken(CobolFull_fixedParser.DOT, 0); }
		public DisplayStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolFull_fixedListener ) ((CobolFull_fixedListener)listener).enterDisplayStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolFull_fixedListener ) ((CobolFull_fixedListener)listener).exitDisplayStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolFull_fixedVisitor ) return ((CobolFull_fixedVisitor<? extends T>)visitor).visitDisplayStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayStmtContext displayStmt() throws RecognitionException {
		DisplayStmtContext _localctx = new DisplayStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_displayStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(DISPLAY);
			setState(67);
			match(STRING);
			setState(68);
			match(DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MoveStmtContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(CobolFull_fixedParser.MOVE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CobolFull_fixedParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CobolFull_fixedParser.IDENTIFIER, i);
		}
		public TerminalNode TO() { return getToken(CobolFull_fixedParser.TO, 0); }
		public TerminalNode DOT() { return getToken(CobolFull_fixedParser.DOT, 0); }
		public MoveStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolFull_fixedListener ) ((CobolFull_fixedListener)listener).enterMoveStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolFull_fixedListener ) ((CobolFull_fixedListener)listener).exitMoveStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolFull_fixedVisitor ) return ((CobolFull_fixedVisitor<? extends T>)visitor).visitMoveStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveStmtContext moveStmt() throws RecognitionException {
		MoveStmtContext _localctx = new MoveStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_moveStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(MOVE);
			setState(71);
			match(IDENTIFIER);
			setState(72);
			match(TO);
			setState(73);
			match(IDENTIFIER);
			setState(74);
			match(DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddStmtContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CobolFull_fixedParser.ADD, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CobolFull_fixedParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CobolFull_fixedParser.IDENTIFIER, i);
		}
		public TerminalNode TO() { return getToken(CobolFull_fixedParser.TO, 0); }
		public TerminalNode DOT() { return getToken(CobolFull_fixedParser.DOT, 0); }
		public AddStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolFull_fixedListener ) ((CobolFull_fixedListener)listener).enterAddStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolFull_fixedListener ) ((CobolFull_fixedListener)listener).exitAddStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolFull_fixedVisitor ) return ((CobolFull_fixedVisitor<? extends T>)visitor).visitAddStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddStmtContext addStmt() throws RecognitionException {
		AddStmtContext _localctx = new AddStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_addStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ADD);
			setState(77);
			match(IDENTIFIER);
			setState(78);
			match(TO);
			setState(79);
			match(IDENTIFIER);
			setState(80);
			match(DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StopStmtContext extends ParserRuleContext {
		public TerminalNode STOP() { return getToken(CobolFull_fixedParser.STOP, 0); }
		public TerminalNode RUN() { return getToken(CobolFull_fixedParser.RUN, 0); }
		public TerminalNode DOT() { return getToken(CobolFull_fixedParser.DOT, 0); }
		public StopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CobolFull_fixedListener ) ((CobolFull_fixedListener)listener).enterStopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CobolFull_fixedListener ) ((CobolFull_fixedListener)listener).exitStopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CobolFull_fixedVisitor ) return ((CobolFull_fixedVisitor<? extends T>)visitor).visitStopStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StopStmtContext stopStmt() throws RecognitionException {
		StopStmtContext _localctx = new StopStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stopStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(STOP);
			setState(83);
			match(RUN);
			setState(84);
			match(DOT);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0013W\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002)\b\u0002"+
		"\n\u0002\f\u0002,\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u00048\b\u0004\n\u0004\f\u0004;\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005A\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0000\u0000Q\u0000\u0014\u0001\u0000\u0000"+
		"\u0000\u0002\u0019\u0001\u0000\u0000\u0000\u0004!\u0001\u0000\u0000\u0000"+
		"\u0006-\u0001\u0000\u0000\u0000\b3\u0001\u0000\u0000\u0000\n@\u0001\u0000"+
		"\u0000\u0000\fB\u0001\u0000\u0000\u0000\u000eF\u0001\u0000\u0000\u0000"+
		"\u0010L\u0001\u0000\u0000\u0000\u0012R\u0001\u0000\u0000\u0000\u0014\u0015"+
		"\u0003\u0002\u0001\u0000\u0015\u0016\u0003\u0004\u0002\u0000\u0016\u0017"+
		"\u0003\b\u0004\u0000\u0017\u0018\u0005\u0000\u0000\u0001\u0018\u0001\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0005\u0001\u0000\u0000\u001a\u001b\u0005"+
		"\u0002\u0000\u0000\u001b\u001c\u0005\u000f\u0000\u0000\u001c\u001d\u0005"+
		"\u0003\u0000\u0000\u001d\u001e\u0005\u000f\u0000\u0000\u001e\u001f\u0005"+
		"\u0010\u0000\u0000\u001f \u0005\u000f\u0000\u0000 \u0003\u0001\u0000\u0000"+
		"\u0000!\"\u0005\u0004\u0000\u0000\"#\u0005\u0002\u0000\u0000#$\u0005\u000f"+
		"\u0000\u0000$%\u0005\u0005\u0000\u0000%&\u0005\u0006\u0000\u0000&*\u0005"+
		"\u000f\u0000\u0000\')\u0003\u0006\u0003\u0000(\'\u0001\u0000\u0000\u0000"+
		"),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+\u0005\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0005"+
		"\u0011\u0000\u0000./\u0005\u0010\u0000\u0000/0\u0005\u0007\u0000\u0000"+
		"01\u0005\u0010\u0000\u000012\u0005\u000f\u0000\u00002\u0007\u0001\u0000"+
		"\u0000\u000034\u0005\b\u0000\u000045\u0005\u0002\u0000\u000059\u0005\u000f"+
		"\u0000\u000068\u0003\n\u0005\u000076\u0001\u0000\u0000\u00008;\u0001\u0000"+
		"\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:\t\u0001"+
		"\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<A\u0003\f\u0006\u0000=A\u0003"+
		"\u000e\u0007\u0000>A\u0003\u0010\b\u0000?A\u0003\u0012\t\u0000@<\u0001"+
		"\u0000\u0000\u0000@=\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"@?\u0001\u0000\u0000\u0000A\u000b\u0001\u0000\u0000\u0000BC\u0005\t\u0000"+
		"\u0000CD\u0005\u0012\u0000\u0000DE\u0005\u000f\u0000\u0000E\r\u0001\u0000"+
		"\u0000\u0000FG\u0005\n\u0000\u0000GH\u0005\u0010\u0000\u0000HI\u0005\f"+
		"\u0000\u0000IJ\u0005\u0010\u0000\u0000JK\u0005\u000f\u0000\u0000K\u000f"+
		"\u0001\u0000\u0000\u0000LM\u0005\u000b\u0000\u0000MN\u0005\u0010\u0000"+
		"\u0000NO\u0005\f\u0000\u0000OP\u0005\u0010\u0000\u0000PQ\u0005\u000f\u0000"+
		"\u0000Q\u0011\u0001\u0000\u0000\u0000RS\u0005\r\u0000\u0000ST\u0005\u000e"+
		"\u0000\u0000TU\u0005\u000f\u0000\u0000U\u0013\u0001\u0000\u0000\u0000"+
		"\u0003*9@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}