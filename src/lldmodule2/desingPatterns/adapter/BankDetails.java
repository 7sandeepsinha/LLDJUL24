package lldmodule2.desingPatterns.adapter;

public class BankDetails {
    private String bankAccountId;
    private String ifscCode;
    private String bankBranchDetails;
    private String debitCardNumber;

    public String getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBankBranchDetails() {
        return bankBranchDetails;
    }

    public void setBankBranchDetails(String bankBranchDetails) {
        this.bankBranchDetails = bankBranchDetails;
    }

    public String getDebitCardNumber() {
        return debitCardNumber;
    }

    public void setDebitCardNumber(String debitCardNumber) {
        this.debitCardNumber = debitCardNumber;
    }
}
