package wordstat;

import scanner.MyScanner;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordStatCountAffixL {
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
                if (str == null)
                    break;
                StringBuilder sb = new StringBuilder(str);
                sb.append(" ");
                StringBuilder word = new StringBuilder();
                for (int i = 0; i < sb.length(); i++) {
                    if (Character.isLetter(sb.charAt(i)) || sb.charAt(i) == '\'' || Character.getType(sb.charAt(i)) == Character.DASH_PUNCTUATION) {
                        word.append(sb.charAt(i));
                    } else {
                        String s = word.toString().toLowerCase();
                        if (!word.isEmpty() && word.length() >= 2) {
                            String sPrefix = s.substring(0, 2);
                            String sSuffix = s.substring(s.length() - 2);
                            if (!result.containsKey(sPrefix)) {
                                result.put(sPrefix, 1);
                            } else {
                                result.put(sPrefix, result.get(sPrefix) + 1);
                            }
                            if (!result.containsKey(sSuffix)) {
                                result.put(sSuffix, 1);
                            } else {
                                result.put(sSuffix, result.get(sSuffix) + 1);
                            }
                        }
                        word = new StringBuilder();
                    }
                }
            }
            sc.close();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFileName), StandardCharsets.UTF_8));
            List<Map.Entry<String, Integer>> entries = new ArrayList<>(result.entrySet());
            entries.sort(Map.Entry.comparingByValue());
            for (Map.Entry<String, Integer> p : entries) {
                writer.write(p.getKey() + " " + p.getValue() + "\n");
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не был найден");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
