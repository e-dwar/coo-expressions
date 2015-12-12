package main;

import environment.*;
import evaluator.*;
import expression.*;
import printer.*;

public class Main {

	public static void main (String[] args) {
		int result = 0;
		Environment env = new Environment();
		Expression e = createExpression(env);
		try {
			result = e.eval(new Evaluator(), env);
		} catch (UnboundVariable e1) {
			try {
				log(e1.getMessage() + " (TTOTT)");
				log("Bullet proof evaluator to the rescue!");
				result = e.eval(new BulletProofEvaluator(), env);
			} catch (UnboundVariable e2) {
				e2.printStackTrace();
			}
		}
		log(e.print(new PostfixPrinter()) + "	= " + result);
		log(e.print(new PrefixPrinter()) + "	= " + result);
		log(e.print(new InfixPrinter()) + "	= " + result);
	}
	
	// 4 * (1 + 3) / 2 = 1
	private static Expression createExpression(Environment env) {
		Literal one = new Literal(1);
		Literal two = new Literal(2);
		Literal three = new Literal(3);
		Variable four = new Variable("four");
		//env.setValue(four, new Literal(4));
		return new Div(new Mult(four, new Plus(one, three)), two);
	}
	
	private static void log(String message) {
		System.out.println(message);
	}
}
