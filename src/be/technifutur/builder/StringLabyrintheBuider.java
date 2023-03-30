package be.technifutur.builder;

public class StringLabyrintheBuider implements LabyrintheBuilder{


    private String result="";
    private int currentLine;

    public String build(){
        return result;
    }

    @Override
    public LabyrintheBuilder start() {
        result="";
        currentLine=0;
        return this;
    }

    @Override
    public LabyrintheBuilder addPiece(int line, int column) {
        updateCurrentLine(line);
        result +=".";
        return this;
    }

    private void updateCurrentLine(int line) {
        if(line >currentLine) {
            result += System.lineSeparator();
            currentLine++;
        }
    }

    @Override
    public LabyrintheBuilder addMur(int line, int column) {
        updateCurrentLine(line);
        result +="m";
        return this;
    }

    @Override
    public LabyrintheBuilder addPorte(int line, int column) {
        updateCurrentLine(line);
        result += "p";
        return this;
    }
}
