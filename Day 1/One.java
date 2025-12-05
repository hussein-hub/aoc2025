import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class one {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int ans = 0, current = 50;
        BufferedReader br = new BufferedReader(new FileReader("Day 1/input.txt"));
        try {
            String line = br.readLine();
            ;

            while (line != null) {
                if (line != null) {
                    char direction = line.charAt(0);
                    int number = Integer.parseInt(line.substring(1));
                    if (direction == 'L') {
                        current = (current - number) % 100;
                        if (current < 0) {
                            current = current + 100;
                        }
                    } else {
                        current = (current + number) % 100;
                    }
                    // System.out.println(number + " " + current);
                    if (current == 0) {
                        ans++;
                    }
                }
                line = br.readLine();
            }
        } finally {
            br.close();
        }
        System.out.println(ans);
    }
}