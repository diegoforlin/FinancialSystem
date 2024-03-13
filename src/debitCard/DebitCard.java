package debitCard;

import account.Account;

import java.math.BigDecimal;
import java.util.Date;

public class DebitCard extends Account {

    private BigDecimal limit;
    private BigDecimal balance;
    private boolean purchase;
    private int taxFee;

    public DebitCard(String user, String cpf, int creditCardNumber, int securityNumber, Date birthdate) {
        super(user, cpf, creditCardNumber, securityNumber, birthdate);
    }

    public DebitCard(String user, String cpf, int creditCardNumber, int securityNumber, Date birthdate, BigDecimal limit, BigDecimal balance, boolean purchase) {
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

    public boolean isPurchase() {
        return purchase;
    }

    public void setPurchase(boolean purchase) {
        this.purchase = purchase;
    }

    public int getTaxFee() {
        return taxFee;
    }

    public void setTaxFee(int taxFee) {
        this.taxFee = taxFee;
    }
}
