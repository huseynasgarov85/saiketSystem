package fifthTask;

class AnalysisResult {
    private final int lineCount;
    private final int wordCount;
    private final int charCount;

    public AnalysisResult(int lineCount, int wordCount, int charCount) {
        this.lineCount = lineCount;
        this.wordCount = wordCount;
        this.charCount = charCount;
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getCharCount() {
        return charCount;
    }
}