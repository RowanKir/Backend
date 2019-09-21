package ac.za.cput.Domain.Account;

public class FinancialTransaction {

    int transId, accountId, itemRentalId, transCode, transDate, transAmt;

    public FinancialTransaction(Builder builder) {
        this.transId = builder.transId;
        this.accountId = builder.accountId;
        this.itemRentalId = builder.itemRentalId;
        this.transCode = builder.transCode;
        this.transDate = builder.transDate;
        this.transAmt = builder.transAmt;
    }

    public int getTransId() {
        return transId;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getItemRentalId() {
        return itemRentalId;
    }

    public int getTransCode() {
        return transCode;
    }

    public int getTransDate() {
        return transDate;
    }

    public int getTransAmt() {
        return transAmt;
    }

    public static class Builder
    {
        int transId, accountId, itemRentalId, transCode, transDate, transAmt;

        public Builder transId(int transId)
        {
            this.transId = transId;
            return this;
        }

        public Builder accountId(int accountId)
        {
            this.accountId = accountId;
            return this;
        }

        public Builder itemRentalId(int itemRentalId)
        {
            this.itemRentalId = itemRentalId;
            return this;
        }

        public Builder transCode(int transCode)
        {
            this.transCode = transCode;
            return this;
        }

        public Builder transDate(int transDate)
        {
            this.transDate = transDate;
            return this;
        }

        public Builder transAmt(int transAmt)
        {
            this.transAmt = transAmt;
            return this;
        }

        public FinancialTransaction build()
        {
            return new FinancialTransaction(this);
        }
    }

    @Override
    public String toString() {
        return "FinancialTransaction{" +
                "transId=" + transId +
                ", accountId=" + accountId +
                ", itemRentalId=" + itemRentalId +
                ", transCode=" + transCode +
                ", transDate=" + transDate +
                ", transAmt=" + transAmt +
                '}';
    }
}
