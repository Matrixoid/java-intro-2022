package wordstat;

import scanner.MyScanner;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class WordStatInput {
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
        Map<String, Integer> result = new LinkedHashMap<>();
        try {
            MyScanner sc = new MyScanner(new FileInputStream(inputFileName));
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
                            if (!result.containsKey(s)) {
                                result.put(s, 1);
                            } else {
                                result.put(s, result.get(s) + 1);
                            }
                        }
                        word = new StringBuilder();
                    }
                }
            }
            sc.close();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFileName), StandardCharsets.UTF_8));
            for (Map.Entry<String, Integer> p : result.entrySet()) {
                writer.write(p.getKey() + " " + p.getValue() + "\n");
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не был найден");
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}
