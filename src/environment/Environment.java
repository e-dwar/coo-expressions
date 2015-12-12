package environment;

import java.util.HashMap;
import java.util.NoSuchElementException;
import expression.atomic.Literal;
import expression.atomic.Variable;

public class Environment {

	protected HashMap<Variable, Literal> vars;

	public Environment() {
		vars = new HashMap<Variable, Literal>();
	}

	public void setValue(Variable var, Literal value) {
		vars.put(var, value);
	}

	public Literal getValue(Variable var) throws UnboundVariable {
		if (vars.containsKey(var)) {
			return vars.get(var);
		} else {
			throw new UnboundVariable(var);
		}
	}

	public Variable getVariable(String name) {
		for (Variable var : vars.keySet()) {
			if (var.getName().equals(name)) {
				return var;
			}
		}
		throw new NoSuchElementException(name);
	}
}
