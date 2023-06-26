import java.io.IOException;
import java.util.Scanner;

public class ReverseOct {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner(System.in);
        int numbersSize = 1024;
        int numbersLineCount = 0;
        long[][] numbers = new long[numbersSize][];

        try {
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                MyScanner sc1 = new MyScanner(str);
                long[] numbersLine = new long[0];

                while (sc1.hasNext()) {
                    String s = sc1.next();
                    long number = 0;
                    if (s.matches("[oO][0-9]+"))
                        number = Long.parseLong(s.substring(1), 8);
                    else
                        number = Long.parseLong(s);
                    long[] numbersLineTmp = new long[numbersLine.length + 1];
                    System.arraycopy(numbersLine, 0, numbersLineTmp, 0, numbersLine.length);
                    numbersLineTmp[numbersLine.length] = number;
                    numbersLine = numbersLineTmp;
                }

                numbers[numbersLineCount] = numbersLine;
                numbersLineCount++;
                if (numbersLineCount >= numbersSize) {
                    numbersSize *= 2;
                    long[][] numbersTmp = new long[numbersSize][];
                    System.arraycopy(numbers, 0, numbersTmp, 0, numbersLineCount);
                    numbers = numbersTmp;
                }
            }
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }

        for(int i = numbersLineCount - 1; i >= 0; --i) {
            for(int j = numbers[i].length - 1; j >= 0; --j) {
                System.out.print(numbers[i][j] + " ");
            }

            System.out.println();
        }
    }
}
