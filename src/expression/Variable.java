package expression;

import environment.Environment;
import environment.UnboundVariable;

public class Variable extends Atomic {

	protected String name;

	public Variable(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int eval(Environment environment) throws UnboundVariable {
		return environment.getValue(this).eval(environment);
	}
}
