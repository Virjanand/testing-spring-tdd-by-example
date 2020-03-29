package guru.springframework;

public interface Expression {
    Expression plus(Money addend);

    Money reduce(String toCurrency);
}
