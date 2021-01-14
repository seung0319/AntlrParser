package expression;

import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class MyErrorSyntaxListener extends BaseErrorListener {
	public static boolean hasError = false;
	@Override
	public void syntaxError(
			Recognizer<?, ?> recognizer, 
			Object offendingSymbol, 
			int line, 
			int charPositionInLine,
			String msg, RecognitionException e) {
		hasError = true;
		
	/*	List<String> stack = ((Parser) recognizer).getRuleInvocationStack();	
		Collections.reverse(stack);
		System.err.println("Syntax Error!");
		System.err.println("Token" + "\"" + ((Token) offendingSymbol).getText() + "\""
				+ "(line " + line + ", column " + (charPositionInLine + 1) + ")"
				+ ": " + msg);
		System.err.println("Rule Stack: " + stack);*/
		
		 if (msg.contains("missing")) {
			 System.err.println("(Syntax error at line:" + line + ") " + "missing -> " + ((Token) offendingSymbol).getText());
         } else if (msg.contains("extraneous input")){
        	 System.err.println("(Syntax error at line:" + line+ ") " + "extra character/s -> " + ((Token) offendingSymbol).getText());
         }
         else if(msg.contains("mismatched input")){
        	 System.err.println("(Syntax error at line:" + line + ") " + "unexpected -> " + ((Token) offendingSymbol).getText());
         }
         else if(msg.contains("no viable alternative at input")){
             //String test = listener.getSyntaxErrors().get(i).getOffendingSymbol().toString();
             //test = test.split("'")[1];
             System.err.println("(Syntax error at line:" + line + ") " + "consider changing symbol in expression -> " + ((Token) offendingSymbol).getText());
         }
         else if(msg.contains("cannot find symbol")){
        	 System.err.println("(Syntax error at line:" + line + ") " + "missing symbol -> " + ((Token) offendingSymbol).getText());
         }
         else {
        	 System.err.println("(Syntax error at line:" + line + ") " + ((Token) offendingSymbol).getText());
         }
	}
	
}
