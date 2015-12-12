package expression;

import printer.Printer;
import environment.Environment;
import environment.UnboundVariable;
import evaluator.Standard;

public abstract class Expression {

	public abstract <E extends Standard> int eval(E evaluator, Environment env) throws UnboundVariable;
	
	public abstract <P extends Printer> String print(P printer);
}
