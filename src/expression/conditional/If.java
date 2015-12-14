package expression.conditional;

import visitor.Visitor;
import expression.Expression;

public class If extends Expression {

	protected Expression condition;
	protected Expression instruction1;
	protected Expression instruction2;

	public If(Expression condition, Expression instruction1, Expression instruction2) {
		this.condition = condition;
		this.instruction1 = instruction1;
		this.instruction2 = instruction2;
	}

	public Expression getCondition() {
		return condition;
	}

	public Expression getInstruction1() {
		return instruction1;
	}

	public Expression getInstruction2() {
		return instruction2;
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitIf(this);
	}

}
