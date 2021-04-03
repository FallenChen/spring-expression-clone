package org.garry.expression;

/**
 * Parses expression strings into compiled expressions that can be evaluated.
 * Supports parsing templates as well as standard expression strings.
 */
public interface ExpressionParser {

    Expression parseExpression(String expressionString);

    Expression parseExpression(String expressionString, ParserContext context);
}
