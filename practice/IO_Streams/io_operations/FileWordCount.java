import java.io.*;
import java.util.*;

public class FileWordCount {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java FileWordCount <inputFile> <outputFile>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        TreeMap<String, Integer> map = new TreeMap<>();

        try {
            Scanner sc = new Scanner(new File(inputFile));

            while (sc.hasNext()) {
                String word = sc.next();
                map.put(word, map.getOrDefault(word, 0) + 1);
            }

            sc.close();

            PrintWriter pw = new PrintWriter(new FileWriter(outputFile));

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                pw.println(entry.getKey() + " : " + entry.getValue());
            }

            pw.close();

            System.out.println("Word count written to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}