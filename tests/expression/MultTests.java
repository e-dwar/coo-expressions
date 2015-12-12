package expression;

public class MultTests extends BinaryTests<Mult> {

	@Override
	public Mult createExpressionEquals10() {
		Literal two = new Literal(2);
		Literal five = new Literal(5);
		return new Mult(two, five);
	}
}
