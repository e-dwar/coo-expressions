package main;

import environment.Environment;
import environment.UnboundVariable;
import expression.*;

public class Main {

	public static void main (String[] args) {
		Environment env = new Environment();
		Literal one = new Literal(1);
		Literal two = new Literal(2);
		Expression e = new Div(new Plus(one, one), two);
		try {
			System.out.println(e + " = " + e.eval(env));
		} catch (UnboundVariable ex) {
			ex.printStackTrace();
		}
	}
}
