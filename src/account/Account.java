package account;

import java.util.Date;

public class Account {

    private String user;
    private String cpf;
    private int creditCardNumber;
    private int securityNumber;
    private Date birthdate;

    public Account(String user, String cpf, int creditCardNumber, int securityNumber, Date birthdate) {
        this.user = user;
        this.cpf = cpf;
        this.creditCardNumber = creditCardNumber;
        this.securityNumber = securityNumber;
        this.birthdate = birthdate;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public void setSecurityNumber(int securityNumber) {
        this.securityNumber = securityNumber;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}


