import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Day2_1 {

    public static void main(String[] args) throws IOException {

        InputStream resourceAsStream = Day2_1.class.getResourceAsStream("Day2.input");
        BufferedReader in = new BufferedReader(new InputStreamReader(resourceAsStream));
        String line;
        int sum = 0;
        while ( (line = in.readLine()) != null) {
            char player1 = line.charAt(0);
            char result = line.charAt(2);
            int score = 0;
            switch (result) {
                case 'X':  //lose
                    score = (player1 - 'A' + 2) % 3 + 1;
                    System.out.println(line + ":lose:"+score);
                    break;
                case 'Y':  //draw
                    score = (player1 - 'A' ) % 3 + 1 + 3;
                    System.out.println(line + ":draw:"+score);

                    break;
                case 'Z':  //win
                    score = (player1 - 'A' + 1) % 3 + 1 + 6;
                    System.out.println(line + ":win:"+score);
                    break;
            }
            sum+=score;
        }
        System.out.println("sum:" + sum);

    }
}