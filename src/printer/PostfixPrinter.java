package printer;

import expression.Binary;

public class PostfixPrinter extends Printer {

	@Override
	public String visit(Binary expression) {
		String x = expression.getOperand(1).print(this);
		String y = expression.getOperand(2).print(this);
		return x + " " + y + " " + expression.getSymbol();
	}
}
