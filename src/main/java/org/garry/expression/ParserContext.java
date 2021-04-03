package org.garry.expression;

/**
 * Input provided to an expression parer that can influence an expression
 * parsing/compilation routine
 */
public interface ParserContext {

    /**
     * Whether or not the expression being parsed is a template.A template expression
     * consists of literal text that can be mixed with evaluatable blocks.
     * @return
     */
    boolean isTemplate();

    /**
     * For template expressions, returns the prefix that identifies the start of an
     * expression block within a string. For example: "${
     * @return
     */
    String getExpressionPrefix();

    /**
     * For template expressions, return the prefix that identifies the end of an
     * expression block within a string. For example: "}"
     * @return
     */
    String getExpressionSuffix();

    /**
     * The default ParserContext implementation that enables template expression
     * parsing mode. The expression prefix is "#{" and the expression suffix is "}".
     */
    ParserContext TEMPLATE_EXPRESSION = new ParserContext() {
        @Override
        public boolean isTemplate() {
           return true;
        }

        @Override
        public String getExpressionPrefix() {
            return "#{";
        }

        @Override
        public String getExpressionSuffix() {
            return "}";
        }
    };
}
