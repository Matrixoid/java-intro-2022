public class IntListEasy {
    public int[] linePosition;
    private int[] wordPositions;

    private int[] arrayCopyAndAddElement(int[] arraySrc, int element) {
        if (arraySrc == null) {
            int[] tmp = new int[1];
            tmp[0] = element;
            return tmp;
        } else {
            int[] tmp = new int[arraySrc.length + 1];
            System.arraycopy(arraySrc, 0, tmp, 0, arraySrc.length);
            tmp[arraySrc.length] = element;
            return tmp;
        }
    }

    public void addNewPosition(int line, int position) {
        linePosition = arrayCopyAndAddElement(linePosition, line);
        wordPositions = arrayCopyAndAddElement(wordPositions, position);
    }

    @Override
    public String toString() {
        if (wordPositions == null)
            return "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordPositions.length; i++) {
            sb.append(linePosition[i]);
            sb.append( ":");
            sb.append(wordPositions[i]);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public int[] getPositions() {
        return wordPositions;
    }

    public int size() {
        return wordPositions.length;
    }
}
