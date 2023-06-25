import java.util.Scanner;

public class ReverseAbc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbersSize = 1024;
        int numbersLineCount = 0;
        String[][] numbers = new String[numbersSize][];

        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            Scanner sc1 = new Scanner(str);
            String[] numbersLine = new String[0];

            while(sc1.hasNext()) {
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

        for(int i = numbersLineCount - 1; i >= 0; --i) {
            for(int j = (numbers[i]).length - 1; j >= 0; --j) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
