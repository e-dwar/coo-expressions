package main;

import visitor.evaluator.*;
import visitor.printer.*;
import environment.*;
import expression.*;
import expression.atomic.*;
import expression.binary.*;
import expression.conditional.If;

public class Main {

	public static void main(String[] args) {
		int result = 0;
		Environment env = new Environment();
		Expression e = createExpression(env);
		try {
			result = e.eval(new StandardEvaluator(), env);
		} catch (UnboundVariableException e1) {
			try {
				log(e1.getMessage() + " (TTOTT)");
				log("Bullet proof evaluator to the rescue!");
				result = e.eval(new BulletProofEvaluator(), env);
			} catch (UnboundVariableException e2) {
				e2.printStackTrace();
			}
		}
		log(e.print(new PostfixPrinter(), env) + "	= " + result);
		log(e.print(new PrefixPrinter(), env) + "	= " + result);
		log(e.print(new InfixPrinter(), env) + "	= " + result);
	}

	private static Expression createExpression(Environment env) {
		Literal one = new Literal(1);
		Literal two = new Literal(2);
		Literal three = new Literal(3);
		Literal five = new Literal(5);
		Variable four = new Variable("four");
		// env.setValue(four, new Literal(4));
		If si = new If(new Equality(one, two), three, five);
		// (four * (1 + (if (1 = 2) then 3 else 5))) / 2
		return new Div(new Mult(four, new Plus(one, si)), two);
	}

	private static void log(String message) {
		System.out.println(message);
	}
}
