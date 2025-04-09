import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String sentence = "The fox ate the apple which was on the table";
        System.out.println("Original sentence: " + sentence);

        Pattern pattern = Pattern.compile("the", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        String rep1 = matcher.replaceAll("BABUINBABUZ");

        System.out.println("Modified: " + rep1);
        System.out.println("Count: " + count);
    }
}