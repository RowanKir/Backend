package ac.za.cput.Factory.Account;

import ac.za.cput.Domain.Account.Account;

public class AccountFactory {

    public static Account buildAccount(String accountId, String accountName, String accountDetails)
    {
        return new Account.Builder()
                .accountId(accountId)
                .accountName(accountName)
                .accountDetails(accountDetails)
                .build();
    }
}
