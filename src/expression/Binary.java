package expression;

public abstract class Binary extends Expression {

	protected String symbol;
	protected Expression operand1;
	protected Expression operand2;
	
	public Binary (Expression operand1, Expression operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	public String print() {
		return "(" + operand1.print() + symbol + operand2.print() + ")";
	}
}
