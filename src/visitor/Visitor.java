package visitor;

import expression.atomic.*;
import expression.binary.BinaryExpression;
import expression.conditional.If;

public interface Visitor<T> {

    public T visitLiteral(Literal expression);

    public T visitVariable(Variable expression);

    public T visitBinary(BinaryExpression expression);

    public T visitIf(If expression);
}
