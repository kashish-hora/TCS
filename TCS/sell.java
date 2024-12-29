import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class sell {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double totalSell = 0;
        Map<String, Double> sellMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String item = scanner.next();
            double rate = scanner.nextDouble();
            int quantity = scanner.nextInt();
            double sell = rate * quantity;

            sellMap.put(item, sellMap.getOrDefault(item, 0.0) + sell);
            totalSell += sell;
        }

        String higherSellItem = "";
        double higherSell = Double.MIN_VALUE;

        for (Map.Entry<String, Double> entry : sellMap.entrySet()) {
            if (entry.getValue() > higherSell) {
                higherSellItem = entry.getKey();
                higherSell = entry.getValue();
            }
        }

        double avgSell = totalSell / n;

        System.out.println(higherSellItem);
        System.out.printf("%.2f\n", totalSell);
        System.out.printf("%.2f\n", avgSell);

        scanner.close();
    }
}

    

