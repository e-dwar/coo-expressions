package evaluator;

import environment.Environment;
import environment.UnboundVariable;
import expression.Binary;
import expression.Literal;
import expression.Variable;

public class Evaluator {

	public int visit(Binary expression, Environment env) throws UnboundVariable {
		int x = expression.getOperand(1).eval(this, env);
		int y = expression.getOperand(2).eval(this, env);
		return expression.compute(x, y);
	}

	public int visit(Variable expression, Environment env) throws UnboundVariable {
		return env.getValue(expression).getValue();
	}

	public int visit(Literal expression, Environment env) {
		return expression.getValue();
	}
}
