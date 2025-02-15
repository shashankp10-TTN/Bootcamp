
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

        //isBlank()
        String s = "    \u2005";
        System.out.println(s.isBlank()); // true
        System.out.println(s.isEmpty()); //false

        // indent()
        String indentString = """
                     Hello there,
                                my name is shashank
                """.indent(-4);
        System.out.println(indentString);

        // transform()
        String revereString = "Shashank".transform(s -> new StringBuilder(s).reverse().toString());
        System.out.println(revereString);

        // stripIndent()
        System.out.println(indentString.stripIndent()); // I don't why it's not working on IntelliJ but working fine on online IDEs


        // translateEscapes()
        String str1 = "Shashank\\nPandey";
        String translateString = str1.translateEscapes();
        System.out.println(str1);
        System.out.println(translateString);

        // tripleQuotes
        String multiLine = """
                Hello, there
                My name
                is Shashank

                """;
        System.out.println(multiLine);


        // formatted()
        String formatString = "My name is %s, %dth year student, %d years old".formatted("Shashank", 4, 200);
        System.out.println(formatString);

    }
}
