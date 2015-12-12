package expression;

import environment.Environment;
import evaluator.Evaluator;

public class Literal extends Atomic {

	protected int value;

	public Literal(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public String toString() {
		return value + "";
	}

	public <E extends Evaluator> int eval(E evaluator, Environment env) {
		return evaluator.visit(this, env);
	}
}
