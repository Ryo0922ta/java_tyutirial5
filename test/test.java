import java.util.Scanner;

public class test {
    public static void main(String args[]) {
        int input_num = 0;
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        while (sum <= 100) {
            System.out.println("入力まちです");
            input_num = scan.nextInt();
            sum += input_num;
            System.out.println("合計" + sum);
        }

        // do {
        // System.out.println("入力まちです");
        // input_num = scan.nextInt();
        // sum += input_num;
        // System.out.println("合計" + sum);
        // } while (sum <= 100);

        System.out.println("最終値" + sum);

        scan.close();
    }
}

// whileの場合
// 入力まちです
// 100
// 合計100
// 入力まちです

// do whileの場合
// 入力まちです
// 100
// 合計100
// 入力まちです
// 100
// 合計200
// 最終値200