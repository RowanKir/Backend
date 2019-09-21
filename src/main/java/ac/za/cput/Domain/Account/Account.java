package ac.za.cput.Domain.Account;

public class Account {

    String accountId, accountName, accountDetails;

    public Account(Builder builder) {
        this.accountId = builder.accountId;
        this.accountName = builder.accountName;
        this.accountDetails = builder.accountDetails;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountDetails() {
        return accountDetails;
    }

    public static class Builder
    {
        String accountId, accountName, accountDetails;

        public Builder accountId(String accountId)
        {
            this.accountId = accountId;
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
                ", accountName='" + accountName + '\'' +
                ", accountDetails='" + accountDetails + '\'' +
                '}';
    }
}
