import java.util.ArrayList;
import java.util.List;

// клас для речення, що складається з масиву слів і розділових знаків
class Sentence {
    private List<Object> elements; // ліст для зберігання як слів, так і розділових знаків

    // конструктор класу Sentence, який приймає рядок
    public Sentence(String sentence) {
        elements = new ArrayList<>();

        // регулярний вираз для розбиття тексту на слова та розділові знаки
        String[] parts = sentence.split("(?=\\p{Punct})|(?<=\\p{Punct})|\\s+");

        // проходимо через частини речення і створюємо об'єкти Word або Punctuation
        for (String part : parts) {
            if (part.matches("\\p{Punct}")) {
                // якщо це розділовий знак, додаємо об'єкт Punctuation
                elements.add(new Punctuation(part.charAt(0)));
            } else if (!part.isBlank()) {
                // якщо це слово, додаємо об'єкт Word
                elements.add(new Word(part));
            }
        }
    }

    // метод для обробки речення
    public String processSentence() {
        StringBuilder result = new StringBuilder();

        // проходимо через всі елементи і обробляємо їх
        for (Object element : elements) {
            if (element instanceof Word) {
                result.append(((Word) element).removeRepeats()).append(" "); // обробка слова
            } else if (element instanceof Punctuation) {
                result.append(((Punctuation) element).getSymbol()); // додаємо розділовий знак
            }
        }
        return result.toString().trim();
    }
}
