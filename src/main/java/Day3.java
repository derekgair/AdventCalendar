import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Day3 {

    public static void main(String[] args) throws IOException {

        InputStream resourceAsStream = Day3.class.getResourceAsStream("Day3.input");
        BufferedReader in = new BufferedReader(new InputStreamReader(resourceAsStream));
        long score = 0;
        String line;
        while ( (line = in.readLine()) != null) {
            Set<Character> comp1 = new HashSet<>();
            Set<Character> comp2 = new HashSet<>();
            for (int i = 0; i < line.length() / 2; ++i) {
                comp1.add(line.charAt(i));
                comp2.add(line.charAt(line.length() - i - 1));
            }
            comp1.retainAll(comp2);
            int p = 0;
            if (!comp1.isEmpty()) {

                for (char a : comp1) {
                    if (a >= 'A' && a <='Z') {
                        p = (a - 'A' + 27);
                    } else {
                        p = (a - 'a' + 1);
                    }
                }

            }
            System.out.println("intersection" + comp1 + ":" + p);
            score += p;
        }
        System.out.println("Score=" + score);


    }
}