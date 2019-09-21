package ac.za.cput.Factory.Account;

import ac.za.cput.Domain.Account.PaymentMethod;

public class PaymentMethodFactory {

    public static PaymentMethod getPaymentMethod(int payCode, String payMethod)
    {
        return new PaymentMethod.Builder()
                .payCode(payCode)
                .payMethod(payMethod)
                .build();
    }
}
