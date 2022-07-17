package BitManipulation;

public class UniqueDivision {
    public static long divide(long a, long b)
    {
        long sign
                = ((a < 0) ^ (b < 0)) ? -1 : 1;

        // Update both divisor and
        // dividend positive
        a = Math.abs(a);
        b = Math.abs(b);

        // Initialize the quotient
        long quotient = 0;

        while (a >= b) {
            a -= b;
            ++quotient;
        }
        // if the sign value computed earlier is -1 then
        // negate the value of quotient
        if (sign == -1)
            quotient = -quotient;

        return quotient;
    }

    public static void main (String args []){

        System.out.println(divide(10,-3));
    }
}
