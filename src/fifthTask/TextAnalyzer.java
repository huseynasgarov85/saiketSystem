package fifthTask;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextAnalyzer {

    public static void textTask() {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dosya yolunu al
        System.out.print("Enter file path: ");
        String path = scanner.nextLine();

        try {
            AnalysisResult result = analyze(path);
            System.out.println("Analysis done:");
            System.out.println("Lines: " + result.getLineCount());
            System.out.println("Words: " + result.getWordCount());
            System.out.println("Chars: " + result.getCharCount());
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check the path.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }

    private static AnalysisResult analyze(String path) throws IOException {
        int lines = 0;
        int words = 0;
        int chars = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String text;
            while ((text = reader.readLine()) != null) {
                lines++;
                chars += text.length();
                words += text.split("\\s+").length;
            }
        }

        return new AnalysisResult(lines, words, chars);
    }
}
