import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.NoSuchElementException;

public class MyScanner {
    BufferedReader br;

    public MyScanner(InputStream is) {
        br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
    }

    public MyScanner(String str) {
        br = new BufferedReader(new StringReader(str));
    }

    private int bufferSize = 1024;
    private char buffer[] = new char[bufferSize];

    private int currentPos = 0;
    private int currentSize = 0;

    private void fillBuffer() throws IOException {
        currentSize = br.read(buffer);
        currentPos = 0;
    }

    public boolean hasNextLine() throws IOException {
        if (currentPos >= currentSize)
            fillBuffer();
        return currentSize != -1 && buffer[0] != 0;
    }

    public String nextLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        while (buffer[currentPos] != '\r' && buffer[currentPos] != '\n') {
            sb.append(buffer[currentPos]);
            currentPos++;
            if (currentPos >= currentSize)
                fillBuffer();
        }
        if (buffer[currentPos] == '\r') {
            currentPos++;
            if (currentPos >= currentSize)
                fillBuffer();
        }
        if (buffer[currentPos] == '\n') {
            currentPos++;
            if (currentPos >= currentSize)
                fillBuffer();
        }
        return sb.toString();
    }

    private String nextToken = "";
    public boolean hasNext() throws IOException {
        if (currentPos >= currentSize)
            fillBuffer();
        if (currentSize == -1)
            return false;
        while(Character.isWhitespace(buffer[currentPos])) {
            currentPos++;
            if (currentPos >= currentSize)
                fillBuffer();
            if (currentSize == -1)
                return false;
        }
        StringBuilder sb = new StringBuilder();
        while (!Character.isWhitespace(buffer[currentPos])) {
            sb.append(buffer[currentPos]);
            currentPos++;
            if (currentPos >= currentSize)
                fillBuffer();
            if (currentSize == -1) {
                nextToken = sb.toString();
                return true;
            }
        }
        nextToken = sb.toString();
        return true;
    }

    public String next() {
        if (nextToken == "")
            throw new NoSuchElementException("Error!!!");
        return nextToken;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public void close() throws IOException {
        br.close();
    }
}