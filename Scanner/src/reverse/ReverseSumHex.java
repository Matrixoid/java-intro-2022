package reverse;

import scanner.MyScanner;
import java.io.IOException;

public class ReverseSumHex {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner(System.in);
        int numbersSize = 1024;
        int numbersLineCount = 0;
        int[][] numbers = new int[numbersSize][];

        try {
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                MyScanner sc1 = new MyScanner(str);
                int[] numbersLine = new int[0];

                while (sc1.hasNext()) {
                    int[] numbersLineTmp = new int[numbersLine.length + 1];
                    System.arraycopy(numbersLine, 0, numbersLineTmp, 0, numbersLine.length);
                    numbersLineTmp[numbersLine.length] = (int) Long.parseLong(sc1.next(), 16);
                    numbersLine = numbersLineTmp;
                }

                numbers[numbersLineCount] = numbersLine;
                numbersLineCount++;
                if (numbersLineCount >= numbersSize) {
                    numbersSize *= 2;
                    int[][] numbersTmp = new int[numbersSize][];
                    System.arraycopy(numbers, 0, numbersTmp, 0, numbersLineCount);
                    numbers = numbersTmp;
                }
            }
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }

        for(int i = 0; i <= numbersLineCount - 1; i++) {
            for(int j = 1; j <= (numbers[i]).length - 1; j++) {
                numbers[i][j] += numbers[i][j - 1];
            }
        }

        for(int i = 0; i <= numbersLineCount - 1; i++) {
            for (int j = 0; j <= (numbers[i]).length - 1; j++) {
                int sum = numbers[i][j];
                for (int k = 0; k < i; k++) {
                    if (numbers[k].length == 0) continue;
                    sum += (j >= numbers[k].length) ? numbers[k][numbers[k].length - 1] : numbers[k][j];
                }
                System.out.print(Integer.toHexString(sum) + " ");
            }
            System.out.println();
        }
    }
}
