package printer;

import expression.binary.Binary;

public class Postfix extends Printer {

	@Override
	public String visit(Binary expression) {
		String x = expression.getOperand(1).print(this);
		String y = expression.getOperand(2).print(this);
		return x + " " + y + " " + expression.getSymbol();
	}
}
