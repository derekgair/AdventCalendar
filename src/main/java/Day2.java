import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Day2 {

    public static void main(String[] args) throws IOException {

        InputStream resourceAsStream = Day2.class.getResourceAsStream("Day2.input");
        BufferedReader in = new BufferedReader(new InputStreamReader(resourceAsStream));
        String line;
        long score = 0;
        while ( (line = in.readLine()) != null) {
            int gamescore =0;
            char player1= line.charAt(0);
            char player2= line.charAt(2);
            if ( player1 -'A' == player2-'X') {
                System.out.print("draw:");
                gamescore = player2-'X' + 1 + 3;
            }
            if ( player1 - 'A' == (player2-'X'+2)%3 ) {
                System.out.print("win:");
                gamescore = player2-'X'+1 +6;
            }
            if ( player1 - 'A' == (player2-'X'+1)%3 ) {
                System.out.print("loss:");
                gamescore = player2-'X'+1;
            }
            score+=gamescore;
            System.out.println( line + ":" + gamescore);
        }
        System.out.println("Score=" + score);


    }
}