public interface Taxable {
    // Constants for tax rates
    double SALES_TAX = 0.07; // 7% sales tax
    double INCOME_TAX = 0.105; // 10.5% income tax

    // Abstract method to calculate tax
    double calcTax();
}
