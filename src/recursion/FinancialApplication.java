package recursion;

public class FinancialApplication {
    public static void main(String[] args) {
double money = countRate(30, 10000, 0.11);
        System.out.println(money);
    }

    public static double countRate(int year, double deposit, double interestRate) {
        double totalAmount;
        if (year == 1) {
            totalAmount = deposit + (deposit * interestRate);
           return totalAmount;
        }
        totalAmount = countRate(year - 1, deposit, interestRate) + (interestRate * countRate(year - 1, deposit, interestRate));
        return totalAmount;
    }
}
