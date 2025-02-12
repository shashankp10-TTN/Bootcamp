
/*
    Demonstrate the use of repeat(), strip(), trim(), isBlank(), indent(), transform(), stripIndent(), translateEscapes(),tripleQuotes and formatted() methods.
 */
public class Question5 {
    public static void main(String[] args) {
        // repeat()
        String str = "Shashank".repeat(5);
        System.out.println(str);

        // strip() and trim()
        String str1 = "\u2005 Random content    ".strip();
        String strStrip = str1.strip();
        String strTrim = str1.trim();
        System.out.println(strStrip);
        System.out.println(strTrim);


    }
}
