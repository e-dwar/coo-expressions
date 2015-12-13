package main;

import environment.*;
import evaluator.Standard;
import expression.*;
import expression.atomic.*;
import expression.binary.*;
import expression.conditional.If;

public class Main {

  public static void main(String[] args) throws UnboundVariable {
    Binary binary = new Plus(new Literal(3), new Literal(5));
    new Standard().visit(binary, new Environment());
  }
	public static void main2 (String[] args) {
		int result = 0;
		Environment env = new Environment();
		Expression e = createExpression(env);
		try {
			result = e.eval(new evaluator.Standard(), env);
		} catch (UnboundVariable e1) {
			try {
				log(e1.getMessage() + " (TTOTT)");
				log("Bullet proof evaluator to the rescue!");
				result = e.eval(new evaluator.BulletProof(), env);
			} catch (UnboundVariable e2) {
				e2.printStackTrace();
			}
		}
		log(e.print(new printer.Postfix()) + "	= " + result);
		log(e.print(new printer.Prefix()) + "	= " + result);
		log(e.print(new printer.Infix()) + "	= " + result);
	}
	
	private static Expression createExpression(Environment env) {
		Literal one = new Literal(1);
		Literal two = new Literal(2);
		Literal three = new Literal(3);
		Literal five = new Literal(5);
		Variable four = new Variable("four");
		//env.setValue(four, new Literal(4));
		If si = new If(new Equality(one, two), three, five);
		// (four * (1 + (if (1 = 2) then 3 else 5))) / 2
		return new Div(new Mult(four, new Plus(one, si)), two);
	}
	
	private static void log(String message) {
		System.out.println(message);
	}
}
