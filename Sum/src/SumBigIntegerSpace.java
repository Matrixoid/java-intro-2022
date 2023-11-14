import java.math.BigInteger;

public class SumBigIntegerSpace {

    private static BigInteger sumFromArg(String arg) {
        BigInteger sum = BigInteger.ZERO;
        boolean numberStart = false;
        int j = 0;
        for(int i = 0; i < arg.length(); i++) {
            if (Character.isSpaceChar(arg.charAt(i)) && !numberStart) {
                continue;
            }
            if(!numberStart && !Character.isSpaceChar(arg.charAt(i))) {
                numberStart = true;
                j = i;
            }
            if(Character.isSpaceChar(arg.charAt(i)) && numberStart) {
                numberStart = false;
                sum = sum.add(new BigInteger(arg.substring(j, i)));
            }
            if(numberStart && i == arg.length() - 1) {
                sum = sum.add(new BigInteger(arg.substring(j)));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;

        for (int i = 0; i < args.length; i++) {
            sum = sum.add(sumFromArg(args[i]));
        }

        System.out.println(sum);
    }
}
