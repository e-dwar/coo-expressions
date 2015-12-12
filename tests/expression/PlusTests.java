package expression;

public class PlusTests extends BinaryTests<Plus> {

	@Override
	public Plus createExpressionEquals10() {
		Literal five = new Literal(5);
		return new Plus(five, five);
	}
}
