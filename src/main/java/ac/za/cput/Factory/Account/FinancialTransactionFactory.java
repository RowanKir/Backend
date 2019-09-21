package ac.za.cput.Factory.Account;

import ac.za.cput.Domain.Account.FinancialTransaction;

public class FinancialTransactionFactory {

    public static FinancialTransaction getFinancialTransactions(int transId, int accountId, int itemRentalId, int transCode, int transDate, int transAmt)
    {
        return new FinancialTransaction.Builder()
                .transId(transId)
                .accountId(accountId)
                .itemRentalId(itemRentalId)
                .transCode(transCode)
                .transAmt(transAmt)
                .build();
    }
}
