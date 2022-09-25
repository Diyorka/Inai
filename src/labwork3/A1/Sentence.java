package labwork3.A1;

public class Sentence{
    private String value="";

    public Sentence(){}

    public Sentence(String value) {
        this.value = value;
    }

    public void addWordToSentence(Word word){
        value+=word.getValue()+" ";
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "value='" + value + '\'' +
                '}';
    }
}
