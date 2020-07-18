import java.util.Scanner;
class Main7 {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        int index = sc.nextInt();
        String firstPart = word.substring(index);
        String lastPart = word.substring(0, index);
        System.out.println(firstPart + lastPart);
    }
}