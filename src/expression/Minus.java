package expression;

public class Minus extends Binary {

	public Minus(Expression operand1, Expression operand2) {
		super(operand1, operand2);
		symbol = "-";
	}

	@Override
	public int compute(int x, int y) {
		return x - y;
	}
}
