package expression.conditional;

import printer.Printer;
import environment.Environment;
import environment.UnboundVariable;
import evaluator.Standard;
import expression.Expression;

public class If extends Expression {

	protected Expression condition;
	protected Expression[] instructions;
	
	public If(Expression condition, Expression instruction1, Expression instruction2) {
		this.condition = condition;
		instructions = new Expression[]{ instruction1, instruction2 };
	}
	
	public Expression getCondition() {
		return condition;
	}
	
	public Expression getInstruction(int n) {
		return instructions[n - 1];
	}

	@Override
	public <E extends Standard> int eval(E evaluator, Environment env) throws UnboundVariable {
		return evaluator.visit(this, env);
	}

	@Override
	public <P extends Printer> String print(P printer) {
		return printer.visit(this);
	}

}
