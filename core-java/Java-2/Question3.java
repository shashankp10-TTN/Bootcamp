/*
    Write a program to count number of occurrences of a word in a file.
    The file name and word should be supplied through commandline.
*/

import java.io.*;

public class Question3 {
    public static void main(String[] args) {

        String filePath = "sample.txt";
        String pattern = "shashank";
        File file = new File(filePath);
        int countWords = 0;
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                String[] wordsInCurrentLine = currentLine.split(",");
                for (String currentWord : wordsInCurrentLine) {
                    if (currentWord.contains(pattern)) {
                        countWords++;
                    }
                }
            }
            System.out.println(countWords);
        }catch(IOException e) {
            System.out.println("Error occurred while adding user data...");
        }finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error occurred while closing file...");
                }
            }
        }
    }
}
