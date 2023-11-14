public class SumLongSpace {

    private static long sumFromArg(String arg) {
        long sum = 0;
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
                sum += Long.parseLong(arg.substring(j, i));
            }
            if(numberStart && i == arg.length() - 1) {
                sum += Long.parseLong(arg.substring(j, i + 1));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        long sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum += sumFromArg(args[i]);
        }

        System.out.println(sum);
    }
}
