package ac.za.cput.Domain.Account;

public class Account {

    int payCode;
    String accountType, accountId, accountName, accountDetails;

    public Account(Builder builder) {
        this.accountId = builder.accountId;
        this.payCode = builder.payCode;
        this.accountType = builder.accountType;
        this.accountName = builder.accountName;
        this.accountDetails = builder.accountDetails;
    }

    public String getAccountId() {
        return accountId;
    }

    public int getPayCode() {
        return payCode;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountDetails() {
        return accountDetails;
    }

    public static class Builder
    {
        String accountId;
        int payCode;
        String accountType, accountName, accountDetails;

        public Builder accountId(String accountId)
        {
            this.accountId = accountId;
            return this;
        }

        public Builder payCode(int payCode)
        {
            this.payCode = payCode;
            return this;
        }

        public Builder accountType(String accountType)
        {
            this.accountType = accountType;
            return this;
        }

        public Builder accountName(String accountName)
        {
            this.accountName = accountName;
            return this;
        }

        public Builder accountDetails(String accountDetails)
        {
            this.accountDetails = accountDetails;
            return this;
        }

        public Builder copy(Account course){
            this.accountId = course.accountId;
            this.accountName = course.accountName;

            return this;
        }


        public Account build()
        {
            return new Account(this);
        }


    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", payCode=" + payCode +
                ", accountType='" + accountType + '\'' +
                ", accountName='" + accountName + '\'' +
                ", accountDetails='" + accountDetails + '\'' +
                '}';
    }
}
