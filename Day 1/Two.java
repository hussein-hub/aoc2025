import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Two {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int ans = 0, current = 50, prevCurrent = 50;
        BufferedReader br = new BufferedReader(new FileReader("Day 2/input.txt"));
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
                        if (prevCurrent != 0 && (current > prevCurrent || current == 0)) {
                            ans++;
                        }

                    } else {
                        current = (current + number) % 100;
                        if (prevCurrent > current) {
                            ans++;
                        }
                    }
                    if (number >= 100) {
                        ans = ans + (int) (number / 100);
                    }
                    // System.out.println(number + " " + current + " " + ans);
                }
                line = br.readLine();
                prevCurrent = current;
            }
        } finally {
            br.close();
        }
        System.out.println(ans);
    }
}