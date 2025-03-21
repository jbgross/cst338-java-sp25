package wk09.order;

/**
 * Represents an amount of Money. Default currency is USD ($)
 * A Money object is immutable; to create a new Money object,
 * use the math methods (add, subtract)
 */
public class Money {
    /**
     * Mostly for debugging, this is just a Money object with a
     * value of one dollar
     */
    public static final Money ONE_DOLLAR = new Money(1.0);

    /**
     * The currency symbol, default is $
     */
    private final String currency;
    /**
     * The amount of money, stored internally as a long
     */
    private final long amount;


    /**
     * Create a new money object
     * @param currency the currency symbol, could be 1 or more character (e.g., $ or GBP)
     * @param amount the amount, passed in as a double; anything beyond 2 decimal places
     *               will be truncated
     */
    public Money(String currency, double amount) {
        this.currency = currency;
        this.amount = Math.round(amount * 100);
    }

    /**
     * Create a new money object with the default currency, $
     * @param amount the amount, passed in as a double; anything beyond 2 decimal places
     *               will be truncated
     */
    public Money(double amount) {
        this("$", amount);
    }

    /**
     * Returns the currency symbol or abbreviation
     * @return the symbol or abbreviation
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * Returns the amount of the Money object converted to a double;
     * the internal storage in long is converted by dividing by 100.0
     * @return the amount as a double
     */
    public double getAmount() {
        return this.amount / 100.0;
    }

    /**
     * Gets a formatted string, always to 2 decimal
     * places (e.g., "5.00", "3.50", "100.75"
     * @return the amount in String form
     */
    public String getAmountString() {
        return String.format("%.2f", getAmount());
    }


    /**
     * Returns a new money object adding the value of the parameter to
     * the local object. Note that Money is immutable; this returns a new
     * Money object
     * @param add the amount to add into the local object
     * @return a new Money object containing the sum of the local object and parameter
     */
    public Money add(Money add) {
        return new Money(this.getCurrency(), this.getAmount() + add.getAmount());
    }

    /**
     * Returns a new money object subtracting the value of the parameter from
     * the local object. (So the local object is the minuend and the parameter
     * is the subtrahend). Note that Money is immutable; this returns a new
     * Money object
     * @param subtract the amount to subtract from  the local object
     * @return a new Money object containing the sum of the local object and parameter
     */
    public Money subtract(Money subtract) {
        return new Money(this.getCurrency(), this.getAmount() - subtract.getAmount());
    }

    /**
     * Return a String version with the currency symbol followed by the amount
     * to two decimal places, so "$1.25", "$56.00", "$35.60"
     * @return the string representation
     */
    public String toString() {
        return this.currency + this.getAmountString();
    }

}
