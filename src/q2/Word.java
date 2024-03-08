
package q2;


public class Word {
    private String word;
    private String definition;
    private WordClass wordclass;

    public Word() {
        this.word = "";
    }

    public Word(String word, String definition, WordClass wordclass) {
        this.word = word;
        this.definition = definition;
        this.wordclass = wordclass;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public WordClass getWordclass() {
        return wordclass;
    }

    public void setWordclass(WordClass wordclass) {
        this.wordclass = wordclass;
    }
    
    public String  entry() {
        return this.word + " is inserted\n";
    }
    public String print(){
        return this.word +"(" + this.wordclass.getName()+"): "+this.definition+"\n";
    }

    
    
    
}
