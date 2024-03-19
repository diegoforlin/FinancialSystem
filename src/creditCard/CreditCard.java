package creditCard;

import account.Account;

import java.math.BigDecimal;
import java.util.Date;

public class CreditCard extends Account {

    private BigDecimal limit;
    private BigDecimal balance;
    private BigDecimal purchase;
    private BigDecimal taxFee;

    public CreditCard(String user, String cpf, int creditCardNumber, int securityNumber, Date birthdate) {
        super(user, cpf, creditCardNumber, securityNumber, birthdate);
    }

    public CreditCard(String user, String cpf, int creditCardNumber, int securityNumber, Date birthdate, BigDecimal limit, BigDecimal balance, BigDecimal purchase) {
        super(user, cpf, creditCardNumber, securityNumber, birthdate);
        this.limit = limit;
        this.balance = balance;
        this.purchase = purchase;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal isPurchase() {
        return purchase;
    }

    public void setTaxFee(BigDecimal taxFee) {
        BigDecimal balance = taxFee.multiply(BigDecimal.valueOf(0.05));
    }

    public BigDecimal setPurchase(BigDecimal purchase) {
        if (purchase.compareTo(balance) <= 0) {
            System.out.println("Compra aprovada");
        } else {
            System.out.println("Compra não aprovada. O limite não é o suficiente.");
        }
        return purchase.multiply(taxFee);
    }
}

