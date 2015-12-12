package expression;

import printer.Printer;
import environment.Environment;
import environment.UnboundVariable;
import evaluator.Evaluator;

public abstract class Expression {

	public abstract <E extends Evaluator> int eval(E evaluator, Environment env) throws UnboundVariable;
	
	public abstract <P extends Printer> String print(P printer);
}
