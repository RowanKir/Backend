package ac.za.cput.Factory.Customer;

import ac.za.cput.Domain.Customer.Customer;

public class CustomerFactory {

    public static Customer buildCustomer(String custId, String custPhone, String custName, String custSurname, String custEmail, String custAddress, boolean mem)
    {
        return new Customer.Builder()
                .custAddress(custAddress)
                .custEmail(custEmail)
                .custId(custId)
                .custName(custName)
                .custSurname(custSurname)
                .custPhone(custPhone)
                .mem(mem)
                .build();
    }


}
