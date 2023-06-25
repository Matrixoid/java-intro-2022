public class SumOctal {

    private static int sumFromArg(String arg) {
        int sum = 0;
        boolean numberStart = false;
        boolean isOctal = false;
        boolean negate = false;
        int j = 0;
        for(int i = 0; i < arg.length(); i++) {
            if (Character.isWhitespace(arg.charAt(i)) && !numberStart) {
                continue;
            }
            if(!numberStart && !Character.isWhitespace(arg.charAt(i))) {
                numberStart = true;
                if (arg.charAt(i) == '-') {
                    negate = true;
                    i++;
                }
                j = i;
            }
            if(arg.charAt(i) == 'o' || arg.charAt(i) == 'O') {
                isOctal = true;
            }
            if(Character.isWhitespace(arg.charAt(i)) && numberStart) {
                numberStart = false;
                if (isOctal) {
                    if (negate) {
                        sum += Integer.parseInt(arg.substring(j - 1, i - 1), 8);
                    } else {
                        sum += Integer.parseInt(arg.substring(j, i - 1), 8);
                    }
                } else {
                    if (negate) {
                        sum += Integer.parseInt(arg.substring(j - 1, i));
                    } else {
                        sum += Integer.parseInt(arg.substring(j, i));
                    }
                }
                negate = false;
                isOctal = false;
            }
            if(numberStart && i == arg.length() - 1) {
                if (isOctal) {
                    if (negate) {
                        sum += Integer.parseInt(arg.substring(j - 1, i), 8);
                    } else {
                        sum += Integer.parseInt(arg.substring(j, i), 8);
                    }
                } else {
                    if (negate) {
                        sum += Integer.parseInt(arg.substring(j - 1, i + 1));
                    } else {
                        sum += Integer.parseInt(arg.substring(j, i + 1));
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = 0;

        for (String arg : args) {
            sum += sumFromArg(arg);
        }

        System.out.println(sum);
    }
}
