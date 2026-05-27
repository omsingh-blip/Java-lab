// The compound interest formula is used to calculate the future value of an investment or loan when interest is applied not only to the principal but also to accumulated interest.

// Formula
// 𝐴 = 𝑃⋅(1+r/𝑛)^𝑛⋅𝑡


// 𝐴→ Final amount (principal + interest)
// 𝑃→ Principal (initial investment/loan)
// 𝑟→ Annual interest rate (in decimal, e.g., 5% = 0.05)
// 𝑛→ Number of times interest is compounded per year
// 𝑡→ Time in years


public class Main {
    public static void main(String[] args) {
        double principal = 1000; // Initial amount
        double rate = 5; // Annual interest rate in percentage
        int timesCompounded = 4; // Quarterly compounding
        int years = 10; // Number of years

       double amount = principal* Math.pow(1 + (rate/100)/timesCompounded, years*timesCompounded);

       System.out.println(amount);
    }
}
