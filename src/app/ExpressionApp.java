package app;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import expression.MyErrorSyntaxListener;
import parser.ExprLexer;
import parser.ExprParser;

public class ExpressionApp {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.err.println("More than 1 file was selected ");
		}else{
			String filename = args[0];
			ExprParser parser = getParser(filename);
			
			ParseTree antlrAST = parser.program();
		}
	}
	
	private static ExprParser getParser(String filename){
		ExprParser parser = null;
		try {
			CharStream input = CharStreams.fromFileName(filename);
			ExprLexer lexer = new ExprLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parser = new ExprParser(tokens);
			
			//syntax error handling
			parser.removeErrorListeners();
			//parser.addErrorListener(new SyntaxErrorListener());
			parser.addErrorListener(new MyErrorSyntaxListener());
		}catch(IOException e) {
			e.printStackTrace();
		}
		return parser;
	}

}
