package bec.analisadorLexico.main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import bec.analisadorLexico.parser.PascalLangLexer;
import bec.analisadorLexico.parser.PascalLangParser;

/*
* Classe para interagir com o usuário, apontando o arquivo fonte
* Arquivo fonte: .pas
*/

public class MainClass {
	public static void main(String[] args) {
		try {
			PascalLangLexer lexer;
			PascalLangParser parser;
			
			lexer = new PascalLangLexer(CharStreams.fromFileName("main.pas"));
			
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			parser = new PascalLangParser(tokenStream);
			parser.programa();
			
			System.out.println("Compilado com sucesso");
		}
		catch(Exception ex) {
			System.err.println("ERROR "+ex.getMessage());
		}
	}
}
