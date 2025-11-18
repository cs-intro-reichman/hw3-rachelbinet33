public class Test {
public static void main(String[] args) {   // 2
        double result = endBalance(100000, 0.05, 3, 30000);
        System.out.println(result);
    } // closes main
    public static double bruteForceSolver(double loan, double rate, int n, double epsilon) {
		double g = loan/n;
		int iterationCounter = 0;
		double endingloan = endBalance(loan, rate, iterationCounter, g);
		while(g>0){
			endingloan  = endBalance(endingloan, rate, n,(loan/n)-epsilon);
			iterationCounter++;
		}
		return endingloan;
    }
    private static double endBalance(double loan, double rate, int n, double payment) {
        double balance = loan;
        for (int i = 0; i < n; i++) {
            balance = (balance - payment) * (1 + rate);
        }
        return balance;
    } // closes endBalance
} // closes class

