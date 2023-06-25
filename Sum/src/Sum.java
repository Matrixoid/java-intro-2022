public class Sum {

    private static int sumFromArg(String arg) {
        int sum = 0;
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
                sum += Integer.parseInt(arg.substring(j, i));
            }
            if(numberStart && i == arg.length() - 1) {
                sum += Integer.parseInt(arg.substring(j));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum += sumFromArg(args[i]);
        }

        System.out.println(sum);
    }
}
