package expression.atomic;

import environment.Environment;
import evaluator.Standard;

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

	public <E extends Standard> int eval(E evaluator, Environment env) {
		return evaluator.visit(this, env);
	}
}
