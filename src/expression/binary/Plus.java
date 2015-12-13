package expression.binary;

import environment.Environment;
import environment.UnboundVariable;
import evaluator.Standard;
import expression.Expression;

public class Plus extends Binary {

	public Plus(Expression operand1, Expression operand2) {
		super(operand1, operand2, "+");
	}

	@Override
	public int compute(int x, int y) {
		return x + y;
	}
  @Override
  public <E extends Standard> int eval(E evaluator, Environment env) throws UnboundVariable {
    return evaluator.visit(this, env);
  }
}
