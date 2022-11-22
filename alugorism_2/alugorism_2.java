import java.util.Scanner;

public class alugorism_2 {
    public static void main(String[] args) {
        int[] ha_price = { 8000, 70000, 100000 };
        String[] home_appliance = { "電子レンジ", "冷蔵庫", "洗濯機" };
        int sum = 0;
        int sum_in_consumption = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int change = 0;
        Scanner scan = new Scanner(System.in);
        boolean key = true;

        System.out.println("【送料は1500円です】");

        for (int i = 0; i <= 2; i++) {
            System.out.println(home_appliance[i]);
        }
        do {
            System.out.println("【10000円以上購入で送料無料です】");
            System.out.println("電子レンジ[0],冷蔵庫[1],洗濯機[2],購入しない[3以上のどれか]を選んでください");
            num1 = scan.nextInt();
            if (num1 >= 3) {
                System.out.println("商品は選択されていません");
                System.out.println("またのご利用をお待ちしております。");
                key = false;
            } else {
                System.out.println(home_appliance[num1] + "ですね");
                System.out.println("そちらの商品は" + ha_price[num1] + "円です");
                sum += ha_price[num1];
            }
            System.out.println("合計" + sum + "円です");
            System.out.println("引き続き別の商品も購入しますか？→購入[0],購入しない[1]");
            num2 = scan.nextInt();
            if (num2 >= 1) {
                System.out.println("ありがとうございました。");
                System.out.println("お支払いに移ります");
                key = false;
            } else {
                System.out.println("ありがとうございます。");
                System.out.println("現在の合計" + sum + "円です");
                key = true;
            }
        } while (key != false);
        // ↑繰り返すかどうかの判定

        if (sum < 10000 && key == false) {
            sum_in_consumption = (int) (sum * 1.1) + 1500;
            System.out.println("お会計は送料込みで" + sum_in_consumption + "円です");
        }
        if (sum >= 10000 && key == false) {
            sum_in_consumption = (int) (sum * 1.1);
            System.out.println("10000円以上購入して頂いたので送料無料です");
            System.out.println("お会計" + sum_in_consumption + "円です");
        }
        do {
            System.out.println("お支払い金額が合計値以上ではありません");
            System.out.println("お支払い金額入力待ち中です");
            num3 = scan.nextInt();
        } while (num3 < sum_in_consumption);

        System.out.println(num3 + "円お預かりします");
        change = num3 - sum_in_consumption;
        System.out.println("おつりは" + change + "円です");
        System.out.println("またのご利用お待ちしております。");
        scan.close();
    }
}