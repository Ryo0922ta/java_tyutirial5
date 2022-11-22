import java.util.Scanner;

public class test {
    public static void main(String args[]) {
        int input_num = 0;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        // iが5以下なら繰り返す
        while (sum >= 100) {
            System.out.println("入力まちです");
            input_num = scan.nextInt();
            sum += input_num;
            System.out.println(sum);
        }

        scan.close();
    }
}
