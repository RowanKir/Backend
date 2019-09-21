package ac.za.cput.Factory.Customer;

import ac.za.cput.Domain.Customer.Customer;

public class CustomerFactory {

    public static Customer buildCustomer(String custId, String custPhone, String custName, String custSurname)
    {
        return new Customer.Builder()
                .custId(custId)
                .custName(custName)
                .custSurname(custSurname)
                .custPhone(custPhone)
                .build();
    }


}
