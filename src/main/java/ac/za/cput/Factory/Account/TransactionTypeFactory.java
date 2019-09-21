package ac.za.cput.Factory.Account;

import ac.za.cput.Domain.Account.TransactionType;

public class TransactionTypeFactory {

    public static TransactionType getTransactionType(int transCode, String transDescr)
    {
        return new TransactionType.Builder()
                .transDescr(transDescr)
                .transCode(transCode)
                .build();
    }
}
