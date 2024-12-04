package Stepik._3_OOP.Textanalyzer;

public abstract class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;
    private Label label;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords.clone();
        label = Label.SPAM;
    }
}