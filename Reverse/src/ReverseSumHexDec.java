import java.util.Scanner;

public class ReverseSumHexDec {
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
                String num = sc1.next();
                if (num.startsWith("0x") || num.startsWith("0X"))
                    numbersLineTmp[numbersLine.length] = (int)Long.parseLong(num.substring(2), 16);
                else
                    numbersLineTmp[numbersLine.length] = (int)Long.parseLong(num, 10);
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
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
