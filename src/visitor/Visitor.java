package visitor;

import expression.atomic.*;
import expression.binary.*;
import expression.conditional.If;

public interface Visitor<T> {

	public T visitLiteral(Literal expression);

	public T visitVariable(Variable expression);

	public T visitPlus(Plus expression);

	public T visitMinus(Minus expression);

	public T visitMult(Mult expression);

	public T visitDiv(Div expression);

	public T visitEquality(Equality equality);

	public T visitIf(If expression);
}
