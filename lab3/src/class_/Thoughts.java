package class_;

import abstract_.Character;

public class Thoughts extends Character{
    private boolean isEnd;

    public Thoughts() {
        isEnd = false;
    }

    public String wasMade = wasMade();
    String wasMade(){
        return "сделались большими";
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }

}
