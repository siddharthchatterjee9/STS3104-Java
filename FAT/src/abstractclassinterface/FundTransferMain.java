package abstractclassinterface;

import java.util.Scanner;

abstract class FundTransfer {
    protected String accountNumber;
    protected Double balance;

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public FundTransfer() {
        this.accountNumber = null;
        this.balance = (double)0;
    }
    public FundTransfer(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public Boolean validate(Double transfer) {
        if (accountNumber.length() == 10 && transfer > 0 && transfer < balance) {
            return true;
        }
        else {
            return false;
        }
    }
    public abstract Boolean transfer(Double transfer);
}
class NEFTTransfer extends FundTransfer {
    public Boolean transfer(Double transfer) {
        if ((transfer+(0.05*transfer)) < getBalance()) {
            return true;
        }
        else {
            return false;
        }
    }
}
class IMPSTransfer extends FundTransfer {
    public Boolean transfer(Double transfer) {
        if ((transfer + (0.02 * transfer)) < getBalance()) {
            return true;
        } else {
            return false;
        }
    }
}
class RTGSTransfer extends FundTransfer {
    public Boolean transfer(Double transfer) {
        if (transfer > 10000) {
            return true;
        }
        else {
            return false;
        }
    }
}
class FundTransferMain {
    public static void main(String... args) {
        NEFTTransfer nt = new NEFTTransfer();
        IMPSTransfer it = new IMPSTransfer();
        RTGSTransfer rt = new RTGSTransfer();
        Scanner in = new Scanner(System.in);
        int choice = Integer.parseInt(in.nextLine());
        if (choice == 1) {
            nt.setAccountNumber(in.nextLine());
            nt.setBalance(Double.parseDouble(in.nextLine()));
            Double amount = Double.parseDouble(in.nextLine());
            boolean check = nt.validate(amount);
            if (check == false) {
                System.out.println("Account number or transfer amount seems to be wrong");
            }
            else {
                boolean temp = nt.transfer(amount);
                if (temp == true) {
                    System.out.println("Transfer occurred successfully");
                    nt.setBalance(nt.getBalance() - (amount+(0.05*amount)));
                    System.out.println(nt.getBalance());
                }
                else {
                    System.out.println("Transfer could not be made");
                }
            }
        }
    }
}
