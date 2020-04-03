package guru.springframework;

public class Sum implements Expression {
    public Money augend;
    public Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, String toCurrency) {
        return new Money(augend.amount + addend.amount, toCurrency);
    }
}
