// клас для тексту, що складається з масиву речень
class Text {
    private Sentence[] sentences;
    // конструктор класу Text, який приймає рядок
    public Text(String text) {
        // заміна всіх табуляцій і кількох пробілів на один пробіл
        text = text.replaceAll("\\s+", " ");
        // розбиваємо текст на речення за крапками
        String[] sentenceParts = text.split("\\.");
        // ініціалізуємо масив sentences, де кожен елемент - це речення
        sentences = new Sentence[sentenceParts.length];

        // цикл для створення об'єктів Sentence для кожного речення
        for (int i = 0; i < sentenceParts.length; i++) {
            sentences[i] = new Sentence(sentenceParts[i].trim());
        }
    }
    // метод для обробки тексту: обробляє кожне речення
    public String processText() {
        StringBuffer result = new StringBuffer();

        for (Sentence sentence : sentences) {
            result.append(sentence.processSentence()).append(". "); // додаємо оброблене речення до результату з крапкою
        }
        return result.toString().trim();
    }
}
