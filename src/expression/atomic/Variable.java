package expression.atomic;

import environment.Environment;
import environment.UnboundVariable;
import evaluator.Standard;

public class Variable extends Atomic {

	protected String name;

	public Variable(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return name;
	}

	public <E extends Standard> int eval(E evaluator, Environment env) throws UnboundVariable {
		return evaluator.visit(this, env);
	}
}
