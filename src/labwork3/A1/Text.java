package labwork3.A1;

public class Text {
    private String header;
    private String mainText="";

    public Text(Sentence sentence){
        this.header=sentence.getValue();
    }

    public Text(Word word){
        this.header=word.getValue();
    }

    public void supplementMainText(Sentence sentence){
        mainText+=sentence.getValue() + " ";
    }

    public void supplementMainText(Word word){
        mainText+=word.getValue() + " ";
    }

    public String getHeader() {
        return header;
    }

    public String getMainText() {
        return mainText;
    }

    @Override
    public String toString() {
        return "Text{" +
                "header='" + header + '\'' +
                ", mainText='" + mainText + '\'' +
                '}';
    }
}
