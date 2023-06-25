public class SumFloat {

    public static void main(String[] args) {
        float sum = 0;

        for (String arg : args) {
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
                    sum += Float.parseFloat(arg.substring(j, i));
                }
                if(numberStart && i == arg.length() - 1) {
                    sum += Float.parseFloat(arg.substring(j));
                }
            }
        }

        System.out.println(sum);
    }
}
