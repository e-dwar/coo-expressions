package expression;

import environment.Environment;
import environment.UnboundVariable;

public abstract class Expression {

	public abstract String print();

	public abstract int eval(Environment environment) throws UnboundVariable;

	public String toString() {
		return print();
	}
}
