package expression;

import environment.Environment;
import environment.UnboundVariable;

public class Minus extends Binary {

	public Minus(Expression operand1, Expression operand2) {
		super(operand1, operand2);
		symbol = "-";
	}

	@Override
	public int eval(Environment environment) throws UnboundVariable {
		return operand1.eval(environment) - operand2.eval(environment);
	}

}
