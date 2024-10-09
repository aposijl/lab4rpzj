// клас для розділового знаку
class Punctuation {
    private char symbol;

    // конструктор класу, який приймає символ розділового знаку
    public Punctuation(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}