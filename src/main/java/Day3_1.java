import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Day3_1 {

    public static void main(String[] args) throws IOException {

        InputStream resourceAsStream = Day3_1.class.getResourceAsStream("Day3.test2.input");
        BufferedReader in = new BufferedReader(new InputStreamReader(resourceAsStream));
        long score = 0;
        String line1,line2,line3;
        while ( ( line1 = in.readLine()) != null && (line2 = in.readLine()) != null && (line3 = in.readLine()) != null) {
            Set<Character> comp1 = new HashSet<>();
            Set<Character> comp2 = new HashSet<>();
            Set<Character> comp3 = new HashSet<>();
            for (int i = 0; i < line1.length() ; ++i) {
                comp1.add(line1.charAt(i));
            }
            for (int i = 0; i < line2.length() ; ++i) {
                comp2.add(line2.charAt(i));
            }
            for (int i = 0; i < line3.length() ; ++i) {
                comp3.add(line3.charAt(i));
            }
            comp1.retainAll(comp2);
            comp1.retainAll(comp3);
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