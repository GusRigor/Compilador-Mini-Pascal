// Generated from PascalLang.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Digito=1, Letra=2, Relacao=3, PROGRAM=4, PROCEDURE=5, VAR=6, BEGIN=7, 
		END=8, THEN=9, ELSE=10, WHILE=11, DO=12, OR=13, DIV=14, AND=15, NOT=16, 
		Integer=17, Real=18, Boolean=19, Char=20, String=21, TRUE=22, FALSE=23, 
		PLUS=24, MINUS=25, TIMES=26, AP=27, FP=28, PV=29, VG=30, DP=31, ATB=32, 
		IF=33, WS=34;
	public static final String[] tokenNames = {
		"<INVALID>", "Digito", "Letra", "Relacao", "'program'", "'procedure'", 
		"'var'", "'begin'", "'end.'", "'then'", "'else'", "'while'", "'do'", "'or'", 
		"'div'", "'and'", "'not'", "'integer'", "'real'", "'boolean'", "'char'", 
		"'String'", "'TRUE'", "'FALSE'", "'+'", "'-'", "'*'", "'('", "')'", "';'", 
		"','", "':'", "':='", "'if'", "WS"
	};
	public static final int
		RULE_programa = 0, RULE_bloco = 1, RULE_part_decl_var = 2, RULE_decl_vars = 3, 
		RULE_lista_identificadores = 4, RULE_part_decl_sub_rotinas = 5, RULE_decl_procedimento = 6, 
		RULE_parametr_formais = 7, RULE_selec_parametr_formais = 8, RULE_comando_composto = 9, 
		RULE_comando = 10, RULE_atribuicao = 11, RULE_chamada_procedimento = 12, 
		RULE_comando_condicional = 13, RULE_comando_repetitivo = 14, RULE_expressao = 15, 
		RULE_expressao_simples = 16, RULE_termo = 17, RULE_fator = 18, RULE_variavel = 19, 
		RULE_list_expressoes = 20, RULE_numero = 21, RULE_identificador = 22, 
		RULE_tipo = 23;
	public static final String[] ruleNames = {
		"programa", "bloco", "part_decl_var", "decl_vars", "lista_identificadores", 
		"part_decl_sub_rotinas", "decl_procedimento", "parametr_formais", "selec_parametr_formais", 
		"comando_composto", "comando", "atribuicao", "chamada_procedimento", "comando_condicional", 
		"comando_repetitivo", "expressao", "expressao_simples", "termo", "fator", 
		"variavel", "list_expressoes", "numero", "identificador", "tipo"
	};

	@Override
	public String getGrammarFileName() { return "PascalLang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PascalLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode PV() { return getToken(PascalLangParser.PV, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode PROGRAM() { return getToken(PascalLangParser.PROGRAM, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(PROGRAM);
			setState(49); identificador();
			setState(50); match(PV);
			setState(51); bloco();
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

	public static class BlocoContext extends ParserRuleContext {
		public Part_decl_sub_rotinasContext part_decl_sub_rotinas() {
			return getRuleContext(Part_decl_sub_rotinasContext.class,0);
		}
		public Comando_compostoContext comando_composto() {
			return getRuleContext(Comando_compostoContext.class,0);
		}
		public Part_decl_varContext part_decl_var() {
			return getRuleContext(Part_decl_varContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Integer) | (1L << Real) | (1L << Boolean) | (1L << Char) | (1L << String))) != 0)) {
				{
				setState(53); part_decl_var();
				}
			}

			setState(57);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(56); part_decl_sub_rotinas();
				}
				break;
			}
			setState(59); comando_composto();
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

	public static class Part_decl_varContext extends ParserRuleContext {
		public TerminalNode PV(int i) {
			return getToken(PascalLangParser.PV, i);
		}
		public List<TerminalNode> PV() { return getTokens(PascalLangParser.PV); }
		public List<Decl_varsContext> decl_vars() {
			return getRuleContexts(Decl_varsContext.class);
		}
		public Decl_varsContext decl_vars(int i) {
			return getRuleContext(Decl_varsContext.class,i);
		}
		public Part_decl_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part_decl_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterPart_decl_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitPart_decl_var(this);
		}
	}

	public final Part_decl_varContext part_decl_var() throws RecognitionException {
		Part_decl_varContext _localctx = new Part_decl_varContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_part_decl_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61); decl_vars();
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62); match(PV);
					setState(63); decl_vars();
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(69); match(PV);
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

	public static class Decl_varsContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Lista_identificadoresContext lista_identificadores() {
			return getRuleContext(Lista_identificadoresContext.class,0);
		}
		public Decl_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterDecl_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitDecl_vars(this);
		}
	}

	public final Decl_varsContext decl_vars() throws RecognitionException {
		Decl_varsContext _localctx = new Decl_varsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); tipo();
			setState(72); lista_identificadores();
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

	public static class Lista_identificadoresContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode VG(int i) {
			return getToken(PascalLangParser.VG, i);
		}
		public List<TerminalNode> VG() { return getTokens(PascalLangParser.VG); }
		public Lista_identificadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_identificadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterLista_identificadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitLista_identificadores(this);
		}
	}

	public final Lista_identificadoresContext lista_identificadores() throws RecognitionException {
		Lista_identificadoresContext _localctx = new Lista_identificadoresContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lista_identificadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); identificador();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VG) {
				{
				{
				setState(75); match(VG);
				setState(76); identificador();
				}
				}
				setState(81);
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

	public static class Part_decl_sub_rotinasContext extends ParserRuleContext {
		public List<Decl_procedimentoContext> decl_procedimento() {
			return getRuleContexts(Decl_procedimentoContext.class);
		}
		public TerminalNode PV(int i) {
			return getToken(PascalLangParser.PV, i);
		}
		public Decl_procedimentoContext decl_procedimento(int i) {
			return getRuleContext(Decl_procedimentoContext.class,i);
		}
		public List<TerminalNode> PV() { return getTokens(PascalLangParser.PV); }
		public Part_decl_sub_rotinasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part_decl_sub_rotinas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterPart_decl_sub_rotinas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitPart_decl_sub_rotinas(this);
		}
	}

	public final Part_decl_sub_rotinasContext part_decl_sub_rotinas() throws RecognitionException {
		Part_decl_sub_rotinasContext _localctx = new Part_decl_sub_rotinasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_part_decl_sub_rotinas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCEDURE) {
				{
				{
				setState(82); decl_procedimento();
				setState(83); match(PV);
				}
				}
				setState(89);
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

	public static class Decl_procedimentoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode PV() { return getToken(PascalLangParser.PV, 0); }
		public TerminalNode PROCEDURE() { return getToken(PascalLangParser.PROCEDURE, 0); }
		public Parametr_formaisContext parametr_formais() {
			return getRuleContext(Parametr_formaisContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Decl_procedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_procedimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterDecl_procedimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitDecl_procedimento(this);
		}
	}

	public final Decl_procedimentoContext decl_procedimento() throws RecognitionException {
		Decl_procedimentoContext _localctx = new Decl_procedimentoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl_procedimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(PROCEDURE);
			setState(91); identificador();
			setState(93);
			_la = _input.LA(1);
			if (_la==AP) {
				{
				setState(92); parametr_formais();
				}
			}

			setState(95); match(PV);
			setState(96); bloco();
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

	public static class Parametr_formaisContext extends ParserRuleContext {
		public TerminalNode PV(int i) {
			return getToken(PascalLangParser.PV, i);
		}
		public TerminalNode AP() { return getToken(PascalLangParser.AP, 0); }
		public List<TerminalNode> PV() { return getTokens(PascalLangParser.PV); }
		public List<Selec_parametr_formaisContext> selec_parametr_formais() {
			return getRuleContexts(Selec_parametr_formaisContext.class);
		}
		public Selec_parametr_formaisContext selec_parametr_formais(int i) {
			return getRuleContext(Selec_parametr_formaisContext.class,i);
		}
		public TerminalNode FP() { return getToken(PascalLangParser.FP, 0); }
		public Parametr_formaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametr_formais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterParametr_formais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitParametr_formais(this);
		}
	}

	public final Parametr_formaisContext parametr_formais() throws RecognitionException {
		Parametr_formaisContext _localctx = new Parametr_formaisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametr_formais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(AP);
			setState(99); selec_parametr_formais();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PV) {
				{
				{
				setState(100); match(PV);
				setState(101); selec_parametr_formais();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107); match(FP);
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

	public static class Selec_parametr_formaisContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode VAR() { return getToken(PascalLangParser.VAR, 0); }
		public TerminalNode DP() { return getToken(PascalLangParser.DP, 0); }
		public Lista_identificadoresContext lista_identificadores() {
			return getRuleContext(Lista_identificadoresContext.class,0);
		}
		public Selec_parametr_formaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selec_parametr_formais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterSelec_parametr_formais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitSelec_parametr_formais(this);
		}
	}

	public final Selec_parametr_formaisContext selec_parametr_formais() throws RecognitionException {
		Selec_parametr_formaisContext _localctx = new Selec_parametr_formaisContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selec_parametr_formais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(109); match(VAR);
				}
			}

			setState(112); lista_identificadores();
			setState(113); match(DP);
			setState(114); identificador();
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

	public static class Comando_compostoContext extends ParserRuleContext {
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public TerminalNode PV(int i) {
			return getToken(PascalLangParser.PV, i);
		}
		public List<TerminalNode> PV() { return getTokens(PascalLangParser.PV); }
		public TerminalNode BEGIN() { return getToken(PascalLangParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PascalLangParser.END, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public Comando_compostoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_composto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterComando_composto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitComando_composto(this);
		}
	}

	public final Comando_compostoContext comando_composto() throws RecognitionException {
		Comando_compostoContext _localctx = new Comando_compostoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comando_composto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(BEGIN);
			setState(117); comando();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PV) {
				{
				{
				setState(118); match(PV);
				setState(119); comando();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125); match(END);
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

	public static class ComandoContext extends ParserRuleContext {
		public Comando_condicionalContext comando_condicional() {
			return getRuleContext(Comando_condicionalContext.class,0);
		}
		public Comando_compostoContext comando_composto() {
			return getRuleContext(Comando_compostoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public Comando_repetitivoContext comando_repetitivo() {
			return getRuleContext(Comando_repetitivoContext.class,0);
		}
		public Chamada_procedimentoContext chamada_procedimento() {
			return getRuleContext(Chamada_procedimentoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comando);
		try {
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127); atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128); chamada_procedimento();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129); comando_composto();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130); comando_condicional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(131); comando_repetitivo();
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ATB() { return getToken(PascalLangParser.ATB, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); variavel();
			setState(135); match(ATB);
			setState(136); expressao();
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

	public static class Chamada_procedimentoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode AP() { return getToken(PascalLangParser.AP, 0); }
		public List_expressoesContext list_expressoes() {
			return getRuleContext(List_expressoesContext.class,0);
		}
		public TerminalNode FP() { return getToken(PascalLangParser.FP, 0); }
		public Chamada_procedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_procedimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterChamada_procedimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitChamada_procedimento(this);
		}
	}

	public final Chamada_procedimentoContext chamada_procedimento() throws RecognitionException {
		Chamada_procedimentoContext _localctx = new Chamada_procedimentoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_chamada_procedimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); identificador();
			setState(143);
			_la = _input.LA(1);
			if (_la==AP) {
				{
				setState(139); match(AP);
				setState(140); list_expressoes();
				setState(141); match(FP);
				}
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

	public static class Comando_condicionalContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PascalLangParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(PascalLangParser.IF, 0); }
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PascalLangParser.THEN, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public Comando_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterComando_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitComando_condicional(this);
		}
	}

	public final Comando_condicionalContext comando_condicional() throws RecognitionException {
		Comando_condicionalContext _localctx = new Comando_condicionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comando_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(IF);
			setState(146); expressao();
			setState(147); match(THEN);
			setState(148); comando();
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(149); match(ELSE);
				setState(150); comando();
				}
				break;
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

	public static class Comando_repetitivoContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(PascalLangParser.DO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(PascalLangParser.WHILE, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public Comando_repetitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_repetitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterComando_repetitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitComando_repetitivo(this);
		}
	}

	public final Comando_repetitivoContext comando_repetitivo() throws RecognitionException {
		Comando_repetitivoContext _localctx = new Comando_repetitivoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comando_repetitivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); match(WHILE);
			setState(154); expressao();
			setState(155); match(DO);
			setState(156); comando();
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

	public static class ExpressaoContext extends ParserRuleContext {
		public Expressao_simplesContext expressao_simples(int i) {
			return getRuleContext(Expressao_simplesContext.class,i);
		}
		public TerminalNode Relacao() { return getToken(PascalLangParser.Relacao, 0); }
		public List<Expressao_simplesContext> expressao_simples() {
			return getRuleContexts(Expressao_simplesContext.class);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); expressao_simples();
			setState(161);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(159); match(Relacao);
				setState(160); expressao_simples();
				}
				break;
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

	public static class Expressao_simplesContext extends ParserRuleContext {
		public TerminalNode MINUS(int i) {
			return getToken(PascalLangParser.MINUS, i);
		}
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PascalLangParser.PLUS); }
		public List<TerminalNode> MINUS() { return getTokens(PascalLangParser.MINUS); }
		public List<TerminalNode> OR() { return getTokens(PascalLangParser.OR); }
		public TerminalNode PLUS(int i) {
			return getToken(PascalLangParser.PLUS, i);
		}
		public TerminalNode OR(int i) {
			return getToken(PascalLangParser.OR, i);
		}
		public Expressao_simplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_simples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterExpressao_simples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitExpressao_simples(this);
		}
	}

	public final Expressao_simplesContext expressao_simples() throws RecognitionException {
		Expressao_simplesContext _localctx = new Expressao_simplesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressao_simples);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(163);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(166); termo();
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(168); termo();
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class TermoContext extends ParserRuleContext {
		public TerminalNode AND(int i) {
			return getToken(PascalLangParser.AND, i);
		}
		public TerminalNode TIMES(int i) {
			return getToken(PascalLangParser.TIMES, i);
		}
		public List<TerminalNode> TIMES() { return getTokens(PascalLangParser.TIMES); }
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public List<TerminalNode> AND() { return getTokens(PascalLangParser.AND); }
		public List<TerminalNode> DIV() { return getTokens(PascalLangParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(PascalLangParser.DIV, i);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_termo);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174); fator();
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(175);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << AND) | (1L << TIMES))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(176); fator();
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class FatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(PascalLangParser.NOT, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode AP() { return getToken(PascalLangParser.AP, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode FP() { return getToken(PascalLangParser.FP, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fator);
		try {
			setState(190);
			switch (_input.LA(1)) {
			case Letra:
				enterOuterAlt(_localctx, 1);
				{
				setState(182); variavel();
				}
				break;
			case Digito:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); numero();
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 3);
				{
				setState(184); match(AP);
				setState(185); expressao();
				setState(186); match(FP);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(188); match(NOT);
				setState(189); fator();
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

	public static class VariavelContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variavel);
		try {
			setState(197);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192); identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193); identificador();
				setState(195);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(194); expressao();
					}
					break;
				}
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

	public static class List_expressoesContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public TerminalNode VG(int i) {
			return getToken(PascalLangParser.VG, i);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VG() { return getTokens(PascalLangParser.VG); }
		public List_expressoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_expressoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterList_expressoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitList_expressoes(this);
		}
	}

	public final List_expressoesContext list_expressoes() throws RecognitionException {
		List_expressoesContext _localctx = new List_expressoesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_list_expressoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); expressao();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VG) {
				{
				{
				setState(200); match(VG);
				setState(201); expressao();
				}
				}
				setState(206);
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

	public static class NumeroContext extends ParserRuleContext {
		public List<TerminalNode> Digito() { return getTokens(PascalLangParser.Digito); }
		public TerminalNode Digito(int i) {
			return getToken(PascalLangParser.Digito, i);
		}
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); match(Digito);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Digito) {
				{
				{
				setState(208); match(Digito);
				}
				}
				setState(213);
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

	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> Letra() { return getTokens(PascalLangParser.Letra); }
		public TerminalNode Letra(int i) {
			return getToken(PascalLangParser.Letra, i);
		}
		public List<TerminalNode> Digito() { return getTokens(PascalLangParser.Digito); }
		public TerminalNode Digito(int i) {
			return getToken(PascalLangParser.Digito, i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identificador);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214); match(Letra);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(215);
					_la = _input.LA(1);
					if ( !(_la==Digito || _la==Letra) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode Char() { return getToken(PascalLangParser.Char, 0); }
		public TerminalNode String() { return getToken(PascalLangParser.String, 0); }
		public TerminalNode Integer() { return getToken(PascalLangParser.Integer, 0); }
		public TerminalNode Real() { return getToken(PascalLangParser.Real, 0); }
		public TerminalNode Boolean() { return getToken(PascalLangParser.Boolean, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLangListener ) ((PascalLangListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Integer) | (1L << Real) | (1L << Boolean) | (1L << Char) | (1L << String))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00e2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\5\39\n\3\3\3\5\3<\n\3\3\3\3\3\3\4\3\4\3\4\7\4"+
		"C\n\4\f\4\16\4F\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\7\6P\n\6\f\6\16\6"+
		"S\13\6\3\7\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\b\3\b\3\b\5\b`\n\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\7\ti\n\t\f\t\16\tl\13\t\3\t\3\t\3\n\5\nq\n\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13{\n\13\f\13\16\13~\13\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\5\f\u0087\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u0092\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u009a\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00a4\n\21\3\22\5\22\u00a7"+
		"\n\22\3\22\3\22\3\22\7\22\u00ac\n\22\f\22\16\22\u00af\13\22\3\23\3\23"+
		"\3\23\7\23\u00b4\n\23\f\23\16\23\u00b7\13\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00c1\n\24\3\25\3\25\3\25\5\25\u00c6\n\25\5\25\u00c8"+
		"\n\25\3\26\3\26\3\26\7\26\u00cd\n\26\f\26\16\26\u00d0\13\26\3\27\3\27"+
		"\7\27\u00d4\n\27\f\27\16\27\u00d7\13\27\3\30\3\30\7\30\u00db\n\30\f\30"+
		"\16\30\u00de\13\30\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\2\7\3\2\32\33\4\2\17\17\32\33\4\2\20\21\34\34\3"+
		"\2\3\4\3\2\23\27\u00e4\2\62\3\2\2\2\48\3\2\2\2\6?\3\2\2\2\bI\3\2\2\2\n"+
		"L\3\2\2\2\fY\3\2\2\2\16\\\3\2\2\2\20d\3\2\2\2\22p\3\2\2\2\24v\3\2\2\2"+
		"\26\u0086\3\2\2\2\30\u0088\3\2\2\2\32\u008c\3\2\2\2\34\u0093\3\2\2\2\36"+
		"\u009b\3\2\2\2 \u00a0\3\2\2\2\"\u00a6\3\2\2\2$\u00b0\3\2\2\2&\u00c0\3"+
		"\2\2\2(\u00c7\3\2\2\2*\u00c9\3\2\2\2,\u00d1\3\2\2\2.\u00d8\3\2\2\2\60"+
		"\u00df\3\2\2\2\62\63\7\6\2\2\63\64\5.\30\2\64\65\7\37\2\2\65\66\5\4\3"+
		"\2\66\3\3\2\2\2\679\5\6\4\28\67\3\2\2\289\3\2\2\29;\3\2\2\2:<\5\f\7\2"+
		";:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\5\24\13\2>\5\3\2\2\2?D\5\b\5\2@A\7\37"+
		"\2\2AC\5\b\5\2B@\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2"+
		"\2\2GH\7\37\2\2H\7\3\2\2\2IJ\5\60\31\2JK\5\n\6\2K\t\3\2\2\2LQ\5.\30\2"+
		"MN\7 \2\2NP\5.\30\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\13\3\2\2"+
		"\2SQ\3\2\2\2TU\5\16\b\2UV\7\37\2\2VX\3\2\2\2WT\3\2\2\2X[\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z\r\3\2\2\2[Y\3\2\2\2\\]\7\7\2\2]_\5.\30\2^`\5\20\t\2_^"+
		"\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\37\2\2bc\5\4\3\2c\17\3\2\2\2de\7\35\2"+
		"\2ej\5\22\n\2fg\7\37\2\2gi\5\22\n\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3"+
		"\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\36\2\2n\21\3\2\2\2oq\7\b\2\2po\3\2\2\2"+
		"pq\3\2\2\2qr\3\2\2\2rs\5\n\6\2st\7!\2\2tu\5.\30\2u\23\3\2\2\2vw\7\t\2"+
		"\2w|\5\26\f\2xy\7\37\2\2y{\5\26\f\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3"+
		"\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\n\2\2\u0080\25\3\2\2\2\u0081"+
		"\u0087\5\30\r\2\u0082\u0087\5\32\16\2\u0083\u0087\5\24\13\2\u0084\u0087"+
		"\5\34\17\2\u0085\u0087\5\36\20\2\u0086\u0081\3\2\2\2\u0086\u0082\3\2\2"+
		"\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\27"+
		"\3\2\2\2\u0088\u0089\5(\25\2\u0089\u008a\7\"\2\2\u008a\u008b\5 \21\2\u008b"+
		"\31\3\2\2\2\u008c\u0091\5.\30\2\u008d\u008e\7\35\2\2\u008e\u008f\5*\26"+
		"\2\u008f\u0090\7\36\2\2\u0090\u0092\3\2\2\2\u0091\u008d\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\33\3\2\2\2\u0093\u0094\7#\2\2\u0094\u0095\5 \21\2"+
		"\u0095\u0096\7\13\2\2\u0096\u0099\5\26\f\2\u0097\u0098\7\f\2\2\u0098\u009a"+
		"\5\26\f\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\35\3\2\2\2\u009b"+
		"\u009c\7\r\2\2\u009c\u009d\5 \21\2\u009d\u009e\7\16\2\2\u009e\u009f\5"+
		"\26\f\2\u009f\37\3\2\2\2\u00a0\u00a3\5\"\22\2\u00a1\u00a2\7\5\2\2\u00a2"+
		"\u00a4\5\"\22\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4!\3\2\2\2"+
		"\u00a5\u00a7\t\2\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00ad\5$\23\2\u00a9\u00aa\t\3\2\2\u00aa\u00ac\5$\23\2\u00ab"+
		"\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae#\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b5\5&\24\2\u00b1\u00b2"+
		"\t\4\2\2\u00b2\u00b4\5&\24\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6%\3\2\2\2\u00b7\u00b5\3\2\2\2"+
		"\u00b8\u00c1\5(\25\2\u00b9\u00c1\5,\27\2\u00ba\u00bb\7\35\2\2\u00bb\u00bc"+
		"\5 \21\2\u00bc\u00bd\7\36\2\2\u00bd\u00c1\3\2\2\2\u00be\u00bf\7\22\2\2"+
		"\u00bf\u00c1\5&\24\2\u00c0\u00b8\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c0\u00ba"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\'\3\2\2\2\u00c2\u00c8\5.\30\2\u00c3"+
		"\u00c5\5.\30\2\u00c4\u00c6\5 \21\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8"+
		")\3\2\2\2\u00c9\u00ce\5 \21\2\u00ca\u00cb\7 \2\2\u00cb\u00cd\5 \21\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf+\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d5\7\3\2\2\u00d2\u00d4"+
		"\7\3\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6-\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00dc\7\4\2\2"+
		"\u00d9\u00db\t\5\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd/\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e0\t\6\2\2\u00e0\61\3\2\2\2\308;DQY_jp|\u0086\u0091\u0099\u00a3\u00a6"+
		"\u00ad\u00b5\u00c0\u00c5\u00c7\u00ce\u00d5\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}