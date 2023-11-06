import java.io.*;

/* public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader
        (new InputStreamReader(System.in));
        //int N = Integer.parseInt(bufferedReader.readLine().trim());
        //int N = 22;
        for (int N = 1; N < 25; N++) { 
            if (N % 2 != 0) {
                System.out.println(N + " : Weird[1]");
            } else if (N % 2 == 0 && N < 6) {
                System.out.println(N + " : Not Weird[2]");
            } else if (N % 2 == 0 && N < 21) {
                System.out.println(N + " : Weird[3]");
            } else if (N % 2 == 0 && N >= 20) {
                System.out.println(N + " : Not Weird[4]");
            }
        }
        bufferedReader.close();
    }
} */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader
        (new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if (N % 2 != 0) {
            System.out.println("Weird");
        } else if (N % 2 == 0 && N < 6) {
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && N < 21) {
            System.out.println("Weird");
        } else if (N % 2 == 0 && N >= 20) {
            System.out.println("Not Weird");
        }
        bufferedReader.close();
    }
}