package expression;

public class DivTests extends BinaryTests<Div> {

	@Override
	public Div createExpressionEquals10() {
		Literal two = new Literal(2);
		Literal twenty = new Literal(20);
		return new Div(twenty, two);
	}
}
