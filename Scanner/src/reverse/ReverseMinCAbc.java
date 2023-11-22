package reverse;

import scanner.MyScanner;
import java.io.IOException;

public class ReverseMinCAbc {

    public static boolean compare(String s1, String s2) {
        char sign1 = '+';
        char sign2 = '+';
        if (s1.charAt(0) == '-')
            sign1 = '-';
        if (s2.charAt(0) == '-')
            sign2 = '-';

        if (sign1 == '+' && sign2 == '+') {
            return s1.length() < s2.length() || (s1.length() == s2.length() && s1.compareTo(s2) <= 0);
        } else if (sign1 == '+') {
            return false;
        } else if (sign2 == '+') {
            return true;
        } else {
            return s1.length() > s2.length() || (s1.length() == s2.length() && s1.compareTo(s2) >= 0);
        }
    }

    public static void main(String[] args) {
        MyScanner sc = new MyScanner(System.in);
        int numbersSize = 1024;
        int numbersLineCount = 0;
        String[][] numbers = new String[numbersSize][];

        try {
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                MyScanner sc1 = new MyScanner(str);
                String[] numbersLine = new String[0];

                while (sc1.hasNext()) {
                    String[] numbersLineTmp = new String[numbersLine.length + 1];
                    System.arraycopy(numbersLine, 0, numbersLineTmp, 0, numbersLine.length);
                    numbersLineTmp[numbersLine.length] = sc1.next();
                    numbersLine = numbersLineTmp;
                }

                numbers[numbersLineCount] = numbersLine;
                numbersLineCount++;
                if (numbersLineCount >= numbersSize) {
                    numbersSize *= 2;
                    String[][] numbersTmp = new String[numbersSize][];
                    System.arraycopy(numbers, 0, numbersTmp, 0, numbersLineCount);
                    numbers = numbersTmp;
                }
            }
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }

        String[] minimunInColumn;
        int columnSize = 0;
        for (int i = 0; i < numbersLineCount; i++) {
            columnSize = Math.max(columnSize, numbers[i].length);
        }
        minimunInColumn = new String[columnSize];
        for (int i = 0; i < columnSize; i++) {
            minimunInColumn[i] = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        }

        for(int i = 0; i <= numbersLineCount - 1; i++) {
            for(int j = 0; j <= (numbers[i]).length - 1; j++) {
                if (compare(numbers[i][j], minimunInColumn[j]))
                    minimunInColumn[j] = numbers[i][j];
                System.out.print(minimunInColumn[j] + " ");
            }
            System.out.println();
        }
    }
}
