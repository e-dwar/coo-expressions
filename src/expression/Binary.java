package expression;

import printer.Printer;
import environment.Environment;
import environment.UnboundVariable;
import evaluator.Evaluator;

public abstract class Binary extends Expression {

	protected String symbol;
	protected Expression[] operands;

	public abstract int compute(int x, int y);

	public Binary(Expression operand1, Expression operand2) {
		operands = new Expression[2];
		operands[0] = operand1;
		operands[1] = operand2;
	}

	public Expression getOperand(int n) {
		return operands[n - 1];
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public <E extends Evaluator> int eval(E evaluator, Environment env) throws UnboundVariable {
		return evaluator.visit(this, env);
	}
	
	public <P extends Printer> String print(P printer) {
		return printer.visit(this);
	}
}
