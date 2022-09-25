package labwork3.A1;

public class Main {
    public static void main(String[] args) {
        Word my = new Word("my");
        Word history = new Word("history");

        Sentence myHistory = new Sentence();
        myHistory.addWordToSentence(my);
        myHistory.addWordToSentence(history);

        Text text = new Text(myHistory);
        Sentence story = new Sentence("My name is Diyor. I'm from Kyrgyzstan.");

        text.supplementMainText(story);

        System.out.println("Header: " + text.getHeader());
        System.out.println("Main text: " + text.getMainText());

    }
}
