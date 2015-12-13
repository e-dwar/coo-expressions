package visitor;

import environment.Environment;
import expression.atomic.*;
import expression.binary.BinaryExpression;
import expression.conditional.If;

public interface Visitor {

    public void visitLiteral(Literal expression, Environment env);

    public void visitVariable(Variable expression, Environment env);

    public void visitBinary(BinaryExpression expression, Environment env);

    public void visitIf(If expression, Environment env);
}
