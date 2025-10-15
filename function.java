public class function {
    private String expression; // e.g. "x^2 + 3x + 2"

    // Constructor
    public function(String f) {
        this.expression = f.replaceAll("\\s+", ""); // clean spaces
    }

    // Example: identify what kind of function this is
    public String identifyType() {
        if (expression.contains("^2")) {
            return "Quadratic";
        } else if (expression.contains("^3")) {
            return "Cubic";
        } else if (expression.contains("x")) {
            return "Linear";
        } else {
            return "Constant";
        }
    }

    public double evaluate(double x) {
        /*  no bedmas yet
        when i add it:
            find "(" & ")" in expression. always look for farthest distance.
                compute the expression within the indexes (always seek for another pair of parenthesis before computing)
             
        */
        int result = (int) expression.charAt(0);
        for (int i = 1; i < expression.length(); i += 2) {
            char op = (char) expression.charAt(i);
            if (op == '(') {
                int prt1 = i; //paranthesis index
                for (int v = expression.length(); v > 0; v --) {
                    int prt2 = v;
                    if (expression.charAt(v) == ')') {
                        break;
                    } 
                }

            }
            int num = (int) expression.charAt(i + 1);

            switch (op) {
                case '^': result ^= num; break;
                case '+': result += num; break;
                case '-': result -= num; break;
                case '*': result *= num; break;
                case '/': result /= num; break;
            }
        }
        return result;
        
    }

    public String getExpression() {
        return expression;
    }
}
