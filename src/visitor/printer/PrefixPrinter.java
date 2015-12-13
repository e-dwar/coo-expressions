package visitor.printer;

import environment.Environment;
import expression.binary.BinaryExpression;

public class PrefixPrinter extends Printer {

	@Override
	public void visitBinary(BinaryExpression expression, Environment env) {
		String x = expression.getLeftOperand().print(this, env);
		String y = expression.getRightOperand().print(this, env);
		result = expression.getSymbol() + " " + x + " " + y;
	}
}
