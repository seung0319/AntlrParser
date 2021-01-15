package app;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.IntervalSet;
import org.antlr.v4.runtime.misc.ParseCancellationException;
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
			//parser.setErrorHandler(new DefaultErrorStrategy());
			/*parser.setErrorHandler(new DefaultErrorStrategy() {
				 @Override
			        public void recover(Parser recognizer, RecognitionException e) {
			          //  if (lastErrorIndex==recognizer.getInputStream().index() && lastErrorStates != null && lastErrorStates.contains(recognizer.getState())) {
			            	recognizer.consume();
			           // }
			            if(lastErrorStates ==null)
			            	lastErrorStates = new IntervalSet();
			            lastErrorStates.add(recognizer.getState());
			            IntervalSet followSet = getErrorRecoverySet(recognizer);
			          consumeUntil(recognizer, followSet);
			            int currenttoken= ((Token) e.getOffendingToken()).getTokenIndex();
			            System.out.println(followSet.getIntervals() + " " + ((Parser)recognizer).getTokenStream().get(currenttoken).getText() + " "+ recognizer.getInputStream().index());
			        }
				/*
				 public Token recoverInline(Parser recognizer)
				            throws RecognitionException
				        {
				            InputMismatchException e = new InputMismatchException(recognizer);
				            for (ParserRuleContext context = recognizer.getContext(); context != null; context = context.getParent()) {
				                context.exception = e;
				            }
				            

				            throw new ParseCancellationException(e);
				        }*/
				
		//	});
			/*
			parser.setErrorHandler(new DefaultErrorStrategy() {
				@Override
		        public void recover(Parser recognizer, RecognitionException e) {
//			        System.out.println("recover in "+recognizer.getRuleInvocationStack()+
//			                           " index="+recognizer.getInputStream().index()+
//			                           ", lastErrorIndex="+
//			                           lastErrorIndex+
//			                           ", states="+lastErrorStates);
			        if ( lastErrorIndex==recognizer.getInputStream().index() &&
			            lastErrorStates != null &&
			            lastErrorStates.contains(recognizer.getState()) ) {
			            // uh oh, another error at same token index and previously-visited
			            // state in ATN; must be a case where LT(1) is in the recovery
			            // token set so nothing got consumed. Consume a single token
			            // at least to prevent an infinite loop; this is a failsafe.
//			            System.err.println("seen error condition before index="+
//			                               lastErrorIndex+", states="+lastErrorStates);
//			            System.err.println("FAILSAFE consumes "+recognizer.getTokenNames()[recognizer.getInputStream().LA(1)]);
			            recognizer.consume();
			        }
			        lastErrorIndex = recognizer.getInputStream().index();
			        if ( lastErrorStates==null ) lastErrorStates = new IntervalSet();
			        lastErrorStates.add(recognizer.getState());
			        IntervalSet followSet = getErrorRecoverySet(recognizer);
			        consumeUntil(recognizer, followSet);
			    }
			});
			*/
			//parser.addErrorListener(new SyntaxErrorListener());
			parser.addErrorListener(new MyErrorSyntaxListener());
		}catch(IOException e) {
			e.printStackTrace();
		}
		return parser;
	}

}
