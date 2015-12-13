package environment;

import visitor.printer.InfixPrinter;
import expression.atomic.Variable;

public class UnboundVariableException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UnboundVariableException(Variable var, Environment env) {
		super("Variable \"" + var.print(new InfixPrinter(), env) + "\" is not bound.");
	}
}
