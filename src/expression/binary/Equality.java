package expression.binary;

import visitor.Visitor;
import expression.Expression;

public class Equality extends BinaryExpression {

	public Equality(Expression operand1, Expression operand2) {
		super(operand1, operand2, "=");
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitEquality(this);
	}
}
