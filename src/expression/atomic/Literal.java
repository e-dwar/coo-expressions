package expression.atomic;

import visitor.Visitor;
import environment.Environment;

public class Literal extends AtomicExpression {

	protected int value;

	public Literal(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public void accept(Visitor visitor, Environment env) {
		visitor.visitLiteral(this, env);
	}
}
