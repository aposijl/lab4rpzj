// клас для слова, що складається з масиву літер
class Word {
    private Letter[] letters;

    // конструктор класу Word, що приймає рядок і перетворює його на масив літер
    public Word(String word) {
        letters = new Letter[word.length()];

        // проходимо по кожному символу слова і створюємо об'єкт типу Letter
        for (int i = 0; i < word.length(); i++) {
            letters[i] = new Letter(word.charAt(i));
        }
    }
    // метод для видалення всіх наступних входжень першої літери у слові
    public String removeRepeats() {
        if (letters.length == 0) return "";
        // створюємо StringBuffer для побудови обробленого слова
        StringBuffer result = new StringBuffer();

        char firstLetter = Character.toLowerCase(letters[0].getLetter());
        result.append(letters[0].getLetter()); // додаємо першу літеру без змін до результату

        // цикл для обробки всіх літер, починаючи з другої
        for (int i = 1; i < letters.length; i++) {
            // порівнюємо кожну літеру з першою, не враховуючи регістр
            if (Character.toLowerCase(letters[i].getLetter()) != firstLetter) {
                // якщо літера не збігається з першою, додаємо її до результату
                result.append(letters[i].getLetter());
            }
        }
        return result.toString();
    }
}
