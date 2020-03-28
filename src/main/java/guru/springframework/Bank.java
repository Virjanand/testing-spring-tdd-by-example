package guru.springframework;

public class Bank {
    public Money reduce(Expression source, String toCurrency) {
        Sum sum = (Sum) source;
        int amount = sum.augend.amount + sum.addend.amount;
        return new Money(amount, toCurrency);
    }
}
