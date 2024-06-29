package BooleanEvaute;

public class BooleanEvaluation {
    int countEval(String str, boolean result) {
        if (str.isEmpty()) return 0;
        if (str.length() == 1) return stringToBool(str) ? 1:0;
        int ways = 0;
        for (int i = 1; i < str.length(); i += 2) {
            char c = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);

            int leftTrue = countEval(left, true);
            int leftFalse = countEval(left, false);
            int rightTrue = countEval(right, true);
            int rightFalse = countEval(right, false);

            int total = (leftTrue + leftFalse) * (rightTrue + rightFalse);

            int totalTrue = 0;
            if (c == '^') {
                totalTrue = leftTrue * rightFalse + leftFalse *  rightTrue;
            } else if (c == '&') {
                totalTrue = leftTrue * rightTrue;
            } else if (c == '|') {
                totalTrue = leftTrue * rightFalse + leftTrue * rightTrue + leftFalse * rightTrue;
            }
            int subWays = result ? totalTrue:total - totalTrue;
            ways += subWays;
        }
        return ways;
    }
    boolean stringToBool(String c) {
        return c.equals("1");
    }
}
