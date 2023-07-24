import java.util.Arrays;
import java.util.StringJoiner;

public class LambdaMain {

    public static void main(String[] args) {

        String[] str = {
                "apple", "banana", "orange", "grape", "kiwi",
                "apple", "orange", "banana", "kiwi", "grape",
                "grape", "kiwi", "apple", "banana", "orange",
                "orange", "banana", "kiwi", "grape", "apple",
                "kiwi", "banana", "grape", "orange", "apple",
                "banana", "orange", "kiwi", "grape", "apple"
        };

        StringJoiner stringJoiner = new StringJoiner(" ");
        Arrays.stream(str)
                .distinct()
                .forEach(s -> stringJoiner.add(s));
        System.out.println(stringJoiner);

    }

}
