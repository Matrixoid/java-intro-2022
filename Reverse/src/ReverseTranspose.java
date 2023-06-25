import java.util.Scanner;

public class ReverseTranspose {
    public ReverseTranspose() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbersSize = 1024;
        int numbersLineCount = 0;
        int[][] numbers = new int[numbersSize][];

        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            Scanner sc1 = new Scanner(str);
            int[] numbersLine = new int[0];

            while(sc1.hasNext()) {
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

        int maxSize = 0;

        int i;
        for(i = 0; i < numbersLineCount; ++i) {
            if (numbers[i].length > maxSize) {
                maxSize = numbers[i].length;
            }
        }

        for(i = 0; i < maxSize; ++i) {
            for(int j = 0; j < numbersLineCount; ++j) {
                if (i < numbers[j].length) {
                    System.out.print(numbers[j][i] + " ");
                }
            }
            System.out.println();
        }

    }
}