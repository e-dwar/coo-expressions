package environment;

import expression.Variable;

public class UnboundVariable extends Exception {

	private static final long serialVersionUID = 1L;
	
	public UnboundVariable(Variable var) {
		super("Variable \"" + var + "\" not found.");
	}
}
