package expression;

import environment.Environment;

public class Literal extends Atomic {

	protected int value;

	public Literal(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String print() {
		return value + "";
	}

	@Override
	public int eval(Environment environment) {
		return value;
	}
}
