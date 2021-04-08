import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Введите ссылку: ");
            String url = in.nextLine();
            in.close();
            Counting.Counter work = new Counting.Counter(url);
            work.counting();
            work.numberOfWordsInTheText();
            work.frequencyOfOccurrenceOfWords();
        }

}