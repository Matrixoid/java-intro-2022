public class SumDouble {

    private static double sumFromArg(String arg) {
        double sum = 0;
        boolean numberStart = false;
        int j = 0;
        for(int i = 0; i < arg.length(); i++) {
            if (Character.isWhitespace(arg.charAt(i)) && !numberStart) {
                continue;
            }
            if(!numberStart && !Character.isWhitespace(arg.charAt(i))) {
                numberStart = true;
                j = i;
            }
            if(Character.isWhitespace(arg.charAt(i)) && numberStart) {
                numberStart = false;
                sum += Double.parseDouble(arg.substring(j, i));
            }
            if(numberStart && i == arg.length() - 1) {
                sum += Double.parseDouble(arg.substring(j));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        double sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum += sumFromArg(args[i]);
        }

        System.out.println(sum);
    }
}
