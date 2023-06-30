import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;

public class Wspp {
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

        Map<String, IntListBase> result = new LinkedHashMap<>();
        try {
            MyScanner sc = new MyScanner(new FileInputStream(inputFileName));
            int wordNumber = 0;
            while (sc.hasNextLine()) {
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
                                IntListBase il = new IntListBase();
                                il.addNewPosition(wordNumber);
                                result.put(s, il);
                            } else {
                                IntListBase il = result.get(s);
                                il.addNewPosition(wordNumber);
                                result.put(s, il);
                            }
                        }
                        word = new StringBuilder();
                    }
                }
            }
            sc.close();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFileName), StandardCharsets.UTF_8));
            for (Map.Entry<String, IntListBase> p : result.entrySet()) {
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
