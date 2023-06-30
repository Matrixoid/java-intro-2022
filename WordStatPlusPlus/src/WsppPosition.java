import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class WsppPosition {
    public static void main(String[] args) {
        String inputFileName = "", outputFileName = "";
        try {
            inputFileName = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Отсутствует имя входного файла");
            return;
        }
        try {
            outputFileName = args[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Отсутствует имя выходного файла");
            return;
        }

        Map<String, IntListEasy> result = new LinkedHashMap<>();
        try {
            MyScanner sc = new MyScanner(new FileInputStream(inputFileName));
            int lineNumber = 0;
            while (sc.hasNextLine()) {
                int wordNumber = 0;
                lineNumber++;
                String str = sc.nextLine();
                StringBuilder sb = new StringBuilder(str);
                sb.append(" ");
                StringBuilder word = new StringBuilder();
                for (int i = 0; i < sb.length(); i++) {
                    if (Character.isLetter(sb.charAt(i)) || sb.charAt(i) == '\'' || Character.getType(sb.charAt(i)) == Character.DASH_PUNCTUATION) {
                        word.append(sb.charAt(i));
                    } else {
                        String s = word.toString().toLowerCase();
                        if (!word.isEmpty()) {
                            wordNumber++;
                            if (!result.containsKey(s)) {
                                IntListEasy il = new IntListEasy();
                                il.addNewPosition(lineNumber, wordNumber);
                                result.put(s, il);
                            } else {
                                IntListEasy il = result.get(s);
                                il.addNewPosition(lineNumber, wordNumber);
                                result.put(s, il);
                            }
                        }
                        word = new StringBuilder();
                    }
                }
            }
            sc.close();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFileName), StandardCharsets.UTF_8));
            for (Map.Entry<String, IntListEasy> p : result.entrySet()) {
                writer.write(p.getKey() + " " + p.getValue().size() + " " + p.getValue().toString() + "\n");
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не был найден");
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}
