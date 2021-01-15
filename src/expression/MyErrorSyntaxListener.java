package expression;

import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

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
		/*
		List<String> stack = ((Parser) recognizer).getRuleInvocationStack();	
		Collections.reverse(stack);
		System.err.println("Syntax Error!");
		System.err.println("Token" + "\"" + ((Token) offendingSymbol).getText() + "\""
				+ "(line " + line + ", column " + (charPositionInLine + 1) + ")"
				+ ": " + msg);
		System.err.println("Rule Stack: " + stack);
		
	
		
		//System.out.println(recognizer.getTokenType(recognizer.getErrorHeader(e)));
		System.out.println(((Token) offendingSymbol).getType());
		*/
		//System.out.println(((Parser)recognizer).getRuleContext().getParent().getStart().getText());
		//System.out.println(((Parser)recognizer).getExpectedTokens());
		List<Integer> tokentypeList = ((Parser)recognizer).getExpectedTokens().toList();
		String listoferrors="";
		for(int i=0; i<tokentypeList.size(); i++) {
			//System.out.println("aaa"+recognizer.getVocabulary().getDisplayName(tokentypeList.get(i)) );
			 listoferrors= listoferrors + recognizer.getVocabulary().getDisplayName(tokentypeList.get(i))+",";
			 }
		String ErrorParentToken= "";
		String stream="";
		int currenttoken= ((Token) offendingSymbol).getTokenIndex();
		int previoustoken= ((Token) offendingSymbol).getTokenIndex()-1;
		String currentT= ((Parser)recognizer).getTokenStream().get(currenttoken).getText();
		String previousT= ((Parser)recognizer).getTokenStream().get(previoustoken).getText();
		//System.out.println(((Parser)recognizer).getTokenStream().getText((Token) ((Parser)recognizer).getRuleContext().getParent().getStart(),((Token) offendingSymbol)));
		//stream= ((Parser)recognizer).getTokenStream().getText((Token) ((Parser)recognizer).getRuleContext().getParent().getStart(),((Token) offendingSymbol));
		if(((Parser)recognizer).getRuleContext().getParent() != null) {
			ErrorParentToken = ((Parser)recognizer).getRuleContext().getParent().getStart().getText();
			
			
			//System.out.println(((Parser)recognizer).get);
			
			
			//System.out.println(((Parser)recognizer).getTokenStream().get(tokenindex).getText());
		}
		else {
			 ErrorParentToken = "EOF";
			 stream= "EOF";
		}
		//System.out.println(((Parser)recognizer).getTokenStream().getText(((RuleContext) ((Parser) recognizer).getContext())));
		
		//System.out.println(ErrorParentToken);
		 if (msg.contains("missing")) {
			// tokentypeList;
			 
			 System.err.println("(Syntax error at line:" + line + ") " + "missing -> " + listoferrors +msg );
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
