grammar PascalLang;

//Programa e Bloco

programa	: 'program' identificador ';' bloco
			;
			
bloco		: (part_decl_var)? (part_decl_sub_rotinas)? comando_composto
			;

//Declarações

part_decl_var : decl_vars (';' decl_vars)* ';'
			  ;

decl_vars 	: tipo lista_identificadores
			;
			
lista_identificadores	: identificador (',' identificador)*
						;

part_decl_sub_rotinas	: ( decl_procedimento ';')*
						;
						
decl_procedimento	: 'procedure' identificador (parametr_formais)? ';' bloco
					;
					
parametr_formais	: '(' selec_parametr_formais (';' selec_parametr_formais)* ')'
					;
			
selec_parametr_formais	: ('var')? lista_identificadores ':' identificador
						;
						
//Comandos

comando_composto	: 'begin' comando (';' comando)* 'end'
					;
					
comando	: atribuicao | chamada_procedimento | comando_composto | comando_condicional | comando_repetitivo
		;
		
atribuicao	: variavel ':=' expressao
			;
			
chamada_procedimento	: identificador ('(' list_expressoes ')')?
						;
						
comando_condicional	: 'if' expressao 'then' comando ('else' comando)?
					;

comando_repetitivo	: 'while' expressao 'do' comando
					;

//Expressões
expressao	: expressao_simples (relacao expressao_simples)?
			;
					
relacao	: '=' | '<>' | '<' | '<=' | '>=' | '>'
		;
			
expressao_simples	: ('+' | '-')? termo (('+' | '-' | 'or') termo)*
					;
					
termo	: fator (('*' | 'div' | 'and') fator)*
		;
		
fator	: variavel | numero | '('expressao')' | 'not' fator
		;

variavel	: identificador | identificador (expressao)?
			;
			
list_expressoes	: expressao (',' expressao)*
				;		
		
//Números e idetificadores
numero	:digito (digito)*
		;	

digito	: '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'
		;
		
identificador	: letra (letra | digito)*
				;
				
letra	:	'_' | [a-z] | [A-Z] 			
		;			