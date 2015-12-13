package visitor;

import expression.atomic.*;
import expression.binary.BinaryExpression;
import expression.conditional.If;

public interface Visitor {

    public void visitLiteral(Literal expression);

    public void visitVariable(Variable expression);

    public void visitBinary(BinaryExpression expression);

    public void visitIf(If expression);
}
