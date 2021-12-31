import java.util.Scanner;

class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        
        double currentMoney = scanner.nextDouble();
        double p = scanner.nextDouble() /100d;
        double futureMoney = scanner.nextDouble();

        double result = currentMoney;

        int time = 0;

        while (result < futureMoney) {
            result = currentMoney * (1+ p);
            currentMoney = result;

            time++;

        }


        System.out.println(time);
    }
}
