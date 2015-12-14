package expression.binary;

import visitor.Visitor;
import expression.Expression;

public class Mult extends BinaryExpression {

	public Mult(Expression operand1, Expression operand2) {
		super(operand1, operand2, "*");
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitMult(this);
	}
}
