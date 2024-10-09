// основний клас для виконання
public class Main {
    /* C3 = 2: тип текстових змінних - StringBuffer
    C17 = 14: в кожному слові заданого тексту, видалити всі наступні входження першої літери цього слова. */
    public static void main(String[] args) {
        String text = "Ллаборлалторна роборта з рорзрорбки пропграмнопго забезпезченняз на плаптфопрмі Java.";
        System.out.println("Початковий текст:");
        System.out.println(text);

        // створюємо об'єкт класу Text та обробляємо текст
        Text processedText = new Text(text);
        System.out.println("\nОпрацьований текст:");
        System.out.println(processedText.processText());
    }
}