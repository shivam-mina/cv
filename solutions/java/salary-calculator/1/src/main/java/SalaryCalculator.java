public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped>4 ? 0.85:1;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold > 19 ? 13 :10;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000 * salaryMultiplier(daysSkipped);
        salary+=bonusForProductsSold(productsSold);

        return salary>2000 ? 2000 : salary;
    } 
}
