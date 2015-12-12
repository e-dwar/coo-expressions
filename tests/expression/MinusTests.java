package expression;

public class MinusTests extends BinaryTests<Minus> {

	@Override
	public Minus createExpressionEquals10() {
		Literal five = new Literal(5);
		Literal fifteen = new Literal(15);
		return new Minus(fifteen, five);
	}
}
