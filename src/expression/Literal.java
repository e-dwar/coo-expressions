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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int eval(Environment environment) {
		return value;
	}
}
