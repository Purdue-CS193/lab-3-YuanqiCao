public class MathUtils {
    /**
     * divideNumbers -- a / b
     * Divide a by b and return the result
     */
    public static double divideNumbers(int dividend, int divisor) {
        /* Do some casual division ... Super easy ... Shouldn't be any problems here */
        double res = (double)dividend / (double)divisor;
        /* Return the DEFINITELY CORRECT result */
        return res;
    }

    /**
     * raiseToPower -- (base)^(exp)
     * Raise the number base to power exp
     */
    public static double raiseToPower(int base, int exp) {
        /* Set initial result to be just the number */
        double res = base;

        /* Determine if the exponent is negative */
        boolean isNegative = false;
        if (exp < 0) {
            res = (double) (1/(Math.pow(base, Math.abs(exp))));
        }
        else {
            res = (double)Math.pow(base, exp);
        }




        /* If it's a negative exponent, we should invert it! */

        /* Otherwise, we are safe to just return the result */

            return res;
        }
    }    
