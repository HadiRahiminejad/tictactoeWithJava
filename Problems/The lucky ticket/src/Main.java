import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String raw = sc.next();
        int[] num = new int[raw.length()];

        for (int i = 0; i < raw.length(); i++) {
            num[i] = raw.charAt(i) - '0';
        }

        int i = 0;
        if (num[i] + num[i + 1] + num[i + 2] == num[i + 3] + num[i + 4] + num[i + 5]) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");

        }
    }
}
