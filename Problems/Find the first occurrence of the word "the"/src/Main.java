import java.util.Scanner;
class Main6 {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        if (sentence.contains("The")) {
            System.out.println(sentence.indexOf("The"));
        } else if (sentence.contains("the")) {
            System.out.println(sentence.indexOf("the"));

        } else {
            System.out.println(-1);
        }
    }
}
