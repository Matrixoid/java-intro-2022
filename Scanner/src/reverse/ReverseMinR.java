package reverse;

import scanner.MyScanner;
import java.io.IOException;

public class ReverseMinR {
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
                    numbersLineTmp[numbersLine.length] = sc1.nextInt();
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
            for(int j = 0; j <= (numbers[i]).length - 1; j++) {
                if (j > 0)
                    numbers[i][j] = Math.min(numbers[i][j], numbers[i][j - 1]);
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
