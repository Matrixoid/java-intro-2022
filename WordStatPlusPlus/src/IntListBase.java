public class IntListBase {
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

    public void addNewPosition(int position) {
        wordPositions = arrayCopyAndAddElement(wordPositions, position);
    }

    @Override
    public String toString() {
        if (wordPositions == null)
            return "";

        StringBuilder sb = new StringBuilder();
        for (int a : wordPositions) {
            sb.append(a);
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
