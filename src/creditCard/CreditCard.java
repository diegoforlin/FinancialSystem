package creditCard;

import account.Account;

import java.math.BigDecimal;
import java.util.Date;

public class CreditCard extends Account {

    private BigDecimal limit;
    private BigDecimal balance;
    private BigDecimal purchase;
    private int taxFee;

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

    public void setPurchase(BigDecimal purchase) {
        if (new BigDecimal(String.valueOf(balance)).subtract(new BigDecimal(String.valueOf(purchase)) {
            System.out.println("Compra aprovada");
        } {
            System.out.println("Compra recusada");
        }
    }
    public BigDecimal getTaxFee() {
        return new BigDecimal(String.valueOf(balance)).multiply(new BigDecimal("0.10"));
    }

    public void setTaxFee(int taxFee) {
        this.taxFee = taxFee;
    }
}
