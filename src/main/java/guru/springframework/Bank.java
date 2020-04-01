package guru.springframework;

public class Bank {
    public Money reduce(Expression source, String toCurrency) {
        return source.reduce(toCurrency);
    }

    public void addRate(String from, String to, int rate) {

    }
}
